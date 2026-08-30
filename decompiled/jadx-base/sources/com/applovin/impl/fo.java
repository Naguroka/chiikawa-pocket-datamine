package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fo implements com.applovin.impl.o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.impl.fo f792a = new com.applovin.impl.fo.a();
    public static final com.applovin.impl.o2.a b = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.fo$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.fo.a(bundle);
        }
    };

    class a extends com.applovin.impl.fo {
        @Override // com.applovin.impl.fo
        public int a() {
            return 0;
        }

        @Override // com.applovin.impl.fo
        public int a(java.lang.Object obj) {
            return -1;
        }

        @Override // com.applovin.impl.fo
        public int b() {
            return 0;
        }

        @Override // com.applovin.impl.fo
        public java.lang.Object b(int i) {
            throw new java.lang.IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.fo
        public com.applovin.impl.fo.d a(int i, com.applovin.impl.fo.d dVar, long j) {
            throw new java.lang.IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.fo
        public com.applovin.impl.fo.b a(int i, com.applovin.impl.fo.b bVar, boolean z) {
            throw new java.lang.IndexOutOfBoundsException();
        }

        a() {
        }
    }

    protected fo() {
    }

    public abstract int a();

    public abstract int a(java.lang.Object obj);

    public abstract com.applovin.impl.fo.b a(int i, com.applovin.impl.fo.b bVar, boolean z);

    public abstract com.applovin.impl.fo.d a(int i, com.applovin.impl.fo.d dVar, long j);

    public abstract int b();

    public abstract java.lang.Object b(int i);

    public static final class d implements com.applovin.impl.o2 {
        public static final java.lang.Object s = new java.lang.Object();
        private static final java.lang.Object t = new java.lang.Object();
        private static final com.applovin.impl.sd u = new com.applovin.impl.sd.c().b("com.applovin.exoplayer2.Timeline").a(android.net.Uri.EMPTY).a();
        public static final com.applovin.impl.o2.a v = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.fo$d$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.o2.a
            public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
                return com.applovin.impl.fo.d.a(bundle);
            }
        };
        public java.lang.Object b;
        public java.lang.Object d;
        public long f;
        public long g;
        public long h;
        public boolean i;
        public boolean j;
        public boolean k;
        public com.applovin.impl.sd.f l;
        public boolean m;
        public long n;
        public long o;
        public int p;
        public int q;
        public long r;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.Object f794a = s;
        public com.applovin.impl.sd c = u;

        public long b() {
            return com.applovin.impl.t2.b(this.n);
        }

        public long c() {
            return this.n;
        }

        public long d() {
            return com.applovin.impl.t2.b(this.o);
        }

        public boolean e() {
            com.applovin.impl.b1.b(this.k == (this.l != null));
            return this.l != null;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !com.applovin.impl.fo.d.class.equals(obj.getClass())) {
                return false;
            }
            com.applovin.impl.fo.d dVar = (com.applovin.impl.fo.d) obj;
            return com.applovin.impl.xp.a(this.f794a, dVar.f794a) && com.applovin.impl.xp.a(this.c, dVar.c) && com.applovin.impl.xp.a(this.d, dVar.d) && com.applovin.impl.xp.a(this.l, dVar.l) && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.i == dVar.i && this.j == dVar.j && this.m == dVar.m && this.n == dVar.n && this.o == dVar.o && this.p == dVar.p && this.q == dVar.q && this.r == dVar.r;
        }

        public int hashCode() {
            int iHashCode = (((this.f794a.hashCode() + 217) * 31) + this.c.hashCode()) * 31;
            java.lang.Object obj = this.d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            com.applovin.impl.sd.f fVar = this.l;
            int iHashCode3 = fVar != null ? fVar.hashCode() : 0;
            long j = this.f;
            int i = (((iHashCode2 + iHashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.g;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.h;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31;
            long j4 = this.n;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.o;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.p) * 31) + this.q) * 31;
            long j6 = this.r;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.applovin.impl.fo.d a(android.os.Bundle bundle) {
            android.os.Bundle bundle2 = bundle.getBundle(a(1));
            com.applovin.impl.sd sdVar = bundle2 != null ? (com.applovin.impl.sd) com.applovin.impl.sd.h.a(bundle2) : null;
            long j = bundle.getLong(a(2), androidx.media3.common.C.TIME_UNSET);
            long j2 = bundle.getLong(a(3), androidx.media3.common.C.TIME_UNSET);
            long j3 = bundle.getLong(a(4), androidx.media3.common.C.TIME_UNSET);
            boolean z = bundle.getBoolean(a(5), false);
            boolean z2 = bundle.getBoolean(a(6), false);
            android.os.Bundle bundle3 = bundle.getBundle(a(7));
            com.applovin.impl.sd.f fVar = bundle3 != null ? (com.applovin.impl.sd.f) com.applovin.impl.sd.f.h.a(bundle3) : null;
            boolean z3 = bundle.getBoolean(a(8), false);
            long j4 = bundle.getLong(a(9), 0L);
            long j5 = bundle.getLong(a(10), androidx.media3.common.C.TIME_UNSET);
            int i = bundle.getInt(a(11), 0);
            int i2 = bundle.getInt(a(12), 0);
            long j6 = bundle.getLong(a(13), 0L);
            com.applovin.impl.fo.d dVar = new com.applovin.impl.fo.d();
            dVar.a(t, sdVar, null, j, j2, j3, z, z2, fVar, j4, j5, i, i2, j6);
            dVar.m = z3;
            return dVar;
        }

        public long a() {
            return com.applovin.impl.xp.a(this.h);
        }

        private static java.lang.String a(int i) {
            return java.lang.Integer.toString(i, 36);
        }

        public com.applovin.impl.fo.d a(java.lang.Object obj, com.applovin.impl.sd sdVar, java.lang.Object obj2, long j, long j2, long j3, boolean z, boolean z2, com.applovin.impl.sd.f fVar, long j4, long j5, int i, int i2, long j6) {
            com.applovin.impl.sd.g gVar;
            this.f794a = obj;
            this.c = sdVar != null ? sdVar : u;
            this.b = (sdVar == null || (gVar = sdVar.b) == null) ? null : gVar.g;
            this.d = obj2;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = z;
            this.j = z2;
            this.k = fVar != null;
            this.l = fVar;
            this.n = j4;
            this.o = j5;
            this.p = i;
            this.q = i2;
            this.r = j6;
            this.m = false;
            return this;
        }
    }

    public static final class b implements com.applovin.impl.o2 {
        public static final com.applovin.impl.o2.a i = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.fo$b$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.o2.a
            public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
                return com.applovin.impl.fo.b.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.Object f793a;
        public java.lang.Object b;
        public int c;
        public long d;
        public long f;
        public boolean g;
        private com.applovin.impl.u h = com.applovin.impl.u.h;

        public long e() {
            return this.f;
        }

        public int f() {
            return this.h.f;
        }

        public int d(int i2) {
            return this.h.a(i2).a();
        }

        public int b(long j) {
            return this.h.b(j, this.d);
        }

        public long c(int i2) {
            return this.h.a(i2).g;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !com.applovin.impl.fo.b.class.equals(obj.getClass())) {
                return false;
            }
            com.applovin.impl.fo.b bVar = (com.applovin.impl.fo.b) obj;
            return com.applovin.impl.xp.a(this.f793a, bVar.f793a) && com.applovin.impl.xp.a(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.f == bVar.f && this.g == bVar.g && com.applovin.impl.xp.a(this.h, bVar.h);
        }

        public int hashCode() {
            java.lang.Object obj = this.f793a;
            int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
            java.lang.Object obj2 = this.b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
            long j = this.d;
            int i2 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f;
            return ((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + this.h.hashCode();
        }

        private static java.lang.String g(int i2) {
            return java.lang.Integer.toString(i2, 36);
        }

        public long d() {
            return com.applovin.impl.t2.b(this.f);
        }

        public boolean e(int i2) {
            return !this.h.a(i2).b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.applovin.impl.fo.b a(android.os.Bundle bundle) {
            com.applovin.impl.u uVar;
            int i2 = bundle.getInt(g(0), 0);
            long j = bundle.getLong(g(1), androidx.media3.common.C.TIME_UNSET);
            long j2 = bundle.getLong(g(2), 0L);
            boolean z = bundle.getBoolean(g(3));
            android.os.Bundle bundle2 = bundle.getBundle(g(4));
            if (bundle2 != null) {
                uVar = (com.applovin.impl.u) com.applovin.impl.u.j.a(bundle2);
            } else {
                uVar = com.applovin.impl.u.h;
            }
            com.applovin.impl.u uVar2 = uVar;
            com.applovin.impl.fo.b bVar = new com.applovin.impl.fo.b();
            bVar.a(null, null, i2, j, j2, uVar2, z);
            return bVar;
        }

        public long b(int i2) {
            return this.h.a(i2).f1377a;
        }

        public long c() {
            return this.d;
        }

        public boolean f(int i2) {
            return this.h.a(i2).h;
        }

        public int a(int i2) {
            return this.h.a(i2).b;
        }

        public long b() {
            return this.h.c;
        }

        public int b(int i2, int i3) {
            return this.h.a(i2).a(i3);
        }

        public long a(int i2, int i3) {
            com.applovin.impl.u.a aVarA = this.h.a(i2);
            return aVarA.b != -1 ? aVarA.f[i3] : androidx.media3.common.C.TIME_UNSET;
        }

        public int a() {
            return this.h.b;
        }

        public int a(long j) {
            return this.h.a(j, this.d);
        }

        public com.applovin.impl.fo.b a(java.lang.Object obj, java.lang.Object obj2, int i2, long j, long j2) {
            return a(obj, obj2, i2, j, j2, com.applovin.impl.u.h, false);
        }

        public com.applovin.impl.fo.b a(java.lang.Object obj, java.lang.Object obj2, int i2, long j, long j2, com.applovin.impl.u uVar, boolean z) {
            this.f793a = obj;
            this.b = obj2;
            this.c = i2;
            this.d = j;
            this.f = j2;
            this.h = uVar;
            this.g = z;
            return this;
        }
    }

    public final boolean c() {
        return b() == 0;
    }

    public int b(boolean z) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.fo)) {
            return false;
        }
        com.applovin.impl.fo foVar = (com.applovin.impl.fo) obj;
        if (foVar.b() != b() || foVar.a() != a()) {
            return false;
        }
        com.applovin.impl.fo.d dVar = new com.applovin.impl.fo.d();
        com.applovin.impl.fo.b bVar = new com.applovin.impl.fo.b();
        com.applovin.impl.fo.d dVar2 = new com.applovin.impl.fo.d();
        com.applovin.impl.fo.b bVar2 = new com.applovin.impl.fo.b();
        for (int i = 0; i < b(); i++) {
            if (!a(i, dVar).equals(foVar.a(i, dVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < a(); i2++) {
            if (!a(i2, bVar, true).equals(foVar.a(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        com.applovin.impl.fo.d dVar = new com.applovin.impl.fo.d();
        com.applovin.impl.fo.b bVar = new com.applovin.impl.fo.b();
        int iB = b() + 217;
        for (int i = 0; i < b(); i++) {
            iB = (iB * 31) + a(i, dVar).hashCode();
        }
        int iA = (iB * 31) + a();
        for (int i2 = 0; i2 < a(); i2++) {
            iA = (iA * 31) + a(i2, bVar, true).hashCode();
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.applovin.impl.fo a(android.os.Bundle bundle) {
        com.applovin.impl.db dbVarA = a(com.applovin.impl.fo.d.v, com.applovin.impl.n2.a(bundle, c(0)));
        com.applovin.impl.db dbVarA2 = a(com.applovin.impl.fo.b.i, com.applovin.impl.n2.a(bundle, c(1)));
        int[] intArray = bundle.getIntArray(c(2));
        if (intArray == null) {
            intArray = a(dbVarA.size());
        }
        return new com.applovin.impl.fo.c(dbVarA, dbVarA2, intArray);
    }

    public static final class c extends com.applovin.impl.fo {
        private final com.applovin.impl.db c;
        private final com.applovin.impl.db d;
        private final int[] f;
        private final int[] g;

        public c(com.applovin.impl.db dbVar, com.applovin.impl.db dbVar2, int[] iArr) {
            com.applovin.impl.b1.a(dbVar.size() == iArr.length);
            this.c = dbVar;
            this.d = dbVar2;
            this.f = iArr;
            this.g = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.g[iArr[i]] = i;
            }
        }

        @Override // com.applovin.impl.fo
        public int b(boolean z) {
            if (c()) {
                return -1;
            }
            if (z) {
                return this.f[b() - 1];
            }
            return b() - 1;
        }

        @Override // com.applovin.impl.fo
        public int a(boolean z) {
            if (c()) {
                return -1;
            }
            if (z) {
                return this.f[0];
            }
            return 0;
        }

        @Override // com.applovin.impl.fo
        public int a(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != b(z)) {
                return z ? this.f[this.g[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }

        @Override // com.applovin.impl.fo
        public int b(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != a(z)) {
                return z ? this.f[this.g[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return b(z);
            }
            return -1;
        }

        @Override // com.applovin.impl.fo
        public int b() {
            return this.c.size();
        }

        @Override // com.applovin.impl.fo
        public java.lang.Object b(int i) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.applovin.impl.fo
        public com.applovin.impl.fo.b a(int i, com.applovin.impl.fo.b bVar, boolean z) {
            com.applovin.impl.fo.b bVar2 = (com.applovin.impl.fo.b) this.d.get(i);
            bVar.a(bVar2.f793a, bVar2.b, bVar2.c, bVar2.d, bVar2.f, bVar2.h, bVar2.g);
            return bVar;
        }

        @Override // com.applovin.impl.fo
        public int a() {
            return this.d.size();
        }

        @Override // com.applovin.impl.fo
        public com.applovin.impl.fo.d a(int i, com.applovin.impl.fo.d dVar, long j) {
            com.applovin.impl.fo.d dVar2 = (com.applovin.impl.fo.d) this.c.get(i);
            dVar.a(dVar2.f794a, dVar2.c, dVar2.d, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.j, dVar2.l, dVar2.n, dVar2.o, dVar2.p, dVar2.q, dVar2.r);
            dVar.m = dVar2.m;
            return dVar;
        }

        @Override // com.applovin.impl.fo
        public int a(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public int b(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? b(z) : i - 1;
        }
        throw new java.lang.IllegalStateException();
    }

    private static java.lang.String c(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    private static com.applovin.impl.db a(com.applovin.impl.o2.a aVar, android.os.IBinder iBinder) {
        if (iBinder == null) {
            return com.applovin.impl.db.h();
        }
        com.applovin.impl.db.a aVar2 = new com.applovin.impl.db.a();
        com.applovin.impl.db dbVarA = com.applovin.impl.m2.a(iBinder);
        for (int i = 0; i < dbVarA.size(); i++) {
            aVar2.b(aVar.a((android.os.Bundle) dbVarA.get(i)));
        }
        return aVar2.a();
    }

    public final boolean b(int i, com.applovin.impl.fo.b bVar, com.applovin.impl.fo.d dVar, int i2, boolean z) {
        return a(i, bVar, dVar, i2, z) == -1;
    }

    private static int[] a(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    public int a(boolean z) {
        return c() ? -1 : 0;
    }

    public final int a(int i, com.applovin.impl.fo.b bVar, com.applovin.impl.fo.d dVar, int i2, boolean z) {
        int i3 = a(i, bVar).c;
        if (a(i3, dVar).q != i) {
            return i + 1;
        }
        int iA = a(i3, i2, z);
        if (iA == -1) {
            return -1;
        }
        return a(iA, dVar).p;
    }

    public int a(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == b(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == b(z) ? a(z) : i + 1;
        }
        throw new java.lang.IllegalStateException();
    }

    public final com.applovin.impl.fo.b a(int i, com.applovin.impl.fo.b bVar) {
        return a(i, bVar, false);
    }

    public com.applovin.impl.fo.b a(java.lang.Object obj, com.applovin.impl.fo.b bVar) {
        return a(a(obj), bVar, true);
    }

    public final android.util.Pair a(com.applovin.impl.fo.d dVar, com.applovin.impl.fo.b bVar, int i, long j) {
        return (android.util.Pair) com.applovin.impl.b1.a(a(dVar, bVar, i, j, 0L));
    }

    public final android.util.Pair a(com.applovin.impl.fo.d dVar, com.applovin.impl.fo.b bVar, int i, long j, long j2) {
        com.applovin.impl.b1.a(i, 0, b());
        a(i, dVar, j2);
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = dVar.c();
            if (j == androidx.media3.common.C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = dVar.p;
        a(i2, bVar);
        while (i2 < dVar.q && bVar.f != j) {
            int i3 = i2 + 1;
            if (a(i3, bVar).f > j) {
                break;
            }
            i2 = i3;
        }
        a(i2, bVar, true);
        long jMin = j - bVar.f;
        long j3 = bVar.d;
        if (j3 != androidx.media3.common.C.TIME_UNSET) {
            jMin = java.lang.Math.min(jMin, j3 - 1);
        }
        return android.util.Pair.create(com.applovin.impl.b1.a(bVar.b), java.lang.Long.valueOf(java.lang.Math.max(0L, jMin)));
    }

    public final com.applovin.impl.fo.d a(int i, com.applovin.impl.fo.d dVar) {
        return a(i, dVar, 0L);
    }
}
