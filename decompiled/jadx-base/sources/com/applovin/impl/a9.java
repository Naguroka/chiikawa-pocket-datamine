package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.util.SparseBooleanArray f585a;

    public int hashCode() {
        if (com.applovin.impl.xp.f1515a >= 24) {
            return this.f585a.hashCode();
        }
        int iA = a();
        for (int i = 0; i < a(); i++) {
            iA = (iA * 31) + b(i);
        }
        return iA;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.util.SparseBooleanArray f586a = new android.util.SparseBooleanArray();
        private boolean b;

        public com.applovin.impl.a9.b a(int i) {
            com.applovin.impl.b1.b(!this.b);
            this.f586a.append(i, true);
            return this;
        }

        public com.applovin.impl.a9.b a(com.applovin.impl.a9 a9Var) {
            for (int i = 0; i < a9Var.a(); i++) {
                a(a9Var.b(i));
            }
            return this;
        }

        public com.applovin.impl.a9.b a(int... iArr) {
            for (int i : iArr) {
                a(i);
            }
            return this;
        }

        public com.applovin.impl.a9.b a(int i, boolean z) {
            return z ? a(i) : this;
        }

        public com.applovin.impl.a9 a() {
            com.applovin.impl.b1.b(!this.b);
            this.b = true;
            return new com.applovin.impl.a9(this.f586a);
        }
    }

    private a9(android.util.SparseBooleanArray sparseBooleanArray) {
        this.f585a = sparseBooleanArray;
    }

    public boolean a(int i) {
        return this.f585a.get(i);
    }

    public int b(int i) {
        com.applovin.impl.b1.a(i, 0, a());
        return this.f585a.keyAt(i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.a9)) {
            return false;
        }
        com.applovin.impl.a9 a9Var = (com.applovin.impl.a9) obj;
        if (com.applovin.impl.xp.f1515a < 24) {
            if (a() != a9Var.a()) {
                return false;
            }
            for (int i = 0; i < a(); i++) {
                if (b(i) != a9Var.b(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.f585a.equals(a9Var.f585a);
    }

    public boolean a(int... iArr) {
        for (int i : iArr) {
            if (a(i)) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f585a.size();
    }
}
