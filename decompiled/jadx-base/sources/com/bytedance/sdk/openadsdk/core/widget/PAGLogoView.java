package com.bytedance.sdk.openadsdk.core.widget;

/* JADX INFO: loaded from: classes4.dex */
public class PAGLogoView extends android.widget.LinearLayout {
    public PAGLogoView(android.content.Context context) {
        this(context, null);
    }

    public PAGLogoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    public PAGLogoView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }

    private void initView(android.content.Context context) {
        com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 1.0f);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 2.0f);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f));
        layoutParams.leftMargin = iBX;
        eqn.setLayoutParams(layoutParams);
        eqn.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_ad_logo"));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = iBX;
        layoutParams2.rightMargin = iBX;
        kg.setLayoutParams(layoutParams2);
        kg.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_logo_en"));
        kg.setTextSize(1, 8.0f);
        kg.setGravity(17);
        kg.setTextColor(android.graphics.Color.parseColor("#BFFFFFFF"));
        addView(eqn);
        addView(kg);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(android.graphics.Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iBX);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 12.0f);
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.zx.WR.bg(this, layoutParams));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
