package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface ae {

    public interface b {
        void a(com.applovin.impl.ae aeVar, com.applovin.impl.fo foVar);
    }

    com.applovin.impl.sd a();

    com.applovin.impl.vd a(com.applovin.impl.ae.a aVar, com.applovin.impl.n0 n0Var, long j);

    void a(android.os.Handler handler, com.applovin.impl.be beVar);

    void a(android.os.Handler handler, com.applovin.impl.z6 z6Var);

    void a(com.applovin.impl.ae.b bVar);

    void a(com.applovin.impl.ae.b bVar, com.applovin.impl.xo xoVar);

    void a(com.applovin.impl.be beVar);

    void a(com.applovin.impl.vd vdVar);

    void a(com.applovin.impl.z6 z6Var);

    void b();

    void b(com.applovin.impl.ae.b bVar);

    void c(com.applovin.impl.ae.b bVar);

    default boolean c() {
        return true;
    }

    default com.applovin.impl.fo d() {
        return null;
    }

    public static final class a extends com.applovin.impl.xd {
        public com.applovin.impl.ae.a b(java.lang.Object obj) {
            return new com.applovin.impl.ae.a(super.a(obj));
        }

        public a(com.applovin.impl.xd xdVar) {
            super(xdVar);
        }

        public a(java.lang.Object obj) {
            super(obj);
        }

        public a(java.lang.Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public a(java.lang.Object obj, long j, int i) {
            super(obj, j, i);
        }
    }
}
