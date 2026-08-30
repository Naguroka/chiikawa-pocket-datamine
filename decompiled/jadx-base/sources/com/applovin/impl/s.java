package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1236a;
    private final java.lang.String b;
    private final java.util.Map c;
    private final boolean d;

    public java.lang.String toString() {
        return "AdEventPostback{url='" + this.f1236a + "', backupUrl='" + this.b + "', headers='" + this.c + "', shouldFireInWebView='" + this.d + "'}";
    }

    public s(java.lang.String str, java.lang.String str2) {
        this(str, str2, null, false);
    }

    public java.lang.String c() {
        return this.f1236a;
    }

    public java.lang.String a() {
        return this.b;
    }

    public s(java.lang.String str, java.lang.String str2, java.util.Map map, boolean z) {
        this.f1236a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
    }

    public java.util.Map b() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
