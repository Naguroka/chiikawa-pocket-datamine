package com.bytedance.sdk.component.zx.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends com.bytedance.sdk.component.zx.eqN.bg {
    private com.bytedance.sdk.component.zx.ldr IL;
    private byte[] bg;

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public java.lang.String bg() {
        return "decode";
    }

    public zx(byte[] bArr, com.bytedance.sdk.component.zx.ldr ldrVar) {
        this.bg = bArr;
        this.IL = ldrVar;
    }

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public void bg(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        com.bytedance.sdk.component.zx.bX.ldr ldrVarTuV = bXVar.tuV();
        com.bytedance.sdk.component.zx.bX.IL.bg bgVarBg = ldrVarTuV.bg(bXVar);
        try {
            bXVar.tC();
            android.graphics.Bitmap bitmapBg = bgVarBg.bg(this.bg);
            if (bitmapBg != null) {
                bXVar.bg(new com.bytedance.sdk.component.zx.eqN.Ta(bitmapBg, this.IL, false));
                ldrVarTuV.bg(bXVar.Fy()).bg(bXVar.zx(), bitmapBg);
                return;
            }
            bg(1002, "decode failed bitmap null", null, bXVar);
        } catch (java.lang.Throwable th) {
            bg(1002, "decode failed:" + th.getMessage(), th, bXVar);
        }
    }

    private void bg(int i, java.lang.String str, java.lang.Throwable th, com.bytedance.sdk.component.zx.bX.bX bXVar) {
        if (this.IL == null) {
            bXVar.bg(new com.bytedance.sdk.component.zx.eqN.VB());
        } else {
            bXVar.bg(new com.bytedance.sdk.component.zx.eqN.Kg(i, str, th));
        }
    }
}
