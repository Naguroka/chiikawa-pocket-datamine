package com.five_corp.ad.internal.ad.beacon;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1791a;
    public final int b;
    public final long c;
    public final com.five_corp.ad.internal.ad.beacon.j d;

    public a(int i, int i2, long j, com.five_corp.ad.internal.ad.beacon.j jVar) {
        this.f1791a = i;
        this.b = i2;
        this.c = j;
        this.d = jVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.five_corp.ad.internal.ad.beacon.a)) {
            return false;
        }
        com.five_corp.ad.internal.ad.beacon.a aVar = (com.five_corp.ad.internal.ad.beacon.a) obj;
        return this.f1791a == aVar.f1791a && this.b == aVar.b && this.c == aVar.c && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((com.five_corp.ad.internal.ad.beacon.h.a(this.b) + ((com.five_corp.ad.internal.ad.beacon.c.a(this.f1791a) + 2969) * 2969)) * 2969) + ((int) this.c)) * 2969);
    }
}
