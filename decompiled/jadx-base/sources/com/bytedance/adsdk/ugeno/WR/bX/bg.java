package com.bytedance.adsdk.ugeno.WR.bX;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg extends com.bytedance.adsdk.ugeno.WR.eqN.bX {
    private int gCm;

    public abstract java.lang.String iR(java.lang.String str);

    public bg(android.content.Context context) {
        super(context);
        this.gCm = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    }

    @Override // com.bytedance.adsdk.ugeno.WR.eqN.bX, com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        this.bg = WR(this.bg);
        super.IL();
        ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).setColorFilter(this.gCm);
        ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
    }

    private java.lang.String WR(java.lang.String str) {
        java.lang.String strIR = iR(str);
        return android.text.TextUtils.isEmpty(strIR) ? "" : "local://".concat(java.lang.String.valueOf(strIR));
    }

    @Override // com.bytedance.adsdk.ugeno.WR.eqN.bX, com.bytedance.adsdk.ugeno.IL.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        super.bg(str, str2);
        str.hashCode();
        if (str.equals("textColor")) {
            this.gCm = com.bytedance.adsdk.ugeno.iR.bg.bg(str2);
        }
    }
}
