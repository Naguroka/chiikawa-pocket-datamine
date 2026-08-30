package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class sa implements com.applovin.impl.h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.h5 f1244a;
    private final int b;
    private final com.applovin.impl.sa.a c;
    private final byte[] d;
    private int e;

    public interface a {
        void a(com.applovin.impl.ah ahVar);
    }

    @Override // com.applovin.impl.h5
    public void close() {
        throw new java.lang.UnsupportedOperationException();
    }

    public sa(com.applovin.impl.h5 h5Var, int i, com.applovin.impl.sa.a aVar) {
        com.applovin.impl.b1.a(i > 0);
        this.f1244a = h5Var;
        this.b = i;
        this.c = aVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.applovin.impl.h5
    public void a(com.applovin.impl.xo xoVar) {
        com.applovin.impl.b1.a(xoVar);
        this.f1244a.a(xoVar);
    }

    @Override // com.applovin.impl.h5
    public android.net.Uri c() {
        return this.f1244a.c();
    }

    @Override // com.applovin.impl.h5
    public java.util.Map e() {
        return this.f1244a.e();
    }

    private boolean g() {
        if (this.f1244a.a(this.d, 0, 1) == -1) {
            return false;
        }
        int i = (this.d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int iA = this.f1244a.a(bArr, i3, i2);
            if (iA == -1) {
                return false;
            }
            i3 += iA;
            i2 -= iA;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.c.a(new com.applovin.impl.ah(bArr, i));
        }
        return true;
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        if (this.e == 0) {
            if (!g()) {
                return -1;
            }
            this.e = this.b;
        }
        int iA = this.f1244a.a(bArr, i, java.lang.Math.min(this.e, i2));
        if (iA != -1) {
            this.e -= iA;
        }
        return iA;
    }

    @Override // com.applovin.impl.h5
    public long a(com.applovin.impl.k5 k5Var) {
        throw new java.lang.UnsupportedOperationException();
    }
}
