package com.bytedance.adsdk.ugeno.eqN.bX;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.ugeno.eqN.bX.bg implements com.bytedance.adsdk.ugeno.eqN.bg.eqN {
    private com.bytedance.adsdk.ugeno.eqN.bg.bX WR;

    public IL(android.content.Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.eqN.bX.bg
    public boolean bg(java.lang.Object... objArr) {
        com.bytedance.adsdk.ugeno.eqN.bg.bg bgVarLKE = this.IL.LKE();
        if (bgVarLKE == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.eqN.bg.bX bXVarBg = bgVarLKE.bg(this.ldr);
        this.WR = bXVarBg;
        if (bXVarBg != null) {
            bXVarBg.bg(this);
            return false;
        }
        bgVarLKE.bg(this.ldr, new com.bytedance.adsdk.ugeno.eqN.bg.IL());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.eqN.bg.eqN
    public void bg(java.lang.String str) {
        android.util.Log.d("UGBaseEventMonitor", "receive: ");
        this.bg.bg(this.IL, this.ldr, this.bX.IL());
    }
}
