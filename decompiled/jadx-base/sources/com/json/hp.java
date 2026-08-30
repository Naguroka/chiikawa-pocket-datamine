package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class hp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2719a;
    private boolean b;
    private boolean c;
    private com.json.lp d;
    private int e;
    private int f;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2720a = true;
        private boolean b = false;
        private boolean c = false;
        private com.json.lp d = null;
        private int e = 0;
        private int f = 0;

        public com.ironsource.hp.b a(boolean z) {
            this.f2720a = z;
            return this;
        }

        public com.ironsource.hp.b a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public com.ironsource.hp.b a(boolean z, com.json.lp lpVar, int i) {
            this.b = z;
            if (lpVar == null) {
                lpVar = com.json.lp.PER_DAY;
            }
            this.d = lpVar;
            this.e = i;
            return this;
        }

        public com.json.hp a() {
            return new com.json.hp(this.f2720a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    private hp(boolean z, boolean z2, boolean z3, com.json.lp lpVar, int i, int i2) {
        this.f2719a = z;
        this.b = z2;
        this.c = z3;
        this.d = lpVar;
        this.e = i;
        this.f = i2;
    }

    public com.json.lp a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.f2719a;
    }

    public boolean f() {
        return this.c;
    }
}
