package com.iab.omid.library.applovin.utils;

/* JADX INFO: loaded from: classes5.dex */
public class i {
    public void a(android.webkit.WebView webView, java.lang.String str) {
        androidx.webkit.WebViewCompat.removeWebMessageListener(webView, str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, java.util.Set<java.lang.String> set, androidx.webkit.WebViewCompat.WebMessageListener webMessageListener) {
        androidx.webkit.WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}
