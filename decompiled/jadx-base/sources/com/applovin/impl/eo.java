package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class eo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f767a;
    private java.lang.Object[] b;
    private int c;
    private int d;

    public eo() {
        this(10);
    }

    public synchronized void a(long j, java.lang.Object obj) {
        a(j);
        b();
        b(j, obj);
    }

    public synchronized int e() {
        return this.d;
    }

    public synchronized java.lang.Object c() {
        return this.d == 0 ? null : d();
    }

    public eo(int i) {
        this.f767a = new long[i];
        this.b = a(i);
    }

    public synchronized void a() {
        this.c = 0;
        this.d = 0;
        java.util.Arrays.fill(this.b, (java.lang.Object) null);
    }

    private java.lang.Object d() {
        com.applovin.impl.b1.b(this.d > 0);
        java.lang.Object[] objArr = this.b;
        int i = this.c;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public synchronized java.lang.Object c(long j) {
        return a(j, true);
    }

    private void b(long j, java.lang.Object obj) {
        int i = this.c;
        int i2 = this.d;
        java.lang.Object[] objArr = this.b;
        int length = (i + i2) % objArr.length;
        this.f767a[length] = j;
        objArr[length] = obj;
        this.d = i2 + 1;
    }

    private void a(long j) {
        int i = this.d;
        if (i > 0) {
            if (j <= this.f767a[((this.c + i) - 1) % this.b.length]) {
                a();
            }
        }
    }

    private void b() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        java.lang.Object[] objArrA = a(i);
        int i2 = this.c;
        int i3 = length - i2;
        java.lang.System.arraycopy(this.f767a, i2, jArr, 0, i3);
        java.lang.System.arraycopy(this.b, this.c, objArrA, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            java.lang.System.arraycopy(this.f767a, 0, jArr, i3, i4);
            java.lang.System.arraycopy(this.b, 0, objArrA, i3, this.c);
        }
        this.f767a = jArr;
        this.b = objArrA;
        this.c = 0;
    }

    private static java.lang.Object[] a(int i) {
        return new java.lang.Object[i];
    }

    public synchronized java.lang.Object b(long j) {
        return a(j, false);
    }

    private java.lang.Object a(long j, boolean z) {
        java.lang.Object objD = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.f767a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objD = d();
            j2 = j3;
        }
        return objD;
    }
}
