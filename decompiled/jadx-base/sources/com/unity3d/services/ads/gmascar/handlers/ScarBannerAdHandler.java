package com.unity3d.services.ads.gmascar.handlers;

/* JADX INFO: loaded from: classes6.dex */
public class ScarBannerAdHandler implements com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper {
    private java.lang.String _operationId;

    public ScarBannerAdHandler(java.lang.String str) {
        this._operationId = str;
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdLoaded() {
        com.unity3d.services.banners.BannerViewCache.getInstance().addScarContainer(this._operationId);
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_LOADED, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdFailedToLoad(int i, java.lang.String str) {
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, this._operationId, java.lang.Integer.valueOf(i), str);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdOpened() {
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_OPENED, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClicked() {
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_CLICKED, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_CLOSED, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper
    public void onAdImpression() {
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_IMPRESSION, this._operationId);
    }
}
