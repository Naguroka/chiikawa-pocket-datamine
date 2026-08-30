package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_SessionGeneratorFactory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.SessionGenerator> {
    @Override // javax.inject.Provider
    public com.google.firebase.sessions.SessionGenerator get() {
        return sessionGenerator();
    }

    public static com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionGeneratorFactory create() {
        return com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionGeneratorFactory.InstanceHolder.INSTANCE;
    }

    public static com.google.firebase.sessions.SessionGenerator sessionGenerator() {
        return (com.google.firebase.sessions.SessionGenerator) com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.INSTANCE.sessionGenerator());
    }

    private static final class InstanceHolder {
        private static final com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionGeneratorFactory INSTANCE = new com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionGeneratorFactory();

        private InstanceHolder() {
        }
    }
}
