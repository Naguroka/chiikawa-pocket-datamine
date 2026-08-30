package com.json;

/* JADX INFO: loaded from: classes5.dex */
class gk extends com.json.e {
    private final java.lang.String i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    private final java.lang.String j = "super.dwh.mediation_events";
    private final java.lang.String k = com.json.zb.Q;
    private final java.lang.String l = "data";

    gk(int i) {
        this.g = i;
    }

    @Override // com.json.e
    public java.lang.String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.json.e
    public java.lang.String a(java.util.ArrayList<com.json.wb> arrayList, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        this.f = jSONObject;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                java.util.Iterator<com.json.wb> it = arrayList.iterator();
                while (it.hasNext()) {
                    org.json.JSONObject jSONObjectA = a(it.next());
                    if (jSONObjectA != null) {
                        jSONArray.put(jSONObjectA);
                    }
                }
            }
            jSONObject2.put(com.json.zb.Q, "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    @Override // com.json.e
    public java.lang.String c() {
        return "ironbeast";
    }
}
