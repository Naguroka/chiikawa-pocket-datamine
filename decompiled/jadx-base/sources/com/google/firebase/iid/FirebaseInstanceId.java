package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@java.lang.Deprecated
public class FirebaseInstanceId {
    private static com.google.firebase.iid.Store store;
    static java.util.concurrent.ScheduledExecutorService syncExecutor;
    private final com.google.firebase.FirebaseApp app;
    final java.util.concurrent.Executor fileIoExecutor;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private final com.google.firebase.iid.Metadata metadata;
    private final java.util.List<com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener> newTokenListeners;
    private final com.google.firebase.iid.RequestDeduplicator requestDeduplicator;
    private final com.google.firebase.iid.GmsRpc rpc;
    private boolean syncScheduledOrRunning;
    private static final long MAX_DELAY_SEC = java.util.concurrent.TimeUnit.HOURS.toSeconds(8);
    private static final java.util.regex.Pattern API_KEY_FORMAT = java.util.regex.Pattern.compile("\\AA[\\w-]{38}\\z");

    FirebaseInstanceId(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.iid.Metadata metadata, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> provider, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> provider2, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        this.syncScheduledOrRunning = false;
        this.newTokenListeners = new java.util.ArrayList();
        if (com.google.firebase.iid.Metadata.getDefaultSenderId(firebaseApp) == null) {
            throw new java.lang.IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (com.google.firebase.iid.FirebaseInstanceId.class) {
            if (store == null) {
                store = new com.google.firebase.iid.Store(firebaseApp.getApplicationContext());
            }
        }
        this.app = firebaseApp;
        this.metadata = metadata;
        this.rpc = new com.google.firebase.iid.GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi);
        this.fileIoExecutor = executor2;
        this.requestDeduplicator = new com.google.firebase.iid.RequestDeduplicator(executor);
        this.firebaseInstallations = firebaseInstallationsApi;
    }

    private <T> T awaitTask(com.google.android.gms.tasks.Task<T> task) throws java.io.IOException {
        try {
            return (T) com.google.android.gms.tasks.Tasks.await(task, 30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.TimeoutException unused) {
            throw new java.io.IOException(com.google.firebase.iid.GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause instanceof java.io.IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    resetStorage();
                }
                throw ((java.io.IOException) cause);
            }
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            throw new java.io.IOException(e);
        }
    }

    private static <T> T awaitTaskAllowOnMainThread(com.google.android.gms.tasks.Task<T> task) throws java.lang.InterruptedException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(task, "Task must not be null");
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        task.addOnCompleteListener(com.google.firebase.iid.FirebaseInstanceId$$Lambda$1.$instance, new com.google.android.gms.tasks.OnCompleteListener(countDownLatch) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$2
            private final java.util.concurrent.CountDownLatch arg$1;

            {
                this.arg$1 = countDownLatch;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(com.google.android.gms.tasks.Task task2) {
                this.arg$1.countDown();
            }
        });
        countDownLatch.await(30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        return (T) getResultOrThrowException(task);
    }

