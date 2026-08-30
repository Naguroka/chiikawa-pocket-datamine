package com.bytedance.sdk.openadsdk.core.widget.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends android.webkit.WebChromeClient {
    private static final java.lang.String bg = android.webkit.WebChromeClient.class.getSimpleName();
    private final com.bytedance.sdk.openadsdk.core.aGH IL;
    private com.bytedance.sdk.openadsdk.eqN.VB bX;
    private com.bytedance.sdk.openadsdk.common.eqN eqN;

    public eqN(com.bytedance.sdk.openadsdk.core.aGH agh) {
        this.IL = agh;
    }

    public eqN(com.bytedance.sdk.openadsdk.core.aGH agh, com.bytedance.sdk.openadsdk.eqN.VB vb, com.bytedance.sdk.openadsdk.common.eqN eqn) {
        this(agh, vb);
        this.eqN = eqn;
    }

    public eqN(com.bytedance.sdk.openadsdk.core.aGH agh, com.bytedance.sdk.openadsdk.eqN.VB vb) {
        this.IL = agh;
        this.bX = vb;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(java.lang.String str, int i, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str)) {
            bg(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        if (consoleMessage == null || android.text.TextUtils.isEmpty(consoleMessage.message()) || !bg(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    private boolean bg(final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                com.bytedance.sdk.openadsdk.core.yDt.bX().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.bg.eqN.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.utils.xxp.bg(android.net.Uri.parse(str), com.bytedance.sdk.openadsdk.core.widget.bg.eqN.this.IL);
                    }
                });
                return true;
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(android.webkit.WebView webView, int i) {
        super.onProgressChanged(webView, i);
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.bX;
        if (vb != null) {
            vb.bg(webView, i);
        }
        com.bytedance.sdk.openadsdk.common.eqN eqn = this.eqN;
        if (eqn != null) {
            eqn.bg(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }
}
