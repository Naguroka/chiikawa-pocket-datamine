package com.iab.omid.library.ironsrc.publisher;

/* JADX INFO: loaded from: classes5.dex */
public class a extends com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher {
    public a(android.webkit.WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
