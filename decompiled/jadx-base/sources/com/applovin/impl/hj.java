package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class hj implements com.applovin.impl.dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.gj f854a;
    private final com.applovin.impl.ah b = new com.applovin.impl.ah(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public hj(com.applovin.impl.gj gjVar) {
        this.f854a = gjVar;
    }

    @Override // com.applovin.impl.dp
    public void a(com.applovin.impl.ah ahVar, int i) {
        int iD;
        boolean z = (i & 1) != 0;
        if (z) {
            iD = ahVar.d() + ahVar.w();
        } else {
            iD = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            ahVar.f(iD);
            this.d = 0;
        }
        while (ahVar.a() > 0) {
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iW = ahVar.w();
                    ahVar.f(ahVar.d() - 1);
                    if (iW == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = java.lang.Math.min(ahVar.a(), 3 - this.d);
                ahVar.a(this.b.c(), this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    this.b.f(0);
                    this.b.e(3);
                    this.b.g(1);
                    int iW2 = this.b.w();
                    int iW3 = this.b.w();
                    this.e = (iW2 & 128) != 0;
                    this.c = (((iW2 & 15) << 8) | iW3) + 3;
                    int iB = this.b.b();
                    int i4 = this.c;
                    if (iB < i4) {
                        this.b.a(java.lang.Math.min(androidx.core.view.InputDeviceCompat.SOURCE_TOUCHSCREEN, java.lang.Math.max(i4, this.b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = java.lang.Math.min(ahVar.a(), this.c - this.d);
                ahVar.a(this.b.c(), this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        if (com.applovin.impl.xp.a(this.b.c(), 0, this.c, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.e(this.c - 4);
                    } else {
                        this.b.e(i6);
                    }
                    this.b.f(0);
                    this.f854a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.applovin.impl.dp
    public void a(com.applovin.impl.ho hoVar, com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        this.f854a.a(hoVar, l8Var, dVar);
        this.f = true;
    }

    @Override // com.applovin.impl.dp
    public void a() {
        this.f = true;
    }
}
