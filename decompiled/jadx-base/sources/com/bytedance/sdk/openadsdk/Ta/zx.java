package com.bytedance.sdk.openadsdk.Ta;

/* JADX INFO: loaded from: classes4.dex */
public class zx extends com.bytedance.sdk.openadsdk.Ta.eo {
    private com.bytedance.sdk.openadsdk.core.zx.Kg Kg;
    private com.bytedance.sdk.openadsdk.core.zx.eqN iR;

    public zx(android.content.Context context) {
        this(context, null);
    }

    public zx(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public zx(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.Ta.eo
    protected void bg(android.content.Context context) {
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f);
        setPadding(iBX, iBX, iBX, iBX);
        this.bg = zx(context);
        this.bg.setId(com.bytedance.sdk.openadsdk.utils.Ta.hi);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 26.0f);
        layoutParams.topMargin = iBX2;
        this.bg.setLayoutParams(layoutParams);
        addView(this.bg);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        this.iR = eqn;
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.eK);
        this.iR.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = iBX2;
        this.iR.setLayoutParams(layoutParams2);
        addView(this.iR);
        com.bytedance.sdk.openadsdk.core.widget.PAGLogoView pAGLogoViewKg = Kg(context);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f);
        layoutParams3.leftMargin = iBX3;
        layoutParams3.topMargin = iBX3;
        layoutParams3.bottomMargin = iBX3;
        pAGLogoViewKg.setLayoutParams(layoutParams3);
        addView(pAGLogoViewKg);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        zxVar.setOrientation(0);
        zxVar.setGravity(17);
        addView(zxVar);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.Kg = kg;
        kg.setId(com.bytedance.sdk.openadsdk.utils.Ta.rgo);
        this.Kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.Kg.setMaxLines(1);
        this.Kg.setTextColor(-1);
        this.Kg.setTextSize(2, 12.0f);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.Kg.setLayoutParams(layoutParams4);
        zxVar.addView(this.Kg);
    }

    public com.bytedance.sdk.openadsdk.core.zx.eqN getTtBuImg() {
        return this.iR;
    }

    public com.bytedance.sdk.openadsdk.core.zx.Kg getTtBuDescTV() {
        return this.Kg;
    }
}
