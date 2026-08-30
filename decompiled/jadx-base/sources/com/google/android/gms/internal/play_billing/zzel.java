package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzel {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    /* synthetic */ zzel(com.google.android.gms.internal.play_billing.zzek zzekVar) {
    }

    public static int zzb(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzc(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }
}
