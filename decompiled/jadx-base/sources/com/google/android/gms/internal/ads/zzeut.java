package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeut implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;
    private final com.google.android.gms.internal.ads.zzhfj zzd;
    private final com.google.android.gms.internal.ads.zzhfj zze;

    public zzeut(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4, com.google.android.gms.internal.ads.zzhfj zzhfjVar5, com.google.android.gms.internal.ads.zzhfj zzhfjVar6, com.google.android.gms.internal.ads.zzhfj zzhfjVar7) {
        this.zza = zzhfjVar2;
        this.zzb = zzhfjVar3;
        this.zzc = zzhfjVar5;
        this.zzd = zzhfjVar6;
        this.zze = zzhfjVar7;
    }

    public static com.google.android.gms.internal.ads.zzeur zza(com.google.android.gms.internal.ads.zzbzd zzbzdVar, android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, int i, boolean z, boolean z2) {
        return new com.google.android.gms.internal.ads.zzeur(zzbzdVar, context, scheduledExecutorService, executor, i, z, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return new com.google.android.gms.internal.ads.zzeur(com.google.android.gms.internal.ads.zzckt.zza(), ((com.google.android.gms.internal.ads.zzche) this.zza).zza(), (java.util.concurrent.ScheduledExecutorService) this.zzb.zzb(), com.google.android.gms.internal.ads.zzffh.zzc(), ((com.google.android.gms.internal.ads.zzevz) this.zzc).zzb().intValue(), ((com.google.android.gms.internal.ads.zzewa) this.zzd).zzb().booleanValue(), ((com.google.android.gms.internal.ads.zzewc) this.zze).zzb().booleanValue());
    }
}
