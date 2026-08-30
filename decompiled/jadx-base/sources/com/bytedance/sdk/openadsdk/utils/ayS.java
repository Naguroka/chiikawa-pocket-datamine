package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class ayS {
    private static java.lang.String Lq;
    private static final byte[] PX;
    private static final byte[] Ta;
    private static final java.util.HashSet<java.lang.String> VB;
    public static java.lang.Integer bg;
    private static java.lang.String yDt;
    private static final java.util.concurrent.ExecutorService IL = java.util.concurrent.Executors.newSingleThreadExecutor();
    private static volatile boolean bX = false;
    private static final java.util.concurrent.atomic.AtomicInteger eqN = new java.util.concurrent.atomic.AtomicInteger(0);
    private static volatile java.lang.String zx = "";
    private static final java.util.concurrent.locks.ReentrantLock ldr = new java.util.concurrent.locks.ReentrantLock();
    private static java.lang.String iR = null;
    private static java.lang.String Kg = null;
    private static java.lang.String WR = null;
    private static final java.util.HashSet<java.lang.String> eo = new java.util.HashSet<>(java.util.Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    public static java.lang.String IL(int i) {
        if (i == 1) {
            return "embeded_ad_landingpage";
        }
        if (i == 2) {
            return "banner_ad_landingpage";
        }
        if (i == 3) {
            return "interaction_landingpage";
        }
        if (i == 4) {
            return "splash_ad_landingpage";
        }
        if (i != 5) {
            return i != 7 ? "unknow" : "rewarded_video_landingpage";
        }
        return "fullscreen_interstitial_ad";
    }

    public static java.lang.String bX(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i == 2) {
            return "interaction";
        }
        if (i == 3 || i == 4) {
            return "open_ad";
        }
        if (i != 7) {
            return i != 8 ? "embeded_ad" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    public static java.lang.String bg(int i) {
        if (i == 1) {
            return "embeded_ad";
        }
        if (i == 2) {
            return "banner_ad";
        }
        if (i == 3) {
            return "interaction";
        }
        if (i == 4) {
            return "open_ad";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.view.View view) {
    }

    public static boolean eqN(int i) {
        return i == 4;
    }

    public static int iR(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 5) {
            return 4;
        }
        if (i != 6) {
            return i;
        }
        return 5;
    }

    public static boolean ldr(int i) {
        return i == 6;
    }

    public static boolean zx(int i) {
        return i == 5;
    }

    static {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        VB = hashSet;
        hashSet.addAll(java.util.Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        bg = null;
        PX = new byte[]{108, 111, 97, 100, 105, 110, 103};
        Ta = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static android.content.Intent bg(android.content.Context context, java.lang.String str) {
        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static boolean IL(android.content.Context context, java.lang.String str) {
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean bg(android.content.Context context, android.content.Intent intent) {
        return bX(context, intent) > 0;
    }

    public static com.bytedance.sdk.openadsdk.utils.ayS.IL IL(android.content.Context context, android.content.Intent intent) {
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            return new com.bytedance.sdk.openadsdk.utils.ayS.IL(null, 0);
        }
        android.content.pm.ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
        if (activityInfo != null && !android.text.TextUtils.isEmpty(activityInfo.packageName) && !android.text.TextUtils.isEmpty(activityInfo.name)) {
            return new com.bytedance.sdk.openadsdk.utils.ayS.IL(new android.content.ComponentName(activityInfo.packageName, activityInfo.name), listQueryIntentActivities.size());
        }
        return new com.bytedance.sdk.openadsdk.utils.ayS.IL(null, listQueryIntentActivities.size());
    }

    public static class IL {
        public final int IL;
        public final android.content.ComponentName bg;

        public IL(android.content.ComponentName componentName, int i) {
            this.bg = componentName;
            this.IL = i;
        }
    }

    public static int bX(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return context.getPackageManager().queryIntentActivities(intent, 65536).size();
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public static boolean bg() {
        return (com.bytedance.sdk.openadsdk.core.Lq.bg() == null || com.bytedance.sdk.openadsdk.core.Lq.bg().eqN()) ? false : true;
    }

    public static boolean bX(android.content.Context context, java.lang.String str) {
        if (context != null && !android.text.TextUtils.isEmpty(str)) {
            try {
                android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + android.net.Uri.encode(str)));
                if (!(context instanceof android.app.Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.IL.bg(context, intent, null);
                return true;
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public static java.lang.String bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return null;
        }
        try {
            return bX(tuv.Fx());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static int IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return -1;
        }
        int iFx = tuv.Fx();
        int i = 1;
        if (iFx == 1) {
            return 2;
        }
        if (iFx == 3) {
            return 4;
        }
        if (iFx != 5) {
            i = 7;
            if (iFx != 7) {
                return iFx != 8 ? -1 : 5;
            }
        }
        return i;
    }

    public static int bg(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    public static java.lang.String IL() {
        java.lang.String strIL;
        java.lang.String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        try {
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                strIL = com.bytedance.sdk.openadsdk.multipro.eqN.bg.IL("sp_multi_ua_data", "android_system_ua", "unKnow");
            } else {
                strIL = com.bytedance.sdk.openadsdk.core.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).IL("android_system_ua", "unKnow");
            }
            if (strIL != null && !"unKnow".equals(strIL)) {
                return strIL;
            }
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new com.bytedance.sdk.openadsdk.utils.ayS.bg(2));
            IL.execute(futureTask);
            str = (java.lang.String) futureTask.get(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception unused) {
        }
        com.bytedance.sdk.component.utils.PX.bg("getUA", " getAndroidSystemUA userAgent".concat(java.lang.String.valueOf(str)));
        return str;
    }

    public static java.lang.String bX() {
        if (!android.text.TextUtils.isEmpty(zx)) {
            return zx;
        }
        com.bytedance.sdk.openadsdk.multipro.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        java.lang.String strBg = com.bytedance.sdk.openadsdk.core.WR.bg("sdk_local_web_ua", 86400000L);
        zx = strBg;
        if (android.text.TextUtils.isEmpty(strBg)) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = ldr;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (android.text.TextUtils.isEmpty(zx)) {
                            zx = android.webkit.WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.VzQ.bg());
                        }
                        com.bytedance.sdk.openadsdk.core.WR.bg("sdk_local_web_ua", zx);
                        reentrantLock.unlock();
                    } catch (java.lang.Exception e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", "", e);
                        ldr.unlock();
                    } catch (java.lang.NoClassDefFoundError e2) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", "", e2);
                        ldr.unlock();
                    }
                }
            } catch (java.lang.Throwable th) {
                ldr.unlock();
                throw th;
            }
        }
        return zx;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ayS$1, reason: invalid class name */
    static class AnonymousClass1 implements java.lang.Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.utils.ayS.zx)) {
                    com.bytedance.sdk.component.WR.eqN eqn = new com.bytedance.sdk.component.WR.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg());
                    eqn.setWebViewClient(new com.bytedance.sdk.component.WR.eqN.bg());
                    java.lang.String unused = com.bytedance.sdk.openadsdk.utils.ayS.zx = eqn.getUserAgentString();
                }
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", "", e);
            } catch (java.lang.NoClassDefFoundError e2) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", "", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String JAA() {
        try {
            android.webkit.WebView webView = new android.webkit.WebView(com.bytedance.sdk.openadsdk.core.VzQ.bg());
            webView.setWebViewClient(new com.bytedance.sdk.component.WR.eqN.bg());
            java.lang.String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                    com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    com.bytedance.sdk.openadsdk.core.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    public static class bg implements java.util.concurrent.Callable<java.lang.String> {
        private final int bg;

        bg(int i) {
            this.bg = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public synchronized java.lang.String call() throws java.lang.Exception {
            java.lang.String strIL;
            strIL = "unKnow";
            int i = this.bg;
            if (i == 1) {
                strIL = bX();
            } else if (i == 2) {
                strIL = IL();
            }
            return strIL;
        }

        private java.lang.String IL() {
            java.lang.String property;
            java.lang.Throwable th;
            try {
                property = java.lang.System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                                com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_ua_data", "android_system_ua", property);
                            } else {
                                com.bytedance.sdk.openadsdk.core.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg("android_system_ua", property);
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.PX.bg("getUA", "e:" + th.getMessage());
                    }
                }
            } catch (java.lang.Throwable th3) {
                property = "unKnow";
                th = th3;
            }
            return property;
        }

        private synchronized java.lang.String bX() {
            final java.lang.String[] strArr;
            strArr = new java.lang.String[]{"unKnow"};
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.ayS.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = com.bytedance.sdk.openadsdk.utils.ayS.JAA();
                    java.lang.String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.InterruptedException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", e.getMessage());
            }
            return strArr[0];
        }
    }

    public static java.lang.String eqN() {
        return com.bytedance.sdk.openadsdk.utils.rri.bg();
    }

    public static synchronized java.lang.String zx() {
        android.content.Context contextBg;
        if (android.text.TextUtils.isEmpty(iR) && (contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg()) != null) {
            try {
                iR = contextBg.getPackageName();
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
            }
        }
        return iR;
    }

    public static synchronized java.lang.String ldr() {
        if (android.text.TextUtils.isEmpty(Kg) && com.bytedance.sdk.openadsdk.core.VzQ.bg() != null) {
            try {
                android.content.pm.PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.VzQ.bg().getPackageManager().getPackageInfo(zx(), 0);
                Kg = java.lang.String.valueOf(packageInfo.versionCode);
                WR = packageInfo.versionName;
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
            }
        }
        return Kg;
    }

    public static synchronized java.lang.String iR() {
        if (android.text.TextUtils.isEmpty(WR) && com.bytedance.sdk.openadsdk.core.VzQ.bg() != null) {
            try {
                android.content.pm.PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.VzQ.bg().getPackageManager().getPackageInfo(zx(), 0);
                Kg = java.lang.String.valueOf(packageInfo.versionCode);
                WR = packageInfo.versionName;
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
            }
        }
        return WR;
    }

    public static java.lang.String bg(android.content.Context context) {
        java.lang.String strIL = com.bytedance.sdk.openadsdk.core.bX.bg(context).IL("total_memory", (java.lang.String) null);
        if (strIL == null || IL(strIL) <= 0) {
            strIL = bX("MemTotal");
            if (IL(strIL) <= 0) {
                strIL = Kg();
            }
            com.bytedance.sdk.openadsdk.core.bX.bg(context).bg("total_memory", strIL);
        }
        return strIL;
    }

    public static long IL(java.lang.String str) {
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    public static java.lang.String Kg() {
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) com.bytedance.sdk.openadsdk.core.VzQ.bg().getSystemService("activity");
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.totalMem > 0) {
                return java.lang.String.valueOf(memoryInfo.totalMem / 1024);
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.String IL(android.content.Context context) {
        return com.bytedance.sdk.openadsdk.core.bX.bg(context).IL("total_memory", "0");
    }

    public static java.lang.String WR() {
        return bX("MemTotal");
    }

    public static java.lang.String bX(java.lang.String str) {
        java.io.FileReader fileReader;
        java.io.BufferedReader bufferedReader;
        java.lang.String line;
        try {
            fileReader = new java.io.FileReader(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new java.io.BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        try {
                            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", th.getMessage());
                            return null;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (java.lang.Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (java.lang.Exception unused2) {
                                }
                            }
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (java.lang.Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (java.lang.Exception unused4) {
                    }
                    return null;
                }
                java.lang.String str2 = line.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (java.lang.Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (java.lang.Exception unused6) {
                }
                return str2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static long bX(android.content.Context context) {
        return com.bytedance.sdk.openadsdk.core.bX.bg(context).IL("total_internal_storage", 0L).longValue();
    }

    public static long eo() {
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }

    public static long eqN(android.content.Context context) {
        return com.bytedance.sdk.openadsdk.core.bX.bg(context).IL("free_internal_storage", 0L).longValue();
    }

    public static long zx(android.content.Context context) {
        return com.bytedance.sdk.openadsdk.core.bX.bg(context).IL("total_sdcard_storage", 0L).longValue();
    }

    public static long VB() {
        try {
            if (!Ja()) {
                return 0L;
            }
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    private static boolean Ja() {
        try {
            return "mounted".equals(android.os.Environment.getExternalStorageState());
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static int ldr(android.content.Context context) {
        return com.bytedance.sdk.openadsdk.core.bX.bg(context).IL("is_root", -1);
    }

    public static boolean PX() {
        try {
            return new java.io.File("/system/bin/su").exists() || new java.io.File("/system/xbin/su").exists();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static java.lang.String eqN(java.lang.String str) {
        return bg(str, false);
    }

    public static java.lang.String bg(java.lang.String str, boolean z) {
        java.lang.String str2;
        java.lang.String strVW = com.bytedance.sdk.openadsdk.core.VzQ.eqN().VW();
        if (android.text.TextUtils.isEmpty(strVW)) {
            int iVb = vb();
            if (iVb == 1 || iVb == 2) {
                str2 = "https://pangolin16.sgsnssdk.com" + str;
            } else {
                str2 = "https://pangolin16.isnssdk.com" + str;
            }
            if (!z) {
                return com.bytedance.sdk.openadsdk.utils.VW.bg(str2);
            }
            return PX(str2);
        }
        java.lang.String strBg = "https://" + strVW + str;
        if (com.bytedance.sdk.openadsdk.utils.VW.bg() && !z) {
            strBg = com.bytedance.sdk.openadsdk.utils.VW.bg(strBg);
        }
        return z ? PX(strBg) : strBg;
    }

    private static java.lang.String PX(java.lang.String str) {
        try {
            return android.net.Uri.parse(str).buildUpon().appendQueryParameter(com.json.tk.SESSION_HISTORY_KEY_AD_ID, "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", ldr()).toString();
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", e.getMessage());
            return str;
        }
    }

    public static java.lang.String zx(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.VzQ.eqN().VJ();
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return vb() == 2 ? "https://log.sgsnssdk.com/service/2/app_log/" : "https://log-mva.isnssdk.com/service/2/app_log/";
        }
        return !str.startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP) ? "https://".concat(java.lang.String.valueOf(str)) : str;
    }

    public static java.lang.String Ta() {
        return java.lang.String.format(com.adjust.sdk.Constants.BASE_URL_NO_SUB_DOMAIN_FORMAT, "log.byteoversea.com/service/2/app_log_test/");
    }

    public static java.lang.String yDt() {
        int iVb = vb();
        return (iVb == 1 || iVb == 2) ? "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    public static java.lang.String Lq() {
        try {
            return java.util.TimeZone.getDefault().getID();
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int vb() {
        try {
            java.lang.String id = java.util.TimeZone.getDefault().getID();
            if (eo.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id == null || !id.startsWith("Europe/")) {
                return (id == null || !id.startsWith("America/") || VB.contains(id)) ? 3 : 5;
            }
            return 4;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static java.lang.String iR(android.content.Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int xxp() {
        int rawOffset = java.util.TimeZone.getDefault().getRawOffset() / com.adjust.sdk.Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static java.lang.String VzQ() {
        int i = -xxp();
        if (i >= 0) {
            return "Etc/GMT+".concat(java.lang.String.valueOf(i));
        }
        return "Etc/GMT".concat(java.lang.String.valueOf(i));
    }

    public static org.json.JSONObject bg(boolean z, com.bytedance.sdk.openadsdk.core.model.tuV tuv, long j, long j2, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("creative_id", tuv.Ys());
            jSONObject.put("load_time", j);
            com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = tuv.Dxa();
            if (ilDxa != null) {
                jSONObject.put("video_size", ilDxa.zx());
                jSONObject.put("video_resolution", ilDxa.WR());
            }
            if (!z) {
                jSONObject.put("error_code", j2);
                if (android.text.TextUtils.isEmpty(str)) {
                    str = "unknown";
                }
                jSONObject.put("error_message", str);
            }
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", "getVideoDownload json error", e);
        }
        return jSONObject;
    }

    public static org.json.JSONObject bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, long j, com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
        if (tuv == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("creative_id", tuv.Ys());
            jSONObject.put("buffers_time", j);
            com.bykv.vk.openvk.bg.bg.bg.bX.IL ilDxa = tuv.Dxa();
            if (ilDxa != null) {
                jSONObject.put("video_size", ilDxa.zx());
                jSONObject.put("video_resolution", ilDxa.WR());
            }
            bg(jSONObject, bgVar);
        } catch (org.json.JSONException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", "getVideoAction json error", e);
        }
        return jSONObject;
    }

    private static void bg(org.json.JSONObject jSONObject, com.bykv.vk.openvk.bg.bg.bg.bg bgVar) {
        if (jSONObject.has("video_resolution") || bgVar == null) {
            return;
        }
        try {
            jSONObject.put("video_resolution", java.lang.String.format(java.util.Locale.getDefault(), "%d×%d", java.lang.Integer.valueOf(bgVar.eqN()), java.lang.Integer.valueOf(bgVar.zx())));
        } catch (java.lang.Throwable unused) {
        }
    }

    public static boolean ldr(java.lang.String str) {
        try {
            return java.util.regex.Pattern.compile("[一-龥]").matcher(str).find();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        if (tuv != null) {
            try {
                java.lang.String strGvG = tuv.GvG();
                if (android.text.TextUtils.isEmpty(strGvG) && tuv.Dt() != null && tuv.Dt().bX() == 1 && !android.text.TextUtils.isEmpty(tuv.Dt().IL())) {
                    strGvG = tuv.Dt().IL();
                }
                java.lang.String str2 = strGvG;
                if (android.text.TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.VJ.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), str2, tuv, bg(str), str, false);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static boolean bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return true;
        }
        int iIL = com.bytedance.sdk.openadsdk.core.VzQ.eqN().IL(tuv.IGR());
        int iBX = com.bytedance.sdk.component.utils.Lq.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg());
        if (iIL == 1) {
            return eqN(iBX);
        }
        if (iIL == 2) {
            return zx(iBX) || eqN(iBX) || ldr(iBX);
        }
        if (iIL != 3) {
            return iIL != 5 || eqN(iBX) || ldr(iBX);
        }
        return false;
    }

    public static boolean Kg(android.content.Context context) {
        if (context != null) {
            return !(context.getApplicationInfo().targetSdkVersion >= 30 && android.os.Build.VERSION.SDK_INT >= 30);
        }
        throw new java.lang.IllegalArgumentException("params context is null");
    }

    public static java.lang.String iR(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static void bg(java.lang.String str, java.lang.String str2, android.content.Context context) {
        int i;
        if (android.text.TextUtils.isEmpty(str2) || !WR(context)) {
            return;
        }
        int length = str2.length();
        int i2 = 1;
        if (length % 3572 == 0) {
            i = length / 3572;
        } else {
            i = (length / 3572) + 1;
        }
        int i3 = 3572;
        int i4 = 0;
        while (i2 <= i) {
            if (i3 < length) {
                android.util.Log.d(str, i + "-" + i2 + ":" + str2.substring(i4, i3));
                i2++;
                i4 = i3;
                i3 += 3572;
            } else {
                android.util.Log.d(str, i + "-" + i2 + ":" + str2.substring(i4));
                return;
            }
        }
    }

    public static boolean WR(android.content.Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (java.lang.Exception unused) {
        }
    }

    public static int eo(android.content.Context context) {
        int i = -1;
        try {
            i = context.getApplicationInfo().targetSdkVersion;
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Integer.valueOf(i);
            return i;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", th.getMessage());
            return i;
        }
    }

    public static long VB(android.content.Context context) {
        int i = -1;
        try {
            i = context.getApplicationInfo().minSdkVersion;
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.Integer.valueOf(i);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", th.getMessage());
        }
        return i;
    }

    public static void Kg(final java.lang.String str) {
        com.bytedance.sdk.openadsdk.yDt.bX.bg();
        com.bytedance.sdk.openadsdk.yDt.bX.bg("reportMultiLog", false, new com.bytedance.sdk.openadsdk.yDt.IL() { // from class: com.bytedance.sdk.openadsdk.utils.ayS.2
            @Override // com.bytedance.sdk.openadsdk.yDt.IL
            public com.bytedance.sdk.openadsdk.yDt.bg.bX getLogStats() throws java.lang.Exception {
                if (com.bytedance.sdk.openadsdk.utils.ayS.bX || !com.bytedance.sdk.openadsdk.core.VzQ.eqN().ApA()) {
                    return null;
                }
                boolean unused = com.bytedance.sdk.openadsdk.utils.ayS.bX = true;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("error", str);
                return com.bytedance.sdk.openadsdk.yDt.bg.eqN.IL().bg("reportMultiLog").IL(jSONObject.toString());
            }
        });
    }

    public static boolean WR(java.lang.String str) {
        if (com.bytedance.sdk.openadsdk.core.yDt.zx()) {
            return true;
        }
        com.bytedance.sdk.component.utils.PX.IL("You must use method '" + str + "' after initialization, please check.");
        return false;
    }

    public static void eo(java.lang.String str) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.PX.IL("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
    }

    public static int PX(android.content.Context context) {
        return iR(com.bytedance.sdk.component.utils.rri.bg(context, 0L));
    }

    public static boolean tuV() {
        return eqN.get() == 1;
    }

    public static void Ta(android.content.Context context) {
        try {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = eqN;
            if (atomicInteger.get() != 0) {
                return;
            }
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.yDt.bX.bg().bX();
            } else {
                atomicInteger.set(2);
            }
        } catch (java.lang.Exception unused) {
            eqN.set(2);
        }
    }

    public static boolean Kg(int i) {
        if (i <= 0) {
            return false;
        }
        return i >= 100 || new java.util.Random(java.lang.System.currentTimeMillis()).nextInt(100) + 1 <= i;
    }

    public static void bg(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        int iIndexOf;
        if (sb == null || android.text.TextUtils.isEmpty(str) || (iIndexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static int yDt(android.content.Context context) {
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities;
        java.lang.Integer num = bg;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(listQueryIntentActivities.size());
        bg = numValueOf;
        return numValueOf.intValue();
    }

    public static com.bytedance.sdk.openadsdk.common.eqN bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.component.WR.eqN eqn, android.content.Context context, java.lang.String str) {
        int iTxA = tuv.txA();
        if (tuv == null || !tuv.RJ() || (iTxA != 1 && iTxA != 3)) {
            return null;
        }
        eqn.bg(true, (android.view.View) new com.bytedance.sdk.openadsdk.common.bX(context));
        return new com.bytedance.sdk.openadsdk.common.eqN(tuv, eqn, str, false);
    }

    public static void bg(org.json.JSONObject jSONObject) {
        int iIntValue;
        try {
            android.util.Pair<java.lang.String, java.lang.Long> pairEqN = com.bytedance.sdk.openadsdk.core.WR.eqN("oem_store");
            int i = -1;
            if (pairEqN != null && ((iIntValue = java.lang.Integer.valueOf((java.lang.String) pairEqN.first).intValue()) != -2 || java.lang.System.currentTimeMillis() - ((java.lang.Long) pairEqN.second).longValue() < com.bytedance.sdk.openadsdk.Fy.bg.bg("oem_store_state_time", 259200000))) {
                i = iIntValue;
            }
            jSONObject.put("oem_store", i);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", th.getMessage());
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.component.WR.eqN eqn) {
        com.bytedance.sdk.openadsdk.core.model.zx zxVarEo;
        if (tuv == null || eqn == null) {
            return;
        }
        int iTxA = tuv.txA();
        if (tuv.RJ()) {
            if ((iTxA == 2 || iTxA == 3 || iTxA == 5) && (zxVarEo = tuv.eo()) != null) {
                eqn.bg(true, zxVarEo.eqN(), zxVarEo.zx(), zxVarEo.ldr(), zxVarEo.iR(), zxVarEo.bX());
            }
        }
    }

    public static boolean eqN(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return tuv != null && tuv.jz() == 3 && tuv.RJ() && (tuv.txA() == 4 || tuv.txA() == 5);
    }

    public static java.lang.String Fy() {
        java.lang.String str = yDt;
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.String str2 = new java.lang.String(PX);
        yDt = str2;
        return str2;
    }

    public static java.lang.String LZ() {
        java.lang.String str = Lq;
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.String str2 = new java.lang.String(Ta);
        Lq = str2;
        return str2;
    }

    public static int bg(android.webkit.WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            android.webkit.WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < size; i++) {
                android.webkit.WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i);
                if (itemAtIndex != null) {
                    java.lang.String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }

    public static org.json.JSONObject bg(com.bytedance.sdk.openadsdk.AdSlot adSlot) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", android.text.TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (java.lang.Throwable unused) {
            }
        }
        return jSONObject;
    }
}
