package com.json;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s8 implements com.json.ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.df f3267a;

    protected s8(org.json.JSONObject jSONObject, android.content.Context context) {
        this.f3267a = a(jSONObject, context);
        com.json.sdk.utils.Logger.i("s8", "created ConnectivityAdapter with strategy " + this.f3267a.getClass().getSimpleName());
    }

    private com.json.df a(org.json.JSONObject jSONObject, android.content.Context context) {
        if (jSONObject.optInt(com.ironsource.y8.i.g0) != 1 && com.json.z3.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new com.json.fn(this);
        }
        return new com.json.sdk.service.Connectivity.BroadcastReceiverStrategy(this);
    }

    public org.json.JSONObject a(android.content.Context context) {
        return this.f3267a.c(context);
    }

    @Override // com.json.ef
    public void a() {
    }

    @Override // com.json.ef
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
    }

    public void b() {
        this.f3267a.a();
    }

    public void b(android.content.Context context) {
        this.f3267a.b(context);
    }

    @Override // com.json.ef
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }

    public void c(android.content.Context context) {
        this.f3267a.a(context);
    }
}
