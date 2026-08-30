package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzevd implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;

    public zzevd(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4, com.google.android.gms.internal.ads.zzhfj zzhfjVar5) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar3;
        this.zzc = zzhfjVar4;
    }

    public static com.google.android.gms.internal.ads.zzevb zza(java.lang.String str, com.google.android.gms.internal.ads.zzbam zzbamVar, com.google.android.gms.internal.ads.zzbzm zzbzmVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        return new com.google.android.gms.internal.ads.zzevb(str, zzbamVar, zzbzmVar, scheduledExecutorService, zzgcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return new com.google.android.gms.internal.ads.zzevb(((com.google.android.gms.internal.ads.zzevy) this.zza).zza(), com.google.android.gms.internal.ads.zzckl.zza(), (com.google.android.gms.internal.ads.zzbzm) this.zzb.zzb(), (java.util.concurrent.ScheduledExecutorService) this.zzc.zzb(), com.google.android.gms.internal.ads.zzffh.zzc());
    }
}
