package com.five_corp.ad.internal.view;

/* JADX INFO: renamed from: com.five_corp.ad.internal.view.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1511d extends android.webkit.WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = com.five_corp.ad.internal.view.C1512e.f2095a;
        renderProcessGoneDetail.didCrash();
        renderProcessGoneDetail.rendererPriorityAtExit();
        return true;
    }
}
