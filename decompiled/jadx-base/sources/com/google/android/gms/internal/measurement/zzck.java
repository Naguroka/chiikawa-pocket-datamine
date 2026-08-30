package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzck {
    private static final java.lang.reflect.Method zza;
    private static final java.lang.reflect.Method zzb;

    static {
        java.lang.reflect.Method declaredMethod;
        java.lang.reflect.Method declaredMethod2 = null;
        try {
            declaredMethod = android.app.job.JobScheduler.class.getDeclaredMethod("scheduleAsPackage", android.app.job.JobInfo.class, java.lang.String.class, java.lang.Integer.TYPE, java.lang.String.class);
        } catch (java.lang.NoSuchMethodException unused) {
            if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                android.util.Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            declaredMethod = null;
        }
        zza = declaredMethod;
        try {
            declaredMethod2 = android.os.UserHandle.class.getDeclaredMethod("myUserId", new java.lang.Class[0]);
        } catch (java.lang.NoSuchMethodException unused2) {
            if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                android.util.Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        zzb = declaredMethod2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    public static int zza(android.content.Context context, android.app.job.JobInfo jobInfo, java.lang.String str, java.lang.String str2) {
        int iIntValue;
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) com.google.common.base.Preconditions.checkNotNull((android.app.job.JobScheduler) context.getSystemService("jobscheduler"));
        if (zza == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        java.lang.reflect.Method method = zzb;
        if (method != null) {
            try {
                java.lang.Integer num = (java.lang.Integer) method.invoke(android.os.UserHandle.class, new java.lang.Object[0]);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
                if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                    android.util.Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        } else {
            iIntValue = 0;
        }
        java.lang.reflect.Method method2 = zza;
        if (method2 != null) {
            try {
                java.lang.Integer num2 = (java.lang.Integer) method2.invoke(jobScheduler, jobInfo, "com.google.android.gms", java.lang.Integer.valueOf(iIntValue), "UploadAlarm");
                if (num2 != null) {
                    return num2.intValue();
                }
                return 0;
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
                android.util.Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
            }
        }
        return jobScheduler.schedule(jobInfo);
    }
}
