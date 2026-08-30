package com.unity3d.services.ads.operation.load;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseLoadModule extends com.unity3d.services.ads.operation.AdModule<com.unity3d.services.ads.operation.load.ILoadOperation, com.unity3d.services.ads.operation.load.LoadOperationState> implements com.unity3d.services.ads.operation.load.ILoadModule {
    static final java.lang.String errorMsgFailedToCreateLoadRequest = "[UnityAds] Failed to create load request";
    static final java.lang.String errorMsgInternalCommunicationFailure = "[UnityAds] Internal communication failure";
    static final java.lang.String errorMsgInternalCommunicationTimeout = "[UnityAds] Internal communication timeout";
    static final java.lang.String errorMsgPlacementIdNull = "[UnityAds] Placement ID cannot be null";

    abstract void addOptionalParameters(com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState, org.json.JSONObject jSONObject) throws org.json.JSONException;

    public BaseLoadModule(com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender) {
        super(sDKMetricsSender);
    }

    @Override // com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker iWebViewBridgeInvoker, final com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState) {
        if (android.text.TextUtils.isEmpty(loadOperationState.placementId)) {
            sendOnUnityAdsFailedToLoad(loadOperationState, com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "[UnityAds] Placement ID cannot be null", true);
            return;
        }
        com.unity3d.services.ads.operation.load.LoadOperation loadOperation = new com.unity3d.services.ads.operation.load.LoadOperation(loadOperationState, new com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocation(this._executorService, iWebViewBridgeInvoker, new com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback() { // from class: com.unity3d.services.ads.operation.load.BaseLoadModule.1
            @Override // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onSuccess() {
            }

            @Override // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onFailure(java.lang.String str, com.unity3d.services.core.webview.bridge.CallbackStatus callbackStatus) {
                com.unity3d.services.ads.operation.load.BaseLoadModule.this.getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdLoadFailure(com.unity3d.services.core.request.metrics.AdOperationError.callback_error, java.lang.Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
                com.unity3d.services.ads.operation.load.BaseLoadModule.this.sendOnUnityAdsFailedToLoad(loadOperationState, com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", false);
                com.unity3d.services.ads.operation.load.BaseLoadModule.this.remove(loadOperationState.getId());
            }

            @Override // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onTimeout() {
                com.unity3d.services.ads.operation.load.BaseLoadModule.this.getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdLoadFailure(com.unity3d.services.core.request.metrics.AdOperationError.callback_timeout, java.lang.Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
                com.unity3d.services.ads.operation.load.BaseLoadModule.this.sendOnUnityAdsFailedToLoad(loadOperationState, com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication timeout", false);
                com.unity3d.services.ads.operation.load.BaseLoadModule.this.remove(loadOperationState.getId());
            }
        }));
        try {
            org.json.JSONObject jSONObjectBuildBaseParameters = buildBaseParameters(loadOperationState, loadOperation);
            set(loadOperation);
            loadOperation.invoke(loadOperationState.configuration.getWebViewBridgeTimeout(), jSONObjectBuildBaseParameters);
        } catch (java.lang.NullPointerException | org.json.JSONException unused) {
            sendOnUnityAdsFailedToLoad(loadOperationState, com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Failed to create load request", true);
        }
    }

    org.json.JSONObject buildBaseParameters(com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState, com.unity3d.services.ads.operation.load.LoadOperation loadOperation) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObjectBuildBaseOptions = buildBaseOptions(loadOperationState);
        jSONObjectBuildBaseOptions.put("headerBiddingOptions", loadOperationState.loadOptions.getData());
        jSONObject.put("options", jSONObjectBuildBaseOptions);
        jSONObject.put("listenerId", loadOperation.getId());
        jSONObject.put(com.json.y8.j, loadOperationState.placementId);
        jSONObject.put("time", com.unity3d.services.core.device.Device.getElapsedRealtime());
        addOptionalParameters(loadOperationState, jSONObject);
        return jSONObject;
    }

    org.json.JSONObject buildBaseOptions(com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("headerBiddingOptions", loadOperationState.loadOptions.getData());
        return jSONObject;
    }

    @Override // com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsAdLoaded(java.lang.String str) {
        com.unity3d.services.ads.operation.load.ILoadOperation iLoadOperation = (com.unity3d.services.ads.operation.load.ILoadOperation) get(str);
        if (iLoadOperation == null || iLoadOperation.getLoadOperationState() == null) {
            return;
        }
        com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState = iLoadOperation.getLoadOperationState();
        getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdLoadSuccess(java.lang.Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
        iLoadOperation.onUnityAdsAdLoaded(loadOperationState.placementId);
        remove(str);
    }

    @Override // com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsFailedToLoad(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str2) {
        com.unity3d.services.ads.operation.load.ILoadOperation iLoadOperation = (com.unity3d.services.ads.operation.load.ILoadOperation) get(str);
        if (iLoadOperation == null || iLoadOperation.getLoadOperationState() == null) {
            return;
        }
        com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState = iLoadOperation.getLoadOperationState();
        getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdLoadFailure(unityAdsLoadError, java.lang.Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
        iLoadOperation.onUnityAdsFailedToLoad(loadOperationState.placementId, unityAdsLoadError, str2);
        remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendOnUnityAdsFailedToLoad(final com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState, final com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, final java.lang.String str, boolean z) {
        if (loadOperationState == null || loadOperationState.listener == null) {
            return;
        }
        if (z) {
            getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdLoadFailure(unityAdsLoadError, java.lang.Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
        }
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.load.BaseLoadModule.2
            @Override // java.lang.Runnable
            public void run() {
                loadOperationState.onUnityAdsFailedToLoad(unityAdsLoadError, str);
            }
        });
    }
}
