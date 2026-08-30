package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class VB {
    protected android.content.Context IL;
    private com.bytedance.sdk.openadsdk.core.widget.WR bX;
    protected android.view.View bg = zx();
    private com.bytedance.sdk.openadsdk.core.widget.VzQ eqN;
    private com.bytedance.sdk.openadsdk.core.zx.Kg zx;

    public VB(android.content.Context context) {
        this.IL = context;
    }

    public android.view.View bg() {
        return this.bg;
    }

    public com.bytedance.sdk.openadsdk.core.widget.VzQ IL() {
        return this.eqN;
    }

    public com.bytedance.sdk.openadsdk.core.zx.Kg bX() {
        return this.zx;
    }

    private android.view.View zx() {
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(this.IL);
        zxVar.setGravity(1);
        zxVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(this.IL);
        this.eqN = vzQ;
        vzQ.setId(520093745);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 64.0f);
        zxVar.addView(this.eqN, new android.widget.LinearLayout.LayoutParams(iBX, iBX));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(this.IL);
        this.zx = kg;
        kg.setId(520093746);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 219.0f), -2);
        layoutParams.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 16.0f);
        this.zx.setLayoutParams(layoutParams);
        this.zx.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.zx.setGravity(17);
        this.zx.setMaxWidth(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 150.0f));
        this.zx.setMaxLines(2);
        this.zx.setTextColor(-1);
        this.zx.setTextSize(1, 16.0f);
        zxVar.addView(this.zx);
        this.bX = new com.bytedance.sdk.openadsdk.core.widget.WR(this.IL);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 219.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 6.0f));
        layoutParams2.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.IL, 32.0f);
        zxVar.addView(this.bX, layoutParams2);
        return zxVar;
    }

    public void bg(int i) {
        this.bX.setProgress(i);
    }

    public void eqN() {
        this.bg = null;
        this.IL = null;
    }
}
