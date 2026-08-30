package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eo {
    com.bytedance.sdk.component.bg.bg IL;
    boolean Kg;
    boolean Lq;
    com.bytedance.sdk.component.bg.Ta WR;
    android.webkit.WebView bg;
    com.bytedance.sdk.component.bg.yDt eo;
    com.bytedance.sdk.component.bg.Kg eqN;
    boolean iR;
    boolean ldr;
    com.bytedance.sdk.component.bg.VB.bg vb;
    boolean yDt;
    android.content.Context zx;
    java.lang.String bX = "IESJSBridge";
    java.lang.String VB = "host";
    final java.util.Set<java.lang.String> PX = new java.util.LinkedHashSet();
    final java.util.Set<java.lang.String> Ta = new java.util.LinkedHashSet();

    eo(android.webkit.WebView webView) {
        this.bg = webView;
    }

    eo() {
    }

    public com.bytedance.sdk.component.bg.eo bg(com.bytedance.sdk.component.bg.bg bgVar) {
        this.IL = bgVar;
        return this;
    }

    public com.bytedance.sdk.component.bg.eo bg(java.lang.String str) {
        this.bX = str;
        return this;
    }

    public com.bytedance.sdk.component.bg.eo bg(com.bytedance.sdk.component.bg.PX px) {
        this.eqN = com.bytedance.sdk.component.bg.Kg.bg(px);
        return this;
    }

    public com.bytedance.sdk.component.bg.eo bg(boolean z) {
        this.ldr = z;
        return this;
    }

    public com.bytedance.sdk.component.bg.eo IL(boolean z) {
        this.iR = z;
        return this;
    }

    public com.bytedance.sdk.component.bg.eo bg() {
        this.Lq = true;
        return this;
    }

    public com.bytedance.sdk.component.bg.VzQ IL() {
        bX();
        return new com.bytedance.sdk.component.bg.VzQ(this);
    }

    private void bX() {
        if ((this.bg == null && !this.yDt && this.IL == null) || ((android.text.TextUtils.isEmpty(this.bX) && this.bg != null) || this.eqN == null)) {
            throw new java.lang.IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }
}
