package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ih implements com.applovin.impl.dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.p7 f887a;
    private final com.applovin.impl.zg b = new com.applovin.impl.zg(new byte[10]);
    private int c = 0;
    private int d;
    private com.applovin.impl.ho e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public ih(com.applovin.impl.p7 p7Var) {
        this.f887a = p7Var;
    }

    @Override // com.applovin.impl.dp
    public final void a(com.applovin.impl.ah ahVar, int i) {
        com.applovin.impl.b1.b(this.e);
        if ((i & 1) != 0) {
            int i2 = this.c;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    com.applovin.impl.oc.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException();
                    }
                    if (this.j != -1) {
                        com.applovin.impl.oc.d("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    this.f887a.b();
                }
            }
            a(1);
        }
        while (ahVar.a() > 0) {
            int i3 = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (a(ahVar, this.b.f1572a, java.lang.Math.min(10, this.i)) && a(ahVar, (byte[]) null, this.i)) {
                            c();
                            i |= this.k ? 4 : 0;
                            this.f887a.a(this.l, i);
                            a(3);
                        }
                    } else {
                        if (i3 != 3) {
                            throw new java.lang.IllegalStateException();
                        }
                        int iA = ahVar.a();
                        int i4 = this.j;
                        int i5 = i4 != -1 ? iA - i4 : 0;
                        if (i5 > 0) {
                            iA -= i5;
                            ahVar.e(ahVar.d() + iA);
                        }
                        this.f887a.a(ahVar);
                        int i6 = this.j;
                        if (i6 != -1) {
                            int i7 = i6 - iA;
                            this.j = i7;
                            if (i7 == 0) {
                                this.f887a.b();
                                a(1);
                            }
                        }
                    }
                } else if (a(ahVar, this.b.f1572a, 9)) {
                    a(b() ? 2 : 0);
                }
            } else {
                ahVar.g(ahVar.a());
            }
        }
    }

    private boolean b() {
        this.b.c(0);
        int iA = this.b.a(24);
        if (iA != 1) {
            com.applovin.impl.oc.d("PesReader", "Unexpected start code prefix: " + iA);
            this.j = -1;
            return false;
        }
        this.b.d(8);
        int iA2 = this.b.a(16);
        this.b.d(5);
        this.k = this.b.f();
        this.b.d(2);
        this.f = this.b.f();
        this.g = this.b.f();
        this.b.d(6);
        int iA3 = this.b.a(8);
        this.i = iA3;
        if (iA2 == 0) {
            this.j = -1;
        } else {
            int i = (iA2 - 3) - iA3;
            this.j = i;
            if (i < 0) {
                com.applovin.impl.oc.d("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }

    private void c() {
        this.b.c(0);
        this.l = androidx.media3.common.C.TIME_UNSET;
        if (this.f) {
            this.b.d(4);
            long jA = ((long) this.b.a(3)) << 30;
            this.b.d(1);
            long jA2 = jA | ((long) (this.b.a(15) << 15));
            this.b.d(1);
            long jA3 = jA2 | ((long) this.b.a(15));
            this.b.d(1);
            if (!this.h && this.g) {
                this.b.d(4);
                long jA4 = ((long) this.b.a(3)) << 30;
                this.b.d(1);
                long jA5 = jA4 | ((long) (this.b.a(15) << 15));
                this.b.d(1);
                long jA6 = jA5 | ((long) this.b.a(15));
                this.b.d(1);
                this.e.b(jA6);
                this.h = true;
            }
            this.l = this.e.b(jA3);
        }
    }

    private boolean a(com.applovin.impl.ah ahVar, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(ahVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            ahVar.g(iMin);
        } else {
            ahVar.a(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // com.applovin.impl.dp
    public void a(com.applovin.impl.ho hoVar, com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        this.e = hoVar;
        this.f887a.a(l8Var, dVar);
    }

    @Override // com.applovin.impl.dp
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.f887a.a();
    }

    private void a(int i) {
        this.c = i;
        this.d = 0;
    }
}
