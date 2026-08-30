package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class mh {
    static java.lang.Object[] a(java.lang.Object[] objArr, int i, int i2, java.lang.Object[] objArr2) {
        return java.util.Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    static java.lang.Object[] a(java.lang.Object[] objArr, int i) {
        return (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    static java.util.Map a() {
        return com.applovin.impl.w3.a();
    }
}
