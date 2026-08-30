package com.unity3d.services.ads.webplayer;

/* JADX INFO: loaded from: classes6.dex */
public class WebPlayerBridgeInterface {
    private final java.lang.String viewId;

    public WebPlayerBridgeInterface(java.lang.String str) {
        this.viewId = str;
    }

    @android.webkit.JavascriptInterface
    public void handleEvent(java.lang.String str) {
        if (com.unity3d.services.core.webview.WebViewApp.getCurrentApp() != null) {
            com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.WEBPLAYER_EVENT, str, this.viewId);
        }
    }
}
