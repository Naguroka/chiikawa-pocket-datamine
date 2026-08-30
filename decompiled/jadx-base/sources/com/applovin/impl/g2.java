package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class g2 extends com.applovin.impl.o5 {
    private long j;
    private int k;
    private int l;

    public g2() {
        super(2);
        this.l = 32;
    }

    public void i(int i) {
        com.applovin.impl.b1.a(i > 0);
        this.l = i;
    }

    public long j() {
        return this.f;
    }

    public long k() {
        return this.j;
    }

    public int l() {
        return this.k;
    }

    public boolean m() {
        return this.k > 0;
    }

    public boolean a(com.applovin.impl.o5 o5Var) {
        com.applovin.impl.b1.a(!o5Var.h());
        com.applovin.impl.b1.a(!o5Var.c());
        com.applovin.impl.b1.a(!o5Var.e());
        if (!b(o5Var)) {
            return false;
        }
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.f = o5Var.f;
            if (o5Var.f()) {
                e(1);
            }
        }
        if (o5Var.d()) {
            e(Integer.MIN_VALUE);
        }
        java.nio.ByteBuffer byteBuffer = o5Var.c;
        if (byteBuffer != null) {
            g(byteBuffer.remaining());
            this.c.put(byteBuffer);
        }
        this.j = o5Var.f;
        return true;
    }

    private boolean b(com.applovin.impl.o5 o5Var) {
        java.nio.ByteBuffer byteBuffer;
        if (!m()) {
            return true;
        }
        if (this.k >= this.l || o5Var.d() != d()) {
            return false;
        }
        java.nio.ByteBuffer byteBuffer2 = o5Var.c;
        return byteBuffer2 == null || (byteBuffer = this.c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    @Override // com.applovin.impl.o5, com.applovin.impl.l2
    public void b() {
        super.b();
        this.k = 0;
    }
}
