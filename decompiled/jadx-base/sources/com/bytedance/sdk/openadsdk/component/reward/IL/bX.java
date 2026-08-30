package com.bytedance.sdk.openadsdk.component.reward.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.sdk.openadsdk.component.reward.IL.IL {
    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout Kg() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void iR() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public boolean zx() {
        return true;
    }

    public bX(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        super(bgVar);
    }

    public static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return com.bytedance.sdk.openadsdk.core.model.xxp.IL(tuv) || com.bytedance.sdk.openadsdk.core.model.xxp.bX(tuv) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(tuv);
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.widget.FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        if (com.bytedance.sdk.openadsdk.core.model.xxp.IL(tuv)) {
            IL(frameLayout);
        } else if (com.bytedance.sdk.openadsdk.core.model.xxp.bX(tuv) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(tuv)) {
            bX(frameLayout);
        } else {
            bg(frameLayout, bgVar);
        }
    }

    static void IL(android.widget.FrameLayout frameLayout) {
        android.content.Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setOrientation(1);
        frameLayout.addView(zxVar, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        bXVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.daV);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        zxVar.addView(bXVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar2 = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        bXVar2.setId(com.bytedance.sdk.openadsdk.utils.Ta.eo);
        bXVar.addView(bXVar2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        bXVar2.addView(bg(context));
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar3 = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        bXVar3.setId(com.bytedance.sdk.openadsdk.utils.Ta.VzQ);
        bXVar3.setVisibility(8);
        bXVar3.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        bXVar2.addView(bXVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.tuV);
        eqn.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        bXVar3.addView(eqn, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.eqN.IL(bXVar);
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar4 = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        bXVar4.setId(com.bytedance.sdk.openadsdk.utils.Ta.Fy);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        zxVar.addView(bXVar4, layoutParams3);
        bXVar4.addView(IL(context));
        android.widget.LinearLayout linearLayoutBX = bX(context);
        linearLayoutBX.setBackgroundColor(android.graphics.Color.parseColor("#70161823"));
        bXVar4.addView(linearLayoutBX);
        linearLayoutBX.addView(eqN(context));
        com.bytedance.sdk.openadsdk.component.reward.view.eqN.bg(bXVar4);
    }

    private static com.bytedance.sdk.component.WR.eqN IL(android.content.Context context) {
        com.bytedance.sdk.component.WR.eqN eqn = new com.bytedance.sdk.component.WR.eqN(context, true);
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.LZ);
        eqn.setLayerType(2, null);
        eqn.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return eqn;
    }

    private static android.widget.LinearLayout bX(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.tC);
        zxVar.setOrientation(1);
        zxVar.setVisibility(8);
        zxVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return zxVar;
    }

    private static android.widget.ImageView eqN(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        eqn.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(context, "tt_up_slide"));
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.rri);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 45.0f);
        eqn.setLayoutParams(layoutParams);
        return eqn;
    }

    static void bX(android.widget.FrameLayout frameLayout) {
        android.content.Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        bXVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.Fy);
        frameLayout.addView(bXVar, new android.widget.FrameLayout.LayoutParams(-1, -1));
        bXVar.addView(IL(context));
        android.widget.LinearLayout linearLayoutBX = bX(context);
        linearLayoutBX.setBackgroundColor(android.graphics.Color.parseColor("#99161823"));
        bXVar.addView(linearLayoutBX);
        linearLayoutBX.addView(eqN(context));
        com.bytedance.sdk.openadsdk.component.reward.view.eqN.bg(bXVar);
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar2 = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        bXVar2.setId(com.bytedance.sdk.openadsdk.utils.Ta.daV);
        frameLayout.addView(bXVar2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar3 = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        bXVar3.setId(com.bytedance.sdk.openadsdk.utils.Ta.eo);
        bXVar2.addView(bXVar3, new android.widget.FrameLayout.LayoutParams(-1, -1));
        bXVar3.addView(bg(context));
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar4 = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        bXVar4.setId(com.bytedance.sdk.openadsdk.utils.Ta.VzQ);
        bXVar4.setVisibility(8);
        bXVar4.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        bXVar3.addView(bXVar4, layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.tuV);
        eqn.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        bXVar4.addView(eqn, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.eqN.IL(bXVar2);
        com.bytedance.sdk.openadsdk.core.widget.VB vb = new com.bytedance.sdk.openadsdk.core.widget.VB(context);
        vb.setId(com.bytedance.sdk.openadsdk.utils.Ta.ayS);
        vb.setClickable(true);
        vb.setFocusable(true);
        frameLayout.addView(vb, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void bg(com.bytedance.sdk.openadsdk.component.reward.view.iR iRVar) {
        bg(this.IL, iRVar, this.bg);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void Ta() {
        if (com.bytedance.sdk.openadsdk.core.model.xxp.IL(this.bg.IL) && this.bg.LKE != null && this.bg.LKE.Lq != null) {
            if (this.bg.LKE.Lq.bX()) {
                this.bg.LKE.IL(0);
                this.bg.vb.set(true);
            } else {
                this.bg.xxp.set(true);
                bg(true, false, true, 80);
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.xxp.bX(this.bg.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.bg.IL)) {
            bg(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public void bg(android.widget.FrameLayout frameLayout) {
        if (!com.bytedance.sdk.openadsdk.core.model.xxp.bX(this.bg.IL) || this.bg.Dt == null) {
            return;
        }
        this.bg.Dt.bg(this.bg.IL.WR().IL() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.IL.IL
    public boolean ldr() {
        if (com.bytedance.sdk.openadsdk.core.model.xxp.IL(this.bg.IL)) {
            return true;
        }
        return (com.bytedance.sdk.openadsdk.core.model.xxp.bX(this.bg.IL) || com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.bg.IL)) ? false : true;
    }
}
