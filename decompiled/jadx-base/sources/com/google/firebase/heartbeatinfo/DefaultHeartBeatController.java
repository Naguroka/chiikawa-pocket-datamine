package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes5.dex */
public class DefaultHeartBeatController implements com.google.firebase.heartbeatinfo.HeartBeatController, com.google.firebase.heartbeatinfo.HeartBeatInfo {
    private final android.content.Context applicationContext;
    private final java.util.concurrent.Executor backgroundExecutor;
    private final java.util.Set<com.google.firebase.heartbeatinfo.HeartBeatConsumer> consumers;
    private final com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfoStorage> storageProvider;
    private final com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> userAgentProvider;

    public com.google.android.gms.tasks.Task<java.lang.Void> registerHeartBeat() {
        if (this.consumers.size() <= 0) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        if (!androidx.core.os.UserManagerCompat.isUserUnlocked(this.applicationContext)) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        return com.google.android.gms.tasks.Tasks.call(this.backgroundExecutor, new java.util.concurrent.Callable() { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f$0.m859x734756b4();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$registerHeartBeat$0$com-google-firebase-heartbeatinfo-DefaultHeartBeatController, reason: not valid java name */
    /* synthetic */ java.lang.Void m859x734756b4() throws java.lang.Exception {
        synchronized (this) {
            this.storageProvider.get().storeHeartBeat(java.lang.System.currentTimeMillis(), this.userAgentProvider.get().getUserAgent());
        }
        return null;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public com.google.android.gms.tasks.Task<java.lang.String> getHeartBeatsHeader() {
        if (!androidx.core.os.UserManagerCompat.isUserUnlocked(this.applicationContext)) {
            return com.google.android.gms.tasks.Tasks.forResult("");
        }
        return com.google.android.gms.tasks.Tasks.call(this.backgroundExecutor, new java.util.concurrent.Callable() { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f$0.m858x341e14f2();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getHeartBeatsHeader$1$com-google-firebase-heartbeatinfo-DefaultHeartBeatController, reason: not valid java name */
    /* synthetic */ java.lang.String m858x341e14f2() throws java.lang.Exception {
        java.lang.String string;
        synchronized (this) {
            com.google.firebase.heartbeatinfo.HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
            java.util.List<com.google.firebase.heartbeatinfo.HeartBeatResult> allHeartBeats = heartBeatInfoStorage.getAllHeartBeats();
            heartBeatInfoStorage.deleteAllHeartBeats();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (int i = 0; i < allHeartBeats.size(); i++) {
                com.google.firebase.heartbeatinfo.HeartBeatResult heartBeatResult = allHeartBeats.get(i);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("agent", heartBeatResult.getUserAgent());
                jSONObject.put("dates", new org.json.JSONArray((java.util.Collection) heartBeatResult.getUsedDates()));
                jSONArray.put(jSONObject);
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            android.util.Base64OutputStream base64OutputStream = new android.util.Base64OutputStream(byteArrayOutputStream, 11);
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes(com.adjust.sdk.Constants.ENCODING));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    string = byteArrayOutputStream.toString(com.adjust.sdk.Constants.ENCODING);
                } catch (java.lang.Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    base64OutputStream.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        return string;
    }

    private DefaultHeartBeatController(final android.content.Context context, final java.lang.String str, java.util.Set<com.google.firebase.heartbeatinfo.HeartBeatConsumer> set, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> provider, java.util.concurrent.Executor executor) {
        this((com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfoStorage>) new com.google.firebase.inject.Provider() { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda3
            @Override // com.google.firebase.inject.Provider
            public final java.lang.Object get() {
                return com.google.firebase.heartbeatinfo.DefaultHeartBeatController.lambda$new$2(context, str);
            }
        }, set, executor, provider, context);
    }

    static /* synthetic */ com.google.firebase.heartbeatinfo.HeartBeatInfoStorage lambda$new$2(android.content.Context context, java.lang.String str) {
        return new com.google.firebase.heartbeatinfo.HeartBeatInfoStorage(context, str);
    }

    DefaultHeartBeatController(com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfoStorage> provider, java.util.Set<com.google.firebase.heartbeatinfo.HeartBeatConsumer> set, java.util.concurrent.Executor executor, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> provider2, android.content.Context context) {
        this.storageProvider = provider;
        this.consumers = set;
        this.backgroundExecutor = executor;
        this.userAgentProvider = provider2;
        this.applicationContext = context;
    }

    public static com.google.firebase.components.Component<com.google.firebase.heartbeatinfo.DefaultHeartBeatController> component() {
        final com.google.firebase.components.Qualified qualified = com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, java.util.concurrent.Executor.class);
        return com.google.firebase.components.Component.builder(com.google.firebase.heartbeatinfo.DefaultHeartBeatController.class, com.google.firebase.heartbeatinfo.HeartBeatController.class, com.google.firebase.heartbeatinfo.HeartBeatInfo.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) android.content.Context.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.setOf((java.lang.Class<?>) com.google.firebase.heartbeatinfo.HeartBeatConsumer.class)).add(com.google.firebase.components.Dependency.requiredProvider((java.lang.Class<?>) com.google.firebase.platforminfo.UserAgentPublisher.class)).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) qualified)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda2
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.heartbeatinfo.DefaultHeartBeatController.lambda$component$3(qualified, componentContainer);
            }
        }).build();
    }

    static /* synthetic */ com.google.firebase.heartbeatinfo.DefaultHeartBeatController lambda$component$3(com.google.firebase.components.Qualified qualified, com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.heartbeatinfo.DefaultHeartBeatController((android.content.Context) componentContainer.get(android.content.Context.class), ((com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class)).getPersistenceKey(), (java.util.Set<com.google.firebase.heartbeatinfo.HeartBeatConsumer>) componentContainer.setOf(com.google.firebase.heartbeatinfo.HeartBeatConsumer.class), (com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher>) componentContainer.getProvider(com.google.firebase.platforminfo.UserAgentPublisher.class), (java.util.concurrent.Executor) componentContainer.get(qualified));
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public synchronized com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat getHeartBeatCode(java.lang.String str) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.firebase.heartbeatinfo.HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
        if (heartBeatInfoStorage.shouldSendGlobalHeartBeat(jCurrentTimeMillis)) {
            heartBeatInfoStorage.postHeartBeatCleanUp();
            return com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.NONE;
    }
}
