package com.bytedance.sdk.openadsdk.component;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private float Fy;
    protected final com.bytedance.sdk.openadsdk.core.model.tuV IL;
    private com.bytedance.sdk.openadsdk.core.zx.eqN JAA;
    private com.bytedance.sdk.openadsdk.core.widget.xxp Ja;
    protected android.widget.FrameLayout Kg;
    private float LZ;
    private com.bytedance.sdk.openadsdk.core.zx.Kg Lq;
    private android.widget.RelativeLayout PX;
    private android.widget.ImageView Ta;
    private android.view.View Uw;
    protected final com.bytedance.sdk.openadsdk.component.Kg.bg VB;
    private com.bytedance.sdk.openadsdk.core.zx.Kg VzQ;
    protected android.view.View WR;
    protected final boolean bX;
    protected final android.app.Activity bg;
    protected com.bytedance.sdk.openadsdk.core.zx.eqN eo;
    protected final android.widget.FrameLayout eqN;
    protected int iR;
    private com.bytedance.sdk.openadsdk.core.zx.Kg kMt;
    protected final int ldr;
    private com.bytedance.sdk.openadsdk.component.Kg.bX rri;
    private final com.bytedance.sdk.openadsdk.component.WR.Kg tC = new com.bytedance.sdk.openadsdk.component.WR.Kg();
    private com.bytedance.sdk.openadsdk.core.zx.Kg tuV;
    private android.widget.ImageView vb;
    private com.bytedance.sdk.openadsdk.core.widget.VzQ xxp;
    private com.bytedance.sdk.openadsdk.core.widget.PAGLogoView yDt;
    protected final com.bytedance.sdk.openadsdk.component.bg zx;

    public org.json.JSONObject bg(org.json.JSONObject jSONObject) {
        return null;
    }

    public int eqN() {
        return -1;
    }

    public void zx() {
    }

    public bX(android.app.Activity activity, com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.widget.FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.bg bgVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.Kg.bg bgVar2) {
        this.bg = activity;
        this.IL = tuv;
        this.eqN = frameLayout;
        this.iR = i;
        this.bX = z;
        this.zx = bgVar;
        this.ldr = tuv.IGR();
        this.VB = bgVar2;
    }

    public void bg(android.view.ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.WR.bX eqn = new com.bytedance.sdk.openadsdk.component.WR.eqN(this.bg);
        int iTa = this.IL.Ta();
        if (iTa == 5) {
            eqn = new com.bytedance.sdk.openadsdk.component.WR.ldr(this.bg);
        } else if (iTa == 4) {
            eqn = new com.bytedance.sdk.openadsdk.component.WR.zx(this.bg, this.IL);
        }
        this.PX = eqn;
        viewGroup.addView(eqn);
        this.vb = eqn.getBackImage();
        this.Kg = eqn.getVideoContainer();
        this.Ta = eqn.getImageView();
        this.Lq = eqn.getClickButton();
        this.yDt = eqn.getAdLogo();
        this.kMt = eqn.getAdTitleTextView();
        this.JAA = eqn.getAdIconView();
        this.Ja = eqn.getScoreBar();
        this.Uw = eqn.getOverlayLayout();
        if (this.IL.NC()) {
            this.xxp = eqn.getIconOnlyView();
            this.VzQ = eqn.getTitle();
            this.tuV = eqn.getContent();
        }
        if (eqn.getDspAdChoice() != null) {
            eqn.getDspAdChoice().bg(14, this.IL);
        }
        if (!this.IL.eK()) {
            this.tC.bg(eqn, this.IL, this.LZ, this.Fy, this.bX);
        }
        this.WR = eqn.getTopDisLike();
        this.eo = eqn.getTopSkip();
        if (eqn instanceof com.bytedance.sdk.openadsdk.component.WR.zx) {
            ((com.bytedance.sdk.openadsdk.component.WR.zx) eqn).setRenderListener(new com.bytedance.sdk.openadsdk.component.WR.zx.bg() { // from class: com.bytedance.sdk.openadsdk.component.bX.1
                @Override // com.bytedance.sdk.openadsdk.component.WR.zx.bg
                public void bg(android.view.View view, int i) {
                    com.bytedance.sdk.openadsdk.component.bX.this.zx.zx();
                }
            });
        }
    }

    public void bg() {
        this.yDt.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.bX.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                try {
                    com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.component.bX.this.bg, com.bytedance.sdk.openadsdk.component.bX.this.IL, "open_ad");
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        ldr();
        if (this.IL.eK()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.bg.bg bgVarBg = com.bytedance.sdk.openadsdk.component.bg.IL.bg(this.IL, this.bg, this.VB);
        bgVarBg.bg(new com.bytedance.sdk.openadsdk.core.IL.IL.bg() { // from class: com.bytedance.sdk.openadsdk.component.bX.3
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL.bg
            public void bg(android.view.View view, int i) {
                com.bytedance.sdk.openadsdk.component.bX.this.zx.zx();
            }
        });
        bgVarBg.bg(this.rri);
        if (this.IL.PX() == 1) {
            this.PX.setOnClickListener(bgVarBg);
            this.PX.setOnTouchListener(bgVarBg);
        }
        this.Lq.setOnClickListener(bgVarBg);
        this.Lq.setOnTouchListener(bgVarBg);
    }

    protected void ldr() {
        this.WR.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.bX.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.component.bX.this.zx != null) {
                    com.bytedance.sdk.openadsdk.component.bX.this.zx.IL(view);
                }
            }
        });
        this.eo.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.bX.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.bytedance.sdk.openadsdk.component.bX.this.zx != null) {
                    com.bytedance.sdk.openadsdk.component.bX.this.zx.bg(view);
                }
            }
        });
    }

    public void IL() {
        if (!this.IL.eK()) {
            Kg();
        } else {
            this.zx.bX();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    private void Kg() {
        boolean z;
        this.tC.bg();
        this.Lq.setText(this.IL.zCS());
        if (this.IL.NC()) {
            WR();
            return;
        }
        if (this.bX) {
            IL(0);
            bg(8);
            if (bg(this.Kg)) {
                this.zx.bX();
            } else {
                this.zx.eqN();
            }
            com.bytedance.sdk.openadsdk.component.ldr.bg(this.IL, new com.bytedance.sdk.openadsdk.component.bX.bg(this.bg), 25);
        } else {
            IL(8);
            bg(0);
            eo();
            this.zx.bX();
        }
        boolean z2 = true;
        if (this.kMt == null) {
            z = false;
        } else {
            if (!android.text.TextUtils.isEmpty(this.IL.bN())) {
                this.kMt.setText(this.IL.bN());
            } else if (this.IL.RiO() != null) {
                this.kMt.setText(this.IL.RiO().IL());
            } else {
                z = false;
            }
            z = true;
        }
        if (this.JAA != null) {
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.IL.sVc(), this.JAA, this.IL);
        }
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = this.Ja;
        if (xxpVar != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.widget.TextView) null, xxpVar, this.IL);
            if (this.IL.RiO() == null || this.IL.RiO().eqN() < 0.0d) {
                this.Ja.setVisibility(8);
                z2 = z;
            }
        } else {
            z2 = z;
        }
        android.view.View view = this.Uw;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    protected boolean bg(android.widget.FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.Kg.bX bXVar = new com.bytedance.sdk.openadsdk.component.Kg.bX(this.bg);
        this.rri = bXVar;
        return bXVar.bg(frameLayout, this.zx, this.IL);
    }

    private void IL(int i) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Kg, i);
    }

    private void WR() {
        if (this.VzQ != null) {
            if (this.IL.RiO() != null && !android.text.TextUtils.isEmpty(this.IL.RiO().IL())) {
                this.VzQ.setText(this.IL.RiO().IL());
            } else if (!android.text.TextUtils.isEmpty(this.IL.bN())) {
                this.VzQ.setText(this.IL.bN());
            } else {
                this.VzQ.setVisibility(8);
            }
        }
        if (this.tuV != null) {
            if (!android.text.TextUtils.isEmpty(this.IL.wS())) {
                this.tuV.setText(this.IL.wS());
            } else {
                this.tuV.setVisibility(8);
            }
        }
        if (this.xxp != null && this.IL.sVc() != null && !android.text.TextUtils.isEmpty(this.IL.sVc().bg())) {
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.IL.sVc().bg(), this.IL.sVc().IL(), this.IL.sVc().bX(), this.xxp, this.IL);
        }
        this.zx.bX();
    }

    private void eo() {
        com.bytedance.sdk.openadsdk.core.model.Lq lq = this.IL.lM().get(0);
        com.bytedance.sdk.openadsdk.utils.yDt.bg(new com.bytedance.sdk.openadsdk.xxp.bg(lq.bg(), lq.iR()), lq.IL(), lq.bX(), new com.bytedance.sdk.openadsdk.component.bX.IL(this), com.bytedance.sdk.openadsdk.component.iR.bg.IL(android.text.TextUtils.isEmpty(lq.iR()) ? com.bytedance.sdk.component.utils.zx.bg(lq.bg()) : lq.iR()).getParent(), 25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            try {
                this.vb.setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.bytedance.sdk.openadsdk.core.VzQ.bg().getResources(), bitmap));
            } catch (java.lang.Throwable unused) {
                com.bytedance.sdk.component.utils.PX.bg("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
            }
        }
    }

    void bg(com.bytedance.sdk.openadsdk.xxp.bg.IL il) {
        if (il.IL() != null) {
            this.Ta.setImageBitmap(il.IL());
            return;
        }
        if (this.IL.lM() == null || this.IL.lM().get(0) == null) {
            return;
        }
        android.graphics.drawable.Drawable drawableBg = com.bytedance.sdk.openadsdk.utils.yDt.bg(il.bX(), this.IL.lM().get(0).IL());
        this.Ta.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.Ta.setImageDrawable(drawableBg);
    }

    void bg(int i) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Ta, i);
    }

    public class bg implements com.bytedance.sdk.openadsdk.component.ldr.eqN {
        java.lang.ref.WeakReference<android.app.Activity> bg;

        bg(android.app.Activity activity) {
            this.bg = new java.lang.ref.WeakReference<>(activity);
        }

        @Override // com.bytedance.sdk.openadsdk.component.ldr.eqN
        public void bg(android.graphics.Bitmap bitmap) {
            if (this.bg.get() == null || this.bg.get().isFinishing()) {
                return;
            }
            com.bytedance.sdk.openadsdk.component.bX.this.bg(bitmap);
        }
    }

    public void bg(float f, float f2) {
        this.LZ = f;
        this.Fy = f2;
    }

    public void bg(int i, int i2, boolean z) {
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = this.eo;
        if (eqn == null) {
            return;
        }
        int i3 = z ? 0 : 8;
        if (eqn.getVisibility() != i3) {
            this.eo.setVisibility(i3);
        }
    }

    public com.bytedance.sdk.openadsdk.component.Kg.bX iR() {
        return this.rri;
    }

    public void bX() {
        com.bytedance.sdk.openadsdk.component.Kg.bX bXVar = this.rri;
        if (bXVar != null) {
            bXVar.VB();
        }
    }

    public static class IL implements com.bytedance.sdk.openadsdk.utils.yDt.bg {
        private final java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.component.bX> bg;

        @Override // com.bytedance.sdk.openadsdk.utils.yDt.bg
        public void bg() {
        }

        public IL(com.bytedance.sdk.openadsdk.component.bX bXVar) {
            this.bg = new java.lang.ref.WeakReference<>(bXVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.yDt.bg
        public void bg(com.bytedance.sdk.openadsdk.xxp.bg.IL il) {
            com.bytedance.sdk.openadsdk.component.bX bXVar;
            if (!il.eqN() || (bXVar = this.bg.get()) == null) {
                return;
            }
            bXVar.bg(il);
            if (il.IL() != null) {
                bXVar.bg(il.bg());
            }
        }
    }
}
