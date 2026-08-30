package com.five_corp.ad.internal.ad.beacon;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public static final com.five_corp.ad.internal.ad.beacon.j d = new com.five_corp.ad.internal.ad.beacon.j(1, 0.5d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1796a;
    public final double b;
    public final int c;

    public j(int i, double d2) {
        this.f1796a = i;
        this.b = d2;
        this.c = (int) (d2 * 1000000.0d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.five_corp.ad.internal.ad.beacon.j)) {
            return false;
        }
        com.five_corp.ad.internal.ad.beacon.j jVar = (com.five_corp.ad.internal.ad.beacon.j) obj;
        return this.f1796a == jVar.f1796a && this.c == jVar.c;
    }

    public final int hashCode() {
        return ((com.five_corp.ad.internal.ad.beacon.i.a(this.f1796a) + 2969) * 2969) + this.c;
    }
}
