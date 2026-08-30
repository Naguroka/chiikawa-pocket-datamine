package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class vp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f1436a;
    private final com.applovin.impl.qo[] b;

    public vp(java.util.List list) {
        this.f1436a = list;
        this.b = new com.applovin.impl.qo[list.size()];
    }

    public void a(long j, com.applovin.impl.ah ahVar) {
        if (ahVar.a() < 9) {
            return;
        }
        int iJ = ahVar.j();
        int iJ2 = ahVar.j();
        int iW = ahVar.w();
        if (iJ == 434 && iJ2 == 1195456820 && iW == 3) {
            com.applovin.impl.c3.b(j, ahVar, this.b);
        }
    }

    public void a(com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            com.applovin.impl.qo qoVarA = l8Var.a(dVar.c(), 3);
            com.applovin.impl.e9 e9Var = (com.applovin.impl.e9) this.f1436a.get(i);
            java.lang.String str = e9Var.m;
            com.applovin.impl.b1.a(androidx.media3.common.MimeTypes.APPLICATION_CEA608.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            qoVarA.a(new com.applovin.impl.e9.b().c(dVar.b()).f(str).o(e9Var.d).e(e9Var.c).a(e9Var.E).a(e9Var.o).a());
            this.b[i] = qoVarA;
        }
    }
}
