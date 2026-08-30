package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzlg {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    /* synthetic */ zzlg(com.google.android.gms.internal.measurement.zzlf zzlfVar) {
    }

    public static int zzb(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzc(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }
}
