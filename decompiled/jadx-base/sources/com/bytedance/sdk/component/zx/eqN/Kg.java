package com.bytedance.sdk.component.zx.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class Kg extends com.bytedance.sdk.component.zx.eqN.bg {
    private int IL;
    private java.lang.String bX;
    private java.lang.Throwable bg;

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public java.lang.String bg() {
        return com.ironsource.y8.h.t;
    }

    public Kg(int i, java.lang.String str, java.lang.Throwable th) {
        this.IL = i;
        this.bX = str;
        this.bg = th;
    }

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public void bg(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        bXVar.bg(new com.bytedance.sdk.component.zx.bX.bg(this.IL, this.bX, this.bg));
        java.lang.String strRri = bXVar.rri();
        java.util.Map<java.lang.String, java.util.List<com.bytedance.sdk.component.zx.bX.bX>> mapIR = bXVar.tuV().iR();
        java.util.List<com.bytedance.sdk.component.zx.bX.bX> list = mapIR.get(strRri);
        if (list == null) {
            IL(bXVar);
            return;
        }
        synchronized (list) {
            java.util.Iterator<com.bytedance.sdk.component.zx.bX.bX> it = list.iterator();
            while (it.hasNext()) {
                IL(it.next());
            }
            list.clear();
            mapIR.remove(strRri);
        }
    }

    private void IL(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        com.bytedance.sdk.component.zx.xxp xxpVarWR = bXVar.WR();
        if (xxpVarWR != null) {
            xxpVarWR.bg(this.IL, this.bX, this.bg);
        }
    }
}
