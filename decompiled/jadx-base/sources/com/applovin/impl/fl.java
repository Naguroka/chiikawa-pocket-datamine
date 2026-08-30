package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class fl implements com.applovin.impl.h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.h5 f790a;
    private long b;
    private android.net.Uri c = android.net.Uri.EMPTY;
    private java.util.Map d = java.util.Collections.emptyMap();

    public fl(com.applovin.impl.h5 h5Var) {
        this.f790a = (com.applovin.impl.h5) com.applovin.impl.b1.a(h5Var);
    }

    public long g() {
        return this.b;
    }

    public android.net.Uri h() {
        return this.c;
    }

    public java.util.Map i() {
        return this.d;
    }

    @Override // com.applovin.impl.h5
    public void a(com.applovin.impl.xo xoVar) {
        com.applovin.impl.b1.a(xoVar);
        this.f790a.a(xoVar);
    }

    @Override // com.applovin.impl.h5
    public android.net.Uri c() {
        return this.f790a.c();
    }

    @Override // com.applovin.impl.h5
    public java.util.Map e() {
        return this.f790a.e();
    }

    @Override // com.applovin.impl.h5
    public void close() {
        this.f790a.close();
    }

    @Override // com.applovin.impl.h5
    public long a(com.applovin.impl.k5 k5Var) {
        this.c = k5Var.f947a;
        this.d = java.util.Collections.emptyMap();
        long jA = this.f790a.a(k5Var);
        this.c = (android.net.Uri) com.applovin.impl.b1.a(c());
        this.d = e();
        return jA;
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        int iA = this.f790a.a(bArr, i, i2);
        if (iA != -1) {
            this.b += (long) iA;
        }
        return iA;
    }
}
