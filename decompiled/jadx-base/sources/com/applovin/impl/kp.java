package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class kp implements com.applovin.impl.nl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.gp f966a;
    private final long[] b;
    private final java.util.Map c;
    private final java.util.Map d;
    private final java.util.Map f;

    public kp(com.applovin.impl.gp gpVar, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        this.f966a = gpVar;
        this.d = map2;
        this.f = map3;
        this.c = map != null ? java.util.Collections.unmodifiableMap(map) : java.util.Collections.emptyMap();
        this.b = gpVar.b();
    }

    @Override // com.applovin.impl.nl
    public long a(int i) {
        return this.b[i];
    }

    @Override // com.applovin.impl.nl
    public java.util.List b(long j) {
        return this.f966a.a(j, this.c, this.d, this.f);
    }

    @Override // com.applovin.impl.nl
    public int a() {
        return this.b.length;
    }

    @Override // com.applovin.impl.nl
    public int a(long j) {
        int iA = com.applovin.impl.xp.a(this.b, j, false, false);
        if (iA < this.b.length) {
            return iA;
        }
        return -1;
    }
}
