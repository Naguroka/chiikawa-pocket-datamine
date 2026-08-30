package com.google.firebase.sessions;

/* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.sessions.dagger.Component(modules = {com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.class})
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0002\u0016\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "", "firebaseSessions", "Lcom/google/firebase/sessions/FirebaseSessions;", "getFirebaseSessions", "()Lcom/google/firebase/sessions/FirebaseSessions;", "sessionDatastore", "Lcom/google/firebase/sessions/SessionDatastore;", "getSessionDatastore", "()Lcom/google/firebase/sessions/SessionDatastore;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "getSessionFirelogPublisher", "()Lcom/google/firebase/sessions/SessionFirelogPublisher;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "getSessionGenerator", "()Lcom/google/firebase/sessions/SessionGenerator;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getSessionsSettings", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "Builder", "MainModule", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FirebaseSessionsComponent {

    /* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
    @com.google.firebase.sessions.dagger.Component.Builder
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH'J\u0016\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH'¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "", "appContext", "Landroid/content/Context;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "build", "Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "transportFactoryProvider", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Builder {
        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder appContext(android.content.Context appContext);

        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder backgroundDispatcher(@com.google.firebase.annotations.concurrent.Background kotlin.coroutines.CoroutineContext backgroundDispatcher);

        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder blockingDispatcher(@com.google.firebase.annotations.concurrent.Blocking kotlin.coroutines.CoroutineContext blockingDispatcher);

        com.google.firebase.sessions.FirebaseSessionsComponent build();

        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder firebaseApp(com.google.firebase.FirebaseApp firebaseApp);

        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder firebaseInstallationsApi(com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi);

        @com.google.firebase.sessions.dagger.BindsInstance
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder transportFactoryProvider(com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> transportFactoryProvider);
    }

    com.google.firebase.sessions.FirebaseSessions getFirebaseSessions();

    com.google.firebase.sessions.SessionDatastore getSessionDatastore();

    com.google.firebase.sessions.SessionFirelogPublisher getSessionFirelogPublisher();

    com.google.firebase.sessions.SessionGenerator getSessionGenerator();

    com.google.firebase.sessions.settings.SessionsSettings getSessionsSettings();

    /* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule;", "", "eventGDTLoggerInterface", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "impl", "Lcom/google/firebase/sessions/EventGDTLogger;", "sessionDatastore", "Lcom/google/firebase/sessions/SessionDatastore;", "Lcom/google/firebase/sessions/SessionDatastoreImpl;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "sessionLifecycleServiceBinder", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @com.google.firebase.sessions.dagger.Module
    public interface MainModule {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion INSTANCE = com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion.$$INSTANCE;

        @javax.inject.Singleton
        @com.google.firebase.sessions.dagger.Binds
        com.google.firebase.sessions.EventGDTLoggerInterface eventGDTLoggerInterface(com.google.firebase.sessions.EventGDTLogger impl);

        @javax.inject.Singleton
        @com.google.firebase.sessions.dagger.Binds
        com.google.firebase.sessions.SessionDatastore sessionDatastore(com.google.firebase.sessions.SessionDatastoreImpl impl);

        @javax.inject.Singleton
        @com.google.firebase.sessions.dagger.Binds
        com.google.firebase.sessions.SessionFirelogPublisher sessionFirelogPublisher(com.google.firebase.sessions.SessionFirelogPublisherImpl impl);

        @javax.inject.Singleton
        @com.google.firebase.sessions.dagger.Binds
        com.google.firebase.sessions.SessionLifecycleServiceBinder sessionLifecycleServiceBinder(com.google.firebase.sessions.SessionLifecycleServiceBinderImpl impl);

        /* JADX INFO: compiled from: FirebaseSessionsComponent.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule$Companion;", "", "()V", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion $$INSTANCE = new com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion();

            private Companion() {
            }

            @javax.inject.Singleton
            @com.google.firebase.sessions.dagger.Provides
            public final com.google.firebase.sessions.SessionGenerator sessionGenerator() {
                return new com.google.firebase.sessions.SessionGenerator(com.google.firebase.sessions.WallClock.INSTANCE, null, 2, null);
            }
        }
    }
}
