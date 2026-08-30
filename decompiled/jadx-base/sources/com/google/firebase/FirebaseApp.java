package com.google.firebase;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseApp {
    public static final java.lang.String DEFAULT_APP_NAME = "[DEFAULT]";
    private static final java.lang.String LOG_TAG = "FirebaseApp";
    private final android.content.Context applicationContext;
    private final com.google.firebase.components.ComponentRuntime componentRuntime;
    private final com.google.firebase.components.Lazy<com.google.firebase.internal.DataCollectionConfigStorage> dataCollectionConfigStorage;
    private final com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.DefaultHeartBeatController> defaultHeartBeatController;
    private final java.lang.String name;
    private final com.google.firebase.FirebaseOptions options;
    private static final java.lang.Object LOCK = new java.lang.Object();
    static final java.util.Map<java.lang.String, com.google.firebase.FirebaseApp> INSTANCES = new androidx.collection.ArrayMap();
    private final java.util.concurrent.atomic.AtomicBoolean automaticResourceManagementEnabled = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean deleted = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.List<com.google.firebase.FirebaseApp.BackgroundStateChangeListener> backgroundStateChangeListeners = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.List<com.google.firebase.FirebaseAppLifecycleListener> lifecycleListeners = new java.util.concurrent.CopyOnWriteArrayList();

    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z);
    }

    public android.content.Context getApplicationContext() {
        checkNotDeleted();
        return this.applicationContext;
    }

    public java.lang.String getName() {
        checkNotDeleted();
        return this.name;
    }

    public com.google.firebase.FirebaseOptions getOptions() {
        checkNotDeleted();
        return this.options;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.firebase.FirebaseApp) {
            return this.name.equals(((com.google.firebase.FirebaseApp) obj).getName());
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.name).add("options", this.options).toString();
    }

    public static java.util.List<com.google.firebase.FirebaseApp> getApps(android.content.Context context) {
        java.util.ArrayList arrayList;
        synchronized (LOCK) {
            arrayList = new java.util.ArrayList(INSTANCES.values());
        }
        return arrayList;
    }

    public static com.google.firebase.FirebaseApp getInstance() {
        com.google.firebase.FirebaseApp firebaseApp;
        synchronized (LOCK) {
            firebaseApp = INSTANCES.get(DEFAULT_APP_NAME);
            if (firebaseApp == null) {
                throw new java.lang.IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
        }
        return firebaseApp;
    }

    public static com.google.firebase.FirebaseApp getInstance(java.lang.String str) {
        com.google.firebase.FirebaseApp firebaseApp;
        synchronized (LOCK) {
            firebaseApp = INSTANCES.get(normalize(str));
            if (firebaseApp != null) {
                firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
            } else {
                java.util.List<java.lang.String> allAppNames = getAllAppNames();
                throw new java.lang.IllegalStateException(java.lang.String.format("FirebaseApp with name %s doesn't exist. %s", str, allAppNames.isEmpty() ? "" : "Available app names: " + android.text.TextUtils.join(", ", allAppNames)));
            }
        }
        return firebaseApp;
    }

    public static com.google.firebase.FirebaseApp initializeApp(android.content.Context context) {
        synchronized (LOCK) {
            if (INSTANCES.containsKey(DEFAULT_APP_NAME)) {
                return getInstance();
            }
            com.google.firebase.FirebaseOptions firebaseOptionsFromResource = com.google.firebase.FirebaseOptions.fromResource(context);
            if (firebaseOptionsFromResource == null) {
                android.util.Log.w(LOG_TAG, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return initializeApp(context, firebaseOptionsFromResource);
        }
    }

    public static com.google.firebase.FirebaseApp initializeApp(android.content.Context context, com.google.firebase.FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, DEFAULT_APP_NAME);
    }

    public static com.google.firebase.FirebaseApp initializeApp(android.content.Context context, com.google.firebase.FirebaseOptions firebaseOptions, java.lang.String str) {
        com.google.firebase.FirebaseApp firebaseApp;
        com.google.firebase.FirebaseApp.GlobalBackgroundStateListener.ensureBackgroundStateListenerRegistered(context);
        java.lang.String strNormalize = normalize(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (LOCK) {
            java.util.Map<java.lang.String, com.google.firebase.FirebaseApp> map = INSTANCES;
            com.google.android.gms.common.internal.Preconditions.checkState(!map.containsKey(strNormalize), "FirebaseApp name " + strNormalize + " already exists!");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new com.google.firebase.FirebaseApp(context, strNormalize, firebaseOptions);
            map.put(strNormalize, firebaseApp);
        }
        firebaseApp.initializeAllApis();
        return firebaseApp;
    }

    public void delete() {
        if (this.deleted.compareAndSet(false, true)) {
            synchronized (LOCK) {
                INSTANCES.remove(this.name);
            }
            notifyOnAppDeleted();
        }
    }

    public <T> T get(java.lang.Class<T> cls) {
        checkNotDeleted();
        return (T) this.componentRuntime.get(cls);
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.compareAndSet(!z, z)) {
            boolean zIsInBackground = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().isInBackground();
            if (z && zIsInBackground) {
                notifyBackgroundStateChangeListeners(true);
            } else {
                if (z || !zIsInBackground) {
                    return;
                }
                notifyBackgroundStateChangeListeners(false);
            }
        }
    }

    public boolean isDataCollectionDefaultEnabled() {
        checkNotDeleted();
        return this.dataCollectionConfigStorage.get().isEnabled();
    }

    public void setDataCollectionDefaultEnabled(java.lang.Boolean bool) {
        checkNotDeleted();
        this.dataCollectionConfigStorage.get().setEnabled(bool);
    }

    @java.lang.Deprecated
    public void setDataCollectionDefaultEnabled(boolean z) {
        setDataCollectionDefaultEnabled(java.lang.Boolean.valueOf(z));
    }

    protected FirebaseApp(final android.content.Context context, java.lang.String str, com.google.firebase.FirebaseOptions firebaseOptions) {
        this.applicationContext = (android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        this.name = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.options = (com.google.firebase.FirebaseOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(firebaseOptions);
        com.google.firebase.StartupTime startupTime = com.google.firebase.provider.FirebaseInitProvider.getStartupTime();
        com.google.firebase.tracing.FirebaseTrace.pushTrace("Firebase");
        com.google.firebase.tracing.FirebaseTrace.pushTrace("ComponentDiscovery");
        java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> listDiscoverLazy = com.google.firebase.components.ComponentDiscovery.forContext(context, com.google.firebase.components.ComponentDiscoveryService.class).discoverLazy();
        com.google.firebase.tracing.FirebaseTrace.popTrace();
        com.google.firebase.tracing.FirebaseTrace.pushTrace("Runtime");
        com.google.firebase.components.ComponentRuntime.Builder processor = com.google.firebase.components.ComponentRuntime.builder(com.google.firebase.concurrent.UiExecutor.INSTANCE).addLazyComponentRegistrars(listDiscoverLazy).addComponentRegistrar(new com.google.firebase.FirebaseCommonRegistrar()).addComponentRegistrar(new com.google.firebase.concurrent.ExecutorsRegistrar()).addComponent(com.google.firebase.components.Component.of(context, (java.lang.Class<android.content.Context>) android.content.Context.class, (java.lang.Class<? super android.content.Context>[]) new java.lang.Class[0])).addComponent(com.google.firebase.components.Component.of(this, (java.lang.Class<com.google.firebase.FirebaseApp>) com.google.firebase.FirebaseApp.class, (java.lang.Class<? super com.google.firebase.FirebaseApp>[]) new java.lang.Class[0])).addComponent(com.google.firebase.components.Component.of(firebaseOptions, (java.lang.Class<com.google.firebase.FirebaseOptions>) com.google.firebase.FirebaseOptions.class, (java.lang.Class<? super com.google.firebase.FirebaseOptions>[]) new java.lang.Class[0])).setProcessor(new com.google.firebase.tracing.ComponentMonitor());
        if (androidx.core.os.UserManagerCompat.isUserUnlocked(context) && com.google.firebase.provider.FirebaseInitProvider.isCurrentlyInitializing()) {
            processor.addComponent(com.google.firebase.components.Component.of(startupTime, (java.lang.Class<com.google.firebase.StartupTime>) com.google.firebase.StartupTime.class, (java.lang.Class<? super com.google.firebase.StartupTime>[]) new java.lang.Class[0]));
        }
        com.google.firebase.components.ComponentRuntime componentRuntimeBuild = processor.build();
        this.componentRuntime = componentRuntimeBuild;
        com.google.firebase.tracing.FirebaseTrace.popTrace();
        this.dataCollectionConfigStorage = new com.google.firebase.components.Lazy<>(new com.google.firebase.inject.Provider() { // from class: com.google.firebase.FirebaseApp$$ExternalSyntheticLambda0
            @Override // com.google.firebase.inject.Provider
            public final java.lang.Object get() {
                return this.f$0.m814lambda$new$0$comgooglefirebaseFirebaseApp(context);
            }
        });
        this.defaultHeartBeatController = componentRuntimeBuild.getProvider(com.google.firebase.heartbeatinfo.DefaultHeartBeatController.class);
        addBackgroundStateChangeListener(new com.google.firebase.FirebaseApp.BackgroundStateChangeListener() { // from class: com.google.firebase.FirebaseApp$$ExternalSyntheticLambda1
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z) {
                this.f$0.m815lambda$new$1$comgooglefirebaseFirebaseApp(z);
            }
        });
        com.google.firebase.tracing.FirebaseTrace.popTrace();
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-firebase-FirebaseApp, reason: not valid java name */
    /* synthetic */ com.google.firebase.internal.DataCollectionConfigStorage m814lambda$new$0$comgooglefirebaseFirebaseApp(android.content.Context context) {
        return new com.google.firebase.internal.DataCollectionConfigStorage(context, getPersistenceKey(), (com.google.firebase.events.Publisher) this.componentRuntime.get(com.google.firebase.events.Publisher.class));
    }

    /* JADX INFO: renamed from: lambda$new$1$com-google-firebase-FirebaseApp, reason: not valid java name */
    /* synthetic */ void m815lambda$new$1$comgooglefirebaseFirebaseApp(boolean z) {
        if (z) {
            return;
        }
        this.defaultHeartBeatController.get().registerHeartBeat();
    }

    private void checkNotDeleted() {
        com.google.android.gms.common.internal.Preconditions.checkState(!this.deleted.get(), "FirebaseApp was deleted");
    }

    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    void initializeAllComponents() {
        this.componentRuntime.initializeAllComponentsForTests();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBackgroundStateChangeListeners(boolean z) {
        android.util.Log.d(LOG_TAG, "Notifying background state change listeners.");
        java.util.Iterator<com.google.firebase.FirebaseApp.BackgroundStateChangeListener> it = this.backgroundStateChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().onBackgroundStateChanged(z);
        }
    }

    public void addBackgroundStateChangeListener(com.google.firebase.FirebaseApp.BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.get() && com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.backgroundStateChangeListeners.add(backgroundStateChangeListener);
    }

    public void removeBackgroundStateChangeListener(com.google.firebase.FirebaseApp.BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        this.backgroundStateChangeListeners.remove(backgroundStateChangeListener);
    }

    public java.lang.String getPersistenceKey() {
        return com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(java.nio.charset.Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(java.nio.charset.Charset.defaultCharset()));
    }

    public void addLifecycleEventListener(com.google.firebase.FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.lifecycleListeners.add(firebaseAppLifecycleListener);
    }

    public void removeLifecycleEventListener(com.google.firebase.FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.lifecycleListeners.remove(firebaseAppLifecycleListener);
    }

    private void notifyOnAppDeleted() {
        java.util.Iterator<com.google.firebase.FirebaseAppLifecycleListener> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onDeleted(this.name, this.options);
        }
    }

    public static void clearInstancesForTest() {
        synchronized (LOCK) {
            INSTANCES.clear();
        }
    }

    public static java.lang.String getPersistenceKey(java.lang.String str, com.google.firebase.FirebaseOptions firebaseOptions) {
        return com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(str.getBytes(java.nio.charset.Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(firebaseOptions.getApplicationId().getBytes(java.nio.charset.Charset.defaultCharset()));
    }

    private static java.util.List<java.lang.String> getAllAppNames() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (LOCK) {
            java.util.Iterator<com.google.firebase.FirebaseApp> it = INSTANCES.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getName());
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeAllApis() {
        if (!androidx.core.os.UserManagerCompat.isUserUnlocked(this.applicationContext)) {
            android.util.Log.i(LOG_TAG, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + getName());
            com.google.firebase.FirebaseApp.UserUnlockReceiver.ensureReceiverRegistered(this.applicationContext);
        } else {
            android.util.Log.i(LOG_TAG, "Device unlocked: initializing all Firebase APIs for app " + getName());
            this.componentRuntime.initializeEagerComponents(isDefaultApp());
            this.defaultHeartBeatController.get().registerHeartBeat();
        }
    }

    private static java.lang.String normalize(java.lang.String str) {
        return str.trim();
    }

    private static class UserUnlockReceiver extends android.content.BroadcastReceiver {
        private static java.util.concurrent.atomic.AtomicReference<com.google.firebase.FirebaseApp.UserUnlockReceiver> INSTANCE = new java.util.concurrent.atomic.AtomicReference<>();
        private final android.content.Context applicationContext;

        public UserUnlockReceiver(android.content.Context context) {
            this.applicationContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureReceiverRegistered(android.content.Context context) {
            if (INSTANCE.get() == null) {
                com.google.firebase.FirebaseApp.UserUnlockReceiver userUnlockReceiver = new com.google.firebase.FirebaseApp.UserUnlockReceiver(context);
                if (kotlin.UByte$$ExternalSyntheticBackport0.m(INSTANCE, null, userUnlockReceiver)) {
                    context.registerReceiver(userUnlockReceiver, new android.content.IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            synchronized (com.google.firebase.FirebaseApp.LOCK) {
                java.util.Iterator<com.google.firebase.FirebaseApp> it = com.google.firebase.FirebaseApp.INSTANCES.values().iterator();
                while (it.hasNext()) {
                    it.next().initializeAllApis();
                }
            }
            unregister();
        }

        public void unregister() {
            this.applicationContext.unregisterReceiver(this);
        }
    }

    private static class GlobalBackgroundStateListener implements com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener {
        private static java.util.concurrent.atomic.AtomicReference<com.google.firebase.FirebaseApp.GlobalBackgroundStateListener> INSTANCE = new java.util.concurrent.atomic.AtomicReference<>();

        private GlobalBackgroundStateListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureBackgroundStateListenerRegistered(android.content.Context context) {
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof android.app.Application)) {
                android.app.Application application = (android.app.Application) context.getApplicationContext();
                if (INSTANCE.get() == null) {
                    com.google.firebase.FirebaseApp.GlobalBackgroundStateListener globalBackgroundStateListener = new com.google.firebase.FirebaseApp.GlobalBackgroundStateListener();
                    if (kotlin.UByte$$ExternalSyntheticBackport0.m(INSTANCE, null, globalBackgroundStateListener)) {
                        com.google.android.gms.common.api.internal.BackgroundDetector.initialize(application);
                        com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().addListener(globalBackgroundStateListener);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized (com.google.firebase.FirebaseApp.LOCK) {
                for (com.google.firebase.FirebaseApp firebaseApp : new java.util.ArrayList(com.google.firebase.FirebaseApp.INSTANCES.values())) {
                    if (firebaseApp.automaticResourceManagementEnabled.get()) {
                        firebaseApp.notifyBackgroundStateChangeListeners(z);
                    }
                }
            }
        }
    }
}
