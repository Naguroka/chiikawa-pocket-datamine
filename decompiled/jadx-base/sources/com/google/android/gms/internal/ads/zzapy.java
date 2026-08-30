package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzapy {
    public static final java.lang.String zza = "Volley";
    public static final boolean zzb = android.util.Log.isLoggable("Volley", 2);
    private static final java.lang.String zzc = com.google.android.gms.internal.ads.zzapy.class.getName();

    public static void zza(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.d(zza, zze(str, objArr));
    }

    public static void zzb(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.e(zza, zze(str, objArr));
    }

    public static void zzc(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.e(zza, zze(str, objArr), th);
    }

    public static void zzd(java.lang.String str, java.lang.Object... objArr) {
        if (zzb) {
            android.util.Log.v(zza, zze(str, objArr));
        }
    }

    private static java.lang.String zze(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2;
        java.lang.String str3 = java.lang.String.format(java.util.Locale.US, str, objArr);
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(zzc)) {
                java.lang.String className = stackTrace[i].getClassName();
                java.lang.String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                return java.lang.String.format(java.util.Locale.US, "[%d] %s: %s", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), str2, str3);
            }
        }
        str2 = "<unknown>";
        return java.lang.String.format(java.util.Locale.US, "[%d] %s: %s", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), str2, str3);
    }
}
