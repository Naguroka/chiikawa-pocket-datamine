package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public class ProcessGlobalConfig {
    java.lang.String mCacheDirectoryBasePath;
    java.lang.String mDataDirectoryBasePath;
    java.lang.String mDataDirectorySuffix;
    private static final java.util.concurrent.atomic.AtomicReference<java.util.HashMap<java.lang.String, java.lang.Object>> sProcessGlobalConfig = new java.util.concurrent.atomic.AtomicReference<>();
    private static final java.lang.Object sLock = new java.lang.Object();
    private static boolean sApplyCalled = false;

    public androidx.webkit.ProcessGlobalConfig setDataDirectorySuffix(android.content.Context context, java.lang.String str) {
        if (!androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX.isSupported(context)) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (str.equals("")) {
            throw new java.lang.IllegalArgumentException("Suffix cannot be an empty string");
        }
        if (str.indexOf(java.io.File.separatorChar) >= 0) {
            throw new java.lang.IllegalArgumentException("Suffix " + str + " contains a path separator");
        }
        this.mDataDirectorySuffix = str;
        return this;
    }

    public androidx.webkit.ProcessGlobalConfig setDirectoryBasePaths(android.content.Context context, java.io.File file, java.io.File file2) {
        if (!androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH.isSupported(context)) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (!file.isAbsolute()) {
            throw new java.lang.IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
        }
        if (!file2.isAbsolute()) {
            throw new java.lang.IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
        }
        this.mDataDirectoryBasePath = file.getAbsolutePath();
        this.mCacheDirectoryBasePath = file2.getAbsolutePath();
        return this;
    }

    public static void apply(androidx.webkit.ProcessGlobalConfig processGlobalConfig) {
        synchronized (sLock) {
            if (sApplyCalled) {
                throw new java.lang.IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
            }
            sApplyCalled = true;
        }
        java.util.HashMap map = new java.util.HashMap();
        if (webViewCurrentlyLoaded()) {
            throw new java.lang.IllegalStateException("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
        }
        if (processGlobalConfig.mDataDirectorySuffix != null) {
            if (androidx.webkit.internal.WebViewFeatureInternal.STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX.isSupportedByFramework()) {
                androidx.webkit.internal.ApiHelperForP.setDataDirectorySuffix(processGlobalConfig.mDataDirectorySuffix);
            } else {
                map.put(org.chromium.support_lib_boundary.ProcessGlobalConfigConstants.DATA_DIRECTORY_SUFFIX, processGlobalConfig.mDataDirectorySuffix);
            }
        }
        java.lang.String str = processGlobalConfig.mDataDirectoryBasePath;
        if (str != null) {
            map.put(org.chromium.support_lib_boundary.ProcessGlobalConfigConstants.DATA_DIRECTORY_BASE_PATH, str);
        }
        java.lang.String str2 = processGlobalConfig.mCacheDirectoryBasePath;
        if (str2 != null) {
            map.put(org.chromium.support_lib_boundary.ProcessGlobalConfigConstants.CACHE_DIRECTORY_BASE_PATH, str2);
        }
        if (!kotlin.UByte$$ExternalSyntheticBackport0.m(sProcessGlobalConfig, null, map)) {
            throw new java.lang.RuntimeException("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
        }
    }

    private static boolean webViewCurrentlyLoaded() {
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
            return declaredField.get(null) != null;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
