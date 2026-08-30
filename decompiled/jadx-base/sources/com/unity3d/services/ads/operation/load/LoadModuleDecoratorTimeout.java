package com.unity3d.services.ads.operation.load;

/* JADX INFO: loaded from: classes6.dex */
public class LoadModuleDecoratorTimeout extends com.unity3d.services.ads.operation.load.LoadModuleDecorator {
    private static final java.lang.String errorMsgTimeoutLoading = "[UnityAds] Timeout while loading ";
    private final com.unity3d.services.core.configuration.ExperimentsReader _experimentsReader;

    public LoadModuleDecoratorTimeout(com.unity3d.services.ads.operation.load.ILoadModule iLoadModule, com.unity3d.services.core.configuration.ExperimentsReader experimentsReader) {
        super(iLoadModule);
        this._experimentsReader = experimentsReader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.load.LoadModuleDecorator, com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker iWebViewBridgeInvoker, com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState) {
        getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdLoadStart(loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
        loadOperationState.start();
        if (!this._experimentsReader.getCurrentlyActiveExperiments().isNativeLoadTimeoutDisabled()) {
            startLoadTimeout(loadOperationState);
        }
        super.executeAdOperation(iWebViewBridgeInvoker, loadOperationState);
    }

    private void startLoadTimeout(final com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState) {
        if (loadOperationState == null) {
            return;
        }
        loadOperationState.timeoutTimer = new com.unity3d.services.core.timer.BaseTimer(java.lang.Integer.valueOf(loadOperationState.configuration.getLoadTimeout()), new com.unity3d.services.core.timer.ITimerListener() { // from class: com.unity3d.services.ads.operation.load.LoadModuleDecoratorTimeout.1
            @Override // com.unity3d.services.core.timer.ITimerListener
            public void onTimerFinished() {
                com.unity3d.services.ads.operation.load.LoadModuleDecoratorTimeout.this.onOperationTimeout(loadOperationState);
            }
        });
        loadOperationState.timeoutTimer.start(java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
    }

    @Override // com.unity3d.services.ads.operation.load.LoadModuleDecorator, com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsAdLoaded(java.lang.String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsAdLoaded(str);
    }

    @Override // com.unity3d.services.ads.operation.load.LoadModuleDecorator, com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsFailedToLoad(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str2) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsFailedToLoad(str, unityAdsLoadError, str2);
    }

    private void releaseOperationTimeoutLock(java.lang.String str) {
        com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState;
        com.unity3d.services.core.timer.BaseTimer baseTimer;
        com.unity3d.services.ads.operation.load.ILoadOperation iLoadOperation = get(str);
        if (iLoadOperation == null || (loadOperationState = iLoadOperation.getLoadOperationState()) == null || (baseTimer = loadOperationState.timeoutTimer) == null) {
            return;
        }
        baseTimer.kill();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOperationTimeout(final com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState) {
        if (loadOperationState != null) {
            getMetricSender().sendMetricWithInitState(com.unity3d.services.core.request.metrics.AdOperationMetric.newAdLoadFailure(com.unity3d.services.core.request.metrics.AdOperationError.timeout, java.lang.Long.valueOf(loadOperationState.duration()), loadOperationState.isBanner(), loadOperationState.isHeaderBidding()));
            remove(loadOperationState.id);
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadModuleDecoratorTimeout$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState2 = loadOperationState;
                    loadOperationState2.onUnityAdsFailedToLoad(com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT, "[UnityAds] Timeout while loading " + loadOperationState2.placementId);
                }
            });
        }
    }
}
