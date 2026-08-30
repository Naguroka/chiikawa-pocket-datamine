package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class jh extends com.applovin.impl.ek {
    private final com.applovin.impl.ah o;
    private final com.applovin.impl.ah p;
    private final com.applovin.impl.jh.a q;
    private java.util.zip.Inflater r;

    public jh() {
        super("PgsDecoder");
        this.o = new com.applovin.impl.ah();
        this.p = new com.applovin.impl.ah();
        this.q = new com.applovin.impl.jh.a();
    }

    @Override // com.applovin.impl.ek
    protected com.applovin.impl.nl a(byte[] bArr, int i, boolean z) {
        this.o.a(bArr, i);
        a(this.o);
        this.q.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (this.o.a() >= 3) {
            com.applovin.impl.a5 a5VarA = a(this.o, this.q);
            if (a5VarA != null) {
                arrayList.add(a5VarA);
            }
        }
        return new com.applovin.impl.kh(java.util.Collections.unmodifiableList(arrayList));
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.ah f925a = new com.applovin.impl.ah();
        private final int[] b = new int[256];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        /* JADX INFO: Access modifiers changed from: private */
        public void c(com.applovin.impl.ah ahVar, int i) {
            if (i % 5 != 2) {
                return;
            }
            ahVar.g(2);
            java.util.Arrays.fill(this.b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int iW = ahVar.w();
                int iW2 = ahVar.w();
                int iW3 = ahVar.w();
                int iW4 = ahVar.w();
                double d = iW2;
                double d2 = iW3 - 128;
                double d3 = iW4 - 128;
                this.b[iW] = (com.applovin.impl.xp.a((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (ahVar.w() << 24) | (com.applovin.impl.xp.a((int) ((1.402d * d2) + d), 0, 255) << 16) | com.applovin.impl.xp.a((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.c = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(com.applovin.impl.ah ahVar, int i) {
            if (i < 19) {
                return;
            }
            this.d = ahVar.C();
            this.e = ahVar.C();
            ahVar.g(11);
            this.f = ahVar.C();
            this.g = ahVar.C();
        }

        public com.applovin.impl.a5 a() {
            int iW;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.f925a.e() == 0 || this.f925a.d() != this.f925a.e() || !this.c) {
                return null;
            }
            this.f925a.f(0);
            int i = this.h * this.i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int iW2 = this.f925a.w();
                if (iW2 != 0) {
                    iW = i2 + 1;
                    iArr[i2] = this.b[iW2];
                } else {
                    int iW3 = this.f925a.w();
                    if (iW3 != 0) {
                        iW = ((iW3 & 64) == 0 ? iW3 & 63 : ((iW3 & 63) << 8) | this.f925a.w()) + i2;
                        java.util.Arrays.fill(iArr, i2, iW, (iW3 & 128) == 0 ? 0 : this.b[this.f925a.w()]);
                    }
                }
                i2 = iW;
            }
            return new com.applovin.impl.a5.b().a(android.graphics.Bitmap.createBitmap(iArr, this.h, this.i, android.graphics.Bitmap.Config.ARGB_8888)).b(this.f / this.d).b(0).a(this.g / this.e, 0).a(0).d(this.h / this.d).a(this.i / this.e).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.ah ahVar, int i) {
            int iZ;
            if (i < 4) {
                return;
            }
            ahVar.g(3);
            int i2 = i - 4;
            if ((ahVar.w() & 128) != 0) {
                if (i2 < 7 || (iZ = ahVar.z()) < 4) {
                    return;
                }
                this.h = ahVar.C();
                this.i = ahVar.C();
                this.f925a.d(iZ - 4);
                i2 = i - 11;
            }
            int iD = this.f925a.d();
            int iE = this.f925a.e();
            if (iD >= iE || i2 <= 0) {
                return;
            }
            int iMin = java.lang.Math.min(i2, iE - iD);
            ahVar.a(this.f925a.c(), iD, iMin);
            this.f925a.f(iD + iMin);
        }

        public void b() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.f925a.d(0);
            this.c = false;
        }
    }

    private void a(com.applovin.impl.ah ahVar) {
        if (ahVar.a() <= 0 || ahVar.g() != 120) {
            return;
        }
        if (this.r == null) {
            this.r = new java.util.zip.Inflater();
        }
        if (com.applovin.impl.xp.a(ahVar, this.p, this.r)) {
            ahVar.a(this.p.c(), this.p.e());
        }
    }

    private static com.applovin.impl.a5 a(com.applovin.impl.ah ahVar, com.applovin.impl.jh.a aVar) {
        int iE = ahVar.e();
        int iW = ahVar.w();
        int iC = ahVar.C();
        int iD = ahVar.d() + iC;
        com.applovin.impl.a5 a5VarA = null;
        if (iD > iE) {
            ahVar.f(iE);
            return null;
        }
        if (iW != 128) {
            switch (iW) {
                case 20:
                    aVar.c(ahVar, iC);
                    break;
                case 21:
                    aVar.a(ahVar, iC);
                    break;
                case 22:
                    aVar.b(ahVar, iC);
                    break;
            }
        } else {
            a5VarA = aVar.a();
            aVar.b();
        }
        ahVar.f(iD);
        return a5VarA;
    }
}
