package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class WR extends android.widget.RelativeLayout {
    public WR(android.content.Context context) {
        super(context);
        bg();
    }

    private void bg() {
        setId(com.bytedance.sdk.openadsdk.utils.Ta.Ys);
        setBackgroundColor(-1);
        android.content.Context context = getContext();
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.dS);
        eqn.setClickable(true);
        eqn.setFocusable(true);
        eqn.setPadding(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f));
        eqn.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(context, "tt_ad_xmark"));
        addView(eqn, new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 40.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn2 = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn2.setId(com.bytedance.sdk.openadsdk.utils.Ta.Dt);
        eqn2.setPadding(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f));
        eqn2.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(context, "tt_ad_feedback"));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 40.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f));
        layoutParams.addRule(11);
        addView(eqn2, layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg.setId(com.bytedance.sdk.openadsdk.utils.Ta.RiO);
        kg.setSingleLine(true);
        kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg.setGravity(17);
        kg.setTextColor(android.graphics.Color.parseColor("#222222"));
        kg.setTextSize(2, 17.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 191.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, com.bytedance.sdk.openadsdk.utils.Ta.Dt);
        layoutParams2.addRule(1, com.bytedance.sdk.openadsdk.utils.Ta.dS);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f);
        layoutParams2.leftMargin = iBX;
        layoutParams2.rightMargin = iBX;
        addView(kg, layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.ldr ldrVar = new com.bytedance.sdk.openadsdk.core.zx.ldr(context, null, android.R.style.Widget.ProgressBar.Horizontal);
        ldrVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.Ny);
        ldrVar.setProgress(1);
        ldrVar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_privacy_progress_style"));
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 2.0f));
        layoutParams3.addRule(12);
        addView(ldrVar, layoutParams3);
        android.view.View view = new android.view.View(context);
        view.setBackgroundColor(android.graphics.Color.parseColor("#1F161823"));
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
