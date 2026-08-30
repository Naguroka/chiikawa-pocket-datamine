package com.google.android.gms.internal.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzh {
    private static final com.google.android.gms.internal.stats.zze zza;
    private static volatile com.google.android.gms.internal.stats.zze zzb;

    static {
        com.google.android.gms.internal.stats.zzg zzgVar = new com.google.android.gms.internal.stats.zzg(null);
        zza = zzgVar;
        zzb = zzgVar;
    }

    public static com.google.android.gms.internal.stats.zze zza() {
        return zzb;
    }
}
