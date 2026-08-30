package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ah {
    public static final int c = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2506a;
    private int b;

    public ah(int i, java.lang.String str) {
        this.b = i;
        this.f2506a = str == null ? "" : str;
    }

    public int a() {
        return this.b;
    }

    public java.lang.String b() {
        return this.f2506a;
    }

    public java.lang.String toString() {
        return "error - code:" + this.b + ", message:" + this.f2506a;
    }
}
