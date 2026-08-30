package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public final class StringPool {
    private static final java.lang.String[] EMPTY_ARRAY = new java.lang.String[0];
    private final java.util.Map<java.lang.String, java.lang.String> pool = new java.util.HashMap(1024);

    public java.lang.String get(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String str2 = this.pool.get(str);
        if (str2 != null) {
            return str2;
        }
        this.pool.put(str, str);
        return str;
    }

    public java.lang.String[] get(java.lang.String[] strArr) {
        if (strArr == null) {
            return null;
        }
        if (strArr.length == 0) {
            return EMPTY_ARRAY;
        }
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = get(strArr[i]);
        }
        return strArr;
    }
}
