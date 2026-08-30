package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseInstallationsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-installations";

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.installations.FirebaseInstallationsApi.class).name(LIBRARY_NAME).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.optionalProvider((java.lang.Class<?>) com.google.firebase.heartbeatinfo.HeartBeatController.class)).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, java.util.concurrent.ExecutorService.class))).add(com.google.firebase.components.Dependency.required((com.google.firebase.components.Qualified<?>) com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, java.util.concurrent.Executor.class))).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.installations.FirebaseInstallationsRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.installations.FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
            }
        }).build(), com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent.create(), com.google.firebase.platforminfo.LibraryVersionComponent.create(LIBRARY_NAME, "18.0.0"));
    }

    static /* synthetic */ com.google.firebase.installations.FirebaseInstallationsApi lambda$getComponents$0(com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.installations.FirebaseInstallations((com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class), componentContainer.getProvider(com.google.firebase.heartbeatinfo.HeartBeatController.class), (java.util.concurrent.ExecutorService) componentContainer.get(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, java.util.concurrent.ExecutorService.class)), com.google.firebase.concurrent.FirebaseExecutors.newSequentialExecutor((java.util.concurrent.Executor) componentContainer.get(com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, java.util.concurrent.Executor.class))));
    }
}
