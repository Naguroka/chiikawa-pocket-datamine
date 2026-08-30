package com.bytedance.sdk.openadsdk.core.VB.IL;

/* JADX INFO: loaded from: classes4.dex */
public class IL extends com.bytedance.adsdk.ugeno.IL.bX<com.bytedance.sdk.openadsdk.core.widget.zx> {
    protected android.widget.ImageView.ScaleType IL;
    protected java.lang.String bg;

    public IL(android.content.Context context) {
        super(context);
        this.IL = android.widget.ImageView.ScaleType.FIT_CENTER;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.core.widget.zx eqN() {
        this.ldr = new com.bytedance.sdk.openadsdk.core.widget.zx(this.bX);
        return (com.bytedance.sdk.openadsdk.core.widget.zx) this.ldr;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        super.IL();
        bX();
        ((com.bytedance.sdk.openadsdk.core.widget.zx) this.ldr).setScaleType(this.IL);
    }

    private void bX() {
        if (android.text.TextUtils.isEmpty(this.bg)) {
            return;
        }
        if (this.bg.startsWith("local://")) {
            ((com.bytedance.sdk.openadsdk.core.widget.zx) this.ldr).bg(com.bytedance.adsdk.ugeno.iR.eqN.bg(this.bX, this.bg.replace("local://", "")), false);
        } else {
            com.bytedance.adsdk.ugeno.eqN.bg().IL().bg(this.eo, this.bg, (android.widget.ImageView) this.ldr);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        super.bg(str, str2);
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        if (str.equals("scaleType")) {
            this.IL = iR(str2);
        } else if (str.equals("src")) {
            this.bg = str2;
        }
    }

    private android.widget.ImageView.ScaleType iR(java.lang.String str) {
        android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.FIT_XY;
        str.hashCode();
        switch (str) {
            case "center":
                return android.widget.ImageView.ScaleType.CENTER;
            case "fitEnd":
                return android.widget.ImageView.ScaleType.FIT_END;
            case "fitStart":
                return android.widget.ImageView.ScaleType.FIT_START;
            case "centerInside":
                return android.widget.ImageView.ScaleType.CENTER_INSIDE;
            case "fitXY":
                return android.widget.ImageView.ScaleType.FIT_XY;
            case "fitCenter":
                return android.widget.ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return android.widget.ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }
}
