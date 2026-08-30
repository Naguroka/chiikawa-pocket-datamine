package com.bytedance.adsdk.bg.IL.eqN;

/* JADX INFO: loaded from: classes3.dex */
public enum eqN implements com.bytedance.adsdk.bg.IL.eqN.zx {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET(com.ironsource.y8.i.d),
    RIGHT_BRACKET(com.ironsource.y8.i.e),
    COMMA(",");

    private static final java.util.Map<java.lang.String, com.bytedance.adsdk.bg.IL.eqN.eqN> ldr;
    private final java.lang.String iR;

    static {
        java.util.HashMap map = new java.util.HashMap(128);
        ldr = map;
        for (com.bytedance.adsdk.bg.IL.eqN.eqN eqn : map.values()) {
            ldr.put(eqn.bg(), eqn);
        }
    }

    eqN(java.lang.String str) {
        this.iR = str;
    }

    public static boolean bg(com.bytedance.adsdk.bg.IL.eqN.zx zxVar) {
        return zxVar instanceof com.bytedance.adsdk.bg.IL.eqN.eqN;
    }

    public java.lang.String bg() {
        return this.iR;
    }
}
