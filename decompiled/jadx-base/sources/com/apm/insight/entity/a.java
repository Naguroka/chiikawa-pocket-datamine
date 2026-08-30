package com.apm.insight.entity;

/* JADX INFO: compiled from: CrashBody.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f391a;
    private com.apm.insight.entity.Header b;

    public a() {
        this.f391a = new org.json.JSONObject();
    }

    public a(org.json.JSONObject jSONObject) {
        this.f391a = jSONObject;
    }

    public static com.apm.insight.entity.a a(long j, android.content.Context context, java.lang.Throwable th) {
        if (j == 0) {
            j = java.lang.System.currentTimeMillis();
        }
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        aVar.a("isJava", (java.lang.Object) 1);
        aVar.a("data", (java.lang.Object) com.apm.insight.l.m.a(th));
        aVar.a("crash_time", java.lang.Long.valueOf(j));
        aVar.a("process_name", (java.lang.Object) com.apm.insight.l.a.d(context));
        if (!com.apm.insight.l.a.c(context)) {
            aVar.a("remote_process", (java.lang.Object) 1);
        }
        return aVar;
    }

    public final void b() {
        a("has_logcat", java.lang.String.valueOf(a()));
    }

    public static boolean a(java.lang.String str) {
        return ((long) com.apm.insight.nativecrash.b.c(str)) > com.apm.insight.nativecrash.a.g();
    }

    public static boolean b(java.lang.String str) {
        return com.apm.insight.nativecrash.b.a(str) > 960;
    }

    public static boolean c(java.lang.String str) {
        return com.apm.insight.nativecrash.b.b(str) > 350;
    }

    public final org.json.JSONObject c() {
        return this.f391a;
    }

    public final com.apm.insight.entity.a a(com.apm.insight.entity.Header header) {
        a("header", header.f());
        this.b = header;
        return this;
    }

    public final com.apm.insight.entity.a a(org.json.JSONObject jSONObject) {
        a("header", jSONObject);
        return this;
    }

    public final com.apm.insight.entity.Header d() {
        if (this.b == null) {
            com.apm.insight.entity.Header header = new com.apm.insight.entity.Header(com.apm.insight.e.g());
            this.b = header;
            a(header);
        }
        return this.b;
    }

    public static void a(org.json.JSONObject jSONObject, java.util.Map<? extends java.lang.String, ? extends java.lang.String> map) {
        if (map != null) {
            try {
                for (java.util.Map.Entry<? extends java.lang.String, ? extends java.lang.String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void a(org.json.JSONObject jSONObject, java.lang.Throwable th) {
        if (jSONObject.opt("npth_err_info") == null) {
            try {
                jSONObject.put("npth_err_info", com.apm.insight.l.m.a(th));
                return;
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (jSONObject.opt("npth_err_info" + i) == null) {
                try {
                    jSONObject.put("npth_err_info" + i, com.apm.insight.l.m.a(th));
                    return;
                } catch (java.lang.Throwable unused2) {
                    return;
                }
            }
        }
    }

    public final com.apm.insight.entity.a a(long j) {
        try {
            a("app_start_time", java.lang.Long.valueOf(j));
            a("app_start_time_readable", (java.lang.Object) new java.text.SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", java.util.Locale.getDefault()).format(new java.util.Date(j)));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public final com.apm.insight.entity.a a(com.apm.insight.runtime.a.b bVar) {
        a("activity_trace", bVar.g());
        a("activity_track", bVar.i());
        return this;
    }

    public final com.apm.insight.entity.a a(java.util.Map<java.lang.String, java.lang.Integer> map) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            if (map == null) {
                this.f391a.put("plugin_info", jSONArray);
                return this;
            }
            for (java.lang.String str : map.keySet()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.ironsource.y8.h.V, str);
                jSONObject.put("version_code", map.get(str));
                jSONArray.put(jSONObject);
            }
            this.f391a.put("plugin_info", jSONArray);
            return this;
        } catch (java.lang.Exception unused) {
        }
    }

    public final com.apm.insight.entity.a b(java.util.Map<java.lang.Integer, java.lang.String> map) {
        if (map != null && map.size() > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.Integer num : map.keySet()) {
                try {
                    jSONObject.put(java.lang.String.valueOf(num), map.get(num));
                } catch (org.json.JSONException e) {
                    com.apm.insight.a.b((java.lang.Throwable) e);
                }
            }
            try {
                this.f391a.put("sdk_info", jSONObject);
            } catch (org.json.JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this;
    }

    public final com.apm.insight.entity.a a(int i, java.lang.String str) {
        try {
            this.f391a.put("miniapp_id", i);
            this.f391a.put("miniapp_version", str);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final com.apm.insight.entity.a a(java.util.List<java.lang.String> list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (list == null || list.isEmpty()) {
            a("patch_info", (java.lang.Object) jSONArray);
            return this;
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        a("patch_info", (java.lang.Object) jSONArray);
        return this;
    }

    public final com.apm.insight.entity.a b(org.json.JSONObject jSONObject) {
        a(this.f391a, jSONObject);
        return this;
    }

    public static void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        java.lang.String str;
        java.lang.String str2;
        try {
            jSONObject.put(com.ironsource.y8.a.k, jSONObject2);
        } catch (java.lang.Throwable unused) {
        }
        long jOptLong = jSONObject2.optLong("inner_free");
        long jOptLong2 = jSONObject2.optLong("sdcard_free");
        long jOptLong3 = jSONObject2.optLong("inner_free_real");
        java.lang.String str3 = "1M - 64M";
        if (jOptLong <= 1024) {
            str = "0 - 1K";
        } else if (jOptLong <= 65536) {
            str = "1K - 64K";
        } else if (jOptLong <= 524288) {
            str = "64K - 512K";
        } else if (jOptLong <= 1048576) {
            str = "512K - 1M";
        } else {
            str = jOptLong <= 67108864 ? "1M - 64M" : "64M - ";
        }
        if (jOptLong3 <= 1024) {
            str2 = "0 - 1K";
        } else if (jOptLong3 <= 65536) {
            str2 = "1K - 64K";
        } else if (jOptLong3 <= 524288) {
            str2 = "64K - 512K";
        } else if (jOptLong3 <= 1048576) {
            str2 = "512K - 1M";
        } else {
            str2 = jOptLong3 <= 67108864 ? "1M - 64M" : "64M - ";
        }
        if (jOptLong2 <= 1024) {
            str3 = "0 - 1K";
        } else if (jOptLong2 <= 65536) {
            str3 = "1K - 64K";
        } else if (jOptLong2 <= 524288) {
            str3 = "64K - 512K";
        } else if (jOptLong2 <= 1048576) {
            str3 = "512K - 1M";
        } else if (jOptLong2 > 67108864) {
            str3 = "64M - ";
        }
        a(jSONObject, "filters", "inner_free", str);
        a(jSONObject, "filters", "inner_free_real", str2);
        a(jSONObject, "filters", "sdcard_free", str3);
    }

    public static void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (jSONObject == null) {
            return;
        }
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            try {
                jSONObjectOptJSONObject = new org.json.JSONObject();
                jSONObject.put(str, jSONObjectOptJSONObject);
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        jSONObjectOptJSONObject.put(str2, str3);
    }

    public final void c(org.json.JSONObject jSONObject) {
        b(this.f391a, jSONObject);
    }

    public static void b(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        try {
            java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object objOpt = jSONObject.opt(next);
                if (objOpt == null) {
                    jSONObject.put(next, jSONObject2.opt(next));
                } else if (objOpt instanceof org.json.JSONObject) {
                    b(jSONObject.getJSONObject(next), jSONObject2.getJSONObject(next));
                } else if (objOpt instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        org.json.JSONArray jSONArray = (org.json.JSONArray) objOpt;
                        if (jSONArray.length() == 1 && (jSONArray.opt(0) instanceof org.json.JSONObject) && (jSONArrayOptJSONArray.opt(0) instanceof org.json.JSONObject)) {
                            b(jSONArray.getJSONObject(0), jSONArrayOptJSONArray.getJSONObject(0));
                        } else {
                            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                jSONArray.put(jSONArrayOptJSONArray.get(i));
                            }
                        }
                    }
                } else {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            }
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(java.lang.String str, java.lang.Object obj) {
        try {
            this.f391a.put(str, obj);
        } catch (java.lang.Exception e) {
            com.apm.insight.a.b((java.lang.Throwable) e);
        }
    }

    public final boolean a() {
        java.lang.Object objOpt = this.f391a.opt("data");
        if (objOpt instanceof org.json.JSONArray) {
            return !com.apm.insight.a.a(((org.json.JSONArray) objOpt).optJSONObject(0), "logcat");
        }
        return !com.apm.insight.a.a(this.f391a, "logcat");
    }

    private com.apm.insight.entity.a a(java.lang.String str, org.json.JSONArray jSONArray) {
        org.json.JSONObject jSONObjectOptJSONObject = this.f391a.optJSONObject("custom_long");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new org.json.JSONObject();
            a("custom_long", jSONObjectOptJSONObject);
        }
        try {
            jSONObjectOptJSONObject.put(str, jSONArray);
        } catch (org.json.JSONException unused) {
        }
        return this;
    }

    public final com.apm.insight.entity.a c(java.util.Map<? extends java.lang.String, ? extends java.lang.String> map) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONObject jSONObjectOptJSONObject2;
        if (map != null) {
            java.lang.Object objOpt = this.f391a.opt("data");
            if (objOpt instanceof org.json.JSONArray) {
                jSONObjectOptJSONObject = ((org.json.JSONArray) objOpt).optJSONObject(0);
            } else {
                jSONObjectOptJSONObject = this.f391a;
            }
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject2 = new org.json.JSONObject();
            } else {
                jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("filters");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new org.json.JSONObject();
                    a("filters", jSONObjectOptJSONObject2);
                }
            }
            for (java.util.Map.Entry<? extends java.lang.String, ? extends java.lang.String> entry : map.entrySet()) {
                try {
                    jSONObjectOptJSONObject2.put(entry.getKey(), entry.getValue());
                } catch (org.json.JSONException unused) {
                }
            }
            a("filters", jSONObjectOptJSONObject2);
        }
        return this;
    }

    public final com.apm.insight.entity.a a(java.lang.String str, java.lang.String str2) {
        java.lang.Object objOpt = this.f391a.opt("data");
        if (objOpt instanceof org.json.JSONArray) {
            a(((org.json.JSONArray) objOpt).optJSONObject(0), "filters", str, str2);
        } else {
            a(this.f391a, "filters", str, str2);
        }
        return this;
    }

    public final com.apm.insight.entity.a b(java.lang.String str, java.lang.String str2) {
        java.lang.Object objOpt = this.f391a.opt("data");
        if (objOpt instanceof org.json.JSONArray) {
            a(((org.json.JSONArray) objOpt).optJSONObject(0), "custom", str, str2);
        } else {
            a(this.f391a, "custom", str, str2);
        }
        return this;
    }
}
