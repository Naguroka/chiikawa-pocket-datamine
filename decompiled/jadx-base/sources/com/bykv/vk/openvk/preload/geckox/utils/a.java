package com.bykv.vk.openvk.preload.geckox.utils;

/* JADX INFO: compiled from: AppUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f1753a;

    public static java.lang.String a(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (java.lang.Exception e) {
            com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("gecko-debug-tag", "getVersion:", e);
            return "null";
        }
    }

    public static java.lang.String b(android.content.Context context) {
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            return applicationInfo == null ? "" : applicationInfo.loadLabel(packageManager).toString();
        } catch (java.lang.Throwable th) {
            com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("gecko-debug-tag", "getApplicationName:", th);
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    public static java.lang.String c(android.content.Context context) {
        java.lang.String str;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (!android.text.TextUtils.isEmpty(f1753a)) {
            return f1753a;
        }
        java.lang.String strA = a();
        f1753a = strA;
        if (!android.text.TextUtils.isEmpty(strA)) {
            return f1753a;
        }
        java.lang.String strB = b();
        f1753a = strB;
        if (!android.text.TextUtils.isEmpty(strB)) {
            return f1753a;
        }
        if (context != null) {
            int iMyPid = android.os.Process.myPid();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                str = null;
            } else {
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        str = runningAppProcessInfo.processName;
                    }
                }
                str = null;
            }
        } else {
            str = null;
        }
        f1753a = str;
        return str;
    }

    private static java.lang.String a() {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return android.app.Application.getProcessName();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static java.lang.String b() {
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.app.ActivityThread", false, android.app.Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.Object objInvoke = declaredMethod.invoke(null, new java.lang.Object[0]);
            if (objInvoke instanceof java.lang.String) {
                return (java.lang.String) objInvoke;
            }
            return null;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void a(java.lang.Throwable th) {
        com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger.w("gecko-debug-tag", "throwIfDebug:", th);
    }
}
