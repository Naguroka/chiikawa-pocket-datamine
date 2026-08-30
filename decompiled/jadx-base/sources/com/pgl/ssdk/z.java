package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f3819a = -1;
    private static int b = -1;

    public static android.app.Application a() {
        try {
            return (android.app.Application) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.String b() {
        java.lang.String path;
        try {
            path = android.os.Environment.getDataDirectory().getPath();
        } catch (java.lang.Throwable unused) {
            path = null;
        }
        return path == null ? "" : path.trim();
    }

    public static java.lang.String c() {
        java.lang.String absolutePath;
        try {
            absolutePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        } catch (java.lang.Throwable unused) {
            absolutePath = null;
        }
        return absolutePath == null ? "" : absolutePath.trim();
    }

    public static java.lang.String d(android.content.Context context) {
        java.lang.String absolutePath;
        try {
            absolutePath = context.getFilesDir().getAbsolutePath();
        } catch (java.lang.Throwable unused) {
            absolutePath = null;
        }
        return absolutePath == null ? "" : absolutePath.trim();
    }

    public static java.lang.String e(android.content.Context context) {
        java.lang.String packageName;
        try {
            packageName = context.getPackageName();
        } catch (java.lang.Throwable unused) {
            packageName = null;
        }
        return packageName == null ? "" : packageName.trim();
    }

    public static java.lang.String f(android.content.Context context) {
        java.lang.String packageResourcePath;
        try {
            packageResourcePath = context.getPackageResourcePath();
        } catch (java.lang.Throwable unused) {
            packageResourcePath = null;
        }
        return packageResourcePath == null ? "" : packageResourcePath.trim();
    }

    public static int g(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public static boolean h(android.content.Context context) {
        android.content.pm.ResolveInfo resolveInfo;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(context.getPackageName());
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty() || (resolveInfo = listQueryIntentActivities.get(0)) == null) {
                return false;
            }
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new android.content.ComponentName(activityInfo.packageName, activityInfo.name));
            return componentEnabledSetting == 0 || componentEnabledSetting == 1;
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    private static void i(android.content.Context context) {
        java.lang.String strA = com.pgl.ssdk.u0.a(context, "hac_date", (java.lang.String) null);
        if (!android.text.TextUtils.isEmpty(strA)) {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
            if (strA.equals(simpleDateFormat.format(new java.util.Date()))) {
                int iA = com.pgl.ssdk.u0.a(context, "hac", -1);
                int iA2 = com.pgl.ssdk.u0.a(context, "tac", -1);
                if (iA != -1 && iA2 != -1) {
                    f3819a = iA;
                    b = iA2;
                    return;
                }
            }
        }
        f3819a = 0;
        b = 0;
    }

    private static void j(android.content.Context context) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        com.pgl.ssdk.u0.b(context, "hac_date", simpleDateFormat.format(new java.util.Date()));
        com.pgl.ssdk.u0.b(context, "hac", f3819a);
        com.pgl.ssdk.u0.b(context, "tac", b);
    }

    private static boolean a(android.content.Context context) {
        java.util.List<android.app.ActivityManager.AppTask> appTasks;
        if (context != null && (appTasks = ((android.app.ActivityManager) context.getSystemService("activity")).getAppTasks()) != null && !appTasks.isEmpty()) {
            for (android.app.ActivityManager.AppTask appTask : appTasks) {
                if (appTask.getTaskInfo() != null && a(appTask.getTaskInfo().baseIntent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void b(android.content.Context context) {
        try {
            if (f3819a == -1 || b == -1) {
                i(context);
            }
            if (a(context)) {
                f3819a++;
            }
            b++;
            if (f3819a != 0) {
                j(context);
                com.pgl.ssdk.ces.a.meta(org.objectweb.asm.Opcodes.IF_ICMPNE, null, new int[]{f3819a, b});
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static java.lang.String c(android.content.Context context) {
        java.lang.String str;
        try {
            str = context.getApplicationInfo().sourceDir;
        } catch (java.lang.Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    private static boolean a(android.content.Intent intent) {
        return (intent == null || (intent.getFlags() & 8388608) == 0) ? false : true;
    }
}
