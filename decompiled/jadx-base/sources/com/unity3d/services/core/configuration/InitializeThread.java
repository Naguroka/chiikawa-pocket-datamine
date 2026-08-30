package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class InitializeThread extends java.lang.Thread {
    private static com.unity3d.services.core.configuration.InitializeThread _thread;
    private com.unity3d.services.core.configuration.InitializeThread.InitializeState _state;
    private java.lang.String _stateName;
    private long _stateStartTimestamp;
    private boolean _stopThread = false;
    private boolean _didRetry = false;
    private final com.unity3d.services.core.request.metrics.SDKMetricsSender _sdkMetricsSender = (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class);

    private int getStatePrefixLength() {
        return 15;
    }

    private InitializeThread(com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeState) {
        this._state = initializeState;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeState = this._state;
                if (initializeState == null || this._stopThread) {
                    break;
                }
                try {
                    handleStateStartMetrics(initializeState);
                    com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeStateExecute = this._state.execute();
                    this._state = initializeStateExecute;
                    handleStateEndMetrics(initializeStateExecute);
                } catch (java.lang.Exception e) {
                    com.unity3d.services.core.log.DeviceLog.exception("Unity Ads SDK encountered an error during initialization, cancel initialization", e);
                    com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.configuration.InitializeThread.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK encountered an error during initialization, cancel initialization");
                        }
                    });
                    this._state = new com.unity3d.services.core.configuration.InitializeThread.InitializeStateForceReset();
                } catch (java.lang.OutOfMemoryError e2) {
                    com.unity3d.services.core.log.DeviceLog.exception("Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK", new java.lang.Exception(e2));
                    com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.configuration.InitializeThread.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK");
                        }
                    });
                    this._state = new com.unity3d.services.core.configuration.InitializeThread.InitializeStateForceReset();
                }
            } catch (java.lang.OutOfMemoryError unused) {
            }
        }
        _thread = null;
    }

    public void quit() {
        this._stopThread = true;
    }

    public static synchronized void initialize(com.unity3d.services.core.configuration.Configuration configuration) {
        if (_thread == null) {
            com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didInitStart();
            com.unity3d.services.core.lifecycle.CachedLifecycle.register();
            com.unity3d.services.core.configuration.InitializeThread initializeThread = new com.unity3d.services.core.configuration.InitializeThread(new com.unity3d.services.core.configuration.InitializeThread.InitializeStateLoadConfigFile(configuration));
            _thread = initializeThread;
            initializeThread.setName("UnityAdsInitializeThread");
            _thread.start();
        }
    }

    public static synchronized void reset() {
        if (_thread == null) {
            com.unity3d.services.core.configuration.InitializeThread initializeThread = new com.unity3d.services.core.configuration.InitializeThread(new com.unity3d.services.core.configuration.InitializeThread.InitializeStateForceReset());
            _thread = initializeThread;
            initializeThread.setName("UnityAdsResetThread");
            _thread.start();
        }
    }

    public static synchronized com.unity3d.services.core.api.DownloadLatestWebViewStatus downloadLatestWebView() {
        if (_thread != null) {
            return com.unity3d.services.core.api.DownloadLatestWebViewStatus.INIT_QUEUE_NOT_EMPTY;
        }
        if (com.unity3d.services.core.properties.SdkProperties.getLatestConfiguration() == null) {
            return com.unity3d.services.core.api.DownloadLatestWebViewStatus.MISSING_LATEST_CONFIG;
        }
        com.unity3d.services.core.configuration.InitializeThread initializeThread = new com.unity3d.services.core.configuration.InitializeThread(new com.unity3d.services.core.configuration.InitializeThread.InitializeStateCheckForCachedWebViewUpdate(com.unity3d.services.core.properties.SdkProperties.getLatestConfiguration()));
        _thread = initializeThread;
        initializeThread.setName("UnityAdsDownloadThread");
        _thread.start();
        return com.unity3d.services.core.api.DownloadLatestWebViewStatus.BACKGROUND_DOWNLOAD_STARTED;
    }

    private void handleStateStartMetrics(com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeState) {
        if (isRetryState(initializeState)) {
            this._didRetry = true;
        } else {
            if (!this._didRetry) {
                this._stateStartTimestamp = java.lang.System.nanoTime();
            }
            this._didRetry = false;
        }
        this._stateName = getMetricNameForState(initializeState);
    }

    private void handleStateEndMetrics(com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeState) {
        if (this._stateName == null || isRetryState(initializeState) || this._stateName.equals("native_retry_state")) {
            return;
        }
        this._sdkMetricsSender.sendMetric(new com.unity3d.services.core.request.metrics.Metric(this._stateName, java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - this._stateStartTimestamp)), getMetricTagsForState()));
    }

    private java.util.Map<java.lang.String, java.lang.String> getMetricTagsForState() {
        return com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().getRetryTags();
    }

    private java.lang.String getMetricNameForState(com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeState) {
        if (initializeState == null) {
            return null;
        }
        java.lang.String simpleName = initializeState.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            return null;
        }
        java.lang.String lowerCase = simpleName.substring(getStatePrefixLength()).toLowerCase();
        return new java.lang.StringBuilder(7 + lowerCase.length() + 6).append("native_").append(lowerCase).append("_state").toString();
    }

    private boolean isRetryState(com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeState) {
        return initializeState instanceof com.unity3d.services.core.configuration.InitializeThread.InitializeStateRetry;
    }

    private static abstract class InitializeState {
        public abstract com.unity3d.services.core.configuration.InitializeThread.InitializeState execute();

        private InitializeState() {
        }
    }

    public static class InitializeStateLoadConfigFile extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;

        public InitializeStateLoadConfigFile(com.unity3d.services.core.configuration.Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: Loading Config File Parameters");
            java.io.File file = new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalConfigurationFilepath());
            if (!file.exists()) {
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateReset(this._configuration);
            }
            try {
                this._configuration = new com.unity3d.services.core.configuration.Configuration(new org.json.JSONObject(new java.lang.String(com.unity3d.services.core.misc.Utilities.readFileBytes(file))));
            } catch (java.lang.Exception unused) {
                com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: Using default configuration parameters");
            }
            return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateReset(this._configuration);
        }
    }

    public static class InitializeStateReset extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;
        private int _resetWebAppTimeout;

        public InitializeStateReset(com.unity3d.services.core.configuration.Configuration configuration) {
            super();
            this._configuration = configuration;
            this._resetWebAppTimeout = configuration.getResetWebappTimeout();
        }

        public com.unity3d.services.core.configuration.Configuration getConfiguration() {
            return this._configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            boolean zBlock;
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: starting init");
            final android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
            final com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
            if (currentApp != null) {
                currentApp.resetWebViewAppInitialization();
                if (currentApp.getWebView() != null) {
                    com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.configuration.InitializeThread.InitializeStateReset.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.unity3d.services.core.webview.WebView webView = currentApp.getWebView();
                            if (webView != null) {
                                webView.destroy();
                                currentApp.setWebView(null);
                            }
                            conditionVariable.open();
                        }
                    });
                    zBlock = conditionVariable.block(this._resetWebAppTimeout);
                } else {
                    zBlock = true;
                }
                if (!zBlock) {
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateError(com.unity3d.services.core.configuration.ErrorState.ResetWebApp, new java.lang.Exception("Reset failed on opening ConditionVariable"), this._configuration);
                }
            }
            unregisterLifecycleCallbacks();
            com.unity3d.services.core.properties.SdkProperties.setCacheDirectory(null);
            if (com.unity3d.services.core.properties.SdkProperties.getCacheDirectory() == null) {
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateError(com.unity3d.services.core.configuration.ErrorState.ResetWebApp, new java.lang.Exception("Cache directory is NULL"), this._configuration);
            }
            com.unity3d.services.core.properties.SdkProperties.setWebViewCacheDirectory(null);
            if (com.unity3d.services.core.properties.SdkProperties.getWebViewCacheDirectory() == null) {
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateError(com.unity3d.services.core.configuration.ErrorState.ResetWebApp, new java.lang.Exception("WebView cache directory is NULL"), this._configuration);
            }
            com.unity3d.services.core.properties.SdkProperties.setInitialized(false);
            for (java.lang.Class cls : this._configuration.getModuleConfigurationList()) {
                com.unity3d.services.core.configuration.IModuleConfiguration moduleConfiguration = this._configuration.getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.resetState(this._configuration);
                }
            }
            return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateInitModules(this._configuration);
        }

        private void unregisterLifecycleCallbacks() {
            if (com.unity3d.services.core.api.Lifecycle.getLifecycleListener() != null) {
                if (com.unity3d.services.core.properties.ClientProperties.getApplication() != null) {
                    com.unity3d.services.core.properties.ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(com.unity3d.services.core.api.Lifecycle.getLifecycleListener());
                }
                com.unity3d.services.core.api.Lifecycle.setLifecycleListener(null);
            }
        }
    }

    public static class InitializeStateForceReset extends com.unity3d.services.core.configuration.InitializeThread.InitializeStateReset {
        public InitializeStateForceReset() {
            super(new com.unity3d.services.core.configuration.Configuration());
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateReset, com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            com.unity3d.services.core.properties.SdkProperties.setInitializeState(com.unity3d.services.core.properties.SdkProperties.InitializationState.NOT_INITIALIZED);
            super.execute();
            return null;
        }
    }

    public static class InitializeStateInitModules extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;

        public InitializeStateInitModules(com.unity3d.services.core.configuration.Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        public com.unity3d.services.core.configuration.Configuration getConfiguration() {
            return this._configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig(this._configuration);
        }
    }

    public static class InitializeStateConfig extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;
        private com.unity3d.services.core.configuration.Configuration _localConfig;
        private int _maxRetries;
        private com.unity3d.services.core.configuration.InitializeThread.InitializeState _nextState;
        private int _retries;
        private long _retryDelay;
        private double _scalingFactor;

        public InitializeStateConfig(com.unity3d.services.core.configuration.Configuration configuration) {
            super();
            this._configuration = new com.unity3d.services.core.configuration.Configuration(com.unity3d.services.core.properties.SdkProperties.getConfigUrl(), configuration.getExperimentsReader());
            this._retries = 0;
            this._retryDelay = configuration.getRetryDelay();
            this._maxRetries = configuration.getMaxRetries();
            this._scalingFactor = configuration.getRetryScalingFactor();
            this._localConfig = configuration;
            this._nextState = null;
        }

        public com.unity3d.services.core.configuration.Configuration getConfiguration() {
            return this._configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            com.unity3d.services.core.log.DeviceLog.info("Unity Ads init: load configuration from " + com.unity3d.services.core.properties.SdkProperties.getConfigUrl());
            return executeWithLoader();
        }

        public com.unity3d.services.core.configuration.InitializeThread.InitializeState executeLegacy(com.unity3d.services.core.configuration.Configuration configuration) {
            try {
                configuration.makeRequest();
                if (configuration.getDelayWebViewUpdate()) {
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateLoadCacheConfigAndWebView(configuration, this._localConfig);
                }
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateLoadCache(configuration);
            } catch (java.lang.Exception e) {
                if (this._retries < this._maxRetries) {
                    this._retryDelay = (long) (this._retryDelay * this._scalingFactor);
                    this._retries++;
                    com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().onRetryConfig();
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateRetry(this, this._retryDelay);
                }
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateNetworkError(com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest, e, this, this._localConfig);
            }
        }

        public com.unity3d.services.core.configuration.InitializeThread.InitializeState executeWithLoader() {
            final com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender = (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class);
            com.unity3d.services.core.network.core.HttpClient httpClient = (com.unity3d.services.core.network.core.HttpClient) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.network.core.HttpClient.class);
            com.unity3d.services.core.configuration.PrivacyConfigStorage privacyConfigStorage = com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance();
            com.unity3d.services.core.device.reader.DeviceInfoDataFactory deviceInfoDataFactory = new com.unity3d.services.core.device.reader.DeviceInfoDataFactory(sDKMetricsSender);
            com.unity3d.services.core.configuration.PrivacyConfigurationLoader privacyConfigurationLoader = new com.unity3d.services.core.configuration.PrivacyConfigurationLoader(new com.unity3d.services.core.configuration.ConfigurationLoader(new com.unity3d.services.core.configuration.ConfigurationRequestFactory(this._configuration, deviceInfoDataFactory.getDeviceInfoData(com.unity3d.services.core.configuration.InitRequestType.TOKEN)), sDKMetricsSender, httpClient), new com.unity3d.services.core.configuration.ConfigurationRequestFactory(this._configuration, deviceInfoDataFactory.getDeviceInfoData(com.unity3d.services.core.configuration.InitRequestType.PRIVACY)), privacyConfigStorage, httpClient);
            final com.unity3d.services.core.configuration.Configuration configuration = new com.unity3d.services.core.configuration.Configuration(com.unity3d.services.core.properties.SdkProperties.getConfigUrl());
            try {
                privacyConfigurationLoader.loadConfiguration(new com.unity3d.services.core.configuration.IConfigurationLoaderListener() { // from class: com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.1
                    @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onSuccess(com.unity3d.services.core.configuration.Configuration configuration2) {
                        com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.this._configuration = configuration2;
                        com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.this._configuration.saveToDisk();
                        if (com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.this._configuration.getDelayWebViewUpdate()) {
                            com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.this._nextState = new com.unity3d.services.core.configuration.InitializeThread.InitializeStateLoadCacheConfigAndWebView(com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.this._configuration, com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.this._localConfig);
                        }
                        ((com.unity3d.services.ads.token.TokenStorage) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.ads.token.TokenStorage.class)).setInitToken(com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.this._configuration.getUnifiedAuctionToken());
                        com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.this._nextState = new com.unity3d.services.core.configuration.InitializeThread.InitializeStateLoadCache(com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.this._configuration);
                    }

                    @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onError(java.lang.String str) {
                        sDKMetricsSender.sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newEmergencySwitchOff());
                        com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig initializeStateConfig = com.unity3d.services.core.configuration.InitializeThread.InitializeStateConfig.this;
                        initializeStateConfig._nextState = initializeStateConfig.executeLegacy(configuration);
                    }
                });
                return this._nextState;
            } catch (java.lang.Exception e) {
                int i = this._retries;
                if (i < this._maxRetries) {
                    this._retryDelay = (long) (this._retryDelay * this._scalingFactor);
                    this._retries = i + 1;
                    com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().onRetryConfig();
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateRetry(this, this._retryDelay);
                }
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateNetworkError(com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest, e, this, this._configuration);
            }
        }
    }

    public static class InitializeStateLoadCache extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;

        public InitializeStateLoadCache(com.unity3d.services.core.configuration.Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        public com.unity3d.services.core.configuration.Configuration getConfiguration() {
            return this._configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() throws java.lang.Throwable {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            try {
                byte[] fileBytes = com.unity3d.services.core.misc.Utilities.readFileBytes(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()));
                java.lang.String strSha256 = com.unity3d.services.core.misc.Utilities.Sha256(fileBytes);
                if (strSha256 != null && strSha256.equals(this._configuration.getWebViewHash())) {
                    try {
                        java.lang.String str = new java.lang.String(fileBytes, com.adjust.sdk.Constants.ENCODING);
                        com.unity3d.services.core.log.DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                        return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateCreate(this._configuration, str);
                    } catch (java.lang.Exception e) {
                        return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateError(com.unity3d.services.core.configuration.ErrorState.LoadCache, e, this._configuration);
                    }
                }
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateLoadWeb(this._configuration);
            } catch (java.lang.Exception e2) {
                com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: webapp not found in local cache: " + e2.getMessage());
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateLoadWeb(this._configuration);
            }
        }
    }

    public static class InitializeStateLoadWeb extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;
        private com.unity3d.services.core.network.core.HttpClient _httpClient;
        private int _maxRetries;
        private int _retries;
        private long _retryDelay;
        private double _scalingFactor;

        public InitializeStateLoadWeb(com.unity3d.services.core.configuration.Configuration configuration) {
            super();
            this._httpClient = (com.unity3d.services.core.network.core.HttpClient) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.network.core.HttpClient.class);
            this._configuration = configuration;
            this._retries = 0;
            this._retryDelay = configuration.getRetryDelay();
            this._maxRetries = configuration.getMaxRetries();
            this._scalingFactor = configuration.getRetryScalingFactor();
        }

        public com.unity3d.services.core.configuration.Configuration getConfiguration() {
            return this._configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            com.unity3d.services.core.log.DeviceLog.info("Unity Ads init: loading webapp from " + this._configuration.getWebViewUrl());
            try {
                try {
                    java.lang.String string = this._httpClient.executeBlocking(new com.unity3d.services.core.network.model.HttpRequest(this._configuration.getWebViewUrl())).getBody().toString();
                    java.lang.String webViewHash = this._configuration.getWebViewHash();
                    if (webViewHash != null && !com.unity3d.services.core.misc.Utilities.Sha256(string).equals(webViewHash)) {
                        return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateError(com.unity3d.services.core.configuration.ErrorState.InvalidHash, new java.lang.Exception("Invalid webViewHash"), this._configuration);
                    }
                    if (webViewHash != null) {
                        com.unity3d.services.core.misc.Utilities.writeFile(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()), string);
                    }
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateCreate(this._configuration, string);
                } catch (java.lang.Exception e) {
                    int i = this._retries;
                    if (i < this._maxRetries) {
                        this._retryDelay = (long) (this._retryDelay * this._scalingFactor);
                        this._retries = i + 1;
                        com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().onRetryWebview();
                        return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateRetry(this, this._retryDelay);
                    }
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateNetworkError(com.unity3d.services.core.configuration.ErrorState.NetworkWebviewRequest, e, this, this._configuration);
                }
            } catch (java.lang.Exception e2) {
                com.unity3d.services.core.log.DeviceLog.exception("Malformed URL", e2);
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateError(com.unity3d.services.core.configuration.ErrorState.MalformedWebviewRequest, e2, this._configuration);
            }
        }
    }

    public static class InitializeStateCreate extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;
        private java.lang.String _webViewData;

        public InitializeStateCreate(com.unity3d.services.core.configuration.Configuration configuration, java.lang.String str) {
            super();
            this._configuration = configuration;
            this._webViewData = str;
        }

        public com.unity3d.services.core.configuration.Configuration getConfiguration() {
            return this._configuration;
        }

        public java.lang.String getWebData() {
            return this._webViewData;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: creating webapp");
            com.unity3d.services.core.configuration.Configuration configuration = this._configuration;
            configuration.setWebViewData(this._webViewData);
            try {
                com.unity3d.services.core.configuration.ErrorState errorStateCreate = com.unity3d.services.core.webview.WebViewApp.create(configuration, false);
                if (errorStateCreate == null) {
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateComplete(this._configuration);
                }
                java.lang.String webAppFailureMessage = com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                com.unity3d.services.core.log.DeviceLog.error(webAppFailureMessage);
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateError(errorStateCreate, new java.lang.Exception(webAppFailureMessage), this._configuration);
            } catch (java.lang.IllegalThreadStateException e) {
                com.unity3d.services.core.log.DeviceLog.exception("Illegal Thread", e);
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateError(com.unity3d.services.core.configuration.ErrorState.CreateWebApp, e, this._configuration);
            }
        }
    }

    public static class InitializeStateCreateWithRemote extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;

        public InitializeStateCreateWithRemote(com.unity3d.services.core.configuration.Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        public com.unity3d.services.core.configuration.Configuration getConfiguration() {
            return this._configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: creating webapp");
            try {
                com.unity3d.services.core.configuration.ErrorState errorStateCreate = com.unity3d.services.core.webview.WebViewApp.create(this._configuration, true);
                if (errorStateCreate == null) {
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateComplete(this._configuration);
                }
                java.lang.String webAppFailureMessage = com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                com.unity3d.services.core.log.DeviceLog.error(webAppFailureMessage);
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateError(errorStateCreate, new java.lang.Exception(webAppFailureMessage), this._configuration);
            } catch (java.lang.IllegalThreadStateException e) {
                com.unity3d.services.core.log.DeviceLog.exception("Illegal Thread", e);
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateError(com.unity3d.services.core.configuration.ErrorState.CreateWebApp, e, this._configuration);
            }
        }
    }

    public static class InitializeStateComplete extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;

        public InitializeStateComplete(com.unity3d.services.core.configuration.Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            for (java.lang.Class cls : this._configuration.getModuleConfigurationList()) {
                com.unity3d.services.core.configuration.IModuleConfiguration moduleConfiguration = this._configuration.getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initCompleteState(this._configuration);
                }
            }
            return null;
        }
    }

    public static class InitializeStateError extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        protected com.unity3d.services.core.configuration.Configuration _configuration;
        com.unity3d.services.core.configuration.ErrorState _errorState;
        java.lang.Exception _exception;

        public InitializeStateError(com.unity3d.services.core.configuration.ErrorState errorState, java.lang.Exception exc, com.unity3d.services.core.configuration.Configuration configuration) {
            super();
            this._errorState = errorState;
            this._exception = exc;
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            com.unity3d.services.core.log.DeviceLog.error("Unity Ads init: halting init in " + this._errorState.getMetricName() + ": " + this._exception.getMessage());
            for (java.lang.Class cls : this._configuration.getModuleConfigurationList()) {
                com.unity3d.services.core.configuration.IModuleConfiguration moduleConfiguration = this._configuration.getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initErrorState(this._configuration, this._errorState, this._exception.getMessage());
                }
            }
            return null;
        }
    }

    public static class InitializeStateNetworkError extends com.unity3d.services.core.configuration.InitializeThread.InitializeStateError implements com.unity3d.services.core.connectivity.IConnectivityListener {
        private static long _lastConnectedEventTimeMs;
        private static int _receivedConnectedEvents;
        private android.os.ConditionVariable _conditionVariable;
        private int _connectedEventThreshold;
        private com.unity3d.services.core.configuration.InitializeThread.InitializeState _erroredState;
        private int _maximumConnectedEvents;
        private long _networkErrorTimeout;
        private com.unity3d.services.core.configuration.ErrorState _state;

        public InitializeStateNetworkError(com.unity3d.services.core.configuration.ErrorState errorState, java.lang.Exception exc, com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeState, com.unity3d.services.core.configuration.Configuration configuration) {
            super(errorState, exc, configuration);
            this._state = errorState;
            _receivedConnectedEvents = 0;
            _lastConnectedEventTimeMs = 0L;
            this._erroredState = initializeState;
            this._networkErrorTimeout = configuration.getNetworkErrorTimeout();
            this._maximumConnectedEvents = configuration.getMaximumConnectedEvents();
            this._connectedEventThreshold = configuration.getConnectedEventThreshold();
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateError, com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            com.unity3d.services.core.log.DeviceLog.error("Unity Ads init: network error, waiting for connection events");
            this._conditionVariable = new android.os.ConditionVariable();
            com.unity3d.services.core.connectivity.ConnectivityMonitor.addListener(this);
            if (this._conditionVariable.block(this._networkErrorTimeout)) {
                com.unity3d.services.core.connectivity.ConnectivityMonitor.removeListener(this);
                return this._erroredState;
            }
            com.unity3d.services.core.connectivity.ConnectivityMonitor.removeListener(this);
            return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateError(this._state, new java.lang.Exception("No connected events within the timeout!"), this._configuration);
        }

        @Override // com.unity3d.services.core.connectivity.IConnectivityListener
        public void onConnected() {
            _receivedConnectedEvents++;
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init got connected event");
            if (shouldHandleConnectedEvent()) {
                this._conditionVariable.open();
            }
            if (_receivedConnectedEvents > this._maximumConnectedEvents) {
                com.unity3d.services.core.connectivity.ConnectivityMonitor.removeListener(this);
            }
            _lastConnectedEventTimeMs = java.lang.System.currentTimeMillis();
        }

        @Override // com.unity3d.services.core.connectivity.IConnectivityListener
        public void onDisconnected() {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init got disconnected event");
        }

        private boolean shouldHandleConnectedEvent() {
            return java.lang.System.currentTimeMillis() - _lastConnectedEventTimeMs >= ((long) this._connectedEventThreshold) && _receivedConnectedEvents <= this._maximumConnectedEvents;
        }
    }

    public static class InitializeStateRetry extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        long _delay;
        com.unity3d.services.core.configuration.InitializeThread.InitializeState _state;

        public InitializeStateRetry(com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeState, long j) {
            super();
            this._state = initializeState;
            this._delay = j;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: retrying in " + this._delay + " milliseconds");
            try {
                java.lang.Thread.sleep(this._delay);
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.exception("Init retry interrupted", e);
                java.lang.Thread.currentThread().interrupt();
            }
            return this._state;
        }
    }

    public static class InitializeStateLoadCacheConfigAndWebView extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;
        private com.unity3d.services.core.configuration.Configuration _localConfig;

        public InitializeStateLoadCacheConfigAndWebView(com.unity3d.services.core.configuration.Configuration configuration, com.unity3d.services.core.configuration.Configuration configuration2) {
            super();
            this._configuration = configuration;
            this._localConfig = configuration2;
        }

        public com.unity3d.services.core.configuration.Configuration getConfiguration() {
            return this._configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            try {
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateCheckForUpdatedWebView(this._configuration, com.unity3d.services.core.configuration.InitializeThread.loadCachedFileToByteArray(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile())), this._localConfig);
            } catch (java.lang.Exception unused) {
                return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateCleanCache(this._configuration, new com.unity3d.services.core.configuration.InitializeThread.InitializeStateLoadWeb(this._configuration));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] loadCachedFileToByteArray(java.io.File file) throws java.io.IOException {
        if (file != null && file.exists()) {
            try {
                return com.unity3d.services.core.misc.Utilities.readFileBytes(file);
            } catch (java.io.IOException unused) {
                throw new java.io.IOException("could not read from file");
            }
        }
        throw new java.io.IOException("file not found");
    }

    public static class InitializeStateCleanCache extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;
        private com.unity3d.services.core.configuration.InitializeThread.InitializeState _nextState;

        public InitializeStateCleanCache(com.unity3d.services.core.configuration.Configuration configuration, com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeState) {
            super();
            this._configuration = configuration;
            this._nextState = initializeState;
        }

        public com.unity3d.services.core.configuration.Configuration getConfiguration() {
            return this._configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            try {
                java.io.File file = new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalConfigurationFilepath());
                java.io.File file2 = new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile());
                file.delete();
                file2.delete();
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.error("Failure trying to clean cache: " + e.getMessage());
            }
            return this._nextState;
        }
    }

    public static class InitializeStateCleanCacheIgnoreError extends com.unity3d.services.core.configuration.InitializeThread.InitializeStateCleanCache {
        public InitializeStateCleanCacheIgnoreError(com.unity3d.services.core.configuration.Configuration configuration, com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeState) {
            super(configuration, initializeState);
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeStateCleanCache, com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            try {
                com.unity3d.services.core.configuration.InitializeThread.InitializeState initializeStateExecute = super.execute();
                if (initializeStateExecute instanceof com.unity3d.services.core.configuration.InitializeThread.InitializeStateError) {
                    return null;
                }
                return initializeStateExecute;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    public static class InitializeStateCheckForUpdatedWebView extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;
        private com.unity3d.services.core.configuration.Configuration _localWebViewConfiguration;
        private byte[] _localWebViewData;

        public InitializeStateCheckForUpdatedWebView(com.unity3d.services.core.configuration.Configuration configuration, byte[] bArr, com.unity3d.services.core.configuration.Configuration configuration2) {
            super();
            this._configuration = configuration;
            this._localWebViewData = bArr;
            this._localWebViewConfiguration = configuration2;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            try {
                java.lang.String strSha256 = com.unity3d.services.core.misc.Utilities.Sha256(this._localWebViewData);
                if (!strSha256.equals(this._configuration.getWebViewHash())) {
                    com.unity3d.services.core.properties.SdkProperties.setLatestConfiguration(this._configuration);
                }
                if (!android.text.TextUtils.isEmpty(strSha256)) {
                    com.unity3d.services.core.configuration.Configuration configuration = this._localWebViewConfiguration;
                    if (configuration != null && configuration.getWebViewHash() != null && this._localWebViewConfiguration.getWebViewHash().equals(strSha256) && com.unity3d.services.core.properties.SdkProperties.getVersionName().equals(this._localWebViewConfiguration.getSdkVersion())) {
                        return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateCreate(this._localWebViewConfiguration, new java.lang.String(this._localWebViewData, com.adjust.sdk.Constants.ENCODING));
                    }
                    com.unity3d.services.core.configuration.Configuration configuration2 = this._configuration;
                    if (configuration2 != null && configuration2.getWebViewHash().equals(strSha256)) {
                        return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateCreate(this._configuration, new java.lang.String(this._localWebViewData, com.adjust.sdk.Constants.ENCODING));
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateCleanCache(this._configuration, new com.unity3d.services.core.configuration.InitializeThread.InitializeStateLoadWeb(this._configuration));
        }
    }

    public static class InitializeStateDownloadWebView extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;
        private com.unity3d.services.core.network.core.HttpClient _httpClient;
        private int _retries;
        private long _retryDelay;

        public InitializeStateDownloadWebView(com.unity3d.services.core.configuration.Configuration configuration) {
            super();
            this._httpClient = (com.unity3d.services.core.network.core.HttpClient) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.network.core.HttpClient.class);
            this._configuration = configuration;
            this._retries = 0;
            this._retryDelay = configuration.getRetryDelay();
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            com.unity3d.services.core.log.DeviceLog.info("Unity Ads init: downloading webapp from " + this._configuration.getWebViewUrl());
            try {
                try {
                    java.lang.String string = this._httpClient.executeBlocking(new com.unity3d.services.core.network.model.HttpRequest(this._configuration.getWebViewUrl())).getBody().toString();
                    java.lang.String webViewHash = this._configuration.getWebViewHash();
                    if (string == null || webViewHash == null || !com.unity3d.services.core.misc.Utilities.Sha256(string).equals(webViewHash)) {
                        return null;
                    }
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateUpdateCache(this._configuration, string);
                } catch (java.lang.Exception unused) {
                    if (this._retries >= this._configuration.getMaxRetries()) {
                        return null;
                    }
                    this._retryDelay = (long) (this._retryDelay * this._configuration.getRetryScalingFactor());
                    this._retries++;
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateRetry(this, this._retryDelay);
                }
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.exception("Malformed URL", e);
                return null;
            }
        }
    }

    public static class InitializeStateUpdateCache extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;
        private java.lang.String _webViewData;

        public com.unity3d.services.core.configuration.Configuration getConfiguration() {
            return this._configuration;
        }

        public InitializeStateUpdateCache(com.unity3d.services.core.configuration.Configuration configuration, java.lang.String str) {
            super();
            this._configuration = configuration;
            this._webViewData = str;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            if (this._configuration != null && this._webViewData != null) {
                try {
                    com.unity3d.services.core.misc.Utilities.writeFile(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()), this._webViewData);
                    com.unity3d.services.core.misc.Utilities.writeFile(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalConfigurationFilepath()), this._configuration.getFilteredJsonString());
                } catch (java.lang.Exception unused) {
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateCleanCacheIgnoreError(this._configuration, null);
                }
            }
            return null;
        }
    }

    public static class InitializeStateCheckForCachedWebViewUpdate extends com.unity3d.services.core.configuration.InitializeThread.InitializeState {
        private com.unity3d.services.core.configuration.Configuration _configuration;

        public com.unity3d.services.core.configuration.Configuration getConfiguration() {
            return this._configuration;
        }

        public InitializeStateCheckForCachedWebViewUpdate(com.unity3d.services.core.configuration.Configuration configuration) {
            super();
            this._configuration = configuration;
        }

        @Override // com.unity3d.services.core.configuration.InitializeThread.InitializeState
        public com.unity3d.services.core.configuration.InitializeThread.InitializeState execute() {
            try {
                byte[] bArrLoadCachedFileToByteArray = com.unity3d.services.core.configuration.InitializeThread.loadCachedFileToByteArray(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()));
                if (com.unity3d.services.core.misc.Utilities.Sha256(bArrLoadCachedFileToByteArray).equals(this._configuration.getWebViewHash())) {
                    return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateUpdateCache(this._configuration, new java.lang.String(bArrLoadCachedFileToByteArray, com.adjust.sdk.Constants.ENCODING));
                }
            } catch (java.lang.Exception unused) {
            }
            return new com.unity3d.services.core.configuration.InitializeThread.InitializeStateDownloadWebView(this._configuration);
        }
    }
}
