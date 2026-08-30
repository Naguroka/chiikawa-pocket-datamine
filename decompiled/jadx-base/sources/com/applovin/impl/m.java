package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements com.applovin.impl.p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.zg f1002a;
    private final com.applovin.impl.ah b;
    private final java.lang.String c;
    private java.lang.String d;
    private com.applovin.impl.qo e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private com.applovin.impl.e9 k;
    private int l;
    private long m;

    @Override // com.applovin.impl.p7
    public void b() {
    }

    public m() {
        this(null);
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.ah ahVar) {
        com.applovin.impl.b1.b(this.e);
        while (ahVar.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = java.lang.Math.min(ahVar.a(), this.l - this.g);
                        this.e.a(ahVar, iMin);
                        int i2 = this.g + iMin;
                        this.g = i2;
                        int i3 = this.l;
                        if (i2 == i3) {
                            long j = this.m;
                            if (j != androidx.media3.common.C.TIME_UNSET) {
                                this.e.a(j, 1, i3, 0, null);
                                this.m += this.j;
                            }
                            this.f = 0;
                        }
                    }
                } else if (a(ahVar, this.b.c(), 16)) {
                    c();
                    this.b.f(0);
                    this.e.a(this.b, 16);
                    this.f = 2;
                }
            } else if (b(ahVar)) {
                this.f = 1;
                this.b.c()[0] = -84;
                this.b.c()[1] = (byte) (this.i ? 65 : 64);
                this.g = 2;
            }
        }
    }

    public m(java.lang.String str) {
        com.applovin.impl.zg zgVar = new com.applovin.impl.zg(new byte[16]);
        this.f1002a = zgVar;
        this.b = new com.applovin.impl.ah(zgVar.f1572a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = androidx.media3.common.C.TIME_UNSET;
        this.c = str;
    }

    private boolean b(com.applovin.impl.ah ahVar) {
        while (true) {
            if (ahVar.a() <= 0) {
                return false;
            }
            if (!this.h) {
                this.h = ahVar.w() == 172;
            } else {
                int iW = ahVar.w();
                this.h = iW == 172;
                if (iW == 64 || iW == 65) {
                    this.i = iW == 65;
                    return true;
                }
            }
        }
    }

    private void c() {
        this.f1002a.c(0);
        com.applovin.impl.n.b bVarA = com.applovin.impl.n.a(this.f1002a);
        com.applovin.impl.e9 e9Var = this.k;
        if (e9Var == null || bVarA.c != e9Var.z || bVarA.b != e9Var.A || !androidx.media3.common.MimeTypes.AUDIO_AC4.equals(e9Var.m)) {
            com.applovin.impl.e9 e9VarA = new com.applovin.impl.e9.b().c(this.d).f(androidx.media3.common.MimeTypes.AUDIO_AC4).c(bVarA.c).n(bVarA.b).e(this.c).a();
            this.k = e9VarA;
            this.e.a(e9VarA);
        }
        this.l = bVarA.d;
        this.j = (((long) bVarA.e) * 1000000) / ((long) this.k.A);
    }

    private boolean a(com.applovin.impl.ah ahVar, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(ahVar.a(), i - this.g);
        ahVar.a(bArr, this.g, iMin);
        int i2 = this.g + iMin;
        this.g = i2;
        return i2 == i;
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = l8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.p7
    public void a(long j, int i) {
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.m = j;
        }
    }

    @Override // com.applovin.impl.p7
    public void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = androidx.media3.common.C.TIME_UNSET;
    }
}
