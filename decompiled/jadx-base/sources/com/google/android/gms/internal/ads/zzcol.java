package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcol implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;

    public zzcol(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    public static com.google.android.gms.internal.ads.zzcyl zzc(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.Clock clock) {
        return new com.google.android.gms.internal.ads.zzcyl(scheduledExecutorService, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzcyl zzb() {
        return zzc((java.util.concurrent.ScheduledExecutorService) this.zza.zzb(), (com.google.android.gms.common.util.Clock) this.zzb.zzb());
    }
}
