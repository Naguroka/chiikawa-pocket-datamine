package com.unity3d.services.core.properties;

/* JADX INFO: loaded from: classes6.dex */
public class SdkProperties {
    private static final java.lang.String CACHE_DIR_NAME = "UnityAdsCache";
    private static final java.lang.String CHINA_CONFIG_HOSTNAME = "dW5pdHlhZHMudW5pdHljaGluYS5jbg==";
    private static final java.lang.String CHINA_ISO_ALPHA_2_CODE = "CN";
    private static final java.lang.String CHINA_ISO_ALPHA_3_CODE = "CHN";
    private static final java.lang.String CONFIG_VERSION_METADATA_KEY = "com.unity3d.ads.configversion";
    private static final java.lang.String DEFAULT_CONFIG_HOSTNAME = "unityads.unity3d.com";
    private static final java.lang.String DEFAULT_CONFIG_VERSION = "configv2";
    private static final java.lang.String LOCAL_CACHE_FILE_PREFIX = "UnityAdsCache-";
    private static final java.lang.String LOCAL_STORAGE_FILE_PREFIX = "UnityAdsStorage-";
    private static final java.lang.String WEBVIEW_CACHE_DIR_NAME = "UnityAdsWebViewCache";
    private static long _appInitializationTimeEpochMs;
    private static com.unity3d.services.core.cache.CacheDirectory _cacheDirectory;
    private static java.lang.String _configUrl;
    private static long _initializationTime;
    private static long _initializationTimeEpochMs;
    private static com.unity3d.services.core.configuration.Configuration _latestConfiguration;
    private static com.unity3d.services.core.cache.CacheDirectory _webviewCacheDirectory;
    private static final java.util.LinkedHashSet<com.unity3d.ads.IUnityAdsInitializationListener> _initializationListeners = new java.util.LinkedHashSet<>();
    private static boolean _initialized = false;
    private static boolean _reinitialized = false;
    private static boolean _testMode = false;
    private static boolean _debugMode = false;
    private static final java.util.concurrent.atomic.AtomicReference<com.unity3d.services.core.properties.SdkProperties.InitializationState> _currentInitializationState = new java.util.concurrent.atomic.AtomicReference<>(com.unity3d.services.core.properties.SdkProperties.InitializationState.NOT_INITIALIZED);

    public enum InitializationState {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED_SUCCESSFULLY,
        INITIALIZED_FAILED
    }

    public static java.lang.String getCacheDirectoryName() {
        return "UnityAdsCache";
    }

    public static java.lang.String getCacheFilePrefix() {
        return LOCAL_CACHE_FILE_PREFIX;
    }

    public static java.lang.String getLocalStorageFilePrefix() {
        return LOCAL_STORAGE_FILE_PREFIX;
    }

    public static int getVersionCode() {
        return 41205;
    }

    public static java.lang.String getVersionName() {
        return "4.12.5";
    }

