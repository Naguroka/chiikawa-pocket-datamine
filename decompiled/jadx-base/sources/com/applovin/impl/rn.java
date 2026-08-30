package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class rn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.rn.a f1230a;
    private final java.lang.Integer b;
    private final java.lang.String c;
    private final java.lang.String d;
    private java.lang.Boolean e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static com.applovin.impl.rn.a b(int i) {
            if (i == 0) {
                return TCF_VENDOR;
            }
            if (i != 1) {
                return OTHER;
            }
            return ATP_NETWORK;
        }
    }

    public com.applovin.impl.rn.a f() {
        return this.f1230a;
    }

    public java.lang.Integer d() {
        return this.b;
    }

    public java.lang.String c() {
        return this.c;
    }

    public java.lang.String b() {
        return this.d;
    }

    public java.lang.Boolean a() {
        return this.e;
    }

    public rn(org.json.JSONObject jSONObject, java.lang.String str) {
        this.d = str;
        this.f1230a = com.applovin.impl.rn.a.b(com.applovin.impl.sdk.utils.JsonUtils.getInt(jSONObject, "type", com.applovin.impl.rn.a.OTHER.ordinal()));
        this.b = com.applovin.impl.sdk.utils.JsonUtils.getInteger(jSONObject, "id", null);
        this.c = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "name", null);
    }

    public java.lang.String e() {
        java.lang.Boolean bool = this.e;
        return "\n" + this.d + " - " + (bool != null ? java.lang.String.valueOf(bool) : com.applovin.impl.a4.b().a(com.applovin.impl.sdk.j.m()));
    }

    public void a(java.lang.Boolean bool) {
        this.e = bool;
    }
}
