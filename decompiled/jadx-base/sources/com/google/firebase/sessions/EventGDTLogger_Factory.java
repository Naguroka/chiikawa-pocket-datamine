package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
public final class EventGDTLogger_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.EventGDTLogger> {
    private final javax.inject.Provider<com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory>> transportFactoryProvider;

    public EventGDTLogger_Factory(javax.inject.Provider<com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory>> provider) {
        this.transportFactoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.EventGDTLogger get() {
        return newInstance(this.transportFactoryProvider.get());
    }

    public static com.google.firebase.sessions.EventGDTLogger_Factory create(javax.inject.Provider<com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory>> provider) {
        return new com.google.firebase.sessions.EventGDTLogger_Factory(provider);
    }

    public static com.google.firebase.sessions.EventGDTLogger newInstance(com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> provider) {
        return new com.google.firebase.sessions.EventGDTLogger(provider);
    }
}
