package com.bytedance.sdk.openadsdk.core.PX;

/* JADX INFO: loaded from: classes4.dex */
public class eo {
    private final java.net.URL IL;
    private final java.lang.String bX;
    private final java.lang.String bg;
    private final java.lang.String eqN;

    private eo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws java.net.MalformedURLException {
        this.bg = str2;
        this.IL = new java.net.URL(str);
        this.bX = str3;
        this.eqN = str4;
    }

    public java.lang.String bg() {
        return this.bg;
    }

    public java.lang.String IL() {
        return this.bX;
    }

    public java.net.URL bX() {
        return this.IL;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.bytedance.sdk.openadsdk.core.PX.eo)) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.PX.eo eoVar = (com.bytedance.sdk.openadsdk.core.PX.eo) obj;
        if (bg(this.bg, eoVar.bg) && bg(this.IL, eoVar.IL) && bg(this.bX, eoVar.bX)) {
            return bg(this.eqN, eoVar.eqN);
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.bg;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.IL.hashCode()) * 31;
        java.lang.String str2 = this.bX;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.eqN;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    private boolean bg(java.lang.Object obj, java.lang.Object obj2) {
        return java.util.Objects.equals(obj, obj2);
    }

    public org.json.JSONObject eqN() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("apiFramework", "omid");
            jSONObject.put("javascriptResourceUrl", this.IL.toString());
            if (!android.text.TextUtils.isEmpty(this.bg)) {
                jSONObject.put("vendorKey", this.bg);
            }
            if (!android.text.TextUtils.isEmpty(this.bX)) {
                jSONObject.put("verificationParameters", this.bX);
            }
            if (!android.text.TextUtils.isEmpty(this.eqN)) {
                jSONObject.put("verificationNotExecuted", this.eqN);
            }
            return jSONObject;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.PX.eo bg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if ("omid".equalsIgnoreCase(str) && !android.text.TextUtils.isEmpty(str2)) {
            try {
                return new com.bytedance.sdk.openadsdk.core.PX.eo(str2, str3, str4, str5);
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }

    public static com.bytedance.sdk.openadsdk.core.PX.eo bg(org.json.JSONObject jSONObject) {
        try {
            java.lang.String strOptString = jSONObject.optString("apiFramework");
            java.lang.String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if ("omid".equalsIgnoreCase(strOptString) && !android.text.TextUtils.isEmpty(strOptString2)) {
                return new com.bytedance.sdk.openadsdk.core.PX.eo(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public static java.util.Set<com.bytedance.sdk.openadsdk.core.PX.eo> bg(org.json.JSONArray jSONArray) {
        java.util.HashSet hashSet = new java.util.HashSet();
        if (jSONArray == null) {
            return hashSet;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                hashSet.add(bg(jSONArray.getJSONObject(i)));
            } catch (java.lang.Throwable unused) {
            }
        }
        return hashSet;
    }
}
