package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class Fy extends com.bytedance.sdk.openadsdk.core.zx.bX implements com.bytedance.sdk.component.adexpress.IL.Kg, com.bytedance.sdk.component.adexpress.IL.Lq, com.bytedance.sdk.component.adexpress.dynamic.eqN, com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg, com.bytedance.sdk.openadsdk.core.Kg.yDt {
    public static int LZ = 500;
    private java.util.List<com.bytedance.sdk.component.adexpress.IL.eo> ApA;
    private com.bytedance.sdk.openadsdk.core.Kg.tC CQc;
    public com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> DDQ;
    private long Dt;
    private final android.view.ViewTreeObserver.OnScrollChangedListener Dxa;
    protected java.util.HashSet<java.lang.String> Fy;
    private com.bytedance.sdk.openadsdk.core.VB.eqN.bX GZ;
    private com.bytedance.sdk.component.adexpress.IL.xxp GvG;
    private int IL;
    public com.bytedance.sdk.openadsdk.eqN.iR JAA;
    long Ja;
    protected final android.content.Context Kg;
    private boolean LKE;
    private com.bytedance.sdk.component.adexpress.IL.Ta Ld;
    protected com.bytedance.sdk.component.adexpress.IL.bX Lq;
    private com.bytedance.sdk.openadsdk.core.bX.iR Ny;
    public android.widget.FrameLayout PX;
    private final java.lang.Runnable Pae;
    private com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver RJ;
    private float RiO;
    protected boolean Ta;
    private java.lang.String Uq;
    protected com.bytedance.sdk.component.adexpress.IL.IL Uw;
    protected com.bytedance.sdk.openadsdk.core.model.tuV VB;
    private com.bytedance.sdk.openadsdk.eqN.eqN.zx VJ;
    private float VW;
    protected int VzQ;
    protected java.lang.String WR;
    private float Ys;
    private com.bytedance.sdk.openadsdk.core.bX.eqN.bg ZQc;
    private float aGH;
    private java.lang.String ayS;
    private com.bytedance.sdk.component.adexpress.IL.WR bCU;
    private final java.lang.Runnable bN;
    private com.bytedance.sdk.openadsdk.bX.bX bX;
    private boolean bg;
    private final android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> cZH;
    private float dS;
    private java.lang.String daV;
    protected com.bytedance.sdk.openadsdk.AdSlot eo;
    private com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract eqN;
    private com.bytedance.sdk.openadsdk.core.VB.IL.zx gXn;
    private com.bytedance.sdk.openadsdk.core.Kg.WR iR;
    private final java.lang.Runnable jz;
    boolean kMt;
    private com.bytedance.sdk.component.adexpress.IL.ldr lM;
    private com.bytedance.sdk.openadsdk.core.Kg.Kg ldr;
    private com.bytedance.sdk.openadsdk.core.Kg.bX qC;
    int rri;
    private com.bytedance.sdk.component.adexpress.IL.eo.bg sVc;
    public boolean tC;
    protected java.lang.String tuV;
    private com.bytedance.sdk.openadsdk.core.Kg.kMt txA;
    private final java.util.concurrent.atomic.AtomicBoolean uu;
    protected boolean vb;
    private int wS;
    boolean xxp;
    protected boolean yDt;
    private float zCS;
    private com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener zx;

    public void IL() {
    }

    public void IL(int i) {
    }

    public long bX() {
        return 0L;
    }

    public void bg() {
    }

    public void bg(int i) {
    }

    public void bg(int i, java.lang.String str) {
    }

    protected void bg(com.bytedance.sdk.component.adexpress.IL.Ta.bg bgVar) {
    }

    protected void bg(org.json.JSONObject jSONObject) {
    }

    public void bg(boolean z) {
    }

    protected boolean bg(com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        return true;
    }

    public int eqN() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void onvideoComplate() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void setTimeUpdate(int i) {
    }

    public void zx() {
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.ldr ldrVar) {
        if (this.txA != null && getJsObject() != null) {
            getJsObject().bg(ldrVar);
        }
        com.bytedance.sdk.openadsdk.core.VB.eqN.bX bXVar = this.GZ;
        if (bXVar != null) {
            bXVar.bg(ldrVar);
        }
    }

    public com.bytedance.sdk.openadsdk.eqN.iR getAdShowTime() {
        return this.JAA;
    }

    public void setClosedListenerKey(java.lang.String str) {
        this.ayS = str;
        com.bytedance.sdk.openadsdk.core.Kg.bX bXVar = this.qC;
        if (bXVar != null) {
            bXVar.bg(str);
        }
    }

    public com.bytedance.sdk.openadsdk.core.Kg.bX getBrandBannerController() {
        return this.qC;
    }

    public java.lang.String getClosedListenerKey() {
        return this.ayS;
    }

    public void setBannerClickClosedListener(com.bytedance.sdk.openadsdk.core.bX.eqN.bg bgVar) {
        this.ZQc = bgVar;
    }

    public Fy(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, java.lang.String str) {
        super(context);
        this.bg = true;
        this.IL = 0;
        this.WR = "embeded_ad";
        this.Uq = null;
        this.yDt = false;
        this.vb = false;
        this.xxp = true;
        this.VzQ = -1;
        this.daV = "";
        this.tC = false;
        this.LKE = true;
        this.rri = -1;
        this.JAA = new com.bytedance.sdk.openadsdk.eqN.iR();
        this.Ja = 0L;
        this.uu = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.Dxa = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.Kg.Fy.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                if (com.bytedance.sdk.openadsdk.core.Kg.Fy.this.xxp) {
                    com.bytedance.sdk.openadsdk.core.Kg.Fy.this.LZ();
                    com.bytedance.sdk.openadsdk.core.Kg.Fy fy = com.bytedance.sdk.openadsdk.core.Kg.Fy.this;
                    fy.removeCallbacks(fy.bN);
                    com.bytedance.sdk.openadsdk.core.Kg.Fy fy2 = com.bytedance.sdk.openadsdk.core.Kg.Fy.this;
                    fy2.postDelayed(fy2.bN, 500L);
                }
            }
        };
        this.bN = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.Fy.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.VW.bg(com.bytedance.sdk.openadsdk.core.Kg.Fy.this, 0, 5)) {
                    com.bytedance.sdk.openadsdk.core.Kg.Fy fy = com.bytedance.sdk.openadsdk.core.Kg.Fy.this;
                    fy.zx(fy.getVisibility());
                } else {
                    com.bytedance.sdk.openadsdk.core.Kg.Fy.this.zx(8);
                }
            }
        };
        this.jz = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.Fy.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.Kg.Fy.this.zx(0);
            }
        };
        this.Pae = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.Fy.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.Kg.Fy.this.zx(8);
            }
        };
        this.wS = 8;
        this.cZH = new android.util.SparseArray<>();
        this.zCS = -1.0f;
        this.Ys = -1.0f;
        this.dS = -1.0f;
        this.RiO = -1.0f;
        this.Dt = 0L;
        this.WR = str;
        this.Kg = context;
        this.VB = tuv;
        this.eo = adSlot;
        this.tC = false;
        ldr();
    }

    public Fy(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.AdSlot adSlot, java.lang.String str, boolean z, boolean z2) {
        super(context);
        this.bg = true;
        this.IL = 0;
        this.WR = "embeded_ad";
        this.Uq = null;
        this.yDt = false;
        this.vb = false;
        this.xxp = true;
        this.VzQ = -1;
        this.daV = "";
        this.tC = false;
        this.LKE = true;
        this.rri = -1;
        this.JAA = new com.bytedance.sdk.openadsdk.eqN.iR();
        this.Ja = 0L;
        this.uu = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.Dxa = new android.view.ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.Kg.Fy.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                if (com.bytedance.sdk.openadsdk.core.Kg.Fy.this.xxp) {
                    com.bytedance.sdk.openadsdk.core.Kg.Fy.this.LZ();
                    com.bytedance.sdk.openadsdk.core.Kg.Fy fy = com.bytedance.sdk.openadsdk.core.Kg.Fy.this;
                    fy.removeCallbacks(fy.bN);
                    com.bytedance.sdk.openadsdk.core.Kg.Fy fy2 = com.bytedance.sdk.openadsdk.core.Kg.Fy.this;
                    fy2.postDelayed(fy2.bN, 500L);
                }
            }
        };
        this.bN = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.Fy.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.VW.bg(com.bytedance.sdk.openadsdk.core.Kg.Fy.this, 0, 5)) {
                    com.bytedance.sdk.openadsdk.core.Kg.Fy fy = com.bytedance.sdk.openadsdk.core.Kg.Fy.this;
                    fy.zx(fy.getVisibility());
                } else {
                    com.bytedance.sdk.openadsdk.core.Kg.Fy.this.zx(8);
                }
            }
        };
        this.jz = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.Fy.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.Kg.Fy.this.zx(0);
            }
        };
        this.Pae = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Kg.Fy.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.Kg.Fy.this.zx(8);
            }
        };
        this.wS = 8;
        this.cZH = new android.util.SparseArray<>();
        this.zCS = -1.0f;
        this.Ys = -1.0f;
        this.dS = -1.0f;
        this.RiO = -1.0f;
        this.Dt = 0L;
        this.WR = str;
        this.Kg = context;
        this.VB = tuv;
        this.eo = adSlot;
        this.tC = z;
        this.LKE = z2;
        ldr();
    }

    protected void ldr() {
        this.Fy = new java.util.HashSet<>();
        this.RJ = new com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver();
        com.bytedance.sdk.openadsdk.AdSlot adSlot = this.eo;
        if (adSlot != null) {
            this.aGH = adSlot.getExpressViewAcceptedWidth();
            this.VW = this.eo.getExpressViewAcceptedHeight();
            iR();
            this.Uq = this.eo.getCodeId();
            if (android.text.TextUtils.equals(this.WR, "fullscreen_interstitial_ad")) {
                this.rri = com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV(this.Uq);
            } else if (android.text.TextUtils.equals(this.WR, "rewarded_video")) {
                this.rri = com.bytedance.sdk.openadsdk.core.VzQ.eqN().eo(this.Uq);
            } else if (android.text.TextUtils.equals(this.WR, "open_ad")) {
                int iTC = com.bytedance.sdk.openadsdk.core.VzQ.eqN().tC(this.Uq);
                this.rri = iTC;
                if (iTC < 0) {
                    this.rri = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.VB.eK()) {
            this.qC = new com.bytedance.sdk.openadsdk.core.Kg.bX(this.Kg, this, this.VB, this.WR);
            return;
        }
        vb();
        this.ApA = new java.util.ArrayList();
        xxp();
        com.bytedance.sdk.component.adexpress.IL.xxp xxpVar = this.GvG;
        if (xxpVar != null) {
            this.txA = (com.bytedance.sdk.openadsdk.core.Kg.kMt) xxpVar.IL();
        }
        com.bytedance.sdk.openadsdk.core.aGH jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.ldr(this.WR);
        }
    }

    private void iR() {
        com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVarLKE = this.VB.LKE();
        if (!android.text.TextUtils.equals(this.WR, "embeded_ad") || bgVarLKE == null) {
            return;
        }
        java.lang.String strPX = bgVarLKE.PX();
        if (android.text.TextUtils.isEmpty(strPX)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(strPX);
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            if (iOptInt == 0 || iOptInt2 == 0) {
                return;
            }
            this.VW = iOptInt2;
            this.aGH = iOptInt;
        } catch (java.lang.Exception unused) {
        }
    }

    public com.bytedance.sdk.component.WR.eqN getWebView() {
        com.bytedance.sdk.openadsdk.core.Kg.kMt kmt = this.txA;
        if (kmt == null) {
            return null;
        }
        return kmt.bg();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    private void vb() {
        long jOptLong;
        boolean z;
        com.bytedance.sdk.component.adexpress.IL.Ta.bg bgVar;
        this.VJ = new com.bytedance.sdk.openadsdk.eqN.VzQ(1, this.WR, this.VB);
        this.bCU = new com.bytedance.sdk.openadsdk.core.Kg.Ta(this.VJ, this.WR, this.VB, this.Uq);
        final boolean zCQc = this.VB.CQc();
        try {
            com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVarLKE = this.VB.LKE();
            if (bgVarLKE != null) {
                java.lang.String strVB = bgVarLKE.VB();
                if (android.text.TextUtils.isEmpty(strVB)) {
                    jOptLong = 0;
                } else {
                    jOptLong = new org.json.JSONObject(strVB).optLong("render_delay_time");
                }
            } else {
                jOptLong = 0;
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            z = !com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.VB) && com.bytedance.sdk.openadsdk.core.VzQ.eqN().Ta(this.Uq) == 1;
            try {
                if (!com.bytedance.sdk.openadsdk.core.settings.xxp.zU().yDt(this.Uq) || this.VB.vb() == 5 || this.VB.vb() == 6 || this.VB.JMw() == 3) {
                    z = true;
                }
            } catch (java.lang.Exception unused2) {
            }
        } catch (java.lang.Exception unused3) {
            z = false;
        }
        long jMin = java.lang.Math.min(java.lang.Math.max(jOptLong, 0L), 10000L);
        int renderTimeout = getRenderTimeout();
        double dLdr = this.VB.Dxa() != null ? this.VB.Dxa().ldr() * ((double) this.VB.Dxa().tC()) : 0.0d;
        int i = this.rri;
        this.kMt = i != -1 && i < ((int) dLdr);
        if (com.bytedance.sdk.openadsdk.core.VB.bX.bg(this.VB) || com.bytedance.sdk.openadsdk.core.VB.bX.IL(this.VB)) {
            com.bytedance.sdk.openadsdk.core.VB.eqN.bg.C0147bg c0147bg = new com.bytedance.sdk.openadsdk.core.VB.eqN.bg.C0147bg();
            if (com.bytedance.sdk.openadsdk.core.VB.bX.bg(this.VB)) {
                c0147bg.bg(com.bytedance.sdk.openadsdk.core.VB.bX.bg(this.VB, this.WR));
            }
            c0147bg.bg((com.bytedance.adsdk.ugeno.core.Lq) this.bCU);
            c0147bg.bg(this.aGH);
            c0147bg.IL(this.VW);
            bgVar = c0147bg;
        } else {
            bgVar = new com.bytedance.sdk.component.adexpress.IL.Ta.bg();
        }
        bgVar.zx(zCQc);
        bgVar.bg(this.WR).IL(this.VB.Ys()).bX(this.VB.PC()).eqN(this.VB.Ny()).bg(this.bCU).eqN(this.VB.yda()).bg(renderTimeout).IL(this.VB.ZyO()).bX(this.LKE).IL(this.VB.DDQ()).bg(jMin).bX(this.VB.jz()).bg(com.bytedance.sdk.openadsdk.core.Kg.bg.IL.bg(this.VB)).eqN(z).zx(this.rri).bg(this.kMt).bg(dLdr).ldr(com.bytedance.sdk.openadsdk.core.settings.xxp.zU().jA()).bg(new com.bytedance.sdk.component.adexpress.IL.zx() { // from class: com.bytedance.sdk.openadsdk.core.Kg.Fy.5
            @Override // com.bytedance.sdk.component.adexpress.IL.zx
            public org.json.JSONObject bg() {
                try {
                    if (com.bytedance.sdk.openadsdk.core.Kg.Fy.this.VB == null) {
                        com.bytedance.sdk.openadsdk.core.Kg.Fy.this.daV = "material is null";
                        return null;
                    }
                    if (zCQc) {
                        com.bytedance.sdk.openadsdk.core.Kg.Fy.this.CQc = new com.bytedance.sdk.openadsdk.core.Kg.tC();
                        org.json.JSONObject jSONObjectBg = com.bytedance.sdk.openadsdk.core.Kg.bg.IL.bg(com.bytedance.sdk.openadsdk.core.Kg.Fy.this.aGH, com.bytedance.sdk.openadsdk.core.Kg.Fy.this.VW, com.bytedance.sdk.openadsdk.core.Kg.Fy.this.yDt, com.bytedance.sdk.openadsdk.core.Kg.Fy.this.VB, com.bytedance.sdk.openadsdk.core.Kg.Fy.this.WR, com.bytedance.sdk.openadsdk.core.Kg.Fy.this.CQc);
                        com.bytedance.sdk.openadsdk.core.Kg.Fy.this.daV = com.bytedance.sdk.openadsdk.core.Kg.bg.IL.bg();
                        return jSONObjectBg;
                    }
                    if (com.bytedance.sdk.openadsdk.core.VB.bX.bg(com.bytedance.sdk.openadsdk.core.Kg.Fy.this.VB)) {
                        com.bytedance.sdk.openadsdk.core.Kg.Fy.this.CQc = new com.bytedance.sdk.openadsdk.core.Kg.tC();
                        org.json.JSONObject jSONObjectBg2 = com.bytedance.sdk.openadsdk.core.VB.bX.bg(com.bytedance.sdk.openadsdk.core.Kg.Fy.this.VB, com.bytedance.sdk.openadsdk.core.Kg.Fy.this.CQc);
                        com.bytedance.sdk.openadsdk.core.Kg.Fy.this.daV = com.bytedance.sdk.openadsdk.core.VB.bX.bg();
                        return jSONObjectBg2;
                    }
                    org.json.JSONObject jSONObjectBg3 = com.bytedance.sdk.openadsdk.core.Kg.bg.IL.bg(com.bytedance.sdk.openadsdk.core.Kg.Fy.this.aGH, com.bytedance.sdk.openadsdk.core.Kg.Fy.this.VW, com.bytedance.sdk.openadsdk.core.Kg.Fy.this.yDt, com.bytedance.sdk.openadsdk.core.Kg.Fy.this.VB);
                    com.bytedance.sdk.openadsdk.core.Kg.Fy.this.bg(jSONObjectBg3);
                    return jSONObjectBg3;
                } catch (java.lang.Throwable unused4) {
                    return null;
                }
            }
        });
        bg(bgVar);
        this.Ld = bgVar.bg();
    }

    public java.lang.String getUgenTemplateErrorReason() {
        return this.daV;
    }

    protected int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw();
    }

    private void xxp() {
        if (this.VB.Fx() == 1 && this.VB.HXG()) {
            com.bytedance.sdk.component.adexpress.IL.ldr ldrVar = new com.bytedance.sdk.component.adexpress.IL.ldr(this.Kg, this.Ld, new com.bytedance.sdk.openadsdk.core.Kg.LZ(this, this.RJ, this.Ld));
            this.lM = ldrVar;
            this.ApA.add(ldrVar);
            this.sVc = new com.bytedance.sdk.component.adexpress.IL.PX(this.ApA, this.bCU);
            return;
        }
        if (JAA()) {
            VzQ();
            return;
        }
        try {
            tuV();
            this.txA = new com.bytedance.sdk.openadsdk.core.Kg.kMt(this.Kg, this.Ld, this.RJ, this.VJ, this.VB);
            com.bytedance.sdk.component.adexpress.IL.xxp xxpVar = new com.bytedance.sdk.component.adexpress.IL.xxp(this.Kg, this.Ld, this.txA, this);
            this.GvG = xxpVar;
            this.ApA.add(xxpVar);
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        com.bytedance.sdk.component.adexpress.IL.ldr ldrVar2 = new com.bytedance.sdk.component.adexpress.IL.ldr(this.Kg, this.Ld, new com.bytedance.sdk.openadsdk.core.Kg.LZ(this, this.RJ, this.Ld));
        this.lM = ldrVar2;
        this.ApA.add(ldrVar2);
        this.sVc = new com.bytedance.sdk.component.adexpress.IL.PX(this.ApA, this.bCU);
    }

    private void VzQ() {
        this.IL = this.VB.JAA();
        try {
            tuV();
            Fy();
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        boolean z = this.VB.Ja() == 1;
        this.bg = z;
        if (z) {
            com.bytedance.sdk.component.adexpress.IL.ldr ldrVar = new com.bytedance.sdk.component.adexpress.IL.ldr(this.Kg, this.Ld, new com.bytedance.sdk.openadsdk.core.Kg.LZ(this, this.RJ, this.Ld));
            this.lM = ldrVar;
            this.ApA.add(ldrVar);
        }
        new java.lang.StringBuilder("initRender: mRenderSequenceType is ").append(this.IL).append(", mInterceptors is ").append(this.ApA);
        this.sVc = new com.bytedance.sdk.component.adexpress.IL.PX(this.ApA, this.bCU);
    }

    private void tuV() {
        if (com.bytedance.sdk.openadsdk.core.yDt.zx()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.Kg.PX.bg();
    }

    private void Fy() {
        com.bytedance.sdk.openadsdk.core.ldr.bg.bg bgVar = new com.bytedance.sdk.openadsdk.core.ldr.bg.bg();
        int i = this.IL;
        if (i == 3) {
            com.bytedance.sdk.component.adexpress.dynamic.zx.iR iRVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.iR();
            com.bytedance.sdk.component.adexpress.IL.IL il = new com.bytedance.sdk.component.adexpress.IL.IL(this.Kg.getApplicationContext(), this.Ld, this.RJ, this.tC, iRVar, this, bgVar, new com.bytedance.sdk.openadsdk.core.Kg.ldr(this.Kg, this.RJ, this.tC, iRVar, this.Ld, bgVar));
            this.Uw = il;
            this.ApA.add(il);
            return;
        }
        if (i == 7) {
            this.GZ = new com.bytedance.sdk.openadsdk.core.VB.eqN.bX(this.Kg, this.VB, this.tC, (com.bytedance.sdk.openadsdk.core.VB.eqN.bg) this.Ld, this);
            com.bytedance.sdk.openadsdk.core.VB.IL.zx zxVar = new com.bytedance.sdk.openadsdk.core.VB.IL.zx(this.Kg, this.GZ, this, this.Ld);
            this.gXn = zxVar;
            this.ApA.add(zxVar);
            return;
        }
        if (i == 10) {
            com.bytedance.sdk.openadsdk.core.VB.IL.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.VB.IL.zx(this.Kg, new com.bytedance.sdk.openadsdk.core.VB.eqN.zx(this.Kg, this.VB, this.tC, (com.bytedance.sdk.openadsdk.core.VB.eqN.bg) this.Ld, this), this, this.Ld);
            this.gXn = zxVar2;
            this.ApA.add(zxVar2);
            return;
        }
        this.txA = new com.bytedance.sdk.openadsdk.core.Kg.kMt(this.Kg, this.Ld, this.RJ, this.VJ, this.VB);
        com.bytedance.sdk.component.adexpress.IL.xxp xxpVar = new com.bytedance.sdk.component.adexpress.IL.xxp(this.Kg, this.Ld, this.txA, this);
        this.GvG = xxpVar;
        this.ApA.add(xxpVar);
    }

    public void setOuterDislike(com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.Kg.bg bgVar;
        com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn = this.DDQ;
        if (eqn != null && (eqn instanceof com.bytedance.sdk.openadsdk.core.Kg.LZ) && (bgVar = (com.bytedance.sdk.openadsdk.core.Kg.bg) eqn.zx()) != null) {
            bgVar.setDislikeOuter(tTDislikeDialogAbstract);
        }
        com.bytedance.sdk.openadsdk.core.Kg.bX bXVar = this.qC;
        if (bXVar != null) {
            bXVar.bg(tTDislikeDialogAbstract);
        }
        this.eqN = tTDislikeDialogAbstract;
    }

    public void setDislike(com.bytedance.sdk.openadsdk.bX.bX bXVar) {
        com.bytedance.sdk.openadsdk.core.Kg.bg bgVar;
        com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn = this.DDQ;
        if (eqn != null && (eqn instanceof com.bytedance.sdk.openadsdk.core.Kg.LZ) && (bgVar = (com.bytedance.sdk.openadsdk.core.Kg.bg) eqn.zx()) != null) {
            bgVar.setDislikeInner(bXVar);
        }
        com.bytedance.sdk.openadsdk.core.Kg.bX bXVar2 = this.qC;
        if (bXVar2 != null) {
            bXVar2.bg(bXVar);
        }
        this.bX = bXVar;
    }

    public void setExpressInteractionListener(com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.zx = pAGExpressAdWrapperListener;
        com.bytedance.sdk.openadsdk.core.Kg.bX bXVar = this.qC;
        if (bXVar != null) {
            bXVar.bg(pAGExpressAdWrapperListener);
        }
    }

    public void setClickCreativeListener(com.bytedance.sdk.openadsdk.core.Kg.Kg kg) {
        this.ldr = kg;
        if (kg != null) {
            kg.bg((com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg) this);
        }
    }

    public com.bytedance.sdk.openadsdk.core.Kg.Kg getClickCreativeListener() {
        return this.ldr;
    }

    public com.bytedance.sdk.openadsdk.core.Kg.WR getClickListener() {
        return this.iR;
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.Kg.WR wr) {
        this.iR = wr;
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.IL.bX bXVar) {
        this.Lq = bXVar;
        com.bytedance.sdk.component.adexpress.IL.ldr ldrVar = this.lM;
        if (ldrVar != null) {
            ldrVar.bg(bXVar);
        }
    }

    public void Kg() {
        com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn = this.DDQ;
        if (eqn instanceof com.bytedance.sdk.openadsdk.core.Kg.kMt) {
            if (eqn == null) {
                return;
            } else {
                ((com.bytedance.sdk.openadsdk.core.Kg.kMt) eqn).Kg();
            }
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.VB;
        if (tuv == null || tuv.hi() == null || this.VB.hi().bg() == null) {
            return;
        }
        this.VB.hi().bg().bg(0L);
    }

    public void zx(int i) {
        com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn = this.DDQ;
        if (eqn == null || !(eqn instanceof com.bytedance.sdk.openadsdk.core.Kg.kMt)) {
            return;
        }
        ((com.bytedance.sdk.openadsdk.core.Kg.kMt) eqn).bg(i);
        this.wS = i;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        bg(i, true, false);
    }

    public void bg(int i, boolean z, boolean z2) {
        this.xxp = z;
        removeCallbacks(this.Pae);
        removeCallbacks(this.jz);
        if (i == 0) {
            if (z2) {
                this.jz.run();
                return;
            } else {
                postDelayed(this.jz, 50L);
                return;
            }
        }
        if (z2) {
            this.Pae.run();
        } else {
            postDelayed(this.Pae, 50L);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (android.os.Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z ? getVisibility() : 8);
        }
        LZ();
        if (z) {
            com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.VB, 4);
        } else {
            com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.VB, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LZ() {
        if (this.uu.get()) {
            this.JAA.bg(java.lang.System.currentTimeMillis(), com.bytedance.sdk.openadsdk.core.VW.bg(this));
        }
    }

    public void WR() {
        if (this.VB == null) {
            return;
        }
        this.Ja = android.os.SystemClock.elapsedRealtime();
        if (this.VB.eK()) {
            com.bytedance.sdk.openadsdk.core.Kg.bX bXVar = this.qC;
            if (bXVar == null) {
                a_(106);
                return;
            } else {
                bXVar.bg((com.bytedance.sdk.component.adexpress.IL.Lq) this);
                this.qC.bg();
                return;
            }
        }
        this.VJ.bg();
        com.bytedance.sdk.component.adexpress.IL.eo.bg bgVar = this.sVc;
        if (bgVar != null) {
            bgVar.bg(this);
        }
        try {
            this.sVc.bg();
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        int i;
        android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray;
        com.bytedance.sdk.openadsdk.core.Kg.Kg kg = this.ldr;
        int i2 = 0;
        if (kg != null) {
            kg.IL(motionEvent.getDeviceId());
            this.ldr.bg(motionEvent.getSource());
            this.ldr.bX(motionEvent.getToolType(0));
        }
        com.bytedance.sdk.openadsdk.core.Kg.WR wr = this.iR;
        if (wr != null) {
            wr.IL(motionEvent.getDeviceId());
            this.iR.bg(motionEvent.getSource());
            this.iR.bX(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.zCS = motionEvent.getRawX();
            this.Ys = motionEvent.getRawY();
            this.Dt = java.lang.System.currentTimeMillis();
        } else {
            i2 = 3;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    i2 = actionMasked != 3 ? -1 : 4;
                } else {
                    this.dS += java.lang.Math.abs(motionEvent.getX() - this.zCS);
                    this.RiO += java.lang.Math.abs(motionEvent.getY() - this.Ys);
                    this.zCS = motionEvent.getX();
                    this.Ys = motionEvent.getY();
                    i = (java.lang.System.currentTimeMillis() - this.Dt <= 200 || (this.dS <= 8.0f && this.RiO <= 8.0f)) ? 2 : 1;
                }
            }
            sparseArray = this.cZH;
            if (sparseArray != null) {
                sparseArray.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.IL.bX.bg(i, motionEvent.getSize(), motionEvent.getPressure(), java.lang.System.currentTimeMillis()));
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        i = i2;
        sparseArray = this.cZH;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.IL.bX.bg(i, motionEvent.getSize(), motionEvent.getPressure(), java.lang.System.currentTimeMillis()));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void bg(android.view.View view, int i, com.bytedance.sdk.component.adexpress.bX bXVar) {
        android.view.View view2;
        com.bytedance.sdk.openadsdk.utils.LZ.bg("ClickCreativeListener", "trigger Class2 method1", java.lang.Integer.valueOf(i));
        if (i == -1 || bXVar == null) {
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        if (com.bytedance.sdk.openadsdk.core.model.rri.bX(this.VB)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.yDt ydt = (com.bytedance.sdk.openadsdk.core.model.yDt) bXVar;
        com.bytedance.sdk.openadsdk.core.Kg.Kg kg = this.ldr;
        if (kg != null) {
            kg.eqN(getDynamicShowType());
            this.ldr.bg(map);
        }
        com.bytedance.sdk.openadsdk.core.Kg.WR wr = this.iR;
        if (wr != null) {
            wr.eqN(getDynamicShowType());
            this.iR.bg(map);
        }
        float f = ydt.bg;
        float f2 = ydt.IL;
        float f3 = ydt.bX;
        float f4 = ydt.eqN;
        boolean z = ydt.Lq;
        android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray = ydt.yDt;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.cZH;
        }
        android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray2 = sparseArray;
        java.lang.String str = ydt.VB;
        org.json.JSONObject jSONObjectBg = null;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectBg = view != this ? bg(view) : null;
            view2 = view;
        }
        if (ydt != null) {
            ydt.PX = i;
            if (jSONObjectBg != null && ydt.Ta == null) {
                ydt.Ta = jSONObjectBg;
            }
        }
        switch (i) {
            case 1:
                android.widget.FrameLayout frameLayout = this.PX;
                if (frameLayout != null) {
                    frameLayout.dispatchTouchEvent(android.view.MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.VB;
                if (tuv == null || tuv.VzQ() != 1 || z) {
                    com.bytedance.sdk.openadsdk.core.Kg.WR wr2 = this.iR;
                    if (wr2 != null) {
                        wr2.bg(ydt);
                        this.iR.bg(str);
                        this.iR.bg(view2, f, f2, f3, f4, sparseArray2, z);
                    }
                    if (this.zx != null && !ydt.VzQ) {
                        this.zx.onAdClicked();
                        break;
                    }
                }
                break;
            case 2:
                if (ydt.vb > 0) {
                    com.bytedance.sdk.openadsdk.core.VJ.bg(true);
                }
                com.bytedance.sdk.openadsdk.core.Kg.Kg kg2 = this.ldr;
                if (kg2 != null) {
                    kg2.bg(ydt);
                    this.ldr.bg(str);
                    this.ldr.bg(view2, f, f2, f3, f4, sparseArray2, z);
                }
                if (this.zx != null && !ydt.VzQ) {
                    this.zx.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.core.VJ.bg(false);
                com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.VB, 9);
                break;
            case 3:
                com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract tTDislikeDialogAbstract = this.eqN;
                if (tTDislikeDialogAbstract != null) {
                    tTDislikeDialogAbstract.show();
                } else {
                    com.bytedance.sdk.openadsdk.bX.bX bXVar2 = this.bX;
                    if (bXVar2 != null) {
                        bXVar2.bg();
                    } else {
                        com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.bg(this.VB, this.ayS);
                    }
                }
                break;
            case 4:
                android.widget.FrameLayout frameLayout2 = this.PX;
                if (frameLayout2 != null) {
                    frameLayout2.dispatchTouchEvent(android.view.MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.VB;
                if (tuv2 == null || tuv2.VzQ() != 1 || z) {
                    com.bytedance.sdk.openadsdk.utils.ayS.bX(this.VB);
                    if ("embeded_ad".equals(this.WR) && tC() && !this.Ta && com.bytedance.sdk.openadsdk.utils.ayS.bX(this.VB)) {
                        com.bytedance.sdk.openadsdk.core.Kg.Kg kg3 = this.ldr;
                        if (kg3 != null) {
                            kg3.bg(ydt);
                            this.ldr.bg(str);
                            this.ldr.bg(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.core.Kg.WR wr3 = this.iR;
                        if (wr3 != null) {
                            wr3.bg(ydt);
                            this.iR.bg(str);
                            this.iR.bg(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    }
                    if (this.zx != null && !ydt.VzQ) {
                        this.zx.onAdClicked();
                        break;
                    }
                }
                break;
            case 5:
                bg(!this.tC);
                break;
            case 6:
                bg();
                break;
            case 7:
                com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(this.Kg, this.VB, this.WR);
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.bg.InterfaceC0132bg
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.bX.iR iRVar = this.Ny;
        if (iRVar != null) {
            return iRVar.getVideoProgress();
        }
        return 0L;
    }

    public static org.json.JSONObject bg(android.view.View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put(androidx.media3.extractor.text.ttml.TtmlNode.LEFT, iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private boolean tC() {
        return com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.VB);
    }

    private int getAdSlotType() {
        java.lang.String str = this.WR;
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        LZ();
        rri();
        com.bytedance.sdk.component.utils.PX.bg("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.Dxa);
        com.bytedance.sdk.openadsdk.core.WR.IL().bg(this.ayS, this.ZQc);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LZ();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.PX.bg("webviewpool", "onFinishTemporaryDetach+++");
    }

    private void rri() {
        java.util.List<com.bytedance.sdk.component.adexpress.IL.eo> list = this.ApA;
        if (list == null) {
            return;
        }
        java.util.Iterator<com.bytedance.sdk.component.adexpress.IL.eo> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void kMt() {
        java.util.List<com.bytedance.sdk.component.adexpress.IL.eo> list = this.ApA;
        if (list == null) {
            return;
        }
        java.util.Iterator<com.bytedance.sdk.component.adexpress.IL.eo> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void eo() {
        com.bytedance.sdk.openadsdk.core.Kg.kMt kmt = this.txA;
        if (kmt == null || kmt.zx() == null) {
            return;
        }
        this.txA.ldr();
    }

    public void VB() {
        try {
            com.bytedance.sdk.openadsdk.core.Kg.bX bXVar = this.qC;
            if (bXVar != null) {
                bXVar.IL();
            }
            yDt();
            removeAllViews();
            if (getParent() != null) {
                ((android.view.ViewGroup) getParent()).removeView(this);
            }
            java.util.List<com.bytedance.sdk.component.adexpress.IL.eo> list = this.ApA;
            if (list != null) {
                java.util.Iterator<com.bytedance.sdk.component.adexpress.IL.eo> it = list.iterator();
                while (it.hasNext()) {
                    it.next().bg();
                }
            }
            com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.VB);
            this.bX = null;
            this.eqN = null;
            this.eo = null;
            this.VB = null;
            this.zx = null;
            this.ldr = null;
            this.Lq = null;
            this.iR = null;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("NativeExpressView", "detach error", th);
        }
    }

    public void PX() {
        try {
            android.widget.FrameLayout frameLayout = this.PX;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.PX);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.Dxa);
        com.bytedance.sdk.openadsdk.core.WR.IL().ldr(this.ayS);
        kMt();
        com.bytedance.sdk.component.utils.PX.bg("webviewpool", "onDetachedFromWindow===");
        bg(8, true, true);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.PX.bg("webviewpool", "onStartTemporaryDetach===");
    }

    public void bg(com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn, com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        this.uu.set(true);
        this.DDQ = eqn;
        if (this.wS != getWindowVisibility()) {
            zx(getWindowVisibility());
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.Integer.valueOf(eqn.bX());
        if (eqn.bX() == 3 && (tuv = this.VB) != null && tuv.vb() == 1) {
            this.VB.IL(0);
        }
        if (eqn.bX() != 1) {
            android.view.View viewZx = eqn.zx();
            if (viewZx.getParent() != null) {
                ((android.view.ViewGroup) viewZx.getParent()).removeView(viewZx);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                arrayList.add(getChildAt(i));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) instanceof com.bytedance.sdk.component.WR.eqN) {
                    removeView((android.view.View) arrayList.get(i2));
                }
            }
            addView(eqn.zx());
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.VB;
        if (tuv2 != null) {
            com.bytedance.sdk.openadsdk.yDt.bX.bg(tuv2.IL(), this.Ja, this.WR, eqn.bX());
        }
        com.bytedance.sdk.component.adexpress.IL.WR wr = this.bCU;
        if (wr != null) {
            ((com.bytedance.sdk.openadsdk.core.Kg.Ta) wr).VB();
        }
        com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.zx;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) ydt.eqN(), (float) ydt.zx());
        }
        if (bg(ydt)) {
            com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this, this.VB, bX(getDynamicShowType()));
        }
        com.bytedance.sdk.openadsdk.core.Kg.tC tCVar = this.CQc;
        if (tCVar != null) {
            tCVar.bg(this.VB, this.WR);
        }
    }

    protected com.bytedance.sdk.openadsdk.rri.bg.zx.bg bX(int i) {
        return new com.bytedance.sdk.openadsdk.rri.bg.zx.bg(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.Lq
    public void a_(int i) {
        com.bytedance.sdk.component.adexpress.IL.WR wr = this.bCU;
        if (wr != null) {
            if (!this.bg) {
                wr.Kg();
            }
            this.bCU.WR();
            ((com.bytedance.sdk.openadsdk.core.Kg.Ta) this.bCU).VB();
        }
        com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.zx;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.Kg.bg(i), i);
        }
        com.bytedance.sdk.openadsdk.core.Kg.tC tCVar = this.CQc;
        if (tCVar != null) {
            tCVar.bg(this.VB, this.WR);
        }
    }

    public boolean Ta() {
        com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn = this.DDQ;
        return eqn != null && (eqn instanceof com.bytedance.sdk.openadsdk.core.Kg.LZ);
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn = this.DDQ;
        if (eqn != null) {
            return eqn.bX();
        }
        return 0;
    }

    public org.json.JSONObject bg(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (!(this.DDQ instanceof com.bytedance.sdk.openadsdk.core.Kg.kMt)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (tuv != null) {
                if (tuv.LKE() != null && tuv.LKE().yDt()) {
                    jSONObject.put("engine_version", tuv.LKE().Ta());
                } else if (tuv.uu() != null) {
                    jSONObject.put("engine_version", "v3");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return jSONObject;
    }

    public int getRenderEngineCacheType() {
        com.bytedance.sdk.openadsdk.core.Kg.eo eoVarLq;
        com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn = this.DDQ;
        if (!(eqn instanceof com.bytedance.sdk.openadsdk.core.Kg.kMt) || (eoVarLq = ((com.bytedance.sdk.openadsdk.core.Kg.kMt) eqn).Lq()) == null) {
            return 0;
        }
        return eoVarLq.bg();
    }

    public int getExpectExpressWidth() {
        return java.lang.Float.valueOf(this.aGH).intValue();
    }

    public int getExpectExpressHeight() {
        return java.lang.Float.valueOf(this.VW).intValue();
    }

    public com.bytedance.sdk.openadsdk.core.aGH getJsObject() {
        com.bytedance.sdk.openadsdk.core.Kg.kMt kmt = this.txA;
        if (kmt != null) {
            return kmt.vb();
        }
        return null;
    }

    private boolean JAA() {
        return android.text.TextUtils.equals(this.WR, "fullscreen_interstitial_ad") || android.text.TextUtils.equals(this.WR, "rewarded_video") || android.text.TextUtils.equals("open_ad", this.WR) || com.bytedance.sdk.openadsdk.core.Kg.kMt.IL(this.WR) || android.text.TextUtils.equals(this.WR, "embeded_ad");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void setTime(java.lang.CharSequence charSequence, int i, int i2, boolean z) {
        IL(java.lang.Integer.parseInt(java.lang.String.valueOf(charSequence)), i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void setSoundMute(boolean z) {
        this.tC = z;
        com.bytedance.sdk.component.adexpress.IL.IL il = this.Uw;
        if (il != null && il.IL() != null) {
            this.Uw.IL().setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn = this.DDQ;
        if ((eqn instanceof com.bytedance.sdk.openadsdk.core.VB.eqN.bX) && eqn.bX() == 7) {
            ((com.bytedance.sdk.openadsdk.core.VB.eqN.bX) this.DDQ).setSoundMute(z);
        }
    }

    protected void IL(int i, int i2) {
        int iMin;
        if (android.text.TextUtils.equals(this.WR, "banner_ad")) {
            return;
        }
        int i3 = this.rri;
        int i4 = ((i2 < i3 || i3 < 0 || !(this.kMt || android.text.TextUtils.equals(this.WR, "open_ad"))) && !((i == 0 && android.text.TextUtils.equals(this.WR, "open_ad")) || eqN() == 5)) ? 0 : 1;
        if (i2 <= this.rri) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.VB;
            if (tuv != null && tuv.Dxa() != null) {
                iMin = (int) (java.lang.Math.min(this.rri, this.VB.Dxa().ldr() * ((double) this.VB.Dxa().tC())) - ((double) i2));
            } else {
                iMin = this.rri - i2;
            }
        } else {
            iMin = 0;
        }
        com.bytedance.sdk.component.adexpress.IL.IL il = this.Uw;
        if (il != null && il.IL() != null) {
            this.Uw.IL().setTime(java.lang.String.valueOf(i), i4, iMin, false);
        }
        com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn = this.DDQ;
        if (eqn instanceof com.bytedance.sdk.openadsdk.core.VB.eqN.bX) {
            ((com.bytedance.sdk.openadsdk.core.VB.eqN.bX) eqn).setTime(java.lang.String.valueOf(i), i4, iMin, false);
        }
    }

    public void yDt() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.VB;
        if (tuv == null || tuv.hi() == null || this.VB.hi().bg() == null) {
            return;
        }
        this.VB.hi().bg().zx(getVideoProgress());
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.bX.iR iRVar) {
        this.Ny = iRVar;
    }

    public boolean Lq() {
        return this.uu.get();
    }

    public void IL(int i, java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.aGH aghVb;
        com.bytedance.sdk.component.adexpress.IL.eqN<? extends android.view.View> eqn = this.DDQ;
        if (eqn == null || !(eqn instanceof com.bytedance.sdk.openadsdk.core.Kg.kMt) || (aghVb = ((com.bytedance.sdk.openadsdk.core.Kg.kMt) eqn).vb()) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("time", i);
            jSONObject.put("flag", str);
            aghVb.bg("onVideoPaused", jSONObject);
        } catch (org.json.JSONException unused) {
        }
    }
}
