package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f1504a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    protected xd(com.applovin.impl.xd xdVar) {
        this.f1504a = xdVar.f1504a;
        this.b = xdVar.b;
        this.c = xdVar.c;
        this.d = xdVar.d;
        this.e = xdVar.e;
    }

    public com.applovin.impl.xd a(java.lang.Object obj) {
        return this.f1504a.equals(obj) ? this : new com.applovin.impl.xd(obj, this.b, this.c, this.d, this.e);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.xd)) {
            return false;
        }
        com.applovin.impl.xd xdVar = (com.applovin.impl.xd) obj;
        return this.f1504a.equals(xdVar.f1504a) && this.b == xdVar.b && this.c == xdVar.c && this.d == xdVar.d && this.e == xdVar.e;
    }

    public int hashCode() {
        return ((((((((this.f1504a.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public xd(java.lang.Object obj) {
        this(obj, -1L);
    }

    public xd(java.lang.Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public boolean a() {
        return this.b != -1;
    }

    private xd(java.lang.Object obj, int i, int i2, long j, int i3) {
        this.f1504a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public xd(java.lang.Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public xd(java.lang.Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
