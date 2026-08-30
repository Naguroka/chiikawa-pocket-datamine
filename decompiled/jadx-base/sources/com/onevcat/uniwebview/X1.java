package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class X1 {
    public static com.onevcat.uniwebview.Y1 a(java.lang.String str, int i, java.lang.String str2) {
        java.util.HashMap map;
        if (str != null) {
            map = new java.util.HashMap();
            map.put("failingURL", str);
        } else {
            map = null;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(i);
        if (str2 == null) {
            str2 = "";
        }
        return new com.onevcat.uniwebview.Y1("", strValueOf, str2, map);
    }
}
