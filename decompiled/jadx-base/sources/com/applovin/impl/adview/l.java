package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public class l extends com.applovin.impl.j3 {
    private final java.lang.String c;

    public void a(java.lang.String str) {
        loadDataWithBaseURL(this.c, str, "text/html", null, "");
    }

    public l(java.lang.String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.rr rrVar, android.content.Context context) {
        super(context);
        this.c = str;
        setBackgroundColor(0);
        android.webkit.WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        if (bVar.P0()) {
            applySettings(bVar);
        } else {
            settings.setAllowFileAccess(true);
            if (com.applovin.impl.z3.e() && bVar.L0()) {
                android.webkit.WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        setWebViewClient(rrVar);
        setWebChromeClient(new android.webkit.WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }
}
