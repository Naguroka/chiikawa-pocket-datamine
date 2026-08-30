package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class kMt {
    public static java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.bytedance.sdk.openadsdk.core.kMt> bg = new java.util.concurrent.ConcurrentHashMap<>();
    private java.lang.String IL = "";
    private java.lang.String bX = "";
    private int eqN;
    private java.lang.String ldr;
    private int zx;

    public java.lang.String bg() {
        return this.ldr;
    }

    public java.lang.String IL() {
        return this.IL;
    }

    public java.lang.String bX() {
        return this.bX;
    }

    public int eqN() {
        return this.eqN;
    }

    public void bg(int i) {
        this.eqN = i;
    }

    public int zx() {
        return this.zx;
    }

    public void IL(int i) {
        this.zx = i;
    }

    private void ldr() {
        this.IL = "";
        this.bX = "";
        this.eqN = 0;
        this.zx = 0;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv != null) {
            java.lang.String strWaE = tuv.waE();
            if (!android.text.TextUtils.isEmpty(strWaE)) {
                this.ldr = strWaE;
            }
            java.lang.String strGvG = tuv.GvG();
            if (android.text.TextUtils.isEmpty(strGvG) && tuv.HXG()) {
                strGvG = tuv.hi().WR();
            }
            if (!android.text.TextUtils.isEmpty(strGvG)) {
                java.lang.String[] strArrSplit = strGvG.split("/");
                if (strArrSplit.length >= 3) {
                    this.IL = strArrSplit[2];
                }
            }
            if (tuv.RiO() == null || android.text.TextUtils.isEmpty(tuv.RiO().bX())) {
                return;
            }
            this.bX = tuv.RiO().bX();
        }
    }

    public static void IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null || android.text.TextUtils.isEmpty(tuv.Ny())) {
            return;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(tuv.IGR());
        if (numValueOf.intValue() == 0) {
            return;
        }
        if (bg == null) {
            bg = new java.util.concurrent.ConcurrentHashMap<>();
        }
        com.bytedance.sdk.openadsdk.core.kMt kmt = bg.containsKey(numValueOf) ? bg.get(numValueOf) : null;
        if (kmt == null) {
            kmt = new com.bytedance.sdk.openadsdk.core.kMt();
        }
        java.lang.String strWaE = tuv.waE();
        if (android.text.TextUtils.isEmpty(strWaE) || !strWaE.equals(kmt.bg())) {
            kmt.ldr();
            kmt.bg(tuv);
            bg.put(numValueOf, kmt);
        }
    }

    public static void bX(int i) {
        com.bytedance.sdk.openadsdk.core.kMt kmt;
        if (i == 0) {
            return;
        }
        if (bg == null) {
            bg = new java.util.concurrent.ConcurrentHashMap<>();
        }
        if (!bg.containsKey(java.lang.Integer.valueOf(i)) || (kmt = bg.get(java.lang.Integer.valueOf(i))) == null) {
            return;
        }
        kmt.IL(1);
    }

    public static void bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        com.bytedance.sdk.openadsdk.core.kMt kmt;
        if (tuv == null) {
            return;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(tuv.IGR());
        if (numValueOf.intValue() == 0) {
            return;
        }
        if (bg == null) {
            bg = new java.util.concurrent.ConcurrentHashMap<>();
        }
        if (!bg.containsKey(numValueOf) || (kmt = bg.get(numValueOf)) == null) {
            return;
        }
        kmt.bg(1);
    }
}
