package com.unity3d.services.ads.operation.show;

/* JADX INFO: loaded from: classes6.dex */
public class ShowModuleDecorator implements com.unity3d.services.ads.operation.show.IShowModule {
    private final com.unity3d.services.ads.operation.show.IShowModule _showModule;

    public ShowModuleDecorator(com.unity3d.services.ads.operation.show.IShowModule iShowModule) {
        this._showModule = iShowModule;
    }

    @Override // com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker iWebViewBridgeInvoker, com.unity3d.services.ads.operation.show.ShowOperationState showOperationState) {
        this._showModule.executeAdOperation(iWebViewBridgeInvoker, showOperationState);
    }

    @Override // com.unity3d.services.ads.operation.IAdModule
    public com.unity3d.services.core.request.metrics.SDKMetricsSender getMetricSender() {
        return this._showModule.getMetricSender();
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowFailure(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2) {
        this._showModule.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowConsent(java.lang.String str) {
        this._showModule.onUnityAdsShowConsent(str);
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowStart(java.lang.String str) {
        this._showModule.onUnityAdsShowStart(str);
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowClick(java.lang.String str) {
        this._showModule.onUnityAdsShowClick(str);
    }

    @Override // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowComplete(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this._showModule.onUnityAdsShowComplete(str, unityAdsShowCompletionState);
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public com.unity3d.services.ads.operation.show.IShowOperation get(java.lang.String str) {
        return (com.unity3d.services.ads.operation.show.IShowOperation) this._showModule.get(str);
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void set(com.unity3d.services.ads.operation.show.IShowOperation iShowOperation) {
        this._showModule.set(iShowOperation);
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void remove(java.lang.String str) {
        this._showModule.remove(str);
    }
}
