package com.bytedance.adsdk.ugeno.iR;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public static void bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (org.json.JSONException unused) {
            }
        }
    }

    public static org.json.JSONObject bg(java.lang.String str, org.json.JSONObject jSONObject) {
        if (android.text.TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            return jSONObject;
        }
    }

    public static org.json.JSONArray bg(java.lang.String str, org.json.JSONArray jSONArray) {
        if (android.text.TextUtils.isEmpty(str)) {
            return jSONArray;
        }
        try {
            return new org.json.JSONArray(str);
        } catch (org.json.JSONException unused) {
            return jSONArray;
        }
    }

    public static void bg(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        if (jSONArray2 == null || jSONArray2.length() <= 0) {
            return;
        }
        if (jSONArray == null) {
            jSONArray = new org.json.JSONArray();
        }
        for (int i = 0; i < jSONArray2.length(); i++) {
            java.lang.Object objOpt = jSONArray2.opt(i);
            if (objOpt != null) {
                jSONArray.put(objOpt);
            }
        }
    }
}
