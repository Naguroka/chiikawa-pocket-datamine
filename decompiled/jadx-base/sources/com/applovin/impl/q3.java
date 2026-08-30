package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q3 {
    static java.lang.StringBuilder a(int i) {
        com.applovin.impl.p3.a(i, "size");
        return new java.lang.StringBuilder((int) java.lang.Math.min(((long) i) * 8, 1073741824L));
    }

    static boolean a(java.util.Collection collection, java.lang.Object obj) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }
}
