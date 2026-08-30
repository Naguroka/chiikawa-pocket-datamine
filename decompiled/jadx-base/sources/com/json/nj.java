package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f3093a;
    private java.lang.String e;
    private java.util.Map<java.lang.String, java.lang.String> f;
    private final com.json.eo g;
    private boolean h;
    private boolean b = false;
    private boolean c = false;
    private com.json.og d = null;
    protected boolean i = false;
    protected java.lang.String j = null;

    public nj(java.lang.String str, com.json.eo eoVar) throws java.lang.NullPointerException {
        this.f3093a = com.json.sdk.utils.SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.g = (com.json.eo) com.json.sdk.utils.SDKUtils.requireNonNull(eoVar, "AdListener name can't be null");
    }

    public com.json.mj a() {
        return new com.json.mj(b(), this.f3093a, this.b, this.c, this.h, this.i, this.j, this.f, this.g, this.d);
    }

    public com.json.nj a(com.json.og ogVar) {
        this.d = ogVar;
        return this;
    }

    public com.json.nj a(java.lang.String str) {
        this.e = str;
        return this;
    }

    public com.json.nj a(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f = map;
        return this;
    }

    public com.json.nj a(boolean z) {
        this.c = z;
        return this;
    }

    public com.json.nj b(java.lang.String str) {
        this.j = str;
        return this;
    }

    public com.json.nj b(boolean z) {
        this.i = z;
        return this;
    }

    public java.lang.String b() {
        java.lang.String str = this.e;
        if (str != null) {
            return str;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("name", this.f3093a);
            jSONObject.put("rewarded", this.b);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return (this.c || this.h) ? com.json.xj.a() : com.json.xj.a(jSONObject);
    }

    public com.json.nj c() {
        this.b = true;
        return this;
    }

    public com.json.nj c(boolean z) {
        this.h = z;
        return this;
    }
}
