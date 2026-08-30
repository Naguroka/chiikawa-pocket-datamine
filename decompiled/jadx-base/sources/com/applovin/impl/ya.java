package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ah f1536a = new com.applovin.impl.ah(10);

    public com.applovin.impl.af a(com.applovin.impl.k8 k8Var, com.applovin.impl.wa.a aVar) {
        com.applovin.impl.af afVarA = null;
        int i = 0;
        while (true) {
            try {
                k8Var.c(this.f1536a.c(), 0, 10);
                this.f1536a.f(0);
                if (this.f1536a.z() != 4801587) {
                    break;
                }
                this.f1536a.g(3);
                int iV = this.f1536a.v();
                int i2 = iV + 10;
                if (afVarA == null) {
                    byte[] bArr = new byte[i2];
                    java.lang.System.arraycopy(this.f1536a.c(), 0, bArr, 0, 10);
                    k8Var.c(bArr, 10, iV);
                    afVarA = new com.applovin.impl.wa(aVar).a(bArr, i2);
                } else {
                    k8Var.c(iV);
                }
                i += i2;
            } catch (java.io.EOFException unused) {
            }
        }
        k8Var.b();
        k8Var.c(i);
        return afVarA;
    }
}
