package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class rf implements com.applovin.impl.p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ah f1225a;
    private final com.applovin.impl.sf.a b;
    private final java.lang.String c;
    private com.applovin.impl.qo d;
    private java.lang.String e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    @Override // com.applovin.impl.p7
    public void b() {
    }

    public rf() {
        this(null);
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.ah ahVar) {
        com.applovin.impl.b1.b(this.d);
        while (ahVar.a() > 0) {
            int i = this.f;
            if (i == 0) {
                b(ahVar);
            } else if (i == 1) {
                d(ahVar);
            } else if (i == 2) {
                c(ahVar);
            } else {
                throw new java.lang.IllegalStateException();
            }
        }
    }

    public rf(java.lang.String str) {
        this.f = 0;
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(4);
        this.f1225a = ahVar;
        ahVar.c()[0] = -1;
        this.b = new com.applovin.impl.sf.a();
        this.l = androidx.media3.common.C.TIME_UNSET;
        this.c = str;
    }

    private void b(com.applovin.impl.ah ahVar) {
        byte[] bArrC = ahVar.c();
        int iE = ahVar.e();
        for (int iD = ahVar.d(); iD < iE; iD++) {
            byte b = bArrC[iD];
            boolean z = (b & 255) == 255;
            boolean z2 = this.i && (b & 224) == 224;
            this.i = z;
            if (z2) {
                ahVar.f(iD + 1);
                this.i = false;
                this.f1225a.c()[1] = bArrC[iD];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        ahVar.f(iE);
    }

    private void d(com.applovin.impl.ah ahVar) {
        int iMin = java.lang.Math.min(ahVar.a(), 4 - this.g);
        ahVar.a(this.f1225a.c(), this.g, iMin);
        int i = this.g + iMin;
        this.g = i;
        if (i < 4) {
            return;
        }
        this.f1225a.f(0);
        if (!this.b.a(this.f1225a.j())) {
            this.g = 0;
            this.f = 1;
            return;
        }
        com.applovin.impl.sf.a aVar = this.b;
        this.k = aVar.c;
        if (!this.h) {
            this.j = (((long) aVar.g) * 1000000) / ((long) aVar.d);
            this.d.a(new com.applovin.impl.e9.b().c(this.e).f(this.b.b).i(4096).c(this.b.e).n(this.b.d).e(this.c).a());
            this.h = true;
        }
        this.f1225a.f(0);
        this.d.a(this.f1225a, 4);
        this.f = 2;
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.d = l8Var.a(dVar.c(), 1);
    }

    private void c(com.applovin.impl.ah ahVar) {
        int iMin = java.lang.Math.min(ahVar.a(), this.k - this.g);
        this.d.a(ahVar, iMin);
        int i = this.g + iMin;
        this.g = i;
        int i2 = this.k;
        if (i < i2) {
            return;
        }
        long j = this.l;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.d.a(j, 1, i2, 0, null);
            this.l += this.j;
        }
        this.g = 0;
        this.f = 0;
    }

    @Override // com.applovin.impl.p7
    public void a(long j, int i) {
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.l = j;
        }
    }

    @Override // com.applovin.impl.p7
    public void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = androidx.media3.common.C.TIME_UNSET;
    }
}
