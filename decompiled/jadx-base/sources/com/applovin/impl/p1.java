package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.nio.ByteBuffer f1138a = java.nio.ByteBuffer.allocateDirect(0).order(java.nio.ByteOrder.nativeOrder());

    com.applovin.impl.p1.a a(com.applovin.impl.p1.a aVar);

    void a(java.nio.ByteBuffer byteBuffer);

    void b();

    boolean c();

    java.nio.ByteBuffer d();

    void e();

    boolean f();

    void reset();

    public static final class a {
        public static final com.applovin.impl.p1.a e = new com.applovin.impl.p1.a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1139a;
        public final int b;
        public final int c;
        public final int d;

        public java.lang.String toString() {
            return "AudioFormat[sampleRate=" + this.f1139a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
        }

        public a(int i, int i2, int i3) {
            this.f1139a = i;
            this.b = i2;
            this.c = i3;
            this.d = com.applovin.impl.xp.g(i3) ? com.applovin.impl.xp.b(i3, i2) : -1;
        }
    }

    public static final class b extends java.lang.Exception {
        public b(com.applovin.impl.p1.a aVar) {
            super("Unhandled format: " + aVar);
        }
    }
}
