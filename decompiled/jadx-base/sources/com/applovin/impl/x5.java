package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class x5 implements com.applovin.impl.a7 {
    private final java.util.UUID c;
    private final com.applovin.impl.y7.c d;
    private final com.applovin.impl.pd e;
    private final java.util.HashMap f;
    private final boolean g;
    private final int[] h;
    private final boolean i;
    private final com.applovin.impl.x5.g j;
    private final com.applovin.impl.lc k;
    private final com.applovin.impl.x5.h l;
    private final long m;
    private final java.util.List n;
    private final java.util.Set o;
    private final java.util.Set p;
    private int q;
    private com.applovin.impl.y7 r;
    private com.applovin.impl.w5 s;
    private com.applovin.impl.w5 t;
    private android.os.Looper u;
    private android.os.Handler v;
    private int w;
    private byte[] x;
    volatile com.applovin.impl.x5.d y;

    public static final class b {
        private boolean d;
        private boolean f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.HashMap f1489a = new java.util.HashMap();
        private java.util.UUID b = com.applovin.impl.t2.d;
        private com.applovin.impl.y7.c c = com.applovin.impl.l9.d;
        private com.applovin.impl.lc g = new com.applovin.impl.f6();
        private int[] e = new int[0];
        private long h = 300000;

        public com.applovin.impl.x5.b a(boolean z) {
            this.d = z;
            return this;
        }

        public com.applovin.impl.x5.b b(boolean z) {
            this.f = z;
            return this;
        }

        public com.applovin.impl.x5.b a(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                com.applovin.impl.b1.a(z);
            }
            this.e = (int[]) iArr.clone();
            return this;
        }

        public com.applovin.impl.x5.b a(java.util.UUID uuid, com.applovin.impl.y7.c cVar) {
            this.b = (java.util.UUID) com.applovin.impl.b1.a(uuid);
            this.c = (com.applovin.impl.y7.c) com.applovin.impl.b1.a(cVar);
            return this;
        }

        public com.applovin.impl.x5 a(com.applovin.impl.pd pdVar) {
            return new com.applovin.impl.x5(this.b, this.c, pdVar, this.f1489a, this.d, this.e, this.f, this.g, this.h);
        }
    }

    public static final class e extends java.lang.Exception {
        private e(java.util.UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    private x5(java.util.UUID uuid, com.applovin.impl.y7.c cVar, com.applovin.impl.pd pdVar, java.util.HashMap map, boolean z, int[] iArr, boolean z2, com.applovin.impl.lc lcVar, long j) {
        com.applovin.impl.b1.a(uuid);
        com.applovin.impl.b1.a(!com.applovin.impl.t2.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.c = uuid;
        this.d = cVar;
        this.e = pdVar;
        this.f = map;
        this.g = z;
        this.h = iArr;
        this.i = z2;
        this.k = lcVar;
        this.j = new com.applovin.impl.x5.g();
        this.l = new com.applovin.impl.x5.h();
        this.w = 0;
        this.n = new java.util.ArrayList();
        this.o = com.applovin.impl.rj.b();
        this.p = com.applovin.impl.rj.b();
        this.m = j;
    }

    @Override // com.applovin.impl.a7
    public com.applovin.impl.y6 a(android.os.Looper looper, com.applovin.impl.z6.a aVar, com.applovin.impl.e9 e9Var) {
        com.applovin.impl.b1.b(this.q > 0);
        a(looper);
        return a(looper, aVar, e9Var, true);
    }

    private void d() {
        com.applovin.impl.pp it = com.applovin.impl.hb.a((java.util.Collection) this.p).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.y6) it.next()).a((com.applovin.impl.z6.a) null);
        }
    }

    private void b(android.os.Looper looper) {
        if (this.y == null) {
            this.y = new com.applovin.impl.x5.d(looper);
        }
    }

    private void e() {
        com.applovin.impl.pp it = com.applovin.impl.hb.a((java.util.Collection) this.o).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.x5.f) it.next()).a();
        }
    }

    private class d extends android.os.Handler {
        public d(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (com.applovin.impl.w5 w5Var : com.applovin.impl.x5.this.n) {
                if (w5Var.a(bArr)) {
                    w5Var.a(message.what);
                    return;
                }
            }
        }
    }

    private class g implements com.applovin.impl.w5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Set f1492a = new java.util.HashSet();
        private com.applovin.impl.w5 b;

        public g() {
        }

        @Override // com.applovin.impl.w5.a
        public void a() {
            this.b = null;
            com.applovin.impl.db dbVarA = com.applovin.impl.db.a((java.util.Collection) this.f1492a);
            this.f1492a.clear();
            com.applovin.impl.pp it = dbVarA.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.w5) it.next()).i();
            }
        }

        public void b(com.applovin.impl.w5 w5Var) {
            this.f1492a.remove(w5Var);
            if (this.b == w5Var) {
                this.b = null;
                if (this.f1492a.isEmpty()) {
                    return;
                }
                com.applovin.impl.w5 w5Var2 = (com.applovin.impl.w5) this.f1492a.iterator().next();
                this.b = w5Var2;
                w5Var2.k();
            }
        }

        @Override // com.applovin.impl.w5.a
        public void a(java.lang.Exception exc, boolean z) {
            this.b = null;
            com.applovin.impl.db dbVarA = com.applovin.impl.db.a((java.util.Collection) this.f1492a);
            this.f1492a.clear();
            com.applovin.impl.pp it = dbVarA.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.w5) it.next()).b(exc, z);
            }
        }

        @Override // com.applovin.impl.w5.a
        public void a(com.applovin.impl.w5 w5Var) {
            this.f1492a.add(w5Var);
            if (this.b != null) {
                return;
            }
            this.b = w5Var;
            w5Var.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.r != null && this.q == 0 && this.n.isEmpty() && this.o.isEmpty()) {
            ((com.applovin.impl.y7) com.applovin.impl.b1.a(this.r)).a();
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h implements com.applovin.impl.w5.b {
        private h() {
        }

        @Override // com.applovin.impl.w5.b
        public void b(final com.applovin.impl.w5 w5Var, int i) {
            if (i == 1 && com.applovin.impl.x5.this.q > 0 && com.applovin.impl.x5.this.m != androidx.media3.common.C.TIME_UNSET) {
                com.applovin.impl.x5.this.p.add(w5Var);
                ((android.os.Handler) com.applovin.impl.b1.a(com.applovin.impl.x5.this.v)).postAtTime(new java.lang.Runnable() { // from class: com.applovin.impl.x5$h$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        w5Var.a((com.applovin.impl.z6.a) null);
                    }
                }, w5Var, android.os.SystemClock.uptimeMillis() + com.applovin.impl.x5.this.m);
            } else if (i == 0) {
                com.applovin.impl.x5.this.n.remove(w5Var);
                if (com.applovin.impl.x5.this.s == w5Var) {
                    com.applovin.impl.x5.this.s = null;
                }
                if (com.applovin.impl.x5.this.t == w5Var) {
                    com.applovin.impl.x5.this.t = null;
                }
                com.applovin.impl.x5.this.j.b(w5Var);
                if (com.applovin.impl.x5.this.m != androidx.media3.common.C.TIME_UNSET) {
                    ((android.os.Handler) com.applovin.impl.b1.a(com.applovin.impl.x5.this.v)).removeCallbacksAndMessages(w5Var);
                    com.applovin.impl.x5.this.p.remove(w5Var);
                }
            }
            com.applovin.impl.x5.this.c();
        }

        @Override // com.applovin.impl.w5.b
        public void a(com.applovin.impl.w5 w5Var, int i) {
            if (com.applovin.impl.x5.this.m != androidx.media3.common.C.TIME_UNSET) {
                com.applovin.impl.x5.this.p.remove(w5Var);
                ((android.os.Handler) com.applovin.impl.b1.a(com.applovin.impl.x5.this.v)).removeCallbacksAndMessages(w5Var);
            }
        }
    }

    private class c implements com.applovin.impl.y7.b {
        private c() {
        }

        @Override // com.applovin.impl.y7.b
        public void a(com.applovin.impl.y7 y7Var, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((com.applovin.impl.x5.d) com.applovin.impl.b1.a(com.applovin.impl.x5.this.y)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f implements com.applovin.impl.a7.b {
        private final com.applovin.impl.z6.a b;
        private com.applovin.impl.y6 c;
        private boolean d;

        public f(com.applovin.impl.z6.a aVar) {
            this.b = aVar;
        }

        public void a(final com.applovin.impl.e9 e9Var) {
            ((android.os.Handler) com.applovin.impl.b1.a(com.applovin.impl.x5.this.v)).post(new java.lang.Runnable() { // from class: com.applovin.impl.x5$f$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(e9Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.applovin.impl.e9 e9Var) {
            if (com.applovin.impl.x5.this.q == 0 || this.d) {
                return;
            }
            com.applovin.impl.x5 x5Var = com.applovin.impl.x5.this;
            this.c = x5Var.a((android.os.Looper) com.applovin.impl.b1.a(x5Var.u), this.b, e9Var, false);
            com.applovin.impl.x5.this.o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            if (this.d) {
                return;
            }
            com.applovin.impl.y6 y6Var = this.c;
            if (y6Var != null) {
                y6Var.a(this.b);
            }
            com.applovin.impl.x5.this.o.remove(this);
            this.d = true;
        }

        @Override // com.applovin.impl.a7.b
        public void a() {
            com.applovin.impl.xp.a((android.os.Handler) com.applovin.impl.b1.a(com.applovin.impl.x5.this.v), new java.lang.Runnable() { // from class: com.applovin.impl.x5$f$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public com.applovin.impl.y6 a(android.os.Looper looper, com.applovin.impl.z6.a aVar, com.applovin.impl.e9 e9Var, boolean z) {
        java.util.List listA;
        b(looper);
        com.applovin.impl.x6 x6Var = e9Var.p;
        if (x6Var == null) {
            return a(com.applovin.impl.hf.e(e9Var.m), z);
        }
        com.applovin.impl.w5 w5VarA = null;
        java.lang.Object[] objArr = 0;
        if (this.x == null) {
            listA = a((com.applovin.impl.x6) com.applovin.impl.b1.a(x6Var), this.c, false);
            if (listA.isEmpty()) {
                com.applovin.impl.x5.e eVar = new com.applovin.impl.x5.e(this.c);
                com.applovin.impl.oc.a("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.a(eVar);
                }
                return new com.applovin.impl.t7(new com.applovin.impl.y6.a(eVar, 6003));
            }
        } else {
            listA = null;
        }
        if (!this.g) {
            w5VarA = this.t;
        } else {
            for (com.applovin.impl.w5 w5Var : this.n) {
                if (com.applovin.impl.xp.a(w5Var.f1453a, listA)) {
                    w5VarA = w5Var;
                    break;
                }
            }
        }
        if (w5VarA == null) {
            w5VarA = a(listA, false, aVar, z);
            if (!this.g) {
                this.t = w5VarA;
            }
            this.n.add(w5VarA);
        } else {
            w5VarA.b(aVar);
        }
        return w5VarA;
    }

    @Override // com.applovin.impl.a7
    public com.applovin.impl.a7.b b(android.os.Looper looper, com.applovin.impl.z6.a aVar, com.applovin.impl.e9 e9Var) {
        com.applovin.impl.b1.b(this.q > 0);
        a(looper);
        com.applovin.impl.x5.f fVar = new com.applovin.impl.x5.f(aVar);
        fVar.a(e9Var);
        return fVar;
    }

    @Override // com.applovin.impl.a7
    public final void b() {
        int i = this.q;
        this.q = i + 1;
        if (i != 0) {
            return;
        }
        if (this.r == null) {
            com.applovin.impl.y7 y7VarA = this.d.a(this.c);
            this.r = y7VarA;
            y7VarA.a(new com.applovin.impl.x5.c());
        } else if (this.m != androidx.media3.common.C.TIME_UNSET) {
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                ((com.applovin.impl.w5) this.n.get(i2)).b(null);
            }
        }
    }

    private static boolean a(com.applovin.impl.y6 y6Var) {
        return y6Var.b() == 1 && (com.applovin.impl.xp.f1515a < 19 || (((com.applovin.impl.y6.a) com.applovin.impl.b1.a(y6Var.getError())).getCause() instanceof android.media.ResourceBusyException));
    }

    private boolean a(com.applovin.impl.x6 x6Var) {
        if (this.x != null) {
            return true;
        }
        if (a(x6Var, this.c, true).isEmpty()) {
            if (x6Var.d != 1 || !x6Var.a(0).a(com.applovin.impl.t2.b)) {
                return false;
            }
            com.applovin.impl.oc.d("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.c);
        }
        java.lang.String str = x6Var.c;
        if (str == null || androidx.media3.common.C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        if (androidx.media3.common.C.CENC_TYPE_cbcs.equals(str)) {
            return com.applovin.impl.xp.f1515a >= 25;
        }
        return (androidx.media3.common.C.CENC_TYPE_cbc1.equals(str) || androidx.media3.common.C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    private com.applovin.impl.w5 a(java.util.List list, boolean z, com.applovin.impl.z6.a aVar) {
        com.applovin.impl.b1.a(this.r);
        com.applovin.impl.w5 w5Var = new com.applovin.impl.w5(this.c, this.r, this.j, this.l, list, this.w, this.i | z, z, this.x, this.f, this.e, (android.os.Looper) com.applovin.impl.b1.a(this.u), this.k);
        w5Var.b(aVar);
        if (this.m != androidx.media3.common.C.TIME_UNSET) {
            w5Var.b(null);
        }
        return w5Var;
    }

    private com.applovin.impl.w5 a(java.util.List list, boolean z, com.applovin.impl.z6.a aVar, boolean z2) {
        com.applovin.impl.w5 w5VarA = a(list, z, aVar);
        if (a(w5VarA) && !this.p.isEmpty()) {
            d();
            a(w5VarA, aVar);
            w5VarA = a(list, z, aVar);
        }
        if (!a(w5VarA) || !z2 || this.o.isEmpty()) {
            return w5VarA;
        }
        e();
        if (!this.p.isEmpty()) {
            d();
        }
        a(w5VarA, aVar);
        return a(list, z, aVar);
    }

    @Override // com.applovin.impl.a7
    public int a(com.applovin.impl.e9 e9Var) {
        int iC = ((com.applovin.impl.y7) com.applovin.impl.b1.a(this.r)).c();
        com.applovin.impl.x6 x6Var = e9Var.p;
        if (x6Var == null) {
            if (com.applovin.impl.xp.a(this.h, com.applovin.impl.hf.e(e9Var.m)) != -1) {
                return iC;
            }
            return 0;
        }
        if (a(x6Var)) {
            return iC;
        }
        return 1;
    }

    private synchronized void a(android.os.Looper looper) {
        android.os.Looper looper2 = this.u;
        if (looper2 == null) {
            this.u = looper;
            this.v = new android.os.Handler(looper);
        } else {
            com.applovin.impl.b1.b(looper2 == looper);
            com.applovin.impl.b1.a(this.v);
        }
    }

    private com.applovin.impl.y6 a(int i, boolean z) {
        com.applovin.impl.y7 y7Var = (com.applovin.impl.y7) com.applovin.impl.b1.a(this.r);
        if ((y7Var.c() == 2 && com.applovin.impl.k9.d) || com.applovin.impl.xp.a(this.h, i) == -1 || y7Var.c() == 1) {
            return null;
        }
        com.applovin.impl.w5 w5Var = this.s;
        if (w5Var == null) {
            com.applovin.impl.w5 w5VarA = a((java.util.List) com.applovin.impl.db.h(), true, (com.applovin.impl.z6.a) null, z);
            this.n.add(w5VarA);
            this.s = w5VarA;
        } else {
            w5Var.b(null);
        }
        return this.s;
    }

    @Override // com.applovin.impl.a7
    public final void a() {
        int i = this.q - 1;
        this.q = i;
        if (i != 0) {
            return;
        }
        if (this.m != androidx.media3.common.C.TIME_UNSET) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.n);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((com.applovin.impl.w5) arrayList.get(i2)).a((com.applovin.impl.z6.a) null);
            }
        }
        e();
        c();
    }

    public void a(int i, byte[] bArr) {
        com.applovin.impl.b1.b(this.n.isEmpty());
        if (i == 1 || i == 3) {
            com.applovin.impl.b1.a(bArr);
        }
        this.w = i;
        this.x = bArr;
    }

    private void a(com.applovin.impl.y6 y6Var, com.applovin.impl.z6.a aVar) {
        y6Var.a(aVar);
        if (this.m != androidx.media3.common.C.TIME_UNSET) {
            y6Var.a((com.applovin.impl.z6.a) null);
        }
    }

    private static java.util.List a(com.applovin.impl.x6 x6Var, java.util.UUID uuid, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList(x6Var.d);
        for (int i = 0; i < x6Var.d; i++) {
            com.applovin.impl.x6.b bVarA = x6Var.a(i);
            if ((bVarA.a(uuid) || (com.applovin.impl.t2.c.equals(uuid) && bVarA.a(com.applovin.impl.t2.b))) && (bVarA.f != null || z)) {
                arrayList.add(bVarA);
            }
        }
        return arrayList;
    }
}
