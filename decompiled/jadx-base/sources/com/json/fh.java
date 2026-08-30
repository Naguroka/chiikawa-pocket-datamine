package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class fh implements com.json.qf {
    @Override // com.json.qf
    public java.lang.String a(java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            return java.lang.String.format("%s=%s", "data", android.util.Base64.encodeToString(new org.json.JSONObject().put(com.json.zb.Q, com.json.zb.R).put("data", new org.json.JSONObject(map)).toString().getBytes(), 2));
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
