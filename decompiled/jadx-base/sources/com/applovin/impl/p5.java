package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1140a;
    public final com.applovin.impl.e9 b;
    public final com.applovin.impl.e9 c;
    public final int d;
    public final int e;

    public p5(java.lang.String str, com.applovin.impl.e9 e9Var, com.applovin.impl.e9 e9Var2, int i, int i2) {
        com.applovin.impl.b1.a(i == 0 || i2 == 0);
        this.f1140a = com.applovin.impl.b1.a(str);
        this.b = (com.applovin.impl.e9) com.applovin.impl.b1.a(e9Var);
        this.c = (com.applovin.impl.e9) com.applovin.impl.b1.a(e9Var2);
        this.d = i;
        this.e = i2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.p5.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.p5 p5Var = (com.applovin.impl.p5) obj;
        return this.d == p5Var.d && this.e == p5Var.e && this.f1140a.equals(p5Var.f1140a) && this.b.equals(p5Var.b) && this.c.equals(p5Var.c);
    }

    public int hashCode() {
        return ((((((((this.d + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.e) * 31) + this.f1140a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
