package com.unity3d.services.ads.gmascar.handlers;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewErrorHandler implements com.unity3d.scar.adapter.common.IAdsErrorHandler<com.unity3d.scar.adapter.common.WebViewAdsError> {
    private final com.unity3d.services.core.webview.bridge.IEventSender _eventSender;

    public WebViewErrorHandler() {
        this(com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public WebViewErrorHandler(com.unity3d.services.core.webview.bridge.IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }

    @Override // com.unity3d.scar.adapter.common.IAdsErrorHandler
    public void handleError(com.unity3d.scar.adapter.common.WebViewAdsError webViewAdsError) {
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.valueOf(webViewAdsError.getDomain()), webViewAdsError.getErrorCategory(), webViewAdsError.getErrorArguments());
    }
}
