package com.apm.insight.runtime;

/* JADX INFO: compiled from: ConfigAid.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.util.HashMap<java.lang.String, com.apm.insight.runtime.d> f477a = new java.util.HashMap<>();
    private org.json.JSONObject b = null;
    private org.json.JSONObject c = null;
    private boolean d = false;
    private java.lang.String e;

    private d(org.json.JSONObject jSONObject, java.lang.String str) {
        this.e = str;
        a(jSONObject);
        f477a.put(this.e, this);
        com.apm.insight.a.a((java.lang.Object) "after update aid ".concat(java.lang.String.valueOf(str)));
    }

    private void a(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject;
        this.b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    public final boolean a() {
        if (this.b == null) {
            return false;
        }
        return this.d;
    }

    public static boolean a(java.lang.String str) {
        return f477a.get(str) != null;
    }

    public static void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.apm.insight.runtime.d dVar = f477a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new com.apm.insight.runtime.d(jSONObject, str);
        }
    }

    public static org.json.JSONObject b(java.lang.String str) {
        com.apm.insight.runtime.d dVar = f477a.get(str);
        if (dVar != null) {
            return dVar.b;
        }
        return null;
    }

    public static com.apm.insight.runtime.d c(java.lang.String str) {
        return f477a.get(str);
    }

    public static long d(java.lang.String str) {
        com.apm.insight.runtime.d dVar = f477a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return java.lang.Long.decode(com.apm.insight.a.a(dVar.b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (java.lang.Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(java.lang.String str) {
        com.apm.insight.runtime.d dVar = f477a.get(str);
        if (dVar != null) {
            org.json.JSONObject jSONObject = dVar.b;
            if (jSONObject != null && 1 == com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(java.lang.String str) {
        com.apm.insight.runtime.d dVar = f477a.get(str);
        if (dVar != null) {
            org.json.JSONObject jSONObject = dVar.b;
            if (jSONObject != null && 1 == com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(java.lang.String str) {
        com.apm.insight.runtime.d dVar = f477a.get(str);
        if (dVar != null) {
            org.json.JSONObject jSONObject = dVar.b;
            if (jSONObject != null && 1 == com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) {
                return true;
            }
        }
        return false;
    }
}
