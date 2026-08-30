package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class mp implements com.applovin.impl.nl {
    public static final com.applovin.impl.mp b = new com.applovin.impl.mp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f1076a;

    @Override // com.applovin.impl.nl
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    private mp() {
        this.f1076a = java.util.Collections.emptyList();
    }

    @Override // com.applovin.impl.nl
    public long a(int i) {
        com.applovin.impl.b1.a(i == 0);
        return 0L;
    }

    @Override // com.applovin.impl.nl
    public java.util.List b(long j) {
        return j >= 0 ? this.f1076a : java.util.Collections.emptyList();
    }

    public mp(com.applovin.impl.a5 a5Var) {
        this.f1076a = java.util.Collections.singletonList(a5Var);
    }
}
