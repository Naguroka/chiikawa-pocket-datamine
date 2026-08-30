package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbcn {
    public static java.lang.Object zza(com.google.android.gms.internal.ads.zzfvf zzfvfVar) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        try {
            android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzfvfVar.zza();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
