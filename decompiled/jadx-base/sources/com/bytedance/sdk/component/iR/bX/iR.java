package com.bytedance.sdk.component.iR.bX;

/* JADX INFO: loaded from: classes3.dex */
public class iR implements com.bytedance.sdk.component.IL.bg.Kg {
    private int bg;

    public void bg(int i) {
        this.bg = i;
    }

    @Override // com.bytedance.sdk.component.IL.bg.Kg
    public com.bytedance.sdk.component.IL.bg.Lq bg(com.bytedance.sdk.component.IL.bg.Kg.bg bgVar) throws java.io.IOException {
        com.bytedance.sdk.component.IL.bg.Lq lqBg;
        java.lang.Exception e;
        com.bytedance.sdk.component.IL.bg.Ta taBg = bgVar.bg();
        if (com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bg).IL() != null) {
            com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bg).IL().zx();
        }
        java.lang.String string = taBg.IL().toString();
        java.lang.String strBg = com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bg).bg(string);
        if (!string.equals(strBg)) {
            taBg = taBg.WR().IL(strBg).IL();
        }
        java.io.IOException iOException = null;
        try {
            lqBg = bgVar.bg(taBg);
            try {
                if (lqBg.bX() == -1) {
                    com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bg).bg(taBg, new java.io.IOException());
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                java.io.IOException iOException2 = new java.io.IOException(e.getMessage());
                com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bg).bg(taBg, e);
                iOException = iOException2;
            }
        } catch (java.lang.Exception e3) {
            lqBg = null;
            e = e3;
        }
        com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bg).bg(taBg, lqBg);
        if (iOException == null) {
            return lqBg == null ? bgVar.bg(taBg) : lqBg;
        }
        throw iOException;
    }
}
