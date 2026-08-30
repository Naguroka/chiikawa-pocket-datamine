package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class hj {
    private static final int n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.json.mediationsdk.model.InterstitialPlacement> f2717a;
    private com.json.e4 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private com.json.l5 g;
    private boolean h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private com.json.mediationsdk.model.InterstitialPlacement m;

    public hj() {
        this.f2717a = new java.util.ArrayList<>();
        this.b = new com.json.e4();
        this.g = new com.json.l5();
    }

    public hj(int i, boolean z, int i2, com.json.e4 e4Var, com.json.l5 l5Var, int i3, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.f2717a = new java.util.ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = e4Var;
        this.g = l5Var;
        this.j = z3;
        this.k = z4;
        this.f = i3;
        this.h = z2;
        this.i = j;
        this.l = z5;
    }

    public com.json.mediationsdk.model.InterstitialPlacement a() {
        for (com.json.mediationsdk.model.InterstitialPlacement interstitialPlacement : this.f2717a) {
            if (interstitialPlacement.getIsDefault()) {
                return interstitialPlacement;
            }
        }
        return this.m;
    }

    public com.json.mediationsdk.model.InterstitialPlacement a(java.lang.String str) {
        for (com.json.mediationsdk.model.InterstitialPlacement interstitialPlacement : this.f2717a) {
            if (interstitialPlacement.getCom.ironsource.op.d java.lang.String().equals(str)) {
                return interstitialPlacement;
            }
        }
        return null;
    }

    public void a(com.json.mediationsdk.model.InterstitialPlacement interstitialPlacement) {
        if (interstitialPlacement != null) {
            this.f2717a.add(interstitialPlacement);
            if (this.m == null || interstitialPlacement.isPlacementId(0)) {
                this.m = interstitialPlacement;
            }
        }
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public long e() {
        return java.util.concurrent.TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean f() {
        return this.d;
    }

    public com.json.l5 g() {
        return this.g;
    }

    public long h() {
        return this.i;
    }

    public com.json.e4 i() {
        return this.b;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.k;
    }

    public java.lang.String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + '}';
    }
}
