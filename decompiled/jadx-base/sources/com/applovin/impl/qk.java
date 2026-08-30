package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class qk {
    private final com.applovin.impl.q4 c;
    private final android.util.SparseArray b = new android.util.SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1196a = -1;

    public qk(com.applovin.impl.q4 q4Var) {
        this.c = q4Var;
    }

    public java.lang.Object c(int i) {
        if (this.f1196a == -1) {
            this.f1196a = 0;
        }
        while (true) {
            int i2 = this.f1196a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.f1196a--;
        }
        while (this.f1196a < this.b.size() - 1 && i >= this.b.keyAt(this.f1196a + 1)) {
            this.f1196a++;
        }
        return this.b.valueAt(this.f1196a);
    }

    public void a(int i, java.lang.Object obj) {
        if (this.f1196a == -1) {
            com.applovin.impl.b1.b(this.b.size() == 0);
            this.f1196a = 0;
        }
        if (this.b.size() > 0) {
            android.util.SparseArray sparseArray = this.b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            com.applovin.impl.b1.a(i >= iKeyAt);
            if (iKeyAt == i) {
                com.applovin.impl.q4 q4Var = this.c;
                android.util.SparseArray sparseArray2 = this.b;
                q4Var.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.b.append(i, obj);
    }

    public void b(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.b.keyAt(i3)) {
                return;
            }
            this.c.accept(this.b.valueAt(i2));
            this.b.removeAt(i2);
            int i4 = this.f1196a;
            if (i4 > 0) {
                this.f1196a = i4 - 1;
            }
            i2 = i3;
        }
    }

    public boolean c() {
        return this.b.size() == 0;
    }

    public java.lang.Object b() {
        android.util.SparseArray sparseArray = this.b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public void a() {
        for (int i = 0; i < this.b.size(); i++) {
            this.c.accept(this.b.valueAt(i));
        }
        this.f1196a = -1;
        this.b.clear();
    }

    public void a(int i) {
        for (int size = this.b.size() - 1; size >= 0 && i < this.b.keyAt(size); size--) {
            this.c.accept(this.b.valueAt(size));
            this.b.removeAt(size);
        }
        this.f1196a = this.b.size() > 0 ? java.lang.Math.min(this.f1196a, this.b.size() - 1) : -1;
    }
}
