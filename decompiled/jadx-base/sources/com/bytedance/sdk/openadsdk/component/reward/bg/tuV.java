package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class tuV implements com.bytedance.sdk.openadsdk.PX.iR {
    private java.lang.String ApA;
    private com.bytedance.sdk.openadsdk.core.widget.bg.zx CQc;
    private long DDQ;
    private boolean Dxa;
    private com.bykv.vk.openvk.preload.falconx.loader.ILoader GvG;
    com.bytedance.sdk.openadsdk.core.aGH IL;
    private android.view.View JAA;
    private float Ja;
    protected com.bytedance.sdk.openadsdk.eqN.eqN.zx Kg;
    private boolean LZ;
    private com.bytedance.sdk.openadsdk.core.widget.bg.ldr.bg Ld;
    private int Lq;
    private final java.lang.String PX;
    private long Pae;
    private int Ta;
    private float Uw;
    private final com.bytedance.sdk.openadsdk.core.model.tuV VB;
    private com.bytedance.sdk.component.WR.eqN VzQ;
    private boolean Ys;
    private final com.bytedance.sdk.openadsdk.component.reward.bg.bg ZQc;
    private boolean ayS;
    private boolean bCU;
    private boolean bN;
    com.bytedance.sdk.openadsdk.core.aGH bg;
    private boolean cZH;
    private com.bytedance.sdk.openadsdk.common.Ta daV;
    protected java.lang.String eqN;
    private android.view.View kMt;
    private boolean qC;
    private boolean rri;
    private boolean tC;
    private int txA;
    private boolean uu;
    private int vb;
    private com.bytedance.sdk.openadsdk.common.eqN wS;
    private com.bytedance.sdk.component.WR.eqN xxp;
    private final boolean yDt;
    private java.lang.String zCS;
    com.bytedance.sdk.openadsdk.eqN.VB zx;
    protected boolean bX = true;
    private boolean tuV = false;
    private final java.util.concurrent.atomic.AtomicBoolean Fy = new java.util.concurrent.atomic.AtomicBoolean(true);
    int ldr = 0;
    java.lang.String iR = "";
    boolean WR = false;
    private android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> Uq = new android.util.SparseArray<>();
    private boolean aGH = true;
    private float VW = -1.0f;
    private float VJ = -1.0f;
    private boolean LKE = false;
    private long jz = -1;
    private volatile int RJ = 0;
    private int sVc = -1;
    private volatile int lM = 0;
    private volatile int gXn = 0;
    private long GZ = 0;
    public boolean eo = false;
    private int dS = -1;

    public interface eqN {
        void bg(android.webkit.WebView webView, int i);

        void bg(android.webkit.WebView webView, java.lang.String str);

        void bg(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap);
    }

    static /* synthetic */ int vb(com.bytedance.sdk.openadsdk.component.reward.bg.tuV tuv) {
        int i = tuv.gXn;
        tuv.gXn = i + 1;
        return i;
    }

    static /* synthetic */ int xxp(com.bytedance.sdk.openadsdk.component.reward.bg.tuV tuv) {
        int i = tuv.RJ;
        tuv.RJ = i + 1;
        return i;
    }

    static /* synthetic */ int yDt(com.bytedance.sdk.openadsdk.component.reward.bg.tuV tuv) {
        int i = tuv.lM;
        tuv.lM = i + 1;
        return i;
    }

    public tuV(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.ZQc = bgVar;
        this.VB = bgVar.IL;
        this.PX = bgVar.zx;
        this.yDt = bgVar.eqN;
    }

    public void bg() {
        if (this.rri) {
            return;
        }
        this.rri = true;
        this.Ta = this.ZQc.GvG;
        this.Lq = this.ZQc.gXn;
        this.vb = this.ZQc.GZ;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        IL();
        this.GZ = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    void IL() {
        com.bytedance.sdk.openadsdk.common.Ta ta;
        this.kMt = this.ZQc.uu.findViewById(android.R.id.content);
        boolean z = this.ZQc.iR;
        this.ayS = z;
        if (z && (ta = this.daV) != null) {
            this.xxp = ta.eqN();
        } else {
            com.bytedance.sdk.component.WR.eqN eqn = (com.bytedance.sdk.component.WR.eqN) this.ZQc.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.yDt);
            this.xxp = eqn;
            if (eqn != null && com.bytedance.sdk.openadsdk.core.model.tuV.IL(this.VB)) {
                this.xxp.f_();
            } else {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.xxp, 8);
            }
        }
        com.bytedance.sdk.component.WR.eqN eqn2 = (com.bytedance.sdk.component.WR.eqN) this.ZQc.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.vb);
        this.VzQ = eqn2;
        if (eqn2 != null && com.bytedance.sdk.openadsdk.core.model.rri.iR(this.VB) && com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.VB)) {
            this.VzQ.f_();
            this.VzQ.setDisplayZoomControls(false);
        } else {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.VzQ, 8);
        }
        com.bytedance.sdk.component.WR.eqN eqn3 = this.xxp;
        if (eqn3 != null) {
            eqn3.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.xxp == null || com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.xxp.getViewTreeObserver() == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.xxp.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.xxp.getMeasuredWidth();
                    int measuredHeight = com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.xxp.getMeasuredHeight();
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.xxp.getVisibility() == 0) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.bg(measuredWidth, measuredHeight);
                    }
                }
            });
        }
        com.bytedance.sdk.component.WR.eqN eqn4 = this.VzQ;
        if (eqn4 != null) {
            eqn4.setLandingPage(true);
            this.VzQ.setTag(com.bytedance.sdk.openadsdk.core.model.rri.iR(this.VB) ? this.PX : "landingpage_endcard");
            this.VzQ.setWebViewClient(new com.bytedance.sdk.component.WR.eqN.bg());
            this.VzQ.setMaterialMeta(this.VB.mLT());
        }
    }

    public void bg(java.lang.String str, final com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il) {
        bg(str, new com.bytedance.sdk.openadsdk.component.reward.bg.tuV.eqN() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.12
            @Override // com.bytedance.sdk.openadsdk.component.reward.bg.tuV.eqN
            public void bg(android.webkit.WebView webView, java.lang.String str2) {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.uu.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.JAA.IL(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VzQ());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.bg.tuV.eqN
            public void bg(android.webkit.WebView webView, java.lang.String str2, android.graphics.Bitmap bitmap) {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.LKE || !com.bytedance.sdk.openadsdk.core.model.rri.VzQ(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.IL)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.LKE = true;
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.JAA.bg(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.ldr, com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.IL, com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.IL.fE());
                if (!com.bytedance.sdk.openadsdk.core.model.rri.Kg(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VB)) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.bN.sendEmptyMessageDelayed(600, com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.JAA.WR() * 1000);
                }
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.JAA.eo();
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.qC.VB();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.bg.tuV.eqN
            public void bg(android.webkit.WebView webView, int i) {
                try {
                    if (!com.bytedance.sdk.openadsdk.core.model.rri.VzQ(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.IL) || !com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.IL.gJ() || com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.uu.isFinishing()) {
                        if (!com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.iR || com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.zCS == null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.zCS.bg(webView, i, com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Ld);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.JAA.bX(i);
                } catch (java.lang.Exception unused) {
                }
            }
        });
        if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.ZQc.IL)) {
            bg(this.VzQ);
            this.ZQc.JAA.bg(new android.webkit.DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.13
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.kMt.IL();
                    com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il2 = il;
                    if (il2 != null) {
                        il2.eqN();
                    }
                }
            });
        }
        this.ZQc.JAA.bX(this.ZQc.wS);
        bg(new android.webkit.DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.14
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j) {
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.kMt.IL();
                com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il2 = il;
                if (il2 != null) {
                    il2.eqN();
                }
            }
        });
    }

    public void bg(com.bytedance.sdk.openadsdk.PX.zx zxVar, java.lang.String str, final com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il) {
        if (this.xxp == null) {
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        if (com.bytedance.sdk.openadsdk.core.model.rri.iR(this.VB)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        this.Kg = RJ();
        com.bytedance.sdk.openadsdk.core.aGH agh = new com.bytedance.sdk.openadsdk.core.aGH(this.ZQc.uu);
        this.bg = agh;
        agh.bg(this.ZQc.qC);
        java.lang.String strPC = this.VB.PC();
        this.bg.IL(this.xxp).bg(this.VB).bX(this.VB.Ys()).eqN(this.VB.Ny()).IL(this.VB.fE() ? 7 : 5).bg(new com.bytedance.sdk.openadsdk.component.reward.bg.tuV.IL(this.xxp)).zx(strPC).bg(this.xxp).IL(xxp() ? "landingpage_endcard" : str).bg(map).bg(this.Kg).bg(new com.bytedance.sdk.openadsdk.core.widget.ldr() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.16
            @Override // com.bytedance.sdk.openadsdk.core.widget.ldr
            public void bg() {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.CQc != null) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.CQc.IL();
                }
                com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il2 = il;
                if (il2 != null) {
                    il2.eqN();
                }
            }
        }).bg(new com.bytedance.sdk.openadsdk.core.aGH.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.15
            @Override // com.bytedance.sdk.openadsdk.core.aGH.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.jz();
            }
        });
        java.util.HashMap map2 = new java.util.HashMap();
        if (com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.VB)) {
            map2.put("click_scence", 2);
        }
        com.bytedance.sdk.openadsdk.core.aGH agh2 = new com.bytedance.sdk.openadsdk.core.aGH(this.ZQc.uu);
        this.IL = agh2;
        agh2.bg(this.ZQc.qC);
        com.bytedance.sdk.openadsdk.core.aGH aghZx = this.IL.IL(this.VzQ).bg(this.VB).bX(this.VB.Ys()).eqN(this.VB.Ny()).IL(this.VB.fE() ? 7 : 5).bg(new com.bytedance.sdk.openadsdk.component.reward.bg.tuV.IL(this.VzQ)).bg(this.VzQ).zx(strPC);
        if (xxp()) {
            str = "landingpage_endcard";
        }
        aghZx.IL(str).bg(map2).bg(this.Kg).bg(new com.bytedance.sdk.openadsdk.core.widget.ldr() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.18
            @Override // com.bytedance.sdk.openadsdk.core.widget.ldr
            public void bg() {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.CQc != null) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.CQc.IL();
                }
            }
        }).bg(new com.bytedance.sdk.openadsdk.core.aGH.bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.17
            @Override // com.bytedance.sdk.openadsdk.core.aGH.bg
            public void bg() {
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.jz();
            }
        });
        this.bg.bg(new com.bytedance.sdk.openadsdk.component.reward.bg.tuV.bX(this.xxp));
        this.IL.bg(new com.bytedance.sdk.openadsdk.component.reward.bg.tuV.bX(this.VzQ));
        this.bg.bg(this.ZQc.LKE.eo()).bg(this.ZQc.wS).bg(zxVar).bg(this.ZQc.JAA.VB()).bg(new com.bytedance.sdk.openadsdk.PX.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.19
            @Override // com.bytedance.sdk.openadsdk.PX.IL
            public void bg(boolean z, int i, java.lang.String str2) {
                if (z) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.eo = true;
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.bCU) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.bCU = false;
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV tuv = com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this;
                        tuv.bg(tuv.ZQc.RJ, true);
                    }
                }
                if (!com.bytedance.sdk.openadsdk.core.model.tuV.eqN(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.IL) || com.bytedance.sdk.openadsdk.core.model.rri.iR(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.IL)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.bg(z, i, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.PX.IL
            public void bg() {
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.bN = true;
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.LKE.eo().performClick();
            }
        });
        this.bg.zx(this.qC);
        this.IL.bg(this.ZQc.LKE.eo()).bg(new com.bytedance.sdk.openadsdk.PX.IL() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.2
            @Override // com.bytedance.sdk.openadsdk.PX.IL
            public void bg(boolean z, int i, java.lang.String str2) {
            }

            @Override // com.bytedance.sdk.openadsdk.PX.IL
            public void bg() {
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.bN = true;
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.LKE.eo().performClick();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jz() {
        this.uu = true;
        this.Ys = false;
        this.ZQc.bN.removeMessages(600);
        this.ZQc.bN.removeMessages(700);
        this.ZQc.bN.removeMessages(900);
        this.ZQc.ayS.eqN(false);
        this.ZQc.tuV.set(true);
        this.ZQc.dS.Lq();
        this.VB.vTg();
        if (this.VB.vTg() || !com.bytedance.sdk.openadsdk.utils.ayS.Kg(com.bytedance.sdk.openadsdk.core.model.rri.bg(this.VB))) {
            return;
        }
        android.view.View viewEo = this.ZQc.LKE.eo();
        android.view.View.OnClickListener onClickListener = (android.view.View.OnClickListener) viewEo.getTag(viewEo.getId());
        if (onClickListener != null) {
            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.bg bgVar = new com.bytedance.sdk.openadsdk.component.reward.bg.tuV.bg(this.ZQc, viewEo, onClickListener);
            viewEo.setOnClickListener(bgVar);
            viewEo.setOnTouchListener(bgVar);
        }
    }

    public boolean bX() {
        return this.bN;
    }

    public boolean eqN() {
        return this.Dxa;
    }

    public void bg(int i, int i2) {
        if (this.bg == null || this.ZQc.uu.isFinishing()) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            this.bg.bg("resize", jSONObject);
        } catch (java.lang.Exception e) {
            android.util.Log.e("TTAD.RFWVM", "", e);
        }
    }

    public void bg(boolean z) {
        this.bX = z;
    }

    public void zx() {
        if (com.bytedance.sdk.openadsdk.core.model.rri.zx(this.VB)) {
            return;
        }
        ldr();
    }

    public void ldr() {
        if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.tuV.bg(this.ZQc.Dxa, this.VB))) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.VB;
            if (tuv != null && !tuv.yN() && this.GvG == null && xxp()) {
                this.ApA = this.VB.qp();
                this.GvG = com.bytedance.sdk.openadsdk.iR.IL.bg().IL();
                int iBg = com.bytedance.sdk.openadsdk.iR.IL.bg().bg(this.GvG, this.ApA);
                this.txA = iBg;
                this.sVc = iBg > 0 ? 2 : 0;
                if (!android.text.TextUtils.isEmpty(this.ApA)) {
                    com.bytedance.sdk.openadsdk.eqN.VB vb = this.zx;
                    if (vb != null) {
                        vb.bg(this.sVc);
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(this.GZ, this.VB, "landingpage_endcard", this.GvG, this.ApA);
                }
            }
            if ((!android.text.TextUtils.isEmpty(this.eqN) && this.eqN.contains("play.google.com/store")) || com.bytedance.sdk.openadsdk.core.model.xxp.zx(this.VB) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.VB)) {
                this.WR = true;
                return;
            }
            if (this.bX) {
                if (this.xxp != null && !android.text.TextUtils.isEmpty(this.eqN) && com.bytedance.sdk.openadsdk.core.model.tuV.IL(this.VB)) {
                    if (this.cZH) {
                        return;
                    }
                    java.lang.String str = this.eqN + "&is_pre_render=1";
                    new java.lang.StringBuilder("preLoadEndCard: ").append(str).append(", ").append(this.xxp.getWebView());
                    com.bytedance.sdk.openadsdk.eqN.VB vb2 = this.zx;
                    if (vb2 != null) {
                        vb2.eqN();
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.rri.iR(this.VB)) {
                        com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().IL(this.VB);
                    }
                    com.bytedance.sdk.openadsdk.utils.tuV.bg(this.xxp, str);
                    this.ZQc.JAA.bg(str);
                    this.cZH = true;
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(this.VB)) {
                    this.ZQc.daV.bX();
                }
            }
        }
    }

    public void iR() {
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = this.VB.Dxa();
        if (ilDxa == null) {
            return;
        }
        java.lang.String strPX = ilDxa.PX();
        this.zCS = strPX;
        if (android.text.TextUtils.isEmpty(strPX)) {
            return;
        }
        this.zCS = bg(this.zCS, this.VB, this.Ta, this.vb, this.Lq);
        this.VzQ.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.bg.zx(com.bytedance.sdk.openadsdk.core.VzQ.bg(), this.IL, this.VB.Ys(), this.zx, this.VB.ayS() || com.bytedance.sdk.openadsdk.core.model.rri.iR(this.VB)) { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
                if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.bg(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.tC = false;
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ldr = i;
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.iR = str;
                if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg != null) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("code", i);
                        jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, str);
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg.bg(jSONObject);
                    } catch (org.json.JSONException unused) {
                    }
                }
                super.onReceivedError(webView, i, str, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.bg(webResourceRequest.getUrl().toString())) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.tC = false;
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg != null) {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                            }
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg.bg(jSONObject);
                        } catch (org.json.JSONException unused) {
                        }
                    }
                    if (webResourceError != null) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ldr = webResourceError.getErrorCode();
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.iR = java.lang.String.valueOf(webResourceError.getDescription());
                    }
                    if (webResourceRequest == null) {
                        return;
                    }
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.tC = false;
                    if (webResourceResponse != null) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ldr = webResourceResponse.getStatusCode();
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.iR = "onReceivedHttpError";
                    }
                }
                if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg != null) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        if (webResourceResponse != null) {
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                        }
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg.bg(jSONObject);
                    } catch (org.json.JSONException unused) {
                    }
                }
                if (webResourceRequest != null) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
                super.onPageFinished(webView, str);
                if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg != null) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg.ldr();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg != null) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg.zx();
                }
            }
        });
        this.VzQ.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.bg.eqN(this.IL, this.zx) { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.eqN, android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (!com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.iR || com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.zCS == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.zCS.bg(webView, i, com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Ld);
            }
        });
        com.bytedance.sdk.openadsdk.utils.tuV.bg(this.VzQ, this.zCS);
        this.tC = true;
    }

    public void Kg() {
        if (this.xxp == null) {
            return;
        }
        this.Fy.set(this.tC);
        if (this.VzQ.getVisibility() == 0 && this.tC) {
            Pae();
            return;
        }
        this.ZQc.ayS.bX(false);
        this.ZQc.JAA.iR(com.bytedance.sdk.openadsdk.component.reward.bg.Kg.bX);
        bg(this.bg, true, false);
        IL(this.bg, false);
        bg(this.bg, false);
        this.xxp.PX();
        if (this.tC) {
            this.VzQ.setVisibility(0);
            bg(this.IL, this.ZQc.RJ, true);
            IL(this.IL, true);
            bg(this.IL, true);
            this.ZQc.bN.removeMessages(600);
            if (!this.ZQc.ZQc.bX(this.ZQc.dS)) {
                this.ZQc.dS.kMt();
            }
        } else {
            if (this.ZQc.JAA.bg()) {
                this.ZQc.JAA.bg(5);
            }
            this.ZQc.ZQc.eqN();
            this.ZQc.Dt.bg(this.ZQc.Kg);
        }
        this.Ys = true;
    }

    private void Pae() {
        this.IL.bg("showPlayableEndCardOverlay", (org.json.JSONObject) null);
        this.ZQc.bN.sendEmptyMessageDelayed(600, 1000L);
        this.ZQc.bN.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.5
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.jz();
            }
        }, 1000L);
        if (this.ZQc.Dt != null) {
            this.ZQc.Dt.bg(0L);
        }
    }

    public void WR() {
        this.bg.bg("showPlayableEndCardOverlay", (org.json.JSONObject) null);
        this.ZQc.bN.sendEmptyMessageDelayed(600, 1000L);
        this.ZQc.bN.postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.6
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.jz();
            }
        }, 1000L);
        if (this.ZQc.Dt != null) {
            this.ZQc.Dt.bg(0L);
        }
    }

    public com.bytedance.sdk.component.WR.eqN eo() {
        return this.xxp;
    }

    public com.bytedance.sdk.component.WR.eqN VB() {
        return this.VzQ;
    }

    public com.bytedance.sdk.openadsdk.core.aGH PX() {
        return this.bg;
    }

    public com.bytedance.sdk.openadsdk.core.aGH Ta() {
        return this.IL;
    }

    public com.bytedance.sdk.openadsdk.eqN.VB yDt() {
        return this.zx;
    }

    public void Lq() {
        com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa;
        if (com.bytedance.sdk.openadsdk.core.model.rri.zx(this.VB)) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.VB;
            if (tuv != null && (ilDxa = tuv.Dxa()) != null) {
                this.eqN = ilDxa.PX();
            }
        } else {
            this.eqN = com.bytedance.sdk.openadsdk.core.model.rri.Ta(this.VB);
        }
        java.lang.String strBg = bg(this.eqN, this.VB, this.Ta, this.vb, this.Lq);
        this.eqN = strBg;
        if (android.text.TextUtils.isEmpty(strBg)) {
            return;
        }
        this.qC = this.eqN.contains("use_second_endcard=1");
    }

    private static java.lang.String bg(java.lang.String str, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, int i2, int i3) {
        java.lang.String str2;
        java.lang.String str3;
        float fJf = tuv.jf();
        if (!android.text.TextUtils.isEmpty(str)) {
            if (i == 1) {
                if (str.contains("?")) {
                    str3 = str + com.ironsource.y8.i.c;
                } else {
                    str3 = str + "?";
                }
                str = str3 + "orientation=portrait";
            }
            if (str.contains("?")) {
                str2 = str + com.ironsource.y8.i.c;
            } else {
                str2 = str + "?";
            }
            str = str2 + "height=" + i2 + "&width=" + i3 + "&aspect_ratio=" + fJf;
        }
        return !com.bytedance.sdk.openadsdk.core.model.rri.iR(tuv) ? com.bytedance.sdk.openadsdk.utils.eqN.bg(str) : str;
    }

    public void vb() {
        com.bytedance.sdk.component.WR.eqN eqn = this.xxp;
        if (eqn != null) {
            com.bytedance.sdk.openadsdk.core.daV.bg(eqn.getWebView());
        }
        com.bytedance.sdk.component.WR.eqN eqn2 = this.VzQ;
        if (eqn2 != null) {
            com.bytedance.sdk.openadsdk.core.daV.bg(eqn2.getWebView());
        }
        long j = this.Pae;
        if (j > 0) {
            if (this.jz > 0) {
                this.Pae = j + (android.os.SystemClock.elapsedRealtime() - this.jz);
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", com.bytedance.sdk.openadsdk.core.model.tuV.bX(this.VB) ? 7 : 0);
            } catch (java.lang.Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.ZQc.IL, this.PX, "second_endcard_duration", jSONObject, this.Pae);
        }
        this.xxp = null;
        if (this.Kg != null && !com.bytedance.sdk.openadsdk.core.model.xxp.bX(this.VB) && !com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.VB) && !com.bytedance.sdk.openadsdk.core.model.tuV.bX(this.VB)) {
            this.Kg.bg(true);
            this.Kg.PX();
        }
        com.bytedance.sdk.openadsdk.core.aGH agh = this.bg;
        if (agh != null) {
            agh.VB();
        }
        com.bytedance.sdk.openadsdk.core.aGH agh2 = this.IL;
        if (agh2 != null) {
            agh2.VB();
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.zx;
        if (vb != null) {
            vb.bX(this.VB.ayS() || com.bytedance.sdk.openadsdk.core.model.rri.iR(this.VB));
        }
        com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.IL(this);
    }

    public void IL(int i) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.xxp, i);
        com.bytedance.sdk.component.WR.eqN eqn = this.xxp;
        if (eqn != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) eqn.getWebView(), i);
        }
        if (this.xxp != null && (this.VB.ayS() || com.bytedance.sdk.openadsdk.core.model.rri.iR(this.VB))) {
            this.xxp.setLandingPage(true);
            this.xxp.setTag(com.bytedance.sdk.openadsdk.core.model.rri.iR(this.VB) ? this.PX : "landingpage_endcard");
            this.xxp.setMaterialMeta(this.VB.mLT());
        }
        if (i == 0 && com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.VB)) {
            iR();
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.common.Ta ta) {
        this.daV = ta;
    }

    public void bg(float f) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(this.xxp, f);
    }

    public void IL(boolean z) {
        bg(this.bg, z);
    }

    public void bg(com.bytedance.sdk.openadsdk.core.aGH agh, boolean z) {
        if (this.bg == null || this.ZQc.uu.isFinishing()) {
            return;
        }
        agh.IL(z);
    }

    private void bg(java.lang.String str, final com.bytedance.sdk.openadsdk.component.reward.bg.tuV.eqN eqn) {
        com.bytedance.sdk.component.WR.eqN eqn2;
        com.bytedance.sdk.component.WR.eqN eqn3 = this.xxp;
        if (eqn3 != null && eqn3.getWebView() != null) {
            com.bytedance.sdk.openadsdk.eqN.VB vbBg = new com.bytedance.sdk.openadsdk.eqN.VB(this.VB, this.xxp.getWebView(), new com.bytedance.sdk.openadsdk.eqN.eo() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.7
                @Override // com.bytedance.sdk.openadsdk.eqN.eo
                public void bg(int i) {
                    if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ApA)) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.txA, com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.RJ, com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.gXn, com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.lM - com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.gXn, com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VB, "landingpage_endcard", i);
                }
            }, this.sVc).bg(true);
            this.zx = vbBg;
            this.Ld = vbBg.bg;
            this.zx.bg(xxp() ? "landingpage_endcard" : str);
            this.zx.IL(this.PX);
            this.zx.IL(true);
            this.xxp.getWebView().setOnScrollChangeListener(new android.view.View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.8
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.zx != null) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.zx.IL(i2);
                    }
                }
            });
            if (this.ZQc.JAA != null) {
                this.zx.bg(this.ZQc.JAA.eqN());
            }
            com.bytedance.sdk.openadsdk.common.eqN eqnBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(this.VB, this.xxp, this.ZQc.uu, this.PX);
            this.wS = eqnBg;
            if (eqnBg != null) {
                if (xxp()) {
                    str = "landingpage_endcard";
                }
                eqnBg.bg(str);
            }
            if (xxp()) {
                com.bytedance.sdk.openadsdk.utils.ayS.bg(this.VB, this.xxp);
            }
            com.bytedance.sdk.openadsdk.core.widget.bg.zx zxVar = new com.bytedance.sdk.openadsdk.core.widget.bg.zx(com.bytedance.sdk.openadsdk.core.VzQ.bg(), this.bg, this.VB.Ys(), this.wS, this.zx, this.VB.ayS() || com.bytedance.sdk.openadsdk.core.model.rri.iR(this.VB)) { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.9
                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str2) {
                    if (!com.bytedance.sdk.openadsdk.core.model.rri.iR(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VB)) {
                        try {
                            if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ApA)) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.yDt(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this);
                            com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel webResourceResponseModelBg = com.bytedance.sdk.openadsdk.iR.IL.bg().bg(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.GvG, com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ApA, str2);
                            if (webResourceResponseModelBg != null && webResourceResponseModelBg.getWebResourceResponse() != null) {
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.vb(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this);
                                return webResourceResponseModelBg.getWebResourceResponse();
                            }
                            if (webResourceResponseModelBg != null && webResourceResponseModelBg.getMsg() == 2) {
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.xxp(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this);
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (java.lang.Throwable th) {
                            com.bytedance.sdk.component.utils.PX.bg("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    android.webkit.WebResourceResponse webResourceResponseBg = com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VB.Dxa().Ta(), com.bytedance.sdk.openadsdk.core.model.rri.Ta(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VB), str2);
                    long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg != null) {
                        com.bytedance.sdk.component.adexpress.eqN.eo.bg bgVarBg = com.bytedance.sdk.component.adexpress.eqN.eo.bg(str2);
                        int i = webResourceResponseBg != null ? 1 : 2;
                        if (bgVarBg == com.bytedance.sdk.component.adexpress.eqN.eo.bg.HTML) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg.bg(str2, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        } else if (bgVarBg == com.bytedance.sdk.component.adexpress.eqN.eo.bg.JS) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg.IL(str2, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        }
                    }
                    if (webResourceResponseBg != null) {
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        return webResourceResponseBg;
                    }
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    return super.shouldInterceptRequest(webView, str2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str2, java.lang.String str3) {
                    super.onReceivedError(webView, i, str2, str3);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        android.util.Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((java.lang.Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.bg(webResourceRequest.getUrl().toString())) {
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.JAA.bg(webResourceError.getErrorCode(), java.lang.String.valueOf(webResourceError.getDescription()), java.lang.String.valueOf(webResourceRequest.getUrl()));
                        }
                        if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Fy.set(false);
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.cZH = false;
                        }
                        if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg != null) {
                            try {
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                if (webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                                }
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg.bg(jSONObject);
                            } catch (org.json.JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ldr = webResourceError.getErrorCode();
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.iR = java.lang.String.valueOf(webResourceError.getDescription());
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.JAA.bg(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        android.util.Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Fy.set(false);
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.cZH = false;
                        if (webResourceResponse != null) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ldr = webResourceResponse.getStatusCode();
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.iR = "onReceivedHttpError";
                        }
                    }
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg != null) {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            if (webResourceResponse != null) {
                                jSONObject.put("code", webResourceResponse.getStatusCode());
                                jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                            }
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg.bg(jSONObject);
                        } catch (org.json.JSONException unused) {
                        }
                    }
                    if (webResourceRequest != null) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onPageFinished(android.webkit.WebView webView, java.lang.String str2) {
                    super.onPageFinished(webView, str2);
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.cZH = false;
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.LZ = true;
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.VJ.Ja()) {
                        android.view.View viewEo = com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.LKE.eo();
                        if (viewEo instanceof com.bytedance.sdk.openadsdk.core.zx.eqN) {
                            ((com.bytedance.sdk.openadsdk.core.zx.eqN) viewEo).setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.Dxa, "tt_skip_btn"));
                        }
                    }
                    com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.bg(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this);
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.dS = com.bytedance.sdk.openadsdk.utils.DeviceUtils.iR();
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg != null) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg.ldr();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ZQc.JAA.IL(str2);
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.eqN eqn4 = eqn;
                    if (eqn4 != null) {
                        eqn4.bg(webView, str2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onPageStarted(android.webkit.WebView webView, java.lang.String str2, android.graphics.Bitmap bitmap) {
                    super.onPageStarted(webView, str2, bitmap);
                    if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg != null) {
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Kg.zx();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.eqN eqn4 = eqn;
                    if (eqn4 != null) {
                        eqn4.bg(webView, str2, bitmap);
                    }
                }
            };
            this.CQc = zxVar;
            this.xxp.setWebViewClient(zxVar);
            this.CQc.bg(this.VB);
            this.CQc.bg(this.yDt ? "rewarded_video" : "fullscreen_interstitial_ad");
            if (this.VB.ayS() && (eqn2 = this.xxp) != null && eqn2.getWebView() != null) {
                this.xxp.getWebView().setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.10
                    private final int IL = com.bytedance.sdk.openadsdk.core.VzQ.IL();

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                        int i;
                        if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.zx != null) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.zx.bg(motionEvent);
                        }
                        if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.wS != null) {
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.wS.bg(motionEvent);
                        }
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 0) {
                                int i2 = 3;
                                if (actionMasked == 1) {
                                    i = i2;
                                } else if (actionMasked != 2) {
                                    i2 = actionMasked != 3 ? -1 : 4;
                                    i = i2;
                                } else {
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (java.lang.Math.abs(rawX - com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Ja) >= this.IL || java.lang.Math.abs(rawY - com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Uw) >= this.IL) {
                                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.aGH = false;
                                    }
                                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VW += java.lang.Math.abs(motionEvent.getX() - com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Ja);
                                    com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VJ += java.lang.Math.abs(motionEvent.getY() - com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Uw);
                                    int i3 = (java.lang.System.currentTimeMillis() - com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.DDQ <= 200 || (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VW <= 8.0f && com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VJ <= 8.0f)) ? 2 : 1;
                                    if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ayS) {
                                        if (rawY - com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Uw > 8.0f) {
                                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.daV.bg();
                                        }
                                        if (rawY - com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Uw < -8.0f) {
                                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.daV.IL();
                                        }
                                    }
                                    i = i3;
                                }
                            } else {
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.aGH = true;
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Uq = new android.util.SparseArray();
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Ja = motionEvent.getRawX();
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Uw = motionEvent.getRawY();
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.DDQ = java.lang.System.currentTimeMillis();
                                try {
                                    long landingPageClickBegin = com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.xxp.getLandingPageClickBegin();
                                    if (landingPageClickBegin > 0 && landingPageClickBegin < com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.DDQ) {
                                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.DDQ = landingPageClickBegin;
                                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.xxp.setLandingPageClickBegin(-1L);
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VW = -1.0f;
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VJ = -1.0f;
                                i = 0;
                            }
                            com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Uq.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.IL.bX.bg(i, motionEvent.getSize(), motionEvent.getPressure(), java.lang.System.currentTimeMillis()));
                            if (motionEvent.getAction() != 1 || view.getVisibility() != 0 || java.lang.Float.valueOf(view.getAlpha()).intValue() != 1) {
                                return false;
                            }
                            if ((com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.tuV && !com.bytedance.sdk.openadsdk.core.model.xxp.iR(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VB)) || !com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.aGH) {
                                return false;
                            }
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("down_x", com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Ja);
                            jSONObject.put("down_y", com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Uw);
                            jSONObject.put("down_time", com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.DDQ);
                            jSONObject.put("up_x", motionEvent.getRawX());
                            jSONObject.put("up_y", motionEvent.getRawY());
                            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                            try {
                                long landingPageClickEnd = com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.xxp.getLandingPageClickEnd();
                                if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis) {
                                    try {
                                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.xxp.setLandingPageClickEnd(-1L);
                                    } catch (java.lang.Exception unused2) {
                                    }
                                    jCurrentTimeMillis = landingPageClickEnd;
                                }
                            } catch (java.lang.Exception unused3) {
                            }
                            jSONObject.put("up_time", jCurrentTimeMillis);
                            int[] iArr = new int[2];
                            if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.ayS) {
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV tuv = com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this;
                                tuv.JAA = tuv.ZQc.CQc.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Dt);
                            } else {
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV tuv2 = com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this;
                                tuv2.JAA = tuv2.ZQc.CQc.findViewById(520093713);
                            }
                            if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.JAA != null) {
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.JAA.getLocationOnScreen(iArr);
                                jSONObject.put("button_x", iArr[0]);
                                jSONObject.put("button_y", iArr[1]);
                                jSONObject.put("button_width", com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.JAA.getWidth());
                                jSONObject.put("button_height", com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.JAA.getHeight());
                            }
                            if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.kMt != null) {
                                int[] iArr2 = new int[2];
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.kMt.getLocationOnScreen(iArr2);
                                jSONObject.put("ad_x", iArr2[0]);
                                jSONObject.put("ad_y", iArr2[1]);
                                jSONObject.put("width", com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.kMt.getWidth());
                                jSONObject.put("height", com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.kMt.getHeight());
                            }
                            jSONObject.put("toolType", motionEvent.getToolType(0));
                            jSONObject.put("deviceId", motionEvent.getDeviceId());
                            jSONObject.put("source", motionEvent.getSource());
                            jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.eo.bg(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.Uq, com.bytedance.sdk.openadsdk.core.WR.IL().bg() ? 1 : 2));
                            jSONObject.put("user_behavior_type", com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.aGH ? 1 : 2);
                            jSONObject.put("click_scence", 2);
                            if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.CQc != null) {
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.CQc.bg(jSONObject);
                            }
                            if (!com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.tuV && !com.bytedance.sdk.openadsdk.core.model.xxp.ldr(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VB)) {
                                if (com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.yDt) {
                                    com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VB, "rewarded_video", com.json.z8.CLICK, jSONObject);
                                } else {
                                    com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.VB, "fullscreen_interstitial_ad", com.json.z8.CLICK, jSONObject);
                                }
                                com.bytedance.sdk.openadsdk.component.reward.bg.tuV.this.tuV = true;
                                return false;
                            }
                            return false;
                        } catch (java.lang.Throwable th) {
                            android.util.Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th);
                            return false;
                        }
                    }
                });
            }
            com.bytedance.sdk.component.WR.eqN eqn4 = this.xxp;
            if (eqn4 != null) {
                eqn4.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.bg.eqN(this.bg, this.zx, this.wS) { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.tuV.11
                    @Override // com.bytedance.sdk.openadsdk.core.widget.bg.eqN, android.webkit.WebChromeClient
                    public void onProgressChanged(android.webkit.WebView webView, int i) {
                        super.onProgressChanged(webView, i);
                        com.bytedance.sdk.openadsdk.component.reward.bg.tuV.eqN eqn5 = eqn;
                        if (eqn5 != null) {
                            eqn5.bg(webView, i);
                        }
                    }
                });
            }
            bg(this.xxp);
            this.xxp.setLayerType(1, null);
            this.xxp.setBackgroundColor(-1);
            this.xxp.setDisplayZoomControls(false);
        }
        zx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return true;
        }
        return this.VB.ayS() && str.endsWith(".mp4");
    }

    public boolean xxp() {
        java.lang.String str = this.eqN;
        if (str == null) {
            return false;
        }
        try {
            return android.net.Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public void bg(android.webkit.DownloadListener downloadListener) {
        com.bytedance.sdk.component.WR.eqN eqn = this.xxp;
        if (eqn == null || downloadListener == null) {
            return;
        }
        eqn.setDownloadListener(downloadListener);
    }

    public boolean VzQ() {
        return this.Fy.get();
    }

    public boolean tuV() {
        return this.LZ;
    }

    public void bg(com.bytedance.sdk.component.WR.eqN eqn) {
        if (eqn == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.bg.bX.bg(this.ZQc.uu).bg(false).IL(false).bg(eqn.getWebView());
        eqn.setUserAgentString(com.bytedance.sdk.openadsdk.utils.xxp.bg(eqn.getWebView(), com.bytedance.sdk.openadsdk.BuildConfig.VERSION_CODE));
        eqn.setMixedContentMode(0);
    }

    public void Fy() {
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.Kg;
        if (zxVar != null) {
            zxVar.WR();
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.zx;
        if (vb != null) {
            vb.Kg();
        }
    }

    public void LZ() {
        com.bytedance.sdk.component.WR.eqN eqn = this.xxp;
        if (eqn != null) {
            eqn.VB();
        }
        com.bytedance.sdk.component.WR.eqN eqn2 = this.VzQ;
        if (eqn2 != null) {
            eqn2.VB();
        }
        if (this.jz > 0) {
            this.Pae += android.os.SystemClock.elapsedRealtime() - this.jz;
            this.jz = 0L;
        }
        com.bytedance.sdk.openadsdk.core.aGH agh = this.bg;
        if (agh != null) {
            agh.IL(false);
            IL(this.bg, false);
            bg(this.bg, true, false);
        }
        if (this.IL == null || !com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.VB)) {
            return;
        }
        this.IL.IL(false);
        IL(this.IL, false);
        bg(this.IL, true, false);
    }

    public void bX(boolean z) {
        IL(this.bg, z);
    }

    public void IL(com.bytedance.sdk.openadsdk.core.aGH agh, boolean z) {
        try {
            this.ZQc.JAA.eqN(z);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("viewStatus", z ? 1 : 0);
            agh.bg(com.ironsource.y8.g.U, jSONObject);
        } catch (java.lang.Exception unused) {
        }
    }

    public void bg(boolean z, boolean z2) {
        bg(this.bg, z, z2);
    }

    public void bg(com.bytedance.sdk.openadsdk.core.aGH agh, boolean z, boolean z2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put("endcard_show", z2);
            com.bytedance.sdk.openadsdk.activity.ldr ldrVar = this.ZQc.kU;
            if (ldrVar != null) {
                jSONObject.put("multi_ads_show", ldrVar.kMt().ldr());
            }
            agh.bg("endcard_control_event", jSONObject);
            if (z2) {
                if (this.LZ) {
                    return;
                }
                this.bCU = true;
                return;
            }
            this.bCU = false;
        } catch (java.lang.Exception unused) {
        }
    }

    public void eqN(boolean z) {
        if (this.bg == null || this.ZQc.uu.isFinishing()) {
            return;
        }
        this.ZQc.JAA.zx(z);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("endcard_mute", z);
            this.bg.bg("volumeChange", jSONObject);
        } catch (java.lang.Exception unused) {
        }
    }

    public void tC() {
        com.bytedance.sdk.component.WR.eqN eqn = this.xxp;
        if (eqn != null) {
            eqn.WR();
        }
        com.bytedance.sdk.component.WR.eqN eqn2 = this.VzQ;
        if (eqn2 != null) {
            eqn2.WR();
        }
        if (this.jz == 0) {
            this.jz = android.os.SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.core.aGH agh = this.bg;
        if (agh != null) {
            agh.eo();
            com.bytedance.sdk.component.WR.eqN eqn3 = this.xxp;
            if (eqn3 != null) {
                if (eqn3.getVisibility() == 0) {
                    this.bg.IL(true);
                    IL(this.bg, true);
                    bg(this.bg, false, true);
                    if (com.bytedance.sdk.openadsdk.core.model.rri.eo(this.VB) && !this.uu && this.ZQc.IL.vTg()) {
                        WR();
                    }
                } else {
                    this.bg.IL(false);
                    IL(this.bg, false);
                    bg(this.bg, true, false);
                }
            }
        }
        if (this.IL != null && com.bytedance.sdk.openadsdk.core.model.rri.Kg(this.VB)) {
            this.IL.eo();
            com.bytedance.sdk.component.WR.eqN eqn4 = this.VzQ;
            if (eqn4 != null) {
                if (eqn4.getVisibility() == 0) {
                    this.IL.IL(true);
                    IL(this.IL, true);
                    bg(this.IL, false, true);
                    if (!this.uu && this.ZQc.IL.vTg()) {
                        Pae();
                    }
                } else {
                    this.IL.IL(false);
                    IL(this.IL, false);
                    bg(this.IL, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.zx;
        if (vb != null) {
            vb.iR();
        }
    }

    public int rri() {
        return this.ldr;
    }

    public java.lang.String kMt() {
        return this.iR;
    }

    public java.lang.String JAA() {
        return this.eqN;
    }

    public boolean Ja() {
        if (com.bytedance.sdk.openadsdk.core.model.tuV.bX(this.VB)) {
            return this.qC && !this.Dxa && this.ZQc.daV.PX();
        }
        return this.qC && !this.Dxa && this.Fy.get() && this.LZ;
    }

    public void Uw() {
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.Kg;
        if (zxVar != null) {
            zxVar.Kg();
        }
    }

    public void bg(boolean z, int i, java.lang.String str) {
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.Kg;
        if (zxVar == null) {
            return;
        }
        if (z) {
            zxVar.IL();
        } else {
            zxVar.bg(i, str);
        }
    }

    public void DDQ() {
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.Kg;
        if (zxVar != null) {
            zxVar.iR();
        }
    }

    public void Uq() {
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.zx;
        if (vb != null) {
            vb.bg(java.lang.System.currentTimeMillis());
        }
    }

    public boolean aGH() {
        return this.WR;
    }

    public void VW() {
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.Kg;
        if (zxVar != null) {
            zxVar.bX();
            this.Kg.eqN();
        }
    }

    public void VJ() {
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.Kg;
        if (zxVar != null) {
            zxVar.eo();
        }
    }

    private com.bytedance.sdk.openadsdk.eqN.eqN.zx RJ() {
        return new com.bytedance.sdk.openadsdk.eqN.VzQ(com.bytedance.sdk.openadsdk.core.model.rri.iR(this.VB) ? 3 : 2, this.yDt ? "rewarded_video" : "fullscreen_interstitial_ad", this.VB);
    }

    public boolean daV() {
        com.bytedance.sdk.openadsdk.core.aGH agh = this.bg;
        if (agh == null) {
            return false;
        }
        return agh.Kg();
    }

    @Override // com.bytedance.sdk.openadsdk.PX.iR
    public void bg(int i) {
        int i2 = this.dS;
        if (i2 <= 0 && i > 0) {
            eqN(false);
        } else if (i2 > 0 && i == 0) {
            eqN(true);
        }
        this.dS = i;
    }

    public void ayS() {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.xxp, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.VzQ, 8);
    }

    public void ZQc() {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.VzQ, 8);
    }

    public void zx(boolean z) {
        this.Dxa = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("endcard_overlay_render_type", com.bytedance.sdk.openadsdk.core.model.tuV.bX(this.VB) ? 7 : 0);
        } catch (java.lang.Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.IL(this.VB, this.PX, "use_second_endcard", jSONObject);
        this.jz = android.os.SystemClock.elapsedRealtime();
        try {
            if (!com.bytedance.sdk.openadsdk.core.model.tuV.bX(this.VB)) {
                this.bg.bg("click_endcard_close", (org.json.JSONObject) null);
            } else if (z) {
                this.ZQc.daV.Kg();
                com.bytedance.sdk.openadsdk.eqN.bX.IL(this.VB, this.PX, "endcard_close_skip", jSONObject);
            }
        } catch (java.lang.Exception unused2) {
        }
        this.ZQc.Dt.bg(this.ZQc.Kg);
    }

    public boolean LKE() {
        return this.LZ && this.Fy.get();
    }

    public boolean CQc() {
        return this.Ys;
    }

    public boolean uu() {
        com.bytedance.sdk.component.WR.eqN eqn = this.xxp;
        return eqn == null || eqn.getWebView() == null;
    }

    private static class IL implements com.bytedance.sdk.openadsdk.PX.bg {
        private final android.view.View bg;

        public IL(android.view.View view) {
            this.bg = view;
        }

        @Override // com.bytedance.sdk.openadsdk.PX.bg
        public int bg() {
            android.view.View view = this.bg;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            return measuredHeight <= 0 ? com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg()) : measuredHeight;
        }

        @Override // com.bytedance.sdk.openadsdk.PX.bg
        public int IL() {
            android.view.View view = this.bg;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            return measuredWidth <= 0 ? com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg()) : measuredWidth;
        }
    }

    private static class bX implements com.bytedance.sdk.openadsdk.PX.WR {
        private final com.bytedance.sdk.component.WR.eqN bg;

        private bX(com.bytedance.sdk.component.WR.eqN eqn) {
            this.bg = eqn;
        }

        @Override // com.bytedance.sdk.openadsdk.PX.WR
        public void bg() {
            com.bytedance.sdk.component.WR.eqN eqn = this.bg;
            if (eqn == null) {
                return;
            }
            eqn.VB();
        }

        @Override // com.bytedance.sdk.openadsdk.PX.WR
        public void IL() {
            com.bytedance.sdk.component.WR.eqN eqn = this.bg;
            if (eqn == null) {
                return;
            }
            eqn.yDt();
        }
    }

    public void qC() {
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.zx;
        if (vb != null) {
            vb.zx();
        }
    }

    private static class bg extends com.bytedance.sdk.openadsdk.core.IL.bg implements com.bytedance.sdk.openadsdk.core.IL.IL.bg {
        private final android.view.View IL;
        private final android.view.View.OnClickListener bX;
        private final com.bytedance.sdk.openadsdk.component.reward.bg.bg bg;

        public bg(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar, android.view.View view, android.view.View.OnClickListener onClickListener) {
            super(bgVar.uu, bgVar.IL, bgVar.zx, bgVar.eqN ? 7 : 5);
            this.bg = bgVar;
            this.IL = view;
            this.bX = onClickListener;
            java.util.HashMap map = new java.util.HashMap();
            map.put("close_auto_click", java.lang.Boolean.TRUE);
            map.put("click_scence", 2);
            bg(map);
            bg(bgVar.kMt.bX());
            bg(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.IL.bg, com.bytedance.sdk.openadsdk.core.IL.IL, com.bytedance.sdk.openadsdk.core.IL.bX
        public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
            if (this.ldr.vTg()) {
                this.bX.onClick(view);
                this.IL.setOnTouchListener(null);
                this.IL.setOnClickListener(this.bX);
            } else {
                super.bg(view, f, f2, f3, f4, sparseArray, z);
                this.bg.qC.c_();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
        public void bg(android.view.View view, int i) {
            this.IL.setOnTouchListener(null);
            this.IL.setOnClickListener(this.bX);
        }
    }

    public boolean Dxa() {
        return this.uu;
    }

    public void ldr(boolean z) {
        this.Ys = z;
    }

    public boolean bN() {
        return this.eo;
    }
}
