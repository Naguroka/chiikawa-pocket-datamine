package com.bytedance.sdk.openadsdk.Ta;

/* JADX INFO: loaded from: classes4.dex */
public class Kg extends com.bytedance.sdk.openadsdk.Ta.eo {
    public Kg(android.content.Context context) {
        this(context, null);
    }

    public Kg(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Kg(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected void bg(android.content.Context context) {
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 15.0f);
        int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f);
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        iRVar.setLayoutParams(layoutParams);
        addView(iRVar);
        this.bg = zx(context);
        this.bg.setId(com.bytedance.sdk.openadsdk.utils.Ta.hi);
        this.bg.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        iRVar.addView(this.bg);
        this.IL = ldr(context);
        this.IL.setId(com.bytedance.sdk.openadsdk.utils.Ta.HXG);
        this.IL.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        iRVar.addView(this.IL);
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar2 = new com.bytedance.sdk.openadsdk.core.zx.iR(context);
        iRVar2.setId(com.bytedance.sdk.openadsdk.utils.Ta.ZyO);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 60.0f));
        layoutParams2.addRule(12);
        layoutParams2.rightMargin = iBX3;
        layoutParams2.leftMargin = iBX3;
        layoutParams2.bottomMargin = iBX3;
        layoutParams2.setMarginEnd(iBX3);
        layoutParams2.setMarginStart(iBX3);
        iRVar2.setBackgroundColor(android.graphics.Color.parseColor("#26000000"));
        iRVar2.setLayoutParams(layoutParams2);
        iRVar.addView(iRVar2);
        this.bX = iR(context);
        this.bX.setId(com.bytedance.sdk.openadsdk.utils.Ta.ZTq);
        int iBX5 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 50.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(iBX5, iBX5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.bX.setLayoutParams(layoutParams3);
        iRVar2.addView(this.bX);
        this.eqN = IL(context);
        this.eqN.setId(com.bytedance.sdk.openadsdk.utils.Ta.IEI);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15);
        layoutParams4.leftMargin = iBX4;
        layoutParams4.setMarginStart(iBX4);
        layoutParams4.addRule(1, com.bytedance.sdk.openadsdk.utils.Ta.ZTq);
        layoutParams4.addRule(17, com.bytedance.sdk.openadsdk.utils.Ta.ZTq);
        this.eqN.setLayoutParams(layoutParams4);
        iRVar2.addView(this.eqN);
        this.ldr = eqN(context);
        this.ldr.setId(com.bytedance.sdk.openadsdk.utils.Ta.gCm);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 100.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 30.0f));
        layoutParams5.addRule(21);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        layoutParams5.rightMargin = iBX;
        layoutParams5.setMarginEnd(iBX);
        this.ldr.setLayoutParams(layoutParams5);
        iRVar2.addView(this.ldr);
        android.view.View viewKg = Kg(context);
        android.widget.RelativeLayout.LayoutParams layoutParams6 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(2, com.bytedance.sdk.openadsdk.utils.Ta.ZyO);
        layoutParams6.leftMargin = iBX2;
        layoutParams6.bottomMargin = iBX;
        viewKg.setLayoutParams(layoutParams6);
        iRVar.addView(viewKg);
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected com.bytedance.sdk.openadsdk.core.zx.Kg eqN(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kgEqN = super.eqN(context);
        kgEqN.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_download_corner_bg"));
        kgEqN.setTextSize(2, 15.0f);
        return kgEqN;
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected com.bytedance.sdk.openadsdk.core.zx.Kg IL(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kgIL = super.IL(context);
        kgIL.setGravity(16);
        kgIL.setMaxWidth(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 250.0f));
        kgIL.setTextColor(-1);
        kgIL.setTextSize(2, 17.0f);
        kgIL.setText("APP NAME");
        return kgIL;
    }
}
