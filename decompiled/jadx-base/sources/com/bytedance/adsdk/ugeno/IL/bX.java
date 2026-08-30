package com.bytedance.adsdk.ugeno.IL;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bX<T extends android.view.View> implements android.view.View.OnTouchListener, com.bytedance.adsdk.ugeno.bX, com.bytedance.adsdk.ugeno.core.PX.IL, com.bytedance.adsdk.ugeno.core.PX.bg {
    protected boolean ApA;
    protected float CQc;
    private boolean DCn;
    protected float DDQ;
    protected float Dt;
    protected float Dxa;
    private boolean FFy;
    private com.bytedance.adsdk.ugeno.eqN.zx Fx;
    protected float Fy;
    private boolean GR;
    protected int GZ;
    private boolean Gih;
    protected boolean GvG;
    private boolean HXG;
    private boolean IEI;
    private boolean IL;
    protected float JAA;
    private com.bytedance.adsdk.ugeno.eqN.bg.bg JMw;
    protected float Ja;
    private org.json.JSONObject JaB;
    private boolean JlG;

    @java.lang.Deprecated
    private com.bytedance.adsdk.ugeno.core.IL.bX.bg JxS;
    private com.bytedance.adsdk.ugeno.core.iR KRc;
    protected com.bytedance.adsdk.ugeno.IL.bg<android.view.ViewGroup> Kg;
    protected android.widget.ImageView.ScaleType LKE;
    protected boolean LZ;
    protected boolean Ld;
    protected float Lq;
    protected float Ny;
    protected java.lang.String PX;
    protected float Pae;
    protected float RFq;
    protected float RJ;
    protected float RiO;
    protected java.lang.String Ta;
    protected float Uq;
    protected float Uw;
    protected boolean VB;
    private float VHL;
    protected boolean VJ;
    protected boolean VW;
    protected float VzQ;
    protected com.bytedance.adsdk.ugeno.core.zx.bg WR;
    protected float Ys;
    protected java.lang.String ZQc;
    private boolean ZTq;
    protected com.bytedance.adsdk.ugeno.iR.bg.C0092bg ZyO;
    protected boolean aGH;
    protected int ayS;
    protected float bCU;
    protected float bN;
    protected float bOf;
    protected android.content.Context bX;
    private boolean bg;
    private boolean bu;
    protected com.bytedance.adsdk.ugeno.bg.bg cZH;
    protected float dS;
    protected boolean daV;
    protected float eDa;
    private java.lang.String eK;
    protected com.bytedance.adsdk.ugeno.core.Kg eo;
    protected org.json.JSONObject eqN;

    @java.lang.Deprecated
    private com.bytedance.adsdk.ugeno.core.IL.bg ews;
    private boolean gCm;
    private boolean gJ;
    protected int gXn;
    private boolean gtr;
    protected com.bytedance.adsdk.ugeno.core.PX hff;
    private android.graphics.drawable.GradientDrawable hi;
    protected boolean huT;
    protected com.bytedance.adsdk.ugeno.IL.bg<android.view.ViewGroup> iR;
    protected com.bytedance.adsdk.ugeno.core.ldr jA;
    protected java.util.Map<java.lang.Integer, com.bytedance.adsdk.ugeno.core.eo> jf;
    protected float jz;
    protected boolean kMt;
    protected float kU;
    protected float lM;
    protected T ldr;
    private com.bytedance.adsdk.ugeno.core.Lq mLT;
    private boolean mZk;

    @java.lang.Deprecated
    private com.bytedance.adsdk.ugeno.core.IL.zx ovC;
    protected boolean qC;
    private boolean qSG;
    protected float qp;
    private com.bytedance.adsdk.ugeno.core.bg rgo;
    private boolean rr;
    protected boolean rri;
    protected boolean sVc;
    protected boolean tC;
    protected float tuV;
    protected boolean txA;
    private boolean uV;

    @java.lang.Deprecated
    private com.bytedance.adsdk.ugeno.core.IL.eqN uny;
    protected boolean uu;
    protected float vb;
    protected android.view.ViewGroup.LayoutParams wS;
    private boolean wq;
    protected com.bytedance.adsdk.ugeno.core.Ta xFs;
    protected float xxp;
    protected float yDt;
    private java.lang.String yda;
    protected float zCS;

    @java.lang.Deprecated
    private com.bytedance.adsdk.ugeno.core.IL.IL zU;
    protected org.json.JSONObject zx;

    protected void CQc() {
    }

    public T eqN() {
        return null;
    }

    protected void uu() {
    }

    public bX(android.content.Context context) {
        this(context, null);
    }

    public bX(android.content.Context context, com.bytedance.adsdk.ugeno.IL.bg<android.view.ViewGroup> bgVar) {
        this.yDt = -2.0f;
        this.Lq = -2.0f;
        this.GZ = 0;
        this.Ld = true;
        this.zCS = 0.0f;
        this.Ys = 0.0f;
        this.dS = 0.0f;
        this.RiO = 1.0f;
        this.Dt = 1.0f;
        this.Ny = 1.0f;
        this.bOf = 0.0f;
        this.kU = 0.0f;
        this.qp = 0.0f;
        this.eDa = 0.0f;
        this.RFq = 1.0f;
        this.bu = true;
        this.Gih = true;
        this.gJ = false;
        this.DCn = false;
        this.VHL = 12.0f;
        this.bX = context;
        this.iR = bgVar;
        this.jf = new java.util.HashMap();
        this.hi = new android.graphics.drawable.GradientDrawable();
        this.ldr = (T) eqN();
    }

    public T WR() {
        return this.ldr;
    }

    public void bg(org.json.JSONObject jSONObject) {
        this.zx = jSONObject;
        org.json.JSONObject jSONObject2 = this.eqN;
        if (jSONObject2 == null) {
            return;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
        com.bytedance.adsdk.ugeno.IL.bg<android.view.ViewGroup> bgVar = this.iR;
        com.bytedance.adsdk.ugeno.IL.bg.C0081bg c0081bgBX = bgVar instanceof com.bytedance.adsdk.ugeno.IL.bg ? bgVar.bX() : null;
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.String strBg = com.bytedance.adsdk.ugeno.bX.IL.bg(this.eqN.optString(next), jSONObject);
            bg(next, strBg);
            if (c0081bgBX != null) {
                c0081bgBX.bg(this.bX, next, strBg);
            }
        }
        if (c0081bgBX != null) {
            bg(c0081bgBX.bg());
        }
        if (this.JaB == null || this.zx == null) {
            return;
        }
        try {
            if (DDQ()) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("i18n", this.JaB);
                this.zx.put("xNode", jSONObject3);
                return;
            }
            this.zx.put("i18n", this.JaB);
        } catch (org.json.JSONException unused) {
        }
    }

    public org.json.JSONObject eo() {
        return this.zx;
    }

    public void IL() {
        rri();
        VB();
        bX(this.GZ);
        bg();
        bX();
        com.bytedance.adsdk.ugeno.eqN.zx zxVar = this.Fx;
        if (zxVar != null) {
            zxVar.bg();
            this.Fx.IL();
            this.Fx.bX();
        }
        this.ldr.setOnTouchListener(this);
        RJ();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.ldr.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.bu);
        }
        com.bytedance.adsdk.ugeno.bg.bg bgVar = this.cZH;
        if (bgVar != null) {
            bgVar.bX();
        }
    }

    protected void VB() {
        this.ldr.setPadding((int) (this.aGH ? this.Ja : this.JAA), (int) (this.VJ ? this.DDQ : this.JAA), (int) (this.VW ? this.Uw : this.JAA), (int) (this.daV ? this.Uq : this.JAA));
    }

    private void bg() {
        if (this.bg) {
            this.ldr.setTranslationX(this.Ys);
        }
        if (this.IL) {
            this.ldr.setTranslationY(this.dS);
        }
        if (this.ZTq) {
            this.ldr.setScaleX(this.Dt);
        }
        if (this.gCm) {
            this.ldr.setScaleY(this.Ny);
        }
        if (this.FFy) {
            this.ldr.setRotation(this.bOf);
        }
        if (this.rr) {
            this.ldr.setRotationX(this.bOf);
        }
        if (this.gtr) {
            this.ldr.setRotationY(this.qp);
        }
        if (this.IEI) {
            this.ldr.setAlpha(this.RFq);
        }
        float f = this.eDa;
        if (f != 0.0f) {
            this.ldr.setRotation(f);
        }
    }

    public float PX() {
        return this.Ys;
    }

    public float Ta() {
        return this.dS;
    }

    public float yDt() {
        return this.Dt;
    }

    public float Lq() {
        return this.Ny;
    }

    public float vb() {
        return this.kU;
    }

    public float xxp() {
        return this.qp;
    }

    public float VzQ() {
        return this.eDa;
    }

    public float tuV() {
        return this.RFq;
    }

    public float Fy() {
        return this.Dxa;
    }

    @java.lang.Deprecated
    private void bX() {
        com.bytedance.adsdk.ugeno.core.IL.bX bXVarEqN;
        this.ldr.setVisibility(this.GZ);
        float f = this.eDa;
        if (f != 0.0f) {
            this.ldr.setRotation(f);
        }
        com.bytedance.adsdk.ugeno.core.zx.bg bgVar = this.WR;
        if (bgVar != null && android.text.TextUtils.isEmpty(bgVar.IL())) {
            this.ldr.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.IL.bX.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (com.bytedance.adsdk.ugeno.IL.bX.this.jA != null) {
                        boolean unused = com.bytedance.adsdk.ugeno.IL.bX.this.Gih;
                    }
                }
            });
        } else if (IL(1) && !this.JlG) {
            this.ldr.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.IL.bX.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (com.bytedance.adsdk.ugeno.IL.bX.this.hff == null || !com.bytedance.adsdk.ugeno.IL.bX.this.Gih) {
                        return;
                    }
                    com.bytedance.adsdk.ugeno.core.PX px = com.bytedance.adsdk.ugeno.IL.bX.this.hff;
                    com.bytedance.adsdk.ugeno.core.eo eoVar = com.bytedance.adsdk.ugeno.IL.bX.this.jf.get(1);
                    com.bytedance.adsdk.ugeno.IL.bX bXVar = com.bytedance.adsdk.ugeno.IL.bX.this;
                    px.bg(eoVar, bXVar, bXVar);
                }
            });
        }
        if (this.hff != null && IL(4)) {
            if (IL(1)) {
                this.mZk = true;
                this.uny = new com.bytedance.adsdk.ugeno.core.IL.eqN(this.bX, this.jf.get(4), this.jf.get(1), this.mZk);
            } else {
                this.uny = new com.bytedance.adsdk.ugeno.core.IL.eqN(this.bX, this.jf.get(4), this.mZk);
            }
        }
        if (this.hff != null && IL(1) && this.JlG) {
            this.zU = new com.bytedance.adsdk.ugeno.core.IL.IL(this.bX, this.jf.get(1));
        }
        Pae();
        if (this.hff != null && IL(3) && (bXVarEqN = com.bytedance.adsdk.ugeno.eqN.bg().eqN()) != null) {
            this.JxS = bXVarEqN.bg(this.bX);
            new java.lang.Object() { // from class: com.bytedance.adsdk.ugeno.IL.bX.3
            };
        }
        if (this.hff != null && IL(9)) {
            com.bytedance.adsdk.ugeno.core.IL.zx zxVar = new com.bytedance.adsdk.ugeno.core.IL.zx(this.bX, this.jf.get(9), this);
            this.ovC = zxVar;
            zxVar.bg(this.hff);
        }
        if (IL(10)) {
            com.bytedance.adsdk.ugeno.core.IL.bg bgVar2 = new com.bytedance.adsdk.ugeno.core.IL.bg(this.bX, this.jf.get(10), this);
            this.ews = bgVar2;
            bgVar2.bg(this.hff);
        }
    }

    private void Pae() {
        com.bytedance.adsdk.ugeno.core.eo eoVar;
        if (this.hff == null || !IL(18) || (eoVar = this.jf.get(18)) == null) {
            return;
        }
        org.json.JSONObject jSONObjectBX = eoVar.bX();
        if (jSONObjectBX != null) {
            try {
                jSONObjectBX.put("rotateZ", com.bytedance.adsdk.ugeno.bX.IL.bg(jSONObjectBX.optString("rotateZ"), this.zx));
            } catch (org.json.JSONException unused) {
            }
        }
        this.hff.bg(eoVar, this, this);
    }

    private void RJ() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.PX);
        this.ldr.setContentDescription(sb);
    }

    public void bg(com.bytedance.adsdk.ugeno.core.Lq lq) {
        this.mLT = lq;
    }

    @Override // com.bytedance.adsdk.ugeno.bX
    public void iR() {
        if (this.rgo != null) {
            com.bytedance.adsdk.ugeno.core.iR iRVar = new com.bytedance.adsdk.ugeno.core.iR(this.ldr, this.rgo);
            this.KRc = iRVar;
            iRVar.bg();
        }
        com.bytedance.adsdk.ugeno.bg.bg bgVar = this.cZH;
        if (bgVar != null) {
            bgVar.bg();
        }
        com.bytedance.adsdk.ugeno.eqN.zx zxVar = this.Fx;
        if (zxVar != null) {
            zxVar.eqN();
        }
        if (this.ews != null && IL(10)) {
            this.ews.bg();
        }
        if (this.ovC == null || !IL(9)) {
            return;
        }
        this.ovC.bg();
    }

    @Override // com.bytedance.adsdk.ugeno.bX
    public void Kg() {
        com.bytedance.adsdk.ugeno.core.iR iRVar = this.KRc;
        if (iRVar != null) {
            iRVar.IL();
        }
        com.bytedance.adsdk.ugeno.bg.bg bgVar = this.cZH;
        if (bgVar != null) {
            bgVar.IL();
        }
    }

    public com.bytedance.adsdk.ugeno.core.PX LZ() {
        return this.hff;
    }

    public boolean IL(int i) {
        java.util.Map<java.lang.Integer, com.bytedance.adsdk.ugeno.core.eo> map = this.jf;
        return map != null && map.containsKey(java.lang.Integer.valueOf(i));
    }

    public void bX(int i) {
        android.view.ViewParent viewParent = (android.view.ViewGroup) this.ldr.getParent();
        if (viewParent instanceof com.bytedance.adsdk.ugeno.IL.IL) {
            ((com.bytedance.adsdk.ugeno.IL.IL) viewParent).bX(this.ldr, i);
        } else {
            this.ldr.setVisibility(i);
        }
    }

    public void bg(com.bytedance.adsdk.ugeno.core.Ta ta) {
        this.xFs = ta;
    }

    public void bg(com.bytedance.adsdk.ugeno.core.PX px) {
        this.hff = px;
    }

    public void IL(org.json.JSONObject jSONObject) {
        this.eqN = jSONObject;
    }

    public org.json.JSONObject tC() {
        return this.eqN;
    }

    protected void rri() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.Bitmap bitmapBg;
        if (android.text.TextUtils.isEmpty(this.ZQc)) {
            if (this.huT) {
                bg(this.ZyO);
                return;
            } else {
                this.hi.setColor(this.ayS);
                eqN(this.ayS);
                return;
            }
        }
        if (this.ZQc.startsWith("local://")) {
            java.lang.String strReplace = this.ZQc.replace("local://", "");
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inPreferredConfig = this.uu ? android.graphics.Bitmap.Config.ARGB_4444 : android.graphics.Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(this.bX.getResources().openRawResource(com.bytedance.adsdk.ugeno.iR.eqN.bg(this.bX, strReplace)), null, options);
                if (this.uu && (bitmapBg = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, bitmapDecodeStream, (int) this.CQc)) != null) {
                    bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.bX.getResources(), bitmapBg);
                } else {
                    android.graphics.drawable.BitmapDrawable bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(this.bX.getResources(), bitmapDecodeStream);
                    bitmapDrawable = bitmapDrawable2;
                }
                bg(bitmapDrawable);
                return;
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        kMt();
    }

    protected void kMt() {
        com.bytedance.adsdk.ugeno.eqN.bg().IL().bg(this.eo, this.ZQc, new com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg() { // from class: com.bytedance.adsdk.ugeno.IL.bX.4
            @Override // com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg
            public void bg(final android.graphics.Bitmap bitmap) {
                if (bitmap != null) {
                    if (com.bytedance.adsdk.ugeno.IL.bX.this.uu) {
                        final android.graphics.Bitmap bitmapBg = com.bytedance.adsdk.ugeno.iR.Kg.bg(com.bytedance.adsdk.ugeno.IL.bX.this.bX, bitmap, (int) com.bytedance.adsdk.ugeno.IL.bX.this.CQc);
                        if (bitmapBg != null) {
                            com.bytedance.adsdk.ugeno.iR.Kg.bg(new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.IL.bX.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    com.bytedance.adsdk.ugeno.IL.bX.this.bg(new android.graphics.drawable.BitmapDrawable(bitmapBg));
                                }
                            });
                            return;
                        }
                        return;
                    }
                    com.bytedance.adsdk.ugeno.iR.Kg.bg(new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.IL.bX.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.adsdk.ugeno.IL.bX.this.bg(new android.graphics.drawable.BitmapDrawable(bitmap));
                        }
                    });
                }
            }
        });
    }

    protected void bg(com.bytedance.adsdk.ugeno.iR.bg.C0092bg c0092bg) {
        if (c0092bg == null) {
            return;
        }
        this.hi.setShape(0);
        if (c0092bg != null) {
            this.hi.setOrientation(c0092bg.bg);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                this.hi.setColors(c0092bg.IL, c0092bg.bX);
            } else {
                this.hi.setColors(c0092bg.IL);
            }
        }
        txA();
        this.hi.setStroke((int) this.lM, this.gXn);
        this.ldr.setBackground(this.hi);
    }

    protected void eqN(int i) {
        this.hi.setShape(0);
        this.hi.setColor(i);
        txA();
        this.hi.setStroke((int) this.lM, this.gXn);
        this.ldr.setBackground(this.hi);
    }

    private void txA() {
        float f = this.txA ? this.bN : this.Dxa;
        float f2 = this.sVc ? this.Pae : this.Dxa;
        float f3 = this.ApA ? this.jz : this.Dxa;
        float f4 = this.GvG ? this.RJ : this.Dxa;
        this.hi.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
    }

    protected void bg(android.graphics.drawable.Drawable drawable) {
        this.ldr.setBackground(drawable);
    }

    public void bg(android.view.ViewGroup.LayoutParams layoutParams) {
        T t = this.ldr;
        if (t != null) {
            t.setLayoutParams(layoutParams);
        }
        this.wS = layoutParams;
    }

    public android.view.ViewGroup.LayoutParams JAA() {
        return this.wS;
    }

    public void Ja() {
        if (this.ldr != null) {
            bg(this.wS);
            zx((int) this.yDt);
            ldr((int) this.Lq);
        }
    }

    public void bg(com.bytedance.adsdk.ugeno.core.zx.bg bgVar) {
        this.WR = bgVar;
    }

    public com.bytedance.adsdk.ugeno.core.zx.bg Uw() {
        return this.WR;
    }

    public com.bytedance.adsdk.ugeno.IL.bX<T> bX(java.lang.String str) {
        return bg(str);
    }

    protected com.bytedance.adsdk.ugeno.IL.bX<T> bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(this.PX) || !android.text.TextUtils.equals(this.PX, str)) {
            return null;
        }
        return this;
    }

    public com.bytedance.adsdk.ugeno.IL.bX<T> eqN(java.lang.String str) {
        return IL(str);
    }

    protected com.bytedance.adsdk.ugeno.IL.bX<T> IL(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(this.Ta) || !android.text.TextUtils.equals(this.Ta, str)) {
            return null;
        }
        return this;
    }

    public void bg(boolean z) {
        this.VB = z;
    }

    public boolean DDQ() {
        return this.VB;
    }

    public com.bytedance.adsdk.ugeno.IL.bg Uq() {
        return this.iR;
    }

    public void bg(com.bytedance.adsdk.ugeno.IL.bg bgVar) {
        this.iR = bgVar;
    }

    public void zx(java.lang.String str) {
        this.PX = str;
    }

    public java.lang.String aGH() {
        return this.PX;
    }

    public void ldr(java.lang.String str) {
        this.Ta = str;
    }

    public java.lang.String VW() {
        return this.Ta;
    }

    public int VJ() {
        return (int) this.yDt;
    }

    public int daV() {
        return (int) this.Lq;
    }

    public void bg(com.bytedance.adsdk.ugeno.core.Kg kg) {
        this.eo = kg;
    }

    public boolean ayS() {
        return this.Ld;
    }

    public void bg(com.bytedance.adsdk.ugeno.core.ldr ldrVar) {
        this.jA = ldrVar;
    }

    public int ZQc() {
        return this.ayS;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void bg(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    b = 0;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    b = 1;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    b = 2;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    b = 3;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    b = 4;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    b = 5;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    b = 6;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    b = 7;
                }
                break;
            case -1335874424:
                if (str.equals("onTwist")) {
                    b = 8;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    b = 9;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    b = 10;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b = 11;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    b = 12;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    b = 13;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    b = 14;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    b = 15;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    b = 16;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    b = 17;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    b = 18;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b = 19;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b = 20;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    b = 21;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    b = 22;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    b = 23;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    b = 24;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    b = 25;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b = 26;
                }
                break;
            case 87811796:
                if (str.equals("backgroundImageBlur")) {
                    b = 27;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    b = 28;
                }
                break;
            case 94750088:
                if (str.equals(com.json.z8.CLICK)) {
                    b = 29;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    b = 30;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    b = 31;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    b = 32;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b = 33;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    b = 34;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    b = 35;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    b = 36;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    b = 37;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    b = 38;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    b = 39;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    b = 40;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    b = 41;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    b = 42;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    b = 43;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    b = 44;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b = 45;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    b = 46;
                }
                break;
            case 1118509956:
                if (str.equals("animation")) {
                    b = 47;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    b = 48;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    b = 49;
                }
                break;
            case 1287124693:
                if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    b = 50;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    b = 51;
                }
                break;
            case 1301532860:
                if (str.equals("backgroundScale")) {
                    b = 52;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b = 53;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    b = 54;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    b = 55;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    b = 56;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    b = 57;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    b = 58;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    b = 59;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b = 60;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    b = kotlin.io.encoding.Base64.padSymbol;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    b = 62;
                }
                break;
        }
        switch (b) {
            case 0:
                this.Gih = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, true);
                break;
            case 1:
                this.bg = true;
                this.Ys = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f));
                break;
            case 2:
                this.IL = true;
                this.dS = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f));
                break;
            case 3:
                this.Ja = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.aGH = true;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 30:
            case 35:
            case 43:
            case 46:
            case 49:
            case 57:
            case 59:
                IL(str, str2);
                break;
            case 9:
            case 50:
                if (com.bytedance.adsdk.ugeno.iR.bg.bX(str2)) {
                    this.huT = true;
                    this.ZyO = com.bytedance.adsdk.ugeno.iR.bg.IL(str2);
                } else {
                    this.ayS = com.bytedance.adsdk.ugeno.iR.bg.bg(str2, 0);
                    this.huT = false;
                }
                break;
            case 10:
                this.Fx = com.bytedance.adsdk.ugeno.eqN.zx.bg(this, str2);
                break;
            case 11:
                this.IEI = true;
                this.RFq = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 1.0f);
                break;
            case 12:
                this.bN = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.txA = true;
                break;
            case 13:
                if (android.text.TextUtils.equals(str2, "match_parent")) {
                    this.Lq = -1.0f;
                } else if (android.text.TextUtils.equals(str2, "wrap_content")) {
                    this.Lq = -2.0f;
                } else {
                    this.Lq = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                }
                this.DCn = true;
                break;
            case 14:
                this.vb = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                break;
            case 15:
                this.tuV = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.rri = true;
                break;
            case 17:
            case 51:
                this.ZQc = str2;
                break;
            case 18:
                this.FFy = true;
                this.bOf = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case 19:
                this.ZTq = true;
                this.Dt = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case 20:
                this.gCm = true;
                this.Ny = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case 21:
                this.JAA = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                break;
            case 22:
                this.yda = str2;
                break;
            case 23:
                this.Fy = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.kMt = true;
                break;
            case 24:
                this.PX = str2;
                break;
            case 25:
                this.JaB = com.bytedance.adsdk.ugeno.iR.IL.bg(str2, (org.json.JSONObject) null);
                break;
            case 26:
                this.Ta = str2;
                break;
            case 27:
                float fBg = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                this.CQc = fBg;
                if (fBg > 0.0f) {
                    this.uu = true;
                }
                break;
            case 28:
                this.DDQ = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.VJ = true;
                break;
            case 29:
                this.eK = str2;
                break;
            case 31:
                this.bCU = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case 32:
                this.ZTq = true;
                this.gCm = true;
                float[] fArrBX = com.bytedance.adsdk.ugeno.bg.bX.bX(str2);
                this.Dt = fArrBX[0];
                this.Ny = fArrBX[1];
                break;
            case 33:
                if (android.text.TextUtils.equals(str2, "match_parent")) {
                    this.yDt = -1.0f;
                } else if (android.text.TextUtils.equals(str2, "wrap_content")) {
                    this.yDt = -2.0f;
                } else {
                    this.yDt = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                }
                this.gJ = true;
                break;
            case 34:
                this.Uq = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.daV = true;
                break;
            case 36:
                this.Pae = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.sVc = true;
                break;
            case 37:
                this.bu = Kg(str2);
                break;
            case 38:
                this.jz = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.ApA = true;
                break;
            case 39:
                this.RJ = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.GvG = true;
                break;
            case 40:
                this.Uw = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.VW = true;
                break;
            case 41:
                this.gXn = com.bytedance.adsdk.ugeno.iR.bg.bg(str2);
                break;
            case 42:
                this.lM = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                break;
            case 44:
                this.VzQ = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.tC = true;
                break;
            case 45:
                this.bg = true;
                this.IL = true;
                float[] fArrBX2 = com.bytedance.adsdk.ugeno.bg.bX.bX(str2);
                this.Ys = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, fArrBX2[0]);
                this.dS = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, fArrBX2[1]);
                break;
            case 47:
                try {
                    this.cZH = new com.bytedance.adsdk.ugeno.bg.bg(this.bX, this, com.bytedance.adsdk.ugeno.bg.bX.bg(new org.json.JSONObject(str2)));
                } catch (org.json.JSONException unused) {
                    return;
                }
                break;
            case 48:
                this.rgo = com.bytedance.adsdk.ugeno.core.bg.bg(str2, this);
                break;
            case 52:
                this.qC = true;
                this.LKE = iR(str2);
                break;
            case 53:
                this.Dxa = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                break;
            case 54:
                this.rr = true;
                this.kU = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case 55:
                this.gtr = true;
                this.qp = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case 56:
                this.eDa = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case 58:
                this.HXG = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, false);
                break;
            case 60:
                if (android.text.TextUtils.equals("visible", str2)) {
                    this.GZ = 0;
                } else if (android.text.TextUtils.equals("invisible", str2)) {
                    this.GZ = 4;
                } else if (android.text.TextUtils.equals("gone", str2) || android.text.TextUtils.equals("hidden", str2)) {
                    this.GZ = 8;
                }
                this.ldr.setVisibility(this.GZ);
                break;
            case 61:
                this.xxp = com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, str2);
                this.LZ = true;
                break;
            case 62:
                this.Ld = !android.text.TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    private android.widget.ImageView.ScaleType iR(java.lang.String str) {
        str.hashCode();
        if (str.equals("fit")) {
            this.LKE = android.widget.ImageView.ScaleType.FIT_CENTER;
        } else if (str.equals("crop")) {
            this.LKE = android.widget.ImageView.ScaleType.CENTER_CROP;
        } else {
            this.LKE = android.widget.ImageView.ScaleType.FIT_XY;
        }
        return this.LKE;
    }

    private boolean Kg(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) || !android.text.TextUtils.equals(str, "hidden");
    }

    protected void IL(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2) || this.jf == null) {
            return;
        }
        try {
            int iBg = com.bytedance.adsdk.ugeno.core.VB.bg(str).bg();
            com.bytedance.adsdk.ugeno.core.eo eoVar = new com.bytedance.adsdk.ugeno.core.eo();
            eoVar.bg(iBg);
            eoVar.bg(this);
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            if (iBg == 3) {
                try {
                    this.VHL = java.lang.Float.parseFloat(com.bytedance.adsdk.ugeno.bX.IL.bg(jSONObject.optString("shakeAmplitude"), this.zx));
                } catch (java.lang.NumberFormatException unused) {
                    this.VHL = 12.0f;
                }
            }
            com.bytedance.adsdk.ugeno.core.PX px = this.hff;
            if (!(px instanceof com.bytedance.adsdk.ugeno.core.bg.bg)) {
                bg(iBg, jSONObject, eoVar);
            } else if (!((com.bytedance.adsdk.ugeno.core.bg.bg) px).bg()) {
                bg(iBg, jSONObject, eoVar);
            } else {
                eoVar.bg(jSONObject);
                this.jf.put(java.lang.Integer.valueOf(iBg), eoVar);
            }
        } catch (org.json.JSONException unused2) {
        }
    }

    @java.lang.Deprecated
    protected void bg(int i, org.json.JSONObject jSONObject, com.bytedance.adsdk.ugeno.core.eo eoVar) {
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            com.bytedance.adsdk.ugeno.core.eo eoVar2 = new com.bytedance.adsdk.ugeno.core.eo();
            eoVar2.bg(jSONObjectOptJSONObject);
            eoVar2.bg(this);
            eoVar.bg(eoVar2);
        }
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(com.ironsource.y8.f.e);
        if (jSONObjectOptJSONObject2 != null) {
            com.bytedance.adsdk.ugeno.core.eo eoVar3 = new com.bytedance.adsdk.ugeno.core.eo();
            eoVar3.bg(jSONObjectOptJSONObject2);
            eoVar3.bg(this);
            eoVar.IL(eoVar3);
        }
        eoVar.bg(jSONObject);
        this.jf.put(java.lang.Integer.valueOf(i), eoVar);
    }

    @Override // com.bytedance.adsdk.ugeno.bX
    public void zx() {
        if (this.mLT == null || this.uV) {
            return;
        }
        this.uV = true;
    }

    @Override // com.bytedance.adsdk.ugeno.bX
    public void ldr() {
        if (this.mLT == null || this.wq) {
            return;
        }
        this.wq = true;
    }

    @Override // com.bytedance.adsdk.ugeno.bX
    public int[] bg(int i, int i2) {
        if (this.bCU > 0.0f) {
            if (this.gJ) {
                int size = android.view.View.MeasureSpec.getSize(i);
                float f = this.bCU;
                if (f != 0.0f) {
                    i2 = android.view.View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.DCn) {
                int size2 = android.view.View.MeasureSpec.getSize(i2);
                float f2 = this.bCU;
                if (f2 != 0.0f) {
                    i = android.view.View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        if (this.mLT != null && !this.qSG) {
            this.qSG = true;
        }
        return new int[]{i, i2};
    }

    @Override // com.bytedance.adsdk.ugeno.bX
    public void bg(int i, int i2, int i3, int i4) {
        if (this.mLT == null || this.GR) {
            return;
        }
        this.GR = true;
    }

    @Override // com.bytedance.adsdk.ugeno.bX
    public void bg(android.graphics.Canvas canvas, com.bytedance.adsdk.ugeno.core.IAnimation iAnimation) {
        com.bytedance.adsdk.ugeno.core.iR iRVar = this.KRc;
        if (iRVar != null) {
            iRVar.bg(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bX
    public void bg(android.graphics.Canvas canvas) {
        com.bytedance.adsdk.ugeno.bg.bg bgVar = this.cZH;
        if (bgVar != null) {
            bgVar.bg(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bX
    public void IL(int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.core.iR iRVar = this.KRc;
        if (iRVar != null) {
            iRVar.bg(i, i2);
        }
        com.bytedance.adsdk.ugeno.bg.bg bgVar = this.cZH;
        if (bgVar != null) {
            bgVar.bg(i, i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.PX.IL
    public void bg(com.bytedance.adsdk.ugeno.core.eo eoVar) {
        com.bytedance.adsdk.ugeno.IL.bg<android.view.ViewGroup> bgVar;
        com.bytedance.adsdk.ugeno.IL.bX<T> bXVarBX;
        if (eoVar == null || eoVar.bX() == null || !android.text.TextUtils.equals(eoVar.bX().optString("type"), "onDismiss")) {
            return;
        }
        java.lang.String strOptString = eoVar.bX().optString("nodeId");
        bX(8);
        this.Kg = (com.bytedance.adsdk.ugeno.IL.bg) IL(this);
        if (android.text.TextUtils.isEmpty(strOptString) || (bgVar = this.Kg) == null || (bXVarBX = bgVar.bX(strOptString)) == null) {
            return;
        }
        bXVarBX.bX(8);
    }

    public void bg(com.bytedance.adsdk.ugeno.eqN.bg.bg bgVar) {
        this.JMw = bgVar;
    }

    public com.bytedance.adsdk.ugeno.eqN.bg.bg LKE() {
        return this.JMw;
    }

    public com.bytedance.adsdk.ugeno.IL.bX IL(com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        return (bXVar.Uq() == null && (bXVar instanceof com.bytedance.adsdk.ugeno.IL.bg)) ? bXVar : IL(bXVar.Uq());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.core.IL.eqN eqn;
        com.bytedance.adsdk.ugeno.core.PX px;
        com.bytedance.adsdk.ugeno.core.IL.IL il;
        int action = motionEvent.getAction();
        if (action == 0) {
            CQc();
        } else if (action == 1 || action == 3) {
            uu();
        }
        com.bytedance.adsdk.ugeno.core.Ta ta = this.xFs;
        if (ta != null) {
            ta.bg(this, motionEvent);
        }
        if (IL(17) && motionEvent.getAction() == 0) {
            this.hff.bg(this.jf.get(17), this, this);
        }
        if (IL(1) && this.JlG && (px = this.hff) != null && (il = this.zU) != null) {
            return il.bg(px, this, motionEvent);
        }
        com.bytedance.adsdk.ugeno.core.PX px2 = this.hff;
        if (px2 != null && (eqn = this.uny) != null) {
            return eqn.bg(px2, this, motionEvent);
        }
        com.bytedance.adsdk.ugeno.eqN.zx zxVar = this.Fx;
        if (zxVar != null) {
            return zxVar.bg(motionEvent);
        }
        return false;
    }

    public float qC() {
        T t = this.ldr;
        if (t instanceof com.bytedance.adsdk.ugeno.bg.zx) {
            return ((com.bytedance.adsdk.ugeno.bg.zx) t).getRipple();
        }
        return 0.0f;
    }

    public float Dxa() {
        T t = this.ldr;
        if (t instanceof com.bytedance.adsdk.ugeno.bg.zx) {
            return ((com.bytedance.adsdk.ugeno.bg.zx) t).getShine();
        }
        return 0.0f;
    }

    public float bN() {
        T t = this.ldr;
        if (t instanceof com.bytedance.adsdk.ugeno.bg.zx) {
            return ((com.bytedance.adsdk.ugeno.bg.zx) t).getStretch();
        }
        return 0.0f;
    }

    public float jz() {
        T t = this.ldr;
        if (t instanceof com.bytedance.adsdk.ugeno.bg.zx) {
            return ((com.bytedance.adsdk.ugeno.bg.zx) t).getRubIn();
        }
        return 0.0f;
    }

    public void zx(int i) {
        if (DDQ()) {
            T t = this.ldr;
            if (t instanceof com.bytedance.adsdk.ugeno.IL.IL) {
                ((com.bytedance.adsdk.ugeno.IL.IL) t).bg(i);
                return;
            }
            android.view.ViewParent viewParent = (android.view.ViewGroup) t.getParent();
            if (viewParent instanceof com.bytedance.adsdk.ugeno.IL.IL) {
                ((com.bytedance.adsdk.ugeno.IL.IL) viewParent).bg(this.ldr, i);
                return;
            }
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.ldr.getLayoutParams();
        layoutParams.width = i;
        this.ldr.setLayoutParams(layoutParams);
    }

    public void ldr(int i) {
        if (DDQ()) {
            T t = this.ldr;
            if (t instanceof com.bytedance.adsdk.ugeno.IL.IL) {
                ((com.bytedance.adsdk.ugeno.IL.IL) t).IL(i);
                return;
            }
            android.view.ViewParent viewParent = (android.view.ViewGroup) t.getParent();
            if (viewParent instanceof com.bytedance.adsdk.ugeno.IL.IL) {
                ((com.bytedance.adsdk.ugeno.IL.IL) viewParent).IL(this.ldr, i);
                return;
            }
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.ldr.getLayoutParams();
        layoutParams.height = i;
        this.ldr.setLayoutParams(layoutParams);
    }
}
