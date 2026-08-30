package com.google.firebase.datatransport;

/* JADX INFO: loaded from: classes5.dex */
public class TransportRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-transport";

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.android.datatransport.TransportFactory.class).name(LIBRARY_NAME).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) android.content.Context.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$0(componentContainer);
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.datatransport.LegacyTransportBackend.class, com.google.android.datatransport.TransportFactory.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) android.content.Context.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda1
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$1(componentContainer);
            }
        }).build(), com.google.firebase.components.Component.builder(com.google.firebase.components.Qualified.qualified(com.google.firebase.datatransport.TransportBackend.class, com.google.android.datatransport.TransportFactory.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) android.content.Context.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.datatransport.TransportRegistrar$$ExternalSyntheticLambda2
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$2(componentContainer);
            }
        }).build(), com.google.firebase.platforminfo.LibraryVersionComponent.create(LIBRARY_NAME, com.google.firebase.datatransport.BuildConfig.VERSION_NAME));
    }

    static /* synthetic */ com.google.android.datatransport.TransportFactory lambda$getComponents$0(com.google.firebase.components.ComponentContainer componentContainer) {
        com.google.android.datatransport.runtime.TransportRuntime.initialize((android.content.Context) componentContainer.get(android.content.Context.class));
        return com.google.android.datatransport.runtime.TransportRuntime.getInstance().newFactory(com.google.android.datatransport.cct.CCTDestination.LEGACY_INSTANCE);
    }

    static /* synthetic */ com.google.android.datatransport.TransportFactory lambda$getComponents$1(com.google.firebase.components.ComponentContainer componentContainer) {
        com.google.android.datatransport.runtime.TransportRuntime.initialize((android.content.Context) componentContainer.get(android.content.Context.class));
        return com.google.android.datatransport.runtime.TransportRuntime.getInstance().newFactory(com.google.android.datatransport.cct.CCTDestination.LEGACY_INSTANCE);
    }

    static /* synthetic */ com.google.android.datatransport.TransportFactory lambda$getComponents$2(com.google.firebase.components.ComponentContainer componentContainer) {
        com.google.android.datatransport.runtime.TransportRuntime.initialize((android.content.Context) componentContainer.get(android.content.Context.class));
        return com.google.android.datatransport.runtime.TransportRuntime.getInstance().newFactory(com.google.android.datatransport.cct.CCTDestination.INSTANCE);
    }
}
