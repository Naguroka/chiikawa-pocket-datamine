package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f1098a;
    private final com.applovin.impl.qo[] b;

    public nj(java.util.List list) {
        this.f1098a = list;
        this.b = new com.applovin.impl.qo[list.size()];
    }

    public void a(long j, com.applovin.impl.ah ahVar) {
        com.applovin.impl.c3.a(j, ahVar, this.b);
    }

    public void a(com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            com.applovin.impl.qo qoVarA = l8Var.a(dVar.c(), 3);
            com.applovin.impl.e9 e9Var = (com.applovin.impl.e9) this.f1098a.get(i);
            java.lang.String str = e9Var.m;
            com.applovin.impl.b1.a(androidx.media3.common.MimeTypes.APPLICATION_CEA608.equals(str) || androidx.media3.common.MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            java.lang.String strB = e9Var.f749a;
            if (strB == null) {
                strB = dVar.b();
            }
            qoVarA.a(new com.applovin.impl.e9.b().c(strB).f(str).o(e9Var.d).e(e9Var.c).a(e9Var.E).a(e9Var.o).a());
            this.b[i] = qoVarA;
        }
    }
}
