package com.apm.insight.runtime;

/* JADX INFO: compiled from: ApmConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static org.json.JSONObject i() {
        return com.apm.insight.runtime.d.b(com.apm.insight.e.a().e());
    }

    public static boolean a(java.lang.Object obj) {
        java.lang.String strB = com.apm.insight.entity.b.b(obj);
        if (strB != null) {
            return com.apm.insight.runtime.d.a(strB);
        }
        return false;
    }

    public static boolean b(java.lang.Object obj) {
        com.apm.insight.runtime.d dVarC;
        java.lang.String strB = com.apm.insight.entity.b.b(obj);
        if (strB == null || (dVarC = com.apm.insight.runtime.d.c(strB)) == null) {
            return false;
        }
        return dVarC.a();
    }

    public static void a(org.json.JSONArray jSONArray, boolean z) {
        if (jSONArray == null) {
            return;
        }
        com.apm.insight.a.a("apmconfig", "fromnet " + z + " : " + jSONArray);
        if (z) {
            com.apm.insight.k.j.f();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                java.lang.String next = jSONObjectOptJSONObject.keys().next();
                org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                com.apm.insight.a.a((java.lang.Object) ("update config " + next + " : " + jSONObjectOptJSONObject2));
                com.apm.insight.runtime.d.a(next, jSONObjectOptJSONObject2);
                if (z) {
                    com.apm.insight.k.j.a(next);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.apm.insight.runtime.l.a(a(jSONArray, java.lang.String.valueOf(com.apm.insight.e.a().e())));
        if (z) {
            com.apm.insight.k.j.a(jSONArray);
        }
    }

    private static org.json.JSONObject a(org.json.JSONArray jSONArray, java.lang.String str) {
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i).optJSONObject(str);
                if (jSONObjectOptJSONObject != null) {
                    return jSONObjectOptJSONObject;
                }
            }
        }
        return null;
    }

    public static boolean a() {
        return com.apm.insight.runtime.m.e();
    }

    public static java.lang.String a(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("exception_modules")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("npth");
    }

    static {
        new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public static int a(java.lang.String... strArr) {
        return com.apm.insight.a.a(i(), -1, strArr);
    }

    public static int a(int i, java.lang.String... strArr) {
        return com.apm.insight.a.a(i(), i, strArr);
    }

    public static org.json.JSONArray b() {
        java.lang.String[] strArr = {"custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore"};
        org.json.JSONObject jSONObjectB = com.apm.insight.a.b(i(), strArr);
        if (jSONObjectB == null) {
            return null;
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray(strArr[2]);
        com.apm.insight.a.a("ApmConfig", "normal get configArray: " + strArr[2] + " : " + jSONArrayOptJSONArray);
        return jSONArrayOptJSONArray;
    }

    public static boolean c() {
        return a("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1;
    }

    public static boolean d() {
        return a("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1;
    }

    public static boolean e() {
        return a("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1;
    }

    public static boolean f() {
        return a("custom_event_settings", "npth_simple_setting", "upload_crash_crash") == 1;
    }

    public static boolean g() {
        return a("custom_event_settings", "npth_simple_setting", "force_apm_crash") == 1;
    }

    public static boolean h() {
        return a("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1;
    }

    public static boolean a(java.lang.String str) {
        if (!com.apm.insight.runtime.d.a(str)) {
            com.apm.insight.k.a.b();
        }
        return com.apm.insight.runtime.d.e(str);
    }

    public static boolean b(java.lang.String str) {
        if (!com.apm.insight.runtime.d.a(str)) {
            com.apm.insight.k.a.b();
        }
        return com.apm.insight.runtime.d.g(str);
    }

    public static boolean c(java.lang.String str) {
        if (!com.apm.insight.runtime.d.a(str)) {
            com.apm.insight.k.a.b();
        }
        return com.apm.insight.runtime.d.f(str);
    }
}
