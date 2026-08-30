package com.bytedance.sdk.component.adexpress.dynamic.zx;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    public org.json.JSONObject bg(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN.bg> list, int i, org.json.JSONObject jSONObject) {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN.bg next;
        org.json.JSONObject jSONObject2;
        if (list == null || list.size() <= 0) {
            return null;
        }
        java.util.Iterator<com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN.bg> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && next.bg == i) {
                break;
            }
        }
        if (next == null || (jSONObject2 = next.IL) == null) {
            return null;
        }
        return bg(jSONObject2, jSONObject);
    }

    private static org.json.JSONObject bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("customComponentDefaultValues");
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("values");
            java.util.Iterator<java.lang.String> itKeys = jSONObjectOptJSONObject2.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                jSONObjectOptJSONObject.put(next, jSONObjectOptJSONObject2.opt(next));
            }
            java.util.Iterator<java.lang.String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                java.lang.String next2 = itKeys2.next();
                if (!android.text.TextUtils.equals(next2, "customComponentDefaultValues")) {
                    if (android.text.TextUtils.equals(next2, "values")) {
                        jSONObject3.put(next2, jSONObjectOptJSONObject);
                    } else {
                        jSONObject3.put(next2, jSONObject.opt(next2));
                    }
                }
            }
            jSONObject3.put("type", "vessel");
            org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("values");
            org.json.JSONObject jSONObjectOptJSONObject4 = jSONObject3.optJSONObject("values");
            if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject4 != null) {
                java.util.Iterator<java.lang.String> itKeys3 = jSONObjectOptJSONObject3.keys();
                while (itKeys3.hasNext()) {
                    java.lang.String next3 = itKeys3.next();
                    if (!"clickArea".equals(next3)) {
                        jSONObjectOptJSONObject4.put(next3, jSONObjectOptJSONObject3.opt(next3));
                    }
                }
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject3;
    }
}
