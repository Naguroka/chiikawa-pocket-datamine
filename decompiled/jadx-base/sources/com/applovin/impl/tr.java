package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tr {
    public static void d(final android.webkit.WebView webView) {
        if (webView == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.tr$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.tr.c(webView);
            }
        });
    }

    public static void a(final android.webkit.WebView webView) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.tr$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.tr.b(webView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(android.webkit.WebView webView) {
        android.view.ViewParent parent = webView.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(webView);
        }
        webView.loadUrl(com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE);
        webView.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(android.webkit.WebView webView, java.lang.String str) {
        if (com.applovin.impl.z3.e()) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:" + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(android.webkit.WebView webView) {
        a(webView);
        webView.removeAllViews();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    public static void a(final android.webkit.WebView webView, final java.lang.String str) {
        if (webView == null) {
            return;
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.tr$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.tr.b(webView, str);
            }
        });
    }

    public static void a(final android.webkit.WebView webView, final java.lang.String str, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        if (webView == null) {
            return;
        }
        try {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.tr$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(str);
                }
            });
        } catch (java.lang.Throwable th) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a(str2, "Unable to forward to WebView", th);
            }
            jVar.D().a(str2, th, com.applovin.impl.sdk.utils.CollectionUtils.hashMap("operation", str));
        }
    }
}
