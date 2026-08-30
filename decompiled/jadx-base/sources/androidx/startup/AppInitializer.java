package androidx.startup;

/* JADX INFO: loaded from: classes3.dex */
public final class AppInitializer {
    private static final java.lang.String SECTION_NAME = "Startup";
    private static volatile androidx.startup.AppInitializer sInstance;
    private static final java.lang.Object sLock = new java.lang.Object();
    final android.content.Context mContext;
    final java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> mDiscovered = new java.util.HashSet();
    final java.util.Map<java.lang.Class<?>, java.lang.Object> mInitialized = new java.util.HashMap();

    AppInitializer(android.content.Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static androidx.startup.AppInitializer getInstance(android.content.Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new androidx.startup.AppInitializer(context);
                }
            }
        }
        return sInstance;
    }

    static void setDelegate(androidx.startup.AppInitializer appInitializer) {
        synchronized (sLock) {
            sInstance = appInitializer;
        }
    }

    public <T> T initializeComponent(java.lang.Class<? extends androidx.startup.Initializer<T>> cls) {
        return (T) doInitialize(cls);
    }

    public boolean isEagerlyInitialized(java.lang.Class<? extends androidx.startup.Initializer<?>> cls) {
        return this.mDiscovered.contains(cls);
    }

    <T> T doInitialize(java.lang.Class<? extends androidx.startup.Initializer<?>> cls) {
        T t;
        synchronized (sLock) {
            t = (T) this.mInitialized.get(cls);
            if (t == null) {
                t = (T) doInitialize(cls, new java.util.HashSet());
            }
        }
        return t;
    }

    private <T> T doInitialize(java.lang.Class<? extends androidx.startup.Initializer<?>> cls, java.util.Set<java.lang.Class<?>> set) {
        T t;
        if (androidx.tracing.Trace.isEnabled()) {
            try {
                androidx.tracing.Trace.beginSection(cls.getSimpleName());
            } catch (java.lang.Throwable th) {
                androidx.tracing.Trace.endSection();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (!this.mInitialized.containsKey(cls)) {
            set.add(cls);
            try {
                androidx.startup.Initializer<?> initializerNewInstance = cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> listDependencies = initializerNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (java.lang.Class<? extends androidx.startup.Initializer<?>> cls2 : listDependencies) {
                        if (!this.mInitialized.containsKey(cls2)) {
                            doInitialize(cls2, set);
                        }
                    }
                }
                t = (T) initializerNewInstance.create(this.mContext);
                set.remove(cls);
                this.mInitialized.put(cls, t);
            } catch (java.lang.Throwable th2) {
                throw new androidx.startup.StartupException(th2);
            }
        } else {
            t = (T) this.mInitialized.get(cls);
        }
        androidx.tracing.Trace.endSection();
        return t;
    }

    void discoverAndInitialize() {
        try {
            try {
                androidx.tracing.Trace.beginSection(SECTION_NAME);
                discoverAndInitialize(this.mContext.getPackageManager().getProviderInfo(new android.content.ComponentName(this.mContext.getPackageName(), androidx.startup.InitializationProvider.class.getName()), 128).metaData);
                androidx.tracing.Trace.endSection();
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                throw new androidx.startup.StartupException(e);
            }
        } catch (java.lang.Throwable th) {
            androidx.tracing.Trace.endSection();
            throw th;
        }
    }

    void discoverAndInitialize(android.os.Bundle bundle) {
        java.lang.String string = this.mContext.getString(androidx.startup.R.string.androidx_startup);
        if (bundle != null) {
            try {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (java.lang.String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        java.lang.Class<?> cls = java.lang.Class.forName(str);
                        if (androidx.startup.Initializer.class.isAssignableFrom(cls)) {
                            this.mDiscovered.add((java.lang.Class<? extends androidx.startup.Initializer<?>>) cls);
                        }
                    }
                }
                java.util.Iterator<java.lang.Class<? extends androidx.startup.Initializer<?>>> it = this.mDiscovered.iterator();
                while (it.hasNext()) {
                    doInitialize(it.next(), hashSet);
                }
            } catch (java.lang.ClassNotFoundException e) {
                throw new androidx.startup.StartupException(e);
            }
        }
    }
}
