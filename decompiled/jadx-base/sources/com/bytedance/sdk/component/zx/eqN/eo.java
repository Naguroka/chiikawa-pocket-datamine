package com.bytedance.sdk.component.zx.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class eo extends com.bytedance.sdk.component.zx.eqN.bg {
    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public java.lang.String bg() {
        return "memory_cache";
    }

    @Override // com.bytedance.sdk.component.zx.eqN.WR
    public void bg(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        android.graphics.Bitmap bitmapIL;
        int iPX = bXVar.PX();
        if (iPX != 2 && iPX != 1) {
            bitmapIL = null;
        } else if (bXVar.LZ() || bXVar.Fy().ldr()) {
            bitmapIL = IL(bXVar);
        } else {
            bitmapIL = bX(bXVar);
        }
        if (bitmapIL == null) {
            bXVar.bg(new com.bytedance.sdk.component.zx.eqN.PX());
        } else {
            bXVar.bg(new com.bytedance.sdk.component.zx.eqN.Ta(bitmapIL, null, false));
        }
    }

    private android.graphics.Bitmap IL(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        java.util.Collection<com.bytedance.sdk.component.zx.tuV> collectionBg = bXVar.tuV().bg();
        android.graphics.Bitmap bitmapBg = null;
        if (collectionBg == null) {
            return null;
        }
        java.util.Iterator<com.bytedance.sdk.component.zx.tuV> it = collectionBg.iterator();
        while (it.hasNext() && (bitmapBg = it.next().bg(bXVar.zx())) == null) {
        }
        return bitmapBg;
    }

    private android.graphics.Bitmap bX(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        return bXVar.tuV().bg(bXVar.Fy()).bg(bXVar.zx());
    }
}
