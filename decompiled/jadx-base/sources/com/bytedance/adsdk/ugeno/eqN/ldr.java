package com.bytedance.adsdk.ugeno.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class ldr {
    private static java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.eqN.bX> bg = new java.util.HashMap();

    public static void bg(java.util.List<com.bytedance.adsdk.ugeno.eqN.bX> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.eqN.bX bXVar : list) {
            if (bXVar != null) {
                bg.put(bXVar.bg(), bXVar);
            }
        }
    }

    public static com.bytedance.adsdk.ugeno.eqN.bX bg(java.lang.String str) {
        return bg.get(str);
    }
}
