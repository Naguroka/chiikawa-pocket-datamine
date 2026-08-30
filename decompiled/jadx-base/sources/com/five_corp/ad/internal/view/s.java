package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2106a = 0;

    public static boolean a(android.net.Uri uri, com.five_corp.ad.internal.view.r rVar, com.five_corp.ad.internal.logger.a aVar) {
        boolean z = true;
        try {
            if (uri.equals(android.net.Uri.parse("https://macro.fivecdm.com/click"))) {
                ((com.five_corp.ad.internal.layouter.e) rVar).h.a();
            } else if (uri.equals(android.net.Uri.parse("https://macro.fivecdm.com/closeDeprecated"))) {
                ((com.five_corp.ad.internal.layouter.e) rVar).h.b();
            } else {
                z = false;
            }
        } catch (java.lang.Throwable th) {
            aVar.a(th);
        }
        return z;
    }

    public static void a(android.webkit.WebView webView, com.five_corp.ad.internal.cache.q qVar, com.five_corp.ad.internal.ad.format_config.b bVar, com.five_corp.ad.internal.view.r rVar, com.five_corp.ad.internal.logger.a aVar) {
        android.webkit.WebViewClient pVar;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<html><head><meta charset='utf-8' />");
        sb.append(java.lang.String.format("<meta name='viewport' content='width=%dpx' />", java.lang.Integer.valueOf(bVar.f1812a)));
        sb.append("</head><body style='margin:0;padding:0'>");
        java.lang.String strReplace = bVar.c.replace("{{install-url}}", "https://macro.fivecdm.com/click").replace("{{back-url}}", "https://macro.fivecdm.com/closeDeprecated").replace("{{replay-url}}", "https://macro.fivecdm.com/replay");
        java.util.List<com.five_corp.ad.internal.ad.w> list = bVar.b;
        if (list != null) {
            for (com.five_corp.ad.internal.ad.w wVar : list) {
                com.five_corp.ad.internal.cache.o oVar = (com.five_corp.ad.internal.cache.o) qVar.f1875a.get(wVar);
                if (oVar != null && oVar.d()) {
                    strReplace = strReplace.replace("{{resource:" + wVar.b + "}}", "file://" + oVar.c());
                }
            }
        }
        sb.append(strReplace);
        sb.append("</body></html>");
        java.lang.String string = sb.toString();
        android.webkit.WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(false);
        webView.setBackgroundColor(-1);
        webView.setScrollBarStyle(0);
        webView.setVisibility(8);
        webView.setLayerType(1, null);
        webView.setOnLongClickListener(new com.five_corp.ad.internal.view.n());
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            pVar = new com.five_corp.ad.internal.view.q(rVar, aVar);
        } else {
            pVar = new com.five_corp.ad.internal.view.p(rVar, aVar);
        }
        webView.setWebViewClient(pVar);
        webView.loadDataWithBaseURL("", string, "text/html", com.adjust.sdk.Constants.ENCODING, "");
    }
}
