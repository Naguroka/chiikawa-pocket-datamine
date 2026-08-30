package com.unity3d.services.ads.webplayer;

/* JADX INFO: loaded from: classes6.dex */
public class WebPlayerEventBridge {
    public static void error(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.ERROR, str2, str3, str);
        }
    }

    public static void sendFrameUpdate(java.lang.String str, int i, int i2, int i3, int i4, float f) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.FRAME_UPDATE, str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Float.valueOf(f));
        }
    }

    public static void sendGetFrameResponse(java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, float f) {
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.GET_FRAME_RESPONSE, str, str2, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Float.valueOf(f));
        }
    }
}
