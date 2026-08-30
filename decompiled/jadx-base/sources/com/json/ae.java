package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ae implements java.lang.Runnable {
    public static final java.lang.String M = "sdkVersion";
    public static final java.lang.String N = "AdvIdOptOutReason";
    private static final int O = 15;
    private static final int P = 840;
    private static final int Q = -720;
    private android.content.Context K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2504a = getClass().getSimpleName();
    private final java.lang.String b = "bundleId";
    private final java.lang.String c = "advertisingId";
    private final java.lang.String d = com.ironsource.y8.i.M;
    private final java.lang.String e = "appKey";
    private final java.lang.String f = "deviceOS";
    private final java.lang.String g = "osVersion";
    private final java.lang.String h = com.ironsource.y8.i.t;
    private final java.lang.String i = com.ironsource.y8.i.u;
    private final java.lang.String j = "language";
    private final java.lang.String k = com.ironsource.y8.i.k;
    private final java.lang.String l = com.ironsource.y8.i.l;
    private final java.lang.String m = com.ironsource.y8.i.r;
    private final java.lang.String n = "externalFreeMemory";
    private final java.lang.String o = "internalFreeMemory";
    private final java.lang.String p = "battery";
    private final java.lang.String q = "gmtMinutesOffset";
    private final java.lang.String r = com.ironsource.y8.i.W;
    private final java.lang.String s = com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY;
    private final java.lang.String t = "pluginType";
    private final java.lang.String u = "pluginVersion";
    private final java.lang.String v = "plugin_fw_v";
    private final java.lang.String w = "jb";
    private final java.lang.String x = "advertisingIdType";
    private final java.lang.String y = com.json.ce.P0;
    private final java.lang.String z = "firstSession";
    private final java.lang.String A = "mcc";
    private final java.lang.String B = "mnc";
    private final java.lang.String C = "icc";
    private final java.lang.String D = "tz";
    private final java.lang.String E = "auid";
    private final java.lang.String F = "userLat";
    private final java.lang.String G = "publisherAPI";
    private final java.lang.String H = "missingDependencies";
    private final java.lang.String I = "missingManifest";
    private final java.lang.String J = "other";
    private final com.json.Cif L = com.json.im.S().f();

    private ae() {
    }

    public ae(android.content.Context context) {
        this.K = context.getApplicationContext();
    }

    private java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "missingDependencies";
        }
        if (!com.json.ua.f3466a.b()) {
            return "publisherAPI";
        }
        if (this.L.u(this.K)) {
            return java.lang.Boolean.parseBoolean(str) ? "userLat" : "other";
        }
        return "missingManifest";
    }

    private java.util.Map<java.lang.String, java.lang.Object> a() {
        boolean z;
        java.lang.String str;
        java.util.HashMap map = new java.util.HashMap();
        map.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, com.json.mediationsdk.utils.IronSourceUtils.getSessionId());
        java.lang.String strE = e();
        if (!android.text.TextUtils.isEmpty(strE)) {
            map.put("bundleId", strE);
            java.lang.String strB = com.json.z3.b(this.K, strE);
            if (!android.text.TextUtils.isEmpty(strB)) {
                map.put(com.ironsource.y8.i.W, strB);
            }
        }
        map.put("appKey", c());
        java.lang.String strP = this.L.p(this.K);
        java.lang.String strA = this.L.a(this.K);
        boolean z2 = false;
        if (android.text.TextUtils.isEmpty(strP)) {
            strP = this.L.K(this.K);
            z = true;
            str = !android.text.TextUtils.isEmpty(strP) ? com.json.mediationsdk.utils.IronSourceConstants.TYPE_UUID : "";
        } else {
            str = com.json.mediationsdk.utils.IronSourceConstants.TYPE_GAID;
            z = false;
        }
        if (!android.text.TextUtils.isEmpty(strP)) {
            map.put("advertisingId", strP);
            map.put("advertisingIdType", str);
        }
        if (!android.text.TextUtils.isEmpty(strA)) {
            z2 = java.lang.Boolean.parseBoolean(strA);
            map.put(com.ironsource.y8.i.M, java.lang.Boolean.valueOf(z2));
        }
        if (z || z2) {
            map.put(N, a(strA));
        }
        map.put("deviceOS", h());
        if (!android.text.TextUtils.isEmpty(b())) {
            map.put("osVersion", b());
        }
        java.lang.String connectionType = com.json.mediationsdk.utils.IronSourceUtils.getConnectionType(this.K);
        if (!android.text.TextUtils.isEmpty(connectionType)) {
            map.put(com.ironsource.y8.i.t, connectionType);
        }
        java.lang.String strD = com.json.v8.d(this.K);
        if (!android.text.TextUtils.isEmpty(strD)) {
            map.put(com.ironsource.y8.i.u, strD);
        }
        map.put("sdkVersion", r());
        java.lang.String strL = l();
        if (!android.text.TextUtils.isEmpty(strL)) {
            map.put("language", strL);
        }
        java.lang.String strG = g();
        if (!android.text.TextUtils.isEmpty(strG)) {
            map.put(com.ironsource.y8.i.k, strG);
        }
        java.lang.String strF = f();
        if (!android.text.TextUtils.isEmpty(strF)) {
            map.put(com.ironsource.y8.i.l, strF);
        }
        java.lang.String strN = n();
        if (!android.text.TextUtils.isEmpty(strN)) {
            map.put(com.ironsource.y8.i.r, strN);
        }
        map.put("internalFreeMemory", java.lang.Long.valueOf(k()));
        map.put("externalFreeMemory", java.lang.Long.valueOf(i()));
        map.put("battery", java.lang.Integer.valueOf(d()));
        int iJ = j();
        if (a(iJ)) {
            map.put("gmtMinutesOffset", java.lang.Integer.valueOf(iJ));
        }
        java.lang.String strP2 = p();
        if (!android.text.TextUtils.isEmpty(strP2)) {
            map.put("pluginType", strP2);
        }
        java.lang.String strQ = q();
        if (!android.text.TextUtils.isEmpty(strQ)) {
            map.put("pluginVersion", strQ);
        }
        java.lang.String strO = o();
        if (!android.text.TextUtils.isEmpty(strO)) {
            map.put("plugin_fw_v", strO);
        }
        java.lang.String strValueOf = java.lang.String.valueOf(this.L.f());
        if (!android.text.TextUtils.isEmpty(strValueOf)) {
            map.put("jb", strValueOf);
        }
        java.lang.String strM = m();
        if (!android.text.TextUtils.isEmpty(strM)) {
            map.put(com.json.ce.P0, strM);
        }
        java.lang.String strValueOf2 = java.lang.String.valueOf(com.json.mediationsdk.utils.IronSourceUtils.getFirstSession(this.K));
        if (!android.text.TextUtils.isEmpty(strValueOf2)) {
            map.put("firstSession", strValueOf2);
        }
        java.lang.String strS = this.L.s(this.K);
        if (!android.text.TextUtils.isEmpty(strS)) {
            map.put("auid", strS);
        }
        map.put("mcc", java.lang.Integer.valueOf(com.json.u8.b(this.K)));
        map.put("mnc", java.lang.Integer.valueOf(com.json.u8.c(this.K)));
        java.lang.String strN2 = this.L.n(this.K);
        if (!android.text.TextUtils.isEmpty(strN2)) {
            map.put("icc", strN2);
        }
        java.lang.String strB2 = this.L.b();
        if (!android.text.TextUtils.isEmpty(strB2)) {
            map.put("tz", strB2);
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("collecting data for events: " + map);
        return map;
    }

    private boolean a(int i) {
        return i <= P && i >= Q && i % 15 == 0;
    }

    private java.lang.String b() {
        try {
            return "" + android.os.Build.VERSION.SDK_INT + "(" + android.os.Build.VERSION.RELEASE + ")";
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return "";
        }
    }

    private java.lang.String c() {
        return com.json.mediationsdk.p.m().n();
    }

    private int d() {
        try {
            android.content.Intent intentRegisterReceiver = this.K.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, this.f2504a + ":getBatteryLevel()", e);
            return -1;
        }
    }

    private java.lang.String e() {
        try {
            return this.K.getPackageName();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return "";
        }
    }

    private java.lang.String f() {
        try {
            return android.os.Build.MODEL;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return "";
        }
    }

    private java.lang.String g() {
        try {
            return android.os.Build.MANUFACTURER;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return "";
        }
    }

    private java.lang.String h() {
        return com.json.y8.d;
    }

    private long i() {
        if (!s()) {
            return -1L;
        }
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
        return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1048576;
    }

    private int j() {
        try {
            java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
            return java.lang.Math.round(((timeZone.getOffset(java.util.Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, this.f2504a + ":getGmtMinutesOffset()", e);
            return 0;
        }
    }

    private long k() {
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1048576;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return -1L;
        }
    }

    private java.lang.String l() {
        try {
            return java.util.Locale.getDefault().getLanguage();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return "";
        }
    }

    private java.lang.String m() {
        return com.json.mediationsdk.p.m().q();
    }

    private java.lang.String n() {
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.K.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            java.lang.String networkOperatorName = telephonyManager.getNetworkOperatorName();
            return !networkOperatorName.equals("") ? networkOperatorName : "";
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, this.f2504a + ":getMobileCarrier()", e);
            return "";
        }
    }

    private java.lang.String o() {
        try {
            return com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    private java.lang.String p() {
        try {
            return com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginType();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    private java.lang.String q() {
        try {
            return com.json.mediationsdk.config.ConfigFile.getConfigFile().getPluginVersion();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    private java.lang.String r() {
        return com.json.mediationsdk.utils.IronSourceUtils.getSDKVersion();
    }

    private boolean s() {
        try {
            return android.os.Environment.getExternalStorageState().equals("mounted");
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.json.zd.a().a(a());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "Thread name = " + getClass().getSimpleName(), e);
        }
    }
}
