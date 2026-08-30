package com.bytedance.sdk.component.zx.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends com.bytedance.sdk.component.zx.eqN.bg {
    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public java.lang.String bg() {
        return "disk_cache";
    }

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public void bg(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        byte[] bArrBg;
        java.lang.String strEo = bXVar.eo();
        if (bXVar.LZ() || bXVar.Fy().ldr()) {
            bArrBg = bg(bXVar, strEo);
        } else {
            bArrBg = IL(bXVar, strEo);
        }
        if (bArrBg == null) {
            bXVar.bg(new com.bytedance.sdk.component.zx.eqN.VB());
        } else {
            bXVar.bg(new com.bytedance.sdk.component.zx.eqN.IL(bArrBg, null));
            bXVar.tuV().IL(bXVar.Fy()).bg(strEo, bArrBg);
        }
    }

    private byte[] bg(com.bytedance.sdk.component.zx.bX.bX bXVar, java.lang.String str) {
        bXVar.tuV().bX(bXVar.Fy());
        java.util.Collection<com.bytedance.sdk.component.zx.bX> collectionBX = bXVar.tuV().bX();
        if (collectionBX == null) {
            return null;
        }
        java.util.Iterator<com.bytedance.sdk.component.zx.bX> it = collectionBX.iterator();
        while (it.hasNext()) {
            byte[] bArrBg = it.next().bg(str);
            if (bArrBg != null) {
                return bArrBg;
            }
        }
        return null;
    }

    private byte[] IL(com.bytedance.sdk.component.zx.bX.bX bXVar, java.lang.String str) {
        com.bytedance.sdk.component.zx.bX bXVarBX = bXVar.tuV().bX(bXVar.Fy());
        if (bXVarBX == null) {
            return null;
        }
        return bXVarBX.bg(str);
    }
}
