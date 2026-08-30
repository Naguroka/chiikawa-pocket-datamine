package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionDatastoreImpl_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.SessionDatastoreImpl> {
    private final javax.inject.Provider<android.content.Context> appContextProvider;
    private final javax.inject.Provider<kotlin.coroutines.CoroutineContext> backgroundDispatcherProvider;

    public SessionDatastoreImpl_Factory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider2) {
        this.appContextProvider = provider;
        this.backgroundDispatcherProvider = provider2;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.SessionDatastoreImpl get() {
        return newInstance(this.appContextProvider.get(), this.backgroundDispatcherProvider.get());
    }

    public static com.google.firebase.sessions.SessionDatastoreImpl_Factory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider2) {
        return new com.google.firebase.sessions.SessionDatastoreImpl_Factory(provider, provider2);
    }

    public static com.google.firebase.sessions.SessionDatastoreImpl newInstance(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new com.google.firebase.sessions.SessionDatastoreImpl(context, coroutineContext);
    }
}
