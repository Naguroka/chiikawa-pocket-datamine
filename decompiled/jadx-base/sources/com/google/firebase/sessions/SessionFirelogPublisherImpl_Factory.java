package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionFirelogPublisherImpl_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.SessionFirelogPublisherImpl> {
    private final javax.inject.Provider<kotlin.coroutines.CoroutineContext> backgroundDispatcherProvider;
    private final javax.inject.Provider<com.google.firebase.sessions.EventGDTLoggerInterface> eventGDTLoggerProvider;
    private final javax.inject.Provider<com.google.firebase.FirebaseApp> firebaseAppProvider;
    private final javax.inject.Provider<com.google.firebase.installations.FirebaseInstallationsApi> firebaseInstallationsProvider;
    private final javax.inject.Provider<com.google.firebase.sessions.settings.SessionsSettings> sessionSettingsProvider;

    public SessionFirelogPublisherImpl_Factory(javax.inject.Provider<com.google.firebase.FirebaseApp> provider, javax.inject.Provider<com.google.firebase.installations.FirebaseInstallationsApi> provider2, javax.inject.Provider<com.google.firebase.sessions.settings.SessionsSettings> provider3, javax.inject.Provider<com.google.firebase.sessions.EventGDTLoggerInterface> provider4, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider5) {
        this.firebaseAppProvider = provider;
        this.firebaseInstallationsProvider = provider2;
        this.sessionSettingsProvider = provider3;
        this.eventGDTLoggerProvider = provider4;
        this.backgroundDispatcherProvider = provider5;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.SessionFirelogPublisherImpl get() {
        return newInstance(this.firebaseAppProvider.get(), this.firebaseInstallationsProvider.get(), this.sessionSettingsProvider.get(), this.eventGDTLoggerProvider.get(), this.backgroundDispatcherProvider.get());
    }

    public static com.google.firebase.sessions.SessionFirelogPublisherImpl_Factory create(javax.inject.Provider<com.google.firebase.FirebaseApp> provider, javax.inject.Provider<com.google.firebase.installations.FirebaseInstallationsApi> provider2, javax.inject.Provider<com.google.firebase.sessions.settings.SessionsSettings> provider3, javax.inject.Provider<com.google.firebase.sessions.EventGDTLoggerInterface> provider4, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider5) {
        return new com.google.firebase.sessions.SessionFirelogPublisherImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.google.firebase.sessions.SessionFirelogPublisherImpl newInstance(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.sessions.settings.SessionsSettings sessionsSettings, com.google.firebase.sessions.EventGDTLoggerInterface eventGDTLoggerInterface, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new com.google.firebase.sessions.SessionFirelogPublisherImpl(firebaseApp, firebaseInstallationsApi, sessionsSettings, eventGDTLoggerInterface, coroutineContext);
    }
}
