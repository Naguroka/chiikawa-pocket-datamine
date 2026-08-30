package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.json.fe f2655a = new com.json.fe();

    public static com.json.fe a() {
        return f2655a;
    }

    public static java.util.HashMap<java.lang.String, java.lang.Object> a(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> concurrentHashMap) throws org.json.JSONException {
        java.lang.Object objA;
        java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() instanceof org.json.JSONObject) {
                objA = a((org.json.JSONObject) entry.getValue());
            } else if (entry.getValue() instanceof org.json.JSONArray) {
                objA = a((org.json.JSONArray) entry.getValue());
            } else if (entry.getValue() instanceof java.util.Map) {
                objA = a((java.util.Map<java.lang.String, java.lang.Object>) entry.getValue());
            } else {
                map.put(entry.getKey(), entry.getValue());
            }
            map.put(entry.getKey(), objA);
        }
        return map;
    }

    public static java.util.Map<java.lang.String, java.lang.Object> a(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.HashMap map2 = new java.util.HashMap();
        for (java.lang.String str : map.keySet()) {
            map2.put(str, map.get(str));
        }
        return map2;
    }

    public static org.json.JSONArray a(org.json.JSONArray jSONArray) {
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.opt(i));
        }
        return jSONArray2;
    }

    public static org.json.JSONObject a(org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }

    public static org.json.JSONObject b(org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof java.util.List) {
                    jSONObject.put(next, android.text.TextUtils.join(",", (java.util.List) objOpt));
                }
            }
        }
        return jSONObject;
    }
}
