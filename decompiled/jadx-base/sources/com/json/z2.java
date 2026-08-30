package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.mediationsdk.model.NetworkSettings f3604a;
    private org.json.JSONObject b;
    private com.ironsource.mediationsdk.IronSource.AD_UNIT c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;

    public z2(com.json.mediationsdk.model.NetworkSettings networkSettings, org.json.JSONObject jSONObject, com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        this.f3604a = networkSettings;
        this.b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f = iOptInt;
        this.d = iOptInt == 2;
        this.e = jSONObject.optBoolean(com.json.mediationsdk.utils.IronSourceConstants.EARLY_INIT_FIELD);
        this.g = jSONObject.optInt("maxAdsPerSession", 99);
        this.c = ad_unit;
    }

    public java.lang.String a() {
        return this.f3604a.getAdSourceNameForEvents();
    }

    public com.ironsource.mediationsdk.IronSource.AD_UNIT b() {
        return this.c;
    }

    public org.json.JSONObject c() {
        return this.b;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    public java.lang.String f() {
        return this.f3604a.getProviderName();
    }

    public java.lang.String g() {
        return this.f3604a.getProviderTypeForReflection();
    }

    public com.json.mediationsdk.model.NetworkSettings h() {
        return this.f3604a;
    }

    public java.lang.String i() {
        return this.f3604a.getSubProviderId();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return this.e;
    }
}
