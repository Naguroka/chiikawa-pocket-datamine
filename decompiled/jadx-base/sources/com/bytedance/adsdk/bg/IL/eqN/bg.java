package com.bytedance.adsdk.bg.IL.eqN;

/* JADX INFO: loaded from: classes3.dex */
public enum bg implements com.bytedance.adsdk.bg.IL.eqN.zx {
    TRUE,
    FALSE,
    NULL;

    private static final java.util.Map<java.lang.String, com.bytedance.adsdk.bg.IL.eqN.bg> eqN = new java.util.HashMap(128);

    static {
        for (com.bytedance.adsdk.bg.IL.eqN.bg bgVar : values()) {
            eqN.put(bgVar.name().toLowerCase(), bgVar);
        }
    }

    public static com.bytedance.adsdk.bg.IL.eqN.bg bg(java.lang.String str) {
        return eqN.get(str.toLowerCase());
    }
}
