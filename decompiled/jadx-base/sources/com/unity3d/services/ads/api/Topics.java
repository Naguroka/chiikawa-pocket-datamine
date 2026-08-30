package com.unity3d.services.ads.api;

/* JADX INFO: loaded from: classes6.dex */
public class Topics {
    private static final com.unity3d.services.ads.topics.TopicsService topicsService = (com.unity3d.services.ads.topics.TopicsService) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.ads.topics.TopicsService.class);

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void checkAvailability(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        webViewCallback.invoke(topicsService.checkAvailability());
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getTopics(java.lang.String str, java.lang.Boolean bool, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        topicsService.getTopics(str, bool.booleanValue());
        webViewCallback.invoke(new java.lang.Object[0]);
    }
}
