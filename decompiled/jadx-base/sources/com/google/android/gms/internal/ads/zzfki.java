package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfki {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final com.google.android.gms.ads.internal.ClientApi zzd = new com.google.android.gms.ads.internal.ClientApi();
    private com.google.android.gms.internal.ads.zzbpe zze;
    private final com.google.android.gms.common.util.Clock zzf;

    zzfki(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.Clock clock) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzf = clock;
    }

    private static com.google.android.gms.internal.ads.zzfjg zzc() {
        return new com.google.android.gms.internal.ads.zzfjg(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzw)).longValue(), 2.0d, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzx)).longValue(), 0.2d);
    }

    public final com.google.android.gms.internal.ads.zzfkh zza(com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            return new com.google.android.gms.internal.ads.zzfji(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzftVar, zzcfVar, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal == 2) {
            return new com.google.android.gms.internal.ads.zzfkl(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzftVar, zzcfVar, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzfjf(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzftVar, zzcfVar, this.zzc, zzc(), this.zzf);
    }

    public final void zzb(com.google.android.gms.internal.ads.zzbpe zzbpeVar) {
        this.zze = zzbpeVar;
    }
}
