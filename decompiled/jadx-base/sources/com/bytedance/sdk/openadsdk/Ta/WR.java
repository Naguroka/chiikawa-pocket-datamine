package com.bytedance.sdk.openadsdk.Ta;

/* JADX INFO: loaded from: classes4.dex */
public class WR extends com.bytedance.sdk.openadsdk.Ta.eo {
    public WR(android.content.Context context) {
        this(context, null);
    }

    public WR(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WR(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected void bg(android.content.Context context) {
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f);
        int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 15.0f);
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
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 48.0f));
        layoutParams2.addRule(12);
        iRVar2.setLayoutParams(layoutParams2);
        iRVar2.setBackgroundColor(android.graphics.Color.parseColor("#26000000"));
        iRVar2.setGravity(16);
        iRVar2.setPadding(iBX4, 0, 0, 0);
        iRVar.addView(iRVar2);
        this.bX = iR(context);
        this.bX.setId(com.bytedance.sdk.openadsdk.utils.Ta.ZTq);
        int iBX5 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 40.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(iBX5, iBX5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        layoutParams3.leftMargin = iBX;
        layoutParams3.setMarginStart(iBX);
        this.bX.setLayoutParams(layoutParams3);
        iRVar2.addView(this.bX);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(17, com.bytedance.sdk.openadsdk.utils.Ta.ZTq);
        layoutParams4.addRule(1, com.bytedance.sdk.openadsdk.utils.Ta.ZTq);
        zxVar.setLayoutParams(layoutParams4);
        zxVar.setGravity(16);
        zxVar.setOrientation(1);
        iRVar2.addView(zxVar);
        this.eqN = IL(context);
        this.eqN.setId(com.bytedance.sdk.openadsdk.utils.Ta.IEI);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 130.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f));
        layoutParams5.leftMargin = iBX2;
        layoutParams5.setMarginStart(iBX2);
        this.eqN.setLayoutParams(layoutParams5);
        zxVar.addView(this.eqN);
        this.zx = bX(context);
        this.zx.setId(com.bytedance.sdk.openadsdk.utils.Ta.bu);
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = iBX2;
        layoutParams6.setMarginStart(iBX2);
        this.zx.setLayoutParams(layoutParams6);
        zxVar.addView(this.zx);
        this.ldr = eqN(context);
        this.ldr.setId(com.bytedance.sdk.openadsdk.utils.Ta.gCm);
        android.widget.RelativeLayout.LayoutParams layoutParams7 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 80.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 30.0f));
        layoutParams7.addRule(21);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = iBX;
        layoutParams7.setMarginEnd(iBX);
        this.ldr.setLayoutParams(layoutParams7);
        iRVar2.addView(this.ldr);
        android.view.View viewKg = Kg(context);
        android.widget.RelativeLayout.LayoutParams layoutParams8 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, com.bytedance.sdk.openadsdk.utils.Ta.ZyO);
        layoutParams8.leftMargin = iBX3;
        layoutParams8.bottomMargin = iBX;
        viewKg.setLayoutParams(layoutParams8);
        iRVar.addView(viewKg);
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected com.bytedance.sdk.openadsdk.core.zx.Kg eqN(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kgEqN = super.eqN(context);
        kgEqN.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_download_corner_bg"));
        kgEqN.setTextSize(2, 14.0f);
        return kgEqN;
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected com.bytedance.sdk.openadsdk.core.zx.Kg IL(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg.setGravity(16);
        kg.setMaxWidth(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 153.0f));
        kg.setSingleLine();
        kg.setText("Pangle");
        kg.setTextColor(-1);
        kg.setTextSize(2, 14.0f);
        return kg;
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected com.bytedance.sdk.openadsdk.core.zx.Kg bX(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kgBX = super.bX(context);
        kgBX.setGravity(16);
        kgBX.setMaxWidth(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 153.0f));
        kgBX.setTextColor(-1);
        kgBX.setTextSize(2, 13.0f);
        return kgBX;
    }
}
