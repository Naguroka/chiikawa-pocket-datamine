package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ve {
    private static final java.util.Set b = new java.util.HashSet();
    public static final com.applovin.impl.ve c = a("ar");
    public static final com.applovin.impl.ve d = a("ttdasi_ms");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f1426a;

    public interface a {
        java.lang.Object a(java.lang.Object obj);
    }

    private ve(java.lang.String str) {
        this.f1426a = str;
    }

    protected boolean a(java.lang.Object obj) {
        return obj instanceof com.applovin.impl.ve;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.ve)) {
            return false;
        }
        com.applovin.impl.ve veVar = (com.applovin.impl.ve) obj;
        if (!veVar.a(this)) {
            return false;
        }
        java.lang.String strA = a();
        java.lang.String strA2 = veVar.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int hashCode() {
        java.lang.String strA = a();
        return (strA == null ? 43 : strA.hashCode()) + 59;
    }

    public java.lang.String a() {
        return this.f1426a;
    }

    private static com.applovin.impl.ve a(java.lang.String str) {
        java.util.Set set = b;
        if (!set.contains(str)) {
            set.add(str);
            return new com.applovin.impl.ve(str);
        }
        throw new java.lang.IllegalArgumentException("Key has already been used: " + str);
    }

    public java.lang.String toString() {
        return this.f1426a;
    }
}
