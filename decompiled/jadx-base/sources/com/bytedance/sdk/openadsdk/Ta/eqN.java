package com.bytedance.sdk.openadsdk.Ta;

/* JADX INFO: loaded from: classes4.dex */
public class eqN extends com.bytedance.sdk.openadsdk.Ta.eo {
    public eqN(android.content.Context context) {
        this(context, null);
    }

    public eqN(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public eqN(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected void bg(android.content.Context context) {
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        zxVar.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        zxVar.setOrientation(1);
        zxVar.setPadding(iBX, iBX, iBX, iBX);
        addView(zxVar);
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 3.0f;
        bXVar.setLayoutParams(layoutParams2);
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
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        layoutParams3.leftMargin = iBX;
        layoutParams3.topMargin = iBX;
        layoutParams3.bottomMargin = iBX;
        pAGLogoViewKg.setLayoutParams(layoutParams3);
        bXVar.addView(pAGLogoViewKg);
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(context);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        iRVar.setLayoutParams(layoutParams4);
        zxVar.addView(iRVar);
        this.bX = iR(context);
        this.bX.setId(com.bytedance.sdk.openadsdk.utils.Ta.ZTq);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 40.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(iBX2, iBX2);
        layoutParams5.addRule(15);
        this.bX.setLayoutParams(layoutParams5);
        iRVar.addView(this.bX);
        this.eqN = IL(context);
        this.eqN.setId(com.bytedance.sdk.openadsdk.utils.Ta.IEI);
        android.widget.RelativeLayout.LayoutParams layoutParams6 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15);
        layoutParams6.leftMargin = iBX;
        layoutParams6.setMarginStart(iBX);
        layoutParams6.addRule(1, com.bytedance.sdk.openadsdk.utils.Ta.ZTq);
        layoutParams6.addRule(17, com.bytedance.sdk.openadsdk.utils.Ta.ZTq);
        this.eqN.setLayoutParams(layoutParams6);
        iRVar.addView(this.eqN);
        this.ldr = eqN(context);
        this.ldr.setId(com.bytedance.sdk.openadsdk.utils.Ta.gCm);
        android.widget.RelativeLayout.LayoutParams layoutParams7 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 100.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 32.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(21);
        layoutParams7.addRule(15);
        this.ldr.setLayoutParams(layoutParams7);
        iRVar.addView(this.ldr);
    }
}
