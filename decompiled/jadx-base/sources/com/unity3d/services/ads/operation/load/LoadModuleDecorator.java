package com.unity3d.services.ads.operation.load;

/* JADX INFO: loaded from: classes6.dex */
public class LoadModuleDecorator implements com.unity3d.services.ads.operation.load.ILoadModule {
    private final com.unity3d.services.ads.operation.load.ILoadModule _loadModule;

    public LoadModuleDecorator(com.unity3d.services.ads.operation.load.ILoadModule iLoadModule) {
        this._loadModule = iLoadModule;
    }

    @Override // com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker iWebViewBridgeInvoker, com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState) {
        this._loadModule.executeAdOperation(iWebViewBridgeInvoker, loadOperationState);
    }

    @Override // com.unity3d.services.ads.operation.IAdModule
    public com.unity3d.services.core.request.metrics.SDKMetricsSender getMetricSender() {
        return this._loadModule.getMetricSender();
    }

    @Override // com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsAdLoaded(java.lang.String str) {
        this._loadModule.onUnityAdsAdLoaded(str);
    }

    @Override // com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsFailedToLoad(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, java.lang.String str2) {
        this._loadModule.onUnityAdsFailedToLoad(str, unityAdsLoadError, str2);
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public com.unity3d.services.ads.operation.load.ILoadOperation get(java.lang.String str) {
        return (com.unity3d.services.ads.operation.load.ILoadOperation) this._loadModule.get(str);
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void set(com.unity3d.services.ads.operation.load.ILoadOperation iLoadOperation) {
        this._loadModule.set(iLoadOperation);
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void remove(java.lang.String str) {
        this._loadModule.remove(str);
    }
}
