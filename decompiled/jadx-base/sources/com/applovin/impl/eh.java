package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f762a;
    private java.util.Map b;

    public java.lang.String toString() {
        return "PendingReward{result='" + this.f762a + "'params='" + this.b + "'}";
    }

    public static com.applovin.impl.eh a(java.lang.String str) {
        return a(str, null);
    }

    private eh(java.lang.String str, java.util.Map map) {
        this.f762a = str;
        this.b = map;
    }

    public java.lang.String b() {
        return this.f762a;
    }

    public java.util.Map a() {
        return this.b;
    }

    public static com.applovin.impl.eh a(java.lang.String str, java.util.Map map) {
        return new com.applovin.impl.eh(str, map);
    }
}
