package com.facebook.ads.internal.dynamicloading;

/* JADX INFO: loaded from: classes4.dex */
public class DynamicLoaderFactory {
    private static final java.lang.String AUDIENCE_NETWORK_CODE_PATH = "audience_network";
    public static final java.lang.String AUDIENCE_NETWORK_DEX = "audience_network.dex";
    private static final java.lang.String CODE_CACHE_DIR = "code_cache";
    static final java.lang.String DEX_LOADING_ERROR_MESSAGE = "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.";
    private static final int DEX_LOAD_RETRY_COUNT = 3;
    private static final int DEX_LOAD_RETRY_DELAY_MS = 200;
    private static final java.lang.String OPTIMIZED_DEX_PATH = "optimized";
    private static boolean sFallbackMode;
    private static final java.lang.String DYNAMIC_LOADING_BUILD_TYPE = "releaseDL";
    public static final boolean LOAD_FROM_ASSETS = DYNAMIC_LOADING_BUILD_TYPE.equals(com.facebook.ads.BuildConfig.BUILD_TYPE);
    private static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.internal.dynamicloading.DynamicLoader> sDynamicLoader = new java.util.concurrent.atomic.AtomicReference<>();
    private static final java.util.concurrent.atomic.AtomicBoolean sInitializing = new java.util.concurrent.atomic.AtomicBoolean();
    private static boolean sUseLegacyClassLoader = true;

    public interface RemoteClassLoaderFactory {
        java.lang.ClassLoader create(android.content.Context context);
    }

    public static synchronized com.facebook.ads.internal.dynamicloading.DynamicLoader makeLoaderUnsafe() {
        java.util.concurrent.atomic.AtomicReference<com.facebook.ads.internal.dynamicloading.DynamicLoader> atomicReference = sDynamicLoader;
        if (atomicReference.get() == null) {
            android.content.Context applicationContextViaReflection = getApplicationContextViaReflection();
            if (applicationContextViaReflection != null) {
                return makeLoader(applicationContextViaReflection, true);
            }
            throw new java.lang.RuntimeException("You must call AudienceNetworkAds.buildInitSettings(Context).initialize() before you can use Audience Network SDK.");
        }
        return atomicReference.get();
    }

