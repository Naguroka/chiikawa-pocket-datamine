package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class o5 extends com.applovin.impl.l2 {
    public final com.applovin.impl.z4 b;
    public java.nio.ByteBuffer c;
    public boolean d;
    public long f;
    public java.nio.ByteBuffer g;
    private final int h;
    private final int i;

    public static com.applovin.impl.o5 i() {
        return new com.applovin.impl.o5(0);
    }

    public static final class a extends java.lang.IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1111a;
        public final int b;

        public a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.f1111a = i;
            this.b = i2;
        }
    }

    public o5(int i) {
        this(i, 0);
    }

    public void g(int i) {
        int i2 = i + this.i;
        java.nio.ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = f(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.c = byteBuffer;
            return;
        }
        java.nio.ByteBuffer byteBufferF = f(i3);
        byteBufferF.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferF.put(byteBuffer);
        }
        this.c = byteBufferF;
    }

    public final boolean h() {
        return d(1073741824);
    }

    @Override // com.applovin.impl.l2
    public void b() {
        super.b();
        java.nio.ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        java.nio.ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    private java.nio.ByteBuffer f(int i) {
        int i2 = this.h;
        if (i2 == 1) {
            return java.nio.ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return java.nio.ByteBuffer.allocateDirect(i);
        }
        java.nio.ByteBuffer byteBuffer = this.c;
        throw new com.applovin.impl.o5.a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public o5(int i, int i2) {
        this.b = new com.applovin.impl.z4();
        this.h = i;
        this.i = i2;
    }

    public void h(int i) {
        java.nio.ByteBuffer byteBuffer = this.g;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            this.g.clear();
        } else {
            this.g = java.nio.ByteBuffer.allocate(i);
        }
    }

    public final void g() {
        java.nio.ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        java.nio.ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
