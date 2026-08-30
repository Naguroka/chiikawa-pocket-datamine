package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fg {
    public static java.lang.Object[] b(java.lang.Object[] objArr, int i) {
        return com.applovin.impl.mh.a(objArr, i);
    }

    static java.lang.Object a(java.lang.Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("at index " + i);
    }

    static java.lang.Object[] a(java.lang.Object... objArr) {
        return a(objArr, objArr.length);
    }

    static java.lang.Object[] a(java.lang.Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }
}
