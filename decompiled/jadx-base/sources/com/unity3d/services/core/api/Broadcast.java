package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Broadcast {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void addBroadcastListener(java.lang.String str, org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        addBroadcastListener(str, null, jSONArray, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void addBroadcastListener(java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        try {
            if (jSONArray.length() > 0) {
                java.lang.String[] strArr = new java.lang.String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                com.unity3d.services.core.broadcast.BroadcastMonitor.getInstance().addBroadcastListener(str, str2, strArr);
            }
            webViewCallback.invoke(new java.lang.Object[0]);
        } catch (org.json.JSONException unused) {
            webViewCallback.error(com.unity3d.services.core.broadcast.BroadcastError.JSON_ERROR, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void removeBroadcastListener(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.broadcast.BroadcastMonitor.getInstance().removeBroadcastListener(str);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void removeAllBroadcastListeners(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.broadcast.BroadcastMonitor.getInstance().removeAllBroadcastListeners();
        webViewCallback.invoke(new java.lang.Object[0]);
    }
}
