package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1442a;
    private final java.lang.String b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1443a;

        a(java.lang.String str) {
            this.f1443a = str;
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return this.f1443a;
        }
    }

    public w(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Identifier is empty");
        }
        if (jVar != null) {
            this.b = str;
            this.f1442a = jVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified");
    }

    public java.lang.String b() {
        return this.b;
    }

    public com.applovin.impl.w.a c() {
        if (a(com.applovin.impl.sj.y0) != null) {
            return com.applovin.impl.w.a.REGULAR;
        }
        if (a(com.applovin.impl.sj.z0) != null) {
            return com.applovin.impl.w.a.AD_RESPONSE_JSON;
        }
        return com.applovin.impl.w.a.UNSPECIFIED;
    }

    public java.lang.String d() {
        java.lang.String strA = a(com.applovin.impl.sj.y0);
        if (!android.text.TextUtils.isEmpty(strA)) {
            return strA;
        }
        java.lang.String strA2 = a(com.applovin.impl.sj.z0);
        if (android.text.TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public org.json.JSONObject a() {
        if (c() != com.applovin.impl.w.a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(this.b.substring(d().length()), 0), com.adjust.sdk.Constants.ENCODING));
                this.f1442a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1442a.I().a("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (org.json.JSONException e) {
                this.f1442a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f1442a.I().a("AdToken", "Unable to decode token '" + this.b + "' into JSON", e);
                }
                this.f1442a.D().a("AdToken", "decodeFullAdResponseStr", e);
                return null;
            }
        } catch (java.io.UnsupportedEncodingException e2) {
            this.f1442a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1442a.I().a("AdToken", "Unable to process ad response from token '" + this.b + "'", e2);
            }
            this.f1442a.D().a("AdToken", "decodeFullAdResponse", e2);
            return null;
        }
    }

    public java.lang.String toString() {
        return "AdToken{id=" + com.applovin.impl.sdk.utils.StringUtils.prefixToIndex(32, this.b) + ", type=" + c() + '}';
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.w)) {
            return false;
        }
        java.lang.String str = this.b;
        java.lang.String str2 = ((com.applovin.impl.w) obj).b;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        java.lang.String str = this.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    private java.lang.String a(com.applovin.impl.sj sjVar) {
        for (java.lang.String str : this.f1442a.c(sjVar)) {
            if (this.b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
