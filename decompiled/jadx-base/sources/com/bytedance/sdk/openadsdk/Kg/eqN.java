package com.bytedance.sdk.openadsdk.Kg;

/* JADX INFO: loaded from: classes4.dex */
public final class eqN extends com.bytedance.sdk.openadsdk.Kg.bg {
    public static com.bytedance.sdk.openadsdk.Kg.bX bg;

    public static java.lang.String bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.lang.String str) {
        com.bytedance.sdk.openadsdk.Kg.bX bXVarBg;
        java.util.Map map;
        if (!com.bytedance.sdk.openadsdk.utils.VW.bX() || (bXVarBg = com.bytedance.sdk.openadsdk.Kg.IL.bg("net")) == null || (map = (java.util.Map) bXVarBg.bg(1, str)) == null) {
            return str;
        }
        java.lang.String str2 = (java.lang.String) map.get("url");
        if (!android.text.TextUtils.isEmpty(str2)) {
            str = str2;
        }
        java.util.Map map2 = (java.util.Map) map.get("header");
        if (map2 != null) {
            for (java.lang.String str3 : map2.keySet()) {
                bXVar.IL(str3, (java.lang.String) map2.get(str3));
            }
        }
        return str;
    }
}
