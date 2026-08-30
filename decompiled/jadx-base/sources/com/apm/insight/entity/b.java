package com.apm.insight.entity;

/* JADX INFO: compiled from: CustomBody.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.d> f392a = new java.util.concurrent.ConcurrentLinkedQueue<>();

    /* JADX INFO: compiled from: CustomBody.java */
    public interface a {
        void a(org.json.JSONObject jSONObject);
    }

    static {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public static void a(com.apm.insight.d dVar) {
        f392a.add(dVar);
    }

    public static java.io.File a(java.io.File file) {
        return new java.io.File(file, "all_data.json");
    }

    public static org.json.JSONArray a(java.lang.Throwable th, java.lang.Thread thread, java.io.File file) {
        com.apm.insight.d next;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.lang.StackTraceElement[] stackTraceElementArrB = com.apm.insight.l.m.b(th);
        java.util.Iterator<com.apm.insight.d> it = f392a.iterator();
        while (true) {
            if (!it.hasNext() || (next = it.next()) == null) {
                break;
            }
            if (!com.apm.insight.runtime.a.a(next.b())) {
                com.apm.insight.a.a((java.lang.Object) ("not enable javaCrash aid: " + next.b()));
            } else {
                org.json.JSONArray jSONArrayA = next.a(stackTraceElementArrB, th, thread != null ? thread.getName() : null);
                if (!com.apm.insight.a.a(jSONArrayA)) {
                    jSONArray.put(next.a(com.apm.insight.CrashType.JAVA, jSONArrayA));
                }
            }
        }
        if (com.apm.insight.a.a(jSONArray)) {
            return null;
        }
        try {
            com.apm.insight.l.f.a(new java.io.File(file, "all_data.json"), jSONArray);
        } catch (java.io.IOException unused) {
        }
        return jSONArray;
    }

    public static org.json.JSONArray a(java.lang.String str) {
        com.apm.insight.d next;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.lang.String[] strArrSplit = str.split("\n");
        java.util.Iterator<com.apm.insight.d> it = f392a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (com.apm.insight.runtime.a.b(next.b())) {
                org.json.JSONArray jSONArrayA = next.a(strArrSplit);
                if (!com.apm.insight.a.a(jSONArrayA)) {
                    jSONArray.put(next.a(com.apm.insight.CrashType.ANR, jSONArrayA));
                }
            }
        }
        return jSONArray;
    }

    public static org.json.JSONArray a() {
        com.apm.insight.d next;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.apm.insight.d> it = f392a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.c());
        }
        return jSONArray;
    }

    public static org.json.JSONArray b() {
        com.apm.insight.d next;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.apm.insight.d> it = f392a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.a((com.apm.insight.CrashType) null, (org.json.JSONArray) null));
        }
        return jSONArray;
    }

    public static int c() {
        return f392a.size();
    }

    public static java.util.List<java.lang.String> d() {
        com.apm.insight.d next;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.apm.insight.d> it = f392a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            arrayList.add(next.b());
        }
        return arrayList;
    }

    public static org.json.JSONArray a(java.lang.Object obj) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.apm.insight.d dVar : f392a) {
            if (dVar != null && dVar.a(obj)) {
                jSONArray.put(dVar.a(com.apm.insight.CrashType.JAVA, (org.json.JSONArray) null));
                break;
            }
        }
        return jSONArray;
    }

    public static java.lang.String b(java.lang.Object obj) {
        for (com.apm.insight.d dVar : f392a) {
            if (dVar != null && dVar.a(obj)) {
                return dVar.b();
            }
        }
        return null;
    }

    public static org.json.JSONArray a(java.lang.Object obj, java.lang.Throwable th, java.lang.StackTraceElement[] stackTraceElementArr) {
        for (com.apm.insight.d dVar : f392a) {
            if (dVar != null && dVar.a(obj)) {
                org.json.JSONArray jSONArrayA = dVar.a(stackTraceElementArr, th);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, dVar.b());
                    jSONObject.put("lines", jSONArrayA);
                    jSONArray.put(jSONObject);
                } catch (java.lang.Throwable unused) {
                }
                return jSONArray;
            }
        }
        return null;
    }

    public static org.json.JSONArray a(java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("header")) != null && com.apm.insight.runtime.a.c(java.lang.String.valueOf(jSONObjectOptJSONObject.opt(com.json.tk.SESSION_HISTORY_KEY_AD_ID)))) {
                if (android.text.TextUtils.isEmpty(jSONObjectOptJSONObject.optString("package"))) {
                    jSONArray2.put(jSONObjectOptJSONObject2);
                } else if (a(str, jSONObjectOptJSONObject.optJSONArray("so_list"), str2, jSONObjectOptJSONObject.optJSONArray("so_list"))) {
                    jSONArray2.put(jSONObjectOptJSONObject2);
                }
            }
        }
        return jSONArray2;
    }

    public static boolean a(java.lang.String str, org.json.JSONArray jSONArray, java.lang.String str2, org.json.JSONArray jSONArray2) {
        if (!com.apm.insight.a.a(jSONArray)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (str.contains(jSONArray.optString(i))) {
                    return true;
                }
            }
        }
        if (!com.apm.insight.a.a(jSONArray2)) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                java.lang.String strOptString = jSONArray2.optString(i2);
                if (strOptString != null && strOptString.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(org.json.JSONObject jSONObject, org.json.JSONArray jSONArray, com.apm.insight.entity.b.a aVar) {
        org.json.JSONObject jSONObjectOptJSONObject;
        com.apm.insight.a.a((java.lang.Object) "uploadFromFile with allData ".concat(java.lang.String.valueOf(jSONArray)));
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        for (int i = 0; i < jSONArray.length() && (jSONObjectOptJSONObject = jSONArray.optJSONObject(i)) != null; i++) {
            if (com.apm.insight.a.a(jSONObjectOptJSONObject, 0, "header", "single_upload") == 1) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                com.apm.insight.entity.a.b(jSONObject2, jSONObject);
                com.apm.insight.entity.a.b(jSONObject2, jSONObjectOptJSONObject);
                aVar.a(jSONObject2);
            } else {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        if (jSONArray2.length() == 0) {
            return;
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        com.apm.insight.entity.a.b(jSONObject3, jSONObject);
        try {
            jSONObject3.put("all_data", jSONArray2);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        aVar.a(jSONObject3);
    }
}
