package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1482a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final int f;
    private final boolean g;

    public java.lang.String toString() {
        return "AppAdsTxtEntry(domainName=" + b() + ", publisherId=" + c() + ", relationship=" + e() + ", certificateAuthorityId=" + a() + ", rawValue=" + d() + ", rowNumber=" + f() + ", valid=" + h() + ")";
    }

    protected boolean a(java.lang.Object obj) {
        return obj instanceof com.applovin.impl.x0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.x0)) {
            return false;
        }
        com.applovin.impl.x0 x0Var = (com.applovin.impl.x0) obj;
        if (!x0Var.a(this)) {
            return false;
        }
        java.lang.String strB = b();
        java.lang.String strB2 = x0Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        java.lang.String strC = c();
        java.lang.String strC2 = x0Var.c();
        if (strC != null ? !strC.equals(strC2) : strC2 != null) {
            return false;
        }
        java.lang.String strE = e();
        java.lang.String strE2 = x0Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        java.lang.String strA = a();
        java.lang.String strA2 = x0Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int hashCode() {
        java.lang.String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        java.lang.String strC = c();
        int iHashCode2 = ((iHashCode + 59) * 59) + (strC == null ? 43 : strC.hashCode());
        java.lang.String strE = e();
        int iHashCode3 = (iHashCode2 * 59) + (strE == null ? 43 : strE.hashCode());
        java.lang.String strA = a();
        return (iHashCode3 * 59) + (strA != null ? strA.hashCode() : 43);
    }

    public java.lang.String b() {
        return this.f1482a;
    }

    public java.lang.String c() {
        return this.b;
    }

    public java.lang.String e() {
        return this.c;
    }

    public java.lang.String d() {
        return this.e;
    }

    public java.lang.String a() {
        return this.d;
    }

    public int f() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    public x0(java.lang.String str) {
        this(str, -1);
    }

    public boolean g() {
        return this.f1482a.equals("applovin.com");
    }

    public x0(java.lang.String str, int i) {
        this.e = str;
        this.f = i;
        java.lang.String[] strArrSplit = str.split(",");
        boolean z = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.g = z;
        if (z) {
            this.f1482a = a(strArrSplit[0]);
            this.b = a(strArrSplit[1]);
            this.c = a(strArrSplit[2]);
            this.d = strArrSplit.length == 4 ? a(strArrSplit[3]) : "";
            return;
        }
        this.f1482a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }

    private java.lang.String a(java.lang.String str) {
        return str.replace((char) 173, ' ').trim();
    }
}
