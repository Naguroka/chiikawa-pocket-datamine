package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2875a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private int e;
    private int f;
    private int g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private boolean m;
    private java.util.ArrayList<java.lang.String> n;
    private boolean o;
    private boolean p;
    private int q;
    private boolean r;

    public l5() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = true;
        this.n = new java.util.ArrayList<>();
        this.g = 0;
        this.o = false;
        this.p = false;
        this.q = 1;
    }

    l5(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, long j, long j2, long j3, long j4, long j5, boolean z, int i3, boolean z2, boolean z3, boolean z4, int i4, boolean z5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.h = j;
        this.f2875a = z4;
        this.i = j2;
        this.j = j3;
        this.k = j4;
        this.l = j5;
        this.m = z;
        this.g = i3;
        this.n = new java.util.ArrayList<>();
        this.o = z2;
        this.p = z3;
        this.q = i4;
        this.r = z5;
    }

    public java.lang.String a() {
        return this.b;
    }

    public java.lang.String a(boolean z) {
        return z ? this.d : this.c;
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.n.add(str);
    }

    public long b() {
        return this.j;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.q;
    }

    public boolean e() {
        return this.m;
    }

    public java.util.ArrayList<java.lang.String> f() {
        return this.n;
    }

    public int g() {
        return this.e;
    }

    public boolean h() {
        return this.f2875a;
    }

    public int i() {
        return this.g;
    }

    public long j() {
        return this.k;
    }

    public long k() {
        return this.i;
    }

    public long l() {
        return this.l;
    }

    public long m() {
        return this.h;
    }

    public boolean n() {
        return this.o;
    }

    public boolean o() {
        return this.p;
    }

    public boolean p() {
        return this.r;
    }
}
