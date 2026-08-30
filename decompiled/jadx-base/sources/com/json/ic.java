package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2735a;
    private java.lang.String b;
    private int c;
    private java.lang.String d;

    public ic(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.c = i;
        this.b = str2;
        this.f2735a = str;
        this.d = str3;
    }

    public ic(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.c = -1;
        this.b = str2;
        this.f2735a = str;
        this.d = str3;
    }

    public void a() {
        com.json.ca.a(this);
    }

    public java.lang.String b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public java.lang.String d() {
        return this.d;
    }

    public java.lang.String e() {
        return this.f2735a;
    }
}
