package com.google.firebase.sessions;

/* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "", "kotlin.jvm.PlatformType", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion Companion = new com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String LIBRARY_NAME = "fire-sessions";

    @java.lang.Deprecated
    public static final java.lang.String TAG = "FirebaseSessions";
    private static final com.google.firebase.components.Qualified<android.content.Context> appContext;
    private static final com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> backgroundDispatcher;
    private static final com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> blockingDispatcher;
    private static final com.google.firebase.components.Qualified<com.google.firebase.FirebaseApp> firebaseApp;
    private static final com.google.firebase.components.Qualified<com.google.firebase.installations.FirebaseInstallationsApi> firebaseInstallationsApi;
    private static final com.google.firebase.components.Qualified<com.google.firebase.sessions.FirebaseSessionsComponent> firebaseSessionsComponent;
    private static final com.google.firebase.components.Qualified<com.google.android.datatransport.TransportFactory> transportFactory;

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<? extends java.lang.Object>> getComponents() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.google.firebase.components.Component[]{com.google.firebase.components.Component.builder(com.google.firebase.sessions.FirebaseSessions.class).name(LIBRARY_NAME).add(com.google.firebase.components.Dependency.required(firebaseSessionsComponent)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.sessions.FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
            }
        }).eagerInDefaultApp().build(), com.google.firebase.components.Component.builder(com.google.firebase.sessions.FirebaseSessionsComponent.class).name("fire-sessions-component").add(com.google.firebase.components.Dependency.required(appContext)).add(com.google.firebase.components.Dependency.required(backgroundDispatcher)).add(com.google.firebase.components.Dependency.required(blockingDispatcher)).add(com.google.firebase.components.Dependency.required(firebaseApp)).add(com.google.firebase.components.Dependency.required(firebaseInstallationsApi)).add(com.google.firebase.components.Dependency.requiredProvider(transportFactory)).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda1
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.sessions.FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
            }
        }).build(), com.google.firebase.platforminfo.LibraryVersionComponent.create(LIBRARY_NAME, com.google.firebase.sessions.BuildConfig.VERSION_NAME)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.FirebaseSessions getComponents$lambda$0(com.google.firebase.components.ComponentContainer componentContainer) {
        return ((com.google.firebase.sessions.FirebaseSessionsComponent) componentContainer.get(firebaseSessionsComponent)).getFirebaseSessions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.FirebaseSessionsComponent getComponents$lambda$1(com.google.firebase.components.ComponentContainer componentContainer) {
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder builder = com.google.firebase.sessions.DaggerFirebaseSessionsComponent.builder();
        java.lang.Object obj = componentContainer.get(appContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "container[appContext]");
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder builderAppContext = builder.appContext((android.content.Context) obj);
        java.lang.Object obj2 = componentContainer.get(backgroundDispatcher);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "container[backgroundDispatcher]");
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder builderBackgroundDispatcher = builderAppContext.backgroundDispatcher((kotlin.coroutines.CoroutineContext) obj2);
        java.lang.Object obj3 = componentContainer.get(blockingDispatcher);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "container[blockingDispatcher]");
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder builderBlockingDispatcher = builderBackgroundDispatcher.blockingDispatcher((kotlin.coroutines.CoroutineContext) obj3);
        java.lang.Object obj4 = componentContainer.get(firebaseApp);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj4, "container[firebaseApp]");
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder builderFirebaseApp = builderBlockingDispatcher.firebaseApp((com.google.firebase.FirebaseApp) obj4);
        java.lang.Object obj5 = componentContainer.get(firebaseInstallationsApi);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj5, "container[firebaseInstallationsApi]");
        com.google.firebase.sessions.FirebaseSessionsComponent.Builder builderFirebaseInstallationsApi = builderFirebaseApp.firebaseInstallationsApi((com.google.firebase.installations.FirebaseInstallationsApi) obj5);
        com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> provider = componentContainer.getProvider(transportFactory);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(provider, "container.getProvider(transportFactory)");
        return builderFirebaseInstallationsApi.transportFactoryProvider(provider).build();
    }

    /* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00120\u00120\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00150\u00150\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u001f\u0010\u0017\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00180\u00180\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000bR\u001f\u0010\u001a\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u001b0\u001b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$Companion;", "", "()V", "LIBRARY_NAME", "", "TAG", "appContext", "Lcom/google/firebase/components/Qualified;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getAppContext", "()Lcom/google/firebase/components/Qualified;", "backgroundDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBackgroundDispatcher", "blockingDispatcher", "getBlockingDispatcher", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "getFirebaseApp", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "getFirebaseInstallationsApi", "firebaseSessionsComponent", "Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "getFirebaseSessionsComponent", "transportFactory", "Lcom/google/android/datatransport/TransportFactory;", "getTransportFactory", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.google.firebase.components.Qualified<android.content.Context> getAppContext() {
            return com.google.firebase.sessions.FirebaseSessionsRegistrar.appContext;
        }

        public final com.google.firebase.components.Qualified<com.google.firebase.FirebaseApp> getFirebaseApp() {
            return com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp;
        }

        public final com.google.firebase.components.Qualified<com.google.firebase.installations.FirebaseInstallationsApi> getFirebaseInstallationsApi() {
            return com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseInstallationsApi;
        }

        public final com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> getBackgroundDispatcher() {
            return com.google.firebase.sessions.FirebaseSessionsRegistrar.backgroundDispatcher;
        }

        public final com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> getBlockingDispatcher() {
            return com.google.firebase.sessions.FirebaseSessionsRegistrar.blockingDispatcher;
        }

        public final com.google.firebase.components.Qualified<com.google.android.datatransport.TransportFactory> getTransportFactory() {
            return com.google.firebase.sessions.FirebaseSessionsRegistrar.transportFactory;
        }

        public final com.google.firebase.components.Qualified<com.google.firebase.sessions.FirebaseSessionsComponent> getFirebaseSessionsComponent() {
            return com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseSessionsComponent;
        }

        /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsRegistrar$Companion$1, reason: invalid class name */
        /* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function4<java.lang.String, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences>, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>>, kotlinx.coroutines.CoroutineScope, kotlin.properties.ReadOnlyProperty<? super android.content.Context, ? extends androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>> {
            public static final com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion.AnonymousClass1 INSTANCE = new com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion.AnonymousClass1();

            AnonymousClass1() {
                super(4, androidx.datastore.preferences.PreferenceDataStoreDelegateKt.class, "preferencesDataStore", "preferencesDataStore(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)Lkotlin/properties/ReadOnlyProperty;", 1);
            }

            @Override // kotlin.jvm.functions.Function4
            public final kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> invoke(java.lang.String p0, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> replaceFileCorruptionHandler, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>> p2, kotlinx.coroutines.CoroutineScope p3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "p2");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "p3");
                return androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore(p0, replaceFileCorruptionHandler, p2, p3);
            }
        }
    }

    static {
        com.google.firebase.components.Qualified<android.content.Context> qualifiedUnqualified = com.google.firebase.components.Qualified.unqualified(android.content.Context.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified, "unqualified(Context::class.java)");
        appContext = qualifiedUnqualified;
        com.google.firebase.components.Qualified<com.google.firebase.FirebaseApp> qualifiedUnqualified2 = com.google.firebase.components.Qualified.unqualified(com.google.firebase.FirebaseApp.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified2, "unqualified(FirebaseApp::class.java)");
        firebaseApp = qualifiedUnqualified2;
        com.google.firebase.components.Qualified<com.google.firebase.installations.FirebaseInstallationsApi> qualifiedUnqualified3 = com.google.firebase.components.Qualified.unqualified(com.google.firebase.installations.FirebaseInstallationsApi.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified3, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = qualifiedUnqualified3;
        com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> qualified = com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Background.class, kotlinx.coroutines.CoroutineDispatcher.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qualified, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = qualified;
        com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> qualified2 = com.google.firebase.components.Qualified.qualified(com.google.firebase.annotations.concurrent.Blocking.class, kotlinx.coroutines.CoroutineDispatcher.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qualified2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = qualified2;
        com.google.firebase.components.Qualified<com.google.android.datatransport.TransportFactory> qualifiedUnqualified4 = com.google.firebase.components.Qualified.unqualified(com.google.android.datatransport.TransportFactory.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified4, "unqualified(TransportFactory::class.java)");
        transportFactory = qualifiedUnqualified4;
        com.google.firebase.components.Qualified<com.google.firebase.sessions.FirebaseSessionsComponent> qualifiedUnqualified5 = com.google.firebase.components.Qualified.unqualified(com.google.firebase.sessions.FirebaseSessionsComponent.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qualifiedUnqualified5, "unqualified(FirebaseSessionsComponent::class.java)");
        firebaseSessionsComponent = qualifiedUnqualified5;
        try {
            com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion.AnonymousClass1.INSTANCE.getClass();
        } catch (java.lang.NoClassDefFoundError unused) {
            android.util.Log.w(TAG, "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }
}
