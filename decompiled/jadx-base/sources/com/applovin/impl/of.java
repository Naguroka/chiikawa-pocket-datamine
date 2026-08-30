package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class of implements com.applovin.impl.j8, com.applovin.impl.ij {
    public static final com.applovin.impl.n8 y = new com.applovin.impl.n8() { // from class: com.applovin.impl.of$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.n8
        public final com.applovin.impl.j8[] a() {
            return com.applovin.impl.of.f();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1123a;
    private final com.applovin.impl.ah b;
    private final com.applovin.impl.ah c;
    private final com.applovin.impl.ah d;
    private final com.applovin.impl.ah e;
    private final java.util.ArrayDeque f;
    private final com.applovin.impl.mj g;
    private final java.util.List h;
    private int i;
    private int j;
    private long k;
    private int l;
    private com.applovin.impl.ah m;
    private int n;
    private int o;
    private int p;
    private int q;
    private com.applovin.impl.l8 r;
    private com.applovin.impl.of.a[] s;
    private long[][] t;
    private int u;
    private long v;
    private int w;
    private com.applovin.impl.mf x;

    private static int a(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.lo a(com.applovin.impl.lo loVar) {
        return loVar;
    }

    private static boolean b(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    private static boolean c(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    @Override // com.applovin.impl.j8
    public void a() {
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    public of() {
        this(0);
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.v;
    }

    @Override // com.applovin.impl.ij
    public com.applovin.impl.ij.a b(long j) {
        long j2;
        long jA;
        long j3;
        long j4;
        int iB;
        if (((com.applovin.impl.of.a[]) com.applovin.impl.b1.a(this.s)).length == 0) {
            return new com.applovin.impl.ij.a(com.applovin.impl.kj.c);
        }
        int i = this.u;
        if (i != -1) {
            com.applovin.impl.ro roVar = this.s[i].b;
            int iA = a(roVar, j);
            if (iA == -1) {
                return new com.applovin.impl.ij.a(com.applovin.impl.kj.c);
            }
            long j5 = roVar.f[iA];
            j2 = roVar.c[iA];
            if (j5 >= j || iA >= roVar.b - 1 || (iB = roVar.b(j)) == -1 || iB == iA) {
                j4 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = roVar.f[iB];
                j4 = roVar.c[iB];
            }
            jA = j4;
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            jA = -1;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            com.applovin.impl.of.a[] aVarArr = this.s;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (i2 != this.u) {
                com.applovin.impl.ro roVar2 = aVarArr[i2].b;
                long jA2 = a(roVar2, j, j2);
                if (j3 != androidx.media3.common.C.TIME_UNSET) {
                    jA = a(roVar2, j3, jA);
                }
                j2 = jA2;
            }
            i2++;
        }
        com.applovin.impl.kj kjVar = new com.applovin.impl.kj(j, j2);
        if (j3 == androidx.media3.common.C.TIME_UNSET) {
            return new com.applovin.impl.ij.a(kjVar);
        }
        return new com.applovin.impl.ij.a(kjVar, new com.applovin.impl.kj(j3, jA));
    }

    private void e() {
        this.i = 0;
        this.l = 0;
    }

    public of(int i) {
        this.f1123a = i;
        this.i = (i & 4) != 0 ? 3 : 0;
        this.g = new com.applovin.impl.mj();
        this.h = new java.util.ArrayList();
        this.e = new com.applovin.impl.ah(16);
        this.f = new java.util.ArrayDeque();
        this.b = new com.applovin.impl.ah(com.applovin.impl.yf.f1540a);
        this.c = new com.applovin.impl.ah(4);
        this.d = new com.applovin.impl.ah();
        this.n = -1;
    }

    private int c(long j) {
        int i = -1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < ((com.applovin.impl.of.a[]) com.applovin.impl.xp.a((java.lang.Object) this.s)).length; i3++) {
            com.applovin.impl.of.a aVar = this.s[i3];
            int i4 = aVar.d;
            com.applovin.impl.ro roVar = aVar.b;
            if (i4 != roVar.b) {
                long j5 = roVar.c[i4];
                long j6 = ((long[][]) com.applovin.impl.xp.a((java.lang.Object) this.t))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    private void d(long j) {
        while (!this.f.isEmpty() && ((com.applovin.impl.j1.a) this.f.peek()).b == j) {
            com.applovin.impl.j1.a aVar = (com.applovin.impl.j1.a) this.f.pop();
            if (aVar.f902a == 1836019574) {
                a(aVar);
                this.f.clear();
                this.i = 2;
            } else if (!this.f.isEmpty()) {
                ((com.applovin.impl.j1.a) this.f.peek()).a(aVar);
            }
        }
        if (this.i != 2) {
            e();
        }
    }

    private void f(long j) {
        for (com.applovin.impl.of.a aVar : this.s) {
            com.applovin.impl.ro roVar = aVar.b;
            int iA = roVar.a(j);
            if (iA == -1) {
                iA = roVar.b(j);
            }
            aVar.d = iA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.j8[] f() {
        return new com.applovin.impl.j8[]{new com.applovin.impl.of()};
    }

    private void g() {
        if (this.w != 2 || (this.f1123a & 2) == 0) {
            return;
        }
        com.applovin.impl.l8 l8Var = (com.applovin.impl.l8) com.applovin.impl.b1.a(this.r);
        l8Var.a(0, 4).a(new com.applovin.impl.e9.b().a(this.x == null ? null : new com.applovin.impl.af(this.x)).a());
        l8Var.c();
        l8Var.a(new com.applovin.impl.ij.b(androidx.media3.common.C.TIME_UNSET));
    }

    private static long[][] a(com.applovin.impl.of.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].b.b];
            jArr2[i] = aVarArr[i].b.f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            com.applovin.impl.ro roVar = aVarArr[i3].b;
            j += (long) roVar.d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = roVar.f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.lo f1124a;
        public final com.applovin.impl.ro b;
        public final com.applovin.impl.qo c;
        public int d;

        public a(com.applovin.impl.lo loVar, com.applovin.impl.ro roVar, com.applovin.impl.qo qoVar) {
            this.f1124a = loVar;
            this.b = roVar;
            this.c = qoVar;
        }
    }

    private boolean c(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        com.applovin.impl.j1.a aVar;
        if (this.l == 0) {
            if (!k8Var.a(this.e.c(), 0, 8, true)) {
                g();
                return false;
            }
            this.l = 8;
            this.e.f(0);
            this.k = this.e.y();
            this.j = this.e.j();
        }
        long j = this.k;
        if (j == 1) {
            k8Var.d(this.e.c(), 8, 8);
            this.l += 8;
            this.k = this.e.B();
        } else if (j == 0) {
            long jA = k8Var.a();
            if (jA == -1 && (aVar = (com.applovin.impl.j1.a) this.f.peek()) != null) {
                jA = aVar.b;
            }
            if (jA != -1) {
                this.k = (jA - k8Var.f()) + ((long) this.l);
            }
        }
        if (this.k >= this.l) {
            if (b(this.j)) {
                long jF = k8Var.f();
                long j2 = this.k;
                long j3 = this.l;
                long j4 = (jF + j2) - j3;
                if (j2 != j3 && this.j == 1835365473) {
                    b(k8Var);
                }
                this.f.push(new com.applovin.impl.j1.a(this.j, j4));
                if (this.k == this.l) {
                    d(j4);
                } else {
                    e();
                }
            } else if (c(this.j)) {
                com.applovin.impl.b1.b(this.l == 8);
                com.applovin.impl.b1.b(this.k <= 2147483647L);
                com.applovin.impl.ah ahVar = new com.applovin.impl.ah((int) this.k);
                java.lang.System.arraycopy(this.e.c(), 0, ahVar.c(), 0, 8);
                this.m = ahVar;
                this.i = 1;
            } else {
                e(k8Var.f() - ((long) this.l));
                this.m = null;
                this.i = 1;
            }
            return true;
        }
        throw com.applovin.impl.ch.a("Atom size less than header length (unsupported).");
    }

    private void b(com.applovin.impl.k8 k8Var) {
        this.d.d(8);
        k8Var.c(this.d.c(), 0, 8);
        com.applovin.impl.k1.a(this.d);
        k8Var.a(this.d.d());
        k8Var.b();
    }

    private void e(long j) {
        if (this.j == 1836086884) {
            long j2 = this.l;
            this.x = new com.applovin.impl.mf(0L, j, androidx.media3.common.C.TIME_UNSET, j + j2, this.k - j2);
        }
    }

    private int d(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) throws com.applovin.impl.ch {
        int iA = this.g.a(k8Var, thVar, this.h);
        if (iA == 1 && thVar.f1364a == 0) {
            e();
        }
        return iA;
    }

    private boolean b(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        boolean z;
        long j = this.k - ((long) this.l);
        long jF = k8Var.f() + j;
        com.applovin.impl.ah ahVar = this.m;
        if (ahVar != null) {
            k8Var.d(ahVar.c(), this.l, (int) j);
            if (this.j == 1718909296) {
                this.w = a(ahVar);
            } else if (!this.f.isEmpty()) {
                ((com.applovin.impl.j1.a) this.f.peek()).a(new com.applovin.impl.j1.b(this.j, ahVar));
            }
        } else {
            if (j < 262144) {
                k8Var.a((int) j);
            } else {
                thVar.f1364a = k8Var.f() + j;
                z = true;
            }
            d(jF);
            return (z || this.i == 2) ? false : true;
        }
        z = false;
        d(jF);
        if (z) {
        }
    }

    private static int a(com.applovin.impl.ro roVar, long j) {
        int iA = roVar.a(j);
        return iA == -1 ? roVar.b(j) : iA;
    }

    private int c(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) throws com.applovin.impl.ch {
        long jF = k8Var.f();
        if (this.n == -1) {
            int iC = c(jF);
            this.n = iC;
            if (iC == -1) {
                return -1;
            }
        }
        com.applovin.impl.of.a aVar = ((com.applovin.impl.of.a[]) com.applovin.impl.xp.a((java.lang.Object) this.s))[this.n];
        com.applovin.impl.qo qoVar = aVar.c;
        int i = aVar.d;
        com.applovin.impl.ro roVar = aVar.b;
        long j = roVar.c[i];
        int i2 = roVar.d[i];
        long j2 = (j - jF) + ((long) this.o);
        if (j2 >= 0 && j2 < 262144) {
            if (aVar.f1124a.g == 1) {
                j2 += 8;
                i2 -= 8;
            }
            k8Var.a((int) j2);
            com.applovin.impl.lo loVar = aVar.f1124a;
            if (loVar.j != 0) {
                byte[] bArrC = this.c.c();
                bArrC[0] = 0;
                bArrC[1] = 0;
                bArrC[2] = 0;
                int i3 = aVar.f1124a.j;
                int i4 = 4 - i3;
                while (this.p < i2) {
                    int i5 = this.q;
                    if (i5 == 0) {
                        k8Var.d(bArrC, i4, i3);
                        this.o += i3;
                        this.c.f(0);
                        int iJ = this.c.j();
                        if (iJ >= 0) {
                            this.q = iJ;
                            this.b.f(0);
                            qoVar.a(this.b, 4);
                            this.p += 4;
                            i2 += i4;
                        } else {
                            throw com.applovin.impl.ch.a("Invalid NAL length", null);
                        }
                    } else {
                        int iA = qoVar.a((com.applovin.impl.f5) k8Var, i5, false);
                        this.o += iA;
                        this.p += iA;
                        this.q -= iA;
                    }
                }
            } else {
                if (androidx.media3.common.MimeTypes.AUDIO_AC4.equals(loVar.f.m)) {
                    if (this.p == 0) {
                        com.applovin.impl.n.a(i2, this.d);
                        qoVar.a(this.d, 7);
                        this.p += 7;
                    }
                    i2 += 7;
                }
                while (true) {
                    int i6 = this.p;
                    if (i6 >= i2) {
                        break;
                    }
                    int iA2 = qoVar.a((com.applovin.impl.f5) k8Var, i2 - i6, false);
                    this.o += iA2;
                    this.p += iA2;
                    this.q -= iA2;
                }
            }
            com.applovin.impl.ro roVar2 = aVar.b;
            qoVar.a(roVar2.f[i], roVar2.g[i], i2, 0, null);
            aVar.d++;
            this.n = -1;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            return 0;
        }
        thVar.f1364a = j;
        return 1;
    }

    @Override // com.applovin.impl.j8
    public void a(com.applovin.impl.l8 l8Var) {
        this.r = l8Var;
    }

    private static long a(com.applovin.impl.ro roVar, long j, long j2) {
        int iA = a(roVar, j);
        return iA == -1 ? j2 : java.lang.Math.min(roVar.c[iA], j2);
    }

    private static int a(com.applovin.impl.ah ahVar) {
        ahVar.f(8);
        int iA = a(ahVar.j());
        if (iA != 0) {
            return iA;
        }
        ahVar.g(4);
        while (ahVar.a() > 0) {
            int iA2 = a(ahVar.j());
            if (iA2 != 0) {
                return iA2;
            }
        }
        return 0;
    }

    private void a(com.applovin.impl.j1.a aVar) {
        com.applovin.impl.af afVar;
        com.applovin.impl.af afVar2;
        java.util.ArrayList arrayList;
        com.applovin.impl.af afVar3;
        char c;
        int size;
        int i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        boolean z = this.w == 1;
        com.applovin.impl.y9 y9Var = new com.applovin.impl.y9();
        com.applovin.impl.j1.b bVarE = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_udta);
        if (bVarE != null) {
            android.util.Pair pairA = com.applovin.impl.k1.a(bVarE);
            com.applovin.impl.af afVar4 = (com.applovin.impl.af) pairA.first;
            com.applovin.impl.af afVar5 = (com.applovin.impl.af) pairA.second;
            if (afVar4 != null) {
                y9Var.a(afVar4);
            }
            afVar = afVar5;
            afVar2 = afVar4;
        } else {
            afVar = null;
            afVar2 = null;
        }
        com.applovin.impl.j1.a aVarD = aVar.d(androidx.media3.extractor.mp4.Atom.TYPE_meta);
        com.applovin.impl.af afVarB = aVarD != null ? com.applovin.impl.k1.b(aVarD) : null;
        java.util.List listA = com.applovin.impl.k1.a(aVar, y9Var, androidx.media3.common.C.TIME_UNSET, (com.applovin.impl.x6) null, (this.f1123a & 1) != 0, z, new com.applovin.exoplayer2.common.base.Function() { // from class: com.applovin.impl.of$$ExternalSyntheticLambda1
            @Override // com.applovin.exoplayer2.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.applovin.impl.of.a((com.applovin.impl.lo) obj);
            }
        });
        com.applovin.impl.l8 l8Var = (com.applovin.impl.l8) com.applovin.impl.b1.a(this.r);
        int i2 = 0;
        int i3 = -1;
        long j = androidx.media3.common.C.TIME_UNSET;
        for (int size2 = listA.size(); i2 < size2; size2 = size2) {
            com.applovin.impl.ro roVar = (com.applovin.impl.ro) listA.get(i2);
            if (roVar.b == 0) {
                size = i3;
                arrayList = arrayList2;
            } else {
                com.applovin.impl.lo loVar = roVar.f1232a;
                int i4 = i3;
                arrayList = arrayList2;
                long j2 = loVar.e;
                if (j2 == androidx.media3.common.C.TIME_UNSET) {
                    j2 = roVar.h;
                }
                long jMax = java.lang.Math.max(j, j2);
                com.applovin.impl.of.a aVar2 = new com.applovin.impl.of.a(loVar, roVar, l8Var.a(i2, loVar.b));
                int i5 = roVar.e + 30;
                com.applovin.impl.e9.b bVarA = loVar.f.a();
                bVarA.i(i5);
                if (loVar.b == 2 && j2 > 0 && (i = roVar.b) > 1) {
                    bVarA.a(i / (j2 / 1000000.0f));
                }
                com.applovin.impl.gf.a(loVar.b, y9Var, bVarA);
                int i6 = loVar.b;
                com.applovin.impl.af[] afVarArr = new com.applovin.impl.af[2];
                afVarArr[0] = afVar;
                if (this.h.isEmpty()) {
                    c = 1;
                    afVar3 = null;
                } else {
                    afVar3 = new com.applovin.impl.af(this.h);
                    c = 1;
                }
                afVarArr[c] = afVar3;
                com.applovin.impl.gf.a(i6, afVar2, afVarB, bVarA, afVarArr);
                aVar2.c.a(bVarA.a());
                size = i4;
                if (loVar.b == 2 && size == -1) {
                    size = arrayList.size();
                }
                arrayList.add(aVar2);
                j = jMax;
            }
            i2++;
            i3 = size;
            arrayList2 = arrayList;
            listA = listA;
        }
        this.u = i3;
        this.v = j;
        com.applovin.impl.of.a[] aVarArr = (com.applovin.impl.of.a[]) arrayList2.toArray(new com.applovin.impl.of.a[0]);
        this.s = aVarArr;
        this.t = a(aVarArr);
        l8Var.c();
        l8Var.a(this);
    }

    @Override // com.applovin.impl.j8
    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        while (true) {
            int i = this.i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return c(k8Var, thVar);
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException();
                    }
                    return d(k8Var, thVar);
                }
                if (b(k8Var, thVar)) {
                    return 1;
                }
            } else if (!c(k8Var)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        this.f.clear();
        this.l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (j == 0) {
            if (this.i != 3) {
                e();
                return;
            } else {
                this.g.a();
                this.h.clear();
                return;
            }
        }
        if (this.s != null) {
            f(j2);
        }
    }

    @Override // com.applovin.impl.j8
    public boolean a(com.applovin.impl.k8 k8Var) {
        return com.applovin.impl.lk.a(k8Var, (this.f1123a & 2) != 0);
    }
}
