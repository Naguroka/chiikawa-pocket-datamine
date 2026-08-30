package com.applovin.impl.sdk.network;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f1320a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.util.Map e;
    private java.util.Map f;
    private java.util.Map g;
    private com.applovin.impl.vi.a h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private java.lang.String m;
    private int n;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f1321a;
        private java.lang.String b;
        private java.lang.String c;
        private java.lang.String d;
        private java.util.Map e;
        private java.util.Map f;
        private java.util.Map g;
        private com.applovin.impl.vi.a h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;

        public com.applovin.impl.sdk.network.d.b b(java.lang.String str) {
            this.f1321a = str;
            return this;
        }

        public com.applovin.impl.sdk.network.d.b c(java.lang.String str) {
            this.b = str;
            return this;
        }

        public com.applovin.impl.sdk.network.d.b d(java.lang.String str) {
            this.c = str;
            return this;
        }

        public com.applovin.impl.sdk.network.d.b b(java.util.Map map) {
            this.e = map;
            return this;
        }

        public com.applovin.impl.sdk.network.d.b c(java.util.Map map) {
            this.g = map;
            return this;
        }

        public com.applovin.impl.sdk.network.d.b d(boolean z) {
            this.k = z;
            return this;
        }

        public com.applovin.impl.sdk.network.d.b b(boolean z) {
            this.l = z;
            return this;
        }

        public com.applovin.impl.sdk.network.d.b c(boolean z) {
            this.j = z;
            return this;
        }

        public com.applovin.impl.sdk.network.d.b a(com.applovin.impl.vi.a aVar) {
            this.h = aVar;
            return this;
        }

        public com.applovin.impl.sdk.network.d.b a(java.lang.String str) {
            this.d = str;
            return this;
        }

        public com.applovin.impl.sdk.network.d.b a(java.util.Map map) {
            this.f = map;
            return this;
        }

        public com.applovin.impl.sdk.network.d.b a(boolean z) {
            this.i = z;
            return this;
        }

        public com.applovin.impl.sdk.network.d a() {
            return new com.applovin.impl.sdk.network.d(this);
        }
    }

    public static com.applovin.impl.sdk.network.d.b b() {
        return new com.applovin.impl.sdk.network.d.b();
    }

    void a() {
        java.util.Map map = com.applovin.impl.sdk.utils.CollectionUtils.map(this.e);
        map.put("postback_ts", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        this.e = map;
    }

    int c() {
        return this.n;
    }

    java.lang.String d() {
        return this.d;
    }

    java.lang.String e() {
        return this.m;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f1320a.equals(((com.applovin.impl.sdk.network.d) obj).f1320a);
    }

    java.util.Map g() {
        return this.f;
    }

    java.lang.String h() {
        return this.b;
    }

    public int hashCode() {
        return this.f1320a.hashCode();
    }

    java.util.Map i() {
        return this.e;
    }

    java.util.Map j() {
        return this.g;
    }

    java.lang.String k() {
        return this.c;
    }

    void l() {
        this.n++;
    }

    public boolean m() {
        return this.k;
    }

    boolean n() {
        return this.i;
    }

    boolean o() {
        return this.j;
    }

    boolean p() {
        return this.l;
    }

    org.json.JSONObject q() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("uniqueId", this.f1320a);
        jSONObject.put("communicatorRequestId", this.m);
        jSONObject.put("httpMethod", this.b);
        jSONObject.put("targetUrl", this.c);
        jSONObject.put("backupUrl", this.d);
        jSONObject.put("encodingType", this.h);
        jSONObject.put("isEncodingEnabled", this.i);
        jSONObject.put("gzipBodyEncoding", this.j);
        jSONObject.put("isAllowedPreInitEvent", this.k);
        jSONObject.put("attemptNumber", this.n);
        if (this.e != null) {
            jSONObject.put("parameters", new org.json.JSONObject(this.e));
        }
        if (this.f != null) {
            jSONObject.put("httpHeaders", new org.json.JSONObject(this.f));
        }
        if (this.g != null) {
            jSONObject.put("requestBody", new org.json.JSONObject(this.g));
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return "PostbackRequest{uniqueId='" + this.f1320a + "', communicatorRequestId='" + this.m + "', httpMethod='" + this.b + "', targetUrl='" + this.c + "', backupUrl='" + this.d + "', attemptNumber=" + this.n + ", isEncodingEnabled=" + this.i + ", isGzipBodyEncoding=" + this.j + ", isAllowedPreInitEvent=" + this.k + ", shouldFireInWebView=" + this.l + '}';
    }

    d(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) throws org.json.JSONException {
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "uniqueId", java.util.UUID.randomUUID().toString());
        java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        java.lang.String string3 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "httpMethod", "");
        java.lang.String string4 = jSONObject.getString("targetUrl");
        java.lang.String string5 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "backupUrl", "");
        int i = jSONObject.getInt("attemptNumber");
        java.util.Map mapSynchronizedMap = com.applovin.impl.sdk.utils.JsonUtils.valueExists(jSONObject, "parameters") ? java.util.Collections.synchronizedMap(com.applovin.impl.sdk.utils.JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new java.util.HashMap();
        java.util.Map mapSynchronizedMap2 = com.applovin.impl.sdk.utils.JsonUtils.valueExists(jSONObject, "httpHeaders") ? java.util.Collections.synchronizedMap(com.applovin.impl.sdk.utils.JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new java.util.HashMap();
        java.util.Map mapSynchronizedMap3 = com.applovin.impl.sdk.utils.JsonUtils.valueExists(jSONObject, "requestBody") ? java.util.Collections.synchronizedMap(com.applovin.impl.sdk.utils.JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new java.util.HashMap();
        this.f1320a = string;
        this.b = string3;
        this.m = string2;
        this.c = string4;
        this.d = string5;
        this.e = mapSynchronizedMap;
        this.f = mapSynchronizedMap2;
        this.g = mapSynchronizedMap3;
        this.h = com.applovin.impl.vi.a.a(jSONObject.optInt("encodingType", com.applovin.impl.vi.a.DEFAULT.b()));
        this.i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.n = i;
    }

    private d(com.applovin.impl.sdk.network.d.b bVar) {
        this.f1320a = java.util.UUID.randomUUID().toString();
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.f1321a;
        this.n = 0;
    }

    com.applovin.impl.vi.a f() {
        return this.h;
    }
}
