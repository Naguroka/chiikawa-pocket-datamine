package com.bytedance.sdk.component.adexpress.dynamic.zx;

/* JADX INFO: loaded from: classes3.dex */
public class WR {
    public static void bg(java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectBOf = com.bytedance.sdk.component.adexpress.IL.bOf(str);
        if (jSONObjectBOf == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        org.json.JSONObject jSONObjectOptJSONObject = jSONObjectBOf.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        bg(jSONObjectOptJSONObject, jSONObject);
    }

    public static org.json.JSONObject bg(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONObject jSONObjectBOf = com.bytedance.sdk.component.adexpress.IL.bOf(str);
        if (jSONObjectBOf == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        return bg(jSONObject2, jSONObjectBOf.optJSONObject("themeValues"), jSONObject);
    }

    private static void bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new org.json.JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (org.json.JSONException unused) {
                }
            }
        }
    }

    public static org.json.JSONObject bg(org.json.JSONObject... jSONObjectArr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (org.json.JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (org.json.JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static java.lang.String bg(java.lang.String str) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONObject jSONObjectBOf = com.bytedance.sdk.component.adexpress.IL.bOf(str);
        if (jSONObjectBOf == null || (jSONObjectOptJSONObject = jSONObjectBOf.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static java.lang.String bg(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONObject jSONObjectBOf = com.bytedance.sdk.component.adexpress.IL.bOf(str);
        if (jSONObjectBOf == null || (jSONObjectOptJSONObject = jSONObjectBOf.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static org.json.JSONObject bg(org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }

    public static java.lang.String IL(java.lang.String str, java.lang.String str2) {
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            if (str.indexOf(46) < 0) {
                str = str + ".png";
            }
            return str2 + "static/images/" + str;
        }
        return com.bytedance.sdk.component.adexpress.dynamic.zx.bg.bg(str);
    }
}
