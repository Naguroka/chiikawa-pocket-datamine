package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class vr {
    private int f;
    private int h;
    private float o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f1441a = "";
    private java.lang.String b = "";
    private java.util.Set c = java.util.Collections.emptySet();
    private java.lang.String d = "";
    private java.lang.String e = null;
    private boolean g = false;
    private boolean i = false;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int p = -1;
    private boolean q = false;

    public int h() {
        int i = this.l;
        if (i == -1 && this.m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.m == 1 ? 2 : 0);
    }

    public boolean k() {
        return this.j == 1;
    }

    public boolean l() {
        return this.k == 1;
    }

    public java.lang.String d() {
        return this.e;
    }

    public int c() {
        if (this.g) {
            return this.f;
        }
        throw new java.lang.IllegalStateException("Font color not defined");
    }

    public boolean j() {
        return this.g;
    }

    public int a() {
        if (this.i) {
            return this.h;
        }
        throw new java.lang.IllegalStateException("Background color not defined.");
    }

    public boolean i() {
        return this.i;
    }

    public int f() {
        return this.n;
    }

    public float e() {
        return this.o;
    }

    public int g() {
        return this.p;
    }

    public boolean b() {
        return this.q;
    }

    public int a(java.lang.String str, java.lang.String str2, java.util.Set set, java.lang.String str3) {
        if (this.f1441a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return android.text.TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f1441a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (iA == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return iA + (this.c.size() * 4);
    }

    public com.applovin.impl.vr c(int i) {
        this.n = i;
        return this;
    }

    public com.applovin.impl.vr d(int i) {
        this.p = i;
        return this;
    }

    public com.applovin.impl.vr b(boolean z) {
        this.q = z;
        return this;
    }

    public void d(java.lang.String str) {
        this.d = str;
    }

    public com.applovin.impl.vr a(int i) {
        this.h = i;
        this.i = true;
        return this;
    }

    public com.applovin.impl.vr c(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public com.applovin.impl.vr b(int i) {
        this.f = i;
        this.g = true;
        return this;
    }

    public com.applovin.impl.vr d(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }

    public void c(java.lang.String str) {
        this.b = str;
    }

    public com.applovin.impl.vr a(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public void b(java.lang.String str) {
        this.f1441a = str;
    }

    public com.applovin.impl.vr a(java.lang.String str) {
        this.e = str == null ? null : com.applovin.exoplayer2.common.base.Ascii.toLowerCase(str);
        return this;
    }

    public com.applovin.impl.vr a(float f) {
        this.o = f;
        return this;
    }

    public void a(java.lang.String[] strArr) {
        this.c = new java.util.HashSet(java.util.Arrays.asList(strArr));
    }

    private static int a(int i, java.lang.String str, java.lang.String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
