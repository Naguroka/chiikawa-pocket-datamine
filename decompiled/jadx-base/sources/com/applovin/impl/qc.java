package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1177a;
    private long[] b;

    public qc() {
        this(32);
    }

    public void a(long j) {
        int i = this.f1177a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = java.util.Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.f1177a;
        this.f1177a = i2 + 1;
        jArr2[i2] = j;
    }

    public qc(int i) {
        this.b = new long[i];
    }

    public long[] b() {
        return java.util.Arrays.copyOf(this.b, this.f1177a);
    }

    public long a(int i) {
        if (i >= 0 && i < this.f1177a) {
            return this.b[i];
        }
        throw new java.lang.IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f1177a);
    }

    public int a() {
        return this.f1177a;
    }
}
