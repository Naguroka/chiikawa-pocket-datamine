package com.bytedance.adsdk.ugeno.core;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    private static java.util.Map<java.lang.String, com.bytedance.adsdk.ugeno.core.IL> bg = new java.util.HashMap();

    public static void bg(java.util.List<com.bytedance.adsdk.ugeno.core.IL> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.core.IL il : list) {
            if (il != null) {
                bg.put(il.bg(), il);
            }
        }
    }

    public static com.bytedance.adsdk.ugeno.core.IL bg(java.lang.String str) {
        return bg.get(str);
    }
}
