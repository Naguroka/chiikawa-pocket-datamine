package com.bytedance.sdk.component.IL.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eqN extends com.bytedance.sdk.component.IL.bg.VB {
    public com.bytedance.sdk.component.IL.bg.bg.bg.zx Kg;
    public com.bytedance.sdk.component.IL.bg.bg.bg.bg WR;

    public eqN(com.bytedance.sdk.component.IL.bg.VB.bg bgVar) {
        super(bgVar);
        this.Kg = new com.bytedance.sdk.component.IL.bg.bg.bg.zx();
        this.WR = new com.bytedance.sdk.component.IL.bg.bg.bg.bg(this.Kg.IL());
    }

    @Override // com.bytedance.sdk.component.IL.bg.VB
    public com.bytedance.sdk.component.IL.bg.eqN bg() {
        return this.Kg;
    }

    @Override // com.bytedance.sdk.component.IL.bg.VB
    public com.bytedance.sdk.component.IL.bg.IL bg(com.bytedance.sdk.component.IL.bg.Ta ta) {
        ta.bg(this);
        if (ta == null || ta.IL() == null || ta.IL().bg() == null || android.text.TextUtils.isEmpty(ta.IL().bg().toString())) {
            return null;
        }
        if (com.bytedance.sdk.component.IL.bg.bg.bg.bg.bg != null && com.bytedance.sdk.component.IL.bg.bg.bg.bg.bg.IL() && this.WR.zx() && !"setting".equals(ta.ldr())) {
            com.bytedance.sdk.component.IL.bg.bg.bg.IL il = new com.bytedance.sdk.component.IL.bg.bg.bg.IL(ta, this.WR);
            this.WR.bX().add(il);
            return il;
        }
        com.bytedance.sdk.component.IL.bg.bg.bg.IL il2 = new com.bytedance.sdk.component.IL.bg.bg.bg.IL(ta, this.Kg);
        this.Kg.bX().add(il2);
        return il2;
    }
}
