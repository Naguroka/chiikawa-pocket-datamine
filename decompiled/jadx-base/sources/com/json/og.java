package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3119a;
    private int b;
    private java.lang.String c;

    public og() {
        this.f3119a = 0;
        this.b = 0;
        this.c = "";
    }

    public og(int i, int i2, java.lang.String str) {
        this.f3119a = i;
        this.b = i2;
        this.c = str;
    }

    public int a() {
        return this.b;
    }

    public java.lang.String b() {
        return this.c;
    }

    public int c() {
        return this.f3119a;
    }

    public boolean d() {
        return this.b > 0 && this.f3119a > 0;
    }

    public boolean e() {
        return this.b == 0 && this.f3119a == 0;
    }

    public java.lang.String toString() {
        return this.c;
    }
}
