package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ch extends java.io.IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f679a;
    public final int b;

    public static com.applovin.impl.ch a(java.lang.String str, java.lang.Throwable th) {
        return new com.applovin.impl.ch(str, th, true, 1);
    }

    public static com.applovin.impl.ch b(java.lang.String str, java.lang.Throwable th) {
        return new com.applovin.impl.ch(str, th, true, 0);
    }

    public static com.applovin.impl.ch a(java.lang.String str) {
        return new com.applovin.impl.ch(str, null, false, 1);
    }

    protected ch(java.lang.String str, java.lang.Throwable th, boolean z, int i) {
        super(str, th);
        this.f679a = z;
        this.b = i;
    }
}
