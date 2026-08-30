package com.google.firebase.sessions.settings;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionsSettings_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.settings.SessionsSettings> {
    private final javax.inject.Provider<kotlin.coroutines.CoroutineContext> backgroundDispatcherProvider;
    private final javax.inject.Provider<kotlin.coroutines.CoroutineContext> blockingDispatcherProvider;
    private final javax.inject.Provider<com.google.firebase.FirebaseApp> firebaseAppProvider;
    private final javax.inject.Provider<com.google.firebase.installations.FirebaseInstallationsApi> firebaseInstallationsApiProvider;

    public SessionsSettings_Factory(javax.inject.Provider<com.google.firebase.FirebaseApp> provider, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider2, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider3, javax.inject.Provider<com.google.firebase.installations.FirebaseInstallationsApi> provider4) {
        this.firebaseAppProvider = provider;
        this.blockingDispatcherProvider = provider2;
        this.backgroundDispatcherProvider = provider3;
        this.firebaseInstallationsApiProvider = provider4;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.settings.SessionsSettings get() {
        return newInstance(this.firebaseAppProvider.get(), this.blockingDispatcherProvider.get(), this.backgroundDispatcherProvider.get(), this.firebaseInstallationsApiProvider.get());
    }

    public static com.google.firebase.sessions.settings.SessionsSettings_Factory create(javax.inject.Provider<com.google.firebase.FirebaseApp> provider, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider2, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider3, javax.inject.Provider<com.google.firebase.installations.FirebaseInstallationsApi> provider4) {
        return new com.google.firebase.sessions.settings.SessionsSettings_Factory(provider, provider2, provider3, provider4);
    }

    public static com.google.firebase.sessions.settings.SessionsSettings newInstance(com.google.firebase.FirebaseApp firebaseApp, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        return new com.google.firebase.sessions.settings.SessionsSettings(firebaseApp, coroutineContext, coroutineContext2, firebaseInstallationsApi);
    }
}
