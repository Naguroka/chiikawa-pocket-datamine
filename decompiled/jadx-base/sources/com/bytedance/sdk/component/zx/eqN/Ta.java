package com.bytedance.sdk.component.zx.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class Ta<T> extends com.bytedance.sdk.component.zx.eqN.bg {
    private com.bytedance.sdk.component.zx.ldr IL;
    private boolean bX;
    private T bg;

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public java.lang.String bg() {
        return "success";
    }

    public Ta(T t, com.bytedance.sdk.component.zx.ldr ldrVar, boolean z) {
        this.bg = t;
        this.IL = ldrVar;
        this.bX = z;
    }

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public void bg(com.bytedance.sdk.component.zx.bX.bX bXVar) {
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

    private java.util.Map<java.lang.String, java.lang.String> IL() {
        com.bytedance.sdk.component.zx.ldr ldrVar = this.IL;
        if (ldrVar != null) {
            return ldrVar.zx();
        }
        return null;
    }

    private void IL(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        com.bytedance.sdk.component.zx.xxp xxpVarWR = bXVar.WR();
        if (xxpVarWR != null) {
            xxpVarWR.bg(new com.bytedance.sdk.component.zx.bX.eqN().bg(bXVar, this.bg, IL(), this.bX));
        }
    }
}
