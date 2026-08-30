package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ok implements com.applovin.impl.p1 {
    private int b;
    private float c = 1.0f;
    private float d = 1.0f;
    private com.applovin.impl.p1.a e;
    private com.applovin.impl.p1.a f;
    private com.applovin.impl.p1.a g;
    private com.applovin.impl.p1.a h;
    private boolean i;
    private com.applovin.impl.nk j;
    private java.nio.ByteBuffer k;
    private java.nio.ShortBuffer l;
    private java.nio.ByteBuffer m;
    private long n;
    private long o;
    private boolean p;

    public ok() {
        com.applovin.impl.p1.a aVar = com.applovin.impl.p1.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        java.nio.ByteBuffer byteBuffer = com.applovin.impl.p1.f1138a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // com.applovin.impl.p1
    public com.applovin.impl.p1.a a(com.applovin.impl.p1.a aVar) throws com.applovin.impl.p1.b {
        if (aVar.c == 2) {
            int i = this.b;
            if (i == -1) {
                i = aVar.f1139a;
            }
            this.e = aVar;
            com.applovin.impl.p1.a aVar2 = new com.applovin.impl.p1.a(i, aVar.b, 2);
            this.f = aVar2;
            this.i = true;
            return aVar2;
        }
        throw new com.applovin.impl.p1.b(aVar);
    }

    @Override // com.applovin.impl.p1
    public boolean f() {
        return this.f.f1139a != -1 && (java.lang.Math.abs(this.c - 1.0f) >= 1.0E-4f || java.lang.Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.f1139a != this.e.f1139a);
    }

    @Override // com.applovin.impl.p1
    public void e() {
        com.applovin.impl.nk nkVar = this.j;
        if (nkVar != null) {
            nkVar.e();
        }
        this.p = true;
    }

    @Override // com.applovin.impl.p1
    public java.nio.ByteBuffer d() {
        int iB;
        com.applovin.impl.nk nkVar = this.j;
        if (nkVar != null && (iB = nkVar.b()) > 0) {
            if (this.k.capacity() < iB) {
                java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(iB).order(java.nio.ByteOrder.nativeOrder());
                this.k = byteBufferOrder;
                this.l = byteBufferOrder.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            nkVar.a(this.l);
            this.o += (long) iB;
            this.k.limit(iB);
            this.m = this.k;
        }
        java.nio.ByteBuffer byteBuffer = this.m;
        this.m = com.applovin.impl.p1.f1138a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.p1
    public boolean c() {
        com.applovin.impl.nk nkVar;
        return this.p && ((nkVar = this.j) == null || nkVar.b() == 0);
    }

    @Override // com.applovin.impl.p1
    public void b() {
        if (f()) {
            com.applovin.impl.p1.a aVar = this.e;
            this.g = aVar;
            com.applovin.impl.p1.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new com.applovin.impl.nk(aVar.f1139a, aVar.b, this.c, this.d, aVar2.f1139a);
            } else {
                com.applovin.impl.nk nkVar = this.j;
                if (nkVar != null) {
                    nkVar.a();
                }
            }
        }
        this.m = com.applovin.impl.p1.f1138a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.applovin.impl.p1
    public void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        com.applovin.impl.p1.a aVar = com.applovin.impl.p1.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        java.nio.ByteBuffer byteBuffer = com.applovin.impl.p1.f1138a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    public long a(long j) {
        if (this.o >= 1024) {
            long jC = this.n - ((long) ((com.applovin.impl.nk) com.applovin.impl.b1.a(this.j)).c());
            int i = this.h.f1139a;
            int i2 = this.g.f1139a;
            if (i == i2) {
                return com.applovin.impl.xp.c(j, jC, this.o);
            }
            return com.applovin.impl.xp.c(j, jC * ((long) i), this.o * ((long) i2));
        }
        return (long) (((double) this.c) * j);
    }

    public void b(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    @Override // com.applovin.impl.p1
    public void a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            com.applovin.impl.nk nkVar = (com.applovin.impl.nk) com.applovin.impl.b1.a(this.j);
            java.nio.ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += (long) iRemaining;
            nkVar.b(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    public void a(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }
}
