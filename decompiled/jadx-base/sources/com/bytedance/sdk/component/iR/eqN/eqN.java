package com.bytedance.sdk.component.iR.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    public static void bg(android.content.Context context, int i, java.lang.String str, int i2) {
        try {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            if (i == 1) {
                linkedHashMap.put(bg(i2), str);
            }
            if (com.bytedance.sdk.component.iR.bX.Kg.bg().bg(i2).eqN() != null) {
                com.bytedance.sdk.component.iR.bX.Kg.bg().bg(i2).eqN().bg(context, linkedHashMap);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public static java.lang.String bg(android.content.Context context, int i, int i2) {
        java.lang.String strBg;
        if (i != 1) {
            strBg = "";
        } else {
            try {
                if (com.bytedance.sdk.component.iR.bX.Kg.bg().bg(i2).eqN() != null) {
                    strBg = com.bytedance.sdk.component.iR.bX.Kg.bg().bg(i2).eqN().bg(context, bg(i2), "");
                } else {
                    strBg = "";
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return strBg instanceof java.lang.String ? java.lang.String.valueOf(strBg) : "";
    }

    private static java.lang.String bg(int i) {
        return "tnc_config".concat(java.lang.String.valueOf(i));
    }
}
