package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes5.dex */
public class ExecutorsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    static final com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> BG_EXECUTOR = new com.google.firebase.components.Lazy<>(new com.google.firebase.inject.Provider() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda4
        @Override // com.google.firebase.inject.Provider
        public final java.lang.Object get() {
            return com.google.firebase.concurrent.ExecutorsRegistrar.scheduled(java.util.concurrent.Executors.newFixedThreadPool(4, com.google.firebase.concurrent.ExecutorsRegistrar.factory("Firebase Background", 10, com.google.firebase.concurrent.ExecutorsRegistrar.bgPolicy())));
        }
    });
    static final com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> LITE_EXECUTOR = new com.google.firebase.components.Lazy<>(new com.google.firebase.inject.Provider() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda5
        @Override // com.google.firebase.inject.Provider
        public final java.lang.Object get() {
            return com.google.firebase.concurrent.ExecutorsRegistrar.scheduled(java.util.concurrent.Executors.newFixedThreadPool(java.lang.Math.max(2, java.lang.Runtime.getRuntime().availableProcessors()), com.google.firebase.concurrent.ExecutorsRegistrar.factory("Firebase Lite", 0, com.google.firebase.concurrent.ExecutorsRegistrar.litePolicy())));
        }
    });
    static final com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> BLOCKING_EXECUTOR = new com.google.firebase.components.Lazy<>(new com.google.firebase.inject.Provider() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda6
        @Override // com.google.firebase.inject.Provider
        public final java.lang.Object get() {
            return com.google.firebase.concurrent.ExecutorsRegistrar.scheduled(java.util.concurrent.Executors.newCachedThreadPool(com.google.firebase.concurrent.ExecutorsRegistrar.factory("Firebase Blocking", 11)));
        }
    });
    static final com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> SCHEDULER = new com.google.firebase.components.Lazy<>(new com.google.firebase.inject.Provider() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda7
        @Override // com.google.firebase.inject.Provider
        public final java.lang.Object get() {
            return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(com.google.firebase.concurrent.ExecutorsRegistrar.factory("Firebase Scheduler", 0));
        }
    });

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, java.util.concurrent.ScheduledExecutorService.class), com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, java.util.concurrent.ExecutorService.class), com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, java.util.concurrent.Executor.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.concurrent.ExecutorsRegistrar.BG_EXECUTOR.get();
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, java.util.concurrent.ScheduledExecutorService.class), com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, java.util.concurrent.ExecutorService.class), com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, java.util.concurrent.Executor.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda1
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.concurrent.ExecutorsRegistrar.BLOCKING_EXECUTOR.get();
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Lightweight.class, java.util.concurrent.ScheduledExecutorService.class), com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Lightweight.class, java.util.concurrent.ExecutorService.class), com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Lightweight.class, java.util.concurrent.Executor.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda2
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.concurrent.ExecutorsRegistrar.LITE_EXECUTOR.get();
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.UiThread.class, java.util.concurrent.Executor.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda3
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.concurrent.UiExecutor.INSTANCE;
            }
        }).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.concurrent.ScheduledExecutorService scheduled(java.util.concurrent.ExecutorService executorService) {
        return new com.google.firebase.concurrent.DelegatingScheduledExecutorService(executorService, SCHEDULER.get());
    }

    private static java.util.concurrent.ThreadFactory factory(java.lang.String str, int i) {
        return new com.google.firebase.concurrent.CustomThreadFactory(str, i, null);
    }

    private static java.util.concurrent.ThreadFactory factory(java.lang.String str, int i, android.os.StrictMode.ThreadPolicy threadPolicy) {
        return new com.google.firebase.concurrent.CustomThreadFactory(str, i, threadPolicy);
    }

    private static android.os.StrictMode.ThreadPolicy bgPolicy() {
        android.os.StrictMode.ThreadPolicy.Builder builderDetectNetwork = new android.os.StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static android.os.StrictMode.ThreadPolicy litePolicy() {
        return new android.os.StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }
}
