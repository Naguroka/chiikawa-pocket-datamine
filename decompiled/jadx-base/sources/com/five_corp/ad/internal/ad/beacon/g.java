package com.five_corp.ad.internal.ad.beacon;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1795a;
    public final java.lang.String b;

    public g(java.lang.String str, java.lang.String str2) {
        this.f1795a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.five_corp.ad.internal.ad.beacon.g)) {
            return false;
        }
        com.five_corp.ad.internal.ad.beacon.g gVar = (com.five_corp.ad.internal.ad.beacon.g) obj;
        return this.f1795a.equals(gVar.f1795a) && this.b.equals(gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1795a.hashCode() * 31);
    }
}
