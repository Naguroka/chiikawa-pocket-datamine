package com.iab.omid.library.unity3d.publisher;

/* JADX INFO: loaded from: classes5.dex */
public class a extends com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher {
    public a(java.lang.String str, android.webkit.WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
