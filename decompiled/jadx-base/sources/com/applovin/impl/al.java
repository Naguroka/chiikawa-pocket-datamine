package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class al implements com.applovin.impl.nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f626a;
    private final java.util.List b;

    public al(java.util.List list, java.util.List list2) {
        this.f626a = list;
        this.b = list2;
    }

    @Override // com.applovin.impl.nl
    public long a(int i) {
        com.applovin.impl.b1.a(i >= 0);
        com.applovin.impl.b1.a(i < this.b.size());
        return ((java.lang.Long) this.b.get(i)).longValue();
    }

    @Override // com.applovin.impl.nl
    public java.util.List b(long j) {
        int iB = com.applovin.impl.xp.b(this.b, (java.lang.Comparable) java.lang.Long.valueOf(j), true, false);
        if (iB == -1) {
            return java.util.Collections.emptyList();
        }
        return (java.util.List) this.f626a.get(iB);
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.b.size();
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        int iA = com.applovin.impl.xp.a(this.b, (java.lang.Comparable) java.lang.Long.valueOf(j), false, false);
        if (iA < this.b.size()) {
            return iA;
        }
        return -1;
    }
}
