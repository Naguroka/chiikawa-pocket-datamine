package com.bytedance.sdk.component.adexpress.dynamic.zx;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    public static org.json.JSONObject bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (jSONObject2 == null || jSONObject2.length() <= 0 || jSONObject == null) {
            return jSONObject;
        }
        try {
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object objOpt = jSONObject.opt(next);
                java.lang.Object objOpt2 = jSONObject2.opt(next);
                if (objOpt2 == null || objOpt2 == org.json.JSONObject.NULL) {
                    jSONObject3.put(next, objOpt);
                } else if ((objOpt instanceof org.json.JSONObject) && (objOpt2 instanceof org.json.JSONObject)) {
                    jSONObject3.put(next, bg((org.json.JSONObject) objOpt, (org.json.JSONObject) objOpt2));
                } else if ((objOpt instanceof org.json.JSONArray) && (objOpt2 instanceof org.json.JSONArray)) {
                    jSONObject3.put(next, bg((org.json.JSONArray) objOpt, (org.json.JSONArray) objOpt2));
                } else {
                    jSONObject3.put(next, objOpt2);
                }
            }
            java.util.Iterator<java.lang.String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                java.lang.String next2 = itKeys2.next();
                if (!jSONObject.has(next2)) {
                    jSONObject3.put(next2, jSONObject2.opt(next2));
                }
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject3;
    }

    private static org.json.JSONArray bg(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        if (jSONArray2 == null || jSONArray2.length() <= 0) {
            return jSONArray;
        }
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                java.lang.Object objOpt = jSONArray.opt(i);
                java.lang.Object objOpt2 = jSONArray2.opt(i);
                if (objOpt2 == null || objOpt2 == org.json.JSONObject.NULL) {
                    jSONArray3.put(i, objOpt);
                } else if ((objOpt instanceof org.json.JSONObject) && (objOpt2 instanceof org.json.JSONObject)) {
                    jSONArray3.put(i, bg((org.json.JSONObject) objOpt, (org.json.JSONObject) objOpt2));
                } else if ((objOpt instanceof org.json.JSONArray) && (objOpt2 instanceof org.json.JSONArray)) {
                    jSONArray3.put(i, bg((org.json.JSONArray) objOpt, (org.json.JSONArray) objOpt2));
                } else {
                    jSONArray3.put(i, objOpt2);
                }
            } catch (org.json.JSONException unused) {
            }
        }
        return jSONArray3;
    }
}
