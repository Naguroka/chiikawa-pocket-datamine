package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class h7 implements com.applovin.impl.qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f844a = new byte[4096];

    @Override // com.applovin.impl.qo
    public void a(long j, int i, int i2, int i3, com.applovin.impl.qo.a aVar) {
    }

    @Override // com.applovin.impl.qo
    public void a(com.applovin.impl.e9 e9Var) {
    }

    @Override // com.applovin.impl.qo
    public int a(com.applovin.impl.f5 f5Var, int i, boolean z, int i2) throws java.io.EOFException {
        int iA = f5Var.a(this.f844a, 0, java.lang.Math.min(this.f844a.length, i));
        if (iA != -1) {
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // com.applovin.impl.qo
    public void a(com.applovin.impl.ah ahVar, int i, int i2) {
        ahVar.g(i);
    }
}
