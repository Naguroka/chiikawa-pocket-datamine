package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class gg implements com.applovin.impl.j8 {
    public static final com.applovin.impl.n8 d = new com.applovin.impl.n8() { // from class: com.applovin.impl.gg$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.n8
        public final com.applovin.impl.j8[] a() {
            return com.applovin.impl.gg.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.l8 f822a;
    private com.applovin.impl.gl b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.j8[] b() {
        return new com.applovin.impl.j8[]{new com.applovin.impl.gg()};
    }

    @Override // com.applovin.impl.j8
    public void a() {
    }

    private boolean b(com.applovin.impl.k8 k8Var) {
        com.applovin.impl.ig igVar = new com.applovin.impl.ig();
        if (igVar.a(k8Var, true) && (igVar.b & 2) == 2) {
            int iMin = java.lang.Math.min(igVar.i, 8);
            com.applovin.impl.ah ahVar = new com.applovin.impl.ah(iMin);
            k8Var.c(ahVar.c(), 0, iMin);
            if (com.applovin.impl.x8.c(a(ahVar))) {
                this.b = new com.applovin.impl.x8();
            } else if (com.applovin.impl.er.c(a(ahVar))) {
                this.b = new com.applovin.impl.er();
            } else if (com.applovin.impl.sg.b(a(ahVar))) {
                this.b = new com.applovin.impl.sg();
            }
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.j8
    public void a(com.applovin.impl.l8 l8Var) {
        this.f822a = l8Var;
    }

    @Override // com.applovin.impl.j8
    public int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) throws com.applovin.impl.ch {
        com.applovin.impl.b1.b(this.f822a);
        if (this.b == null) {
            if (b(k8Var)) {
                k8Var.b();
            } else {
                throw com.applovin.impl.ch.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.c) {
            com.applovin.impl.qo qoVarA = this.f822a.a(0, 1);
            this.f822a.c();
            this.b.a(this.f822a, qoVarA);
            this.c = true;
        }
        return this.b.a(k8Var, thVar);
    }

    private static com.applovin.impl.ah a(com.applovin.impl.ah ahVar) {
        ahVar.f(0);
        return ahVar;
    }

    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        com.applovin.impl.gl glVar = this.b;
        if (glVar != null) {
            glVar.a(j, j2);
        }
    }

    @Override // com.applovin.impl.j8
    public boolean a(com.applovin.impl.k8 k8Var) {
        try {
            return b(k8Var);
        } catch (com.applovin.impl.ch unused) {
            return false;
        }
    }
}
