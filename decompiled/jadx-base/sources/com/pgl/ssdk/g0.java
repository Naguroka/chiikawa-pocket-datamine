package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class g0 {
    public static java.lang.String a(java.lang.String str) {
        java.lang.String[] strArrB = b(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (strArrB != null && strArrB.length > 0) {
            for (java.lang.String str2 : strArrB) {
                try {
                    java.lang.Class.forName(str2);
                    arrayList.add(str2);
                } catch (java.lang.ClassNotFoundException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.toString();
    }

    public static java.lang.String[] b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("//");
    }
}
