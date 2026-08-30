package com.bytedance.sdk.openadsdk.component.reward.IL;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends com.bytedance.sdk.openadsdk.component.reward.IL.IL {
    private final int Lq;
    private java.lang.String VzQ;
    private android.view.ViewGroup vb;
    private com.bytedance.sdk.openadsdk.component.reward.view.zx xxp;

    public iR(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        super(bgVar);
        this.VzQ = "fullscreen_interstitial_ad";
        this.Lq = this.IL.bOf();
    }

    private void Uq() {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.bg.uu);
        this.vb = frameLayout;
        frameLayout.setId(com.bytedance.sdk.openadsdk.utils.Ta.Az);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        this.vb.setLayoutParams(layoutParams2);
        android.view.View viewVB = this.bg.LKE.VB();
        if (viewVB != null) {
            layoutParams2.bottomMargin = viewVB.getHeight();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.zx zxVar = new com.bytedance.sdk.openadsdk.component.reward.view.zx(this.bg.uu);
        this.xxp = zxVar;
        zxVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.FFy);
        if (this.bg.IL.xFs() == 1) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -1);
        }
        layoutParams.gravity = 17;
        this.xxp.setLayoutParams(layoutParams);
        this.vb.addView(this.xxp);
        aGH();
    }

    private void aGH() {
        if (this.vb == null) {
            return;
        }
        bg((android.view.View) this.xxp);
    }

    private void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null || this.xxp == null) {
            return;
        }
        VW();
        bg((android.widget.ImageView) this.xxp);
    }

    private void VW() {
        com.bytedance.sdk.openadsdk.core.model.Lq lq;
        java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> listLM = this.IL.lM();
        if (listLM == null || listLM.size() <= 0 || (lq = listLM.get(0)) == null) {
            return;
        }
        try {
            int iIL = lq.IL();
            int iBX = lq.bX();
            if (iIL != 0 && iBX != 0) {
                this.xxp.setRatio(iIL / iBX);
                return;
            }
            int i = this.Lq;
            if (i == 33) {
                this.xxp.setRatio(1.0f);
            } else if (i == 3) {
                this.xxp.setRatio(1.91f);
            } else {
                this.xxp.setRatio(0.56f);
            }
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.RFTI", e.getMessage());
        }
    }

    private void bg(android.widget.ImageView imageView) {
        java.util.List<com.bytedance.sdk.openadsdk.core.model.Lq> listLM;
        com.bytedance.sdk.openadsdk.core.model.Lq lq;
        if (this.IL == null || (listLM = this.IL.lM()) == null || listLM.size() <= 0 || (lq = listLM.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.WR.eqN.bg(listLM.get(0)).bX(2).bg(com.bytedance.sdk.openadsdk.WR.bX.bg(this.IL, lq.bg(), imageView));
    }

    protected void bg(android.view.View view) {
        com.bytedance.sdk.openadsdk.core.IL.IL bgVar;
        if (view == null || this.bg.uu == null || this.IL == null) {
            return;
        }
        if (this.PX == null) {
            android.app.Activity activity = this.bg.uu;
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.IL;
            java.lang.String str = this.VzQ;
            bgVar = new com.bytedance.sdk.openadsdk.core.IL.bg(activity, tuv, str, com.bytedance.sdk.openadsdk.utils.ayS.bg(str));
            bgVar.bg(bX(this.IL));
            java.util.HashMap map = new java.util.HashMap();
            if (com.bytedance.sdk.openadsdk.core.model.rri.VzQ(this.IL)) {
                map.put("click_scence", 3);
            } else {
                map.put("click_scence", 1);
            }
            bgVar.bg(map);
        } else {
            bgVar = this.PX;
        }
        if (this.bg.uu != null) {
            bgVar.bg(this.bg.uu);
        }
        view.setOnTouchListener(bgVar);
        view.setOnClickListener(bgVar);
    }

    private com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv.jz() == 4) {
            return new com.bytedance.sdk.openadsdk.VzQ.bg.bg.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), tuv, this.VzQ);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void bg(android.widget.FrameLayout frameLayout) {
        try {
            Uq();
            IL(this.IL);
            frameLayout.addView(this.vb);
        } catch (java.lang.Exception e) {
            android.util.Log.e("TTAD.RFTI", "bindAd: ", e);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void bg(com.bytedance.sdk.openadsdk.component.reward.view.iR iRVar) {
        if (com.bytedance.sdk.openadsdk.core.model.xxp.IL(this.IL)) {
            com.bytedance.sdk.openadsdk.component.reward.IL.bX.IL(iRVar);
            this.bg.Dt.bg((long) (this.bg.rri.DDQ() * 1000.0d));
        } else if (com.bytedance.sdk.openadsdk.core.model.xxp.bX(this.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.IL)) {
            com.bytedance.sdk.openadsdk.component.reward.IL.bX.bX(iRVar);
            this.bg.Dt.bg((long) (this.bg.rri.DDQ() * 1000.0d));
        } else {
            super.bg(iRVar);
        }
    }

    public static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return !com.bytedance.sdk.openadsdk.core.model.tuV.zx(tuv) && tuv.jf() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public boolean zx() {
        return VJ() || com.bytedance.sdk.openadsdk.core.model.rri.iR(this.IL);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public boolean ldr() {
        return VJ();
    }

    private boolean VJ() {
        return this.IL != null && this.IL.tC() == 2;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void iR() {
        if (com.bytedance.sdk.openadsdk.core.model.xxp.IL(this.IL)) {
            this.ldr.IL(8);
        }
        this.Kg.bX(false);
        this.Kg.eqN(false);
        if (this.IL.tC() == 2) {
            this.Kg.bg(false);
            this.ldr.zx(8);
            return;
        }
        this.Kg.bg(this.IL.ZyO());
        if (this.bg.RiO) {
            android.os.Message messageObtain = android.os.Message.obtain();
            messageObtain.what = 900;
            com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar = this.bg;
            int iDDQ = (int) (this.bg.rri.DDQ() * 1000.0d);
            bgVar.WR = iDDQ;
            messageObtain.arg1 = iDDQ;
            this.bg.bN.sendMessage(messageObtain);
        }
    }
}
