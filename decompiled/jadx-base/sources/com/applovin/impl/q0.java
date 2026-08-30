package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements com.applovin.impl.j8 {
    private static final int[] r;
    private static final int u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f1169a;
    private final int b;
    private boolean c;
    private long d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private long k;
    private com.applovin.impl.l8 l;
    private com.applovin.impl.qo m;
    private com.applovin.impl.ij n;
    private boolean o;
    public static final com.applovin.impl.n8 p = new com.applovin.impl.n8() { // from class: com.applovin.impl.q0$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.n8
        public final com.applovin.impl.j8[] a() {
            return com.applovin.impl.q0.c();
        }
    };
    private static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] s = com.applovin.impl.xp.c("#!AMR\n");
    private static final byte[] t = com.applovin.impl.xp.c("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        r = iArr;
        u = iArr[8];
    }

    @Override // com.applovin.impl.j8
    public void a() {
    }

    public q0() {
        this(0);
    }

    public q0(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
        this.f1169a = new byte[1];
        this.i = -1;
    }

    private boolean c(int i) {
        return i >= 0 && i <= 15 && (d(i) || b(i));
    }

    private boolean d(int i) {
        return this.c && (i < 10 || i > 13);
    }

    private void b() {
        com.applovin.impl.b1.b(this.m);
        com.applovin.impl.xp.a(this.l);
    }

    private static int a(int i, long j) {
        return (int) ((((long) (i * 8)) * 1000000) / j);
    }

    private boolean c(com.applovin.impl.k8 k8Var) {
        byte[] bArr = s;
        if (a(k8Var, bArr)) {
            this.c = false;
            k8Var.a(bArr.length);
            return true;
        }
        byte[] bArr2 = t;
        if (!a(k8Var, bArr2)) {
            return false;
        }
        this.c = true;
        k8Var.a(bArr2.length);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.j8[] c() {
        return new com.applovin.impl.j8[]{new com.applovin.impl.q0()};
    }

    private void d() {
        if (this.o) {
            return;
        }
        this.o = true;
        boolean z = this.c;
        this.m.a(new com.applovin.impl.e9.b().f(z ? androidx.media3.common.MimeTypes.AUDIO_AMR_WB : androidx.media3.common.MimeTypes.AUDIO_AMR_NB).i(u).c(1).n(z ? androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND : 8000).a());
    }

    private boolean b(int i) {
        return !this.c && (i < 12 || i > 14);
    }

    private com.applovin.impl.ij a(long j, boolean z) {
        return new com.applovin.impl.o4(j, this.h, a(this.i, 20000L), this.i, z);
    }

    private int d(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        if (this.f == 0) {
            try {
                int iB = b(k8Var);
                this.e = iB;
                this.f = iB;
                if (this.i == -1) {
                    this.h = k8Var.f();
                    this.i = this.e;
                }
                if (this.i == this.e) {
                    this.j++;
                }
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        int iA = this.m.a((com.applovin.impl.f5) k8Var, this.f, true);
        if (iA == -1) {
            return -1;
        }
        int i = this.f - iA;
        this.f = i;
        if (i > 0) {
            return 0;
        }
        this.m.a(this.k + this.d, 1, this.e, 0, null);
        this.d += 20000;
        return 0;
    }

    private int b(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        k8Var.b();
        k8Var.c(this.f1169a, 0, 1);
        byte b = this.f1169a[0];
        if ((b & 131) <= 0) {
            return a((b >> 3) & 15);
        }
        throw com.applovin.impl.ch.a("Invalid padding bits for frame header " + ((int) b), null);
    }

    private int a(int i) throws com.applovin.impl.ch {
        if (c(i)) {
            return this.c ? r[i] : q[i];
        }
        throw com.applovin.impl.ch.a("Illegal AMR " + (this.c ? "WB" : "NB") + " frame type " + i, null);
    }

    @Override // com.applovin.impl.j8
    public void a(com.applovin.impl.l8 l8Var) {
        this.l = l8Var;
        this.m = l8Var.a(0, 1);
        l8Var.c();
    }

    private void a(long j, int i) {
        int i2;
        if (this.g) {
            return;
        }
        int i3 = this.b;
        if ((i3 & 1) != 0 && j != -1 && ((i2 = this.i) == -1 || i2 == this.e)) {
            if (this.j >= 20 || i == -1) {
                com.applovin.impl.ij ijVarA = a(j, (i3 & 2) != 0);
                this.n = ijVarA;
                this.l.a(ijVarA);
                this.g = true;
                return;
            }
            return;
        }
        com.applovin.impl.ij.b bVar = new com.applovin.impl.ij.b(androidx.media3.common.C.TIME_UNSET);
        this.n = bVar;
        this.l.a(bVar);
        this.g = true;
    }

    private static boolean a(com.applovin.impl.k8 k8Var, byte[] bArr) {
        k8Var.b();
        byte[] bArr2 = new byte[bArr.length];
        k8Var.c(bArr2, 0, bArr.length);
        return java.util.Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.impl.j8
    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) throws com.applovin.impl.ch {
        b();
        if (k8Var.f() == 0 && !c(k8Var)) {
            throw com.applovin.impl.ch.a("Could not find AMR header.", null);
        }
        d();
        int iD = d(k8Var);
        a(k8Var.a(), iD);
        return iD;
    }

    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j != 0) {
            com.applovin.impl.ij ijVar = this.n;
            if (ijVar instanceof com.applovin.impl.o4) {
                this.k = ((com.applovin.impl.o4) ijVar).d(j);
                return;
            }
        }
        this.k = 0L;
    }

    @Override // com.applovin.impl.j8
    public boolean a(com.applovin.impl.k8 k8Var) {
        return c(k8Var);
    }
}
