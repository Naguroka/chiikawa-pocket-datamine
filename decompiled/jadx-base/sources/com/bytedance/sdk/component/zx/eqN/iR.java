package com.bytedance.sdk.component.zx.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class iR extends com.bytedance.sdk.component.zx.eqN.bg {
    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public java.lang.String bg() {
        return "check_duplicate";
    }

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public void bg(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        java.util.List<com.bytedance.sdk.component.zx.bX.bX> linkedList;
        java.lang.String strRri = bXVar.rri();
        java.util.Map<java.lang.String, java.util.List<com.bytedance.sdk.component.zx.bX.bX>> mapIR = bXVar.tuV().iR();
        synchronized (mapIR) {
            linkedList = mapIR.get(strRri);
            if (linkedList == null) {
                linkedList = new java.util.LinkedList<>();
            }
        }
        synchronized (linkedList) {
            linkedList.add(bXVar);
            mapIR.put(strRri, linkedList);
            if (linkedList.size() <= 1) {
                bXVar.bg(new com.bytedance.sdk.component.zx.eqN.eqN());
            }
        }
    }
}
