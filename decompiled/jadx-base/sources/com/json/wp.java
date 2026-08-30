package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class wp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList<java.lang.String> f3541a = new java.util.ArrayList<>();
    private final java.util.ArrayList<java.lang.String> b = new java.util.ArrayList<>();
    private final java.util.ArrayList<java.lang.String> c = new java.util.ArrayList<>();
    private final java.util.ArrayList<java.lang.String> d = new java.util.ArrayList<>();

    public java.util.ArrayList<java.lang.String> a() {
        return this.c;
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.c.add(str);
    }

    public java.util.ArrayList<java.lang.String> b() {
        return this.b;
    }

    public void b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.b.add(str);
    }

    public java.util.ArrayList<java.lang.String> c() {
        return this.d;
    }

    public void c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.d.add(str);
    }

    public java.util.ArrayList<java.lang.String> d() {
        return this.f3541a;
    }

    public void d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f3541a.add(str);
    }
}
