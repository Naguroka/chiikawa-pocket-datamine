package com.bytedance.sdk.openadsdk.bX;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends android.widget.LinearLayout {
    private com.bytedance.sdk.openadsdk.bX.Kg IL;
    private final com.bytedance.sdk.openadsdk.bX.eo bX;
    private final com.bytedance.sdk.openadsdk.FilterWord bg;

    public iR(android.content.Context context, com.bytedance.sdk.openadsdk.FilterWord filterWord, com.bytedance.sdk.openadsdk.bX.eo eoVar) {
        super(context);
        setOrientation(1);
        this.bg = filterWord;
        this.bX = eoVar;
        bg();
    }

    private void bg() {
        bX();
        IL();
    }

    private void IL() {
        this.IL = new com.bytedance.sdk.openadsdk.bX.Kg(getContext(), this.bX);
        new android.widget.LinearLayout.LayoutParams(-1, -2);
        this.IL.bg(this.bg.getOptions());
        addView(this.IL);
    }

    private void bX() {
        java.lang.String name = this.bg.getName();
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 12.0f);
        layoutParams.gravity = 17;
        kg.setGravity(17);
        kg.setText(name);
        kg.setTextColor(android.graphics.Color.argb(85, 22, 24, 35));
        kg.setTextSize(this.bX.WR() ? 14 : 10);
        addView(kg, layoutParams);
    }
}
