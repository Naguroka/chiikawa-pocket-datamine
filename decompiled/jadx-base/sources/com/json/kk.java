package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class kk {
    public static java.util.Map<java.lang.String, java.lang.Object> a(java.lang.Object[][] objArr) {
        java.util.HashMap map = new java.util.HashMap();
        if (objArr != null) {
            try {
                for (java.lang.Object[] objArr2 : objArr) {
                    map.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
            }
        }
        return map;
    }
}
