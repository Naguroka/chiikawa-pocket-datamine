package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface gd {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.jd f819a;
        public final android.media.MediaFormat b;
        public final com.applovin.impl.e9 c;
        public final android.view.Surface d;
        public final android.media.MediaCrypto e;
        public final int f;
        public final boolean g;

        public static com.applovin.impl.gd.a a(com.applovin.impl.jd jdVar, android.media.MediaFormat mediaFormat, com.applovin.impl.e9 e9Var, android.media.MediaCrypto mediaCrypto) {
            return new com.applovin.impl.gd.a(jdVar, mediaFormat, e9Var, null, mediaCrypto, 0, false);
        }

        public static com.applovin.impl.gd.a a(com.applovin.impl.jd jdVar, android.media.MediaFormat mediaFormat, com.applovin.impl.e9 e9Var, android.view.Surface surface, android.media.MediaCrypto mediaCrypto) {
            return new com.applovin.impl.gd.a(jdVar, mediaFormat, e9Var, surface, mediaCrypto, 0, false);
        }

        private a(com.applovin.impl.jd jdVar, android.media.MediaFormat mediaFormat, com.applovin.impl.e9 e9Var, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i, boolean z) {
            this.f819a = jdVar;
            this.b = mediaFormat;
            this.c = e9Var;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = i;
            this.g = z;
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.applovin.impl.gd.b f820a = new com.applovin.impl.ul.c();

        com.applovin.impl.gd a(com.applovin.impl.gd.a aVar);
    }

    public interface c {
        void a(com.applovin.impl.gd gdVar, long j, long j2);
    }

    int a(android.media.MediaCodec.BufferInfo bufferInfo);

    java.nio.ByteBuffer a(int i);

    void a();

    void a(int i, int i2, int i3, long j, int i4);

    void a(int i, int i2, com.applovin.impl.z4 z4Var, long j, int i3);

    void a(int i, long j);

    void a(int i, boolean z);

    void a(android.os.Bundle bundle);

    void a(android.view.Surface surface);

    void a(com.applovin.impl.gd.c cVar, android.os.Handler handler);

    java.nio.ByteBuffer b(int i);

    void b();

    void c(int i);

    boolean c();

    int d();

    android.media.MediaFormat e();
}
