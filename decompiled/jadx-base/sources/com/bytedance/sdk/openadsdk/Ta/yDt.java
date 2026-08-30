package com.bytedance.sdk.openadsdk.Ta;

/* JADX INFO: loaded from: classes4.dex */
public class yDt extends com.bytedance.sdk.openadsdk.core.zx.iR {
    public yDt(android.content.Context context) {
        this(context, null);
    }

    public yDt(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public yDt(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        bg(context);
    }

    private void bg(android.content.Context context) {
        setBackgroundColor(android.graphics.Color.parseColor("#000000"));
        setId(520093726);
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(context);
        bXVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.uny);
        bXVar.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        bXVar.setBackgroundColor(0);
        addView(bXVar);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.JxS);
        eqn.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        eqn.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        bXVar.addView(eqn);
        com.bytedance.sdk.openadsdk.core.zx.ldr ldrVar = new com.bytedance.sdk.openadsdk.core.zx.ldr(context);
        ldrVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.KRc);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(iBX, iBX);
        layoutParams.gravity = 17;
        ldrVar.setLayoutParams(layoutParams);
        ldrVar.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_video_loading_progress_bar"));
        bXVar.addView(ldrVar);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn2 = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn2.setId(com.bytedance.sdk.openadsdk.utils.Ta.yda);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        eqn2.setLayoutParams(layoutParams2);
        eqn2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        eqn2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_play_movebar_textpage"));
        eqn2.setVisibility(8);
        addView(eqn2);
        com.bytedance.sdk.openadsdk.Ta.PX px = new com.bytedance.sdk.openadsdk.Ta.PX(context);
        px.setId(com.bytedance.sdk.openadsdk.utils.Ta.ovC);
        px.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(px);
    }
}
