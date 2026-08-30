package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerFirebaseSessionsComponent {
    private DaggerFirebaseSessionsComponent() {
    }

    public static com.google.firebase.sessions.FirebaseSessionsComponent.Builder builder() {
        return new com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder();
    }

    private static final class Builder implements com.google.firebase.sessions.FirebaseSessionsComponent.Builder {
        private android.content.Context appContext;
        private kotlin.coroutines.CoroutineContext backgroundDispatcher;
        private kotlin.coroutines.CoroutineContext blockingDispatcher;
        private com.google.firebase.FirebaseApp firebaseApp;
        private com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi;
        private com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> transportFactoryProvider;

        private Builder() {
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public /* bridge */ /* synthetic */ com.google.firebase.sessions.FirebaseSessionsComponent.Builder transportFactoryProvider(com.google.firebase.inject.Provider provider) {
            return transportFactoryProvider((com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory>) provider);
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder appContext(android.content.Context context) {
            this.appContext = (android.content.Context) com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder backgroundDispatcher(kotlin.coroutines.CoroutineContext coroutineContext) {
            this.backgroundDispatcher = (kotlin.coroutines.CoroutineContext) com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNull(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder blockingDispatcher(kotlin.coroutines.CoroutineContext coroutineContext) {
            this.blockingDispatcher = (kotlin.coroutines.CoroutineContext) com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNull(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder firebaseApp(com.google.firebase.FirebaseApp firebaseApp) {
            this.firebaseApp = (com.google.firebase.FirebaseApp) com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNull(firebaseApp);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder firebaseInstallationsApi(com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
            this.firebaseInstallationsApi = (com.google.firebase.installations.FirebaseInstallationsApi) com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNull(firebaseInstallationsApi);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public com.google.firebase.sessions.DaggerFirebaseSessionsComponent.Builder transportFactoryProvider(com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> provider) {
            this.transportFactoryProvider = (com.google.firebase.inject.Provider) com.google.firebase.sessions.dagger.internal.Preconditions.checkNotNull(provider);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public com.google.firebase.sessions.FirebaseSessionsComponent build() {
            com.google.firebase.sessions.dagger.internal.Preconditions.checkBuilderRequirement(this.appContext, android.content.Context.class);
            com.google.firebase.sessions.dagger.internal.Preconditions.checkBuilderRequirement(this.backgroundDispatcher, kotlin.coroutines.CoroutineContext.class);
            com.google.firebase.sessions.dagger.internal.Preconditions.checkBuilderRequirement(this.blockingDispatcher, kotlin.coroutines.CoroutineContext.class);
            com.google.firebase.sessions.dagger.internal.Preconditions.checkBuilderRequirement(this.firebaseApp, com.google.firebase.FirebaseApp.class);
            com.google.firebase.sessions.dagger.internal.Preconditions.checkBuilderRequirement(this.firebaseInstallationsApi, com.google.firebase.installations.FirebaseInstallationsApi.class);
            com.google.firebase.sessions.dagger.internal.Preconditions.checkBuilderRequirement(this.transportFactoryProvider, com.google.firebase.inject.Provider.class);
            return new com.google.firebase.sessions.DaggerFirebaseSessionsComponent.FirebaseSessionsComponentImpl(this.appContext, this.backgroundDispatcher, this.blockingDispatcher, this.firebaseApp, this.firebaseInstallationsApi, this.transportFactoryProvider);
        }
    }

    private static final class FirebaseSessionsComponentImpl implements com.google.firebase.sessions.FirebaseSessionsComponent {
        private javax.inject.Provider<android.content.Context> appContextProvider;
        private javax.inject.Provider<kotlin.coroutines.CoroutineContext> backgroundDispatcherProvider;
        private javax.inject.Provider<kotlin.coroutines.CoroutineContext> blockingDispatcherProvider;
        private javax.inject.Provider<com.google.firebase.sessions.EventGDTLogger> eventGDTLoggerProvider;
        private javax.inject.Provider<com.google.firebase.FirebaseApp> firebaseAppProvider;
        private javax.inject.Provider<com.google.firebase.installations.FirebaseInstallationsApi> firebaseInstallationsApiProvider;
        private final com.google.firebase.sessions.DaggerFirebaseSessionsComponent.FirebaseSessionsComponentImpl firebaseSessionsComponentImpl;
        private javax.inject.Provider<com.google.firebase.sessions.FirebaseSessions> firebaseSessionsProvider;
        private javax.inject.Provider<com.google.firebase.sessions.SessionDatastoreImpl> sessionDatastoreImplProvider;
        private javax.inject.Provider<com.google.firebase.sessions.SessionFirelogPublisherImpl> sessionFirelogPublisherImplProvider;
        private javax.inject.Provider<com.google.firebase.sessions.SessionGenerator> sessionGeneratorProvider;
        private javax.inject.Provider<com.google.firebase.sessions.SessionLifecycleServiceBinderImpl> sessionLifecycleServiceBinderImplProvider;
        private javax.inject.Provider<com.google.firebase.sessions.settings.SessionsSettings> sessionsSettingsProvider;
        private javax.inject.Provider<com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory>> transportFactoryProvider;

        private FirebaseSessionsComponentImpl(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> provider) {
            this.firebaseSessionsComponentImpl = this;
            initialize(context, coroutineContext, coroutineContext2, firebaseApp, firebaseInstallationsApi, provider);
        }

        private void initialize(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> provider) {
            this.firebaseAppProvider = com.google.firebase.sessions.dagger.internal.InstanceFactory.create(firebaseApp);
            this.blockingDispatcherProvider = com.google.firebase.sessions.dagger.internal.InstanceFactory.create(coroutineContext2);
            this.backgroundDispatcherProvider = com.google.firebase.sessions.dagger.internal.InstanceFactory.create(coroutineContext);
            com.google.firebase.sessions.dagger.internal.Factory factoryCreate = com.google.firebase.sessions.dagger.internal.InstanceFactory.create(firebaseInstallationsApi);
            this.firebaseInstallationsApiProvider = factoryCreate;
            this.sessionsSettingsProvider = com.google.firebase.sessions.dagger.internal.DoubleCheck.provider(com.google.firebase.sessions.settings.SessionsSettings_Factory.create(this.firebaseAppProvider, this.blockingDispatcherProvider, this.backgroundDispatcherProvider, factoryCreate));
            com.google.firebase.sessions.dagger.internal.Factory factoryCreate2 = com.google.firebase.sessions.dagger.internal.InstanceFactory.create(context);
            this.appContextProvider = factoryCreate2;
            javax.inject.Provider<com.google.firebase.sessions.SessionLifecycleServiceBinderImpl> provider2 = com.google.firebase.sessions.dagger.internal.DoubleCheck.provider(com.google.firebase.sessions.SessionLifecycleServiceBinderImpl_Factory.create(factoryCreate2));
            this.sessionLifecycleServiceBinderImplProvider = provider2;
            this.firebaseSessionsProvider = com.google.firebase.sessions.dagger.internal.DoubleCheck.provider(com.google.firebase.sessions.FirebaseSessions_Factory.create(this.firebaseAppProvider, this.sessionsSettingsProvider, this.backgroundDispatcherProvider, provider2));
            this.sessionDatastoreImplProvider = com.google.firebase.sessions.dagger.internal.DoubleCheck.provider(com.google.firebase.sessions.SessionDatastoreImpl_Factory.create(this.appContextProvider, this.backgroundDispatcherProvider));
            com.google.firebase.sessions.dagger.internal.Factory factoryCreate3 = com.google.firebase.sessions.dagger.internal.InstanceFactory.create(provider);
            this.transportFactoryProvider = factoryCreate3;
            javax.inject.Provider<com.google.firebase.sessions.EventGDTLogger> provider3 = com.google.firebase.sessions.dagger.internal.DoubleCheck.provider(com.google.firebase.sessions.EventGDTLogger_Factory.create(factoryCreate3));
            this.eventGDTLoggerProvider = provider3;
            this.sessionFirelogPublisherImplProvider = com.google.firebase.sessions.dagger.internal.DoubleCheck.provider(com.google.firebase.sessions.SessionFirelogPublisherImpl_Factory.create(this.firebaseAppProvider, this.firebaseInstallationsApiProvider, this.sessionsSettingsProvider, provider3, this.backgroundDispatcherProvider));
            this.sessionGeneratorProvider = com.google.firebase.sessions.dagger.internal.DoubleCheck.provider(com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionGeneratorFactory.create());
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public com.google.firebase.sessions.FirebaseSessions getFirebaseSessions() {
            return this.firebaseSessionsProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public com.google.firebase.sessions.SessionDatastore getSessionDatastore() {
            return this.sessionDatastoreImplProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public com.google.firebase.sessions.SessionFirelogPublisher getSessionFirelogPublisher() {
            return this.sessionFirelogPublisherImplProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public com.google.firebase.sessions.SessionGenerator getSessionGenerator() {
            return this.sessionGeneratorProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public com.google.firebase.sessions.settings.SessionsSettings getSessionsSettings() {
            return this.sessionsSettingsProvider.get();
        }
    }
}
