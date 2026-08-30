package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class qf implements com.applovin.impl.nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f1190a;

    @Override // com.applovin.impl.nl
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public qf(java.util.List list) {
        this.f1190a = java.util.Collections.unmodifiableList(list);
    }

    @Override // com.applovin.impl.nl
    public long a(int i) {
        com.applovin.impl.b1.a(i == 0);
        return 0L;
    }

    @Override // com.applovin.impl.nl
    public java.util.List b(long j) {
        return j >= 0 ? this.f1190a : java.util.Collections.emptyList();
    }
}
