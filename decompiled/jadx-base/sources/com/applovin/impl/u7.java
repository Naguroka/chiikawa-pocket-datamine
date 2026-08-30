package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class u7 {
    private final java.lang.String b;
    private final java.util.Map c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1387a = java.util.UUID.randomUUID().toString();
    private final long d = java.lang.System.currentTimeMillis();

    public java.lang.String toString() {
        return "Event{name='" + this.b + "', id='" + this.f1387a + "', creationTimestampMillis=" + this.d + ", parameters=" + this.c + '}';
    }

    public java.lang.String b() {
        return this.f1387a;
    }

    public java.lang.String c() {
        return this.b;
    }

    public java.util.Map d() {
        return this.c;
    }

    public long a() {
        return this.d;
    }

    public u7(java.lang.String str, java.util.Map map) {
        this.b = str;
        this.c = map;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.applovin.impl.u7 u7Var = (com.applovin.impl.u7) obj;
        if (this.d == u7Var.d && java.util.Objects.equals(this.b, u7Var.b) && java.util.Objects.equals(this.c, u7Var.c)) {
            return java.util.Objects.equals(this.f1387a, u7Var.f1387a);
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        java.util.Map map = this.c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        java.lang.String str2 = this.f1387a;
        return i + (str2 != null ? str2.hashCode() : 0);
    }
}
