package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
class y extends com.applovin.impl.dc {
    private final com.applovin.impl.z f;
    private final com.applovin.impl.a0 g;
    private final com.applovin.impl.ir h;
    private final java.lang.String i;
    private final java.util.List j;
    private final java.util.List k;
    private final java.util.List l;

    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    private com.applovin.impl.cc f() {
        return com.applovin.impl.cc.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private com.applovin.impl.cc g() {
        return com.applovin.impl.cc.a().d("ID").c(this.f.c()).a();
    }

    private com.applovin.impl.cc i() {
        return com.applovin.impl.cc.a().d("Selected Network").c(this.h.b().a()).a();
    }

    @Override // com.applovin.impl.dc
    protected int b() {
        return com.applovin.impl.y.a.COUNT.ordinal();
    }

    y(com.applovin.impl.z zVar, com.applovin.impl.a0 a0Var, com.applovin.impl.ir irVar, android.content.Context context) {
        super(context);
        this.f = zVar;
        this.h = irVar;
        this.g = a0Var != null ? a0Var : zVar.f();
        this.i = a0Var != null ? a0Var.c() : zVar.d();
        this.j = h();
        this.k = e();
        this.l = l();
        notifyDataSetChanged();
    }

    public java.lang.String k() {
        return this.i;
    }

    public com.applovin.impl.a0 j() {
        return this.g;
    }

    @Override // com.applovin.impl.dc
    protected int d(int i) {
        if (i == com.applovin.impl.y.a.INFO.ordinal()) {
            return this.j.size();
        }
        if (i == com.applovin.impl.y.a.BIDDERS.ordinal()) {
            return this.k.size();
        }
        return this.l.size();
    }

    private com.applovin.impl.cc d() {
        return com.applovin.impl.cc.a().d("Ad Format").c(this.f.b()).a();
    }

    @Override // com.applovin.impl.dc
    protected java.util.List c(int i) {
        if (i == com.applovin.impl.y.a.INFO.ordinal()) {
            return this.j;
        }
        if (i == com.applovin.impl.y.a.BIDDERS.ordinal()) {
            return this.k;
        }
        return this.l;
    }

    private java.util.List h() {
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.g.b() != null) {
            arrayList.add(f());
        }
        if (this.h != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private java.util.List e() {
        com.applovin.impl.ir irVar = this.h;
        if (irVar != null && !irVar.d()) {
            return new java.util.ArrayList();
        }
        java.util.List<com.applovin.impl.ir> listA = this.g.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(listA.size());
        for (com.applovin.impl.ir irVar2 : listA) {
            com.applovin.impl.ir irVar3 = this.h;
            if (irVar3 == null || irVar3.b().c().equals(irVar2.b().c())) {
                arrayList.add(new com.applovin.impl.y.b(irVar2, irVar2.a() != null ? irVar2.a().a() : "", this.h == null));
            }
        }
        return arrayList;
    }

    private java.util.List l() {
        com.applovin.impl.ir irVar = this.h;
        if (irVar != null && irVar.d()) {
            return new java.util.ArrayList();
        }
        java.util.List<com.applovin.impl.ir> listE = this.g.e();
        java.util.ArrayList arrayList = new java.util.ArrayList(listE.size());
        for (com.applovin.impl.ir irVar2 : listE) {
            com.applovin.impl.ir irVar3 = this.h;
            if (irVar3 == null || irVar3.b().c().equals(irVar2.b().c())) {
                arrayList.add(new com.applovin.impl.y.b(irVar2, null, this.h == null));
                for (com.applovin.impl.cg cgVar : irVar2.c()) {
                    arrayList.add(com.applovin.impl.cc.a().d(cgVar.a()).c(cgVar.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    class b extends com.applovin.impl.bg {
        private final com.applovin.impl.ir p;

        @Override // com.applovin.impl.cc
        public int g() {
            return -12303292;
        }

        b(com.applovin.impl.ir irVar, java.lang.String str, boolean z) {
            super(irVar.b().d(), com.applovin.impl.y.this.f719a);
            this.p = irVar;
            this.c = com.applovin.impl.sdk.utils.StringUtils.createSpannedString(irVar.b().a(), androidx.core.view.ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.d = !android.text.TextUtils.isEmpty(str) ? new android.text.SpannedString(str) : null;
            this.b = z;
        }

        public com.applovin.impl.ir v() {
            return this.p;
        }

        @Override // com.applovin.impl.bg, com.applovin.impl.cc
        public boolean o() {
            return this.b;
        }
    }

    @Override // com.applovin.impl.dc
    protected com.applovin.impl.cc e(int i) {
        if (i == com.applovin.impl.y.a.INFO.ordinal()) {
            return new com.applovin.impl.fj("INFO");
        }
        if (i == com.applovin.impl.y.a.BIDDERS.ordinal()) {
            return new com.applovin.impl.fj("BIDDERS");
        }
        return new com.applovin.impl.fj("WATERFALL");
    }
}
