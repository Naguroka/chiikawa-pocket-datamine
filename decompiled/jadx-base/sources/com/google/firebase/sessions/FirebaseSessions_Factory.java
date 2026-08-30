package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
public final class FirebaseSessions_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.FirebaseSessions> {
    private final javax.inject.Provider<kotlin.coroutines.CoroutineContext> backgroundDispatcherProvider;
    private final javax.inject.Provider<com.google.firebase.FirebaseApp> firebaseAppProvider;
    private final javax.inject.Provider<com.google.firebase.sessions.SessionLifecycleServiceBinder> lifecycleServiceBinderProvider;
    private final javax.inject.Provider<com.google.firebase.sessions.settings.SessionsSettings> settingsProvider;

    public FirebaseSessions_Factory(javax.inject.Provider<com.google.firebase.FirebaseApp> provider, javax.inject.Provider<com.google.firebase.sessions.settings.SessionsSettings> provider2, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider3, javax.inject.Provider<com.google.firebase.sessions.SessionLifecycleServiceBinder> provider4) {
        this.firebaseAppProvider = provider;
        this.settingsProvider = provider2;
        this.backgroundDispatcherProvider = provider3;
        this.lifecycleServiceBinderProvider = provider4;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.FirebaseSessions get() {
        return newInstance(this.firebaseAppProvider.get(), this.settingsProvider.get(), this.backgroundDispatcherProvider.get(), this.lifecycleServiceBinderProvider.get());
    }

    public static com.google.firebase.sessions.FirebaseSessions_Factory create(javax.inject.Provider<com.google.firebase.FirebaseApp> provider, javax.inject.Provider<com.google.firebase.sessions.settings.SessionsSettings> provider2, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider3, javax.inject.Provider<com.google.firebase.sessions.SessionLifecycleServiceBinder> provider4) {
        return new com.google.firebase.sessions.FirebaseSessions_Factory(provider, provider2, provider3, provider4);
    }

    public static com.google.firebase.sessions.FirebaseSessions newInstance(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.sessions.settings.SessionsSettings sessionsSettings, kotlin.coroutines.CoroutineContext coroutineContext, com.google.firebase.sessions.SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        return new com.google.firebase.sessions.FirebaseSessions(firebaseApp, sessionsSettings, coroutineContext, sessionLifecycleServiceBinder);
    }
}
