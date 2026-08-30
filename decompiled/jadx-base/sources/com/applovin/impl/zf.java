package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class zf extends com.applovin.impl.vg implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final com.applovin.impl.zf f1571a = new com.applovin.impl.zf();

    @Override // com.applovin.impl.vg
    public com.applovin.impl.vg c() {
        return com.applovin.impl.xi.f1508a;
    }

    public java.lang.String toString() {
        return "Ordering.natural()";
    }

    @Override // com.applovin.impl.vg, java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(comparable);
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    private zf() {
    }
}
