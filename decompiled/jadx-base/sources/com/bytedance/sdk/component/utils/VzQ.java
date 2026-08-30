package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class VzQ {
    private static java.lang.String bg;

    public static boolean bg(android.content.Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return android.text.TextUtils.equals(context.getApplicationContext().getPackageName(), IL(context));
    }

    public static java.lang.String IL(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(bg)) {
            return bg;
        }
        java.lang.String strBg = bg();
        bg = strBg;
        if (!android.text.TextUtils.isEmpty(strBg)) {
            return bg;
        }
        java.lang.String strIL = IL();
        bg = strIL;
        if (!android.text.TextUtils.isEmpty(strIL)) {
            return bg;
        }
        java.lang.String strBX = bX(context);
        bg = strBX;
        return strBX;
    }

    private static java.lang.String bg() {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return android.app.Application.getProcessName();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static java.lang.String IL() {
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.app.ActivityThread", false, android.app.Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.Object objInvoke = declaredMethod.invoke(null, new java.lang.Object[0]);
            if (objInvoke instanceof java.lang.String) {
                return (java.lang.String) objInvoke;
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.String bX(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int iMyPid = android.os.Process.myPid();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }
}
