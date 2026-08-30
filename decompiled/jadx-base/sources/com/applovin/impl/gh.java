package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f823a;
    private final java.lang.String b;
    private final boolean c;

    gh(java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f823a = str.replace("android.permission.", "");
        this.b = str2;
        this.c = com.applovin.impl.z3.a(str, context);
    }

    public java.lang.String b() {
        return this.f823a;
    }

    public java.lang.String a() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}
