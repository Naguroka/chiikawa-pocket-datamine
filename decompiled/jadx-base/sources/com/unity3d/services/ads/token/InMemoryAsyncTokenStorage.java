package com.unity3d.services.ads.token;

/* JADX INFO: loaded from: classes6.dex */
public class InMemoryAsyncTokenStorage implements com.unity3d.services.ads.token.AsyncTokenStorage {
    private com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilderWithExtras _deviceInfoReaderBuilderWithExtras;
    private final android.os.Handler _handler;
    private com.unity3d.services.ads.token.INativeTokenGenerator _nativeTokenGenerator;
    private final com.unity3d.services.core.request.metrics.SDKMetricsSender _sdkMetrics;
    private com.unity3d.services.ads.token.TokenStorage _tokenStorage;
    private final java.util.List<com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.TokenListenerState> _tokenListeners = new java.util.LinkedList();
    private boolean _tokenAvailable = false;
    private boolean _configurationWasSet = false;
    private com.unity3d.services.core.configuration.Configuration _configuration = new com.unity3d.services.core.configuration.Configuration();
    private final com.unity3d.services.core.properties.InitializationStatusReader _initStatusReader = new com.unity3d.services.core.properties.InitializationStatusReader();

    private boolean isValidConfig(com.unity3d.services.core.configuration.Configuration configuration) {
        return configuration != null;
    }

    class TokenListenerState {
        public com.unity3d.services.ads.gmascar.managers.IBiddingManager biddingManager;
        public boolean invoked;
        public java.lang.Runnable runnable;
        public com.unity3d.services.core.device.TokenType tokenType;

        TokenListenerState() {
        }
    }

    public InMemoryAsyncTokenStorage(com.unity3d.services.ads.token.INativeTokenGenerator iNativeTokenGenerator, android.os.Handler handler, com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender, com.unity3d.services.ads.token.TokenStorage tokenStorage) {
        this._handler = handler;
        this._nativeTokenGenerator = iNativeTokenGenerator;
        this._sdkMetrics = sDKMetricsSender;
        this._tokenStorage = tokenStorage;
    }

    @Override // com.unity3d.services.ads.token.AsyncTokenStorage
    public synchronized void setConfiguration(com.unity3d.services.core.configuration.Configuration configuration) {
        this._configuration = configuration;
        boolean zIsValidConfig = isValidConfig(configuration);
        this._configurationWasSet = zIsValidConfig;
        if (zIsValidConfig) {
            if (this._nativeTokenGenerator == null) {
                this._deviceInfoReaderBuilderWithExtras = new com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilderWithExtras(new com.unity3d.services.core.configuration.ConfigurationReader(), com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance(), com.unity3d.services.core.device.reader.GameSessionIdReader.getInstance());
                java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
                this._nativeTokenGenerator = new com.unity3d.services.ads.token.NativeTokenGenerator(executorServiceNewSingleThreadExecutor, this._deviceInfoReaderBuilderWithExtras);
                if (configuration.getExperiments().shouldNativeTokenAwaitPrivacy()) {
                    this._nativeTokenGenerator = new com.unity3d.services.ads.token.NativeTokenGeneratorWithPrivacyAwait(executorServiceNewSingleThreadExecutor, this._nativeTokenGenerator, configuration.getPrivacyRequestWaitTimeout());
                }
            }
            java.util.Iterator it = new java.util.ArrayList(this._tokenListeners).iterator();
            while (it.hasNext()) {
                handleTokenInvocation((com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.TokenListenerState) it.next());
            }
        }
    }

    @Override // com.unity3d.services.ads.token.AsyncTokenStorage
    public synchronized void onTokenAvailable() {
        this._tokenAvailable = true;
        if (this._configurationWasSet) {
            notifyListenersTokenReady();
        }
    }

    @Override // com.unity3d.services.ads.token.AsyncTokenStorage
    public synchronized void getToken(com.unity3d.services.ads.gmascar.managers.IBiddingManager iBiddingManager) {
        if (com.unity3d.services.core.properties.SdkProperties.getCurrentInitializationState() == com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_FAILED) {
            iBiddingManager.onUnityAdsTokenReady(null);
            sendTokenMetrics(null, com.unity3d.services.core.device.TokenType.TOKEN_REMOTE);
        } else if (com.unity3d.services.core.properties.SdkProperties.getCurrentInitializationState() == com.unity3d.services.core.properties.SdkProperties.InitializationState.NOT_INITIALIZED) {
            iBiddingManager.onUnityAdsTokenReady(null);
            sendTokenMetrics(null, com.unity3d.services.core.device.TokenType.TOKEN_REMOTE);
        } else {
            com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.TokenListenerState tokenListenerStateAddTimeoutHandler = addTimeoutHandler(iBiddingManager);
            if (this._configurationWasSet) {
                handleTokenInvocation(tokenListenerStateAddTimeoutHandler);
            }
        }
    }

