package com.bytedance.sdk.openadsdk.component.WR;

/* JADX INFO: loaded from: classes4.dex */
public class ldr extends com.bytedance.sdk.openadsdk.component.WR.bX {
    private final com.bytedance.sdk.openadsdk.core.zx.zx Ta;
    private final com.bytedance.sdk.openadsdk.core.widget.xxp yDt;

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public com.bytedance.sdk.openadsdk.core.zx.eqN getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public com.bytedance.sdk.openadsdk.core.zx.Kg getAdTitleTextView() {
        return null;
    }

    public ldr(android.content.Context context) {
        super(context);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{android.graphics.Color.parseColor("#EDFCFF"), android.graphics.Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        this.Ta = zxVar;
        zxVar.setId(520093758);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        layoutParams.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 56.0f);
        zxVar.setLayoutParams(layoutParams);
        zxVar.setClickable(false);
        zxVar.setGravity(16);
        zxVar.setOrientation(0);
        this.ldr = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        this.ldr.setId(520093759);
        this.ldr.setLayoutParams(new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f)));
        this.iR = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.iR.setId(520093761);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f);
        this.iR.setLayoutParams(layoutParams2);
        this.iR.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.iR.setMaxLines(2);
        this.iR.setTextColor(android.graphics.Color.parseColor("#161823"));
        this.iR.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(context);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        layoutParams3.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        iRVar.setLayoutParams(layoutParams3);
        this.WR = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        this.WR.setId(com.bytedance.sdk.openadsdk.utils.Ta.NC);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 80.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 80.0f));
        layoutParams4.addRule(14);
        this.WR.setLayoutParams(layoutParams4);
        this.eo = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.eo.setId(com.bytedance.sdk.openadsdk.utils.Ta.Cv);
        this.eo.setTextSize(24.0f);
        this.eo.setTextColor(android.graphics.Color.parseColor("#161823"));
        this.eo.setGravity(17);
        this.eo.setMaxLines(1);
        this.eo.setEllipsize(android.text.TextUtils.TruncateAt.END);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, com.bytedance.sdk.openadsdk.utils.Ta.NC);
        layoutParams5.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        layoutParams5.addRule(14);
        this.eo.setLayoutParams(layoutParams5);
        this.VB = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.VB.setId(com.bytedance.sdk.openadsdk.utils.Ta.jwM);
        this.VB.setTextSize(16.0f);
        this.VB.setTextColor(android.graphics.Color.parseColor("#80161823"));
        this.VB.setGravity(17);
        this.VB.setMaxLines(2);
        this.VB.setEllipsize(android.text.TextUtils.TruncateAt.END);
        android.widget.RelativeLayout.LayoutParams layoutParams6 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, com.bytedance.sdk.openadsdk.utils.Ta.Cv);
        layoutParams6.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 4.0f);
        layoutParams6.addRule(14);
        this.VB.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = new com.bytedance.sdk.openadsdk.core.widget.xxp(context);
        this.yDt = xxpVar;
        android.widget.RelativeLayout.LayoutParams layoutParams7 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(14);
        layoutParams7.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        xxpVar.setLayoutParams(layoutParams7);
        this.zx = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.zx.setId(520093717);
        this.zx.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_reward_full_video_backup_btn_bg"));
        this.zx.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.zx.setLines(1);
        this.zx.setGravity(17);
        this.zx.setTextColor(-1);
        this.zx.setTextSize(16.0f);
        this.zx.setTag("open_ad_click_button_tag");
        android.widget.RelativeLayout.LayoutParams layoutParams8 = new android.widget.RelativeLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f));
        layoutParams8.addRule(3, com.bytedance.sdk.openadsdk.utils.Ta.jwM);
        layoutParams8.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 54.0f);
        layoutParams8.addRule(14);
        this.zx.setLayoutParams(layoutParams8);
        this.eqN = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(context);
        this.eqN.setId(520093757);
        android.widget.RelativeLayout.LayoutParams layoutParams9 = new android.widget.RelativeLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f));
        layoutParams9.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f);
        layoutParams9.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        layoutParams9.addRule(12);
        this.eqN.setLayoutParams(layoutParams9);
        addView(this.Kg);
        zxVar.addView(this.ldr);
        zxVar.addView(this.iR);
        addView(zxVar);
        iRVar.addView(this.WR);
        iRVar.addView(this.eo);
        iRVar.addView(this.VB);
        iRVar.addView(xxpVar);
        iRVar.addView(this.zx);
        addView(iRVar);
        addView(this.eqN);
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public android.view.View getUserInfo() {
        return this.Ta;
    }

    @Override // com.bytedance.sdk.openadsdk.component.WR.bX
    public com.bytedance.sdk.openadsdk.core.widget.xxp getScoreBar() {
        return this.yDt;
    }
}
