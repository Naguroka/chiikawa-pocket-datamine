package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class eo extends android.widget.RelativeLayout {
    public eo(android.content.Context context) {
        super(context);
        bg();
    }

    private void bg() {
        android.content.Context context = getContext();
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn.setId(520093720);
        eqn.setClickable(true);
        eqn.setFocusable(true);
        eqn.setImageDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_leftbackicon_selector"));
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(iBX2, iBX2);
        layoutParams.leftMargin = iBX;
        layoutParams.addRule(15);
        addView(eqn, layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn2 = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn2.setId(520093716);
        eqn2.setClickable(true);
        eqn2.setFocusable(true);
        eqn2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_titlebar_close_seletor"));
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(iBX2, iBX2);
        layoutParams2.leftMargin = iBX;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(eqn2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn3 = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn3.setId(com.bytedance.sdk.openadsdk.utils.Ta.hff);
        eqn3.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_ad_feedback_new"));
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(iBX2, iBX2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iBX;
        addView(eqn3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg.setId(com.bytedance.sdk.openadsdk.utils.Ta.xFs);
        kg.setSingleLine(true);
        kg.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        kg.setGravity(17);
        kg.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        kg.setTextSize(1, 16.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, com.bytedance.sdk.openadsdk.utils.Ta.hff);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 25.0f);
        layoutParams4.rightMargin = iBX3;
        layoutParams4.leftMargin = iBX3;
        addView(kg, layoutParams4);
    }
}
