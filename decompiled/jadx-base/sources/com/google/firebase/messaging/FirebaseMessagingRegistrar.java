package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseMessagingRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-fcm";

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        final com.google.firebase.components.Qualified qualified = com.google.firebase.components.Qualified.qualified(com.google.firebase.datatransport.TransportBackend.class, com.google.android.datatransport.TransportFactory.class);
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.messaging.FirebaseMessaging.class).name(LIBRARY_NAME).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.optional(com.google.firebase.iid.internal.FirebaseInstanceIdInternal.class)).add(com.google.firebase.components.Dependency.optionalProvider((java.lang.Class<?>) com.google.firebase.platforminfo.UserAgentPublisher.class)).add(com.google.firebase.components.Dependency.optionalProvider((java.lang.Class<?>) com.google.firebase.heartbeatinfo.HeartBeatInfo.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.installations.FirebaseInstallationsApi.class)).add(com.google.firebase.components.Dependency.optionalProvider((com.google.firebase.components.Qualified<?>) qualified)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.events.Subscriber.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.messaging.FirebaseMessagingRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.messaging.FirebaseMessagingRegistrar.lambda$getComponents$0(qualified, componentContainer);
            }
        }).alwaysEager().build(), com.google.firebase.platforminfo.LibraryVersionComponent.create(LIBRARY_NAME, com.google.firebase.messaging.BuildConfig.VERSION_NAME));
    }

    static /* synthetic */ com.google.firebase.messaging.FirebaseMessaging lambda$getComponents$0(com.google.firebase.components.Qualified qualified, com.google.firebase.components.ComponentContainer componentContainer) {
        return new com.google.firebase.messaging.FirebaseMessaging((com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class), (com.google.firebase.iid.internal.FirebaseInstanceIdInternal) componentContainer.get(com.google.firebase.iid.internal.FirebaseInstanceIdInternal.class), componentContainer.getProvider(com.google.firebase.platforminfo.UserAgentPublisher.class), componentContainer.getProvider(com.google.firebase.heartbeatinfo.HeartBeatInfo.class), (com.google.firebase.installations.FirebaseInstallationsApi) componentContainer.get(com.google.firebase.installations.FirebaseInstallationsApi.class), componentContainer.getProvider(qualified), (com.google.firebase.events.Subscriber) componentContainer.get(com.google.firebase.events.Subscriber.class));
    }
}
