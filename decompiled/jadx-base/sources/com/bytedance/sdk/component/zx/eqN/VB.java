package com.bytedance.sdk.component.zx.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class VB extends com.bytedance.sdk.component.zx.eqN.bg {
    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public java.lang.String bg() {
        return "net_request";
    }

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public void bg(final com.bytedance.sdk.component.zx.bX.bX bXVar) {
        final com.bytedance.sdk.component.zx.bX.ldr ldrVarTuV = bXVar.tuV();
        com.bytedance.sdk.component.zx.eqN eqN = ldrVarTuV.eqN();
        bXVar.bg(false);
        try {
            com.bytedance.sdk.component.zx.ldr ldrVarBg = eqN.bg(new com.bytedance.sdk.component.zx.IL.bX(bXVar.bg(), bXVar.Ta(), bXVar.yDt(), bXVar.tC()));
            int iIL = ldrVarBg.IL();
            bXVar.bg(ldrVarBg.bg());
            if (ldrVarBg.IL() == 200) {
                final byte[] bArr = (byte[]) ldrVarBg.bX();
                bXVar.bg(new com.bytedance.sdk.component.zx.eqN.IL(bArr, ldrVarBg));
                final java.lang.String strEo = bXVar.eo();
                final com.bytedance.sdk.component.zx.IL ilFy = bXVar.Fy();
                if (ilFy.bX()) {
                    ldrVarTuV.IL(bXVar.Fy()).bg(strEo, bArr);
                }
                ldrVarTuV.ldr().submit(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.zx.eqN.VB.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ilFy.eqN()) {
                            ldrVarTuV.bX(bXVar.Fy()).bg(strEo, bArr);
                        }
                    }
                });
                return;
            }
            ldrVarTuV.Kg();
            java.lang.String.valueOf(ldrVarBg);
            java.lang.Object objBX = ldrVarBg.bX();
            bg(iIL, ldrVarBg.eqN(), objBX instanceof java.lang.Throwable ? (java.lang.Throwable) objBX : null, bXVar);
        } catch (java.lang.Throwable th) {
            bg(1004, "net request failed!", th, bXVar);
        }
    }

    private void bg(int i, java.lang.String str, java.lang.Throwable th, com.bytedance.sdk.component.zx.bX.bX bXVar) {
        bXVar.bg(new com.bytedance.sdk.component.zx.eqN.Kg(i, str, th));
    }
}
