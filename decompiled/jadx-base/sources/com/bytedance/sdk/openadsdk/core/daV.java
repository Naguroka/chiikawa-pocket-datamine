package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class daV {
    public static void bg(android.webkit.WebView webView) {
        if (webView == null) {
            return;
        }
        webView.setWebChromeClient(null);
        webView.setWebViewClient(null);
        android.view.ViewParent parent = webView.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        webView.destroy();
    }
}
