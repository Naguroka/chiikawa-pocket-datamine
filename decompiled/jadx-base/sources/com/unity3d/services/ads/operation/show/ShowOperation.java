package com.unity3d.services.ads.operation.show;

/* JADX INFO: loaded from: classes6.dex */
public class ShowOperation extends com.unity3d.services.ads.operation.AdOperation implements com.unity3d.services.ads.operation.show.IShowOperation {
    private com.unity3d.services.ads.operation.show.ShowOperationState showOperationState;

    public ShowOperation(com.unity3d.services.ads.operation.show.ShowOperationState showOperationState, com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation iWebViewBridgeInvocation) {
        super(iWebViewBridgeInvocation, com.json.j5.v);
        this.showOperationState = showOperationState;
    }

    @Override // com.unity3d.services.ads.operation.show.IShowOperation
    public com.unity3d.services.ads.operation.show.ShowOperationState getShowOperationState() {
        return this.showOperationState;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(java.lang.String str, final com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, final java.lang.String str2) {
        com.unity3d.services.ads.operation.show.ShowOperationState showOperationState = this.showOperationState;
        if (showOperationState == null || showOperationState.listener == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.operation.show.ShowOperation.this.showOperationState != null) {
                    com.unity3d.services.ads.operation.show.ShowOperation.this.showOperationState.onUnityAdsShowFailure(unityAdsShowError, str2);
                }
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(final java.lang.String str) {
        if (this.showOperationState == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.operation.show.ShowOperation.this.showOperationState != null) {
                    com.unity3d.services.ads.operation.show.ShowOperation.this.showOperationState.onUnityAdsShowStart(str);
                }
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(java.lang.String str) {
        if (this.showOperationState == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.operation.show.ShowOperation.this.showOperationState != null) {
                    com.unity3d.services.ads.operation.show.ShowOperation.this.showOperationState.onUnityAdsShowClick();
                }
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(java.lang.String str, final com.unity3d.ads.UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (this.showOperationState == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.operation.show.ShowOperation.this.showOperationState != null) {
                    com.unity3d.services.ads.operation.show.ShowOperation.this.showOperationState.onUnityAdsShowComplete(unityAdsShowCompletionState);
                }
            }
        });
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public java.lang.String getId() {
        return this.showOperationState.id;
    }
}
