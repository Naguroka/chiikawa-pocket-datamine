package com.unity3d.services.ads.operation.show;

/* JADX INFO: loaded from: classes6.dex */
public class ShowModule extends com.unity3d.services.ads.operation.AdModule<com.unity3d.services.ads.operation.show.IShowOperation, com.unity3d.services.ads.operation.show.ShowOperationState> implements com.unity3d.services.ads.operation.show.IShowModule {
    public static java.lang.String errorMsgPlacementIdNull = "[UnityAds] Placement ID cannot be null";
    private static com.unity3d.services.ads.operation.show.IShowModule instance;

    public static com.unity3d.services.ads.operation.show.IShowModule getInstance() {
        if (instance == null) {
            instance = new com.unity3d.services.ads.operation.show.ShowModuleDecoratorTimeout(new com.unity3d.services.ads.operation.show.ShowModule((com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class)), new com.unity3d.services.core.configuration.ExperimentsReader());
        }
        return instance;
    }

    public ShowModule(com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender) {
        super(sDKMetricsSender);
    }

    @Override // com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker iWebViewBridgeInvoker, final com.unity3d.services.ads.operation.show.ShowOperationState showOperationState) {
        if (android.text.TextUtils.isEmpty(showOperationState.placementId)) {
            sendOnUnityAdsFailedToShow(showOperationState, errorMsgPlacementIdNull, com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT, true);
            return;
        }
        com.unity3d.services.ads.operation.show.ShowOperation showOperation = new com.unity3d.services.ads.operation.show.ShowOperation(showOperationState, new com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocation(this._executorService, iWebViewBridgeInvoker, new com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback() { // from class: com.unity3d.services.ads.operation.show.ShowModule.1
            @Override // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onSuccess() {
            }

            @Override // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onFailure(java.lang.String str, com.unity3d.services.core.webview.bridge.CallbackStatus callbackStatus) {
                com.unity3d.services.ads.operation.show.ShowModule.this.getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdShowFailure(com.unity3d.services.core.request.metrics.AdOperationError.callback_error, java.lang.Long.valueOf(showOperationState.duration())));
                com.unity3d.services.ads.operation.show.ShowModule.this.sendOnUnityAdsFailedToShow(showOperationState, str, com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR, false);
                com.unity3d.services.ads.operation.show.ShowModule.this.remove(showOperationState.id);
            }

            @Override // com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback
            public void onTimeout() {
                com.unity3d.services.ads.operation.show.ShowModule.this.getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdShowFailure(com.unity3d.services.core.request.metrics.AdOperationError.callback_timeout, java.lang.Long.valueOf(showOperationState.duration())));
                com.unity3d.services.ads.operation.show.ShowModule.this.sendOnUnityAdsFailedToShow(showOperationState, "[UnityAds] Show Invocation Timeout", com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR, false);
                com.unity3d.services.ads.operation.show.ShowModule.this.remove(showOperationState.id);
            }
        }));
        android.app.Activity activity = showOperationState.activity.get();
        com.unity3d.services.core.properties.ClientProperties.setActivity(activity);
        android.view.Display defaultDisplay = ((android.view.WindowManager) activity.getSystemService("window")).getDefaultDisplay();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("requestedOrientation", activity.getRequestedOrientation());
            jSONObject3.put(androidx.constraintlayout.motion.widget.Key.ROTATION, defaultDisplay.getRotation());
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getSize(point);
            jSONObject3.put("width", point.x);
            jSONObject3.put("height", point.y);
            jSONObject2.put("display", jSONObject3);
            jSONObject2.put("headerBiddingOptions", showOperationState.showOptions.getData());
            jSONObject.put("options", jSONObject2);
            jSONObject.put("listenerId", showOperation.getId());
            jSONObject.put(com.json.y8.j, showOperationState.placementId);
            jSONObject.put("time", com.unity3d.services.core.device.Device.getElapsedRealtime());
            set(showOperation);
            showOperation.invoke(showOperationState.configuration.getWebViewBridgeTimeout(), jSONObject);
            com.unity3d.services.core.device.reader.HdrInfoReader.getInstance().captureHDRCapabilityMetrics(activity, new com.unity3d.services.core.configuration.ExperimentsReader());
        } catch (java.lang.NullPointerException unused) {
            sendOnUnityAdsFailedToShow(showOperationState, "[UnityAds] Error creating show options", com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR, true);
        } catch (org.json.JSONException unused2) {
            sendOnUnityAdsFailedToShow(showOperationState, "[UnityAds] Error creating show options", com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR, true);
        }
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowFailure(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2) {
        com.unity3d.services.ads.operation.show.IShowOperation iShowOperation = (com.unity3d.services.ads.operation.show.IShowOperation) get(str);
        if (iShowOperation == null || iShowOperation.getShowOperationState() == null) {
            return;
        }
        com.unity3d.services.ads.operation.show.ShowOperationState showOperationState = iShowOperation.getShowOperationState();
        getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdShowFailure(unityAdsShowError, java.lang.Long.valueOf(showOperationState.duration())));
        iShowOperation.onUnityAdsShowFailure(showOperationState.placementId, unityAdsShowError, str2);
        remove(str);
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowConsent(java.lang.String str) {
        com.unity3d.services.ads.operation.show.IShowOperation iShowOperation = (com.unity3d.services.ads.operation.show.IShowOperation) get(str);
        if (iShowOperation != null) {
            iShowOperation.getShowOperationState();
        }
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowStart(java.lang.String str) {
        com.unity3d.services.ads.operation.show.IShowOperation iShowOperation = (com.unity3d.services.ads.operation.show.IShowOperation) get(str);
        if (iShowOperation == null || iShowOperation.getShowOperationState() == null) {
            return;
        }
        iShowOperation.onUnityAdsShowStart(iShowOperation.getShowOperationState().placementId);
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowClick(java.lang.String str) {
        com.unity3d.services.ads.operation.show.IShowOperation iShowOperation = (com.unity3d.services.ads.operation.show.IShowOperation) get(str);
        if (iShowOperation == null || iShowOperation.getShowOperationState() == null) {
            return;
        }
        iShowOperation.onUnityAdsShowClick(iShowOperation.getShowOperationState().placementId);
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowComplete(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        com.unity3d.services.ads.operation.show.IShowOperation iShowOperation = (com.unity3d.services.ads.operation.show.IShowOperation) get(str);
        if (iShowOperation == null || iShowOperation.getShowOperationState() == null) {
            return;
        }
        com.unity3d.services.ads.operation.show.ShowOperationState showOperationState = iShowOperation.getShowOperationState();
        getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdShowSuccess(java.lang.Long.valueOf(showOperationState.duration())));
        iShowOperation.onUnityAdsShowComplete(showOperationState.placementId, unityAdsShowCompletionState);
        remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendOnUnityAdsFailedToShow(final com.unity3d.services.ads.operation.show.ShowOperationState showOperationState, final java.lang.String str, final com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, boolean z) {
        if (showOperationState == null || showOperationState.listener == null) {
            return;
        }
        if (z) {
            getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdShowFailure(unityAdsShowError, java.lang.Long.valueOf(showOperationState.duration())));
        }
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowModule.2
            @Override // java.lang.Runnable
            public void run() {
                showOperationState.onUnityAdsShowFailure(unityAdsShowError, str);
            }
        });
    }
}
