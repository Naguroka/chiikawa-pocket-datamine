package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class i9 implements com.applovin.impl.j8 {
    public static final com.applovin.impl.n8 I = new com.applovin.impl.n8() { // from class: com.applovin.impl.i9$$ExternalSyntheticLambda1
        @Override // com.applovin.impl.n8
        public final com.applovin.impl.j8[] a() {
            return com.applovin.impl.i9.d();
        }
    };
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final com.applovin.impl.e9 K = new com.applovin.impl.e9.b().f(androidx.media3.common.MimeTypes.APPLICATION_EMSG).a();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private com.applovin.impl.l8 E;
    private com.applovin.impl.qo[] F;
    private com.applovin.impl.qo[] G;
    private boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f877a;
    private final com.applovin.impl.lo b;
    private final java.util.List c;
    private final android.util.SparseArray d;
    private final com.applovin.impl.ah e;
    private final com.applovin.impl.ah f;
    private final com.applovin.impl.ah g;
    private final byte[] h;
    private final com.applovin.impl.ah i;
    private final com.applovin.impl.ho j;
    private final com.applovin.impl.x7 k;
    private final com.applovin.impl.ah l;
    private final java.util.ArrayDeque m;
    private final java.util.ArrayDeque n;
    private final com.applovin.impl.qo o;
    private int p;
    private int q;
    private long r;
    private int s;
    private com.applovin.impl.ah t;
    private long u;
    private int v;
    private long w;
    private long x;
    private long y;
    private com.applovin.impl.i9.b z;

    private static boolean b(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    private static boolean c(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    protected com.applovin.impl.lo a(com.applovin.impl.lo loVar) {
        return loVar;
    }

    @Override // com.applovin.impl.j8
    public void a() {
    }

    public i9() {
        this(0);
    }

    private void b() {
        this.p = 0;
        this.s = 0;
    }

    public i9(int i) {
        this(i, null);
    }

    public i9(int i, com.applovin.impl.ho hoVar) {
        this(i, hoVar, null, java.util.Collections.emptyList());
    }

    private void c() {
        int i;
        com.applovin.impl.qo[] qoVarArr = new com.applovin.impl.qo[2];
        this.F = qoVarArr;
        com.applovin.impl.qo qoVar = this.o;
        int i2 = 0;
        if (qoVar != null) {
            qoVarArr[0] = qoVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f877a & 4) != 0) {
            qoVarArr[i] = this.E.a(100, 5);
            i3 = 101;
            i++;
        }
        com.applovin.impl.qo[] qoVarArr2 = (com.applovin.impl.qo[]) com.applovin.impl.xp.a(this.F, i);
        this.F = qoVarArr2;
        for (com.applovin.impl.qo qoVar2 : qoVarArr2) {
            qoVar2.a(K);
        }
        this.G = new com.applovin.impl.qo[this.c.size()];
        while (i2 < this.G.length) {
            com.applovin.impl.qo qoVarA = this.E.a(i3, 3);
            qoVarA.a((com.applovin.impl.e9) this.c.get(i2));
            this.G[i2] = qoVarA;
            i2++;
            i3++;
        }
    }

    private static android.util.Pair d(com.applovin.impl.ah ahVar) {
        ahVar.f(12);
        return android.util.Pair.create(java.lang.Integer.valueOf(ahVar.j()), new com.applovin.impl.k6(ahVar.j() - 1, ahVar.j(), ahVar.j(), ahVar.j()));
    }

    public i9(int i, com.applovin.impl.ho hoVar, com.applovin.impl.lo loVar, java.util.List list) {
        this(i, hoVar, loVar, list, null);
    }

    private void b(com.applovin.impl.j1.a aVar) throws com.applovin.impl.ch {
        a(aVar, this.d, this.b != null, this.f877a, this.h);
        com.applovin.impl.x6 x6VarA = a(aVar.c);
        if (x6VarA != null) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                ((com.applovin.impl.i9.b) this.d.valueAt(i)).a(x6VarA);
            }
        }
        if (this.w != androidx.media3.common.C.TIME_UNSET) {
            int size2 = this.d.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((com.applovin.impl.i9.b) this.d.valueAt(i2)).a(this.w);
            }
            this.w = androidx.media3.common.C.TIME_UNSET;
        }
    }

    public i9(int i, com.applovin.impl.ho hoVar, com.applovin.impl.lo loVar, java.util.List list, com.applovin.impl.qo qoVar) {
        this.f877a = i;
        this.j = hoVar;
        this.b = loVar;
        this.c = java.util.Collections.unmodifiableList(list);
        this.o = qoVar;
        this.k = new com.applovin.impl.x7();
        this.l = new com.applovin.impl.ah(16);
        this.e = new com.applovin.impl.ah(com.applovin.impl.yf.f1540a);
        this.f = new com.applovin.impl.ah(5);
        this.g = new com.applovin.impl.ah();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new com.applovin.impl.ah(bArr);
        this.m = new java.util.ArrayDeque();
        this.n = new java.util.ArrayDeque();
        this.d = new android.util.SparseArray();
        this.x = androidx.media3.common.C.TIME_UNSET;
        this.w = androidx.media3.common.C.TIME_UNSET;
        this.y = androidx.media3.common.C.TIME_UNSET;
        this.E = com.applovin.impl.l8.e;
        this.F = new com.applovin.impl.qo[0];
        this.G = new com.applovin.impl.qo[0];
    }

    private static int a(int i) throws com.applovin.impl.ch {
        if (i >= 0) {
            return i;
        }
        throw com.applovin.impl.ch.a("Unexpected negative value: " + i, null);
    }

    private void c(com.applovin.impl.j1.a aVar) {
        int i = 0;
        com.applovin.impl.b1.b(this.b == null, "Unexpected moov box.");
        com.applovin.impl.x6 x6VarA = a(aVar.c);
        com.applovin.impl.j1.a aVar2 = (com.applovin.impl.j1.a) com.applovin.impl.b1.a(aVar.d(androidx.media3.extractor.mp4.Atom.TYPE_mvex));
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        int size = aVar2.c.size();
        long jB = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            com.applovin.impl.j1.b bVar = (com.applovin.impl.j1.b) aVar2.c.get(i2);
            int i3 = bVar.f902a;
            if (i3 == 1953654136) {
                android.util.Pair pairD = d(bVar.b);
                sparseArray.put(((java.lang.Integer) pairD.first).intValue(), (com.applovin.impl.k6) pairD.second);
            } else if (i3 == 1835362404) {
                jB = b(bVar.b);
            }
        }
        java.util.List listA = com.applovin.impl.k1.a(aVar, new com.applovin.impl.y9(), jB, x6VarA, (this.f877a & 16) != 0, false, new com.applovin.exoplayer2.common.base.Function() { // from class: com.applovin.impl.i9$$ExternalSyntheticLambda0
            @Override // com.applovin.exoplayer2.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f$0.a((com.applovin.impl.lo) obj);
            }
        });
        int size2 = listA.size();
        if (this.d.size() == 0) {
            while (i < size2) {
                com.applovin.impl.ro roVar = (com.applovin.impl.ro) listA.get(i);
                com.applovin.impl.lo loVar = roVar.f1232a;
                this.d.put(loVar.f997a, new com.applovin.impl.i9.b(this.E.a(i, loVar.b), roVar, a(sparseArray, loVar.f997a)));
                this.x = java.lang.Math.max(this.x, loVar.e);
                i++;
            }
            this.E.c();
            return;
        }
        com.applovin.impl.b1.b(this.d.size() == size2);
        while (i < size2) {
            com.applovin.impl.ro roVar2 = (com.applovin.impl.ro) listA.get(i);
            com.applovin.impl.lo loVar2 = roVar2.f1232a;
            ((com.applovin.impl.i9.b) this.d.get(loVar2.f997a)).a(roVar2, a(sparseArray, loVar2.f997a));
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean e(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        int iA;
        com.applovin.impl.i9.b bVarA = this.z;
        java.lang.Throwable th = null;
        if (bVarA == null) {
            bVarA = a(this.d);
            if (bVarA == null) {
                int iF = (int) (this.u - k8Var.f());
                if (iF >= 0) {
                    k8Var.a(iF);
                    b();
                    return false;
                }
                throw com.applovin.impl.ch.a("Offset to end of mdat was negative.", null);
            }
            int iB = (int) (bVarA.b() - k8Var.f());
            if (iB < 0) {
                com.applovin.impl.oc.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iB = 0;
            }
            k8Var.a(iB);
            this.z = bVarA;
        }
        int i = 4;
        int i2 = 1;
        if (this.p == 3) {
            int iD = bVarA.d();
            this.A = iD;
            if (bVarA.f < bVarA.i) {
                k8Var.a(iD);
                bVarA.h();
                if (!bVarA.f()) {
                    this.z = null;
                }
                this.p = 3;
                return true;
            }
            if (bVarA.d.f1232a.g == 1) {
                this.A = iD - 8;
                k8Var.a(8);
            }
            if (androidx.media3.common.MimeTypes.AUDIO_AC4.equals(bVarA.d.f1232a.f.m)) {
                this.B = bVarA.a(this.A, 7);
                com.applovin.impl.n.a(this.A, this.i);
                bVarA.f879a.a(this.i, 7);
                this.B += 7;
            } else {
                this.B = bVarA.a(this.A, 0);
            }
            this.A += this.B;
            this.p = 4;
            this.C = 0;
        }
        com.applovin.impl.lo loVar = bVarA.d.f1232a;
        com.applovin.impl.qo qoVar = bVarA.f879a;
        long jC = bVarA.c();
        com.applovin.impl.ho hoVar = this.j;
        if (hoVar != null) {
            jC = hoVar.a(jC);
        }
        long j = jC;
        if (loVar.j == 0) {
            while (true) {
                int i3 = this.B;
                int i4 = this.A;
                if (i3 >= i4) {
                    break;
                }
                this.B += qoVar.a((com.applovin.impl.f5) k8Var, i4 - i3, false);
            }
        } else {
            byte[] bArrC = this.f.c();
            bArrC[0] = 0;
            bArrC[1] = 0;
            bArrC[2] = 0;
            int i5 = loVar.j;
            int i6 = i5 + 1;
            int i7 = 4 - i5;
            while (this.B < this.A) {
                int i8 = this.C;
                if (i8 == 0) {
                    k8Var.d(bArrC, i7, i6);
                    this.f.f(0);
                    int iJ = this.f.j();
                    if (iJ >= i2) {
                        this.C = iJ - 1;
                        this.e.f(0);
                        qoVar.a(this.e, i);
                        qoVar.a(this.f, i2);
                        this.D = (this.G.length <= 0 || !com.applovin.impl.yf.a(loVar.f.m, bArrC[i])) ? 0 : i2;
                        this.B += 5;
                        this.A += i7;
                    } else {
                        throw com.applovin.impl.ch.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.D) {
                        this.g.d(i8);
                        k8Var.d(this.g.c(), 0, this.C);
                        qoVar.a(this.g, this.C);
                        iA = this.C;
                        int iC = com.applovin.impl.yf.c(this.g.c(), this.g.e());
                        this.g.f("video/hevc".equals(loVar.f.m) ? 1 : 0);
                        this.g.e(iC);
                        com.applovin.impl.c3.a(j, this.g, this.G);
                    } else {
                        iA = qoVar.a((com.applovin.impl.f5) k8Var, i8, false);
                    }
                    this.B += iA;
                    this.C -= iA;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int iA2 = bVarA.a();
        com.applovin.impl.mo moVarE = bVarA.e();
        qoVar.a(j, iA2, this.A, 0, moVarE != null ? moVarE.c : null);
        a(j);
        if (!bVarA.f()) {
            this.z = null;
        }
        this.p = 3;
        return true;
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f878a;
        public final int b;

        public a(long j, int i) {
            this.f878a = j;
            this.b = i;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.qo f879a;
        public com.applovin.impl.ro d;
        public com.applovin.impl.k6 e;
        public int f;
        public int g;
        public int h;
        public int i;
        private boolean l;
        public final com.applovin.impl.no b = new com.applovin.impl.no();
        public final com.applovin.impl.ah c = new com.applovin.impl.ah();
        private final com.applovin.impl.ah j = new com.applovin.impl.ah(1);
        private final com.applovin.impl.ah k = new com.applovin.impl.ah();

        public b(com.applovin.impl.qo qoVar, com.applovin.impl.ro roVar, com.applovin.impl.k6 k6Var) {
            this.f879a = qoVar;
            this.d = roVar;
            this.e = k6Var;
            a(roVar, k6Var);
        }

        public void g() {
            this.b.a();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }

        public long c() {
            if (!this.l) {
                return this.d.f[this.f];
            }
            return this.b.a(this.f);
        }

        public long b() {
            if (!this.l) {
                return this.d.c[this.f];
            }
            return this.b.g[this.h];
        }

        public int d() {
            if (!this.l) {
                return this.d.d[this.f];
            }
            return this.b.i[this.f];
        }

        public boolean f() {
            this.f++;
            if (!this.l) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.h;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public void h() {
            com.applovin.impl.mo moVarE = e();
            if (moVarE == null) {
                return;
            }
            com.applovin.impl.ah ahVar = this.b.p;
            int i = moVarE.d;
            if (i != 0) {
                ahVar.g(i);
            }
            if (this.b.c(this.f)) {
                ahVar.g(ahVar.C() * 6);
            }
        }

        public com.applovin.impl.mo e() {
            if (!this.l) {
                return null;
            }
            int i = ((com.applovin.impl.k6) com.applovin.impl.xp.a(this.b.f1102a)).f949a;
            com.applovin.impl.mo moVarA = this.b.o;
            if (moVarA == null) {
                moVarA = this.d.f1232a.a(i);
            }
            if (moVarA == null || !moVarA.f1075a) {
                return null;
            }
            return moVarA;
        }

        public int a() {
            int i;
            if (!this.l) {
                i = this.d.g[this.f];
            } else {
                i = this.b.l[this.f] ? 1 : 0;
            }
            return e() != null ? i | 1073741824 : i;
        }

        public int a(int i, int i2) {
            com.applovin.impl.ah ahVar;
            com.applovin.impl.mo moVarE = e();
            if (moVarE == null) {
                return 0;
            }
            int length = moVarE.d;
            if (length != 0) {
                ahVar = this.b.p;
            } else {
                byte[] bArr = (byte[]) com.applovin.impl.xp.a((java.lang.Object) moVarE.e);
                this.k.a(bArr, bArr.length);
                com.applovin.impl.ah ahVar2 = this.k;
                length = bArr.length;
                ahVar = ahVar2;
            }
            boolean zC = this.b.c(this.f);
            boolean z = zC || i2 != 0;
            this.j.c()[0] = (byte) ((z ? 128 : 0) | length);
            this.j.f(0);
            this.f879a.a(this.j, 1, 1);
            this.f879a.a(ahVar, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zC) {
                this.c.d(8);
                byte[] bArrC = this.c.c();
                bArrC[0] = 0;
                bArrC[1] = 1;
                bArrC[2] = (byte) ((i2 >> 8) & 255);
                bArrC[3] = (byte) (i2 & 255);
                bArrC[4] = (byte) ((i >> 24) & 255);
                bArrC[5] = (byte) ((i >> 16) & 255);
                bArrC[6] = (byte) ((i >> 8) & 255);
                bArrC[7] = (byte) (i & 255);
                this.f879a.a(this.c, 8, 1);
                return length + 9;
            }
            com.applovin.impl.ah ahVar3 = this.b.p;
            int iC = ahVar3.C();
            ahVar3.g(-2);
            int i3 = (iC * 6) + 2;
            if (i2 != 0) {
                this.c.d(i3);
                byte[] bArrC2 = this.c.c();
                ahVar3.a(bArrC2, 0, i3);
                int i4 = (((bArrC2[2] & 255) << 8) | (bArrC2[3] & 255)) + i2;
                bArrC2[2] = (byte) ((i4 >> 8) & 255);
                bArrC2[3] = (byte) (i4 & 255);
                ahVar3 = this.c;
            }
            this.f879a.a(ahVar3, i3, 1);
            return length + 1 + i3;
        }

        public void a(com.applovin.impl.ro roVar, com.applovin.impl.k6 k6Var) {
            this.d = roVar;
            this.e = k6Var;
            this.f879a.a(roVar.f1232a.f);
            g();
        }

        public void a(long j) {
            int i = this.f;
            while (true) {
                com.applovin.impl.no noVar = this.b;
                if (i >= noVar.f || noVar.a(i) >= j) {
                    return;
                }
                if (this.b.l[i]) {
                    this.i = i;
                }
                i++;
            }
        }

        public void a(com.applovin.impl.x6 x6Var) {
            com.applovin.impl.mo moVarA = this.d.f1232a.a(((com.applovin.impl.k6) com.applovin.impl.xp.a(this.b.f1102a)).f949a);
            this.f879a.a(this.d.f1232a.f.a().a(x6Var.a(moVarA != null ? moVarA.b : null)).a());
        }
    }

    private com.applovin.impl.k6 a(android.util.SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (com.applovin.impl.k6) sparseArray.valueAt(0);
        }
        return (com.applovin.impl.k6) com.applovin.impl.b1.a((com.applovin.impl.k6) sparseArray.get(i));
    }

    private static long b(com.applovin.impl.ah ahVar) {
        ahVar.f(8);
        return com.applovin.impl.j1.c(ahVar.j()) == 0 ? ahVar.y() : ahVar.B();
    }

    private void d(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        int size = this.d.size();
        long j = Long.MAX_VALUE;
        com.applovin.impl.i9.b bVar = null;
        for (int i = 0; i < size; i++) {
            com.applovin.impl.no noVar = ((com.applovin.impl.i9.b) this.d.valueAt(i)).b;
            if (noVar.q) {
                long j2 = noVar.d;
                if (j2 < j) {
                    bVar = (com.applovin.impl.i9.b) this.d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.p = 3;
            return;
        }
        int iF = (int) (j - k8Var.f());
        if (iF >= 0) {
            k8Var.a(iF);
            bVar.b.a(k8Var);
            return;
        }
        throw com.applovin.impl.ch.a("Offset to encryption data was negative.", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.j8[] d() {
        return new com.applovin.impl.j8[]{new com.applovin.impl.i9()};
    }

    private static long c(com.applovin.impl.ah ahVar) {
        ahVar.f(8);
        return com.applovin.impl.j1.c(ahVar.j()) == 1 ? ahVar.B() : ahVar.y();
    }

    private void c(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        int i = ((int) this.r) - this.s;
        com.applovin.impl.ah ahVar = this.t;
        if (ahVar != null) {
            k8Var.d(ahVar.c(), 8, i);
            a(new com.applovin.impl.j1.b(this.q, ahVar), k8Var.f());
        } else {
            k8Var.a(i);
        }
        b(k8Var.f());
    }

    private static void b(com.applovin.impl.ah ahVar, com.applovin.impl.no noVar) throws com.applovin.impl.ch {
        a(ahVar, 0, noVar);
    }

    private static com.applovin.impl.x6 a(java.util.List list) {
        int size = list.size();
        java.util.ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            com.applovin.impl.j1.b bVar = (com.applovin.impl.j1.b) list.get(i);
            if (bVar.f902a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                byte[] bArrC = bVar.b.c();
                java.util.UUID uuidC = com.applovin.impl.ji.c(bArrC);
                if (uuidC == null) {
                    com.applovin.impl.oc.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new com.applovin.impl.x6.b(uuidC, androidx.media3.common.MimeTypes.VIDEO_MP4, bArrC));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.applovin.impl.x6(arrayList);
    }

    private static void b(com.applovin.impl.j1.a aVar, android.util.SparseArray sparseArray, boolean z, int i, byte[] bArr) throws com.applovin.impl.ch {
        com.applovin.impl.i9.b bVarA = a(((com.applovin.impl.j1.b) com.applovin.impl.b1.a(aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_tfhd))).b, sparseArray, z);
        if (bVarA == null) {
            return;
        }
        com.applovin.impl.no noVar = bVarA.b;
        long j = noVar.r;
        boolean z2 = noVar.s;
        bVarA.g();
        bVarA.l = true;
        com.applovin.impl.j1.b bVarE = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_tfdt);
        if (bVarE != null && (i & 2) == 0) {
            noVar.r = c(bVarE.b);
            noVar.s = true;
        } else {
            noVar.r = j;
            noVar.s = z2;
        }
        a(aVar, bVarA, i);
        com.applovin.impl.mo moVarA = bVarA.d.f1232a.a(((com.applovin.impl.k6) com.applovin.impl.b1.a(noVar.f1102a)).f949a);
        com.applovin.impl.j1.b bVarE2 = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_saiz);
        if (bVarE2 != null) {
            a((com.applovin.impl.mo) com.applovin.impl.b1.a(moVarA), bVarE2.b, noVar);
        }
        com.applovin.impl.j1.b bVarE3 = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_saio);
        if (bVarE3 != null) {
            a(bVarE3.b, noVar);
        }
        com.applovin.impl.j1.b bVarE4 = aVar.e(androidx.media3.extractor.mp4.Atom.TYPE_senc);
        if (bVarE4 != null) {
            b(bVarE4.b, noVar);
        }
        a(aVar, moVarA != null ? moVarA.b : null, noVar);
        int size = aVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.applovin.impl.j1.b bVar = (com.applovin.impl.j1.b) aVar.c.get(i2);
            if (bVar.f902a == 1970628964) {
                a(bVar.b, noVar, bArr);
            }
        }
    }

    private void b(long j) throws com.applovin.impl.ch {
        while (!this.m.isEmpty() && ((com.applovin.impl.j1.a) this.m.peek()).b == j) {
            a((com.applovin.impl.j1.a) this.m.pop());
        }
        b();
    }

    private boolean b(com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        if (this.s == 0) {
            if (!k8Var.a(this.l.c(), 0, 8, true)) {
                return false;
            }
            this.s = 8;
            this.l.f(0);
            this.r = this.l.y();
            this.q = this.l.j();
        }
        long j = this.r;
        if (j == 1) {
            k8Var.d(this.l.c(), 8, 8);
            this.s += 8;
            this.r = this.l.B();
        } else if (j == 0) {
            long jA = k8Var.a();
            if (jA == -1 && !this.m.isEmpty()) {
                jA = ((com.applovin.impl.j1.a) this.m.peek()).b;
            }
            if (jA != -1) {
                this.r = (jA - k8Var.f()) + ((long) this.s);
            }
        }
        if (this.r >= this.s) {
            long jF = k8Var.f() - ((long) this.s);
            int i = this.q;
            if ((i == 1836019558 || i == 1835295092) && !this.H) {
                this.E.a(new com.applovin.impl.ij.b(this.x, jF));
                this.H = true;
            }
            if (this.q == 1836019558) {
                int size = this.d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    com.applovin.impl.no noVar = ((com.applovin.impl.i9.b) this.d.valueAt(i2)).b;
                    noVar.b = jF;
                    noVar.d = jF;
                    noVar.c = jF;
                }
            }
            int i3 = this.q;
            if (i3 == 1835295092) {
                this.z = null;
                this.u = jF + this.r;
                this.p = 2;
                return true;
            }
            if (b(i3)) {
                long jF2 = (k8Var.f() + this.r) - 8;
                this.m.push(new com.applovin.impl.j1.a(this.q, jF2));
                if (this.r == this.s) {
                    b(jF2);
                } else {
                    b();
                }
            } else if (c(this.q)) {
                if (this.s == 8) {
                    long j2 = this.r;
                    if (j2 <= 2147483647L) {
                        com.applovin.impl.ah ahVar = new com.applovin.impl.ah((int) j2);
                        java.lang.System.arraycopy(this.l.c(), 0, ahVar.c(), 0, 8);
                        this.t = ahVar;
                        this.p = 1;
                    } else {
                        throw com.applovin.impl.ch.a("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw com.applovin.impl.ch.a("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.r <= 2147483647L) {
                this.t = null;
                this.p = 1;
            } else {
                throw com.applovin.impl.ch.a("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw com.applovin.impl.ch.a("Atom size less than header length (unsupported).");
    }

    private static com.applovin.impl.i9.b a(android.util.SparseArray sparseArray) {
        int size = sparseArray.size();
        com.applovin.impl.i9.b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            com.applovin.impl.i9.b bVar2 = (com.applovin.impl.i9.b) sparseArray.valueAt(i);
            if ((bVar2.l || bVar2.f != bVar2.d.b) && (!bVar2.l || bVar2.h != bVar2.b.e)) {
                long jB = bVar2.b();
                if (jB < j) {
                    bVar = bVar2;
                    j = jB;
                }
            }
        }
        return bVar;
    }

    @Override // com.applovin.impl.j8
    public void a(com.applovin.impl.l8 l8Var) {
        this.E = l8Var;
        b();
        c();
        com.applovin.impl.lo loVar = this.b;
        if (loVar != null) {
            this.d.put(0, new com.applovin.impl.i9.b(l8Var.a(0, loVar.b), new com.applovin.impl.ro(this.b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new com.applovin.impl.k6(0, 0, 0, 0)));
            this.E.c();
        }
    }

    private void a(com.applovin.impl.j1.a aVar) throws com.applovin.impl.ch {
        int i = aVar.f902a;
        if (i == 1836019574) {
            c(aVar);
        } else if (i == 1836019558) {
            b(aVar);
        } else {
            if (this.m.isEmpty()) {
                return;
            }
            ((com.applovin.impl.j1.a) this.m.peek()).a(aVar);
        }
    }

    private void a(com.applovin.impl.ah ahVar) {
        long jC;
        java.lang.String str;
        long jC2;
        java.lang.String str2;
        long jY;
        long jA;
        if (this.F.length == 0) {
            return;
        }
        ahVar.f(8);
        int iC = com.applovin.impl.j1.c(ahVar.j());
        if (iC != 0) {
            if (iC != 1) {
                com.applovin.impl.oc.d("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iC);
                return;
            }
            long jY2 = ahVar.y();
            jA = com.applovin.impl.xp.c(ahVar.B(), 1000000L, jY2);
            long jC3 = com.applovin.impl.xp.c(ahVar.y(), 1000L, jY2);
            long jY3 = ahVar.y();
            str = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) ahVar.t());
            jC2 = jC3;
            jY = jY3;
            str2 = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) ahVar.t());
            jC = -9223372036854775807L;
        } else {
            java.lang.String str3 = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) ahVar.t());
            java.lang.String str4 = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) ahVar.t());
            long jY4 = ahVar.y();
            jC = com.applovin.impl.xp.c(ahVar.y(), 1000000L, jY4);
            long j = this.y;
            long j2 = j != androidx.media3.common.C.TIME_UNSET ? j + jC : -9223372036854775807L;
            str = str3;
            jC2 = com.applovin.impl.xp.c(ahVar.y(), 1000L, jY4);
            str2 = str4;
            jY = ahVar.y();
            jA = j2;
        }
        byte[] bArr = new byte[ahVar.a()];
        ahVar.a(bArr, 0, ahVar.a());
        com.applovin.impl.ah ahVar2 = new com.applovin.impl.ah(this.k.a(new com.applovin.impl.v7(str, str2, jC2, jY, bArr)));
        int iA = ahVar2.a();
        for (com.applovin.impl.qo qoVar : this.F) {
            ahVar2.f(0);
            qoVar.a(ahVar2, iA);
        }
        if (jA == androidx.media3.common.C.TIME_UNSET) {
            this.n.addLast(new com.applovin.impl.i9.a(jC, iA));
            this.v += iA;
            return;
        }
        com.applovin.impl.ho hoVar = this.j;
        if (hoVar != null) {
            jA = hoVar.a(jA);
        }
        for (com.applovin.impl.qo qoVar2 : this.F) {
            qoVar2.a(jA, 1, iA, 0, null);
        }
    }

    private void a(com.applovin.impl.j1.b bVar, long j) throws com.applovin.impl.ch {
        if (!this.m.isEmpty()) {
            ((com.applovin.impl.j1.a) this.m.peek()).a(bVar);
            return;
        }
        int i = bVar.f902a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                a(bVar.b);
            }
        } else {
            android.util.Pair pairA = a(bVar.b, j);
            this.y = ((java.lang.Long) pairA.first).longValue();
            this.E.a((com.applovin.impl.ij) pairA.second);
            this.H = true;
        }
    }

    private void a(long j) {
        while (!this.n.isEmpty()) {
            com.applovin.impl.i9.a aVar = (com.applovin.impl.i9.a) this.n.removeFirst();
            this.v -= aVar.b;
            long jA = aVar.f878a + j;
            com.applovin.impl.ho hoVar = this.j;
            if (hoVar != null) {
                jA = hoVar.a(jA);
            }
            for (com.applovin.impl.qo qoVar : this.F) {
                qoVar.a(jA, 1, aVar.b, this.v, null);
            }
        }
    }

    private static void a(com.applovin.impl.j1.a aVar, android.util.SparseArray sparseArray, boolean z, int i, byte[] bArr) throws com.applovin.impl.ch {
        int size = aVar.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.applovin.impl.j1.a aVar2 = (com.applovin.impl.j1.a) aVar.d.get(i2);
            if (aVar2.f902a == 1953653094) {
                b(aVar2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void a(com.applovin.impl.ah ahVar, com.applovin.impl.no noVar) throws com.applovin.impl.ch {
        ahVar.f(8);
        int iJ = ahVar.j();
        if ((com.applovin.impl.j1.b(iJ) & 1) == 1) {
            ahVar.g(8);
        }
        int iA = ahVar.A();
        if (iA == 1) {
            noVar.d += com.applovin.impl.j1.c(iJ) == 0 ? ahVar.y() : ahVar.B();
            return;
        }
        throw com.applovin.impl.ch.a("Unexpected saio entry count: " + iA, null);
    }

    private static void a(com.applovin.impl.mo moVar, com.applovin.impl.ah ahVar, com.applovin.impl.no noVar) throws com.applovin.impl.ch {
        int i;
        int i2 = moVar.d;
        ahVar.f(8);
        if ((com.applovin.impl.j1.b(ahVar.j()) & 1) == 1) {
            ahVar.g(8);
        }
        int iW = ahVar.w();
        int iA = ahVar.A();
        if (iA <= noVar.f) {
            if (iW == 0) {
                boolean[] zArr = noVar.n;
                i = 0;
                for (int i3 = 0; i3 < iA; i3++) {
                    int iW2 = ahVar.w();
                    i += iW2;
                    zArr[i3] = iW2 > i2;
                }
            } else {
                i = iW * iA;
                java.util.Arrays.fill(noVar.n, 0, iA, iW > i2);
            }
            java.util.Arrays.fill(noVar.n, iA, noVar.f, false);
            if (i > 0) {
                noVar.b(i);
                return;
            }
            return;
        }
        throw com.applovin.impl.ch.a("Saiz sample count " + iA + " is greater than fragment sample count" + noVar.f, null);
    }

    private static void a(com.applovin.impl.j1.a aVar, java.lang.String str, com.applovin.impl.no noVar) throws com.applovin.impl.ch {
        byte[] bArr = null;
        com.applovin.impl.ah ahVar = null;
        com.applovin.impl.ah ahVar2 = null;
        for (int i = 0; i < aVar.c.size(); i++) {
            com.applovin.impl.j1.b bVar = (com.applovin.impl.j1.b) aVar.c.get(i);
            com.applovin.impl.ah ahVar3 = bVar.b;
            int i2 = bVar.f902a;
            if (i2 == 1935828848) {
                ahVar3.f(12);
                if (ahVar3.j() == 1936025959) {
                    ahVar = ahVar3;
                }
            } else if (i2 == 1936158820) {
                ahVar3.f(12);
                if (ahVar3.j() == 1936025959) {
                    ahVar2 = ahVar3;
                }
            }
        }
        if (ahVar == null || ahVar2 == null) {
            return;
        }
        ahVar.f(8);
        int iC = com.applovin.impl.j1.c(ahVar.j());
        ahVar.g(4);
        if (iC == 1) {
            ahVar.g(4);
        }
        if (ahVar.j() == 1) {
            ahVar2.f(8);
            int iC2 = com.applovin.impl.j1.c(ahVar2.j());
            ahVar2.g(4);
            if (iC2 == 1) {
                if (ahVar2.y() == 0) {
                    throw com.applovin.impl.ch.a("Variable length description in sgpd found (unsupported)");
                }
            } else if (iC2 >= 2) {
                ahVar2.g(4);
            }
            if (ahVar2.y() == 1) {
                ahVar2.g(1);
                int iW = ahVar2.w();
                int i3 = (iW & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4;
                int i4 = iW & 15;
                boolean z = ahVar2.w() == 1;
                if (z) {
                    int iW2 = ahVar2.w();
                    byte[] bArr2 = new byte[16];
                    ahVar2.a(bArr2, 0, 16);
                    if (iW2 == 0) {
                        int iW3 = ahVar2.w();
                        bArr = new byte[iW3];
                        ahVar2.a(bArr, 0, iW3);
                    }
                    noVar.m = true;
                    noVar.o = new com.applovin.impl.mo(z, str, iW2, bArr2, i3, i4, bArr);
                    return;
                }
                return;
            }
            throw com.applovin.impl.ch.a("Entry count in sgpd != 1 (unsupported).");
        }
        throw com.applovin.impl.ch.a("Entry count in sbgp != 1 (unsupported).");
    }

    private static void a(com.applovin.impl.ah ahVar, int i, com.applovin.impl.no noVar) throws com.applovin.impl.ch {
        ahVar.f(i + 8);
        int iB = com.applovin.impl.j1.b(ahVar.j());
        if ((iB & 1) == 0) {
            boolean z = (iB & 2) != 0;
            int iA = ahVar.A();
            if (iA == 0) {
                java.util.Arrays.fill(noVar.n, 0, noVar.f, false);
                return;
            } else {
                if (iA == noVar.f) {
                    java.util.Arrays.fill(noVar.n, 0, iA, z);
                    noVar.b(ahVar.a());
                    noVar.a(ahVar);
                    return;
                }
                throw com.applovin.impl.ch.a("Senc sample count " + iA + " is different from fragment sample count" + noVar.f, null);
            }
        }
        throw com.applovin.impl.ch.a("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static android.util.Pair a(com.applovin.impl.ah ahVar, long j) throws com.applovin.impl.ch {
        long jB;
        long jB2;
        ahVar.f(8);
        int iC = com.applovin.impl.j1.c(ahVar.j());
        ahVar.g(4);
        long jY = ahVar.y();
        if (iC == 0) {
            jB = ahVar.y();
            jB2 = ahVar.y();
        } else {
            jB = ahVar.B();
            jB2 = ahVar.B();
        }
        long j2 = jB;
        long j3 = j + jB2;
        long jC = com.applovin.impl.xp.c(j2, 1000000L, jY);
        ahVar.g(2);
        int iC2 = ahVar.C();
        int[] iArr = new int[iC2];
        long[] jArr = new long[iC2];
        long[] jArr2 = new long[iC2];
        long[] jArr3 = new long[iC2];
        long j4 = jC;
        int i = 0;
        long j5 = j2;
        while (i < iC2) {
            int iJ = ahVar.j();
            if ((iJ & Integer.MIN_VALUE) == 0) {
                long jY2 = ahVar.y();
                iArr[i] = iJ & Integer.MAX_VALUE;
                jArr[i] = j3;
                jArr3[i] = j4;
                long j6 = j5 + jY2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i2 = iC2;
                int[] iArr2 = iArr;
                long jC2 = com.applovin.impl.xp.c(j6, 1000000L, jY);
                jArr4[i] = jC2 - jArr5[i];
                ahVar.g(4);
                j3 += (long) iArr2[i];
                i++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                iC2 = i2;
                j5 = j6;
                j4 = jC2;
            } else {
                throw com.applovin.impl.ch.a("Unhandled indirect reference", null);
            }
        }
        return android.util.Pair.create(java.lang.Long.valueOf(jC), new com.applovin.impl.g3(iArr, jArr, jArr2, jArr3));
    }

    private static com.applovin.impl.i9.b a(com.applovin.impl.ah ahVar, android.util.SparseArray sparseArray, boolean z) {
        int iJ;
        int iJ2;
        int iJ3;
        int iJ4;
        ahVar.f(8);
        int iB = com.applovin.impl.j1.b(ahVar.j());
        com.applovin.impl.i9.b bVar = (com.applovin.impl.i9.b) (z ? sparseArray.valueAt(0) : sparseArray.get(ahVar.j()));
        if (bVar == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jB = ahVar.B();
            com.applovin.impl.no noVar = bVar.b;
            noVar.c = jB;
            noVar.d = jB;
        }
        com.applovin.impl.k6 k6Var = bVar.e;
        if ((iB & 2) != 0) {
            iJ = ahVar.j() - 1;
        } else {
            iJ = k6Var.f949a;
        }
        if ((iB & 8) != 0) {
            iJ2 = ahVar.j();
        } else {
            iJ2 = k6Var.b;
        }
        if ((iB & 16) != 0) {
            iJ3 = ahVar.j();
        } else {
            iJ3 = k6Var.c;
        }
        if ((iB & 32) != 0) {
            iJ4 = ahVar.j();
        } else {
            iJ4 = k6Var.d;
        }
        bVar.b.f1102a = new com.applovin.impl.k6(iJ, iJ2, iJ3, iJ4);
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x012d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    private static int a(com.applovin.impl.i9.b bVar, int i, int i2, com.applovin.impl.ah ahVar, int i3) throws com.applovin.impl.ch {
        long j;
        long jC;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        boolean[] zArr;
        boolean z;
        int i4;
        long j2;
        long j3;
        long j4;
        int i5;
        int iJ;
        int iJ2;
        int iJ3;
        boolean z2;
        long jC2;
        boolean z3;
        com.applovin.impl.i9.b bVar2 = bVar;
        ahVar.f(8);
        int iB = com.applovin.impl.j1.b(ahVar.j());
        com.applovin.impl.lo loVar = bVar2.d.f1232a;
        com.applovin.impl.no noVar = bVar2.b;
        com.applovin.impl.k6 k6Var = (com.applovin.impl.k6) com.applovin.impl.xp.a(noVar.f1102a);
        noVar.h[i] = ahVar.A();
        long[] jArr2 = noVar.g;
        long j5 = noVar.c;
        jArr2[i] = j5;
        if ((iB & 1) != 0) {
            jArr2[i] = j5 + ((long) ahVar.j());
        }
        boolean z4 = (iB & 4) != 0;
        int iJ4 = k6Var.d;
        if (z4) {
            iJ4 = ahVar.j();
        }
        boolean z5 = (iB & 256) != 0;
        boolean z6 = (iB & 512) != 0;
        boolean z7 = (iB & 1024) != 0;
        boolean z8 = (iB & 2048) != 0;
        long[] jArr3 = loVar.h;
        if (jArr3 != null && jArr3.length == 1) {
            j = 0;
            if (jArr3[0] == 0) {
                jC = com.applovin.impl.xp.c(((long[]) com.applovin.impl.xp.a(loVar.i))[0], 1000000L, loVar.c);
            }
            iArr = noVar.i;
            iArr2 = noVar.j;
            jArr = noVar.k;
            zArr = noVar.l;
            int i6 = iJ4;
            if (loVar.b == 2 || (i2 & 1) == 0) {
                z = false;
            } else {
                z = true;
            }
            i4 = i3 + noVar.h[i];
            boolean z9 = z;
            j2 = loVar.c;
            j3 = jC;
            j4 = noVar.r;
            i5 = i3;
            while (i5 < i4) {
                if (z5) {
                    iJ = ahVar.j();
                } else {
                    iJ = k6Var.b;
                }
                int iA = a(iJ);
                if (z6) {
                    iJ2 = ahVar.j();
                } else {
                    iJ2 = k6Var.c;
                }
                int iA2 = a(iJ2);
                if (z7) {
                    iJ3 = ahVar.j();
                } else if (i5 == 0 || !z4) {
                    iJ3 = k6Var.d;
                } else {
                    iJ3 = i6;
                }
                if (z8) {
                    iArr2[i5] = (int) ((((long) ahVar.j()) * 1000000) / j2);
                    z2 = false;
                } else {
                    z2 = false;
                    iArr2[i5] = 0;
                }
                jC2 = com.applovin.impl.xp.c(j4, 1000000L, j2) - j3;
                jArr[i5] = jC2;
                if (!noVar.s) {
                    jArr[i5] = jC2 + bVar2.d.h;
                }
                iArr[i5] = iA2;
                if (((iJ3 >> 16) & 1) == 0 || (z9 && i5 != 0)) {
                    z3 = z2;
                } else {
                    z3 = true;
                }
                zArr[i5] = z3;
                j4 += (long) iA;
                i5++;
                bVar2 = bVar;
                z5 = z5;
                j2 = j2;
                z4 = z4;
                z8 = z8;
                z6 = z6;
                z7 = z7;
            }
            noVar.r = j4;
            return i4;
        }
        j = 0;
        jC = j;
        iArr = noVar.i;
        iArr2 = noVar.j;
        jArr = noVar.k;
        zArr = noVar.l;
        int i7 = iJ4;
        if (loVar.b == 2) {
            z = false;
        } else {
            z = false;
        }
        i4 = i3 + noVar.h[i];
        boolean z10 = z;
        j2 = loVar.c;
        j3 = jC;
        j4 = noVar.r;
        i5 = i3;
        while (i5 < i4) {
            if (z5) {
                iJ = ahVar.j();
            } else {
                iJ = k6Var.b;
            }
            int iA3 = a(iJ);
            if (z6) {
                iJ2 = ahVar.j();
            } else {
                iJ2 = k6Var.c;
            }
            int iA4 = a(iJ2);
            if (z7) {
                iJ3 = ahVar.j();
            } else if (i5 == 0) {
                iJ3 = k6Var.d;
            } else {
                iJ3 = k6Var.d;
            }
            if (z8) {
                iArr2[i5] = (int) ((((long) ahVar.j()) * 1000000) / j2);
                z2 = false;
            } else {
                z2 = false;
                iArr2[i5] = 0;
            }
            jC2 = com.applovin.impl.xp.c(j4, 1000000L, j2) - j3;
            jArr[i5] = jC2;
            if (!noVar.s) {
                jArr[i5] = jC2 + bVar2.d.h;
            }
            iArr[i5] = iA4;
            if (((iJ3 >> 16) & 1) == 0) {
                z3 = z2;
            } else {
                z3 = z2;
            }
            zArr[i5] = z3;
            j4 += (long) iA3;
            i5++;
            bVar2 = bVar;
            z5 = z5;
            j2 = j2;
            z4 = z4;
            z8 = z8;
            z6 = z6;
            z7 = z7;
        }
        noVar.r = j4;
        return i4;
    }

    private static void a(com.applovin.impl.j1.a aVar, com.applovin.impl.i9.b bVar, int i) throws com.applovin.impl.ch {
        java.util.List list = aVar.c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            com.applovin.impl.j1.b bVar2 = (com.applovin.impl.j1.b) list.get(i4);
            if (bVar2.f902a == 1953658222) {
                com.applovin.impl.ah ahVar = bVar2.b;
                ahVar.f(12);
                int iA = ahVar.A();
                if (iA > 0) {
                    i3 += iA;
                    i2++;
                }
            }
        }
        bVar.h = 0;
        bVar.g = 0;
        bVar.f = 0;
        bVar.b.a(i2, i3);
        int i5 = 0;
        int iA2 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            com.applovin.impl.j1.b bVar3 = (com.applovin.impl.j1.b) list.get(i6);
            if (bVar3.f902a == 1953658222) {
                iA2 = a(bVar, i5, i, bVar3.b, iA2);
                i5++;
            }
        }
    }

    private static void a(com.applovin.impl.ah ahVar, com.applovin.impl.no noVar, byte[] bArr) throws com.applovin.impl.ch {
        ahVar.f(8);
        ahVar.a(bArr, 0, 16);
        if (java.util.Arrays.equals(bArr, J)) {
            a(ahVar, 16, noVar);
        }
    }

    @Override // com.applovin.impl.j8
    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) throws com.applovin.impl.ch {
        while (true) {
            int i = this.p;
            if (i != 0) {
                if (i == 1) {
                    c(k8Var);
                } else if (i != 2) {
                    if (e(k8Var)) {
                        return 0;
                    }
                } else {
                    d(k8Var);
                }
            } else if (!b(k8Var)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ((com.applovin.impl.i9.b) this.d.valueAt(i)).g();
        }
        this.n.clear();
        this.v = 0;
        this.w = j2;
        this.m.clear();
        b();
    }

    @Override // com.applovin.impl.j8
    public boolean a(com.applovin.impl.k8 k8Var) {
        return com.applovin.impl.lk.a(k8Var);
    }
}
