package com.facebook.ads.internal.util.process;

/* JADX INFO: loaded from: classes4.dex */
public final class ProcessUtils {
    private static java.lang.String sProcessName;
    private static final java.util.concurrent.atomic.AtomicBoolean sRemoteRenderingProcess = new java.util.concurrent.atomic.AtomicBoolean();

    private ProcessUtils() {
    }

    public static void setRemoteRenderingProcess(boolean z) {
        sRemoteRenderingProcess.set(z);
    }

    public static boolean isRemoteRenderingProcess() {
        return sRemoteRenderingProcess.get();
    }

    public static java.lang.String getProcessName(android.content.Context context) {
        synchronized (com.facebook.ads.internal.util.process.ProcessUtils.class) {
            java.lang.String str = sProcessName;
            if (str != null) {
                return str;
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return getProcessNameAPI28();
            }
            android.content.Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof android.app.Application)) {
                return null;
            }
            java.lang.String processNameViaReflection = getProcessNameViaReflection((android.app.Application) applicationContext);
            synchronized (com.facebook.ads.internal.util.process.ProcessUtils.class) {
                sProcessName = processNameViaReflection;
            }
            return processNameViaReflection;
        }
    }

    private static java.lang.String getProcessNameAPI28() {
        try {
            return (java.lang.String) android.app.Application.class.getMethod("getProcessName", null).invoke(null, null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static java.lang.String getProcessNameViaReflection(android.app.Application application) {
        try {
            java.lang.reflect.Field field = application.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            java.lang.Object obj = field.get(application);
            java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            java.lang.Object obj2 = declaredField.get(obj);
            return (java.lang.String) obj2.getClass().getDeclaredMethod("getProcessName", null).invoke(obj2, null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String getProcessSpecificName(java.lang.String str, android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        java.lang.String processName = getProcessName(context);
        if (android.text.TextUtils.isEmpty(processName) || packageName.equals(processName)) {
            return str;
        }
        if (processName.contains(":")) {
            processName = processName.split(":")[1];
        }
        return str + "_" + processName;
    }
}
