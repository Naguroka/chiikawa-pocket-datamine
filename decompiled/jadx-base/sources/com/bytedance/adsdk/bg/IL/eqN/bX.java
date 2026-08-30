package com.bytedance.adsdk.bg.IL.eqN;

/* JADX INFO: loaded from: classes3.dex */
public enum bX implements com.bytedance.adsdk.bg.IL.eqN.zx {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES, 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private static final java.util.Map<java.lang.String, com.bytedance.adsdk.bg.IL.eqN.bX> vb = new java.util.HashMap(128);
    private static final java.util.Set<com.bytedance.adsdk.bg.IL.eqN.bX> xxp = new java.util.HashSet();
    private final java.lang.String VzQ;
    private final int tuV;

    static {
        for (com.bytedance.adsdk.bg.IL.eqN.bX bXVar : values()) {
            vb.put(bXVar.bg(), bXVar);
            xxp.add(bXVar);
        }
    }

    bX(java.lang.String str, int i) {
        this.VzQ = str;
        this.tuV = i;
    }

    public static com.bytedance.adsdk.bg.IL.eqN.bX bg(java.lang.String str) {
        return vb.get(str);
    }

    public static boolean bg(com.bytedance.adsdk.bg.IL.eqN.zx zxVar) {
        return zxVar instanceof com.bytedance.adsdk.bg.IL.eqN.bX;
    }

    public java.lang.String bg() {
        return this.VzQ;
    }

    public int IL() {
        return this.tuV;
    }
}
