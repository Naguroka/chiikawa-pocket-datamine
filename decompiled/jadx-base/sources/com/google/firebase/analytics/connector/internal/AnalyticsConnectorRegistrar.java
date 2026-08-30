package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public class AnalyticsConnectorRegistrar implements com.google.firebase.components.ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.analytics.connector.AnalyticsConnector.class).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.FirebaseApp.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) android.content.Context.class)).add(com.google.firebase.components.Dependency.required((java.lang.Class<?>) com.google.firebase.events.Subscriber.class)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.analytics.connector.internal.zzb
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.analytics.connector.AnalyticsConnectorImpl.getInstance((com.google.firebase.FirebaseApp) componentContainer.get(com.google.firebase.FirebaseApp.class), (android.content.Context) componentContainer.get(android.content.Context.class), (com.google.firebase.events.Subscriber) componentContainer.get(com.google.firebase.events.Subscriber.class));
            }
        }).eagerInDefaultApp().build(), com.google.firebase.platforminfo.LibraryVersionComponent.create("fire-analytics", "22.4.0"));
    }
}
