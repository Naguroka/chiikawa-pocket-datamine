package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class wa {
    private static com.json.wa h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f3530a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private int e;
    private java.lang.String f;
    private final com.json.Cif g;

    private wa(android.content.Context context) {
        com.json.Cif cifF = com.json.im.S().f();
        this.g = cifF;
        this.f3530a = cifF.g();
        this.b = cifF.e();
        this.c = cifF.l();
        this.d = cifF.o();
        this.e = cifF.k();
        this.f = cifF.j(context);
    }

    public static com.json.wa b(android.content.Context context) {
        if (h == null) {
            h = new com.json.wa(context);
        }
        return h;
    }

    public static void g() {
        h = null;
    }

    public float a(android.content.Context context) {
        return this.g.m(context);
    }

    public int a() {
        return this.e;
    }

    public java.lang.String b() {
        return this.f;
    }

    public java.lang.String c() {
        return this.b;
    }

    public java.lang.String d() {
        return this.f3530a;
    }

    public java.lang.String e() {
        return this.c;
    }

    public java.lang.String f() {
        return this.d;
    }
}
