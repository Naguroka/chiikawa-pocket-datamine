package com.apm.insight.entity;

/* JADX INFO: compiled from: HeaderCombiner.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f394a;
    private static org.json.JSONObject b;

    private static void a() {
        if (f394a == null) {
            f394a = android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + com.apm.insight.e.g().getPackageName() + "/AutomationTestInfo.json";
        }
        if (b == null) {
            try {
                b = new org.json.JSONObject(com.apm.insight.l.f.a(f394a, "\n"));
            } catch (java.io.IOException unused) {
                b = new org.json.JSONObject();
            } catch (org.json.JSONException unused2) {
                b = new org.json.JSONObject();
            }
        }
    }

    public static void a(org.json.JSONObject jSONObject) {
        java.lang.Object objOpt;
        if (jSONObject == null) {
            return;
        }
        try {
            a();
            org.json.JSONObject jSONObject2 = b;
            if (jSONObject2 != null) {
                java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    if (!"slardar_filter".equals(next) && (objOpt = b.opt(next)) != null) {
                        try {
                            jSONObject.put(next, objOpt);
                        } catch (org.json.JSONException unused) {
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    public static void b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            a();
            org.json.JSONObject jSONObject2 = b;
            if (jSONObject2 != null) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("slardar_filter");
                if (com.apm.insight.a.a(jSONObjectOptJSONObject)) {
                    return;
                }
                org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("filters");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject.put("filters", jSONObjectOptJSONObject2);
                    } catch (org.json.JSONException unused) {
                    }
                }
                com.apm.insight.entity.a.b(jSONObjectOptJSONObject2, jSONObjectOptJSONObject);
            }
        } catch (java.lang.Throwable unused2) {
        }
    }
}
