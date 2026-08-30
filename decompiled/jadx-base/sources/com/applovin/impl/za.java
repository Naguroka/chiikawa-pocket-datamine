package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class za implements com.applovin.impl.p7 {
    private com.applovin.impl.qo b;
    private boolean c;
    private int e;
    private int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ah f1567a = new com.applovin.impl.ah(10);
    private long d = androidx.media3.common.C.TIME_UNSET;

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.ah ahVar) {
        com.applovin.impl.b1.b(this.b);
        if (this.c) {
            int iA = ahVar.a();
            int i = this.f;
            if (i < 10) {
                int iMin = java.lang.Math.min(iA, 10 - i);
                java.lang.System.arraycopy(ahVar.c(), ahVar.d(), this.f1567a.c(), this.f, iMin);
                if (this.f + iMin == 10) {
                    this.f1567a.f(0);
                    if (73 == this.f1567a.w() && 68 == this.f1567a.w() && 51 == this.f1567a.w()) {
                        this.f1567a.g(3);
                        this.e = this.f1567a.v() + 10;
                    } else {
                        com.applovin.impl.oc.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int iMin2 = java.lang.Math.min(iA, this.e - this.f);
            this.b.a(ahVar, iMin2);
            this.f += iMin2;
        }
    }

    @Override // com.applovin.impl.p7
    public void b() {
        int i;
        com.applovin.impl.b1.b(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                this.b.a(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        dVar.a();
        com.applovin.impl.qo qoVarA = l8Var.a(dVar.c(), 5);
        this.b = qoVarA;
        qoVarA.a(new com.applovin.impl.e9.b().c(dVar.b()).f(androidx.media3.common.MimeTypes.APPLICATION_ID3).a());
    }

    @Override // com.applovin.impl.p7
    public void a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // com.applovin.impl.p7
    public void a() {
        this.c = false;
        this.d = androidx.media3.common.C.TIME_UNSET;
    }
}
