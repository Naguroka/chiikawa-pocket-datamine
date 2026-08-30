package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsCore {
    static final java.lang.String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final java.lang.String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 3;
    private static final java.lang.String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_STACK_SIZE = 1024;
    private static final java.lang.String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    private static final java.lang.String ON_DEMAND_DROPPED_KEY = "com.crashlytics.on-demand.dropped-exceptions";
    private static final java.lang.String ON_DEMAND_RECORDED_KEY = "com.crashlytics.on-demand.recorded-exceptions";
    private final com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger analyticsEventLogger;
    private final com.google.firebase.FirebaseApp app;
    public final com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource breadcrumbSource;
    private final android.content.Context context;
    private com.google.firebase.crashlytics.internal.common.CrashlyticsController controller;
    private com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker crashMarker;
    private final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers;
    private final com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;
    private final com.google.firebase.crashlytics.internal.common.IdManager idManager;
    private com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker initializationMarker;
    private final com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent nativeComponent;
    private final com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy remoteConfigDeferredProxy;
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final long startTime = java.lang.System.currentTimeMillis();
    private final com.google.firebase.crashlytics.internal.common.OnDemandCounter onDemandCounter = new com.google.firebase.crashlytics.internal.common.OnDemandCounter();

    public static java.lang.String getVersion() {
        return "19.4.2";
    }

    public CrashlyticsCore(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.crashlytics.internal.common.IdManager idManager, com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent crashlyticsNativeComponent, com.google.firebase.crashlytics.internal.common.DataCollectionArbiter dataCollectionArbiter, com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource breadcrumbSource, com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger analyticsEventLogger, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy remoteConfigDeferredProxy, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers) {
        this.app = firebaseApp;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.context = firebaseApp.getApplicationContext();
        this.idManager = idManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.analyticsEventLogger = analyticsEventLogger;
        this.fileStore = fileStore;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
        this.remoteConfigDeferredProxy = remoteConfigDeferredProxy;
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    public boolean onPreExecute(com.google.firebase.crashlytics.internal.common.AppData appData, com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider) {
        if (!isBuildIdValid(appData.buildId, com.google.firebase.crashlytics.internal.common.CommonUtils.getBooleanResourceValue(this.context, CRASHLYTICS_REQUIRE_BUILD_ID, true))) {
            throw new java.lang.IllegalStateException(MISSING_BUILD_ID_MSG);
        }
        java.lang.String sessionId = new com.google.firebase.crashlytics.internal.common.CLSUUID().getSessionId();
        try {
            this.crashMarker = new com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker(CRASH_MARKER_FILE_NAME, this.fileStore);
            this.initializationMarker = new com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker(INITIALIZATION_MARKER_FILE_NAME, this.fileStore);
            com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata = new com.google.firebase.crashlytics.internal.metadata.UserMetadata(sessionId, this.fileStore, this.crashlyticsWorkers);
            com.google.firebase.crashlytics.internal.metadata.LogFileManager logFileManager = new com.google.firebase.crashlytics.internal.metadata.LogFileManager(this.fileStore);
            com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy middleOutFallbackStrategy = new com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy(1024, new com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy(10));
            this.remoteConfigDeferredProxy.setupListener(userMetadata);
            this.controller = new com.google.firebase.crashlytics.internal.common.CrashlyticsController(this.context, this.idManager, this.dataCollectionArbiter, this.fileStore, this.crashMarker, appData, userMetadata, logFileManager, com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator.create(this.context, this.idManager, this.fileStore, appData, logFileManager, userMetadata, middleOutFallbackStrategy, settingsProvider, this.onDemandCounter, this.sessionsSubscriber, this.crashlyticsWorkers), this.nativeComponent, this.analyticsEventLogger, this.sessionsSubscriber, this.crashlyticsWorkers);
            boolean zDidPreviousInitializationFail = didPreviousInitializationFail();
            checkForPreviousCrash();
            this.controller.enableExceptionHandling(sessionId, java.lang.Thread.getDefaultUncaughtExceptionHandler(), settingsProvider);
            if (zDidPreviousInitializationFail && com.google.firebase.crashlytics.internal.common.CommonUtils.canTryConnection(this.context)) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                finishInitSynchronously(settingsProvider);
                return false;
            }
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Successfully configured exception handler.");
            return true;
        } catch (java.lang.Exception e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Crashlytics was not started due to an exception during initialization", e);
            this.controller = null;
            return false;
        }
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> doBackgroundInitializationAsync(final com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider) {
        return this.crashlyticsWorkers.common.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m834x16e6f122(settingsProvider);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: doBackgroundInitialization, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m835x1097325b(com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider) {
        com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread();
        markInitializationStarted();
        try {
            try {
                this.breadcrumbSource.registerBreadcrumbHandler(new com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda2
                    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
                    public final void handleBreadcrumb(java.lang.String str) {
                        this.f$0.log(str);
                    }
                });
                this.controller.saveVersionControlInfo();
                if (!settingsProvider.getSettingsSync().featureFlagData.collectReports) {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Collection of crash reports disabled in Crashlytics settings.");
                    throw new java.lang.RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.controller.finalizeSessions(settingsProvider)) {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().w("Previous sessions could not be finalized.");
                }
                this.controller.submitAllReports(settingsProvider.getSettingsAsync());
                markInitializationComplete();
            } catch (java.lang.Exception e) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().e("Crashlytics encountered a problem during asynchronous initialization.", e);
            }
        } catch (java.lang.Throwable th) {
            markInitializationComplete();
            throw th;
        }
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
    }

    public void setCrashlyticsCollectionEnabled(java.lang.Boolean bool) {
        this.dataCollectionArbiter.setCrashlyticsDataCollectionEnabled(bool);
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> checkForUnsentReports() {
        return this.controller.checkForUnsentReports();
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> sendUnsentReports() {
        return this.controller.sendUnsentReports();
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> deleteUnsentReports() {
        return this.controller.deleteUnsentReports();
    }

    public void logException(final java.lang.Throwable th, final java.util.Map<java.lang.String, java.lang.String> map) {
        this.crashlyticsWorkers.common.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m838xa7aaa7c5(th, map);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$logException$1$com-google-firebase-crashlytics-internal-common-CrashlyticsCore, reason: not valid java name */
    /* synthetic */ void m838xa7aaa7c5(java.lang.Throwable th, java.util.Map map) {
        this.controller.writeNonFatalException(java.lang.Thread.currentThread(), th, map);
    }

    public void log(final java.lang.String str) {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - this.startTime;
        this.crashlyticsWorkers.common.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m837xc4d7d9c6(jCurrentTimeMillis, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$log$2$com-google-firebase-crashlytics-internal-common-CrashlyticsCore, reason: not valid java name */
    /* synthetic */ void m836x771861c5(long j, java.lang.String str) {
        this.controller.writeToLog(j, str);
    }

    /* JADX INFO: renamed from: lambda$log$3$com-google-firebase-crashlytics-internal-common-CrashlyticsCore, reason: not valid java name */
    /* synthetic */ void m837xc4d7d9c6(final long j, final java.lang.String str) {
        this.crashlyticsWorkers.diskWrite.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m836x771861c5(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setUserId$4$com-google-firebase-crashlytics-internal-common-CrashlyticsCore, reason: not valid java name */
    /* synthetic */ void m843xff792c8b(java.lang.String str) {
        this.controller.setUserId(str);
    }

    public void setUserId(final java.lang.String str) {
        this.crashlyticsWorkers.common.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m843xff792c8b(str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setCustomKey$5$com-google-firebase-crashlytics-internal-common-CrashlyticsCore, reason: not valid java name */
    /* synthetic */ void m840xd965350a(java.lang.String str, java.lang.String str2) {
        this.controller.setCustomKey(str, str2);
    }

    public void setCustomKey(final java.lang.String str, final java.lang.String str2) {
        this.crashlyticsWorkers.common.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m840xd965350a(str, str2);
            }
        });
    }

    public void setCustomKeys(final java.util.Map<java.lang.String, java.lang.String> map) {
        if (map.isEmpty()) {
            return;
        }
        this.crashlyticsWorkers.common.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m841x42c2b50c(map);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setCustomKeys$6$com-google-firebase-crashlytics-internal-common-CrashlyticsCore, reason: not valid java name */
    /* synthetic */ void m841x42c2b50c(java.util.Map map) {
        this.controller.setCustomKeys(map);
    }

    /* JADX INFO: renamed from: lambda$setInternalKey$7$com-google-firebase-crashlytics-internal-common-CrashlyticsCore, reason: not valid java name */
    /* synthetic */ void m842xed193680(java.lang.String str, java.lang.String str2) {
        this.controller.setInternalKey(str, str2);
    }

    public void setInternalKey(final java.lang.String str, final java.lang.String str2) {
        this.crashlyticsWorkers.common.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m842xed193680(str, str2);
            }
        });
    }

    public void logFatalException(final java.lang.Throwable th) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Recorded on-demand fatal events: " + this.onDemandCounter.getRecordedOnDemandExceptions());
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Dropped on-demand fatal events: " + this.onDemandCounter.getDroppedOnDemandExceptions());
        this.crashlyticsWorkers.common.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m839xae266e96(th);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$logFatalException$8$com-google-firebase-crashlytics-internal-common-CrashlyticsCore, reason: not valid java name */
    /* synthetic */ void m839xae266e96(java.lang.Throwable th) {
        this.controller.setInternalKey(ON_DEMAND_RECORDED_KEY, java.lang.Integer.toString(this.onDemandCounter.getRecordedOnDemandExceptions()));
        this.controller.setInternalKey(ON_DEMAND_DROPPED_KEY, java.lang.Integer.toString(this.onDemandCounter.getDroppedOnDemandExceptions()));
        this.controller.logFatalException(java.lang.Thread.currentThread(), th);
    }

    com.google.firebase.crashlytics.internal.common.CrashlyticsController getController() {
        return this.controller;
    }

    private void finishInitSynchronously(final com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider) {
        java.util.concurrent.Future<?> futureSubmit = this.crashlyticsWorkers.common.getExecutor().submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m835x1097325b(settingsProvider);
            }
        });
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Crashlytics was interrupted during initialization.", e);
            java.lang.Thread.currentThread().interrupt();
        } catch (java.util.concurrent.ExecutionException e2) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Crashlytics encountered a problem during initialization.", e2);
        } catch (java.util.concurrent.TimeoutException e3) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Crashlytics timed out during initialization.", e3);
        }
    }

    void markInitializationStarted() {
        com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread();
        this.initializationMarker.create();
        com.google.firebase.crashlytics.internal.Logger.getLogger().v("Initialization marker file was created.");
    }

    void markInitializationComplete() {
        com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread();
        try {
            if (this.initializationMarker.remove()) {
                return;
            }
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Initialization marker file was not properly removed.");
        } catch (java.lang.Exception e) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    private void checkForPreviousCrash() {
        try {
            this.didCrashOnPreviousExecution = java.lang.Boolean.TRUE.equals((java.lang.Boolean) this.crashlyticsWorkers.common.getExecutor().submit(new java.util.concurrent.Callable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsCore$$ExternalSyntheticLambda11
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.f$0.m833xf5be8161();
                }
            }).get(3L, java.util.concurrent.TimeUnit.SECONDS));
        } catch (java.lang.Exception unused) {
            this.didCrashOnPreviousExecution = false;
        }
    }

    /* JADX INFO: renamed from: lambda$checkForPreviousCrash$10$com-google-firebase-crashlytics-internal-common-CrashlyticsCore, reason: not valid java name */
    /* synthetic */ java.lang.Boolean m833xf5be8161() throws java.lang.Exception {
        return java.lang.Boolean.valueOf(this.controller.didCrashOnPreviousExecution());
    }

    public boolean didCrashOnPreviousExecution() {
        return this.didCrashOnPreviousExecution;
    }

    static boolean isBuildIdValid(java.lang.String str, boolean z) {
        if (!z) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("Configured not to require a build ID.");
            return true;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            return true;
        }
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".     |  | ");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".     |  |");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".     |  |");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".   \\ |  | /");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".    \\    /");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".     \\  /");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".      \\/");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, MISSING_BUILD_ID_MSG);
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".      /\\");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".     /  \\");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".    /    \\");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".   / |  | \\");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".     |  |");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".     |  |");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".     |  |");
        android.util.Log.e(com.google.firebase.crashlytics.internal.Logger.TAG, ".");
        return false;
    }
}
