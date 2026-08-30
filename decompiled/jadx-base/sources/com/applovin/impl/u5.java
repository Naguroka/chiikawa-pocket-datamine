package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class u5 implements com.applovin.impl.h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f1385a;
    private final java.util.List b = new java.util.ArrayList();
    private final com.applovin.impl.h5 c;
    private com.applovin.impl.h5 d;
    private com.applovin.impl.h5 e;
    private com.applovin.impl.h5 f;
    private com.applovin.impl.h5 g;
    private com.applovin.impl.h5 h;
    private com.applovin.impl.h5 i;
    private com.applovin.impl.h5 j;
    private com.applovin.impl.h5 k;

    public static final class a implements com.applovin.impl.h5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.content.Context f1386a;
        private final com.applovin.impl.h5.a b;
        private com.applovin.impl.xo c;

        public a(android.content.Context context) {
            this(context, new com.applovin.impl.c6.b());
        }

        @Override // com.applovin.impl.h5.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.u5 a() {
            com.applovin.impl.u5 u5Var = new com.applovin.impl.u5(this.f1386a, this.b.a());
            com.applovin.impl.xo xoVar = this.c;
            if (xoVar != null) {
                u5Var.a(xoVar);
            }
            return u5Var;
        }

        public a(android.content.Context context, com.applovin.impl.h5.a aVar) {
            this.f1386a = context.getApplicationContext();
            this.b = aVar;
        }
    }

    public u5(android.content.Context context, com.applovin.impl.h5 h5Var) {
        this.f1385a = context.getApplicationContext();
        this.c = (com.applovin.impl.h5) com.applovin.impl.b1.a(h5Var);
    }

    @Override // com.applovin.impl.h5
    public android.net.Uri c() {
        com.applovin.impl.h5 h5Var = this.k;
        if (h5Var == null) {
            return null;
        }
        return h5Var.c();
    }

    @Override // com.applovin.impl.h5
    public java.util.Map e() {
        com.applovin.impl.h5 h5Var = this.k;
        return h5Var == null ? java.util.Collections.emptyMap() : h5Var.e();
    }

    @Override // com.applovin.impl.h5
    public void close() {
        com.applovin.impl.h5 h5Var = this.k;
        if (h5Var != null) {
            try {
                h5Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    private com.applovin.impl.h5 m() {
        if (this.h == null) {
            com.applovin.impl.np npVar = new com.applovin.impl.np();
            this.h = npVar;
            a(npVar);
        }
        return this.h;
    }

    private com.applovin.impl.h5 j() {
        if (this.d == null) {
            com.applovin.impl.o8 o8Var = new com.applovin.impl.o8();
            this.d = o8Var;
            a(o8Var);
        }
        return this.d;
    }

    private com.applovin.impl.h5 g() {
        if (this.e == null) {
            com.applovin.impl.c1 c1Var = new com.applovin.impl.c1(this.f1385a);
            this.e = c1Var;
            a(c1Var);
        }
        return this.e;
    }

    private com.applovin.impl.h5 h() {
        if (this.f == null) {
            com.applovin.impl.r4 r4Var = new com.applovin.impl.r4(this.f1385a);
            this.f = r4Var;
            a(r4Var);
        }
        return this.f;
    }

    private com.applovin.impl.h5 l() {
        if (this.g == null) {
            try {
                com.applovin.impl.h5 h5Var = (com.applovin.impl.h5) java.lang.Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                this.g = h5Var;
                a(h5Var);
            } catch (java.lang.ClassNotFoundException unused) {
                com.applovin.impl.oc.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    private com.applovin.impl.h5 i() {
        if (this.i == null) {
            com.applovin.impl.g5 g5Var = new com.applovin.impl.g5();
            this.i = g5Var;
            a(g5Var);
        }
        return this.i;
    }

    private com.applovin.impl.h5 k() {
        if (this.j == null) {
            com.applovin.impl.li liVar = new com.applovin.impl.li(this.f1385a);
            this.j = liVar;
            a(liVar);
        }
        return this.j;
    }

    private void a(com.applovin.impl.h5 h5Var) {
        for (int i = 0; i < this.b.size(); i++) {
            h5Var.a((com.applovin.impl.xo) this.b.get(i));
        }
    }

    @Override // com.applovin.impl.h5
    public void a(com.applovin.impl.xo xoVar) {
        com.applovin.impl.b1.a(xoVar);
        this.c.a(xoVar);
        this.b.add(xoVar);
        a(this.d, xoVar);
        a(this.e, xoVar);
        a(this.f, xoVar);
        a(this.g, xoVar);
        a(this.h, xoVar);
        a(this.i, xoVar);
        a(this.j, xoVar);
    }

    private void a(com.applovin.impl.h5 h5Var, com.applovin.impl.xo xoVar) {
        if (h5Var != null) {
            h5Var.a(xoVar);
        }
    }

    @Override // com.applovin.impl.h5
    public long a(com.applovin.impl.k5 k5Var) {
        com.applovin.impl.b1.b(this.k == null);
        java.lang.String scheme = k5Var.f947a.getScheme();
        if (com.applovin.impl.xp.a(k5Var.f947a)) {
            java.lang.String path = k5Var.f947a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.k = g();
            } else {
                this.k = j();
            }
        } else if ("asset".equals(scheme)) {
            this.k = g();
        } else if ("content".equals(scheme)) {
            this.k = h();
        } else if ("rtmp".equals(scheme)) {
            this.k = l();
        } else if ("udp".equals(scheme)) {
            this.k = m();
        } else if ("data".equals(scheme)) {
            this.k = i();
        } else if (!androidx.media3.datasource.RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) && !"android.resource".equals(scheme)) {
            this.k = this.c;
        } else {
            this.k = k();
        }
        return this.k.a(k5Var);
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        return ((com.applovin.impl.h5) com.applovin.impl.b1.a(this.k)).a(bArr, i, i2);
    }
}
