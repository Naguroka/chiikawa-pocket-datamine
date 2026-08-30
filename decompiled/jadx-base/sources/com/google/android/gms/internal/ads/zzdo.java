package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdo {
    private static final java.lang.Object zza = new java.lang.Object();

    @org.checkerframework.dataflow.qual.Pure
    public static void zzb(java.lang.String str, java.lang.String str2) {
        synchronized (zza) {
            android.util.Log.d(str, zza(str2, null));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzc(java.lang.String str, java.lang.String str2) {
        synchronized (zza) {
            android.util.Log.e(str, zza(str2, null));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzd(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (zza) {
            android.util.Log.e(str, zza(str2, th));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zze(java.lang.String str, java.lang.String str2) {
        synchronized (zza) {
            android.util.Log.i(str, zza(str2, null));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzf(java.lang.String str, java.lang.String str2) {
        synchronized (zza) {
            android.util.Log.w(str, zza(str2, null));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void zzg(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (zza) {
            android.util.Log.w(str, zza(str2, th));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String zza(java.lang.String str, java.lang.Throwable th) {
        java.lang.String strReplace;
        if (th != null) {
            synchronized (zza) {
                java.lang.Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    if (cause instanceof java.net.UnknownHostException) {
                        strReplace = "UnknownHostException (no network)";
                        break;
                    }
                    cause = cause.getCause();
                }
            }
        } else {
            strReplace = null;
        }
        if (android.text.TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + "\n";
    }
}
