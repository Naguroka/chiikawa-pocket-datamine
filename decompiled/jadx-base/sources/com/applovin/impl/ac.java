package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ac implements com.applovin.impl.p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f589a;
    private final com.applovin.impl.ah b;
    private final com.applovin.impl.zg c;
    private com.applovin.impl.qo d;
    private java.lang.String e;
    private com.applovin.impl.e9 f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;
    private java.lang.String u;

    @Override // com.applovin.impl.p7
    public void b() {
    }

    public ac(java.lang.String str) {
        this.f589a = str;
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(1024);
        this.b = ahVar;
        this.c = new com.applovin.impl.zg(ahVar.c());
        this.k = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.ah ahVar) throws com.applovin.impl.ch {
        com.applovin.impl.b1.b(this.d);
        while (ahVar.a() > 0) {
            int i = this.g;
            if (i != 0) {
                if (i == 1) {
                    int iW = ahVar.w();
                    if ((iW & 224) == 224) {
                        this.j = iW;
                        this.g = 2;
                    } else if (iW != 86) {
                        this.g = 0;
                    }
                } else if (i == 2) {
                    int iW2 = ((this.j & (-225)) << 8) | ahVar.w();
                    this.i = iW2;
                    if (iW2 > this.b.c().length) {
                        a(this.i);
                    }
                    this.h = 0;
                    this.g = 3;
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException();
                    }
                    int iMin = java.lang.Math.min(ahVar.a(), this.i - this.h);
                    ahVar.a(this.c.f1572a, this.h, iMin);
                    int i2 = this.h + iMin;
                    this.h = i2;
                    if (i2 == this.i) {
                        this.c.c(0);
                        b(this.c);
                        this.g = 0;
                    }
                }
            } else if (ahVar.w() == 86) {
                this.g = 1;
            }
        }
    }

    private void b(com.applovin.impl.zg zgVar) throws com.applovin.impl.ch {
        if (!zgVar.f()) {
            this.l = true;
            f(zgVar);
        } else if (!this.l) {
            return;
        }
        if (this.m == 0) {
            if (this.n == 0) {
                a(zgVar, e(zgVar));
                if (this.p) {
                    zgVar.d((int) this.q);
                    return;
                }
                return;
            }
            throw com.applovin.impl.ch.a(null, null);
        }
        throw com.applovin.impl.ch.a(null, null);
    }

    private void f(com.applovin.impl.zg zgVar) throws com.applovin.impl.ch {
        boolean zF;
        int iA = zgVar.a(1);
        int iA2 = iA == 1 ? zgVar.a(1) : 0;
        this.m = iA2;
        if (iA2 == 0) {
            if (iA == 1) {
                a(zgVar);
            }
            if (zgVar.f()) {
                this.n = zgVar.a(6);
                int iA3 = zgVar.a(4);
                int iA4 = zgVar.a(3);
                if (iA3 == 0 && iA4 == 0) {
                    if (iA == 0) {
                        int iE = zgVar.e();
                        int iC = c(zgVar);
                        zgVar.c(iE);
                        byte[] bArr = new byte[(iC + 7) / 8];
                        zgVar.a(bArr, 0, iC);
                        com.applovin.impl.e9 e9VarA = new com.applovin.impl.e9.b().c(this.e).f(androidx.media3.common.MimeTypes.AUDIO_AAC).a(this.u).c(this.t).n(this.r).a(java.util.Collections.singletonList(bArr)).e(this.f589a).a();
                        if (!e9VarA.equals(this.f)) {
                            this.f = e9VarA;
                            this.s = 1024000000 / ((long) e9VarA.A);
                            this.d.a(e9VarA);
                        }
                    } else {
                        zgVar.d(((int) a(zgVar)) - c(zgVar));
                    }
                    d(zgVar);
                    boolean zF2 = zgVar.f();
                    this.p = zF2;
                    this.q = 0L;
                    if (zF2) {
                        if (iA == 1) {
                            this.q = a(zgVar);
                        } else {
                            do {
                                zF = zgVar.f();
                                this.q = (this.q << 8) + ((long) zgVar.a(8));
                            } while (zF);
                        }
                    }
                    if (zgVar.f()) {
                        zgVar.d(8);
                        return;
                    }
                    return;
                }
                throw com.applovin.impl.ch.a(null, null);
            }
            throw com.applovin.impl.ch.a(null, null);
        }
        throw com.applovin.impl.ch.a(null, null);
    }

    private void d(com.applovin.impl.zg zgVar) {
        int iA = zgVar.a(3);
        this.o = iA;
        if (iA == 0) {
            zgVar.d(8);
            return;
        }
        if (iA == 1) {
            zgVar.d(9);
            return;
        }
        if (iA == 3 || iA == 4 || iA == 5) {
            zgVar.d(6);
        } else {
            if (iA != 6 && iA != 7) {
                throw new java.lang.IllegalStateException();
            }
            zgVar.d(1);
        }
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        dVar.a();
        this.d = l8Var.a(dVar.c(), 1);
        this.e = dVar.b();
    }

    private int c(com.applovin.impl.zg zgVar) throws com.applovin.impl.ch {
        int iB = zgVar.b();
        com.applovin.impl.a.b bVarA = com.applovin.impl.a.a(zgVar, true);
        this.u = bVarA.c;
        this.r = bVarA.f574a;
        this.t = bVarA.b;
        return iB - zgVar.b();
    }

    private int e(com.applovin.impl.zg zgVar) throws com.applovin.impl.ch {
        int iA;
        if (this.o != 0) {
            throw com.applovin.impl.ch.a(null, null);
        }
        int i = 0;
        do {
            iA = zgVar.a(8);
            i += iA;
        } while (iA == 255);
        return i;
    }

    private static long a(com.applovin.impl.zg zgVar) {
        return zgVar.a((zgVar.a(2) + 1) * 8);
    }

    @Override // com.applovin.impl.p7
    public void a(long j, int i) {
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.k = j;
        }
    }

    private void a(com.applovin.impl.zg zgVar, int i) {
        int iE = zgVar.e();
        if ((iE & 7) == 0) {
            this.b.f(iE >> 3);
        } else {
            zgVar.a(this.b.c(), 0, i * 8);
            this.b.f(0);
        }
        this.d.a(this.b, i);
        long j = this.k;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.d.a(j, 1, i, 0, null);
            this.k += this.s;
        }
    }

    private void a(int i) {
        this.b.d(i);
        this.c.a(this.b.c());
    }

    @Override // com.applovin.impl.p7
    public void a() {
        this.g = 0;
        this.k = androidx.media3.common.C.TIME_UNSET;
        this.l = false;
    }
}
