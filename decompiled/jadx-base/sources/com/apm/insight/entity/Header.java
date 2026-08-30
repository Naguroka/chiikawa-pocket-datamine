package com.apm.insight.entity;

/* JADX INFO: loaded from: classes3.dex */
public final class Header {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f390a = {"version_code", "manifest_version_code", com.json.tk.SESSION_HISTORY_KEY_AD_ID, "update_version_code"};
    private static java.lang.String d = null;
    private static int e = -1;
    private static int f = -1;
    private android.content.Context b;
    private org.json.JSONObject c = new org.json.JSONObject();

    public Header(android.content.Context context) {
        this.b = context;
    }

    public static com.apm.insight.entity.Header a(android.content.Context context) {
        com.apm.insight.entity.Header header = new com.apm.insight.entity.Header(context);
        org.json.JSONObject jSONObject = header.c;
        try {
            jSONObject.put("sdk_version", 1030851);
            jSONObject.put("sdk_version_name", "1.3.8.nourl-rc.1");
        } catch (java.lang.Exception unused) {
        }
        return header;
    }

    public static com.apm.insight.entity.Header a(long j) {
        com.apm.insight.entity.Header headerA;
        com.apm.insight.runtime.q qVarA = com.apm.insight.runtime.q.a();
        if (j == 0) {
            j = java.lang.System.currentTimeMillis();
        }
        org.json.JSONObject jSONObjectA = qVarA.a(j);
        if (jSONObjectA == null || jSONObjectA.length() == 0) {
            headerA = a(com.apm.insight.e.g());
            headerA.c();
            try {
                headerA.c.put("errHeader", 1);
            } catch (java.lang.Throwable unused) {
            }
        } else {
            headerA = new com.apm.insight.entity.Header(com.apm.insight.e.g());
        }
        b(headerA);
        headerA.a(jSONObjectA);
        return headerA;
    }

    public static com.apm.insight.entity.Header b(android.content.Context context) {
        com.apm.insight.entity.Header headerA = a(context);
        a(headerA);
        b(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        return headerA;
    }

    private static java.lang.String g() {
        if (d == null) {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (android.os.Build.SUPPORTED_ABIS.length > 0) {
                    for (int i = 0; i < android.os.Build.SUPPORTED_ABIS.length; i++) {
                        sb.append(android.os.Build.SUPPORTED_ABIS[i]);
                        if (i != android.os.Build.SUPPORTED_ABIS.length - 1) {
                            sb.append(", ");
                        }
                    }
                } else {
                    sb = new java.lang.StringBuilder(android.os.Build.CPU_ABI);
                }
                if (android.text.TextUtils.isEmpty(sb.toString())) {
                    d = "unknown";
                }
                d = sb.toString();
            } catch (java.lang.Exception e2) {
                com.apm.insight.a.b((java.lang.Throwable) e2);
                d = "unknown";
            }
        }
        return d;
    }

    public static boolean a() {
        if (e == -1) {
            e = g().contains("64") ? 1 : 0;
        }
        return e == 1;
    }

    public static boolean b() {
        if (f == -1) {
            f = g().contains("86") ? 1 : 0;
        }
        return f == 1;
    }

    public final org.json.JSONObject a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.c;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            try {
                this.c.put(next, jSONObject.opt(next));
            } catch (org.json.JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this.c;
    }

    public final org.json.JSONObject c() {
        return a(com.apm.insight.e.a().a());
    }

