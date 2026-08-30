package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdxa implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;

    public zzdxa(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4, com.google.android.gms.internal.ads.zzhfj zzhfjVar5) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar4;
        this.zzc = zzhfjVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzdwz zzb() {
        return new com.google.android.gms.internal.ads.zzdwz((java.util.concurrent.ScheduledExecutorService) this.zza.zzb(), com.google.android.gms.internal.ads.zzffh.zzc(), com.google.android.gms.internal.ads.zzffn.zzc(), ((com.google.android.gms.internal.ads.zzdxv) this.zzb).zzb(), com.google.android.gms.internal.ads.zzheq.zza(com.google.android.gms.internal.ads.zzhfc.zza(this.zzc)));
    }
}
