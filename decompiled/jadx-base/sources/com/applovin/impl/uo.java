package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class uo implements com.applovin.impl.o2 {
    public static final com.applovin.impl.o2.a A;
    public static final com.applovin.impl.uo y;
    public static final com.applovin.impl.uo z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1411a;
    public final int b;
    public final int c;
    public final int d;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final com.applovin.impl.db m;
    public final com.applovin.impl.db n;
    public final int o;
    public final int p;
    public final int q;
    public final com.applovin.impl.db r;
    public final com.applovin.impl.db s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final com.applovin.impl.hb x;

    static {
        com.applovin.impl.uo uoVarA = new com.applovin.impl.uo.a().a();
        y = uoVarA;
        z = uoVarA;
        A = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.uo$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.o2.a
            public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
                return com.applovin.impl.uo.a(bundle);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.uo a(android.os.Bundle bundle) {
        return new com.applovin.impl.uo.a(bundle).a();
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1412a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private com.applovin.impl.db l;
        private com.applovin.impl.db m;
        private int n;
        private int o;
        private int p;
        private com.applovin.impl.db q;
        private com.applovin.impl.db r;
        private int s;
        private boolean t;
        private boolean u;
        private boolean v;
        private com.applovin.impl.hb w;

        private void b(android.content.Context context) {
            android.view.accessibility.CaptioningManager captioningManager;
            if ((com.applovin.impl.xp.f1515a >= 23 || android.os.Looper.myLooper() != null) && (captioningManager = (android.view.accessibility.CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.s = 1088;
                java.util.Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.r = com.applovin.impl.db.a(com.applovin.impl.xp.a(locale));
                }
            }
        }

        public a() {
            this.f1412a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
            this.c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = Integer.MAX_VALUE;
            this.k = true;
            this.l = com.applovin.impl.db.h();
            this.m = com.applovin.impl.db.h();
            this.n = 0;
            this.o = Integer.MAX_VALUE;
            this.p = Integer.MAX_VALUE;
            this.q = com.applovin.impl.db.h();
            this.r = com.applovin.impl.db.h();
            this.s = 0;
            this.t = false;
            this.u = false;
            this.v = false;
            this.w = com.applovin.impl.hb.h();
        }

        public a(android.content.Context context) {
            this();
            a(context);
            a(context, true);
        }

        protected a(android.os.Bundle bundle) {
            java.lang.String strB = com.applovin.impl.uo.b(6);
            com.applovin.impl.uo uoVar = com.applovin.impl.uo.y;
            this.f1412a = bundle.getInt(strB, uoVar.f1411a);
            this.b = bundle.getInt(com.applovin.impl.uo.b(7), uoVar.b);
            this.c = bundle.getInt(com.applovin.impl.uo.b(8), uoVar.c);
            this.d = bundle.getInt(com.applovin.impl.uo.b(9), uoVar.d);
            this.e = bundle.getInt(com.applovin.impl.uo.b(10), uoVar.f);
            this.f = bundle.getInt(com.applovin.impl.uo.b(11), uoVar.g);
            this.g = bundle.getInt(com.applovin.impl.uo.b(12), uoVar.h);
            this.h = bundle.getInt(com.applovin.impl.uo.b(13), uoVar.i);
            this.i = bundle.getInt(com.applovin.impl.uo.b(14), uoVar.j);
            this.j = bundle.getInt(com.applovin.impl.uo.b(15), uoVar.k);
            this.k = bundle.getBoolean(com.applovin.impl.uo.b(16), uoVar.l);
            this.l = com.applovin.impl.db.c((java.lang.String[]) com.applovin.exoplayer2.common.base.MoreObjects.firstNonNull(bundle.getStringArray(com.applovin.impl.uo.b(17)), new java.lang.String[0]));
            this.m = a((java.lang.String[]) com.applovin.exoplayer2.common.base.MoreObjects.firstNonNull(bundle.getStringArray(com.applovin.impl.uo.b(1)), new java.lang.String[0]));
            this.n = bundle.getInt(com.applovin.impl.uo.b(2), uoVar.o);
            this.o = bundle.getInt(com.applovin.impl.uo.b(18), uoVar.p);
            this.p = bundle.getInt(com.applovin.impl.uo.b(19), uoVar.q);
            this.q = com.applovin.impl.db.c((java.lang.String[]) com.applovin.exoplayer2.common.base.MoreObjects.firstNonNull(bundle.getStringArray(com.applovin.impl.uo.b(20)), new java.lang.String[0]));
            this.r = a((java.lang.String[]) com.applovin.exoplayer2.common.base.MoreObjects.firstNonNull(bundle.getStringArray(com.applovin.impl.uo.b(3)), new java.lang.String[0]));
            this.s = bundle.getInt(com.applovin.impl.uo.b(4), uoVar.t);
            this.t = bundle.getBoolean(com.applovin.impl.uo.b(5), uoVar.u);
            this.u = bundle.getBoolean(com.applovin.impl.uo.b(21), uoVar.v);
            this.v = bundle.getBoolean(com.applovin.impl.uo.b(22), uoVar.w);
            this.w = com.applovin.impl.hb.a((java.util.Collection) com.applovin.impl.tb.a((int[]) com.applovin.exoplayer2.common.base.MoreObjects.firstNonNull(bundle.getIntArray(com.applovin.impl.uo.b(23)), new int[0])));
        }

        private static com.applovin.impl.db a(java.lang.String[] strArr) {
            com.applovin.impl.db.a aVarF = com.applovin.impl.db.f();
            for (java.lang.String str : (java.lang.String[]) com.applovin.impl.b1.a(strArr)) {
                aVarF.b(com.applovin.impl.xp.f((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) str)));
            }
            return aVarF.a();
        }

        public com.applovin.impl.uo.a a(int i, int i2, boolean z) {
            this.i = i;
            this.j = i2;
            this.k = z;
            return this;
        }

        public com.applovin.impl.uo.a a(android.content.Context context, boolean z) {
            android.graphics.Point pointC = com.applovin.impl.xp.c(context);
            return a(pointC.x, pointC.y, z);
        }

        public com.applovin.impl.uo.a a(android.content.Context context) {
            if (com.applovin.impl.xp.f1515a >= 19) {
                b(context);
            }
            return this;
        }

        public com.applovin.impl.uo a() {
            return new com.applovin.impl.uo(this);
        }
    }

    protected uo(com.applovin.impl.uo.a aVar) {
        this.f1411a = aVar.f1412a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = aVar.o;
        this.q = aVar.p;
        this.r = aVar.q;
        this.s = aVar.r;
        this.t = aVar.s;
        this.u = aVar.t;
        this.v = aVar.u;
        this.w = aVar.v;
        this.x = aVar.w;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.applovin.impl.uo uoVar = (com.applovin.impl.uo) obj;
        return this.f1411a == uoVar.f1411a && this.b == uoVar.b && this.c == uoVar.c && this.d == uoVar.d && this.f == uoVar.f && this.g == uoVar.g && this.h == uoVar.h && this.i == uoVar.i && this.l == uoVar.l && this.j == uoVar.j && this.k == uoVar.k && this.m.equals(uoVar.m) && this.n.equals(uoVar.n) && this.o == uoVar.o && this.p == uoVar.p && this.q == uoVar.q && this.r.equals(uoVar.r) && this.s.equals(uoVar.s) && this.t == uoVar.t && this.u == uoVar.u && this.v == uoVar.v && this.w == uoVar.w && this.x.equals(uoVar.x);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((this.f1411a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + (this.l ? 1 : 0)) * 31) + this.j) * 31) + this.k) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t) * 31) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + this.x.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String b(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
