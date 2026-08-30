package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class yq extends com.applovin.impl.xl {
    private final com.applovin.impl.ah b;
    private final com.applovin.impl.ah c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public yq(com.applovin.impl.qo qoVar) {
        super(qoVar);
        this.b = new com.applovin.impl.ah(com.applovin.impl.yf.f1540a);
        this.c = new com.applovin.impl.ah(4);
    }

    @Override // com.applovin.impl.xl
    protected boolean a(com.applovin.impl.ah ahVar) throws com.applovin.impl.xl.a {
        int iW = ahVar.w();
        int i = (iW >> 4) & 15;
        int i2 = iW & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        throw new com.applovin.impl.xl.a("Video format not supported: " + i2);
    }

    @Override // com.applovin.impl.xl
    protected boolean b(com.applovin.impl.ah ahVar, long j) throws com.applovin.impl.ch {
        int iW = ahVar.w();
        long jK = j + (((long) ahVar.k()) * 1000);
        if (iW == 0 && !this.e) {
            com.applovin.impl.ah ahVar2 = new com.applovin.impl.ah(new byte[ahVar.a()]);
            ahVar.a(ahVar2.c(), 0, ahVar.a());
            com.applovin.impl.w1 w1VarB = com.applovin.impl.w1.b(ahVar2);
            this.d = w1VarB.b;
            this.f1513a.a(new com.applovin.impl.e9.b().f("video/avc").a(w1VarB.f).q(w1VarB.c).g(w1VarB.d).b(w1VarB.e).a(w1VarB.f1445a).a());
            this.e = true;
            return false;
        }
        if (iW != 1 || !this.e) {
            return false;
        }
        int i = this.g == 1 ? 1 : 0;
        if (!this.f && i == 0) {
            return false;
        }
        byte[] bArrC = this.c.c();
        bArrC[0] = 0;
        bArrC[1] = 0;
        bArrC[2] = 0;
        int i2 = 4 - this.d;
        int i3 = 0;
        while (ahVar.a() > 0) {
            ahVar.a(this.c.c(), i2, this.d);
            this.c.f(0);
            int iA = this.c.A();
            this.b.f(0);
            this.f1513a.a(this.b, 4);
            this.f1513a.a(ahVar, iA);
            i3 = i3 + 4 + iA;
        }
        this.f1513a.a(jK, i, i3, 0, null);
        this.f = true;
        return true;
    }
}
