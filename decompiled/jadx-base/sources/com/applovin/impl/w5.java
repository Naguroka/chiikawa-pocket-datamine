package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
class w5 implements com.applovin.impl.y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f1453a;
    private final com.applovin.impl.y7 b;
    private final com.applovin.impl.w5.a c;
    private final com.applovin.impl.w5.b d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final java.util.HashMap h;
    private final com.applovin.impl.t4 i;
    private final com.applovin.impl.lc j;
    final com.applovin.impl.pd k;
    final java.util.UUID l;
    final com.applovin.impl.w5.e m;
    private int n;
    private int o;
    private android.os.HandlerThread p;
    private com.applovin.impl.w5.c q;
    private com.applovin.impl.y4 r;
    private com.applovin.impl.y6.a s;
    private byte[] t;
    private byte[] u;
    private com.applovin.impl.y7.a v;
    private com.applovin.impl.y7.d w;

    public interface a {
        void a();

        void a(com.applovin.impl.w5 w5Var);

        void a(java.lang.Exception exc, boolean z);
    }

    public interface b {
        void a(com.applovin.impl.w5 w5Var, int i);

        void b(com.applovin.impl.w5 w5Var, int i);
    }

    public static final class f extends java.io.IOException {
        public f(java.lang.Throwable th) {
            super(th);
        }
    }

    public w5(java.util.UUID uuid, com.applovin.impl.y7 y7Var, com.applovin.impl.w5.a aVar, com.applovin.impl.w5.b bVar, java.util.List list, int i, boolean z, boolean z2, byte[] bArr, java.util.HashMap map, com.applovin.impl.pd pdVar, android.os.Looper looper, com.applovin.impl.lc lcVar) {
        if (i == 1 || i == 3) {
            com.applovin.impl.b1.a(bArr);
        }
        this.l = uuid;
        this.c = aVar;
        this.d = bVar;
        this.b = y7Var;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.u = bArr;
            this.f1453a = null;
        } else {
            this.f1453a = java.util.Collections.unmodifiableList((java.util.List) com.applovin.impl.b1.a(list));
        }
        this.h = map;
        this.k = pdVar;
        this.i = new com.applovin.impl.t4();
        this.j = lcVar;
        this.n = 2;
        this.m = new com.applovin.impl.w5.e(looper);
    }

    public void k() {
        this.w = this.b.b();
        ((com.applovin.impl.w5.c) com.applovin.impl.xp.a(this.q)).a(0, com.applovin.impl.b1.a(this.w), true);
    }

    public void i() {
        if (j()) {
            a(true);
        }
    }

    @Override // com.applovin.impl.y6
    public boolean c() {
        return this.f;
    }

    @Override // com.applovin.impl.y6
    public final com.applovin.impl.y6.a getError() {
        if (this.n == 1) {
            return this.s;
        }
        return null;
    }

    @Override // com.applovin.impl.y6
    public final java.util.UUID e() {
        return this.l;
    }

    @Override // com.applovin.impl.y6
    public final com.applovin.impl.y4 f() {
        return this.r;
    }

    @Override // com.applovin.impl.y6
    public java.util.Map d() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return this.b.b(bArr);
    }

    @Override // com.applovin.impl.y6
    public void b(com.applovin.impl.z6.a aVar) {
        com.applovin.impl.b1.b(this.o >= 0);
        if (aVar != null) {
            this.i.a(aVar);
        }
        int i = this.o + 1;
        this.o = i;
        if (i == 1) {
            com.applovin.impl.b1.b(this.n == 2);
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:DrmRequestHandler");
            this.p = handlerThread;
            handlerThread.start();
            this.q = new com.applovin.impl.w5.c(this.p.getLooper());
            if (j()) {
                a(true);
            }
        } else if (aVar != null && g() && this.i.b(aVar) == 1) {
            aVar.a(this.n);
        }
        this.d.a(this, this.o);
    }

    private boolean j() {
        if (g()) {
            return true;
        }
        try {
            byte[] bArrD = this.b.d();
            this.t = bArrD;
            this.r = this.b.d(bArrD);
            final int i = 3;
            this.n = 3;
            a(new com.applovin.impl.q4() { // from class: com.applovin.impl.w5$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.q4
                public final void accept(java.lang.Object obj) {
                    ((com.applovin.impl.z6.a) obj).a(i);
                }
            });
            com.applovin.impl.b1.a(this.t);
            return true;
        } catch (android.media.NotProvisionedException unused) {
            this.c.a(this);
            return false;
        } catch (java.lang.Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    private boolean l() {
        try {
            this.b.a(this.t, this.u);
            return true;
        } catch (java.lang.Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    private void h() {
        if (this.e == 0 && this.n == 4) {
            com.applovin.impl.xp.a((java.lang.Object) this.t);
            a(false);
        }
    }

    private boolean g() {
        int i = this.n;
        return i == 3 || i == 4;
    }

    private class e extends android.os.Handler {
        public e(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            android.util.Pair pair = (android.util.Pair) message.obj;
            java.lang.Object obj = pair.first;
            java.lang.Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                com.applovin.impl.w5.this.b(obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                com.applovin.impl.w5.this.a(obj, obj2);
            }
        }
    }

    private class c extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1454a;

        public c(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            java.lang.Object objA;
            com.applovin.impl.w5.d dVar = (com.applovin.impl.w5.d) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    com.applovin.impl.w5 w5Var = com.applovin.impl.w5.this;
                    objA = w5Var.k.a(w5Var.l, (com.applovin.impl.y7.d) dVar.d);
                } else if (i == 1) {
                    com.applovin.impl.w5 w5Var2 = com.applovin.impl.w5.this;
                    objA = w5Var2.k.a(w5Var2.l, (com.applovin.impl.y7.a) dVar.d);
                } else {
                    throw new java.lang.RuntimeException();
                }
            } catch (com.applovin.impl.qd e) {
                boolean zA = a(message, e);
                objA = e;
                if (zA) {
                    return;
                }
            } catch (java.lang.Exception e2) {
                com.applovin.impl.oc.c("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objA = e2;
            }
            com.applovin.impl.w5.this.j.a(dVar.f1455a);
            synchronized (this) {
                if (!this.f1454a) {
                    com.applovin.impl.w5.this.m.obtainMessage(message.what, android.util.Pair.create(dVar.d, objA)).sendToTarget();
                }
            }
        }

        private boolean a(android.os.Message message, com.applovin.impl.qd qdVar) {
            java.io.IOException fVar;
            com.applovin.impl.w5.d dVar = (com.applovin.impl.w5.d) message.obj;
            if (!dVar.b) {
                return false;
            }
            int i = dVar.e + 1;
            dVar.e = i;
            if (i > com.applovin.impl.w5.this.j.a(3)) {
                return false;
            }
            com.applovin.impl.mc mcVar = new com.applovin.impl.mc(dVar.f1455a, qdVar.f1178a, qdVar.b, qdVar.c, android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.elapsedRealtime() - dVar.c, qdVar.d);
            com.applovin.impl.td tdVar = new com.applovin.impl.td(3);
            if (qdVar.getCause() instanceof java.io.IOException) {
                fVar = (java.io.IOException) qdVar.getCause();
            } else {
                fVar = new com.applovin.impl.w5.f(qdVar.getCause());
            }
            long jA = com.applovin.impl.w5.this.j.a(new com.applovin.impl.lc.a(mcVar, tdVar, fVar, dVar.e));
            if (jA == androidx.media3.common.C.TIME_UNSET) {
                return false;
            }
            synchronized (this) {
                if (this.f1454a) {
                    return false;
                }
                sendMessageDelayed(android.os.Message.obtain(message), jA);
                return true;
            }
        }

        void a(int i, java.lang.Object obj, boolean z) {
            obtainMessage(i, new com.applovin.impl.w5.d(com.applovin.impl.mc.a(), z, android.os.SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void a() {
            removeCallbacksAndMessages(null);
            this.f1454a = true;
        }
    }

    @Override // com.applovin.impl.y6
    public final int b() {
        return this.n;
    }

    private void a(com.applovin.impl.q4 q4Var) {
        java.util.Iterator it = this.i.a().iterator();
        while (it.hasNext()) {
            q4Var.accept((com.applovin.impl.z6.a) it.next());
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1455a;
        public final boolean b;
        public final long c;
        public final java.lang.Object d;
        public int e;

        public d(long j, boolean z, long j2, java.lang.Object obj) {
            this.f1455a = j;
            this.b = z;
            this.c = j2;
            this.d = obj;
        }
    }

    public void b(java.lang.Exception exc, boolean z) {
        a(exc, z ? 1 : 3);
    }

    private void a(boolean z) {
        if (this.g) {
            return;
        }
        byte[] bArr = (byte[]) com.applovin.impl.xp.a((java.lang.Object) this.t);
        int i = this.e;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.u == null || l()) {
                    a(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            com.applovin.impl.b1.a(this.u);
            com.applovin.impl.b1.a(this.t);
            a(this.u, 3, z);
            return;
        }
        if (this.u == null) {
            a(bArr, 1, z);
            return;
        }
        if (this.n == 4 || l()) {
            long jA = a();
            if (this.e == 0 && jA <= 60) {
                com.applovin.impl.oc.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jA);
                a(bArr, 2, z);
            } else if (jA <= 0) {
                a(new com.applovin.impl.yb(), 2);
            } else {
                this.n = 4;
                a(new com.applovin.impl.q4() { // from class: com.applovin.impl.w5$$ExternalSyntheticLambda4
                    @Override // com.applovin.impl.q4
                    public final void accept(java.lang.Object obj) {
                        ((com.applovin.impl.z6.a) obj).c();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == this.w) {
            if (this.n == 2 || g()) {
                this.w = null;
                if (obj2 instanceof java.lang.Exception) {
                    this.c.a((java.lang.Exception) obj2, false);
                    return;
                }
                try {
                    this.b.a((byte[]) obj2);
                    this.c.a();
                } catch (java.lang.Exception e2) {
                    this.c.a(e2, true);
                }
            }
        }
    }

    public boolean a(byte[] bArr) {
        return java.util.Arrays.equals(this.t, bArr);
    }

    private void a(final java.lang.Exception exc, int i) {
        this.s = new com.applovin.impl.y6.a(exc, com.applovin.impl.c7.a(exc, i));
        com.applovin.impl.oc.a("DefaultDrmSession", "DRM session error", exc);
        a(new com.applovin.impl.q4() { // from class: com.applovin.impl.w5$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.q4
            public final void accept(java.lang.Object obj) {
                ((com.applovin.impl.z6.a) obj).a(exc);
            }
        });
        if (this.n != 4) {
            this.n = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == this.v && g()) {
            this.v = null;
            if (obj2 instanceof java.lang.Exception) {
                a((java.lang.Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.e == 3) {
                    this.b.b((byte[]) com.applovin.impl.xp.a((java.lang.Object) this.u), bArr);
                    a(new com.applovin.impl.q4() { // from class: com.applovin.impl.w5$$ExternalSyntheticLambda2
                        @Override // com.applovin.impl.q4
                        public final void accept(java.lang.Object obj3) {
                            ((com.applovin.impl.z6.a) obj3).b();
                        }
                    });
                    return;
                }
                byte[] bArrB = this.b.b(this.t, bArr);
                int i = this.e;
                if ((i == 2 || (i == 0 && this.u != null)) && bArrB != null && bArrB.length != 0) {
                    this.u = bArrB;
                }
                this.n = 4;
                a(new com.applovin.impl.q4() { // from class: com.applovin.impl.w5$$ExternalSyntheticLambda3
                    @Override // com.applovin.impl.q4
                    public final void accept(java.lang.Object obj3) {
                        ((com.applovin.impl.z6.a) obj3).a();
                    }
                });
            } catch (java.lang.Exception e2) {
                a(e2, true);
            }
        }
    }

    private void a(java.lang.Exception exc, boolean z) {
        if (exc instanceof android.media.NotProvisionedException) {
            this.c.a(this);
        } else {
            a(exc, z ? 1 : 2);
        }
    }

    public void a(int i) {
        if (i != 2) {
            return;
        }
        h();
    }

    private void a(byte[] bArr, int i, boolean z) {
        try {
            this.v = this.b.a(bArr, this.f1453a, i, this.h);
            ((com.applovin.impl.w5.c) com.applovin.impl.xp.a(this.q)).a(1, com.applovin.impl.b1.a(this.v), z);
        } catch (java.lang.Exception e2) {
            a(e2, true);
        }
    }

    @Override // com.applovin.impl.y6
    public void a(com.applovin.impl.z6.a aVar) {
        com.applovin.impl.b1.b(this.o > 0);
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.n = 0;
            ((com.applovin.impl.w5.e) com.applovin.impl.xp.a(this.m)).removeCallbacksAndMessages(null);
            ((com.applovin.impl.w5.c) com.applovin.impl.xp.a(this.q)).a();
            this.q = null;
            ((android.os.HandlerThread) com.applovin.impl.xp.a(this.p)).quit();
            this.p = null;
            this.r = null;
            this.s = null;
            this.v = null;
            this.w = null;
            byte[] bArr = this.t;
            if (bArr != null) {
                this.b.c(bArr);
                this.t = null;
            }
        }
        if (aVar != null) {
            this.i.c(aVar);
            if (this.i.b(aVar) == 0) {
                aVar.d();
            }
        }
        this.d.b(this, this.o);
    }

    @Override // com.applovin.impl.y6
    public boolean a(java.lang.String str) {
        return this.b.a((byte[]) com.applovin.impl.b1.b(this.t), str);
    }

    private long a() {
        if (!com.applovin.impl.t2.d.equals(this.l)) {
            return Long.MAX_VALUE;
        }
        android.util.Pair pair = (android.util.Pair) com.applovin.impl.b1.a(com.applovin.impl.bs.a(this));
        return java.lang.Math.min(((java.lang.Long) pair.first).longValue(), ((java.lang.Long) pair.second).longValue());
    }
}
