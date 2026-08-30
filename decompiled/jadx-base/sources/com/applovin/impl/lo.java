package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class lo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f997a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final com.applovin.impl.e9 f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final com.applovin.impl.mo[] k;

    public lo(int i, int i2, long j, long j2, long j3, com.applovin.impl.e9 e9Var, int i3, com.applovin.impl.mo[] moVarArr, int i4, long[] jArr, long[] jArr2) {
        this.f997a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = e9Var;
        this.g = i3;
        this.k = moVarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public com.applovin.impl.mo a(int i) {
        com.applovin.impl.mo[] moVarArr = this.k;
        if (moVarArr == null) {
            return null;
        }
        return moVarArr[i];
    }
}
