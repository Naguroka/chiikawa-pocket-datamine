package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class xa implements com.json.Cif, com.json.Cif.a {
    private static final java.lang.String A = "browser_user_agent";
    private static final java.lang.String B = "browser_user_agent_time";
    private static final java.lang.String C = "IABTCF_gdprApplies";
    private static final java.lang.String D = "IABTCF_TCString";
    private static final java.lang.String E = "IABTCF_AddtlConsent";
    private static final java.lang.String j = "android";
    private static final java.lang.String k = "com.google.android.gms.permission.AD_ID";
    private static final java.lang.String l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private static final java.lang.String m = "com.google.android.gms.appset.AppSet";
    private static final java.lang.String n = "com.google.android.gms.tasks.OnSuccessListener";
    private static final java.lang.String o = "getAdvertisingIdInfo";
    private static final java.lang.String p = "getClient";
    private static final java.lang.String q = "getAppSetIdInfo";
    private static final java.lang.String r = "addOnSuccessListener";
    private static final java.lang.String s = "getId";
    private static final java.lang.String t = "isLimitAdTrackingEnabled";
    private static final java.lang.String u = "Mediation_Shared_Preferences";
    private static final java.lang.String v = "supersonic_shared_preferen";
    private static final java.lang.String w = "cachedUUID";
    private static final java.lang.String x = "auid";
    private static final java.lang.String y = "unityads-installinfo";
    private static final java.lang.String z = "unityads-idfi";
    private java.lang.String b = null;
    private java.lang.String c = null;
    private java.lang.String d = null;
    private java.lang.String e = "";
    private boolean f = false;
    private java.lang.String g = "";
    private volatile java.lang.String h;
    private volatile java.lang.String i;

    class a implements java.lang.reflect.InvocationHandler {
        a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            java.lang.Object obj2;
            if (objArr == null) {
                return null;
            }
            try {
                if (objArr.length <= 0 || (obj2 = objArr[0]) == null) {
                    return null;
                }
                java.lang.String string = obj2.getClass().getMethod(com.json.xa.s, new java.lang.Class[0]).invoke(objArr[0], new java.lang.Object[0]).toString();
                if (android.text.TextUtils.isEmpty(string)) {
                    return null;
                }
                com.json.xa.this.g = string;
                return null;
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                return null;
            }
        }
    }

    private java.lang.String M(android.content.Context context) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        java.lang.Object objO = O(context);
        return objO.getClass().getMethod(s, new java.lang.Class[0]).invoke(objO, new java.lang.Object[0]).toString();
    }

    private void N(android.content.Context context) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        java.lang.Class<?> cls = java.lang.Class.forName(m);
        java.lang.Object objInvoke = cls.getMethod(p, android.content.Context.class).invoke(cls, context);
        java.lang.Object objInvoke2 = objInvoke.getClass().getMethod(q, new java.lang.Class[0]).invoke(objInvoke, new java.lang.Object[0]);
        java.lang.Class<?> cls2 = java.lang.Class.forName(n);
        objInvoke2.getClass().getMethod(r, cls2).invoke(objInvoke2, java.lang.reflect.Proxy.newProxyInstance(java.lang.Thread.currentThread().getContextClassLoader(), new java.lang.Class[]{cls2}, new com.ironsource.xa.a()));
    }

    private java.lang.Object O(android.content.Context context) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        java.lang.Class<?> cls = java.lang.Class.forName(l);
        return cls.getMethod(o, android.content.Context.class).invoke(cls, context);
    }

    private java.lang.String P(android.content.Context context) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        java.lang.Object objO = O(context);
        return java.lang.String.valueOf(((java.lang.Boolean) objO.getClass().getMethod("isLimitAdTrackingEnabled", new java.lang.Class[0]).invoke(objO, new java.lang.Object[0])).booleanValue());
    }

    private java.lang.String Q(android.content.Context context) {
        try {
            return com.json.environment.IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, u, A, "");
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    private long R(android.content.Context context) {
        try {
            return java.lang.Long.parseLong(com.json.environment.IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, u, B, java.lang.String.valueOf(-1L)));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    private long a(java.io.File file) {
        android.os.StatFs statFs = new android.os.StatFs(file.getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576;
    }

    private void a(android.content.Context context, java.lang.String str) {
        try {
            com.json.environment.IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, u, A, str);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private void b(android.content.Context context, long j2) {
        try {
            com.json.environment.IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, u, B, java.lang.String.valueOf(j2));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private boolean b(java.lang.String str) {
        try {
            java.lang.String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                if (new java.io.File(strArr[i] + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return false;
        }
    }

    @Override // com.json.Cif
    public int A(android.content.Context context) {
        if (context != null) {
            return android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.json.Cif
    public java.lang.String B(android.content.Context context) {
        try {
            return com.json.environment.IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, "IABTCF_TCString", null);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return null;
        }
    }

    @Override // com.json.Cif
    public boolean C(android.content.Context context) {
        return android.provider.Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.json.Cif
    public java.lang.String D(android.content.Context context) {
        return java.util.Locale.getDefault().toString();
    }

    @Override // com.json.Cif
    public java.lang.String E(android.content.Context context) {
        if (com.json.ua.f3466a.c()) {
            try {
                N(context);
                if (!android.text.TextUtils.isEmpty(this.g)) {
                    return this.g;
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
            }
        }
        return "";
    }

    @Override // com.json.Cif
    public int F(android.content.Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.json.Cif
    public java.lang.String G(android.content.Context context) throws java.lang.Exception {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.json.Cif
    public boolean H(android.content.Context context) {
        android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.json.Cif
    public java.lang.String I(android.content.Context context) {
        try {
            return com.json.environment.IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, E, null);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return null;
        }
    }

    @Override // com.json.Cif
    public int J(android.content.Context context) {
        return ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.json.Cif
    public synchronized java.lang.String K(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (com.json.environment.IronSourceSharedPreferencesUtilities.getBooleanFromSharedPrefs(context, u, com.json.Cif.f2739a, true)) {
            java.lang.String stringFromSharedPrefs = com.json.environment.IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, u, w, "");
            if (android.text.TextUtils.isEmpty(stringFromSharedPrefs)) {
                java.lang.String string = java.util.UUID.randomUUID().toString();
                this.b = string;
                com.json.environment.IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, u, w, string);
            } else {
                this.b = stringFromSharedPrefs;
            }
        }
        return this.b;
    }

    @Override // com.json.Cif
    public int L(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return ((android.app.Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.json.Cif
    public int a() {
        return j();
    }

    @Override // com.json.Cif
    public long a(java.lang.String str) {
        return a(new java.io.File(str));
    }

    @Override // com.json.Cif
    public java.lang.String a(android.content.Context context) {
        java.lang.String strP;
        try {
            if (!com.json.ua.f3466a.a()) {
                strP = P(context);
            } else {
                if (this.h == null) {
                    java.lang.String strP2 = P(context);
                    if (android.text.TextUtils.isEmpty(strP2)) {
                        return strP2;
                    }
                    this.h = strP2;
                    return strP2;
                }
                strP = this.h;
            }
            return strP;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return null;
        }
    }

    @Override // com.json.Cif.a
    public void a(android.content.Context context, long j2) {
        if (context != null) {
            if (!new com.json.dv(new com.ironsource.n9.a()).a(R(context), j2)) {
                java.lang.String strQ = Q(context);
                this.e = strQ;
                this.f = !strQ.isEmpty();
            }
            if (this.e.isEmpty()) {
                try {
                    java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(context);
                    this.e = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j2 > 0) {
                        b(context, java.lang.System.currentTimeMillis());
                    }
                } catch (java.lang.Exception e) {
                    com.json.l9.d().a(e);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
            }
        }
    }

    @Override // com.json.Cif
    public boolean a(android.app.Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    @Override // com.json.Cif
    public java.lang.String b() {
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    @Override // com.json.Cif
    public java.lang.String b(android.content.Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.json.Cif
    public boolean c() {
        try {
            return "mounted".equals(android.os.Environment.getExternalStorageState()) && android.os.Environment.isExternalStorageRemovable();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return false;
        }
    }

    @Override // com.json.Cif
    public boolean c(android.content.Context context) {
        try {
            return android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.json.Cif
    public int d() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.json.Cif
    public boolean d(android.content.Context context) {
        try {
            return android.provider.Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.json.Cif
    public java.io.File e(android.content.Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.json.Cif
    public java.lang.String e() {
        return android.os.Build.MODEL;
    }

    @Override // com.json.Cif
    public java.lang.String f(android.content.Context context) {
        if (context == null) {
            return "";
        }
        int iL = L(context);
        if (iL != 0) {
            if (iL != 1) {
                if (iL != 11) {
                    if (iL != 12) {
                        switch (iL) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return com.ironsource.y8.h.D;
        }
        return com.ironsource.y8.h.C;
    }

    @Override // com.json.Cif
    public boolean f() {
        return b("su");
    }

    @Override // com.json.Cif
    public java.lang.String g() {
        return android.os.Build.MANUFACTURER;
    }

    @Override // com.json.Cif
    public boolean g(android.content.Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.json.Cif
    public float h() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // com.json.Cif
    public long h(android.content.Context context) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // com.json.Cif
    public long i() {
        return java.util.Calendar.getInstance(java.util.TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.json.Cif
    public java.lang.String i(android.content.Context context) {
        return r(context) ? "Tablet" : "Phone";
    }

    @Override // com.json.Cif
    public int j() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.json.Cif
    public java.lang.String j(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.json.Cif
    public int k() {
        return android.os.Build.VERSION.SDK_INT;
    }

    @Override // com.json.Cif
    public java.io.File k(android.content.Context context) {
        return context.getCacheDir();
    }

    @Override // com.json.Cif
    public int l(android.content.Context context) {
        android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.json.Cif
    public java.lang.String l() {
        return "android";
    }

    @Override // com.json.Cif
    public float m(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return -1.0f;
        }
    }

    @Override // com.json.Cif
    public long m() {
        if (c()) {
            return a(android.os.Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.json.Cif
    public long n() {
        return a(android.os.Environment.getDataDirectory());
    }

    @Override // com.json.Cif
    public java.lang.String n(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.json.Cif
    public java.lang.String o() {
        return android.os.Build.VERSION.RELEASE;
    }

    @Override // com.json.Cif
    public java.util.List<android.content.pm.ApplicationInfo> o(android.content.Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.json.Cif
    public int p() {
        return -(java.util.TimeZone.getDefault().getOffset(i()) / 60000);
    }

    @Override // com.json.Cif
    public java.lang.String p(android.content.Context context) {
        java.lang.String strM;
        com.json.ua uaVar = com.json.ua.f3466a;
        if (!uaVar.b()) {
            return null;
        }
        try {
            if (!uaVar.a()) {
                strM = M(context);
            } else {
                if (this.i == null) {
                    java.lang.String strM2 = M(context);
                    if (android.text.TextUtils.isEmpty(strM2)) {
                        return strM2;
                    }
                    this.i = strM2;
                    return strM2;
                }
                strM = this.i;
            }
            return strM;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return null;
        }
    }

    @Override // com.json.Cif
    public boolean q() {
        return this.f;
    }

    @Override // com.json.Cif
    public boolean q(android.content.Context context) {
        try {
            return ((android.os.PowerManager) context.getSystemService("power")).isPowerSaveMode();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    @Override // com.json.Cif
    public int r() {
        return d();
    }

    @Override // com.json.Cif
    public boolean r(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return false;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return ((float) displayMetrics.widthPixels) / displayMetrics.density >= 600.0f;
    }

    @Override // com.json.Cif
    public java.lang.String s() {
        try {
            return this.e.isEmpty() ? Q(com.json.environment.ContextProvider.getInstance().getApplicationContext()) : this.e;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return "";
        }
    }

    @Override // com.json.Cif
    public synchronized java.lang.String s(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        if (context == null) {
            return "";
        }
        java.lang.String stringFromSharedPrefs = com.json.environment.IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "supersonic_shared_preferen", "auid", "");
        this.c = stringFromSharedPrefs;
        if (android.text.TextUtils.isEmpty(stringFromSharedPrefs)) {
            java.lang.String string = java.util.UUID.randomUUID().toString();
            this.c = string;
            com.json.environment.IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "supersonic_shared_preferen", "auid", string);
        }
        return this.c;
    }

    @Override // com.json.Cif
    public java.io.File t(android.content.Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.json.Cif
    public boolean u(android.content.Context context) {
        try {
            for (java.lang.String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                if (str.equalsIgnoreCase(k)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return false;
        }
    }

    @Override // com.json.Cif
    public java.lang.String v(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        if (context == null) {
            return null;
        }
        java.lang.String stringFromSharedPrefs = com.json.environment.IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "unityads-installinfo", "unityads-idfi", null);
        this.d = stringFromSharedPrefs;
        return stringFromSharedPrefs;
    }

    @Override // com.json.Cif
    public java.io.File w(android.content.Context context) {
        return context.getFilesDir();
    }

    @Override // com.json.Cif
    public int x(android.content.Context context) {
        try {
            android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    @Override // com.json.Cif
    public int y(android.content.Context context) {
        int iJ = J(context);
        int iF = F(context);
        return (((iJ == 0 || iJ == 2) && iF == 2) || ((iJ == 1 || iJ == 3) && iF == 1)) ? 2 : 1;
    }

    @Override // com.json.Cif
    public int z(android.content.Context context) {
        try {
            return com.json.environment.IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, C, -1);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return -1;
        }
    }
}
