package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f3226a = "errMsg";

    public static org.json.JSONObject a(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errMsg", str);
            jSONObject.put("adViewId", str2);
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }
}
