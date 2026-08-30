package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.ironsource.mediationsdk.IronSource.AD_UNIT f2779a;
    private java.lang.String b;
    private com.json.mediationsdk.model.NetworkSettings c;
    private int d;
    private int e;
    private org.json.JSONObject f;
    private java.lang.String g;
    private int h;
    private java.lang.String i;

    public j1(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit, java.lang.String str, int i, org.json.JSONObject jSONObject, java.lang.String str2, int i2, java.lang.String str3, com.json.mediationsdk.model.NetworkSettings networkSettings, int i3) {
        this.f2779a = ad_unit;
        this.b = str;
        this.e = i;
        this.f = jSONObject;
        this.g = str2;
        this.h = i2;
        this.i = str3;
        this.c = networkSettings;
        this.d = i3;
    }

    public com.ironsource.mediationsdk.IronSource.AD_UNIT a() {
        return this.f2779a;
    }

    public java.lang.String b() {
        return this.i;
    }

    public java.lang.String c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public org.json.JSONObject e() {
        return this.f;
    }

    public int f() {
        return this.d;
    }

    public com.json.mediationsdk.model.NetworkSettings g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public java.lang.String i() {
        return this.b;
    }
}
