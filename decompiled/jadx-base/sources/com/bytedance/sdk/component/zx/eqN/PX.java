package com.bytedance.sdk.component.zx.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class PX extends com.bytedance.sdk.component.zx.eqN.bg {
    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public java.lang.String bg() {
        return "raw_cache";
    }

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public void bg(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        byte[] bArrBg = bXVar.tuV().IL(bXVar.Fy()).bg(bXVar.eo());
        if (bArrBg == null) {
            bXVar.bg(new com.bytedance.sdk.component.zx.eqN.ldr());
        } else {
            bXVar.bg(new com.bytedance.sdk.component.zx.eqN.IL(bArrBg, null));
        }
    }
}
