package com.unity3d.services.ads.api;

/* JADX INFO: loaded from: classes6.dex */
public class WebPlayer {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setUrl(final java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        final com.unity3d.services.ads.webplayer.WebPlayerView webPlayer = com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().getWebPlayer(str2);
        if (webPlayer != null) {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.1
                @Override // java.lang.Runnable
                public void run() {
                    webPlayer.loadUrl(str);
                }
            });
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.webplayer.WebPlayerError.WEBPLAYER_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setData(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, java.lang.String str4, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        final com.unity3d.services.ads.webplayer.WebPlayerView webPlayer = com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().getWebPlayer(str4);
        if (webPlayer != null) {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.2
                @Override // java.lang.Runnable
                public void run() {
                    webPlayer.loadData(str, str2, str3);
                }
            });
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.webplayer.WebPlayerError.WEBPLAYER_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setDataWithUrl(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, java.lang.String str5, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        final com.unity3d.services.ads.webplayer.WebPlayerView webPlayer = com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().getWebPlayer(str5);
        if (webPlayer != null) {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.3
                @Override // java.lang.Runnable
                public void run() {
                    webPlayer.loadDataWithBaseURL(str, str2, str3, str4, null);
                }
            });
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.webplayer.WebPlayerError.WEBPLAYER_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setSettings(final org.json.JSONObject jSONObject, final org.json.JSONObject jSONObject2, java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.webplayer.WebPlayerSettingsCache.getInstance().addWebSettings(str, jSONObject);
        com.unity3d.services.ads.webplayer.WebPlayerSettingsCache.getInstance().addWebPlayerSettings(str, jSONObject2);
        final com.unity3d.services.ads.webplayer.WebPlayerView webPlayer = com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer != null) {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.4
                @Override // java.lang.Runnable
                public void run() {
                    webPlayer.setSettings(jSONObject, jSONObject2);
                }
            });
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.webplayer.WebPlayerError.WEBPLAYER_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setEventSettings(final org.json.JSONObject jSONObject, java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.webplayer.WebPlayerSettingsCache.getInstance().addWebPlayerEventSettings(str, jSONObject);
        final com.unity3d.services.ads.webplayer.WebPlayerView webPlayer = com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer != null) {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    webPlayer.setEventSettings(jSONObject);
                }
            });
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.webplayer.WebPlayerError.WEBPLAYER_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void clearSettings(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.webplayer.WebPlayerSettingsCache webPlayerSettingsCache = com.unity3d.services.ads.webplayer.WebPlayerSettingsCache.getInstance();
        webPlayerSettingsCache.removeWebSettings(str);
        webPlayerSettingsCache.removeWebPlayerSettings(str);
        webPlayerSettingsCache.removeWebPlayerEventSettings(str);
        final com.unity3d.services.ads.webplayer.WebPlayerView webPlayer = com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer != null) {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.6
                @Override // java.lang.Runnable
                public void run() {
                    webPlayer.setSettings(new org.json.JSONObject(), new org.json.JSONObject());
                    webPlayer.setEventSettings(new org.json.JSONObject());
                }
            });
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.webplayer.WebPlayerError.WEBPLAYER_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getErroredSettings(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.webplayer.WebPlayerView webPlayer = com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer != null) {
            java.util.Map<java.lang.String, java.lang.String> erroredSettings = webPlayer.getErroredSettings();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : erroredSettings.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.exception("Error forming JSON object", e);
            }
            webViewCallback.invoke(jSONObject);
            webViewCallback.invoke(new java.lang.Object[0]);
            return;
        }
        webViewCallback.error(com.unity3d.services.ads.webplayer.WebPlayerError.WEBPLAYER_NULL, new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void sendEvent(org.json.JSONArray jSONArray, java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.webplayer.WebPlayerView webPlayer = com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer != null) {
            webPlayer.sendEvent(jSONArray);
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.webplayer.WebPlayerError.WEBPLAYER_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getFrame(final java.lang.String str, final java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(new java.lang.Object[0]);
        final com.unity3d.services.ads.webplayer.WebPlayerView webPlayer = com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().getWebPlayer(str2);
        if (webPlayer != null) {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.7
                @Override // java.lang.Runnable
                public void run() {
                    int[] iArr = new int[2];
                    webPlayer.getLocationOnScreen(iArr);
                    com.unity3d.services.ads.webplayer.WebPlayerEventBridge.sendGetFrameResponse(str, str2, iArr[0], iArr[1], webPlayer.getWidth(), webPlayer.getHeight(), webPlayer.getAlpha());
                }
            });
        }
    }
}
