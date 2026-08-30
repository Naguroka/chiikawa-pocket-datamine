package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class wp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1477a;
    private java.lang.String b;
    private final java.lang.String c = a(com.applovin.impl.uj.i, (java.lang.String) com.applovin.impl.vj.a(com.applovin.impl.uj.h, (java.lang.Object) null, com.applovin.impl.sdk.j.m()));
    private final java.lang.String d;

    public wp(com.applovin.impl.sdk.j jVar) {
        this.f1477a = jVar;
        this.d = a(com.applovin.impl.uj.j, (java.lang.String) jVar.a(com.applovin.impl.sj.g));
        a(d());
    }

    private java.lang.String d() {
        if (!((java.lang.Boolean) this.f1477a.a(com.applovin.impl.sj.J3)).booleanValue()) {
            this.f1477a.c(com.applovin.impl.uj.g);
        }
        java.lang.String str = (java.lang.String) this.f1477a.a(com.applovin.impl.uj.g);
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return null;
        }
        this.f1477a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1477a.I().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public java.lang.String c() {
        return this.b;
    }

    public java.lang.String b() {
        return this.c;
    }

    public java.lang.String a() {
        return this.d;
    }

    public static java.lang.String a(com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.uj ujVar = com.applovin.impl.uj.k;
        java.lang.String str = (java.lang.String) jVar.a(ujVar);
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(((int) (java.lang.Math.random() * 100.0d)) + 1);
        jVar.b(ujVar, strValueOf);
        return strValueOf;
    }

    private java.lang.String a(com.applovin.impl.uj ujVar, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) com.applovin.impl.vj.a(ujVar, (java.lang.Object) null, com.applovin.impl.sdk.j.m());
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            str = java.util.UUID.randomUUID().toString().toLowerCase(java.util.Locale.US);
        }
        com.applovin.impl.vj.b(ujVar, str, com.applovin.impl.sdk.j.m());
        return str;
    }

    public void a(java.lang.String str) {
        if (((java.lang.Boolean) this.f1477a.a(com.applovin.impl.sj.J3)).booleanValue()) {
            this.f1477a.b(com.applovin.impl.uj.g, str);
        }
        this.b = str;
        this.f1477a.q().b(str, a());
    }
}
