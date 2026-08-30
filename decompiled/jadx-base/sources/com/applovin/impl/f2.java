package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f2 implements com.applovin.impl.g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.oo f778a;
    protected final int b;
    protected final int[] c;
    private final int d;
    private final com.applovin.impl.e9[] e;
    private final long[] f;
    private int g;

    @Override // com.applovin.impl.g8
    public void a(float f) {
    }

    @Override // com.applovin.impl.g8
    public void f() {
    }

    @Override // com.applovin.impl.g8
    public void i() {
    }

    public f2(com.applovin.impl.oo ooVar, int[] iArr, int i) {
        int i2 = 0;
        com.applovin.impl.b1.b(iArr.length > 0);
        this.d = i;
        this.f778a = (com.applovin.impl.oo) com.applovin.impl.b1.a(ooVar);
        int length = iArr.length;
        this.b = length;
        this.e = new com.applovin.impl.e9[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.e[i3] = ooVar.a(iArr[i3]);
        }
        java.util.Arrays.sort(this.e, new java.util.Comparator() { // from class: com.applovin.impl.f2$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.applovin.impl.f2.a((com.applovin.impl.e9) obj, (com.applovin.impl.e9) obj2);
            }
        });
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 < i4) {
                this.c[i2] = ooVar.a(this.e[i2]);
                i2++;
            } else {
                this.f = new long[i4];
                return;
            }
        }
    }

    @Override // com.applovin.impl.so
    public final com.applovin.impl.e9 a(int i) {
        return this.e[i];
    }

    @Override // com.applovin.impl.so
    public final int b(int i) {
        return this.c[i];
    }

    @Override // com.applovin.impl.g8
    public final com.applovin.impl.e9 g() {
        return this.e[h()];
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = (java.lang.System.identityHashCode(this.f778a) * 31) + java.util.Arrays.hashCode(this.c);
        }
        return this.g;
    }

    @Override // com.applovin.impl.so
    public final com.applovin.impl.oo a() {
        return this.f778a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.applovin.impl.f2 f2Var = (com.applovin.impl.f2) obj;
        return this.f778a == f2Var.f778a && java.util.Arrays.equals(this.c, f2Var.c);
    }

    @Override // com.applovin.impl.so
    public final int b() {
        return this.c.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(com.applovin.impl.e9 e9Var, com.applovin.impl.e9 e9Var2) {
        return e9Var2.i - e9Var.i;
    }
}
