package com.unity3d.services.analytics.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Analytics {
    public static com.unity3d.services.analytics.interfaces.IAnalytics analyticsInterface;

    public static void setAnalyticsInterface(com.unity3d.services.analytics.interfaces.IAnalytics iAnalytics) {
        analyticsInterface = iAnalytics;
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void addExtras(final java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (analyticsInterface != null) {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.analytics.core.api.Analytics.1
                @Override // java.lang.Runnable
                public void run() {
                    com.unity3d.services.analytics.core.api.Analytics.analyticsInterface.onAddExtras(str);
                }
            });
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.analytics.interfaces.AnalyticsError.API_NOT_FOUND, str);
        }
    }
}
