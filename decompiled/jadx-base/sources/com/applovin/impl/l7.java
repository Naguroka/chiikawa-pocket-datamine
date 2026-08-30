package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class l7 implements com.applovin.impl.p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f982a;
    private final com.applovin.impl.qo[] b;
    private boolean c;
    private int d;
    private int e;
    private long f = androidx.media3.common.C.TIME_UNSET;

    public l7(java.util.List list) {
        this.f982a = list;
        this.b = new com.applovin.impl.qo[list.size()];
    }

    @Override // com.applovin.impl.p7
    public void b() {
        if (this.c) {
            if (this.f != androidx.media3.common.C.TIME_UNSET) {
                for (com.applovin.impl.qo qoVar : this.b) {
                    qoVar.a(this.f, 1, this.e, 0, null);
                }
            }
            this.c = false;
        }
    }

    private boolean a(com.applovin.impl.ah ahVar, int i) {
        if (ahVar.a() == 0) {
            return false;
        }
        if (ahVar.w() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.ah ahVar) {
        if (this.c) {
            if (this.d != 2 || a(ahVar, 32)) {
                if (this.d != 1 || a(ahVar, 0)) {
                    int iD = ahVar.d();
                    int iA = ahVar.a();
                    for (com.applovin.impl.qo qoVar : this.b) {
                        ahVar.f(iD);
                        qoVar.a(ahVar, iA);
                    }
                    this.e += iA;
                }
            }
        }
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            com.applovin.impl.dp.a aVar = (com.applovin.impl.dp.a) this.f982a.get(i);
            dVar.a();
            com.applovin.impl.qo qoVarA = l8Var.a(dVar.c(), 3);
            qoVarA.a(new com.applovin.impl.e9.b().c(dVar.b()).f(androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS).a(java.util.Collections.singletonList(aVar.c)).e(aVar.f736a).a());
            this.b[i] = qoVarA;
        }
    }

    @Override // com.applovin.impl.p7
    public void a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override // com.applovin.impl.p7
    public void a() {
        this.c = false;
        this.f = androidx.media3.common.C.TIME_UNSET;
    }
}