    public static void initialize(final android.content.Context context, final com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper, final com.facebook.ads.AudienceNetworkAds.InitListener initListener, final boolean z) {
        if (z || !sInitializing.getAndSet(true)) {
            new java.lang.Thread(new java.lang.Runnable() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.1
                @Override // java.lang.Runnable
                public void run() {
                    java.lang.Throwable th;
                    com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoader;
                    com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener.registerActivityCallbacks(context);
                    synchronized (com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.class) {
                        com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoaderDoMakeLoader = null;
                        th = null;
                        for (int i = 0; i < 3; i++) {
                            try {
                                dynamicLoaderDoMakeLoader = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.doMakeLoader(context, false);
                                break;
                            } catch (java.lang.Throwable th2) {
                                if (i == 2) {
                                    if (!z) {
                                        com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.reportDexLoadingIssue(context, com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.createErrorMessage(th2), 0.1d);
                                        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.setFallbackMode(true);
                                    }
                                    th = th2;
                                } else {
                                    android.os.SystemClock.sleep(200L);
                                }
                            }
                        }
                        dynamicLoader = dynamicLoaderDoMakeLoader;
                    }
                    com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.doCallInitialize(context, dynamicLoader, th, z, multithreadedBundleWrapper, initListener);
                    com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.sInitializing.set(false);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doCallInitialize(android.content.Context context, com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoader, final java.lang.Throwable th, boolean z, com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper, final com.facebook.ads.AudienceNetworkAds.InitListener initListener) {
        if (th != null) {
            if (initListener != null) {
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.2
                    @Override // java.lang.Runnable
                    public void run() {
                        initListener.onInitialized(com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.createErrorInitResult(th));
                    }
                }, 100L);
                return;
            } else {
                android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th);
                return;
            }
        }
        if (dynamicLoader != null) {
            if (z) {
                dynamicLoader.createAudienceNetworkAdsApi().onContentProviderCreated(context);
            } else {
                dynamicLoader.createAudienceNetworkAdsApi().initialize(context, multithreadedBundleWrapper, initListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.ads.AudienceNetworkAds.InitResult createErrorInitResult(final java.lang.Throwable th) {
        return new com.facebook.ads.AudienceNetworkAds.InitResult() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.3
            @Override // com.facebook.ads.AudienceNetworkAds.InitResult
            public boolean isSuccess() {
                return false;
            }

            @Override // com.facebook.ads.AudienceNetworkAds.InitResult
            public java.lang.String getMessage() {
                return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.createErrorMessage(th);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String createErrorMessage(java.lang.Throwable th) {
        return "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.\n" + stackTraceToString(th);
    }

    public static synchronized com.facebook.ads.internal.dynamicloading.DynamicLoader makeLoader(android.content.Context context) {
        return makeLoader(context, true);
    }

    public static synchronized com.facebook.ads.internal.dynamicloading.DynamicLoader makeLoader(android.content.Context context, boolean z) {
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(context, "Context can not be null.");
        try {
        } catch (java.lang.Throwable th) {
            android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th);
            com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.reportDexLoadingIssue(context, createErrorMessage(th), 0.1d);
            com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoaderMakeFallbackLoader = com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.makeFallbackLoader();
            sDynamicLoader.set(dynamicLoaderMakeFallbackLoader);
            sFallbackMode = true;
            return dynamicLoaderMakeFallbackLoader;
        }
        return doMakeLoader(context, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.ads.internal.dynamicloading.DynamicLoader doMakeLoader(android.content.Context context, boolean z) throws java.lang.Exception {
        java.util.concurrent.atomic.AtomicReference<com.facebook.ads.internal.dynamicloading.DynamicLoader> atomicReference = sDynamicLoader;
        com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoader = atomicReference.get();
        if (dynamicLoader == null) {
            if (!LOAD_FROM_ASSETS) {
                dynamicLoader = (com.facebook.ads.internal.dynamicloading.DynamicLoader) java.lang.Class.forName("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
            } else {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                dynamicLoader = (com.facebook.ads.internal.dynamicloading.DynamicLoader) makeAdsSdkClassLoader(context.getApplicationContext()).loadClass("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
                android.util.Log.d(com.facebook.ads.AudienceNetworkAds.TAG, "SDK dex loading time: " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
            }
            if (z) {
                dynamicLoader.maybeInitInternally(context);
            }
            atomicReference.set(dynamicLoader);
        }
        return dynamicLoader;
    }

    public static synchronized void setFallbackMode(boolean z) {
        try {
            if (z) {
                sDynamicLoader.set(com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.makeFallbackLoader());
                sFallbackMode = true;
            } else {
                sDynamicLoader.set(null);
                sFallbackMode = false;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public static void setUseLegacyClassLoader(boolean z) {
        sUseLegacyClassLoader = z;
    }

    public static synchronized boolean isFallbackMode() {
        return sFallbackMode;
    }

    public static com.facebook.ads.internal.dynamicloading.DynamicLoader getDynamicLoader() {
        return sDynamicLoader.get();
    }

    private static dalvik.system.DexClassLoader makeLegacyAdsSdkClassLoader(android.content.Context context) throws java.lang.Exception {
        java.lang.String str = context.getFilesDir().getPath() + java.io.File.separator + AUDIENCE_NETWORK_DEX;
        java.io.InputStream inputStreamOpen = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamOpen.read(bArr);
            if (i > 0) {
                fileOutputStream.write(bArr, 0, i);
            } else {
                inputStreamOpen.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                return new dalvik.system.DexClassLoader(str, context.getDir(OPTIMIZED_DEX_PATH, 0).getPath(), null, com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.class.getClassLoader());
            }
        }
    }

    private static java.lang.ClassLoader makeAdsSdkClassLoader(android.content.Context context) throws java.lang.Exception {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return createInMemoryClassLoader(context);
        }
        if (sUseLegacyClassLoader) {
            return makeLegacyAdsSdkClassLoader(context);
        }
        java.io.File secondaryDir = getSecondaryDir(getCodeCacheDir(context, new java.io.File(context.getApplicationInfo().dataDir)));
        java.lang.String str = secondaryDir.getPath() + java.io.File.separator + AUDIENCE_NETWORK_DEX;
        java.io.InputStream inputStreamOpen = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamOpen.read(bArr);
            if (i > 0) {
                fileOutputStream.write(bArr, 0, i);
            } else {
                inputStreamOpen.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                java.io.File file = new java.io.File(secondaryDir.getPath() + java.io.File.separator + OPTIMIZED_DEX_PATH);
                mkdirChecked(file);
                return new dalvik.system.DexClassLoader(str, file.getPath(), null, context.getClassLoader());
            }
        }
    }

    private static java.lang.ClassLoader createInMemoryClassLoader(android.content.Context context) throws java.io.IOException {
        java.io.InputStream inputStreamOpen;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        try {
            java.lang.ClassLoader classLoaderCreate = ((com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.RemoteClassLoaderFactory) context.getClassLoader().loadClass("com.facebook.ads.internal.dynamicloading.RemoteClassLoaderFactoryImpl").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0])).create(context);
            if (classLoaderCreate != null) {
                return classLoaderCreate;
            }
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    inputStreamOpen.close();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    return new dalvik.system.InMemoryDexClassLoader(java.nio.ByteBuffer.wrap(byteArrayOutputStream.toByteArray()), com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.class.getClassLoader());
                }
            }
        } catch (java.lang.Exception unused) {
            com.facebook.ads.internal.dynamicloading.FlashPreferences.getSharedPreferences(context).edit().clear().apply();
        }
        inputStreamOpen = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bArr = new byte[1024];
    }

    private static android.content.Context getApplicationContextViaReflection() {
        try {
            return (android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null);
        } catch (java.lang.Throwable th) {
            android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, "Failed to fetch Context from  ActivityThread. Audience Network SDK won't work unless you call AudienceNetworkAds.buildInitSettings().withListener(InitListener).initialize().", th);
            return null;
        }
    }

    private static java.io.File getCodeCacheDir(android.content.Context context, java.io.File file) throws java.io.IOException {
        return context.getCodeCacheDir();
    }

    private static java.io.File getCacheCodeDirLegacy(android.content.Context context, java.io.File file) throws java.io.IOException {
        java.io.File file2 = new java.io.File(file, CODE_CACHE_DIR);
        try {
            mkdirChecked(file2);
            return file2;
        } catch (java.io.IOException unused) {
            java.io.File dir = context.getDir(CODE_CACHE_DIR, 0);
            mkdirChecked(dir);
            return dir;
        }
    }

    private static java.io.File getSecondaryDir(java.io.File file) throws java.io.IOException {
        java.io.File file2 = new java.io.File(file, AUDIENCE_NETWORK_CODE_PATH);
        mkdirChecked(file2);
        return file2;
    }

    private static void mkdirChecked(java.io.File file) throws java.io.IOException {
        java.lang.String str;
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null) {
            str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
        } else {
            str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
        }
        android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, str);
        throw new java.io.IOException("Failed to create directory " + file.getPath() + ", detailed message: " + str);
    }

    private static java.lang.String stackTraceToString(java.lang.Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }
}
