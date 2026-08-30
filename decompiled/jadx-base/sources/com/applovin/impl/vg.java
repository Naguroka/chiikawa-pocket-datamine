package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vg implements java.util.Comparator {
    protected vg() {
    }

    public com.applovin.impl.vg c() {
        return new com.applovin.impl.yi(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(java.lang.Object obj, java.lang.Object obj2);

    public static com.applovin.impl.vg a(java.util.Comparator comparator) {
        if (comparator instanceof com.applovin.impl.vg) {
            return (com.applovin.impl.vg) comparator;
        }
        return new com.applovin.impl.x3(comparator);
    }

    com.applovin.impl.vg b() {
        return a(com.applovin.impl.uc.a());
    }

    public com.applovin.impl.db a(java.lang.Iterable iterable) {
        return com.applovin.impl.db.a((java.util.Comparator) this, iterable);
    }

    public static com.applovin.impl.vg a() {
        return com.applovin.impl.zf.f1571a;
    }

    public com.applovin.impl.vg a(com.applovin.exoplayer2.common.base.Function function) {
        return new com.applovin.impl.r2(function, this);
    }
}
