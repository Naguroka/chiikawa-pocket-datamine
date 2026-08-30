package com.bytedance.sdk.openadsdk.core.Kg;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private final android.content.Context IL;
    private java.util.concurrent.ScheduledFuture<?> Kg;
    private int WR;
    private com.bytedance.sdk.openadsdk.core.Kg.bX.bg bX;
    com.bytedance.sdk.openadsdk.core.model.tuV bg;
    private com.bytedance.sdk.component.adexpress.IL.Lq eqN;
    private int iR;
    private int ldr;
    private com.bytedance.sdk.openadsdk.core.Kg.Fy zx;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.Kg.bX$bX, reason: collision with other inner class name */
    interface InterfaceC0134bX {
        void IL(java.lang.String str);

        void bg();

        void bg(int i, int i2);

        void bg(java.lang.String str);
    }

    public bX(android.content.Context context, com.bytedance.sdk.openadsdk.core.Kg.Fy fy, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        this.bg = tuv;
        this.IL = context;
        this.zx = fy;
        bg(fy);
        this.bX = new com.bytedance.sdk.openadsdk.core.Kg.bX.bg(context, tuv, this.ldr, this.iR, str, this.WR);
    }

    private void bg(com.bytedance.sdk.openadsdk.core.Kg.Fy fy) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv != null && tuv.Fb()) {
            this.ldr = -1;
            this.iR = -1;
            return;
        }
        com.bytedance.sdk.openadsdk.core.Kg.VzQ vzQBg = com.bytedance.sdk.openadsdk.core.bX.bg.bg(fy.getExpectExpressWidth(), fy.getExpectExpressHeight());
        this.WR = vzQBg.bg;
        if (fy.getExpectExpressWidth() > 0 && fy.getExpectExpressHeight() > 0) {
            this.ldr = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, fy.getExpectExpressWidth());
            this.iR = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, fy.getExpectExpressHeight());
        } else {
            int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL);
            this.ldr = iBX;
            this.iR = java.lang.Float.valueOf(iBX / vzQBg.IL).intValue();
        }
        int i = this.ldr;
        if (i <= 0 || i <= com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL)) {
            return;
        }
        float fBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL) / this.ldr;
        this.ldr = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL);
        this.iR = java.lang.Float.valueOf(this.iR * fBX).intValue();
    }

    public void bg(com.bytedance.sdk.component.adexpress.IL.Lq lq) {
        this.eqN = lq;
    }

    public void bg() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv != null && tuv.Fb()) {
            this.Kg = com.bytedance.sdk.openadsdk.utils.VJ.bg().schedule(new com.bytedance.sdk.openadsdk.core.Kg.bX.IL(this.bX.PX), com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        com.bytedance.sdk.openadsdk.core.Kg.bX.bg bgVar = this.bX;
        if (bgVar != null) {
            bgVar.bg(new com.bytedance.sdk.component.adexpress.IL.iR() { // from class: com.bytedance.sdk.openadsdk.core.Kg.bX.1
                @Override // com.bytedance.sdk.component.adexpress.IL.iR
                public void bg(android.view.View view, com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
                    if (com.bytedance.sdk.openadsdk.core.Kg.bX.this.zx == null || view == null) {
                        if (com.bytedance.sdk.openadsdk.core.Kg.bX.this.eqN != null) {
                            com.bytedance.sdk.openadsdk.core.Kg.bX.this.eqN.a_(106);
                        }
                    } else if (com.bytedance.sdk.openadsdk.core.Kg.bX.this.eqN != null) {
                        com.bytedance.sdk.openadsdk.core.Kg.bX.this.eqN.bg(com.bytedance.sdk.openadsdk.core.Kg.bX.this.bX, ydt);
                    }
                    com.bytedance.sdk.openadsdk.core.Kg.bX.this.bX();
                }

                @Override // com.bytedance.sdk.component.adexpress.IL.iR
                public void bg(int i, java.lang.String str) {
                    if (com.bytedance.sdk.openadsdk.core.Kg.bX.this.eqN != null) {
                        com.bytedance.sdk.openadsdk.core.Kg.bX.this.eqN.a_(106);
                    }
                    com.bytedance.sdk.openadsdk.core.Kg.bX.this.bX();
                }
            });
            android.view.View viewZx = this.bX.zx();
            this.zx.removeView(viewZx);
            if (viewZx.getParent() != null) {
                ((android.view.ViewGroup) viewZx.getParent()).removeView(viewZx);
            }
            this.zx.addView(viewZx, new android.view.ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.IL.Lq lq = this.eqN;
        if (lq != null) {
            lq.a_(106);
        }
    }

    public void IL() {
        com.bytedance.sdk.openadsdk.core.Kg.bX.bg bgVar = this.bX;
        if (bgVar != null) {
            bgVar.eqN();
            this.bX = null;
        }
        bX();
        this.eqN = null;
        this.zx = null;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Ja ja) {
        com.bytedance.sdk.openadsdk.core.Kg.bX.bg bgVar = this.bX;
        if (bgVar != null) {
            bgVar.bg(ja);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.Kg.bX.bg bgVar = this.bX;
        if (bgVar != null) {
            bgVar.bg(tTDislikeDialogAbstract);
        }
    }

    public void bg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.Kg.bX.bg bgVar = this.bX;
        if (bgVar != null) {
            bgVar.bg(str);
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        com.bytedance.sdk.openadsdk.core.Kg.bX.bg bgVar = this.bX;
        if (bgVar != null) {
            bgVar.bg(pAGExpressAdWrapperListener);
        }
    }

    public static class bg implements com.bytedance.sdk.component.adexpress.IL.eqN<android.view.View>, com.bytedance.sdk.openadsdk.core.Kg.zx.IL {
        private com.bytedance.sdk.openadsdk.bX.bX IL;
        private android.widget.FrameLayout Kg;
        private com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener Lq;
        private com.bytedance.sdk.openadsdk.core.Kg.zx PX;
        private int Ta;
        private java.lang.String VB;
        private com.bytedance.sdk.openadsdk.core.model.tuV WR;
        private com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract bX;
        java.util.concurrent.atomic.AtomicBoolean bg = new java.util.concurrent.atomic.AtomicBoolean(false);
        private final int eo;
        private java.lang.String eqN;
        private final int iR;
        private final int ldr;
        private com.bytedance.sdk.component.adexpress.IL.iR yDt;
        private final android.content.Context zx;

        @Override // com.bytedance.sdk.component.adexpress.IL.eqN
        public int bX() {
            return 5;
        }

        @Override // com.bytedance.sdk.openadsdk.core.Kg.zx.IL
        public android.view.View bg() {
            return null;
        }

        public bg(android.content.Context context, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, int i2, java.lang.String str, int i3) {
            this.VB = str;
            if (tuv != null && tuv.Fb()) {
                this.VB = "fullscreen_interstitial_ad";
            }
            this.zx = context;
            this.ldr = i;
            this.iR = i2;
            this.WR = tuv;
            this.eo = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 3.0f);
            this.Ta = i3;
            ldr();
        }

        private void ldr() {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.zx);
            this.Kg = frameLayout;
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new android.widget.FrameLayout.LayoutParams(this.ldr, this.iR);
            }
            layoutParams.width = this.ldr;
            layoutParams.height = this.iR;
            layoutParams.gravity = 17;
            this.Kg.setLayoutParams(layoutParams);
            com.bytedance.sdk.openadsdk.core.Kg.zx zxVarKg = Kg();
            this.Kg.addView(zxVarKg);
            android.view.View viewIR = iR();
            this.Kg.addView(viewIR);
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.WR;
            if (tuv != null && tuv.Fb()) {
                zxVarKg.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
                zxVarKg.bg(((android.app.Activity) this.zx).findViewById(com.bytedance.sdk.openadsdk.utils.Ta.NU), com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose.OTHER);
            }
            zxVarKg.bg(viewIR, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose.OTHER);
            android.content.Context context = this.zx;
            if (context == null || !(context instanceof android.app.Activity)) {
                return;
            }
            android.view.View viewFindViewById = ((android.app.Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.Ta.hSp);
            if (viewFindViewById != null) {
                zxVarKg.bg(viewFindViewById, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose.OTHER);
            }
            android.view.View viewFindViewById2 = ((android.app.Activity) this.zx).findViewById(com.bytedance.sdk.openadsdk.utils.Ta.waE);
            if (viewFindViewById2 != null) {
                zxVarKg.bg(viewFindViewById2, com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose.OTHER);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.IL.eqN
        public void bg(com.bytedance.sdk.component.adexpress.IL.iR iRVar) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv;
            if (this.bg.get()) {
                return;
            }
            if (this.zx == null || (tuv = this.WR) == null) {
                iRVar.bg(106, "material null");
                return;
            }
            this.yDt = iRVar;
            if (android.text.TextUtils.isEmpty(tuv.rgo())) {
                iRVar.bg(106, "dsp data is null");
            } else {
                this.PX.vb();
            }
        }

        private android.view.View iR() {
            com.bytedance.sdk.openadsdk.core.widget.PAGLogoView pAGLogoView = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(this.zx);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.WR;
            if (tuv != null && tuv.Fb()) {
                layoutParams.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.zx, 20.0f);
                layoutParams.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.zx, 20.0f);
                layoutParams.gravity = 8388691;
            } else {
                layoutParams.topMargin = this.eo;
                layoutParams.leftMargin = this.eo;
            }
            pAGLogoView.setLayoutParams(layoutParams);
            pAGLogoView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.Kg.bX.bg.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.core.Kg.bX.bg.this.zx, com.bytedance.sdk.openadsdk.core.Kg.bX.bg.this.WR, com.bytedance.sdk.openadsdk.core.Kg.bX.bg.this.VB);
                }
            });
            return pAGLogoView;
        }

        private com.bytedance.sdk.openadsdk.core.Kg.zx Kg() {
            com.bytedance.sdk.openadsdk.core.Kg.zx zxVarIL = com.bytedance.sdk.openadsdk.core.Kg.eqN.bg().IL();
            this.PX = zxVarIL;
            if (zxVarIL == null) {
                this.PX = new com.bytedance.sdk.openadsdk.core.Kg.zx(this.zx);
            }
            com.bytedance.sdk.openadsdk.core.Kg.eqN.bg().bX(this.PX);
            this.PX.bg(this.WR, this, this.VB);
            this.PX.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            return this.PX;
        }

        @Override // com.bytedance.sdk.component.adexpress.IL.eqN
        public android.view.View zx() {
            return this.Kg;
        }

        public void eqN() {
            this.Kg = null;
            this.IL = null;
            this.bX = null;
            this.yDt = null;
            this.WR = null;
            com.bytedance.sdk.openadsdk.core.Kg.zx zxVar = this.PX;
            if (zxVar != null) {
                zxVar.PX();
                com.bytedance.sdk.openadsdk.core.Kg.eqN.bg().bg(this.PX);
            }
            this.bg.set(true);
        }

        public void bg(com.bytedance.sdk.openadsdk.core.Ja ja) {
            if (ja instanceof com.bytedance.sdk.openadsdk.bX.bX) {
                this.IL = (com.bytedance.sdk.openadsdk.bX.bX) ja;
            }
        }

        public void bg(com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv;
            if (tTDislikeDialogAbstract != null && (tuv = this.WR) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(tuv.Ny(), this.WR.kU());
            }
            this.bX = tTDislikeDialogAbstract;
        }

        public void bg(java.lang.String str) {
            this.eqN = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.Kg.zx.IL
        public android.view.View IL() {
            android.widget.FrameLayout frameLayout = this.Kg;
            if (frameLayout == null) {
                return null;
            }
            return (android.view.View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.Kg.zx.IL
        public void bg(android.view.View view, int i) {
            com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.Lq;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.Kg.zx.IL
        public void e_() {
            if (this.yDt != null) {
                com.bytedance.sdk.component.adexpress.IL.yDt ydt = new com.bytedance.sdk.component.adexpress.IL.yDt();
                ydt.bg(true);
                ydt.bg(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.zx, this.ldr));
                ydt.IL(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(this.zx, this.iR));
                this.yDt.bg(this.Kg, ydt);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.Kg.zx.IL
        public void bg(int i, int i2) {
            com.bytedance.sdk.component.adexpress.IL.iR iRVar = this.yDt;
            if (iRVar != null) {
                iRVar.bg(i, "render fail");
            }
        }

        public void bg(com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.Lq = pAGExpressAdWrapperListener;
        }
    }

    private static class IL implements java.lang.Runnable {
        com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX bg;

        public IL(com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX interfaceC0134bX) {
            this.bg = interfaceC0134bX;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.Kg.bX.InterfaceC0134bX interfaceC0134bX = this.bg;
            if (interfaceC0134bX != null) {
                interfaceC0134bX.bg(107, 107);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bX() {
        try {
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.Kg;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.Kg.cancel(false);
            this.Kg = null;
        } catch (java.lang.Throwable unused) {
        }
    }
}
