package com.bytedance.sdk.openadsdk.Ta;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.sdk.openadsdk.Ta.eo {
    public IL(android.content.Context context) {
        this(context, null);
    }

    public IL(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IL(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected void bg(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        zxVar.setOrientation(1);
        addView(zxVar);
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 2.0f;
        bXVar.setLayoutParams(layoutParams);
        zxVar.addView(bXVar);
        this.bg = zx(context);
        this.bg.setId(com.bytedance.sdk.openadsdk.utils.Ta.hi);
        this.bg.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        bXVar.addView(this.bg);
        this.IL = ldr(context);
        this.IL.setId(com.bytedance.sdk.openadsdk.utils.Ta.HXG);
        this.IL.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        bXVar.addView(this.IL);
        com.bytedance.sdk.openadsdk.core.widget.PAGLogoView pAGLogoViewKg = Kg(context);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f);
        layoutParams2.leftMargin = iBX;
        layoutParams2.topMargin = iBX;
        layoutParams2.bottomMargin = iBX;
        pAGLogoViewKg.setLayoutParams(layoutParams2);
        bXVar.addView(pAGLogoViewKg);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        zxVar2.setLayoutParams(layoutParams3);
        zxVar2.setOrientation(1);
        zxVar2.setGravity(81);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f);
        zxVar2.setPadding(iBX2, iBX2, iBX2, iBX2);
        zxVar.addView(zxVar2);
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(context);
        iRVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.rr);
        iRVar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 40.0f)));
        iRVar.setGravity(17);
        zxVar2.addView(iRVar);
        this.bX = iR(context);
        this.bX.setId(com.bytedance.sdk.openadsdk.utils.Ta.ZTq);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 35.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(iBX3, iBX3);
        layoutParams4.addRule(20);
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.bX.setLayoutParams(layoutParams4);
        iRVar.addView(this.bX);
        this.eqN = IL(context);
        this.eqN.setId(com.bytedance.sdk.openadsdk.utils.Ta.IEI);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(-2, iBX * 2);
        int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f);
        layoutParams5.leftMargin = iBX4;
        layoutParams5.setMarginStart(iBX4);
        layoutParams5.addRule(1, this.bX.getId());
        layoutParams5.addRule(17, this.bX.getId());
        this.eqN.setLayoutParams(layoutParams5);
        iRVar.addView(this.eqN);
        this.zx = bX(context);
        this.zx.setId(com.bytedance.sdk.openadsdk.utils.Ta.bu);
        android.widget.RelativeLayout.LayoutParams layoutParams6 = new android.widget.RelativeLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f));
        layoutParams6.addRule(3, this.eqN.getId());
        layoutParams6.addRule(8, this.bX.getId());
        layoutParams6.addRule(17, this.bX.getId());
        layoutParams6.addRule(1, this.bX.getId());
        layoutParams6.leftMargin = iBX4;
        layoutParams6.setMarginStart(iBX4);
        this.zx.setLayoutParams(layoutParams6);
        iRVar.addView(this.zx);
        this.ldr = eqN(context);
        this.ldr.setId(com.bytedance.sdk.openadsdk.utils.Ta.gCm);
        android.widget.LinearLayout.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 22.0f));
        layoutParams7.topMargin = iBX2;
        this.ldr.setLayoutParams(layoutParams7);
        zxVar2.addView(this.ldr);
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected com.bytedance.sdk.openadsdk.core.zx.Kg IL(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kgIL = super.IL(context);
        kgIL.setTextColor(-1);
        kgIL.setTextSize(2, 13.0f);
        kgIL.setText("Pangle");
        return kgIL;
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected com.bytedance.sdk.openadsdk.core.zx.Kg bX(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kgBX = super.bX(context);
        kgBX.setTextColor(-1);
        return kgBX;
    }
}
