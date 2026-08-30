package com.bytedance.sdk.openadsdk.Ta;

/* JADX INFO: loaded from: classes4.dex */
public class Lq extends com.bytedance.sdk.openadsdk.core.zx.iR {
    public Lq(android.content.Context context) {
        this(context, null);
    }

    public Lq(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Lq(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        bg(context);
    }

    private void bg(android.content.Context context) {
        setId(com.bytedance.sdk.openadsdk.utils.Ta.aMs);
        setBackgroundColor(android.graphics.Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg.setId(com.bytedance.sdk.openadsdk.utils.Ta.IE);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        kg.setLayoutParams(layoutParams);
        kg.setIncludeFontPadding(false);
        kg.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_video_without_wifi_tips"));
        kg.setTextColor(android.graphics.Color.parseColor("#cacaca"));
        kg.setTextSize(2, 14.0f);
        addView(kg);
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(context);
        iRVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.Vm);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, com.bytedance.sdk.openadsdk.utils.Ta.IE);
        layoutParams2.addRule(13);
        iRVar.setLayoutParams(layoutParams2);
        addView(iRVar);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.IGR);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(iBX, iBX);
        layoutParams3.addRule(15);
        eqn.setLayoutParams(layoutParams3);
        eqn.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(context, "tt_new_play_video"));
        eqn.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        iRVar.addView(eqn);
    }
}
