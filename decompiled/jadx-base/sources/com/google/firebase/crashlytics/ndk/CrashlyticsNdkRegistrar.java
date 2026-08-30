package com.google.firebase.crashlytics.ndk;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsNdkRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-cls-ndk";

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent.class).name(LIBRARY_NAME).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) android.content.Context.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.crashlytics.ndk.CrashlyticsNdkRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return this.f$0.buildCrashlyticsNdk(componentContainer);
            }
        }).eagerInDefaultApp().build(), com.google.firebase.platforminfo.LibraryVersionComponent.create(LIBRARY_NAME, "19.4.2"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent buildCrashlyticsNdk(com.google.firebase.components.ComponentContainer componentContainer) {
        android.content.Context context = (android.content.Context) componentContainer.get(android.content.Context.class);
        return com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk.create(context, !com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider.isUnity(context));
    }
}
