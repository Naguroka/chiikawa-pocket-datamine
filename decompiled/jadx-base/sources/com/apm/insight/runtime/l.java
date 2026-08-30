package com.apm.insight.runtime;

/* JADX INFO: compiled from: NpthConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static org.json.JSONObject f485a = new org.json.JSONObject();

    public static void a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            java.lang.String strA = com.apm.insight.runtime.a.a(jSONObject);
            java.io.File file = new java.io.File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configNative");
            if (strA != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(strA);
                f485a = jSONObject2;
                com.apm.insight.l.f.a(file, b(jSONObject2));
                return;
            }
            f485a = new org.json.JSONObject();
        } catch (org.json.JSONException unused) {
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        }
    }

    private static org.json.JSONObject b(org.json.JSONObject jSONObject) {
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        com.apm.insight.runtime.e eVar = new com.apm.insight.runtime.e();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            if (!"configType".equals(next)) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject == null) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(new java.lang.IllegalArgumentException("err config with key: ".concat(java.lang.String.valueOf(next))), "NPTH_CATCH");
                } else if (a(jSONObjectOptJSONObject.optJSONArray("disable"), eVar)) {
                    com.apm.insight.a.a((java.lang.Object) "match diable ".concat(java.lang.String.valueOf(next)));
                } else {
                    org.json.JSONArray jSONArrayB = b(jSONObjectOptJSONObject.optJSONArray(com.json.mediationsdk.metadata.a.j), eVar);
                    if (com.apm.insight.a.a(jSONArrayB)) {
                        com.apm.insight.a.a((java.lang.Object) "not match ".concat(java.lang.String.valueOf(next)));
                    } else {
                        try {
                            jSONObject2.put(next, new org.json.JSONObject().put(com.json.mediationsdk.metadata.a.j, jSONArrayB));
                        } catch (org.json.JSONException unused) {
                        }
                    }
                }
            }
        }
        return jSONObject2;
    }

    public static boolean a(java.lang.String str, com.apm.insight.runtime.e eVar) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONObject jSONObject = f485a;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null || a(jSONObjectOptJSONObject.optJSONArray("disable"), eVar)) {
            return false;
        }
        return a(jSONObjectOptJSONObject.optJSONArray(com.json.mediationsdk.metadata.a.j), eVar);
    }

    private static boolean a(org.json.JSONArray jSONArray, com.apm.insight.runtime.e eVar) {
        if (com.apm.insight.a.a(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(new java.lang.IllegalArgumentException("err config: ".concat(java.lang.String.valueOf(jSONArray))), "NPTH_CATCH");
            } else if (a(jSONObjectOptJSONObject, eVar)) {
                return true;
            }
        }
        return false;
    }

    private static org.json.JSONArray b(org.json.JSONArray jSONArray, com.apm.insight.runtime.e eVar) {
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        if (com.apm.insight.a.a(jSONArray)) {
            return jSONArray2;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(new java.lang.IllegalArgumentException("err config: ".concat(java.lang.String.valueOf(jSONArray))), "NPTH_CATCH");
            } else if (a(jSONObjectOptJSONObject, eVar)) {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        return jSONArray2;
    }

    private static boolean a(org.json.JSONObject jSONObject, com.apm.insight.runtime.e eVar) {
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        boolean z = false;
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            if (!android.text.TextUtils.isEmpty(next)) {
                if (next.startsWith("header_")) {
                    if (!a(jSONObject.optJSONObject(next), eVar.b(next.substring(7)))) {
                        com.apm.insight.a.a((java.lang.Object) "not match ".concat(java.lang.String.valueOf(next)));
                        return false;
                    }
                } else if (next.startsWith("java_")) {
                    if (!a(jSONObject.optJSONObject(next), eVar.a(next.substring(5)))) {
                        com.apm.insight.a.a((java.lang.Object) "not match ".concat(java.lang.String.valueOf(next)));
                        return false;
                    }
                } else {
                    com.apm.insight.a.a((java.lang.Object) "no rules match ".concat(java.lang.String.valueOf(next)));
                }
                z = true;
            }
        }
        return z;
    }

    private static boolean a(org.json.JSONObject jSONObject, java.lang.Object obj) {
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
        if (jSONArrayOptJSONArray.length() == 0) {
            return false;
        }
        java.lang.String strOptString = jSONObject.optString("op");
        java.lang.String strValueOf = java.lang.String.valueOf(obj);
        if (strOptString.equals(com.ironsource.y8.i.b)) {
            return strValueOf.equals(java.lang.String.valueOf(jSONArrayOptJSONArray.opt(0)));
        }
        if (strOptString.equals(com.unity3d.services.ads.gmascar.utils.ScarConstants.IN_SIGNAL_KEY)) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                if (java.lang.String.valueOf(jSONArrayOptJSONArray.opt(i)).equals(strValueOf)) {
                    return true;
                }
            }
        }
        return false;
    }
}
