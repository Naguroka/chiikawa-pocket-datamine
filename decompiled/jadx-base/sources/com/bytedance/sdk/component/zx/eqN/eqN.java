package com.bytedance.sdk.component.zx.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.sdk.component.zx.eqN.bg {
    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public java.lang.String bg() {
        return "cache_policy";
    }

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public void bg(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        com.bytedance.sdk.component.zx.IL ilFy = bXVar.Fy();
        if (ilFy != null) {
            if (ilFy.bX()) {
                bXVar.bg(new com.bytedance.sdk.component.zx.eqN.eo());
                return;
            } else if (ilFy.eqN()) {
                bXVar.bg(new com.bytedance.sdk.component.zx.eqN.ldr());
                return;
            }
        }
        bXVar.bg(new com.bytedance.sdk.component.zx.eqN.VB());
    }
}
