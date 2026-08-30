package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class kj {
    public static final com.applovin.impl.kj c = new com.applovin.impl.kj(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f963a;
    public final long b;

    public java.lang.String toString() {
        return "[timeUs=" + this.f963a + ", position=" + this.b + com.ironsource.y8.i.e;
    }

    public kj(long j, long j2) {
        this.f963a = j;
        this.b = j2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.kj.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.kj kjVar = (com.applovin.impl.kj) obj;
        return this.f963a == kjVar.f963a && this.b == kjVar.b;
    }

    public int hashCode() {
        return (((int) this.f963a) * 31) + ((int) this.b);
    }
}
