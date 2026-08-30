package com.json.mediationsdk.logger;

/* JADX INFO: loaded from: classes5.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag f2990a;
    private java.lang.String b;
    private java.lang.String c;
    private int d;

    public c(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, java.lang.String str2, int i) {
        this.f2990a = ironSourceTag;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public int a() {
        return this.d;
    }

    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.aa.a.d, this.b);
            jSONObject.put("tag", this.f2990a);
            jSONObject.put("level", this.d);
            jSONObject.put(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, this.c);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }
}
