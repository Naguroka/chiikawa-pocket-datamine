package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ii implements com.applovin.impl.j8 {
    public static final com.applovin.impl.n8 l = new com.applovin.impl.n8() { // from class: com.applovin.impl.ii$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.n8
        public final com.applovin.impl.j8[] a() {
            return com.applovin.impl.ii.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ho f888a;
    private final android.util.SparseArray b;
    private final com.applovin.impl.ah c;
    private final com.applovin.impl.hi d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private com.applovin.impl.gi i;
    private com.applovin.impl.l8 j;
    private boolean k;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.j8[] b() {
        return new com.applovin.impl.j8[]{new com.applovin.impl.ii()};
    }

    @Override // com.applovin.impl.j8
    public void a() {
    }

    public ii() {
        this(new com.applovin.impl.ho(0L));
    }

    @Override // com.applovin.impl.j8
    public void a(com.applovin.impl.l8 l8Var) {
        this.j = l8Var;
    }

    public ii(com.applovin.impl.ho hoVar) {
        this.f888a = hoVar;
        this.c = new com.applovin.impl.ah(4096);
        this.b = new android.util.SparseArray();
        this.d = new com.applovin.impl.hi();
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.p7 f889a;
        private final com.applovin.impl.ho b;
        private final com.applovin.impl.zg c = new com.applovin.impl.zg(new byte[64]);
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;

        public a(com.applovin.impl.p7 p7Var, com.applovin.impl.ho hoVar) {
            this.f889a = p7Var;
            this.b = hoVar;
        }

        public void c() {
            this.f = false;
            this.f889a.a();
        }

        public void a(com.applovin.impl.ah ahVar) {
            ahVar.a(this.c.f1572a, 0, 3);
            this.c.c(0);
            a();
            ahVar.a(this.c.f1572a, 0, this.g);
            this.c.c(0);
            b();
            this.f889a.a(this.h, 4);
            this.f889a.a(ahVar);
            this.f889a.b();
        }

        private void b() {
            this.h = 0L;
            if (this.d) {
                this.c.d(4);
                long jA = ((long) this.c.a(3)) << 30;
                this.c.d(1);
                long jA2 = jA | ((long) (this.c.a(15) << 15));
                this.c.d(1);
                long jA3 = jA2 | ((long) this.c.a(15));
                this.c.d(1);
                if (!this.f && this.e) {
                    this.c.d(4);
                    long jA4 = ((long) this.c.a(3)) << 30;
                    this.c.d(1);
                    long jA5 = jA4 | ((long) (this.c.a(15) << 15));
                    this.c.d(1);
                    long jA6 = jA5 | ((long) this.c.a(15));
                    this.c.d(1);
                    this.b.b(jA6);
                    this.f = true;
                }
                this.h = this.b.b(jA3);
            }
        }

        private void a() {
            this.c.d(8);
            this.d = this.c.f();
            this.e = this.c.f();
            this.c.d(6);
            this.g = this.c.a(8);
        }
    }

    private void a(long j) {
        if (this.k) {
            return;
        }
        this.k = true;
        if (this.d.a() != androidx.media3.common.C.TIME_UNSET) {
            com.applovin.impl.gi giVar = new com.applovin.impl.gi(this.d.b(), this.d.a(), j);
            this.i = giVar;
            this.j.a(giVar.a());
            return;
        }
        this.j.a(new com.applovin.impl.ij.b(this.d.a()));
    }

    @Override // com.applovin.impl.j8
    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        com.applovin.impl.p7 eaVar;
        com.applovin.impl.b1.b(this.j);
        long jA = k8Var.a();
        if (jA != -1 && !this.d.c()) {
            return this.d.a(k8Var, thVar);
        }
        a(jA);
        com.applovin.impl.gi giVar = this.i;
        if (giVar != null && giVar.b()) {
            return this.i.a(k8Var, thVar);
        }
        k8Var.b();
        long jD = jA != -1 ? jA - k8Var.d() : -1L;
        if ((jD != -1 && jD < 4) || !k8Var.b(this.c.c(), 0, 4, true)) {
            return -1;
        }
        this.c.f(0);
        int iJ = this.c.j();
        if (iJ == 441) {
            return -1;
        }
        if (iJ == 442) {
            k8Var.c(this.c.c(), 0, 10);
            this.c.f(9);
            k8Var.a((this.c.w() & 7) + 14);
            return 0;
        }
        if (iJ == 443) {
            k8Var.c(this.c.c(), 0, 2);
            this.c.f(0);
            k8Var.a(this.c.C() + 6);
            return 0;
        }
        if (((iJ & androidx.core.view.InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            k8Var.a(1);
            return 0;
        }
        int i = iJ & 255;
        com.applovin.impl.ii.a aVar = (com.applovin.impl.ii.a) this.b.get(i);
        if (!this.e) {
            if (aVar == null) {
                if (i == 189) {
                    eaVar = new com.applovin.impl.j();
                    this.f = true;
                    this.h = k8Var.f();
                } else if ((iJ & 224) == 192) {
                    eaVar = new com.applovin.impl.rf();
                    this.f = true;
                    this.h = k8Var.f();
                } else if ((iJ & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    eaVar = new com.applovin.impl.ea();
                    this.g = true;
                    this.h = k8Var.f();
                } else {
                    eaVar = null;
                }
                if (eaVar != null) {
                    eaVar.a(this.j, new com.applovin.impl.dp.d(i, 256));
                    aVar = new com.applovin.impl.ii.a(eaVar, this.f888a);
                    this.b.put(i, aVar);
                }
            }
            if (k8Var.f() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.c();
            }
        }
        k8Var.c(this.c.c(), 0, 2);
        this.c.f(0);
        int iC = this.c.C() + 6;
        if (aVar == null) {
            k8Var.a(iC);
        } else {
            this.c.d(iC);
            k8Var.d(this.c.c(), 0, iC);
            this.c.f(6);
            aVar.a(this.c);
            com.applovin.impl.ah ahVar = this.c;
            ahVar.e(ahVar.b());
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        boolean z = this.f888a.c() == androidx.media3.common.C.TIME_UNSET;
        if (!z) {
            long jA = this.f888a.a();
            if (jA != androidx.media3.common.C.TIME_UNSET && jA != 0 && jA != j2) {
                this.f888a.d(j2);
            }
        } else if (z) {
            this.f888a.d(j2);
        }
        com.applovin.impl.gi giVar = this.i;
        if (giVar != null) {
            giVar.b(j2);
        }
        for (int i = 0; i < this.b.size(); i++) {
            ((com.applovin.impl.ii.a) this.b.valueAt(i)).c();
        }
    }

    @Override // com.applovin.impl.j8
    public boolean a(com.applovin.impl.k8 k8Var) {
        byte[] bArr = new byte[14];
        k8Var.c(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        k8Var.c(bArr[13] & 7);
        k8Var.c(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