    public final org.json.JSONObject a(java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            if (map == null) {
                return this.c;
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
                if (!this.c.has(entry.getKey())) {
                    this.c.put(entry.getKey(), entry.getValue());
                }
            }
            java.lang.String[] strArr = f390a;
            for (int i = 0; i < 4; i++) {
                java.lang.String str = strArr[i];
                if (map.containsKey(str)) {
                    try {
                        this.c.put(str, java.lang.Integer.parseInt(java.lang.String.valueOf(map.get(str))));
                    } catch (java.lang.Throwable unused) {
                        this.c.put(str, map.get(str));
                    }
                }
            }
            if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
                try {
                    this.c.put("manifest_version_code", java.lang.Integer.parseInt(java.lang.String.valueOf(map.get("version_code"))));
                } catch (java.lang.Throwable unused2) {
                }
            }
            if (map.containsKey("iid")) {
                this.c.put("udid", map.get("iid"));
                this.c.remove("iid");
            }
            if (map.containsKey("version_name")) {
                this.c.put("app_version", map.get("version_name"));
                this.c.remove("version_name");
            }
        } catch (java.lang.Throwable unused3) {
        }
        return this.c;
    }

    public final org.json.JSONObject d() {
        try {
            this.c.put("device_id", com.apm.insight.e.c().a());
        } catch (org.json.JSONException e2) {
            e2.printStackTrace();
        }
        return this.c;
    }

    public final org.json.JSONObject e() {
        try {
            long jF = com.apm.insight.e.a().f();
            if (jF > 0) {
                this.c.put("user_id", jF);
            }
        } catch (org.json.JSONException e2) {
            e2.printStackTrace();
        }
        return this.c;
    }

    public final org.json.JSONObject f() {
        return this.c;
    }

    public static boolean b(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    public static boolean c(org.json.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    public static boolean d(org.json.JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            java.lang.String strOptString = jSONObject.optString(com.json.tk.SESSION_HISTORY_KEY_AD_ID);
            if (android.text.TextUtils.isEmpty(strOptString)) {
                return true;
            }
            try {
                return java.lang.Integer.parseInt(strOptString) <= 0;
            } catch (java.lang.Throwable unused) {
            }
        }
        return true;
    }

    public static void addRuntimeHeader(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("access", com.apm.insight.l.k.a(com.apm.insight.e.g()));
        } catch (org.json.JSONException e2) {
            e2.printStackTrace();
        }
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.apm.insight.e.g().getSystemService("phone");
            if (telephonyManager != null) {
                java.lang.String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!android.text.TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put(com.json.ce.F0, networkOperatorName);
                }
                java.lang.String networkOperator = telephonyManager.getNetworkOperator();
                if (android.text.TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
        }
    }

    public static com.apm.insight.entity.Header a(com.apm.insight.entity.Header header) {
        addRuntimeHeader(header.c);
        return header;
    }

    public static void b(com.apm.insight.entity.Header header) {
        if (header == null) {
            return;
        }
        addOtherHeader(header.c);
    }

    public static void addOtherHeader(org.json.JSONObject jSONObject) {
        java.lang.Object obj;
        if (jSONObject == null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            if (com.apm.insight.l.d.b()) {
                sb.append("MIUI-");
            } else if (com.apm.insight.l.d.c()) {
                sb.append("FLYME-");
            } else {
                java.lang.String strA = com.apm.insight.l.d.a();
                if (com.apm.insight.l.d.a(strA)) {
                    sb.append("EMUI-");
                }
                if (!android.text.TextUtils.isEmpty(strA)) {
                    sb.append(strA).append("-");
                }
            }
            sb.append(android.os.Build.VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", com.apm.insight.l.l.a());
        } catch (java.lang.Throwable unused) {
        }
        try {
            android.util.DisplayMetrics displayMetrics = com.apm.insight.e.g().getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            if (i == 120) {
                obj = "ldpi";
            } else if (i != 240) {
                obj = i != 320 ? "mdpi" : "xhdpi";
            } else {
                obj = "hdpi";
            }
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", obj);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (java.lang.Exception unused2) {
        }
        try {
            java.lang.String language = com.apm.insight.e.g().getResources().getConfiguration().locale.getLanguage();
            if (!android.text.TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            int rawOffset = java.util.TimeZone.getDefault().getRawOffset() / com.adjust.sdk.Constants.ONE_HOUR;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (java.lang.Exception unused3) {
        }
        try {
            jSONObject.put(com.json.ce.y, com.json.y8.d);
            jSONObject.put("device_id", com.apm.insight.e.c().a());
            java.lang.String str = android.os.Build.VERSION.RELEASE;
            if (!str.contains(".")) {
                str = str + ".0";
            }
            jSONObject.put("os_version", str);
            jSONObject.put("os_api", android.os.Build.VERSION.SDK_INT);
            java.lang.String str2 = android.os.Build.MODEL;
            java.lang.String str3 = android.os.Build.BRAND;
            if (str2 == null) {
                str2 = str3;
            } else if (str3 != null && !str2.contains(str3)) {
                str2 = str3 + ' ' + str2;
            }
            jSONObject.put("device_model", str2);
            jSONObject.put("device_brand", android.os.Build.BRAND);
            jSONObject.put("device_manufacturer", android.os.Build.MANUFACTURER);
            jSONObject.put("cpu_abi", g());
            android.content.Context contextG = com.apm.insight.e.g();
            java.lang.String packageName = contextG.getPackageName();
            jSONObject.put("package", packageName);
            android.content.pm.PackageInfo packageInfo = contextG.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo.applicationInfo != null) {
                int i2 = packageInfo.applicationInfo.labelRes;
                if (i2 > 0) {
                    jSONObject.put("display_name", contextG.getString(i2));
                } else {
                    jSONObject.put("display_name", contextG.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                }
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        com.apm.insight.entity.d.a(jSONObject);
    }
}
