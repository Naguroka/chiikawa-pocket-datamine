package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z1 implements com.applovin.impl.p1 {
    protected com.applovin.impl.p1.a b;
    protected com.applovin.impl.p1.a c;
    private com.applovin.impl.p1.a d;
    private com.applovin.impl.p1.a e;
    private java.nio.ByteBuffer f;
    private java.nio.ByteBuffer g;
    private boolean h;

    protected abstract com.applovin.impl.p1.a b(com.applovin.impl.p1.a aVar);

    protected void g() {
    }

    protected void h() {
    }

    protected void i() {
    }

    public z1() {
        java.nio.ByteBuffer byteBuffer = com.applovin.impl.p1.f1138a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        com.applovin.impl.p1.a aVar = com.applovin.impl.p1.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    @Override // com.applovin.impl.p1
    public final com.applovin.impl.p1.a a(com.applovin.impl.p1.a aVar) {
        this.d = aVar;
        this.e = b(aVar);
        return f() ? this.e : com.applovin.impl.p1.a.e;
    }

    @Override // com.applovin.impl.p1
    public boolean f() {
        return this.e != com.applovin.impl.p1.a.e;
    }

    @Override // com.applovin.impl.p1
    public final void e() {
        this.h = true;
        h();
    }

    @Override // com.applovin.impl.p1
    public java.nio.ByteBuffer d() {
        java.nio.ByteBuffer byteBuffer = this.g;
        this.g = com.applovin.impl.p1.f1138a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.p1
    public boolean c() {
        return this.h && this.g == com.applovin.impl.p1.f1138a;
    }

    @Override // com.applovin.impl.p1
    public final void b() {
        this.g = com.applovin.impl.p1.f1138a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    @Override // com.applovin.impl.p1
    public final void reset() {
        b();
        this.f = com.applovin.impl.p1.f1138a;
        com.applovin.impl.p1.a aVar = com.applovin.impl.p1.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        i();
    }

    protected final boolean a() {
        return this.g.hasRemaining();
    }

    protected final java.nio.ByteBuffer a(int i) {
        if (this.f.capacity() < i) {
            this.f = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        java.nio.ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }
}
