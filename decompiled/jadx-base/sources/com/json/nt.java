package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f3103a;

    public nt(org.json.JSONObject jSONObject) {
        this.f3103a = jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.f3103a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f3103a.optBoolean(com.ironsource.y8.a.o, false);
    }

    public boolean c() {
        return this.f3103a.optBoolean(com.ironsource.y8.a.p, false);
    }

    public boolean d() {
        return this.f3103a.optBoolean(com.ironsource.y8.a.l, false);
    }

    public boolean e() {
        return this.f3103a.optBoolean(com.ironsource.y8.a.n, false);
    }
}
