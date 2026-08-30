package com.bytedance.sdk.component.zx.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bytedance.sdk.component.zx.eqN.WR {
    private com.bytedance.sdk.component.zx.ldr IL;
    private byte[] bg;

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public java.lang.String bg() {
        return "image_type";
    }

    public IL(byte[] bArr, com.bytedance.sdk.component.zx.ldr ldrVar) {
        this.bg = bArr;
        this.IL = ldrVar;
    }

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public void bg(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        com.bytedance.sdk.component.zx.eqN.WR kg;
        int iPX = bXVar.PX();
        bXVar.bg(this.bg.length);
        if (iPX != 2) {
            if (iPX == 3) {
                byte[] bArr = this.bg;
                kg = new com.bytedance.sdk.component.zx.eqN.Ta(bArr, this.IL, com.bytedance.sdk.component.zx.bX.bX.bg.IL(bArr));
            } else {
                boolean zIL = com.bytedance.sdk.component.zx.bX.bX.bg.IL(this.bg);
                if (!zIL && com.bytedance.sdk.component.zx.bX.bX.bg.bg(this.bg)) {
                    kg = new com.bytedance.sdk.component.zx.eqN.zx(this.bg, this.IL);
                } else {
                    kg = new com.bytedance.sdk.component.zx.eqN.Ta(this.bg, this.IL, zIL);
                }
            }
        } else if (com.bytedance.sdk.component.zx.bX.bX.bg.bg(this.bg)) {
            kg = new com.bytedance.sdk.component.zx.eqN.zx(this.bg, this.IL);
        } else if (this.IL == null) {
            kg = new com.bytedance.sdk.component.zx.eqN.VB();
        } else {
            kg = new com.bytedance.sdk.component.zx.eqN.Kg(1001, "not image format", null);
        }
        bXVar.bg(kg);
    }
}
