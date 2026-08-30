package com.bytedance.sdk.openadsdk.core.VB.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class bX implements com.bytedance.adsdk.ugeno.core.PX, com.bytedance.adsdk.ugeno.core.Ta, com.bytedance.sdk.component.adexpress.IL.eqN<android.view.View>, com.bytedance.sdk.component.adexpress.dynamic.eqN {
    private static float DDQ = 0.0f;
    private static long JAA = 0;
    private static float Ja = 0.0f;
    private static float Uq = 0.0f;
    private static float Uw = 0.0f;
    protected static int tuV = 24;
    protected java.lang.ref.WeakReference<android.view.View> Fy;
    protected android.content.Context IL;
    protected com.bytedance.sdk.component.adexpress.IL.Kg Kg;
    protected float Lq;
    protected float PX;
    protected float Ta;
    protected com.bytedance.adsdk.ugeno.IL.bX VB;
    private com.bytedance.sdk.openadsdk.core.Kg.Fy VJ;
    private java.lang.String VW;
    protected com.bytedance.sdk.component.adexpress.IL.yDt WR;
    private com.bytedance.sdk.openadsdk.core.VB.eqN.eqN aGH;
    protected com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bX;
    protected com.bytedance.adsdk.ugeno.core.WR bg;
    protected org.json.JSONObject eqN;
    protected android.widget.FrameLayout iR;
    private final boolean kMt;
    protected com.bytedance.sdk.openadsdk.core.VB.eqN.bg ldr;
    private com.bytedance.sdk.component.adexpress.IL.iR rri;
    protected org.json.JSONObject tC;
    protected long vb;
    protected long xxp;
    protected float yDt;
    protected com.bytedance.sdk.openadsdk.core.model.tuV zx;
    protected boolean VzQ = true;
    public android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> LZ = new android.util.SparseArray<>();
    private java.lang.String daV = "";
    private final com.bytedance.sdk.component.Kg.Kg ayS = new com.bytedance.sdk.component.Kg.Kg("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.VB.eqN.bX.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.VB.eqN.bX bXVar = com.bytedance.sdk.openadsdk.core.VB.eqN.bX.this;
            bXVar.eqN = bXVar.bg();
            if (com.bytedance.sdk.openadsdk.core.VB.eqN.bX.this.VJ == null) {
                com.bytedance.sdk.openadsdk.core.VB.eqN.bX.this.daV = "expressView is null";
            } else {
                com.bytedance.sdk.openadsdk.core.VB.eqN.bX bXVar2 = com.bytedance.sdk.openadsdk.core.VB.eqN.bX.this;
                bXVar2.daV = bXVar2.VJ.getUgenTemplateErrorReason();
            }
            com.bytedance.sdk.openadsdk.core.yDt.bX().post(com.bytedance.sdk.openadsdk.core.VB.eqN.bX.this.ZQc);
        }
    };
    private final java.lang.Runnable ZQc = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VB.eqN.bX.2
        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.openadsdk.core.VB.eqN.bX.this.rri != null) {
                com.bytedance.sdk.openadsdk.core.VB.eqN.bX bXVar = com.bytedance.sdk.openadsdk.core.VB.eqN.bX.this;
                bXVar.IL(bXVar.rri);
            }
        }
    };
    private boolean LKE = false;
    protected java.util.concurrent.atomic.AtomicBoolean eo = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // com.bytedance.adsdk.ugeno.core.PX
    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, com.bytedance.adsdk.ugeno.eqN.IL.bg bgVar) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void onvideoComplate() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void setTimeUpdate(int i) {
    }

    static {
        if (com.bytedance.sdk.openadsdk.core.VzQ.bg() != null) {
            tuV = com.bytedance.sdk.openadsdk.core.VzQ.IL();
        }
    }

    public bX(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, boolean z, com.bytedance.sdk.openadsdk.core.VB.eqN.bg bgVar, android.view.ViewGroup viewGroup) {
        this.IL = context;
        this.kMt = z;
        this.bg = new com.bytedance.adsdk.ugeno.core.WR(context);
        this.zx = tuv;
        this.ldr = bgVar;
        this.iR = new android.widget.FrameLayout(context);
        if (viewGroup instanceof com.bytedance.sdk.openadsdk.core.Kg.Fy) {
            this.VJ = (com.bytedance.sdk.openadsdk.core.Kg.Fy) viewGroup;
        }
        this.VW = bgVar.eqN();
        this.tC = IL();
        this.aGH = new com.bytedance.sdk.openadsdk.core.VB.eqN.eqN(this.IL, this.zx, this.VW, this.tC);
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eqN
    public void bg(com.bytedance.sdk.component.adexpress.IL.iR iRVar) {
        this.rri = iRVar;
        com.bytedance.sdk.openadsdk.utils.VJ.IL(this.ayS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(com.bytedance.sdk.component.adexpress.IL.iR iRVar) {
        this.ldr.Uq().bg();
        if (this.eqN == null) {
            iRVar.bg(org.objectweb.asm.Opcodes.I2L, "ugen template is null real reason is " + this.daV);
            return;
        }
        if (this.tC == null) {
            iRVar.bg(org.objectweb.asm.Opcodes.I2L, "ugen data is null");
            return;
        }
        int iEqN = eqN();
        if (iEqN != 0) {
            iRVar.bg(iEqN, "ugen render fail");
            return;
        }
        if (this.bX != null) {
            com.bytedance.sdk.openadsdk.core.VB.eqN.IL il = new com.bytedance.sdk.openadsdk.core.VB.eqN.IL();
            this.WR = il;
            il.bg(true);
            this.WR.bg(bX());
            setSoundMute(this.kMt);
            Kg();
            com.bytedance.adsdk.ugeno.IL.bX bXVarLdr = ldr();
            this.VB = bXVarLdr;
            if (bXVarLdr != null && (bXVarLdr instanceof com.bytedance.sdk.openadsdk.core.VB.IL.bg.IL)) {
                ((com.bytedance.sdk.openadsdk.core.VB.eqN.IL) this.WR).bg((android.widget.FrameLayout) ((com.bytedance.sdk.openadsdk.core.VB.IL.bg.IL) bXVarLdr).RJ());
            }
            com.bytedance.adsdk.ugeno.IL.bX bXVarIR = iR();
            com.bytedance.sdk.openadsdk.core.VB.eqN.eqN eqn = this.aGH;
            if (eqn != null) {
                eqn.bg();
            }
            if (bXVarIR != null && bXVarIR.WR() != null) {
                this.Fy = new java.lang.ref.WeakReference<>(bXVarIR.WR());
            }
            this.iR.addView(this.bX.WR(), new android.widget.FrameLayout.LayoutParams(this.bX.VJ(), this.bX.daV()));
            float fJa = this.ldr.Ja();
            float fUw = this.ldr.Uw();
            float fBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, fJa);
            float fBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, fUw);
            if (bX() != 7) {
                this.iR.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            } else if (fUw <= 0.0f) {
                this.iR.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) fBX, -2));
            } else {
                this.iR.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) fBX, (int) fBX2));
            }
            if (fUw <= 0.0f || fJa <= 0.0f) {
                this.iR.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                int iEqN2 = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.IL, this.iR.getMeasuredWidth());
                int iEqN3 = com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.IL, this.iR.getMeasuredHeight());
                this.WR.bg(iEqN2);
                this.WR.IL(iEqN3);
            } else {
                this.WR.bg(fJa);
                this.WR.IL(fUw);
            }
            if (this.eo.get()) {
                iRVar.bg(org.objectweb.asm.Opcodes.L2F, "ugen render timeout");
                return;
            } else {
                iRVar.bg(this.iR, this.WR);
                return;
            }
        }
        iRVar.bg(138, "ugen render error");
    }

    protected org.json.JSONObject bg() {
        return this.ldr.bX();
    }

    protected org.json.JSONObject IL() {
        return this.ldr.DDQ();
    }

    protected int eqN() {
        this.bg.bg((com.bytedance.adsdk.ugeno.core.PX) this);
        this.bg.bg((com.bytedance.adsdk.ugeno.core.Ta) this);
        com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVarBg = this.bg.bg(this.eqN);
        this.bX = bXVarBg;
        com.bytedance.sdk.openadsdk.core.VB.eqN.eqN eqn = this.aGH;
        if (eqn != null && bXVarBg != null) {
            eqn.bg(bXVarBg);
        }
        this.ldr.Uq().IL();
        this.ldr.Uq().bX();
        this.bg.IL(this.tC);
        return 0;
    }

    public void bg(boolean z) {
        this.eo.set(z);
    }

    public void bg(com.bytedance.sdk.component.adexpress.IL.Kg kg) {
        this.Kg = kg;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.widget.ldr ldrVar) {
        com.bytedance.sdk.openadsdk.core.VB.eqN.eqN eqn = this.aGH;
        if (eqn != null) {
            eqn.bg(ldrVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.PX
    public void bg(com.bytedance.adsdk.ugeno.core.eo eoVar, com.bytedance.adsdk.ugeno.core.PX.IL il, com.bytedance.adsdk.ugeno.core.PX.bg bgVar) {
        if (eoVar == null) {
            return;
        }
        if (eoVar.IL() == 1 || eoVar.IL() == 4) {
            bg(eoVar);
        }
        if (eoVar.IL() == 10) {
            bg(eoVar.bX());
        }
        if (il == null || eoVar.eqN() == null) {
            return;
        }
        il.bg(eoVar.eqN());
    }

    private void bg(org.json.JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.IL.bX<T> bXVarBX;
        if (this.bX == null || jSONObject == null) {
            return;
        }
        java.lang.String strOptString = jSONObject.optString("type");
        java.lang.String strOptString2 = jSONObject.optString("nodeId");
        if (android.text.TextUtils.isEmpty(strOptString2) || (bXVarBX = this.bX.bX(strOptString2)) == 0) {
            return;
        }
        if (android.text.TextUtils.equals(strOptString, "onShow")) {
            bXVarBX.bX(0);
        } else if (android.text.TextUtils.equals(strOptString, "onDismiss")) {
            bXVarBX.bX(8);
        }
    }

    private void bg(com.bytedance.adsdk.ugeno.core.eo eoVar) {
        org.json.JSONObject jSONObjectEqN;
        boolean zBg;
        int i;
        com.bytedance.sdk.openadsdk.core.VB.eqN.eqN eqn;
        com.bytedance.sdk.openadsdk.core.VB.eqN.eqN eqn2;
        com.bytedance.sdk.openadsdk.core.VB.eqN.eqN eqn3;
        if (this.Kg == null) {
            return;
        }
        java.lang.String strOptString = eoVar.bX().optString("type");
        if ("swiperLeft".equals(strOptString) && (eqn3 = this.aGH) != null) {
            eqn3.IL();
            return;
        }
        if ("swiperRight".equals(strOptString) && (eqn2 = this.aGH) != null) {
            eqn2.bX();
            return;
        }
        if (!"swiperClick".equals(strOptString) || (eqn = this.aGH) == null) {
            jSONObjectEqN = null;
            zBg = false;
            i = 0;
        } else {
            zBg = eqn.bg(eoVar);
            jSONObjectEqN = this.aGH.eqN();
            i = 2;
        }
        strOptString.hashCode();
        switch (strOptString) {
            case "privacy":
                i = 7;
                break;
            case "feedback":
                i = 3;
                break;
            case "mute":
                i = 5;
                break;
            case "skip":
                i = 6;
                break;
            case "video":
                i = 4;
                break;
            case "creative":
                i = 2;
                break;
        }
        com.bytedance.adsdk.ugeno.IL.bX bXVarBg = eoVar.bg();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        java.lang.ref.WeakReference<android.view.View> weakReference = this.Fy;
        if (weakReference != null) {
            int[] iArrBg = com.bytedance.sdk.openadsdk.utils.ZQc.bg(weakReference.get());
            if (iArrBg != null) {
                iArr = iArrBg;
            }
            int[] iArrBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.Fy.get());
            if (iArrBX != null) {
                iArr2 = iArrBX;
            }
        }
        this.Kg.bg(eoVar.bg().WR(), i, new com.bytedance.sdk.openadsdk.core.model.yDt.bg().eqN(this.PX).bX(this.Ta).IL(this.yDt).bg(this.Lq).IL(this.vb).bg(this.xxp).bX(iArr[0]).eqN(iArr[1]).zx(iArr2[0]).ldr(iArr2[1]).bg(this.LZ).bg(eoVar.IL() != 1 || this.VzQ).bg(bXVarBg == null ? "" : bXVarBg.VW() + "_" + bXVarBg.aGH()).IL(zBg).IL(jSONObjectEqN).bg());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    @Override // com.bytedance.adsdk.ugeno.core.Ta
    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, android.view.MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        int i2 = 1;
        if (action != 0) {
            int i3 = -1;
            if (action == 1) {
                this.yDt = motionEvent.getRawX();
                this.Lq = motionEvent.getRawY();
                if (java.lang.Math.abs(this.yDt - this.PX) < tuV || java.lang.Math.abs(this.Lq - this.Ta) >= tuV) {
                    this.VzQ = false;
                }
                this.xxp = java.lang.System.currentTimeMillis();
            } else if (action == 2) {
                DDQ += java.lang.Math.abs(motionEvent.getX() - Ja);
                Uq += java.lang.Math.abs(motionEvent.getY() - Uw);
                Ja = motionEvent.getX();
                Uw = motionEvent.getY();
                if (java.lang.System.currentTimeMillis() - JAA > 200) {
                    float f = DDQ;
                    int i4 = tuV;
                    if (f <= i4 && Uq <= i4) {
                        i2 = 2;
                    }
                } else {
                    i2 = 2;
                }
                if (java.lang.Math.abs(motionEvent.getRawX() - this.PX) >= tuV || java.lang.Math.abs(motionEvent.getRawY() - this.Ta) >= tuV) {
                    this.VzQ = false;
                }
                i3 = i2;
                this.yDt = motionEvent.getRawX();
                this.Lq = motionEvent.getRawY();
                if (java.lang.Math.abs(this.yDt - this.PX) < tuV) {
                    this.VzQ = false;
                } else {
                    this.VzQ = false;
                }
                this.xxp = java.lang.System.currentTimeMillis();
            }
            i = i3;
        } else {
            this.vb = java.lang.System.currentTimeMillis();
            this.PX = motionEvent.getRawX();
            this.Ta = motionEvent.getRawY();
            this.VzQ = true;
            JAA = java.lang.System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.WR.bX.bg(motionEvent);
            i = 0;
        }
        this.LZ.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.IL.bX.bg(i, motionEvent.getSize(), motionEvent.getPressure(), java.lang.System.currentTimeMillis()));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void setTime(java.lang.CharSequence charSequence, int i, int i2, boolean z) {
        if (this.bX == null) {
            return;
        }
        boolean z2 = i == 1;
        bg(charSequence, z2, i2, z);
        IL(charSequence, z2, i2, z);
    }

    private void bg(java.lang.CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.IL.bX<T> bXVarBX;
        int i2;
        com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar = this.bX;
        if (bXVar == null || (bXVarBX = bXVar.bX("countdown")) == 0) {
            return;
        }
        android.view.View viewWR = bXVarBX.WR();
        if (viewWR instanceof android.widget.TextView) {
            try {
                i2 = java.lang.Integer.parseInt((java.lang.String) charSequence);
            } catch (java.lang.Exception unused) {
                com.bytedance.sdk.component.utils.PX.bg("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            if (z2 || i2 <= 0 || this.LKE) {
                viewWR.setVisibility(8);
                return;
            }
            viewWR.setVisibility(0);
            if (!z && this.ldr.bg() && com.bytedance.sdk.component.adexpress.eqN.iR.IL(this.ldr.eqN())) {
                ((android.widget.TextView) viewWR).setText(java.lang.String.format(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.component.adexpress.eqN.bg(), "tt_reward_full_skip"), java.lang.Integer.valueOf(i)));
            } else if (!"open_ad".equals(this.ldr.eqN()) && this.ldr.bg()) {
                this.LKE = true;
                viewWR.setVisibility(8);
            } else {
                ((android.widget.TextView) viewWR).setText(((java.lang.Object) charSequence) + androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
            }
        }
    }

    private void IL(java.lang.CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.IL.bX<T> bXVarBX;
        android.view.View viewWR;
        com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar = this.bX;
        if (bXVar == null || (bXVarBX = bXVar.bX("skip")) == 0 || (viewWR = bXVarBX.WR()) == null) {
            return;
        }
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        viewWR.setVisibility(i2);
    }

    private void Kg() {
        com.bytedance.adsdk.ugeno.IL.bX<T> bXVarBX;
        if (this.bX == null) {
            return;
        }
        if (this.zx.dtS() && (bXVarBX = this.bX.bX("tvskip")) != 0) {
            bXVarBX.bX(8);
        }
        com.bytedance.adsdk.ugeno.IL.bX<T> bXVarBX2 = this.bX.bX("skip");
        if (bXVarBX2 != 0 && (bXVarBX2 instanceof com.bytedance.adsdk.ugeno.WR.eqN.bX)) {
            if (!com.bytedance.sdk.openadsdk.core.settings.xxp.zU().yDt(java.lang.String.valueOf(this.zx.IGR())) || this.zx.vb() == 5 || this.zx.vb() == 6 || this.zx.JMw() == 3) {
                ((com.bytedance.adsdk.ugeno.WR.eqN.bX) bXVarBX2).Kg("local://tt_close_btn");
                bXVarBX2.IL();
            }
        }
    }

    protected com.bytedance.adsdk.ugeno.IL.bX ldr() {
        com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar = this.bX;
        if (bXVar == null) {
            return null;
        }
        return bXVar.bX("video");
    }

    protected com.bytedance.adsdk.ugeno.IL.bX iR() {
        com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar = this.bX;
        if (bXVar == null) {
            return null;
        }
        return bXVar.bX("feedback");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.eqN
    public void setSoundMute(boolean z) {
        com.bytedance.adsdk.ugeno.IL.bX<T> bXVarBX;
        com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar = this.bX;
        if (bXVar == null || (bXVarBX = bXVar.bX("mute")) == 0) {
            return;
        }
        if (z) {
            ((com.bytedance.adsdk.ugeno.WR.eqN.bX) bXVarBX).Kg("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.WR.eqN.bX) bXVarBX).Kg("local://tt_reward_full_unmute");
        }
        bXVarBX.IL();
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eqN
    public android.view.View zx() {
        return this.iR;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eqN
    public int bX() {
        return this.zx.JAA();
    }
}
