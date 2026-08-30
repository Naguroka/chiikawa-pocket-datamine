package com.unity3d.services.ads.operation.load;

/* JADX INFO: loaded from: classes6.dex */
public class LoadModuleDecoratorInitializationBuffer extends com.unity3d.services.ads.operation.load.LoadModuleDecorator implements com.unity3d.services.core.configuration.IInitializationListener {
    private static final java.lang.String errorMsgInitializationFailed = "[UnityAds] SDK Initialization Failed";
    private static final java.lang.String errorMsgInitializationFailure = "[UnityAds] SDK Initialization Failure";
    private java.util.concurrent.ConcurrentHashMap<com.unity3d.services.ads.operation.load.LoadOperationState, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker> _queuedLoadEvents;

    public LoadModuleDecoratorInitializationBuffer(com.unity3d.services.ads.operation.load.ILoadModule iLoadModule, com.unity3d.services.core.configuration.IInitializationNotificationCenter iInitializationNotificationCenter) {
        super(iLoadModule);
        iInitializationNotificationCenter.addListener(this);
        this._queuedLoadEvents = new java.util.concurrent.ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: com.unity3d.services.ads.operation.load.LoadModuleDecoratorInitializationBuffer$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState;

        static {
            int[] iArr = new int[com.unity3d.services.core.properties.SdkProperties.InitializationState.values().length];
            $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState = iArr;
            try {
                iArr[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[com.unity3d.services.core.properties.SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.load.LoadModuleDecorator, com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker iWebViewBridgeInvoker, com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState) {
        if (loadOperationState == null) {
            return;
        }
        int i = com.unity3d.services.ads.operation.load.LoadModuleDecoratorInitializationBuffer.AnonymousClass2.$SwitchMap$com$unity3d$services$core$properties$SdkProperties$InitializationState[com.unity3d.services.core.properties.SdkProperties.getCurrentInitializationState().ordinal()];
        if (i == 1) {
            super.executeAdOperation(iWebViewBridgeInvoker, loadOperationState);
        } else if (i == 2) {
            sendOnUnityAdsFailedToLoad(loadOperationState, com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failed");
        } else {
            this._queuedLoadEvents.put(loadOperationState, iWebViewBridgeInvoker);
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public synchronized void onSdkInitialized() {
        for (java.util.Map.Entry<com.unity3d.services.ads.operation.load.LoadOperationState, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker> entry : this._queuedLoadEvents.entrySet()) {
            super.executeAdOperation(entry.getValue(), entry.getKey());
        }
        this._queuedLoadEvents.clear();
    }

    @Override // com.unity3d.services.core.configuration.IInitializationListener
    public synchronized void onSdkInitializationFailed(java.lang.String str, com.unity3d.services.core.configuration.ErrorState errorState, int i) {
        java.util.Iterator<com.unity3d.services.ads.operation.load.LoadOperationState> it = this._queuedLoadEvents.keySet().iterator();
        while (it.hasNext()) {
            sendOnUnityAdsFailedToLoad(it.next(), com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failure");
        }
        this._queuedLoadEvents.clear();
    }

    private void sendOnUnityAdsFailedToLoad(final com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState, final com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, final java.lang.String str) {
        if (loadOperationState == null || loadOperationState.listener == null) {
            return;
        }
        getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdLoadFailure(unityAdsLoadError, java.lang.Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadModuleDecoratorInitializationBuffer.1
            @Override // java.lang.Runnable
            public void run() {
                loadOperationState.listener.onUnityAdsFailedToLoad(loadOperationState.placementId, unityAdsLoadError, str);
            }
        });
    }
}
