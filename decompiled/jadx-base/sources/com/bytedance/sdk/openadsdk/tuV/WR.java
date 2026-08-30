package com.bytedance.sdk.openadsdk.tuV;

/* JADX INFO: loaded from: classes4.dex */
public class WR {
    private static void IL(android.webkit.WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    private static void bg(android.webkit.WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    public static void bg(android.webkit.WebView webView) {
        if (webView == null) {
            return;
        }
        IL(webView);
        android.webkit.WebSettings settings = webView.getSettings();
        bg(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (java.lang.Throwable th2) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z = android.os.Build.VERSION.SDK_INT >= 28;
        try {
            if (!z) {
                webView.setLayerType(0, null);
            } else {
                if (z) {
                    webView.setLayerType(2, null);
                }
                webView.getSettings().setMixedContentMode(0);
            }
        } catch (java.lang.Throwable th3) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("WebViewSettings", "setLayerType error", th3);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}
