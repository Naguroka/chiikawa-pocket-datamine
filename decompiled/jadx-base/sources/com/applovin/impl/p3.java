package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class p3 {
    static void a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 == null) {
            throw new java.lang.NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    static int a(int i, java.lang.String str) {
        if (i >= 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    static void a(boolean z) {
        com.applovin.exoplayer2.common.base.Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }
}
