package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f1239a;
    private long b;
    private boolean c;

    s2() {
    }

    private long a(long j) {
        return this.f1239a + java.lang.Math.max(0L, ((this.b - 529) * 1000000) / j);
    }

    public long a(com.applovin.impl.e9 e9Var) {
        return a(e9Var.A);
    }

    public void a() {
        this.f1239a = 0L;
        this.b = 0L;
        this.c = false;
    }

    public long a(com.applovin.impl.e9 e9Var, com.applovin.impl.o5 o5Var) {
        if (this.b == 0) {
            this.f1239a = o5Var.f;
        }
        if (this.c) {
            return o5Var.f;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.applovin.impl.b1.a(o5Var.c);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int iD = com.applovin.impl.sf.d(i);
        if (iD == -1) {
            this.c = true;
            this.b = 0L;
            this.f1239a = o5Var.f;
            com.applovin.impl.oc.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return o5Var.f;
        }
        long jA = a(e9Var.A);
        this.b += (long) iD;
        return jA;
    }
}
