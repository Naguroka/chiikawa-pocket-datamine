package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class pi extends android.webkit.WebViewClient {
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        java.util.HashMap<java.lang.String, java.lang.String> mapHashMap = com.applovin.impl.sdk.utils.CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
        if (com.applovin.impl.z3.i()) {
            mapHashMap.put("source", renderProcessGoneDetail.didCrash() ? com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN : "non_crash");
            mapHashMap.put("details", "renderer_priority_at_exit=" + renderProcessGoneDetail.rendererPriorityAtExit());
        }
        com.applovin.impl.sdk.j.u0.D().a(com.applovin.impl.ka.d0, mapHashMap, ((java.lang.Long) com.applovin.impl.sdk.j.u0.a(com.applovin.impl.sj.s3)).longValue());
        com.applovin.impl.sdk.n.g("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
