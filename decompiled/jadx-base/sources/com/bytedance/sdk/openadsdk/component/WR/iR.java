package com.bytedance.sdk.openadsdk.component.WR;

/* JADX INFO: loaded from: classes4.dex */
public class iR extends com.bytedance.sdk.openadsdk.core.zx.iR {
    private final com.bytedance.sdk.openadsdk.core.zx.eqN IL;
    private final com.bytedance.sdk.openadsdk.core.zx.eqN bg;

    public iR(android.content.Context context) {
        super(context);
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f);
        com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        this.bg = eqn;
        eqn.setId(520093713);
        int iBX4 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(getContext(), 5.0f);
        eqn.setPadding(iBX4, iBX4, iBX4, iBX4);
        eqn.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        eqn.setBackground(com.bytedance.sdk.openadsdk.core.widget.eqN.bg());
        eqn.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_reward_full_feedback"));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(iBX3, iBX3);
        layoutParams.topMargin = iBX2;
        layoutParams.leftMargin = iBX;
        layoutParams.setMarginStart(iBX);
        eqn.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn2 = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        this.IL = eqn2;
        eqn2.setId(520093714);
        eqn2.setPadding(iBX4, iBX4, iBX4, iBX4);
        eqn2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        eqn2.setBackground(com.bytedance.sdk.openadsdk.core.widget.eqN.bg());
        eqn2.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_close_btn"));
        if (eqn2.getDrawable() != null) {
            eqn2.getDrawable().setAutoMirrored(true);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(iBX3, iBX3);
        layoutParams2.topMargin = iBX2;
        layoutParams2.rightMargin = iBX;
        layoutParams2.setMarginEnd(iBX);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        eqn2.setLayoutParams(layoutParams2);
        addView(eqn);
        addView(eqn2);
    }

    public android.view.View getTopDislike() {
        return this.bg;
    }

    public com.bytedance.sdk.openadsdk.core.zx.eqN getTopSkip() {
        return this.IL;
    }
}
