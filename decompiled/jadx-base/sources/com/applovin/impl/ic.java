package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ic implements java.lang.Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f884a;
    private final java.lang.String b;
    private final boolean c;
    private final com.applovin.impl.je d;

    ic(java.lang.String str, java.lang.String str2, boolean z, com.applovin.impl.je jeVar) {
        this.f884a = str;
        this.b = str2;
        this.c = z;
        this.d = jeVar;
    }

    public java.lang.String c() {
        return this.f884a;
    }

    public java.util.List b() {
        java.util.List listL = this.d.l();
        return (listL == null || listL.isEmpty()) ? java.util.Collections.singletonList(this.f884a) : listL;
    }

    public com.applovin.impl.je d() {
        return this.d;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.applovin.impl.ic icVar) {
        return this.b.compareToIgnoreCase(icVar.b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.applovin.impl.ic icVar = (com.applovin.impl.ic) obj;
        java.lang.String str = this.f884a;
        if (str == null ? icVar.f884a != null : !str.equals(icVar.f884a)) {
            return false;
        }
        java.lang.String str2 = this.b;
        if (str2 == null ? icVar.b == null : str2.equals(icVar.b)) {
            return this.c == icVar.c;
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.f884a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.c ? 1 : 0);
    }

    public java.lang.String a() {
        return this.b;
    }
}
