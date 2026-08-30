package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ig f852a = new com.applovin.impl.ig();
    private final com.applovin.impl.ah b = new com.applovin.impl.ah(new byte[androidx.media3.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int c = -1;
    private int d;
    private boolean e;

    hg() {
    }

    public void c() {
        this.f852a.a();
        this.b.d(0);
        this.c = -1;
        this.e = false;
    }

    public com.applovin.impl.ah b() {
        return this.b;
    }

    public void d() {
        if (this.b.c().length == 65025) {
            return;
        }
        com.applovin.impl.ah ahVar = this.b;
        ahVar.a(java.util.Arrays.copyOf(ahVar.c(), java.lang.Math.max(androidx.media3.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD, this.b.e())), this.b.e());
    }

    private int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            com.applovin.impl.ig igVar = this.f852a;
            if (i5 >= igVar.g) {
                break;
            }
            int[] iArr = igVar.j;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public com.applovin.impl.ig a() {
        return this.f852a;
    }

    public boolean a(com.applovin.impl.k8 k8Var) {
        int i;
        com.applovin.impl.b1.b(k8Var != null);
        if (this.e) {
            this.e = false;
            this.b.d(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.f852a.a(k8Var) || !this.f852a.a(k8Var, true)) {
                    return false;
                }
                com.applovin.impl.ig igVar = this.f852a;
                int iA = igVar.h;
                if ((igVar.b & 1) == 1 && this.b.e() == 0) {
                    iA += a(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                if (!com.applovin.impl.m8.a(k8Var, iA)) {
                    return false;
                }
                this.c = i;
            }
            int iA2 = a(this.c);
            int i2 = this.c + this.d;
            if (iA2 > 0) {
                com.applovin.impl.ah ahVar = this.b;
                ahVar.a(ahVar.e() + iA2);
                if (!com.applovin.impl.m8.b(k8Var, this.b.c(), this.b.e(), iA2)) {
                    return false;
                }
                com.applovin.impl.ah ahVar2 = this.b;
                ahVar2.e(ahVar2.e() + iA2);
                this.e = this.f852a.j[i2 + (-1)] != 255;
            }
            if (i2 == this.f852a.g) {
                i2 = -1;
            }
            this.c = i2;
        }
        return true;
    }
}
