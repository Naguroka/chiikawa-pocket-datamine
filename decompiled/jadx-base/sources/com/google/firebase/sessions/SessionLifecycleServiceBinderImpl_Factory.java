package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionLifecycleServiceBinderImpl_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.SessionLifecycleServiceBinderImpl> {
    private final javax.inject.Provider<android.content.Context> appContextProvider;

    public SessionLifecycleServiceBinderImpl_Factory(javax.inject.Provider<android.content.Context> provider) {
        this.appContextProvider = provider;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.SessionLifecycleServiceBinderImpl get() {
        return newInstance(this.appContextProvider.get());
    }

    public static com.google.firebase.sessions.SessionLifecycleServiceBinderImpl_Factory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.google.firebase.sessions.SessionLifecycleServiceBinderImpl_Factory(provider);
    }

    public static com.google.firebase.sessions.SessionLifecycleServiceBinderImpl newInstance(android.content.Context context) {
        return new com.google.firebase.sessions.SessionLifecycleServiceBinderImpl(context);
    }
}
