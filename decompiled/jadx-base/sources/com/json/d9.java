package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f2578a;
    private org.json.JSONObject b;
    private java.lang.String c;
    private java.lang.String d;

    public d9(java.lang.String str) {
        this.f2578a = str;
    }

    public d9(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f2578a = str;
        this.c = str2;
        this.d = str3;
    }

    public d9(java.lang.String str, org.json.JSONObject jSONObject) {
        this.f2578a = str;
        this.b = jSONObject;
    }

    public d9(java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2, java.lang.String str3) {
        this.f2578a = str;
        this.b = jSONObject;
        this.c = str2;
        this.d = str3;
    }

    public java.lang.String a() {
        return this.d;
    }

    public java.lang.String b() {
        return this.f2578a;
    }

    public org.json.JSONObject c() {
        return this.b;
    }

    public java.lang.String d() {
        return this.c;
    }
}
