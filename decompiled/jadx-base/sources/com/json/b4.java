package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class b4 {
    private java.lang.String c;
    private java.lang.String d;
    private int f;
    private java.util.HashSet<java.lang.String> b = new java.util.HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2525a = false;
    private boolean e = false;
    private boolean g = true;

    public int a() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.b.add(str);
    }

    public void a(boolean z) {
        this.f2525a = z;
    }

    public java.util.HashSet<java.lang.String> b() {
        return this.b;
    }

    public void b(java.lang.String str) {
        this.d = str;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public java.lang.String c() {
        return this.d;
    }

    public void c(java.lang.String str) {
        this.c = str;
    }

    public void c(boolean z) {
        this.e = z;
    }

    public java.lang.String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f2525a;
    }

    public boolean g() {
        return this.g;
    }
}
