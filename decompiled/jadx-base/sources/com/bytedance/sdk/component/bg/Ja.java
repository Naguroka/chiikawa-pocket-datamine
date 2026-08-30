package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
public class Ja extends com.bytedance.sdk.component.bg.bg {
    static final /* synthetic */ boolean eo = true;
    protected java.lang.String Kg;
    protected android.webkit.WebView WR;

    @Override // com.bytedance.sdk.component.bg.bg
    protected android.content.Context bg(com.bytedance.sdk.component.bg.eo eoVar) {
        if (eoVar.zx != null) {
            return eoVar.zx;
        }
        if (eoVar.bg != null) {
            return eoVar.bg.getContext();
        }
        throw new java.lang.IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.bg.bg
    protected java.lang.String bg() {
        return this.WR.getUrl();
    }

    @Override // com.bytedance.sdk.component.bg.bg
    protected void IL(com.bytedance.sdk.component.bg.eo eoVar) {
        this.WR = eoVar.bg;
        this.Kg = eoVar.bX;
        if (eoVar.yDt) {
            return;
        }
        bX();
    }

    protected void bX() {
        if (!eo && this.WR == null) {
            throw new java.lang.AssertionError();
        }
        this.WR.addJavascriptInterface(this, this.Kg);
    }

    @Override // com.bytedance.sdk.component.bg.bg
    @android.webkit.JavascriptInterface
    public void invokeMethod(java.lang.String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.bg.bg
    protected void IL() {
        super.IL();
        eqN();
    }

    protected void eqN() {
        this.WR.removeJavascriptInterface(this.Kg);
    }

    @Override // com.bytedance.sdk.component.bg.bg
    protected void bg(java.lang.String str, com.bytedance.sdk.component.bg.xxp xxpVar) {
        if (xxpVar != null && !android.text.TextUtils.isEmpty(xxpVar.Kg)) {
            java.lang.String str2 = xxpVar.Kg;
            bg(str, java.lang.String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", android.util.Base64.encodeToString(java.lang.String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, android.util.Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.bg(str, xxpVar);
    }

    @Override // com.bytedance.sdk.component.bg.bg
    protected void bg(java.lang.String str) {
        bg(str, "javascript:" + this.Kg + "._handleMessageFromToutiao(" + str + ")");
    }

    private void bg(java.lang.String str, final java.lang.String str2) {
        if (this.ldr || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.bytedance.sdk.component.bg.Ja.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.bg.Ja.this.ldr) {
                    return;
                }
                try {
                    com.bytedance.sdk.component.bg.Ja.this.WR.evaluateJavascript(str2, null);
                } catch (java.lang.Throwable unused) {
                }
            }
        };
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            this.eqN.post(runnable);
        } else {
            runnable.run();
        }
    }
}