    private synchronized com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.TokenListenerState addTimeoutHandler(com.unity3d.services.ads.gmascar.managers.IBiddingManager iBiddingManager) {
        final com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.TokenListenerState tokenListenerState;
        tokenListenerState = new com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.TokenListenerState();
        tokenListenerState.biddingManager = iBiddingManager;
        tokenListenerState.tokenType = com.unity3d.services.core.device.TokenType.TOKEN_REMOTE;
        tokenListenerState.runnable = new java.lang.Runnable() { // from class: com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.1
            @Override // java.lang.Runnable
            public void run() {
                com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.this.notifyTokenReady(tokenListenerState, null);
            }
        };
        this._tokenListeners.add(tokenListenerState);
        this._handler.postDelayed(tokenListenerState.runnable, this._configuration.getTokenTimeout());
        return tokenListenerState;
    }

    private synchronized void notifyListenersTokenReady() {
        java.lang.String token;
        while (!this._tokenListeners.isEmpty() && (token = this._tokenStorage.getToken()) != null) {
            notifyTokenReady(this._tokenListeners.get(0), token);
        }
    }

    private void handleTokenInvocation(final com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.TokenListenerState tokenListenerState) {
        if (tokenListenerState.invoked) {
            return;
        }
        tokenListenerState.invoked = true;
        if (!this._tokenAvailable) {
            tokenListenerState.tokenType = com.unity3d.services.core.device.TokenType.TOKEN_NATIVE;
            if (com.unity3d.services.ads.gmascar.GMA.getInstance().hasSCARBiddingSupport() && this._deviceInfoReaderBuilderWithExtras != null) {
                java.util.HashMap map = new java.util.HashMap();
                map.put(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_ID_KEY, tokenListenerState.biddingManager.getTokenIdentifier());
                this._deviceInfoReaderBuilderWithExtras.setExtras(map);
            }
            this._nativeTokenGenerator.generateToken(new com.unity3d.services.ads.token.INativeTokenGeneratorListener() { // from class: com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.2
                @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
                public void onReady(final java.lang.String str) {
                    com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.this._handler.post(new java.lang.Runnable() { // from class: com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.this.notifyTokenReady(tokenListenerState, str);
                        }
                    });
                }
            });
            return;
        }
        tokenListenerState.tokenType = com.unity3d.services.core.device.TokenType.TOKEN_REMOTE;
        java.lang.String token = this._tokenStorage.getToken();
        if (token == null || token.isEmpty()) {
            return;
        }
        notifyTokenReady(tokenListenerState, token);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyTokenReady(com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.TokenListenerState tokenListenerState, java.lang.String str) {
        if (this._tokenListeners.remove(tokenListenerState)) {
            tokenListenerState.biddingManager.onUnityAdsTokenReady(tokenListenerState.tokenType == com.unity3d.services.core.device.TokenType.TOKEN_REMOTE ? tokenListenerState.biddingManager.getFormattedToken(str) : str);
            try {
                this._handler.removeCallbacks(tokenListenerState.runnable);
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.exception("Failed to remove callback from a handler", e);
            }
        }
        sendTokenMetrics(str, tokenListenerState.tokenType);
    }

    /* JADX INFO: renamed from: com.unity3d.services.ads.token.InMemoryAsyncTokenStorage$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$device$TokenType;

        static {
            int[] iArr = new int[com.unity3d.services.core.device.TokenType.values().length];
            $SwitchMap$com$unity3d$services$core$device$TokenType = iArr;
            try {
                iArr[com.unity3d.services.core.device.TokenType.TOKEN_NATIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$device$TokenType[com.unity3d.services.core.device.TokenType.TOKEN_REMOTE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private void sendTokenMetrics(java.lang.String str, com.unity3d.services.core.device.TokenType tokenType) {
        int i = com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.AnonymousClass3.$SwitchMap$com$unity3d$services$core$device$TokenType[tokenType.ordinal()];
        if (i == 1) {
            sendNativeTokenMetrics(str);
        } else if (i == 2) {
            sendRemoteTokenMetrics(str);
        } else {
            com.unity3d.services.core.log.DeviceLog.error("Unknown token type passed to sendTokenMetrics");
        }
    }

    private void sendNativeTokenMetrics(java.lang.String str) {
        com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender = this._sdkMetrics;
        if (sDKMetricsSender == null) {
            return;
        }
        if (str == null) {
            sDKMetricsSender.sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newNativeGeneratedTokenNull(getMetricTags()));
        } else {
            sDKMetricsSender.sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newNativeGeneratedTokenAvailable(getMetricTags()));
        }
    }

    private void sendRemoteTokenMetrics(java.lang.String str) {
        if (this._sdkMetrics == null) {
            return;
        }
        if (str == null || str.isEmpty()) {
            this._sdkMetrics.sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newAsyncTokenNull(getMetricTags()));
        } else {
            this._sdkMetrics.sendMetric(com.unity3d.services.core.request.metrics.TSIMetric.newAsyncTokenAvailable(getMetricTags()));
        }
    }

    private java.util.Map<java.lang.String, java.lang.String> getMetricTags() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("state", this._initStatusReader.getInitializationStateString(com.unity3d.services.core.properties.SdkProperties.getCurrentInitializationState()));
        return map;
    }
}
