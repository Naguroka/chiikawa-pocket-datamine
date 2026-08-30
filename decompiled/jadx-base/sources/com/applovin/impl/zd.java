package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.fo.b f1569a = new com.applovin.impl.fo.b();
    private final com.applovin.impl.fo.d b = new com.applovin.impl.fo.d();
    private final com.applovin.impl.r0 c;
    private final android.os.Handler d;
    private long e;
    private int f;
    private boolean g;
    private com.applovin.impl.wd h;
    private com.applovin.impl.wd i;
    private com.applovin.impl.wd j;
    private int k;
    private java.lang.Object l;
    private long m;

    private boolean a(long j, long j2) {
        return j == androidx.media3.common.C.TIME_UNSET || j == j2;
    }

    public zd(com.applovin.impl.r0 r0Var, android.os.Handler handler) {
        this.c = r0Var;
        this.d = handler;
    }

    public boolean h() {
        com.applovin.impl.wd wdVar = this.j;
        return wdVar == null || (!wdVar.f.i && wdVar.j() && this.j.f.e != androidx.media3.common.C.TIME_UNSET && this.k < 100);
    }

    public com.applovin.impl.wd d() {
        return this.j;
    }

    public com.applovin.impl.wd e() {
        return this.h;
    }

    public com.applovin.impl.wd f() {
        return this.i;
    }

    public com.applovin.impl.wd b() {
        com.applovin.impl.wd wdVar = this.i;
        com.applovin.impl.b1.b((wdVar == null || wdVar.d() == null) ? false : true);
        this.i = this.i.d();
        g();
        return this.i;
    }

    public com.applovin.impl.wd a() {
        com.applovin.impl.wd wdVar = this.h;
        if (wdVar == null) {
            return null;
        }
        if (wdVar == this.i) {
            this.i = wdVar.d();
        }
        this.h.l();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            com.applovin.impl.wd wdVar2 = this.h;
            this.l = wdVar2.b;
            this.m = wdVar2.f.f1538a.d;
        }
        this.h = this.h.d();
        g();
        return this.h;
    }

    public void c() {
        if (this.k == 0) {
            return;
        }
        com.applovin.impl.wd wdVarD = (com.applovin.impl.wd) com.applovin.impl.b1.b(this.h);
        this.l = wdVarD.b;
        this.m = wdVarD.f.f1538a.d;
        while (wdVarD != null) {
            wdVarD.l();
            wdVarD = wdVarD.d();
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        g();
    }

    private void g() {
        if (this.c != null) {
            final com.applovin.impl.db.a aVarF = com.applovin.impl.db.f();
            for (com.applovin.impl.wd wdVarD = this.h; wdVarD != null; wdVarD = wdVarD.d()) {
                aVarF.b(wdVarD.f.f1538a);
            }
            com.applovin.impl.wd wdVar = this.i;
            final com.applovin.impl.ae.a aVar = wdVar == null ? null : wdVar.f.f1538a;
            this.d.post(new java.lang.Runnable() { // from class: com.applovin.impl.zd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(aVarF, aVar);
                }
            });
        }
    }

    private boolean a(com.applovin.impl.yd ydVar, com.applovin.impl.yd ydVar2) {
        return ydVar.b == ydVar2.b && ydVar.f1538a.equals(ydVar2.f1538a);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public com.applovin.impl.wd a(com.applovin.impl.ri[] riVarArr, com.applovin.impl.vo voVar, com.applovin.impl.n0 n0Var, com.applovin.impl.ee eeVar, com.applovin.impl.yd ydVar, com.applovin.impl.wo woVar) {
        long jF;
        com.applovin.impl.wd wdVar = this.j;
        if (wdVar == null) {
            if (ydVar.f1538a.a()) {
                jF = ydVar.c;
                if (jF == androidx.media3.common.C.TIME_UNSET) {
                    jF = 0;
                }
            } else {
                jF = 0;
            }
        } else {
            jF = (wdVar.f() + this.j.f.e) - ydVar.b;
        }
        com.applovin.impl.wd wdVar2 = new com.applovin.impl.wd(riVarArr, jF, voVar, n0Var, eeVar, ydVar, woVar);
        com.applovin.impl.wd wdVar3 = this.j;
        if (wdVar3 != null) {
            wdVar3.a(wdVar2);
        } else {
            this.h = wdVar2;
            this.i = wdVar2;
        }
        this.l = null;
        this.j = wdVar2;
        this.k++;
        g();
        return wdVar2;
    }

    private com.applovin.impl.yd a(com.applovin.impl.oh ohVar) {
        return a(ohVar.f1125a, ohVar.b, ohVar.c, ohVar.s);
    }

    private com.applovin.impl.yd a(com.applovin.impl.fo foVar, com.applovin.impl.wd wdVar, long j) {
        long j2;
        com.applovin.impl.yd ydVar = wdVar.f;
        long jF = (wdVar.f() + ydVar.e) - j;
        if (ydVar.g) {
            long j3 = 0;
            int iA = foVar.a(foVar.a(ydVar.f1538a.f1504a), this.f1569a, this.b, this.f, this.g);
            if (iA == -1) {
                return null;
            }
            int i = foVar.a(iA, this.f1569a, true).c;
            java.lang.Object obj = this.f1569a.b;
            long j4 = ydVar.f1538a.d;
            if (foVar.a(i, this.b).p == iA) {
                android.util.Pair pairA = foVar.a(this.b, this.f1569a, i, androidx.media3.common.C.TIME_UNSET, java.lang.Math.max(0L, jF));
                if (pairA == null) {
                    return null;
                }
                obj = pairA.first;
                long jLongValue = ((java.lang.Long) pairA.second).longValue();
                com.applovin.impl.wd wdVarD = wdVar.d();
                if (wdVarD != null && wdVarD.b.equals(obj)) {
                    j4 = wdVarD.f.f1538a.d;
                } else {
                    j4 = this.e;
                    this.e = 1 + j4;
                }
                j2 = jLongValue;
                j3 = androidx.media3.common.C.TIME_UNSET;
            } else {
                j2 = 0;
            }
            return a(foVar, a(foVar, obj, j2, j4, this.f1569a), j3, j2);
        }
        com.applovin.impl.ae.a aVar = ydVar.f1538a;
        foVar.a(aVar.f1504a, this.f1569a);
        if (aVar.a()) {
            int i2 = aVar.b;
            int iA2 = this.f1569a.a(i2);
            if (iA2 == -1) {
                return null;
            }
            int iB = this.f1569a.b(i2, aVar.c);
            if (iB < iA2) {
                return a(foVar, aVar.f1504a, i2, iB, ydVar.c, aVar.d);
            }
            long jLongValue2 = ydVar.c;
            if (jLongValue2 == androidx.media3.common.C.TIME_UNSET) {
                com.applovin.impl.fo.d dVar = this.b;
                com.applovin.impl.fo.b bVar = this.f1569a;
                android.util.Pair pairA2 = foVar.a(dVar, bVar, bVar.c, androidx.media3.common.C.TIME_UNSET, java.lang.Math.max(0L, jF));
                if (pairA2 == null) {
                    return null;
                }
                jLongValue2 = ((java.lang.Long) pairA2.second).longValue();
            }
            return a(foVar, aVar.f1504a, java.lang.Math.max(a(foVar, aVar.f1504a, aVar.b), jLongValue2), ydVar.c, aVar.d);
        }
        int iD = this.f1569a.d(aVar.e);
        if (iD == this.f1569a.a(aVar.e)) {
            return a(foVar, aVar.f1504a, a(foVar, aVar.f1504a, aVar.e), ydVar.e, aVar.d);
        }
        return a(foVar, aVar.f1504a, aVar.e, iD, ydVar.e, aVar.d);
    }

    private com.applovin.impl.yd a(com.applovin.impl.fo foVar, com.applovin.impl.ae.a aVar, long j, long j2) {
        foVar.a(aVar.f1504a, this.f1569a);
        if (aVar.a()) {
            return a(foVar, aVar.f1504a, aVar.b, aVar.c, j, aVar.d);
        }
        return a(foVar, aVar.f1504a, j2, j, aVar.d);
    }

    private com.applovin.impl.yd a(com.applovin.impl.fo foVar, java.lang.Object obj, int i, int i2, long j, long j2) {
        com.applovin.impl.ae.a aVar = new com.applovin.impl.ae.a(obj, i, i2, j2);
        long jA = foVar.a(aVar.f1504a, this.f1569a).a(aVar.b, aVar.c);
        long jB = i2 == this.f1569a.d(i) ? this.f1569a.b() : 0L;
        return new com.applovin.impl.yd(aVar, (jA == androidx.media3.common.C.TIME_UNSET || jB < jA) ? jB : java.lang.Math.max(0L, jA - 1), j, androidx.media3.common.C.TIME_UNSET, jA, this.f1569a.f(aVar.b), false, false, false);
    }

    private com.applovin.impl.yd a(com.applovin.impl.fo foVar, java.lang.Object obj, long j, long j2, long j3) {
        long jMax = j;
        foVar.a(obj, this.f1569a);
        int iA = this.f1569a.a(jMax);
        com.applovin.impl.ae.a aVar = new com.applovin.impl.ae.a(obj, j3, iA);
        boolean zA = a(aVar);
        boolean zA2 = a(foVar, aVar);
        boolean zA3 = a(foVar, aVar, zA);
        boolean z = iA != -1 && this.f1569a.f(iA);
        long jB = iA != -1 ? this.f1569a.b(iA) : -9223372036854775807L;
        long j4 = (jB == androidx.media3.common.C.TIME_UNSET || jB == Long.MIN_VALUE) ? this.f1569a.d : jB;
        if (j4 != androidx.media3.common.C.TIME_UNSET && jMax >= j4) {
            jMax = java.lang.Math.max(0L, j4 - 1);
        }
        return new com.applovin.impl.yd(aVar, jMax, j2, jB, j4, z, zA, zA2, zA3);
    }

    private long a(com.applovin.impl.fo foVar, java.lang.Object obj, int i) {
        foVar.a(obj, this.f1569a);
        long jB = this.f1569a.b(i);
        if (jB == Long.MIN_VALUE) {
            return this.f1569a.d;
        }
        return jB + this.f1569a.c(i);
    }

    public com.applovin.impl.yd a(long j, com.applovin.impl.oh ohVar) {
        com.applovin.impl.wd wdVar = this.j;
        if (wdVar == null) {
            return a(ohVar);
        }
        return a(ohVar.f1125a, wdVar, j);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    public com.applovin.impl.yd a(com.applovin.impl.fo foVar, com.applovin.impl.yd ydVar) {
        long jC;
        long j;
        int i;
        boolean zF;
        int i2;
        com.applovin.impl.ae.a aVar = ydVar.f1538a;
        boolean zA = a(aVar);
        boolean zA2 = a(foVar, aVar);
        boolean zA3 = a(foVar, aVar, zA);
        foVar.a(ydVar.f1538a.f1504a, this.f1569a);
        long jB = (aVar.a() || (i2 = aVar.e) == -1) ? -9223372036854775807L : this.f1569a.b(i2);
        if (aVar.a()) {
            jC = this.f1569a.a(aVar.b, aVar.c);
        } else {
            if (jB == androidx.media3.common.C.TIME_UNSET || jB == Long.MIN_VALUE) {
                jC = this.f1569a.c();
            } else {
                j = jB;
            }
            if (aVar.a()) {
                zF = this.f1569a.f(aVar.b);
            } else {
                i = aVar.e;
                if (i == -1 && this.f1569a.f(i)) {
                    zF = true;
                } else {
                    zF = false;
                }
            }
            return new com.applovin.impl.yd(aVar, ydVar.b, ydVar.c, jB, j, zF, zA, zA2, zA3);
        }
        j = jC;
        if (aVar.a()) {
            zF = this.f1569a.f(aVar.b);
        } else {
            i = aVar.e;
            if (i == -1) {
                zF = false;
            } else {
                zF = false;
            }
        }
        return new com.applovin.impl.yd(aVar, ydVar.b, ydVar.c, jB, j, zF, zA, zA2, zA3);
    }

    private boolean a(com.applovin.impl.ae.a aVar) {
        return !aVar.a() && aVar.e == -1;
    }

    private boolean a(com.applovin.impl.fo foVar, com.applovin.impl.ae.a aVar, boolean z) {
        int iA = foVar.a(aVar.f1504a);
        return !foVar.a(foVar.a(iA, this.f1569a).c, this.b).j && foVar.b(iA, this.f1569a, this.b, this.f, this.g) && z;
    }

    private boolean a(com.applovin.impl.fo foVar, com.applovin.impl.ae.a aVar) {
        if (a(aVar)) {
            return foVar.a(foVar.a(aVar.f1504a, this.f1569a).c, this.b).q == foVar.a(aVar.f1504a);
        }
        return false;
    }

    public boolean a(com.applovin.impl.vd vdVar) {
        com.applovin.impl.wd wdVar = this.j;
        return wdVar != null && wdVar.f1464a == vdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.db.a aVar, com.applovin.impl.ae.a aVar2) {
        this.c.a(aVar.a(), aVar2);
    }

    public void a(long j) {
        com.applovin.impl.wd wdVar = this.j;
        if (wdVar != null) {
            wdVar.b(j);
        }
    }

    public boolean a(com.applovin.impl.wd wdVar) {
        boolean z = false;
        com.applovin.impl.b1.b(wdVar != null);
        if (wdVar.equals(this.j)) {
            return false;
        }
        this.j = wdVar;
        while (wdVar.d() != null) {
            wdVar = wdVar.d();
            if (wdVar == this.i) {
                this.i = this.h;
                z = true;
            }
            wdVar.l();
            this.k--;
        }
        this.j.a((com.applovin.impl.wd) null);
        g();
        return z;
    }

    public com.applovin.impl.ae.a a(com.applovin.impl.fo foVar, java.lang.Object obj, long j) {
        return a(foVar, obj, j, a(foVar, obj), this.f1569a);
    }

    private static com.applovin.impl.ae.a a(com.applovin.impl.fo foVar, java.lang.Object obj, long j, long j2, com.applovin.impl.fo.b bVar) {
        foVar.a(obj, bVar);
        int iB = bVar.b(j);
        if (iB == -1) {
            return new com.applovin.impl.ae.a(obj, j2, bVar.a(j));
        }
        return new com.applovin.impl.ae.a(obj, iB, bVar.d(iB), j2);
    }

    private long a(com.applovin.impl.fo foVar, java.lang.Object obj) {
        int iA;
        int i = foVar.a(obj, this.f1569a).c;
        java.lang.Object obj2 = this.l;
        if (obj2 != null && (iA = foVar.a(obj2)) != -1 && foVar.a(iA, this.f1569a).c == i) {
            return this.m;
        }
        for (com.applovin.impl.wd wdVarD = this.h; wdVarD != null; wdVarD = wdVarD.d()) {
            if (wdVarD.b.equals(obj)) {
                return wdVarD.f.f1538a.d;
            }
        }
        for (com.applovin.impl.wd wdVarD2 = this.h; wdVarD2 != null; wdVarD2 = wdVarD2.d()) {
            int iA2 = foVar.a(wdVarD2.b);
            if (iA2 != -1 && foVar.a(iA2, this.f1569a).c == i) {
                return wdVarD2.f.f1538a.d;
            }
        }
        long j = this.e;
        this.e = 1 + j;
        if (this.h == null) {
            this.l = obj;
            this.m = j;
        }
        return j;
    }

    private boolean a(com.applovin.impl.fo foVar) {
        com.applovin.impl.wd wdVarD = this.h;
        if (wdVarD == null) {
            return true;
        }
        int iA = foVar.a(wdVarD.b);
        while (true) {
            iA = foVar.a(iA, this.f1569a, this.b, this.f, this.g);
            while (wdVarD.d() != null && !wdVarD.f.g) {
                wdVarD = wdVarD.d();
            }
            com.applovin.impl.wd wdVarD2 = wdVarD.d();
            if (iA == -1 || wdVarD2 == null || foVar.a(wdVarD2.b) != iA) {
                break;
            }
            wdVarD = wdVarD2;
        }
        boolean zA = a(wdVarD);
        wdVarD.f = a(foVar, wdVarD.f);
        return !zA;
    }

    public boolean a(com.applovin.impl.fo foVar, long j, long j2) {
        boolean zA;
        com.applovin.impl.yd ydVarA;
        com.applovin.impl.wd wdVarD = this.h;
        com.applovin.impl.wd wdVar = null;
        while (wdVarD != null) {
            com.applovin.impl.yd ydVar = wdVarD.f;
            if (wdVar == null) {
                ydVarA = a(foVar, ydVar);
            } else {
                com.applovin.impl.yd ydVarA2 = a(foVar, wdVar, j);
                if (ydVarA2 == null) {
                    zA = a(wdVar);
                } else if (a(ydVar, ydVarA2)) {
                    ydVarA = ydVarA2;
                } else {
                    zA = a(wdVar);
                }
                return !zA;
            }
            wdVarD.f = ydVarA.a(ydVar.c);
            if (!a(ydVar.e, ydVarA.e)) {
                wdVarD.m();
                long j3 = ydVarA.e;
                return (a(wdVarD) || (wdVarD == this.i && !wdVarD.f.f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j3 > androidx.media3.common.C.TIME_UNSET ? 1 : (j3 == androidx.media3.common.C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : wdVarD.e(j3)) ? 1 : (j2 == ((j3 > androidx.media3.common.C.TIME_UNSET ? 1 : (j3 == androidx.media3.common.C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : wdVarD.e(j3)) ? 0 : -1)) >= 0))) ? false : true;
            }
            wdVar = wdVarD;
            wdVarD = wdVarD.d();
        }
        return true;
    }

    public boolean a(com.applovin.impl.fo foVar, int i) {
        this.f = i;
        return a(foVar);
    }

    public boolean a(com.applovin.impl.fo foVar, boolean z) {
        this.g = z;
        return a(foVar);
    }
}
