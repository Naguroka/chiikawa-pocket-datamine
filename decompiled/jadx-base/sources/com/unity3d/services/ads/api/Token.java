package com.unity3d.services.ads.api;

/* JADX INFO: loaded from: classes6.dex */
public class Token {
    private static final com.unity3d.services.ads.token.TokenStorage tokenStorage = (com.unity3d.services.ads.token.TokenStorage) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.ads.token.TokenStorage.class);

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void createTokens(org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        try {
            tokenStorage.createTokens(jSONArray);
            webViewCallback.invoke(new java.lang.Object[0]);
        } catch (org.json.JSONException e) {
            webViewCallback.error(com.unity3d.services.ads.token.TokenError.JSON_EXCEPTION, e.getMessage());
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void appendTokens(org.json.JSONArray jSONArray, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        try {
            tokenStorage.appendTokens(jSONArray);
            webViewCallback.invoke(new java.lang.Object[0]);
        } catch (org.json.JSONException e) {
            webViewCallback.error(com.unity3d.services.ads.token.TokenError.JSON_EXCEPTION, e.getMessage());
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void deleteTokens(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        tokenStorage.deleteTokens();
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getNativeGeneratedToken(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        tokenStorage.getNativeGeneratedToken();
        webViewCallback.invoke(new java.lang.Object[0]);
    }
}
