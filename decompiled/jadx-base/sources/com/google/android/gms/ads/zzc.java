package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc {
    public static int zza(com.google.android.gms.ads.AdSize adSize) {
        return adSize.zzb();
    }

    public static int zzb(com.google.android.gms.ads.AdSize adSize) {
        return adSize.zza();
    }

    public static com.google.android.gms.ads.AdSize zzc(int i, int i2, java.lang.String str) {
        return new com.google.android.gms.ads.AdSize(i, i2, str);
    }

    public static com.google.android.gms.ads.AdSize zzd(int i, int i2) {
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, i2);
        adSize.zze(true);
        adSize.zzc(i2);
        return adSize;
    }

    public static com.google.android.gms.ads.AdSize zze(int i, int i2) {
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, i2);
        adSize.zzf(true);
        adSize.zzd(i2);
        return adSize;
    }

    public static boolean zzf(com.google.android.gms.ads.AdSize adSize) {
        return adSize.zzg();
    }

    public static boolean zzg(com.google.android.gms.ads.AdSize adSize) {
        return adSize.zzh();
    }

    public static boolean zzh(com.google.android.gms.ads.AdSize adSize) {
        return adSize.zzi();
    }
}
