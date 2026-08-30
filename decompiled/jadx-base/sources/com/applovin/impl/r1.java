package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface r1 {

    public interface c {
        void a();

        void a(int i, long j, long j2);

        void a(long j);

        void a(java.lang.Exception exc);

        void a(boolean z);

        void b();

        void b(long j);
    }

    long a(boolean z);

    com.applovin.impl.ph a();

    void a(float f);

    void a(int i);

    void a(com.applovin.impl.e9 e9Var, int i, int[] iArr);

    void a(com.applovin.impl.l1 l1Var);

    void a(com.applovin.impl.ph phVar);

    void a(com.applovin.impl.r1.c cVar);

    void a(com.applovin.impl.v1 v1Var);

    boolean a(com.applovin.impl.e9 e9Var);

    boolean a(java.nio.ByteBuffer byteBuffer, long j, int i);

    int b(com.applovin.impl.e9 e9Var);

    void b();

    void b(boolean z);

    boolean c();

    void d();

    void e();

    void f();

    boolean g();

    void h();

    void i();

    void j();

    void pause();

    void reset();

    public static final class a extends java.lang.Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.e9 f1206a;

        public a(java.lang.String str, com.applovin.impl.e9 e9Var) {
            super(str);
            this.f1206a = e9Var;
        }

        public a(java.lang.Throwable th, com.applovin.impl.e9 e9Var) {
            super(th);
            this.f1206a = e9Var;
        }
    }

    public static final class b extends java.lang.Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1207a;
        public final boolean b;
        public final com.applovin.impl.e9 c;

        public b(int i, int i2, int i3, int i4, com.applovin.impl.e9 e9Var, boolean z, java.lang.Exception exc) {
            super("AudioTrack init failed " + i + " Config(" + i2 + ", " + i3 + ", " + i4 + ")" + (z ? " (recoverable)" : ""), exc);
            this.f1207a = i;
            this.b = z;
            this.c = e9Var;
        }
    }

    public static final class e extends java.lang.Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1209a;
        public final boolean b;
        public final com.applovin.impl.e9 c;

        public e(int i, com.applovin.impl.e9 e9Var, boolean z) {
            super("AudioTrack write failed: " + i);
            this.b = z;
            this.f1209a = i;
            this.c = e9Var;
        }
    }

    public static final class d extends java.lang.Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1208a;
        public final long b;

        public d(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.f1208a = j;
            this.b = j2;
        }
    }
}
