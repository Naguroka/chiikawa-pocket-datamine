package com.bytedance.adsdk.ugeno.WR.zx;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.ugeno.IL.bX<com.bytedance.adsdk.ugeno.WR.zx.bg> {
    private float FFy;
    private int IL;
    private float ZTq;
    private int bg;
    private float gCm;
    private static final int rr = android.graphics.Color.parseColor("#FFC642");
    private static final int gtr = android.graphics.Color.parseColor("#e3e3e4");

    public IL(android.content.Context context) {
        super(context);
        this.bg = rr;
        this.IL = gtr;
        this.ZTq = 4.0f;
        this.gCm = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.WR.zx.bg eqN() {
        com.bytedance.adsdk.ugeno.WR.zx.bg bgVar = new com.bytedance.adsdk.ugeno.WR.zx.bg(this.bX);
        bgVar.bg(this);
        return bgVar;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        super.IL();
        if (DDQ()) {
            ((com.bytedance.adsdk.ugeno.WR.zx.bg) this.ldr).bg(this.ZTq, this.bg, this.IL, this.gCm, (int) this.FFy);
        } else {
            ((com.bytedance.adsdk.ugeno.WR.zx.bg) this.ldr).bg(this.ZTq, this.bg, this.IL, this.gCm, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        super.bg(str, str2);
        str.hashCode();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.bg = com.bytedance.adsdk.ugeno.iR.bg.bg(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.IL = com.bytedance.adsdk.ugeno.iR.bg.bg(str2, gtr);
                break;
            case "gap":
                this.FFy = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case "size":
                this.gCm = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 20.0f);
                break;
            case "score":
                this.ZTq = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 4.0f);
                break;
        }
    }
}
