package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class iq implements com.applovin.impl.hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.iq.a f897a;
    private android.net.Uri b;
    private java.lang.String c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private iq() {
    }

    public java.lang.String toString() {
        return "VastNonVideoResource{type=" + this.f897a + ", resourceUri=" + this.b + ", resourceContents='" + this.c + "'}";
    }

    static com.applovin.impl.iq a(com.applovin.impl.es esVar, com.applovin.impl.iq iqVar, com.applovin.impl.sdk.j jVar) {
        if (esVar == null) {
            throw new java.lang.IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            if (iqVar == null) {
                try {
                    iqVar = new com.applovin.impl.iq();
                } catch (java.lang.Throwable th) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("VastNonVideoResource", "Error occurred while initializing", th);
                    }
                    jVar.D().a("VastNonVideoResource", th);
                    return null;
                }
            }
            if (iqVar.b == null && !com.applovin.impl.sdk.utils.StringUtils.isValidString(iqVar.c)) {
                java.lang.String strA = a(esVar, "StaticResource");
                if (android.webkit.URLUtil.isValidUrl(strA)) {
                    iqVar.b = android.net.Uri.parse(strA);
                    iqVar.f897a = com.applovin.impl.iq.a.STATIC;
                    return iqVar;
                }
                java.lang.String strA2 = a(esVar, "IFrameResource");
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA2)) {
                    iqVar.f897a = com.applovin.impl.iq.a.IFRAME;
                    if (android.webkit.URLUtil.isValidUrl(strA2)) {
                        iqVar.b = android.net.Uri.parse(strA2);
                    } else {
                        iqVar.c = strA2;
                    }
                    return iqVar;
                }
                java.lang.String strA3 = a(esVar, "HTMLResource");
                if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA3)) {
                    iqVar.f897a = com.applovin.impl.iq.a.HTML;
                    if (android.webkit.URLUtil.isValidUrl(strA3)) {
                        iqVar.b = android.net.Uri.parse(strA3);
                    } else {
                        iqVar.c = strA3;
                    }
                }
            }
            return iqVar;
        }
        throw new java.lang.IllegalArgumentException("No sdk specified.");
    }

    public com.applovin.impl.iq.a d() {
        return this.f897a;
    }

    public android.net.Uri c() {
        return this.b;
    }

    public java.lang.String b() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.iq)) {
            return false;
        }
        com.applovin.impl.iq iqVar = (com.applovin.impl.iq) obj;
        if (this.f897a != iqVar.f897a) {
            return false;
        }
        android.net.Uri uri = this.b;
        if (uri == null ? iqVar.b != null : !uri.equals(iqVar.b)) {
            return false;
        }
        java.lang.String str = this.c;
        java.lang.String str2 = iqVar.c;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        com.applovin.impl.iq.a aVar = this.f897a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        android.net.Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        java.lang.String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public static com.applovin.impl.iq a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "type", null);
        com.applovin.impl.iq.a aVarValueOf = string == null ? null : com.applovin.impl.iq.a.valueOf(string);
        java.lang.String string2 = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "resource_uri", null);
        android.net.Uri uri = com.applovin.impl.sdk.utils.StringUtils.isValidString(string2) ? android.net.Uri.parse(string2) : null;
        com.applovin.impl.iq iqVar = new com.applovin.impl.iq();
        iqVar.f897a = aVarValueOf;
        iqVar.b = uri;
        iqVar.c = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "resource_contents", null);
        return iqVar;
    }

    public void a(java.lang.String str) {
        this.c = str;
    }

    public void a(android.net.Uri uri) {
        this.b = uri;
    }

    private static java.lang.String a(com.applovin.impl.es esVar, java.lang.String str) {
        com.applovin.impl.es esVarC = esVar.c(str);
        if (esVarC != null) {
            return esVarC.d();
        }
        return null;
    }

    @Override // com.applovin.impl.hh
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.applovin.impl.iq.a aVar = this.f897a;
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        android.net.Uri uri = this.b;
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "resource_contents", this.c);
        return jSONObject;
    }
}
