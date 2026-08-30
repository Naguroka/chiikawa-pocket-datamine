package com.five_corp.ad.internal.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1835a;
    public final java.lang.String b;
    public final boolean c;
    public final int d;
    public final int e;

    public w(java.lang.String str, java.lang.String str2, int i, int i2) {
        this.f1835a = str;
        this.b = str2;
        this.c = str2 != null;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.five_corp.ad.internal.ad.w)) {
            return false;
        }
        com.five_corp.ad.internal.ad.w wVar = (com.five_corp.ad.internal.ad.w) obj;
        return this.f1835a.equals(wVar.f1835a) && java.util.Objects.equals(this.b, wVar.b) && this.c == wVar.c && this.d == wVar.d && this.e == wVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f1835a.hashCode() + 31) * 31;
        java.lang.String str = this.b;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c ? 1 : 0)) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        return "Resource{, url='" + this.f1835a + "', isPermanent=" + this.c + ", width=" + this.d + ", height=" + this.e + '}';
    }
}
