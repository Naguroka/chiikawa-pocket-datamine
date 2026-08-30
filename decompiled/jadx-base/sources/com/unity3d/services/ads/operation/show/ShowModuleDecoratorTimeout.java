package com.unity3d.services.ads.operation.show;

/* JADX INFO: loaded from: classes6.dex */
public class ShowModuleDecoratorTimeout extends com.unity3d.services.ads.operation.show.ShowModuleDecorator {
    private static final java.lang.String errorMsgTimeout = "[UnityAds] Timeout while trying to show ";
    private final com.unity3d.services.core.configuration.ExperimentsReader _experimentsReader;

    public ShowModuleDecoratorTimeout(com.unity3d.services.ads.operation.show.IShowModule iShowModule, com.unity3d.services.core.configuration.ExperimentsReader experimentsReader) {
        super(iShowModule);
        this._experimentsReader = experimentsReader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker iWebViewBridgeInvoker, com.unity3d.services.ads.operation.show.ShowOperationState showOperationState) {
        getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdShowStart());
        showOperationState.start();
        if (!this._experimentsReader.getCurrentlyActiveExperiments().isNativeShowTimeoutDisabled()) {
            startShowTimeout(showOperationState);
        }
        super.executeAdOperation(iWebViewBridgeInvoker, showOperationState);
    }

    private void startShowTimeout(final com.unity3d.services.ads.operation.show.ShowOperationState showOperationState) {
        if (showOperationState == null) {
            return;
        }
        showOperationState.timeoutTimer = new com.unity3d.services.core.timer.BaseTimer(java.lang.Integer.valueOf(showOperationState.configuration.getShowTimeout()), new com.unity3d.services.core.timer.ITimerListener() { // from class: com.unity3d.services.ads.operation.show.ShowModuleDecoratorTimeout.1
            @Override // com.unity3d.services.core.timer.ITimerListener
            public void onTimerFinished() {
                com.unity3d.services.ads.operation.show.ShowModuleDecoratorTimeout.this.onOperationTimeout(showOperationState, com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT, "[UnityAds] Timeout while trying to show " + showOperationState.placementId);
            }
        });
        showOperationState.timeoutTimer.start(java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
    }

    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowConsent(java.lang.String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowConsent(str);
    }

    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowFailure(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    @Override // com.unity3d.services.ads.operation.show.ShowModuleDecorator, com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowStart(java.lang.String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowStart(str);
    }

    private void releaseOperationTimeoutLock(java.lang.String str) {
        com.unity3d.services.ads.operation.show.ShowOperationState showOperationState;
        com.unity3d.services.core.timer.BaseTimer baseTimer;
        com.unity3d.services.ads.operation.show.IShowOperation iShowOperation = get(str);
        if (iShowOperation == null || (showOperationState = iShowOperation.getShowOperationState()) == null || (baseTimer = showOperationState.timeoutTimer) == null) {
            return;
        }
        baseTimer.kill();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOperationTimeout(final com.unity3d.services.ads.operation.show.ShowOperationState showOperationState, final com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, final java.lang.String str) {
        if (showOperationState != null) {
            getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdShowFailure(com.unity3d.services.core.request.metrics.AdOperationError.timeout, java.lang.Long.valueOf(showOperationState.duration())));
            remove(showOperationState.id);
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowModuleDecoratorTimeout$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    showOperationState.onUnityAdsShowFailure(unityAdsShowError, str);
                }
            });
        }
    }
}
