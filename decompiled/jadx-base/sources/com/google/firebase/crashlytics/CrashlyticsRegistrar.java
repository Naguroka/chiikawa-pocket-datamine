package com.google.firebase.crashlytics;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-cls";
    private final com.google.firebase.components.Qualified<java.util.concurrent.ExecutorService> backgroundExecutorService = com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, java.util.concurrent.ExecutorService.class);
    private final com.google.firebase.components.Qualified<java.util.concurrent.ExecutorService> blockingExecutorService = com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, java.util.concurrent.ExecutorService.class);
    private final com.google.firebase.components.Qualified<java.util.concurrent.ExecutorService> lightweightExecutorService = com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Lightweight.class, java.util.concurrent.ExecutorService.class);

    static {
        com.google.firebase.sessions.api.FirebaseSessionsDependencies.addDependency(com.google.firebase.sessions.api.SessionSubscriber.Name.CRASHLYTICS);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.crashlytics.FirebaseCrashlytics.class).name(LIBRARY_NAME).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.installations.FirebaseInstallationsApi.class)).add(com.google.firebase.components.Dependency.required(this.backgroundExecutorService)).add(com.google.firebase.components.Dependency.required(this.blockingExecutorService)).add(com.google.firebase.components.Dependency.required(this.lightweightExecutorService)).add(com.google.firebase.components.Dependency.deferred((java.lang.Class<?>) com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent.class)).add(com.google.firebase.components.Dependency.deferred((java.lang.Class<?>) com.google.firebase.analytics.connector.AnalyticsConnector.class)).add(com.google.firebase.components.Dependency.deferred((java.lang.Class<?>) com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.crashlytics.CrashlyticsRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return this.f$0.buildCrashlytics(componentContainer);
            }
        }).eagerInDefaultApp().build(), com.google.firebase.platforminfo.LibraryVersionComponent.create(LIBRARY_NAME, "19.4.2"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.firebase.crashlytics.FirebaseCrashlytics buildCrashlytics(com.google.firebase.components.ComponentContainer componentContainer) {
        com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.setEnforcement(false);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.google.firebase.crashlytics.FirebaseCrashlytics firebaseCrashlyticsInit = com.google.firebase.crashlytics.FirebaseCrashlytics.init((com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class), (com.google.firebase.installations.FirebaseInstallationsApi) componentContainer.get(com.google.firebase.installations.FirebaseInstallationsApi.class), componentContainer.getDeferred(com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent.class), componentContainer.getDeferred(com.google.firebase.analytics.connector.AnalyticsConnector.class), componentContainer.getDeferred(com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop.class), (java.util.concurrent.ExecutorService) componentContainer.get(this.backgroundExecutorService), (java.util.concurrent.ExecutorService) componentContainer.get(this.blockingExecutorService), (java.util.concurrent.ExecutorService) componentContainer.get(this.lightweightExecutorService));
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return firebaseCrashlyticsInit;
    }
}
