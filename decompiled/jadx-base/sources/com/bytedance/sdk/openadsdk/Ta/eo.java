package com.bytedance.sdk.openadsdk.Ta;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eo extends com.bytedance.sdk.openadsdk.core.zx.bX {
    protected com.bytedance.sdk.openadsdk.core.zx.eqN IL;
    protected com.bytedance.sdk.openadsdk.core.widget.VzQ bX;
    protected com.bytedance.sdk.openadsdk.core.zx.bX bg;
    protected com.bytedance.sdk.openadsdk.core.zx.Kg eqN;
    protected com.bytedance.sdk.openadsdk.core.zx.Kg ldr;
    protected com.bytedance.sdk.openadsdk.core.zx.Kg zx;

    protected abstract void bg(android.content.Context context);

    public eo(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        bg(context);
    }

    public android.widget.FrameLayout getTtAdContainer() {
        return this.bg;
    }

    public android.widget.ImageView getTtFullImg() {
        return this.IL;
    }

    public com.bytedance.sdk.openadsdk.core.widget.VzQ getTtFullAdIcon() {
        return this.bX;
    }

    public android.widget.TextView getTtFullAdAppName() {
        return this.eqN;
    }

    public android.widget.TextView getTtFullAdDesc() {
        return this.zx;
    }

    public android.widget.TextView getTtFullAdDownload() {
        return this.ldr;
    }

    protected com.bytedance.sdk.openadsdk.core.zx.bX zx(android.content.Context context) {
        return new com.bytedance.sdk.openadsdk.core.zx.bX(context);
    }

    protected com.bytedance.sdk.openadsdk.core.zx.eqN ldr(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        return eqn;
    }

    protected com.bytedance.sdk.openadsdk.core.widget.VzQ iR(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        vzQ.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        vzQ.setBackgroundColor(0);
        return vzQ;
    }

    protected com.bytedance.sdk.openadsdk.core.zx.Kg IL(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg.setMaxLines(1);
        kg.setTextColor(android.graphics.Color.parseColor("#FF999999"));
        kg.setTextSize(2, 16.0f);
        return kg;
    }

    protected com.bytedance.sdk.openadsdk.core.zx.Kg bX(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg.setMaxLines(1);
        kg.setSingleLine();
        kg.setTextColor(android.graphics.Color.parseColor("#FF999999"));
        kg.setTextSize(2, 12.0f);
        return kg;
    }

    protected com.bytedance.sdk.openadsdk.core.zx.Kg eqN(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_backup_btn_1"));
        kg.setGravity(17);
        kg.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_video_download_apk"));
        kg.setTextColor(-1);
        kg.setTextSize(2, 14.0f);
        return kg;
    }

    protected com.bytedance.sdk.openadsdk.core.widget.PAGLogoView Kg(android.content.Context context) {
        com.bytedance.sdk.openadsdk.core.widget.PAGLogoView pAGLogoView = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }
}
