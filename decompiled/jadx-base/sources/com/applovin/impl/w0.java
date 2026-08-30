package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f1444a;
    private final java.util.List b;

    public java.lang.String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public w0(java.util.Map map, java.util.List list) {
        this.f1444a = map;
        this.b = list;
    }

    protected boolean a(java.lang.Object obj) {
        return obj instanceof com.applovin.impl.w0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.w0)) {
            return false;
        }
        com.applovin.impl.w0 w0Var = (com.applovin.impl.w0) obj;
        if (!w0Var.a(this)) {
            return false;
        }
        java.util.Map mapA = a();
        java.util.Map mapA2 = w0Var.a();
        if (mapA != null ? !mapA.equals(mapA2) : mapA2 != null) {
            return false;
        }
        java.util.List listB = b();
        java.util.List listB2 = w0Var.b();
        return listB != null ? listB.equals(listB2) : listB2 == null;
    }

    public int hashCode() {
        java.util.Map mapA = a();
        int iHashCode = mapA == null ? 43 : mapA.hashCode();
        java.util.List listB = b();
        return ((iHashCode + 59) * 59) + (listB != null ? listB.hashCode() : 43);
    }

    public java.util.List b() {
        return this.b;
    }

    public java.util.Map a() {
        return this.f1444a;
    }
}
