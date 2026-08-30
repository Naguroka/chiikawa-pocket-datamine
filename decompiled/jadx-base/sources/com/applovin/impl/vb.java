package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vb {
    public static java.lang.String d(java.lang.Iterable iterable) {
        return com.applovin.impl.wb.d(iterable.iterator());
    }

    static java.lang.Object[] c(java.lang.Iterable iterable) {
        return a(iterable).toArray();
    }

    private static java.util.Collection a(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            return (java.util.Collection) iterable;
        }
        return com.applovin.impl.hc.a(iterable.iterator());
    }

    public static java.lang.Object b(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (!list.isEmpty()) {
                return a(list);
            }
            throw new java.util.NoSuchElementException();
        }
        return com.applovin.impl.wb.b(iterable.iterator());
    }

    public static java.lang.Object a(java.lang.Iterable iterable, java.lang.Object obj) {
        return com.applovin.impl.wb.a(iterable.iterator(), obj);
    }

    private static java.lang.Object a(java.util.List list) {
        return list.get(list.size() - 1);
    }
}
