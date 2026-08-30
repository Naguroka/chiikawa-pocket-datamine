package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class uq {
    private static final int o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.json.mediationsdk.model.Placement> f3477a;
    private com.json.e4 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private com.json.mediationsdk.model.Placement l;
    private com.json.l5 m;
    private boolean n;

    public uq() {
        this.f3477a = new java.util.ArrayList<>();
        this.b = new com.json.e4();
    }

    public uq(int i, boolean z, int i2, int i3, com.json.e4 e4Var, com.json.l5 l5Var, int i4, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.f3477a = new java.util.ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = e4Var;
        this.f = i3;
        this.m = l5Var;
        this.g = i4;
        this.n = z2;
        this.h = j;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public com.json.mediationsdk.model.Placement a() {
        for (com.json.mediationsdk.model.Placement placement : this.f3477a) {
            if (placement.getIsDefault()) {
                return placement;
            }
        }
        return this.l;
    }

    public com.json.mediationsdk.model.Placement a(java.lang.String str) {
        for (com.json.mediationsdk.model.Placement placement : this.f3477a) {
            if (placement.getCom.ironsource.op.d java.lang.String().equals(str)) {
                return placement;
            }
        }
        return null;
    }

    public void a(com.json.mediationsdk.model.Placement placement) {
        if (placement != null) {
            this.f3477a.add(placement);
            if (this.l == null || placement.isPlacementId(0)) {
                this.l = placement;
            }
        }
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.n;
    }

    public java.util.ArrayList<com.json.mediationsdk.model.Placement> e() {
        return this.f3477a;
    }

    public boolean f() {
        return this.i;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public long i() {
        return java.util.concurrent.TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean j() {
        return this.d;
    }

    public com.json.l5 k() {
        return this.m;
    }

    public long l() {
        return this.h;
    }

    public com.json.e4 m() {
        return this.b;
    }

    public boolean n() {
        return this.k;
    }

    public boolean o() {
        return this.j;
    }

    public java.lang.String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + '}';
    }
}
