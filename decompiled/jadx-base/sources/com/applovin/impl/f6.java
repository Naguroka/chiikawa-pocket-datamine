package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class f6 implements com.applovin.impl.lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f780a;

    public f6() {
        this(-1);
    }

    @Override // com.applovin.impl.lc
    public int a(int i) {
        int i2 = this.f780a;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    public f6(int i) {
        this.f780a = i;
    }

    @Override // com.applovin.impl.lc
    public long a(com.applovin.impl.lc.a aVar) {
        java.io.IOException iOException = aVar.c;
        return ((iOException instanceof com.applovin.impl.ch) || (iOException instanceof java.io.FileNotFoundException) || (iOException instanceof com.applovin.impl.pa.a) || (iOException instanceof com.applovin.impl.nc.h) || com.applovin.impl.i5.a(iOException)) ? androidx.media3.common.C.TIME_UNSET : java.lang.Math.min((aVar.d - 1) * 1000, 5000);
    }
}
