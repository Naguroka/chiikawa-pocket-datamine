package com.bytedance.sdk.component.bg;

/* JADX INFO: loaded from: classes3.dex */
public class VzQ {
    static com.bytedance.sdk.component.bg.rri bg;
    private final com.bytedance.sdk.component.bg.bg IL;
    private final android.webkit.WebView bX;
    private final com.bytedance.sdk.component.bg.eo eqN;
    private volatile boolean ldr;
    private final java.util.List<com.bytedance.sdk.component.bg.yDt> zx;

    public static com.bytedance.sdk.component.bg.eo bg(android.webkit.WebView webView) {
        return new com.bytedance.sdk.component.bg.eo(webView);
    }

    public com.bytedance.sdk.component.bg.VzQ bg(java.lang.String str, com.bytedance.sdk.component.bg.zx<?, ?> zxVar) {
        return bg(str, (java.lang.String) null, zxVar);
    }

    public com.bytedance.sdk.component.bg.VzQ bg(java.lang.String str, java.lang.String str2, com.bytedance.sdk.component.bg.zx<?, ?> zxVar) {
        IL();
        this.IL.iR.bg(str, zxVar);
        return this;
    }

    public com.bytedance.sdk.component.bg.VzQ bg(java.lang.String str, com.bytedance.sdk.component.bg.eqN.IL il) {
        return bg(str, (java.lang.String) null, il);
    }

    public com.bytedance.sdk.component.bg.VzQ bg(java.lang.String str, java.lang.String str2, com.bytedance.sdk.component.bg.eqN.IL il) {
        IL();
        this.IL.iR.bg(str, il);
        return this;
    }

    public void bg() {
        if (this.ldr) {
            return;
        }
        this.IL.IL();
        this.ldr = true;
        java.util.Iterator<com.bytedance.sdk.component.bg.yDt> it = this.zx.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    VzQ(com.bytedance.sdk.component.bg.eo eoVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.zx = arrayList;
        this.ldr = false;
        this.eqN = eoVar;
        if (eoVar.Kg && bg != null) {
            throw null;
        }
        if (eoVar.bg != null && eoVar.IL == null) {
            this.IL = new com.bytedance.sdk.component.bg.Ja();
        } else {
            this.IL = eoVar.IL;
        }
        this.IL.bg(eoVar, (com.bytedance.sdk.component.bg.tC) null);
        this.bX = eoVar.bg;
        arrayList.add(eoVar.eo);
        com.bytedance.sdk.component.bg.JAA.bg(eoVar.iR);
    }

    private void IL() {
        if (this.ldr) {
            com.bytedance.sdk.component.bg.WR.bg(new java.lang.IllegalStateException("JsBridge2 is already released!!!"));
        }
    }
}
