package com.iab.omid.library.ironsrc.adsession;

/* JADX INFO: loaded from: classes5.dex */
public final class VerificationScriptResource {
    private final java.net.URL resourceUrl;
    private final java.lang.String vendorKey;
    private final java.lang.String verificationParameters;

    private VerificationScriptResource(java.lang.String str, java.net.URL url, java.lang.String str2) {
        this.vendorKey = str;
        this.resourceUrl = url;
        this.verificationParameters = str2;
    }

    public static com.iab.omid.library.ironsrc.adsession.VerificationScriptResource createVerificationScriptResourceWithParameters(java.lang.String str, java.net.URL url, java.lang.String str2) {
        com.iab.omid.library.ironsrc.utils.g.a(str, "VendorKey is null or empty");
        com.iab.omid.library.ironsrc.utils.g.a(url, "ResourceURL is null");
        com.iab.omid.library.ironsrc.utils.g.a(str2, "VerificationParameters is null or empty");
        return new com.iab.omid.library.ironsrc.adsession.VerificationScriptResource(str, url, str2);
    }

    public static com.iab.omid.library.ironsrc.adsession.VerificationScriptResource createVerificationScriptResourceWithoutParameters(java.net.URL url) {
        com.iab.omid.library.ironsrc.utils.g.a(url, "ResourceURL is null");
        return new com.iab.omid.library.ironsrc.adsession.VerificationScriptResource(null, url, null);
    }

    public java.net.URL getResourceUrl() {
        return this.resourceUrl;
    }

    public java.lang.String getVendorKey() {
        return this.vendorKey;
    }

    public java.lang.String getVerificationParameters() {
        return this.verificationParameters;
    }

    public org.json.JSONObject toJsonObject() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, "vendorKey", this.vendorKey);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, "resourceUrl", this.resourceUrl.toString());
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, "verificationParameters", this.verificationParameters);
        return jSONObject;
    }
}
