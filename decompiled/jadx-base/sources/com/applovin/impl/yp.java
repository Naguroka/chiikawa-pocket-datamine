package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f1550a = {60, 60, 24, 7, 4, 12};
    private static final java.lang.String[] b = {" second", " minute", " hour", " day", " week", " month"};
    private static final java.lang.String[] c = {androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "m", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "d", "w", "mth"};
    private static final java.text.DecimalFormat d = new java.text.DecimalFormat();
    private static final java.util.Random e = new java.util.Random();
    private static java.lang.Boolean f;
    private static java.lang.Boolean g;
    private static java.lang.String h;
    private static java.lang.Boolean i;

    public static double a(long j) {
        return j / 1024.0d;
    }

    public static int a(int i2, int i3) {
        return (i2 < 0 || i2 > 100) ? i3 : i2;
    }

    public static void a() {
    }

    public static boolean a(long j, long j2) {
        return (j & j2) != 0;
    }

    public static float b(float f2) {
        return f2 * 1000.0f;
    }

    public static int b(int i2) {
        return i2 * 1024;
    }

    public static long b(long j) {
        return j * 8;
    }

    public static void b() {
    }

    public static void c() {
    }

    public static double d(long j) {
        return j / 1000.0d;
    }

    public static int f() {
        return 2015001;
    }

    public static boolean h() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static boolean h(android.content.Context context) {
        if (g == null) {
            g = java.lang.Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        return g.booleanValue();
    }

    public static boolean k(android.content.Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.j.m();
        }
        if (context != null) {
            return com.applovin.impl.t0.a(context).a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static boolean k() {
        android.content.Context contextM = com.applovin.impl.sdk.j.m();
        if (contextM != null) {
            return com.applovin.impl.t0.a(contextM).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    class a implements java.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(java.lang.String str, java.lang.String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public static double c(long j) {
        return a(b(j));
    }

    public static java.lang.String l(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return listQueryIntentActivities.get(0).activityInfo.name;
    }

    public static int f(java.lang.String str) {
        int i2 = 0;
        for (java.lang.String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                com.applovin.impl.sdk.n.h("Utils", "Version number components cannot be longer than two digits -> " + str);
                return i2;
            }
            i2 = (i2 * 100) + java.lang.Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i2 * 100) + 99 : i2;
    }

    public static boolean f(android.content.Context context) {
        if (f == null) {
            f = java.lang.Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return f.booleanValue();
    }

    private static long b(java.lang.String str) {
        if (str == null) {
            return 0L;
        }
        return new java.io.File(str).length();
    }

    public static int c(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static boolean e(android.content.Context context) {
        return com.applovin.impl.t0.a(context).a("applovin.sdk.is_test_environment");
    }

    public static boolean i(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    public static boolean i() {
        return !a("com.applovin.sdk.AppLovinSdk");
    }

    public static boolean a(com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.mediation.MaxAdFormat maxAdFormat2) {
        return (maxAdFormat == null || maxAdFormat2 == null || (maxAdFormat != maxAdFormat2 && ((!maxAdFormat.isAdViewAd() || !maxAdFormat2.isAdViewAd()) && (!maxAdFormat.isFullscreenAd() || !maxAdFormat2.isFullscreenAd())))) ? false : true;
    }

    public static boolean j(android.content.Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getResources();
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean j() {
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                java.lang.String displayName = networkInterfaces.nextElement().getDisplayName();
                if (displayName.contains("tun") || displayName.contains("ppp") || displayName.contains("ipsec")) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Unable to check Network Interfaces", th);
            return false;
        }
    }

    public static android.content.Context d(android.content.Context context) {
        return j(context) ? context : com.applovin.impl.sdk.j.m();
    }

    public static java.lang.Boolean g(android.content.Context context) {
        if (context == null) {
            return null;
        }
        java.lang.Boolean bool = i;
        if (bool != null) {
            return bool;
        }
        try {
            java.lang.String strA = com.applovin.impl.t0.a(context).a();
            java.lang.String strB = b(context);
            if (strB == null) {
                return null;
            }
            if (strB.equals(strA)) {
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                i = bool2;
                return bool2;
            }
            if (android.text.TextUtils.isEmpty(strA) && strB.equals(context.getPackageName())) {
                java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                i = bool3;
                return bool3;
            }
            java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
            i = bool4;
            return bool4;
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.b("Utils", "Unable to determine if the current process is the main process", th);
            return null;
        }
    }

    public static boolean g() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        try {
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Exception thrown while getting memory state.", th);
        }
        int i2 = runningAppProcessInfo.importance;
        return i2 == 100 || i2 == 200;
    }

    public static java.lang.String c(java.lang.String str) {
        return str.replace("ALPlayableAnalytics.trackEvent = ", "ALPlayableAnalytics.trackEvent = function (eventName) {const SDK_URL = 'applovin://com.applovin.sdk/playable_event';if (!Object.values(ALPlayableEvent).includes(eventName)) {var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=0&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();return;}var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=1&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();}; ALPlayableAnalytics.trackEvent_ignore = ");
    }

    public static boolean e(com.applovin.impl.sdk.j jVar) {
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.p2)).booleanValue()) {
            return jVar.f0().isMuted();
        }
        return ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.n2)).booleanValue();
    }

    public static java.util.List a(boolean z, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar, android.content.Context context) {
        boolean z2;
        if (bVar instanceof com.applovin.impl.aq) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = new java.util.ArrayList(bVar.i()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            android.net.Uri uri = (android.net.Uri) it.next();
            boolean zC = jVar.A().c(uri.getLastPathSegment(), context);
            z2 = ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.H5)).booleanValue() && b(uri.getPath()) == 0;
            if (!zC || z2) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().b("Utils", "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        android.net.Uri uriU0 = bVar.u0();
        if (z && uriU0 != null) {
            boolean zC2 = jVar.A().c(uriU0.getLastPathSegment(), context);
            z2 = ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.H5)).booleanValue() && b(uriU0.getPath()) == 0;
            if (!zC2 || z2) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().b("Utils", "Cached video missing: " + uriU0);
                }
                arrayList.add(uriU0);
            }
        }
        return arrayList;
    }

    public static java.lang.String e(java.lang.String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static java.lang.String e() {
        try {
            for (java.lang.reflect.Field field : android.os.Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == android.os.Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Unable to get Android SDK codename", th);
            return "";
        }
    }

    public static java.lang.String b(android.content.Context context) {
        if (context == null) {
            return null;
        }
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(h)) {
            return h;
        }
        try {
            int iMyPid = android.os.Process.myPid();
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                com.applovin.impl.sdk.n.c("Utils", "No running app processes. Unable to determine process name");
                return null;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (iMyPid == runningAppProcessInfo.pid) {
                    java.lang.String str = runningAppProcessInfo.processName;
                    h = str;
                    return str;
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.b("Utils", "Unable to determine process name", th);
        }
    }

    public static boolean d(com.applovin.impl.sdk.j jVar) {
        java.lang.String str = jVar.f0().getExtraParameters().get("user_agent_collection_enabled");
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return java.lang.Boolean.parseBoolean(str);
        }
        return true;
    }

    public static java.lang.String b(java.lang.Class cls, java.lang.String str) {
        try {
            java.lang.reflect.Field fieldA = a(cls, str);
            fieldA.setAccessible(true);
            return (java.lang.String) fieldA.get(null);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static boolean a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            java.lang.Class.forName(str);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean c(com.applovin.impl.sdk.j jVar) {
        java.lang.String str = jVar.f0().getExtraParameters().get("run_in_release_mode");
        return ((com.applovin.impl.sdk.utils.StringUtils.isValidString(str) && java.lang.Boolean.parseBoolean(str)) || (com.applovin.impl.sdk.j.m().getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static long c(float f2) {
        return a(b(f2));
    }

    public static long d(java.lang.String str) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return Long.MAX_VALUE;
        }
        try {
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Throwable unused) {
            return Long.MAX_VALUE;
        }
    }

    public static boolean a(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a((java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() <= b(8)) {
            return;
        }
        com.applovin.impl.sdk.n.j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + b(8) + " maximum)");
    }

    public static long c(byte[] bArr) {
        return a(bArr, 0);
    }

    public static void a(java.io.Closeable closeable, com.applovin.impl.sdk.j jVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.lang.Throwable th) {
            if (jVar != null) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("Utils", "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    public static byte[] d(byte[] bArr) throws java.io.IOException {
        if (bArr == null || bArr.length == 0 || !b(bArr)) {
            return bArr;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(new java.io.ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i2 = gZIPInputStream.read(bArr2);
            if (i2 > 0) {
                byteArrayOutputStream.write(bArr2, 0, i2);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static java.lang.String d() {
        try {
            return android.os.Build.VERSION.RELEASE + " (" + e() + " - API " + android.os.Build.VERSION.SDK_INT + ")";
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Unable to get Android OS info", th);
            return "";
        }
    }

    public static android.webkit.WebView b(android.content.Context context, java.lang.String str) {
        return a(context, str, false);
    }

    public static int a(java.lang.String str, java.lang.String str2) {
        java.lang.String digitsOnlyVersionString = com.applovin.impl.sdk.utils.StringUtils.toDigitsOnlyVersionString(str);
        java.lang.String digitsOnlyVersionString2 = com.applovin.impl.sdk.utils.StringUtils.toDigitsOnlyVersionString(str2);
        try {
            java.lang.String[] strArrSplit = digitsOnlyVersionString.split("\\.");
            java.lang.String[] strArrSplit2 = digitsOnlyVersionString2.split("\\.");
            int iMax = java.lang.Math.max(strArrSplit.length, strArrSplit2.length);
            for (int i2 = 0; i2 < iMax; i2++) {
                java.lang.String str3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(strArrSplit[i2]) ? strArrSplit[i2] : "0";
                java.lang.String str4 = com.applovin.impl.sdk.utils.StringUtils.isValidString(strArrSplit2[i2]) ? strArrSplit2[i2] : "0";
                int i3 = java.lang.Integer.parseInt(str3);
                int i4 = java.lang.Integer.parseInt(str4);
                if (i3 < i4) {
                    return -1;
                }
                if (i3 > i4) {
                    return 1;
                }
            }
            return 0;
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Failed to process version string.", th);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.impl.sdk.j jVar) {
        if (appLovinAd instanceof com.applovin.impl.sdk.AppLovinAdBase) {
            com.applovin.impl.sdk.AppLovinAdBase appLovinAdBase = (com.applovin.impl.sdk.AppLovinAdBase) appLovinAd;
            java.lang.String strA0 = jVar.a0();
            java.lang.String strA1 = appLovinAdBase.getSdk().a0();
            if (strA0.equals(strA1)) {
                return;
            }
            java.lang.String str = "Ad was loaded from sdk with key: " + strA1 + ", but is being rendered from sdk with key: " + strA0;
            com.applovin.impl.sdk.n.h("AppLovinAd", str);
            jVar.C().c(com.applovin.impl.ba.q);
            a(str, appLovinAdBase, "AppLovinAd", jVar);
        }
    }

    public static boolean b(com.applovin.impl.sdk.j jVar) {
        if (!com.applovin.impl.z3.e()) {
            return true;
        }
        try {
            org.json.JSONObject.wrap(org.json.JSONObject.NULL);
            return true;
        } catch (java.lang.Throwable th) {
            jVar.I();
            if (!com.applovin.impl.sdk.n.a()) {
                return false;
            }
            jVar.I().d("Utils", "Failed to wrap JSONObject with exception", th);
            return false;
        }
    }

    public static boolean b(java.util.List list) {
        android.content.Context contextM = com.applovin.impl.sdk.j.m();
        if (contextM == null) {
            com.applovin.impl.sdk.n.h("Utils", "Failed to check whether or not app is member of package names");
            return false;
        }
        return list.contains(contextM.getPackageName());
    }

    public static void a(java.net.HttpURLConnection httpURLConnection, com.applovin.impl.sdk.j jVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (java.lang.Throwable th) {
            if (jVar != null) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    public static java.lang.String a(java.util.Map map, boolean z) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z) {
            java.util.TreeMap treeMap = new java.util.TreeMap(new com.applovin.impl.yp.a());
            treeMap.putAll(map);
            map = treeMap;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(com.ironsource.y8.i.c);
            }
            java.lang.Object value = entry.getValue();
            if (value instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) value;
                if (str.contains(com.ironsource.y8.i.c)) {
                    value = str.replace(com.ironsource.y8.i.c, "%26");
                }
            }
            sb.append(entry.getKey()).append('=').append(value);
        }
        return sb.toString();
    }

    private static long a(float f2) {
        return java.lang.Math.round(f2);
    }

    public static java.lang.String a(java.lang.Object obj) {
        if (obj instanceof com.applovin.impl.fe) {
            return ((com.applovin.impl.fe) obj).R();
        }
        if (com.applovin.impl.ze.a(obj)) {
            return ((com.applovin.impl.sdk.ad.b) obj).I();
        }
        return null;
    }

    public static int a(android.content.Context context) {
        com.applovin.impl.z3.d();
        return android.provider.Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static java.lang.String a(com.applovin.impl.nh nhVar) {
        if (nhVar == null) {
            return "Unknown error";
        }
        java.lang.Throwable cause = nhVar.getCause();
        return "Code: " + nhVar.f1097a + ", Name: " + nhVar.a() + ", Message: " + nhVar.getMessage() + ", Cause Class: " + (cause != null ? cause.getClass().getName() : "") + ", Cause Message: " + (cause != null ? cause.getMessage() : "Unknown");
    }

    public static java.lang.reflect.Field a(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str);
        }
    }

    public static java.lang.String a(android.net.Uri uri, java.lang.String str, com.applovin.impl.sdk.j jVar) {
        java.util.List listC = jVar.c(com.applovin.impl.sj.G0);
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (listC.contains(lastPathSegment)) {
            return lastPathSegment;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            java.lang.String queryParameter = uri.getQueryParameter(it.next());
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(queryParameter)) {
                arrayList.add(queryParameter);
            }
        }
        arrayList.addAll(uri.getPathSegments());
        java.lang.String strEncodeUriString = com.applovin.impl.sdk.utils.StringUtils.encodeUriString(android.text.TextUtils.join("_", arrayList));
        java.lang.Integer num = (java.lang.Integer) jVar.a(com.applovin.impl.sj.H0);
        int length = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(strEncodeUriString).length() + com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(str).length();
        if (length > num.intValue() && com.applovin.impl.sdk.utils.StringUtils.isValidString(strEncodeUriString)) {
            strEncodeUriString = strEncodeUriString.substring(length - num.intValue());
        }
        return (com.applovin.impl.sdk.utils.StringUtils.isValidString(strEncodeUriString) && com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) ? str + strEncodeUriString : strEncodeUriString;
    }

    public static android.app.ActivityManager.MemoryInfo a(android.app.ActivityManager activityManager) {
        if (activityManager == null) {
            return null;
        }
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.b("Utils", "Unable to collect memory info.", th);
            return null;
        }
    }

    public static java.util.List a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        return a(jSONObject, str, null, str2, null, false, jVar);
    }

    public static java.util.List a(org.json.JSONObject jSONObject, java.lang.String str, java.util.Map map, java.lang.String str2, java.util.Map map2, boolean z, com.applovin.impl.sdk.j jVar) {
        if (map == null) {
            map = new java.util.HashMap(1);
        }
        java.util.Map map3 = map;
        map3.put("{CLCODE}", str);
        return a(jSONObject, map3, str2, map2, z, jVar);
    }

    public static java.util.List a(org.json.JSONObject jSONObject, java.util.Map map, java.lang.String str, java.util.Map map2, boolean z, com.applovin.impl.sdk.j jVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONObject.length() + 1);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            arrayList.add(new com.applovin.impl.s(str, null, map2, z));
        }
        if (jSONObject.length() <= 0) {
            return arrayList;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                java.lang.String next = itKeys.next();
                if (!android.text.TextUtils.isEmpty(next)) {
                    java.lang.String strOptString = jSONObject.optString(next);
                    java.lang.String strReplace = com.applovin.impl.sdk.utils.StringUtils.replace(next, map);
                    if (com.applovin.sdk.AppLovinSdkUtils.isValidString(strOptString)) {
                        strOptString = com.applovin.impl.sdk.utils.StringUtils.replace(strOptString, map);
                    }
                    arrayList.add(new com.applovin.impl.s(strReplace, strOptString, map2, z));
                }
            } catch (java.lang.Throwable th) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("Utils", "Failed to create and add postback url.", th);
                }
            }
        }
        return arrayList;
    }

    public static java.lang.String a(long j, boolean z) {
        java.lang.String[] strArr = z ? b : c;
        long jCurrentTimeMillis = (java.lang.System.currentTimeMillis() - j) / 1000;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            long j2 = f1550a[i2];
            if (jCurrentTimeMillis < j2) {
                if (jCurrentTimeMillis <= 0) {
                    return z ? "just now" : "now";
                }
                return java.lang.String.format("%d%s%s%s", java.lang.Long.valueOf(jCurrentTimeMillis), strArr[i2], (!z || jCurrentTimeMillis <= 1) ? "" : androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, z ? " ago" : "");
            }
            jCurrentTimeMillis /= j2;
        }
        return z ? "just now" : "now";
    }

    public static java.lang.String a(int i2, android.content.Context context, com.applovin.impl.sdk.j jVar) {
        if (i2 == 0) {
            return "";
        }
        try {
            java.io.InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i2);
            try {
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                return new java.lang.String(bArr);
            } catch (java.io.IOException e2) {
                if (jVar != null) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("Utils", "Opening raw resource file threw exception", e2);
                    }
                }
                return "";
            } finally {
                a(inputStreamOpenRawResource, jVar);
            }
        } catch (java.lang.Throwable th) {
            if (jVar != null) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("Utils", "Failed to retrieve resource " + i2, th);
                }
            }
            return "";
        }
    }

    public static long a(com.applovin.impl.sdk.j jVar) {
        long jLongValue = ((java.lang.Long) jVar.a(com.applovin.impl.sj.v5)).longValue();
        long jLongValue2 = ((java.lang.Long) jVar.a(com.applovin.impl.sj.w5)).longValue();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        return (jLongValue <= 0 || jLongValue2 <= 0) ? jCurrentTimeMillis : jCurrentTimeMillis + (jLongValue - jLongValue2);
    }

    public static boolean a(double d2) {
        if (d2 >= 100.0d) {
            return true;
        }
        return d2 > 0.0d && ((double) e.nextFloat()) < d2 / 100.0d;
    }

    public static java.lang.String a(com.applovin.sdk.AppLovinSdkSettings appLovinSdkSettings) {
        java.lang.String strEmptyIfNull = com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(appLovinSdkSettings.getExtraParameters().get("applovin_unity_metadata"));
        if (android.text.TextUtils.isEmpty(strEmptyIfNull)) {
            return null;
        }
        java.util.Map<java.lang.String, java.lang.String> mapTryToStringMap = com.applovin.impl.sdk.utils.JsonUtils.tryToStringMap(com.applovin.impl.sdk.utils.JsonUtils.jsonObjectFromJsonString(strEmptyIfNull, new org.json.JSONObject()));
        if (com.applovin.impl.sdk.utils.CollectionUtils.isEmpty(mapTryToStringMap)) {
            return null;
        }
        return mapTryToStringMap.get("UnityVersion");
    }

    public static int a(int i2) {
        return a(i2, 95);
    }

    public static com.applovin.impl.h0 a(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        return com.applovin.impl.h0.a(com.applovin.sdk.AppLovinAdSize.fromString(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "ad_size", null)), com.applovin.sdk.AppLovinAdType.fromString(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "ad_type", null)), com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, com.applovin.mediation.AppLovinUtils.ServerParameterKeys.ZONE_ID, null), true, com.applovin.impl.sdk.utils.JsonUtils.getBoolean(jSONObject, "is_direct_sold", java.lang.Boolean.FALSE).booleanValue());
    }

    public static byte[] a(byte[] bArr) throws java.io.IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(bArr.length);
        java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean a(com.applovin.sdk.AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == com.applovin.sdk.AppLovinAdSize.BANNER || appLovinAdSize == com.applovin.sdk.AppLovinAdSize.MREC || appLovinAdSize == com.applovin.sdk.AppLovinAdSize.LEADER;
    }

    public static boolean a(java.lang.String str, java.util.List list) {
        return com.applovin.impl.sdk.utils.StringUtils.startsWithAtLeastOnePrefix(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(android.content.Context context, java.lang.String str) {
        android.widget.Toast toastMakeText = android.widget.Toast.makeText(context, str, 0);
        toastMakeText.setMargin(0.0f, 0.1f);
        toastMakeText.show();
    }

    public static void a(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject.has("no_fill_reason")) {
            java.lang.String str2 = "\n**************************************************\nNO FILL received:\n..ID: \"" + str + "\"\n..FORMAT: \"" + (maxAdFormat != null ? maxAdFormat.getLabel() : "None") + "\"\n..SDK KEY: \"" + jVar.a0() + "\"\n..PACKAGE NAME: \"" + com.applovin.impl.sdk.j.m().getPackageName() + "\"\n..Reason: " + com.applovin.impl.sdk.utils.JsonUtils.getObject(jSONObject, "no_fill_reason", new java.lang.Object()) + "\n**************************************************\n";
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("AppLovinSdk", str2);
            }
        }
    }

    public static com.applovin.sdk.AppLovinAd a(com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.impl.sdk.j jVar) {
        if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
            return appLovinAd;
        }
        com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd;
        com.applovin.sdk.AppLovinAd appLovinAdDequeueAd = jVar.j().dequeueAd(cVar.getAdZone());
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().a("Utils", "Dequeued ad for dummy ad: " + appLovinAdDequeueAd);
        }
        if (appLovinAdDequeueAd != null) {
            cVar.a(appLovinAdDequeueAd);
            ((com.applovin.impl.sdk.ad.AppLovinAdImpl) appLovinAdDequeueAd).setDummyAd(cVar);
            return appLovinAdDequeueAd;
        }
        return cVar.f();
    }

    public static void a(com.applovin.impl.sdk.j jVar, java.lang.String str) {
        java.lang.String strA0 = jVar.a0();
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.C)).booleanValue()) {
            if (strA0 == null || strA0.length() != 86) {
                a(android.text.TextUtils.isEmpty(strA0) ? "Empty SDK key" : "Invalid SDK key length", str, jVar);
            }
        }
    }

    public static void a(java.lang.String str, java.lang.String str2, java.util.Map map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    private static void a(java.lang.String str, com.applovin.impl.sdk.AppLovinAdBase appLovinAdBase, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("sdkKey=");
        sb.append(jVar.a0());
        if (appLovinAdBase != null) {
            sb.append(",adSdkKey=").append(appLovinAdBase.getSdk().a0());
        }
        java.util.HashMap map = new java.util.HashMap();
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("details", sb.toString(), map);
        com.applovin.impl.sdk.utils.CollectionUtils.putStringIfValid("error_message", str, map);
        jVar.D().a(com.applovin.impl.ka.V, str2, (java.util.Map) map);
    }

    private static void a(java.lang.String str, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        a(str, (com.applovin.impl.sdk.AppLovinAdBase) null, str2, jVar);
    }

    public static boolean a(com.applovin.impl.sj sjVar, com.applovin.impl.sdk.j jVar) {
        java.lang.String str = jVar.f0().getExtraParameters().get("enable_black_screen_fixes");
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return java.lang.Boolean.parseBoolean(str);
        }
        return ((java.lang.Boolean) jVar.a(sjVar)).booleanValue();
    }

    public static boolean a(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        if (str == null) {
            return false;
        }
        return com.applovin.impl.sdk.utils.StringUtils.containsAtLeastOneSubstring(str, jVar.c(com.applovin.impl.sj.x0));
    }

    public static void a(com.applovin.mediation.MaxError maxError, java.lang.String str, android.content.Context context) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (maxError.getCode() == -5001) {
            for (com.applovin.mediation.MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                com.applovin.mediation.MaxError error = maxNetworkResponseInfo.getError();
                java.lang.String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb.append("\nFailed to load " + str + " from " + name + ":\n");
                sb.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                sb.append("\n" + name + " Error " + error.getMediatedNetworkErrorCode() + ": " + error.getMediatedNetworkErrorMessage() + "\n\n");
            }
        } else {
            sb.append("Failed to load " + str + " with error " + maxError.getCode() + ": " + maxError.getMessage());
        }
        a("", sb.toString(), context);
    }

    public static void a(final java.lang.String str, final android.content.Context context) {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.yp$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.applovin.impl.yp.a(context, str);
            }
        });
    }

    public static void a(java.lang.String str, com.applovin.mediation.MaxAd maxAd, android.content.Context context) {
        android.widget.Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static void a(android.net.Uri uri, android.app.Activity activity, com.applovin.impl.sdk.j jVar) {
        if (activity == null) {
            activity = jVar.m0();
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.applovin.sdk.AppLovinWebViewActivity.class);
        intent.putExtra(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, jVar.a0());
        intent.putExtra(com.applovin.sdk.AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    public static java.util.Map a(java.util.Map map) {
        java.util.HashMap map2 = new java.util.HashMap();
        if (map != null && !map.isEmpty()) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                map2.put((java.lang.String) entry.getKey(), java.lang.String.valueOf(entry.getValue()));
            }
        }
        return map2;
    }

    public static long a(byte[] bArr, int i2) {
        int i3 = i2 + 8;
        if (bArr.length < i3) {
            throw new java.lang.IllegalArgumentException("byte array must be at least 8 bytes long");
        }
        long j = 0;
        while (i2 < i3) {
            j |= (((long) bArr[i2]) & 255) << (i2 * 8);
            i2++;
        }
        return j;
    }

    public static java.util.Map a(java.util.Map map, com.applovin.impl.sdk.j jVar) {
        java.util.Map map2 = com.applovin.impl.sdk.utils.CollectionUtils.map(map);
        for (java.lang.String str : map2.keySet()) {
            java.lang.String str2 = (java.lang.String) map2.get(str);
            if (str2 != null) {
                map2.put(str, com.applovin.impl.sdk.utils.StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    public static double a(java.lang.String str, double d2) {
        try {
            return java.lang.Double.parseDouble(str);
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Failed to parse double from String: " + str, th);
            return d2;
        }
    }

    public static android.webkit.WebView a(android.content.Context context, java.lang.String str, boolean z) {
        try {
            android.webkit.WebView webView = new android.webkit.WebView(context);
            if (z) {
                webView.setWebViewClient(new com.applovin.impl.pi());
            }
            return webView;
        } catch (java.lang.Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    public static void a(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        thread.setPriority(1);
        thread.start();
    }

    public static void a(java.lang.String str, java.lang.String str2, android.content.Context context) {
        new android.app.AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(android.R.string.ok, (android.content.DialogInterface.OnClickListener) null).create().show();
    }
}