    private static void checkRequiredFirebaseOptions(com.google.firebase.FirebaseApp firebaseApp) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(firebaseApp.getOptions().getProjectId(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(firebaseApp.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(firebaseApp.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(isValidAppIdFormat(firebaseApp.getOptions().getApplicationId()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(isValidApiKeyFormat(firebaseApp.getOptions().getApiKey()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static synchronized void clearInstancesForTest() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = syncExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        syncExecutor = null;
        store = null;
    }

    public static com.google.firebase.iid.FirebaseInstanceId getInstance() {
        return getInstance(com.google.firebase.FirebaseApp.getInstance());
    }

    private static <T> T getResultOrThrowException(com.google.android.gms.tasks.Task<T> task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new java.util.concurrent.CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new java.lang.IllegalStateException(task.getException());
        }
        throw new java.lang.IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    private java.lang.String getSubtype() {
        return com.google.firebase.FirebaseApp.DEFAULT_APP_NAME.equals(this.app.getName()) ? "" : this.app.getPersistenceKey();
    }

    static boolean isDebugLogEnabled() {
        return android.util.Log.isLoggable("FirebaseInstanceId", 3);
    }

    static boolean isValidApiKeyFormat(@javax.annotation.Nonnull java.lang.String str) {
        return API_KEY_FORMAT.matcher(str).matches();
    }

    static boolean isValidAppIdFormat(@javax.annotation.Nonnull java.lang.String str) {
        return str.contains(":");
    }

    private static java.lang.String rationaliseScope(java.lang.String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase(com.google.firebase.messaging.Constants.MessageTypes.MESSAGE)) ? androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES : str;
    }

    private void startSyncIfNecessary() {
        if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    void addNewTokenListener(com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener newTokenListener) {
        this.newTokenListeners.add(newTokenListener);
    }

    java.lang.String blockingGetMasterToken() throws java.io.IOException {
        return getToken(com.google.firebase.iid.Metadata.getDefaultSenderId(this.app), androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
    }

    @java.lang.Deprecated
    public void deleteInstanceId() throws java.io.IOException {
        checkRequiredFirebaseOptions(this.app);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        awaitTask(this.firebaseInstallations.delete());
        resetStorage();
    }

    @java.lang.Deprecated
    public void deleteToken(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        checkRequiredFirebaseOptions(this.app);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        java.lang.String strRationaliseScope = rationaliseScope(str2);
        awaitTask(this.rpc.deleteToken(getIdWithoutTriggeringSync(), str, strRationaliseScope));
        store.deleteToken(getSubtype(), str, strRationaliseScope);
    }

    void enqueueTaskWithDelaySeconds(java.lang.Runnable runnable, long j) {
        synchronized (com.google.firebase.iid.FirebaseInstanceId.class) {
            if (syncExecutor == null) {
                syncExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("FirebaseInstanceId"));
            }
            syncExecutor.schedule(runnable, j, java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    com.google.firebase.FirebaseApp getApp() {
        return this.app;
    }

    public long getCreationTime() {
        return store.getCreationTime(this.app.getPersistenceKey());
    }

    @java.lang.Deprecated
    public java.lang.String getId() {
        checkRequiredFirebaseOptions(this.app);
        startSyncIfNecessary();
        return getIdWithoutTriggeringSync();
    }

    java.lang.String getIdWithoutTriggeringSync() {
        try {
            store.setCreationTime(this.app.getPersistenceKey());
            return (java.lang.String) awaitTaskAllowOnMainThread(this.firebaseInstallations.getId());
        } catch (java.lang.InterruptedException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    @java.lang.Deprecated
    public com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult> getInstanceId() {
        checkRequiredFirebaseOptions(this.app);
        return getInstanceId(com.google.firebase.iid.Metadata.getDefaultSenderId(this.app), androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
    }

    @java.lang.Deprecated
    public java.lang.String getToken() {
        checkRequiredFirebaseOptions(this.app);
        com.google.firebase.iid.Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            startSync();
        }
        return com.google.firebase.iid.Store.Token.getTokenOrNull(tokenWithoutTriggeringSync);
    }

    com.google.firebase.iid.Store.Token getTokenWithoutTriggeringSync() {
        return getTokenWithoutTriggeringSync(com.google.firebase.iid.Metadata.getDefaultSenderId(this.app), androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES);
    }

    public boolean isFcmAutoInitEnabled() {
        throw new java.lang.IllegalStateException("FirebaseMessaging version not supported. Update to latest version.");
    }

    public boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    final /* synthetic */ com.google.android.gms.tasks.Task lambda$getInstanceId$0$FirebaseInstanceId(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws java.lang.Exception {
        store.saveToken(getSubtype(), str, str2, str4, this.metadata.getAppVersionCode());
        return com.google.android.gms.tasks.Tasks.forResult(new com.google.firebase.iid.InstanceIdResultImpl(str3, str4));
    }

    final /* synthetic */ void lambda$getInstanceId$1$FirebaseInstanceId(com.google.firebase.iid.Store.Token token, com.google.firebase.iid.InstanceIdResult instanceIdResult) {
        java.lang.String token2 = instanceIdResult.getToken();
        if (token == null || !token2.equals(token.token)) {
            java.util.Iterator<com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener> it = this.newTokenListeners.iterator();
            while (it.hasNext()) {
                it.next().onNewToken(token2);
            }
        }
    }

    final /* synthetic */ com.google.android.gms.tasks.Task lambda$getInstanceId$2$FirebaseInstanceId(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final com.google.firebase.iid.Store.Token token) {
        return this.rpc.getToken(str, str2, str3).onSuccessTask(this.fileIoExecutor, new com.google.android.gms.tasks.SuccessContinuation(this, str2, str3, str) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$4
            private final com.google.firebase.iid.FirebaseInstanceId arg$1;
            private final java.lang.String arg$2;
            private final java.lang.String arg$3;
            private final java.lang.String arg$4;

            {
                this.arg$1 = this;
                this.arg$2 = str2;
                this.arg$3 = str3;
                this.arg$4 = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return this.arg$1.lambda$getInstanceId$0$FirebaseInstanceId(this.arg$2, this.arg$3, this.arg$4, (java.lang.String) obj);
            }
        }).addOnSuccessListener(com.google.firebase.iid.FirebaseInstanceId$$Lambda$5.$instance, (com.google.android.gms.tasks.OnSuccessListener<? super TContinuationResult>) new com.google.android.gms.tasks.OnSuccessListener(this, token) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$6
            private final com.google.firebase.iid.FirebaseInstanceId arg$1;
            private final com.google.firebase.iid.Store.Token arg$2;

            {
                this.arg$1 = this;
                this.arg$2 = token;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(java.lang.Object obj) {
                this.arg$1.lambda$getInstanceId$1$FirebaseInstanceId(this.arg$2, (com.google.firebase.iid.InstanceIdResult) obj);
            }
        });
    }

    final /* synthetic */ com.google.android.gms.tasks.Task lambda$getInstanceId$3$FirebaseInstanceId(final java.lang.String str, final java.lang.String str2, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        final java.lang.String idWithoutTriggeringSync = getIdWithoutTriggeringSync();
        final com.google.firebase.iid.Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync(str, str2);
        return !tokenNeedsRefresh(tokenWithoutTriggeringSync) ? com.google.android.gms.tasks.Tasks.forResult(new com.google.firebase.iid.InstanceIdResultImpl(idWithoutTriggeringSync, tokenWithoutTriggeringSync.token)) : this.requestDeduplicator.getOrStartGetTokenRequest(str, str2, new com.google.firebase.iid.RequestDeduplicator.GetTokenRequest(this, idWithoutTriggeringSync, str, str2, tokenWithoutTriggeringSync) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$3
            private final com.google.firebase.iid.FirebaseInstanceId arg$1;
            private final java.lang.String arg$2;
            private final java.lang.String arg$3;
            private final java.lang.String arg$4;
            private final com.google.firebase.iid.Store.Token arg$5;

            {
                this.arg$1 = this;
                this.arg$2 = idWithoutTriggeringSync;
                this.arg$3 = str;
                this.arg$4 = str2;
                this.arg$5 = tokenWithoutTriggeringSync;
            }

            @Override // com.google.firebase.iid.RequestDeduplicator.GetTokenRequest
            public com.google.android.gms.tasks.Task start() {
                return this.arg$1.lambda$getInstanceId$2$FirebaseInstanceId(this.arg$2, this.arg$3, this.arg$4, this.arg$5);
            }
        });
    }

    synchronized void resetStorage() {
        store.deleteAll();
    }

    public void setFcmAutoInitEnabled(boolean z) {
        throw new java.lang.IllegalStateException("FirebaseMessaging version not supported. Update to latest version.");
    }

    synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    synchronized void startSync() {
        if (this.syncScheduledOrRunning) {
            return;
        }
        syncWithDelaySecondsInternal(0L);
    }

    synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new com.google.firebase.iid.SyncTask(this, java.lang.Math.min(java.lang.Math.max(30L, j + j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    boolean tokenNeedsRefresh(com.google.firebase.iid.Store.Token token) {
        return token == null || token.needsRefresh(this.metadata.getAppVersionCode());
    }

    public static com.google.firebase.iid.FirebaseInstanceId getInstance(com.google.firebase.FirebaseApp firebaseApp) {
        checkRequiredFirebaseOptions(firebaseApp);
        com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId = (com.google.firebase.iid.FirebaseInstanceId) firebaseApp.get(com.google.firebase.iid.FirebaseInstanceId.class);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    com.google.firebase.iid.Store.Token getTokenWithoutTriggeringSync(java.lang.String str, java.lang.String str2) {
        return store.getToken(getSubtype(), str, str2);
    }

    private com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult> getInstanceId(final java.lang.String str, java.lang.String str2) {
        final java.lang.String strRationaliseScope = rationaliseScope(str2);
        return com.google.android.gms.tasks.Tasks.forResult(null).continueWithTask(this.fileIoExecutor, new com.google.android.gms.tasks.Continuation(this, str, strRationaliseScope) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$0
            private final com.google.firebase.iid.FirebaseInstanceId arg$1;
            private final java.lang.String arg$2;
            private final java.lang.String arg$3;

            {
                this.arg$1 = this;
                this.arg$2 = str;
                this.arg$3 = strRationaliseScope;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return this.arg$1.lambda$getInstanceId$3$FirebaseInstanceId(this.arg$2, this.arg$3, task);
            }
        });
    }

    @java.lang.Deprecated
    public java.lang.String getToken(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        checkRequiredFirebaseOptions(this.app);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        return ((com.google.firebase.iid.InstanceIdResult) awaitTask(getInstanceId(str, str2))).getToken();
    }

    FirebaseInstanceId(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> provider, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> provider2, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, new com.google.firebase.iid.Metadata(firebaseApp.getApplicationContext()), com.google.firebase.iid.FirebaseIidExecutors.newCachedSingleThreadExecutor(), com.google.firebase.iid.FirebaseIidExecutors.newCachedSingleThreadExecutor(), provider, provider2, firebaseInstallationsApi);
    }
}