    public static void notifyInitializationFailed(final com.unity3d.ads.UnityAds.UnityAdsInitializationError unityAdsInitializationError, final java.lang.String str) {
        setInitializeState(com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_FAILED);
        for (final com.unity3d.ads.IUnityAdsInitializationListener iUnityAdsInitializationListener : getInitializationListeners()) {
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.core.properties.SdkProperties$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    iUnityAdsInitializationListener.onInitializationFailed(unityAdsInitializationError, str);
                }
            });
        }
        resetInitializationListeners();
    }

    public static void notifyInitializationComplete() {
        setInitializeState(com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY);
        for (final com.unity3d.ads.IUnityAdsInitializationListener iUnityAdsInitializationListener : getInitializationListeners()) {
            java.util.Objects.requireNonNull(iUnityAdsInitializationListener);
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.services.core.properties.SdkProperties$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    iUnityAdsInitializationListener.onInitializationComplete();
                }
            });
        }
        resetInitializationListeners();
    }

    public static void setInitializeState(com.unity3d.services.core.properties.SdkProperties.InitializationState initializationState) {
        _currentInitializationState.set(initializationState);
    }

    public static com.unity3d.services.core.properties.SdkProperties.InitializationState getCurrentInitializationState() {
        return _currentInitializationState.get();
    }

    public static boolean isInitialized() {
        return _initialized;
    }

    public static void setInitialized(boolean z) {
        _initialized = z;
    }

    public static boolean isTestMode() {
        return _testMode;
    }

    public static void setTestMode(boolean z) {
        _testMode = z;
    }

    public static void setConfigUrl(java.lang.String str) throws java.net.MalformedURLException, java.net.URISyntaxException {
        if (str == null) {
            throw new java.net.MalformedURLException();
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            throw new java.net.MalformedURLException();
        }
        new java.net.URL(str).toURI();
        _configUrl = str;
    }

    public static java.lang.String getConfigUrl() {
        if (_configUrl == null) {
            _configUrl = getDefaultConfigUrl("release");
        }
        return _configUrl;
    }

    public static java.lang.String getDefaultConfigUrl(java.lang.String str) {
        return "https://" + getConfigVersion(com.unity3d.services.core.properties.ClientProperties.getApplicationContext()) + '.' + (isChinaLocale(com.unity3d.services.core.device.Device.getNetworkCountryISO()) ? new java.lang.String(android.util.Base64.decode(CHINA_CONFIG_HOSTNAME, 0)) : DEFAULT_CONFIG_HOSTNAME) + "/webview/" + getWebViewBranch() + "/" + str + "/config.json";
    }

    public static java.lang.String getConfigVersion(android.content.Context context) {
        if (context == null) {
            return DEFAULT_CONFIG_VERSION;
        }
        try {
            android.os.Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            return bundle != null ? bundle.getString(CONFIG_VERSION_METADATA_KEY, DEFAULT_CONFIG_VERSION) : DEFAULT_CONFIG_VERSION;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            com.unity3d.services.core.log.DeviceLog.warning("Failed to retrieve application info for current package");
            return DEFAULT_CONFIG_VERSION;
        }
    }

    private static java.lang.String getWebViewBranch() {
        return getVersionName();
    }

    public static java.lang.String getLocalWebViewFile() {
        return getWebViewCacheDirectory() == null ? "" : getWebViewCacheDirectory().getAbsolutePath() + "/UnityAdsWebApp.html";
    }

    public static java.lang.String getLocalConfigurationFilepath() {
        return getWebViewCacheDirectory() == null ? "" : getWebViewCacheDirectory().getAbsolutePath() + "/UnityAdsWebViewConfiguration.json";
    }

    public static void setLatestConfiguration(com.unity3d.services.core.configuration.Configuration configuration) {
        _latestConfiguration = configuration;
    }

    public static com.unity3d.services.core.configuration.Configuration getLatestConfiguration() {
        return _latestConfiguration;
    }

    public static java.io.File getWebViewCacheDirectory() {
        return getWebViewCacheDirectory(com.unity3d.services.core.properties.ClientProperties.getApplicationContext());
    }

    public static java.io.File getWebViewCacheDirectory(android.content.Context context) {
        if (_webviewCacheDirectory == null) {
            setWebViewCacheDirectory(new com.unity3d.services.core.cache.CacheDirectory(WEBVIEW_CACHE_DIR_NAME, false));
        }
        return _webviewCacheDirectory.getCacheDirectory(context);
    }

    public static void setWebViewCacheDirectory(com.unity3d.services.core.cache.CacheDirectory cacheDirectory) {
        _webviewCacheDirectory = cacheDirectory;
    }

    public static java.io.File getCacheDirectory() {
        return getCacheDirectory(com.unity3d.services.core.properties.ClientProperties.getApplicationContext());
    }

    public static java.io.File getCacheDirectory(android.content.Context context) {
        if (_cacheDirectory == null) {
            setCacheDirectory(new com.unity3d.services.core.cache.CacheDirectory("UnityAdsCache"));
        }
        return _cacheDirectory.getCacheDirectory(context);
    }

    public static void setCacheDirectory(com.unity3d.services.core.cache.CacheDirectory cacheDirectory) {
        _cacheDirectory = cacheDirectory;
    }

    public static com.unity3d.services.core.cache.CacheDirectory getCacheDirectoryObject() {
        return _cacheDirectory;
    }

    public static void setInitializationTime(long j) {
        _initializationTime = j;
    }

    public static long getInitializationTime() {
        return _initializationTime;
    }

    public static void setAppInitializationTimeSinceEpoch(long j) {
        _appInitializationTimeEpochMs = j;
    }

    public static long getAppInitializationTimeSinceEpoch() {
        return _appInitializationTimeEpochMs;
    }

    public static void setInitializationTimeSinceEpoch(long j) {
        _initializationTimeEpochMs = j;
    }

    public static long getInitializationTimeEpoch() {
        return _initializationTimeEpochMs;
    }

    public static void setReinitialized(boolean z) {
        _reinitialized = z;
    }

    public static boolean isReinitialized() {
        return _reinitialized;
    }

    public static void setDebugMode(boolean z) {
        _debugMode = z;
        if (z) {
            com.unity3d.services.core.log.DeviceLog.setLogLevel(8);
        } else {
            com.unity3d.services.core.log.DeviceLog.setLogLevel(4);
        }
    }

    public static boolean getDebugMode() {
        return _debugMode;
    }

    public static void addInitializationListener(com.unity3d.ads.IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (iUnityAdsInitializationListener == null) {
            return;
        }
        java.util.LinkedHashSet<com.unity3d.ads.IUnityAdsInitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            linkedHashSet.add(iUnityAdsInitializationListener);
        }
    }

    public static com.unity3d.ads.IUnityAdsInitializationListener[] getInitializationListeners() {
        com.unity3d.ads.IUnityAdsInitializationListener[] iUnityAdsInitializationListenerArr;
        java.util.LinkedHashSet<com.unity3d.ads.IUnityAdsInitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            iUnityAdsInitializationListenerArr = new com.unity3d.ads.IUnityAdsInitializationListener[linkedHashSet.size()];
            linkedHashSet.toArray(iUnityAdsInitializationListenerArr);
        }
        return iUnityAdsInitializationListenerArr;
    }

    public static void resetInitializationListeners() {
        java.util.LinkedHashSet<com.unity3d.ads.IUnityAdsInitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            linkedHashSet.clear();
        }
    }

    public static boolean isChinaLocale(java.lang.String str) {
        return str.equalsIgnoreCase(CHINA_ISO_ALPHA_2_CODE) || str.equalsIgnoreCase(CHINA_ISO_ALPHA_3_CODE);
    }
}
