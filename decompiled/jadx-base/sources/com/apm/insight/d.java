package com.apm.insight;

/* JADX INFO: compiled from: MonitorCrashHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static com.apm.insight.MonitorCrash f383a;
    private static volatile java.util.concurrent.ConcurrentHashMap<java.lang.String, com.apm.insight.d> c = new java.util.concurrent.ConcurrentHashMap<>();
    private com.apm.insight.MonitorCrash b;

    private d(com.apm.insight.MonitorCrash monitorCrash) {
        this.b = monitorCrash;
        com.apm.insight.entity.b.a(this);
        com.apm.insight.j.b.c();
        com.apm.insight.k.j.e();
    }

    public final boolean a(java.lang.Object obj) {
        return this.b == obj;
    }

    public static java.lang.Object a() {
        return f383a;
    }

    static void a(android.content.Context context, final com.apm.insight.MonitorCrash monitorCrash) {
        f383a = monitorCrash;
        com.apm.insight.d dVar = new com.apm.insight.d(monitorCrash);
        final com.apm.insight.nativecrash.b bVarA = com.apm.insight.e.a();
        com.apm.insight.Npth.init(context, new com.apm.insight.ICommonParams() { // from class: com.apm.insight.d.1
            @Override // com.apm.insight.ICommonParams
            public final java.util.List<java.lang.String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final java.util.Map<java.lang.String, java.lang.Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final java.lang.String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }

            @Override // com.apm.insight.ICommonParams
            public final java.util.Map<java.lang.String, java.lang.Object> getCommonParams() {
                org.json.JSONObject jSONObjectD = com.apm.insight.d.this.d();
                java.util.HashMap map = new java.util.HashMap();
                if (jSONObjectD != null) {
                    java.util.Iterator<java.lang.String> itKeys = jSONObjectD.keys();
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        map.put(next, jSONObjectD.opt(next));
                    }
                }
                return map;
            }

            @Override // com.apm.insight.ICommonParams
            public final java.lang.String getDeviceId() {
                return android.text.TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId) ? bVarA.d() : monitorCrash.mConfig.mDeviceId;
            }
        });
    }

    static void a(com.apm.insight.MonitorCrash monitorCrash) {
        com.apm.insight.d dVar = new com.apm.insight.d(monitorCrash);
        if (monitorCrash.mConfig != null) {
            c.put(monitorCrash.mConfig.mAid, dVar);
        }
    }

    static com.apm.insight.d a(java.lang.String str) {
        return c.get(str);
    }

    public final org.json.JSONArray a(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Throwable th) {
        return a(stackTraceElementArr, th, null);
    }

    public final org.json.JSONArray a(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.Throwable th, java.lang.String str) {
        if (this.b.mConfig.mPackageName == null) {
            return new org.json.JSONArray().put(new com.apm.insight.l.m.a(0, stackTraceElementArr.length).a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        org.json.JSONArray jSONArrayA = com.apm.insight.l.m.a(stackTraceElementArr, this.b.mConfig.mPackageName);
        if (str != null && this.b.mConfig.mThreadList != null && com.apm.insight.a.a(jSONArrayA)) {
            for (java.lang.String str2 : this.b.mConfig.mThreadList) {
                if (android.text.TextUtils.equals(str2, str)) {
                    jSONArrayA.put(new com.apm.insight.l.m.a(0, stackTraceElementArr.length).a());
                }
            }
        }
        return jSONArrayA;
    }

    public final org.json.JSONArray a(java.lang.String[] strArr) {
        if (this.b.config().mPackageName == null) {
            return new org.json.JSONArray().put(new com.apm.insight.l.m.a(0, strArr.length).a());
        }
        return com.apm.insight.l.m.a(strArr, this.b.mConfig.mPackageName);
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        if (this.b.config().mPackageName == null) {
            return true;
        }
        return com.apm.insight.entity.b.a(str, com.apm.insight.a.a(this.b.mConfig.mSoList), str2, com.apm.insight.a.a(this.b.mConfig.mThreadList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.json.JSONObject d() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (this.b.mConfig.mPackageName == null) {
                android.content.Context contextG = com.apm.insight.e.g();
                android.content.pm.PackageInfo packageInfo = contextG.getPackageManager().getPackageInfo(contextG.getPackageName(), 128);
                if (packageInfo != null) {
                    if (this.b.mConfig.mVersionInt == -1) {
                        this.b.mConfig.mVersionInt = packageInfo.versionCode;
                    }
                    if (this.b.mConfig.mVersionStr == null) {
                        this.b.mConfig.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        if (android.text.TextUtils.isEmpty(this.b.mConfig.mDeviceId) || "0".equals(this.b.mConfig.mDeviceId)) {
            this.b.mConfig.mDeviceId = com.apm.insight.e.c().a();
        }
        try {
            jSONObject.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, java.lang.String.valueOf(this.b.mConfig.mAid));
            jSONObject.put("update_version_code", this.b.mConfig.mVersionInt);
            jSONObject.put("version_code", this.b.mConfig.mVersionInt);
            jSONObject.put("app_version", this.b.mConfig.mVersionStr);
            jSONObject.put("channel", this.b.mConfig.mChannel);
            jSONObject.put("package", com.apm.insight.a.a(this.b.mConfig.mPackageName));
            jSONObject.put("device_id", this.b.mConfig.mDeviceId);
            jSONObject.put("user_id", this.b.mConfig.mUID);
            jSONObject.put("ssid", this.b.mConfig.mSSID);
            jSONObject.put(com.json.ce.y, com.json.y8.d);
            jSONObject.put("so_list", com.apm.insight.a.a(this.b.mConfig.mSoList));
            jSONObject.put("thread_list", com.apm.insight.a.a(this.b.mConfig.mThreadList));
            jSONObject.put("single_upload", 0);
        } catch (org.json.JSONException unused2) {
        }
        return jSONObject;
    }

    public final java.lang.String b() {
        return this.b.mConfig.mAid;
    }

    public final org.json.JSONObject a(com.apm.insight.CrashType crashType, org.json.JSONArray jSONArray) {
        java.util.Map<? extends java.lang.String, ? extends java.lang.String> userData;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("header", d());
            if (crashType != null) {
                jSONObject.put("custom", (this.b.mCustomData == null || (userData = this.b.mCustomData.getUserData(crashType)) == null) ? null : new org.json.JSONObject(userData));
                jSONObject.put("filters", new org.json.JSONObject(this.b.mTagMap));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (java.lang.Throwable unused) {
        }
        return jSONObject;
    }

    public final org.json.JSONObject c() {
        return d();
    }
}
