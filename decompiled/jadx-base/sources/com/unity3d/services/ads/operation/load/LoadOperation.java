package com.unity3d.services.ads.operation.load;

/* JADX INFO: loaded from: classes6.dex */
public class LoadOperation extends com.unity3d.services.ads.operation.AdOperation implements com.unity3d.services.ads.operation.load.ILoadOperation {
    private com.unity3d.services.ads.operation.load.LoadOperationState _loadOperationState;

    public LoadOperation(com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState, com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation iWebViewBridgeInvocation) {
        super(iWebViewBridgeInvocation, "load");
        this._loadOperationState = loadOperationState;
    }

    @Override // com.unity3d.services.ads.operation.load.ILoadOperation
    public com.unity3d.services.ads.operation.load.LoadOperationState getLoadOperationState() {
        return this._loadOperationState;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(java.lang.String str) {
        com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState = this._loadOperationState;
        if (loadOperationState == null || loadOperationState.listener == null || str == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadOperation.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.operation.load.LoadOperation.this._loadOperationState != null) {
                    com.unity3d.services.ads.operation.load.LoadOperation.this._loadOperationState.onUnityAdsAdLoaded();
                }
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(java.lang.String str, final com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError, final java.lang.String str2) {
        com.unity3d.services.ads.operation.load.LoadOperationState loadOperationState = this._loadOperationState;
        if (loadOperationState == null || loadOperationState.listener == null || str == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadOperation.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.operation.load.LoadOperation.this._loadOperationState != null) {
                    com.unity3d.services.ads.operation.load.LoadOperation.this._loadOperationState.onUnityAdsFailedToLoad(unityAdsLoadError, str2);
                }
            }
        });
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public java.lang.String getId() {
        return this._loadOperationState.id;
    }
}
