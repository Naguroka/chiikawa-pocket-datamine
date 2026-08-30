package com.bytedance.sdk.openadsdk.Ta;

/* JADX INFO: loaded from: classes4.dex */
public class PX extends com.bytedance.sdk.openadsdk.core.zx.iR {
    public PX(android.content.Context context) {
        this(context, null);
    }

    public PX(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PX(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        bg(context);
    }

    private void bg(android.content.Context context) {
        setId(com.bytedance.sdk.openadsdk.utils.Ta.ovC);
        setVisibility(8);
        setBackgroundColor(android.graphics.Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(getContext());
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.zU);
        eqn.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        eqn.setImageTintMode(android.graphics.PorterDuff.Mode.SRC_OVER);
        eqn.setImageTintList(android.content.res.ColorStateList.valueOf(android.graphics.Color.parseColor("#7f000000")));
        eqn.setBackgroundColor(android.graphics.Color.parseColor("#7f000000"));
        eqn.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(eqn);
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(context);
        iRVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.ews);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        iRVar.setLayoutParams(layoutParams);
        addView(iRVar);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.bg bgVar = new com.bytedance.sdk.openadsdk.core.widget.bg(context);
        bgVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.qC);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(iBX, iBX);
        layoutParams2.addRule(14);
        bgVar.setLayoutParams(layoutParams2);
        bgVar.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        iRVar.addView(bgVar);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg.setId(com.bytedance.sdk.openadsdk.utils.Ta.Dxa);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(iBX, iBX);
        layoutParams3.addRule(8, com.bytedance.sdk.openadsdk.utils.Ta.qC);
        layoutParams3.addRule(19, com.bytedance.sdk.openadsdk.utils.Ta.qC);
        layoutParams3.addRule(5, com.bytedance.sdk.openadsdk.utils.Ta.qC);
        layoutParams3.addRule(7, com.bytedance.sdk.openadsdk.utils.Ta.qC);
        layoutParams3.addRule(18, com.bytedance.sdk.openadsdk.utils.Ta.qC);
        layoutParams3.addRule(6, com.bytedance.sdk.openadsdk.utils.Ta.qC);
        layoutParams3.addRule(14);
        kg.setLayoutParams(layoutParams3);
        kg.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_circle_solid_mian"));
        kg.setGravity(17);
        kg.setTextColor(-1);
        kg.setTextSize(2, 19.0f);
        kg.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        kg.setVisibility(8);
        iRVar.addView(kg);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg2 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg2.setId(com.bytedance.sdk.openadsdk.utils.Ta.bN);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, com.bytedance.sdk.openadsdk.utils.Ta.qC);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 6.0f);
        kg2.setLayoutParams(layoutParams4);
        kg2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg2.setMaxLines(1);
        kg2.setTextColor(-1);
        kg2.setTextSize(2, 12.0f);
        iRVar.addView(kg2);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg3 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg3.setId(com.bytedance.sdk.openadsdk.utils.Ta.jz);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 100.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, com.bytedance.sdk.openadsdk.utils.Ta.bN);
        layoutParams5.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f);
        kg3.setLayoutParams(layoutParams5);
        kg3.setMinWidth(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 72.0f));
        kg3.setMaxLines(1);
        kg3.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg3.setTextColor(-1);
        kg3.setTextSize(2, 14.0f);
        kg3.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_ad_cover_btn_begin_bg"));
        kg3.setGravity(17);
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 10.0f);
        int iBX3 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 2.0f);
        kg3.setPadding(iBX2, iBX3, iBX2, iBX3);
        kg3.setVisibility(8);
        iRVar.addView(kg3);
    }
}
