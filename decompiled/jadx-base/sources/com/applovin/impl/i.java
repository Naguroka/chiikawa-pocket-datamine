package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements com.applovin.impl.j8 {
    public static final com.applovin.impl.n8 d = new com.applovin.impl.n8() { // from class: com.applovin.impl.i$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.n8
        public final com.applovin.impl.j8[] a() {
            return com.applovin.impl.i.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.j f863a = new com.applovin.impl.j();
    private final com.applovin.impl.ah b = new com.applovin.impl.ah(2786);
    private boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.j8[] b() {
        return new com.applovin.impl.j8[]{new com.applovin.impl.i()};
    }

    @Override // com.applovin.impl.j8
    public void a() {
    }

    @Override // com.applovin.impl.j8
    public void a(com.applovin.impl.l8 l8Var) {
        this.f863a.a(l8Var, new com.applovin.impl.dp.d(0, 1));
        l8Var.c();
        l8Var.a(new com.applovin.impl.ij.b(androidx.media3.common.C.TIME_UNSET));
    }

    @Override // com.applovin.impl.j8
    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        int iA = k8Var.a(this.b.c(), 0, 2786);
        if (iA == -1) {
            return -1;
        }
        this.b.f(0);
        this.b.e(iA);
        if (!this.c) {
            this.f863a.a(0L, 4);
            this.c = true;
        }
        this.f863a.a(this.b);
        return 0;
    }

    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        this.c = false;
        this.f863a.a();
    }

    @Override // com.applovin.impl.j8
    public boolean a(com.applovin.impl.k8 k8Var) {
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(10);
        int i = 0;
        while (true) {
            k8Var.c(ahVar.c(), 0, 10);
            ahVar.f(0);
            if (ahVar.z() != 4801587) {
                break;
            }
            ahVar.g(3);
            int iV = ahVar.v();
            i += iV + 10;
            k8Var.c(iV);
        }
        k8Var.b();
        k8Var.c(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            k8Var.c(ahVar.c(), 0, 6);
            ahVar.f(0);
            if (ahVar.C() != 2935) {
                k8Var.b();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                k8Var.c(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iA = com.applovin.impl.k.a(ahVar.c());
                if (iA == -1) {
                    return false;
                }
                k8Var.c(iA - 6);
            }
        }
    }
}
