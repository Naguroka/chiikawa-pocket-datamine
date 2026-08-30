package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class kMt extends com.bytedance.sdk.component.adexpress.zx.bg {
    private final com.bytedance.sdk.component.Kg.Kg Fy;
    private java.lang.String Kg;
    private final java.lang.Runnable LZ;
    private com.bytedance.sdk.openadsdk.core.aGH Lq;
    private java.lang.String PX;
    private com.bytedance.sdk.openadsdk.eqN.VB Ta;
    private com.bytedance.sdk.openadsdk.eqN.eqN.zx VB;
    private volatile int VzQ;
    private com.bytedance.sdk.openadsdk.core.model.tuV WR;
    private org.json.JSONObject eo;
    private android.content.Context iR;
    com.bytedance.sdk.openadsdk.utils.bg ldr;
    private com.bytedance.sdk.openadsdk.core.Kg.eo tuV;
    private com.bytedance.sdk.component.adexpress.IL.iR vb;
    private com.bytedance.sdk.openadsdk.core.model.tuV.bg xxp;
    private final java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr> yDt;

    public kMt(android.content.Context context, com.bytedance.sdk.component.adexpress.IL.Ta ta, com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        super(context, ta, themeStatusBroadcastReceiver);
        this.yDt = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.VzQ = 0;
        this.Fy = new com.bytedance.sdk.component.Kg.Kg("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.Kg.kMt.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.Kg.kMt.this.zx.get()) {
                    return;
                }
                if ((com.bytedance.sdk.openadsdk.core.Kg.kMt.this.WR instanceof com.bytedance.sdk.openadsdk.core.model.Fy) && ((com.bytedance.sdk.openadsdk.core.model.Fy) com.bytedance.sdk.openadsdk.core.Kg.kMt.this.WR).Uzu()) {
                    com.bytedance.sdk.openadsdk.core.Kg.kMt.this.IL(true);
                }
                com.bytedance.sdk.openadsdk.core.Kg.kMt kmt = com.bytedance.sdk.openadsdk.core.Kg.kMt.this;
                kmt.eo = kmt.VB().bX();
                com.bytedance.sdk.openadsdk.core.Kg.kMt kmt2 = com.bytedance.sdk.openadsdk.core.Kg.kMt.this;
                kmt2.bg(kmt2.eo);
                if (com.bytedance.sdk.openadsdk.core.Kg.kMt.this.VzQ == 0) {
                    com.bytedance.sdk.openadsdk.core.Kg.kMt.this.xxp();
                }
                com.bytedance.sdk.openadsdk.core.yDt.bX().post(com.bytedance.sdk.openadsdk.core.Kg.kMt.this.LZ);
            }
        };
        this.LZ = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.kMt.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.Kg.kMt.this.zx.get() || com.bytedance.sdk.openadsdk.core.Kg.kMt.this.vb == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.Kg.kMt.this.PX();
                com.bytedance.sdk.openadsdk.core.Kg.kMt kmt = com.bytedance.sdk.openadsdk.core.Kg.kMt.this;
                com.bytedance.sdk.openadsdk.core.Kg.kMt.super.bg(kmt.vb);
            }
        };
        if (this.bX == null) {
            return;
        }
        this.iR = context;
        this.Kg = ta.eqN();
        this.WR = tuv;
        this.VB = zxVar;
        themeStatusBroadcastReceiver.bg(this);
        xxp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xxp() {
        if (this.bX.getWebView() != null && com.bytedance.sdk.openadsdk.utils.VJ.zx()) {
            VzQ();
        } else {
            this.VzQ = 1;
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.kMt.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.Kg.kMt.this.VzQ();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void VzQ() {
        if (this.bX == null || this.bX.getWebView() == null || this.VzQ == 2) {
            return;
        }
        this.PX = bg(this.WR);
        this.bX.setDisplayZoomControls(false);
        bg(com.bytedance.sdk.openadsdk.utils.VW.bg(this.PX));
        Ta();
        com.bytedance.sdk.openadsdk.core.aGH agh = new com.bytedance.sdk.openadsdk.core.aGH(this.iR);
        this.Lq = agh;
        agh.eqN(true);
        yDt();
        this.VzQ = 2;
    }

    public static java.lang.String bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return com.bytedance.sdk.component.adexpress.bg.IL.IL.eqN((tuv == null || !tuv.CQc()) ? null : "v3");
    }

    public void PX() {
        com.bytedance.sdk.openadsdk.core.aGH agh;
        if (this.bX == null || this.bX.getWebView() == null || (agh = this.Lq) == null) {
            return;
        }
        agh.IL(this.bX).bg(this.WR).bX(this.WR.Ys()).eqN(this.WR.Ny()).IL(com.bytedance.sdk.openadsdk.utils.ayS.bg(this.Kg)).zx(this.WR.PC()).bg(this).bg(this.eo).bg(this.bX).bg(this.VB);
    }

    public void Ta() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.WR;
        if (tuv == null || tuv.LKE() == null) {
            return;
        }
        this.xxp = this.WR.LKE();
    }

    public void yDt() {
        if (this.bX == null || this.bX.getWebView() == null) {
            return;
        }
        this.bX.setBackgroundColor(0);
        this.bX.setBackgroundResource(android.R.color.transparent);
        bg(this.bX);
        if (bg() != null) {
            this.Ta = new com.bytedance.sdk.openadsdk.eqN.VB(this.WR, bg().getWebView()).bg(false);
        }
        this.Ta.bg(this.VB);
        this.tuV = new com.bytedance.sdk.openadsdk.core.Kg.eo(this.iR, this.Lq, this.WR, this.Ta, VB());
        this.bX.setWebViewClient(this.tuV);
        this.bX.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.bg.eqN(this.Lq, this.Ta));
        com.bytedance.sdk.component.adexpress.zx.zx.bg().bg(this.bX, this.Lq);
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.bg
    protected void WR() {
        super.WR();
        com.bytedance.sdk.openadsdk.utils.bg bgVarZx = com.bytedance.sdk.openadsdk.core.Lq.bg().zx();
        this.ldr = bgVarZx;
        bgVarZx.bg(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.bg
    protected void eo() {
        super.eo();
        com.bytedance.sdk.openadsdk.utils.bg bgVar = this.ldr;
        if (bgVar != null) {
            bgVar.IL(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.bg, com.bytedance.sdk.component.adexpress.IL.eqN
    public void bg(com.bytedance.sdk.component.adexpress.IL.iR iRVar) {
        this.vb = iRVar;
        com.bytedance.sdk.openadsdk.utils.VJ.IL(this.Fy);
    }

    private void bg(com.bytedance.sdk.component.WR.eqN eqn) {
        if (eqn == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.bg.bX.bg(this.iR).bg(false).bg(eqn.getWebView());
            eqn.setVerticalScrollBarEnabled(false);
            eqn.setHorizontalScrollBarEnabled(false);
            eqn.bg(com.bytedance.sdk.openadsdk.Fy.bg.bg("clear_web_cache", true));
            eqn.eo();
            eqn.setUserAgentString(com.bytedance.sdk.openadsdk.utils.xxp.bg(eqn.getWebView(), com.bytedance.sdk.openadsdk.BuildConfig.VERSION_CODE));
            eqn.setMixedContentMode(0);
            eqn.setJavaScriptEnabled(true);
            eqn.setJavaScriptCanOpenWindowsAutomatically(true);
            eqn.setDomStorageEnabled(true);
            eqn.setDatabaseEnabled(true);
            eqn.setAppCacheEnabled(true);
            eqn.setAllowFileAccess(false);
            eqn.setSupportZoom(true);
            eqn.setBuiltInZoomControls(true);
            eqn.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            eqn.setUseWideViewPort(true);
            eqn.setCacheMode(-1);
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.WebViewRender", e.toString());
        }
    }

    public com.bytedance.sdk.openadsdk.core.Kg.eo Lq() {
        return this.tuV;
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.bg
    public com.bytedance.sdk.component.WR.eqN bg() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.bg
    public void eqN() {
        if (this.zx.get()) {
            return;
        }
        super.eqN();
        com.bytedance.sdk.openadsdk.core.aGH agh = this.Lq;
        if (agh != null) {
            agh.IL();
            this.Lq.VB();
            this.Lq = null;
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.Ta;
        if (vb != null) {
            vb.bX(false);
        }
        com.bytedance.sdk.openadsdk.core.yDt.bX().removeCallbacks(this.LZ);
        this.yDt.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.bg, com.bytedance.sdk.component.adexpress.IL.eqN
    public int bX() {
        return this.WR.JAA();
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.bg
    public void ldr() {
        if (bg() == null) {
            return;
        }
        try {
            bg().getWebView().resumeTimers();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.bg
    public void Kg() {
        super.Kg();
        if (this.Lq == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("expressShow", true);
            this.Lq.bg("expressShow", jSONObject);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.bg
    public void iR() {
        com.bytedance.sdk.openadsdk.core.aGH agh = this.Lq;
        if (agh == null) {
            return;
        }
        agh.bg("expressWebviewRecycle", (org.json.JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.bg
    public void bg(int i) {
        if (i == this.eqN) {
            return;
        }
        this.eqN = i;
        bX(i == 0);
    }

    private void bX(boolean z) {
        if (this.Lq == null || this.bX == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("adVisible", z);
            this.Lq.bg("expressAdShow", jSONObject);
        } catch (java.lang.Exception unused) {
        }
    }

    public com.bytedance.sdk.openadsdk.core.aGH vb() {
        return this.Lq;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.bg
    public void onThemeChanged(int i) {
        if (this.Lq == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("status", i);
        } catch (org.json.JSONException unused) {
        }
        this.Lq.bg("themeChange", jSONObject);
    }

    public static boolean IL(java.lang.String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.bg, com.bytedance.sdk.component.adexpress.IL.VB
    public void bg(com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        super.bg(ydt);
        if (this.IL) {
            com.bytedance.sdk.component.utils.iR.IL().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.kMt.4
                @Override // java.lang.Runnable
                public void run() {
                    android.webkit.WebView webView = com.bytedance.sdk.openadsdk.core.Kg.kMt.this.bX.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }
}
