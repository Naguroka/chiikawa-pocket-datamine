package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b1 {
    public static void a(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void a(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static int a(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return i;
    }

    public static void b(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    public static java.lang.Object b(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.IllegalStateException();
    }

    public static java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        return str;
    }

    public static java.lang.Object a(java.lang.Object obj) {
        obj.getClass();
        return obj;
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj2));
    }
}
