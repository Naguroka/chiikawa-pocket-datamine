package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class f0 extends android.webkit.WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f777a;
    private final com.applovin.impl.sdk.n b;
    private final com.applovin.impl.adview.a c;

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        java.lang.String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("AdWebView", str);
        }
        if (consoleMessage.messageLevel() != android.webkit.ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        if (!consoleMessage.message().contains("al_onPoststitialShow") && !consoleMessage.message().contains("al_showPostitial")) {
            return true;
        }
        a(consoleMessage);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        if (!com.applovin.impl.sdk.n.a()) {
            return true;
        }
        this.b.k("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        if (!com.applovin.impl.sdk.n.a()) {
            return true;
        }
        this.b.k("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        if (!com.applovin.impl.sdk.n.a()) {
            return true;
        }
        this.b.k("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(java.lang.String str, int i, java.lang.String str2) {
        if (com.applovin.impl.sdk.n.a()) {
            this.b.k("AdWebView", "console.log[" + i + "] :" + str);
        }
    }

    public f0(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
        this.f777a = jVar;
        this.b = jVar.I();
        this.c = aVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(android.webkit.WebView webView, int i) {
        com.applovin.impl.adview.a aVar;
        if (i != 100 || (aVar = this.c) == null) {
            return;
        }
        aVar.c(webView);
    }

    private void a(android.webkit.ConsoleMessage consoleMessage) {
        com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcast(new android.content.Intent("com.applovin.al_onPoststitialShow_evaluation_error"), null);
        com.applovin.impl.sdk.ad.b bVarI = this.c.i();
        if (bVarI != null) {
            java.lang.String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber();
            java.util.Map mapA = com.applovin.impl.la.a(bVarI);
            mapA.put("source", "AdWebView:onPoststitialShowEvaluationError");
            mapA.put("top_main_method", str);
            mapA.put("error_message", consoleMessage.message());
            this.f777a.D().a(com.applovin.impl.ka.b0, mapA);
        }
    }
}
