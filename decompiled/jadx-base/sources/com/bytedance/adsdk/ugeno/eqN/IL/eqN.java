package com.bytedance.adsdk.ugeno.eqN.IL;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.adsdk.ugeno.eqN.IL.bg {
    public eqN(com.bytedance.adsdk.ugeno.IL.bX bXVar, java.lang.String str, com.bytedance.adsdk.ugeno.eqN.IL.bg bgVar) {
        super(bXVar, str, bgVar);
    }

    @Override // com.bytedance.adsdk.ugeno.eqN.IL.bg
    public void bg() {
        if (this.ldr == null || this.ldr.size() <= 0) {
            return;
        }
        java.lang.String str = this.ldr.get("id");
        if (android.text.TextUtils.isEmpty(str)) {
            bg(this.bX);
            return;
        }
        com.bytedance.adsdk.ugeno.IL.bX bXVarIL = this.bX.IL(this.bX);
        if (bXVarIL == null) {
            return;
        }
        bg(bXVarIL.bX(str));
    }

    private void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        if (bXVar == null) {
            return;
        }
        for (java.lang.String str : this.ldr.keySet()) {
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.equals(str, "id")) {
                bXVar.bg(str, this.ldr.get(str));
            }
        }
        bXVar.Ja();
        bXVar.IL();
    }
}
