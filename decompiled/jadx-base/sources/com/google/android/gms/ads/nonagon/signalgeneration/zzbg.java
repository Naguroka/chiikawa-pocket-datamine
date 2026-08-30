package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbg implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;
    private final com.google.android.gms.internal.ads.zzhfj zzd;
    private final com.google.android.gms.internal.ads.zzhfj zze;
    private final com.google.android.gms.internal.ads.zzhfj zzf;
    private final com.google.android.gms.internal.ads.zzhfj zzg;
    private final com.google.android.gms.internal.ads.zzhfj zzh;
    private final com.google.android.gms.internal.ads.zzhfj zzi;

    public zzbg(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4, com.google.android.gms.internal.ads.zzhfj zzhfjVar5, com.google.android.gms.internal.ads.zzhfj zzhfjVar6, com.google.android.gms.internal.ads.zzhfj zzhfjVar7, com.google.android.gms.internal.ads.zzhfj zzhfjVar8, com.google.android.gms.internal.ads.zzhfj zzhfjVar9) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
        this.zze = zzhfjVar5;
        this.zzf = zzhfjVar6;
        this.zzg = zzhfjVar7;
        this.zzh = zzhfjVar8;
        this.zzi = zzhfjVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.common.util.concurrent.ListenableFuture listenableFutureZza;
        com.google.android.gms.ads.nonagon.signalgeneration.zzau zzauVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzau) this.zza.zzb();
        com.google.android.gms.internal.ads.zzfgn zzfgnVar = (com.google.android.gms.internal.ads.zzfgn) this.zzb.zzb();
        com.google.android.gms.ads.nonagon.signalgeneration.zzbi zzbiVarZzb = ((com.google.android.gms.ads.nonagon.signalgeneration.zzbj) this.zzc).zzb();
        com.google.android.gms.internal.ads.zzcuw zzcuwVarZzb = ((com.google.android.gms.internal.ads.zzcux) this.zzd).zzb();
        com.google.android.gms.internal.ads.zzdeh zzdehVar = (com.google.android.gms.internal.ads.zzdeh) this.zze.zzb();
        com.google.android.gms.ads.nonagon.signalgeneration.zzb zzbVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzb) this.zzf.zzb();
        com.google.android.gms.internal.ads.zzbyy zzbyyVar = (com.google.android.gms.internal.ads.zzbyy) this.zzg.zzb();
        int iIntValue = ((java.lang.Integer) this.zzh.zzb()).intValue();
        android.os.Bundle bundle = ((com.google.android.gms.internal.ads.zzcvk) this.zzi).zza().zzs;
        com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVarZza = null;
        if (iIntValue == 1 && zzbyyVar != null) {
            bundle.putLong(com.google.android.gms.internal.ads.zzdre.READ_FROM_DISK_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
            zzbkVarZza = zzbVar.zza(zzbyyVar, zzauVar, bundle);
            bundle.putLong(com.google.android.gms.internal.ads.zzdre.READ_FROM_DISK_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        if (zzbkVarZza != null) {
            zzdehVar.zza(zzbkVarZza);
            listenableFutureZza = com.google.android.gms.internal.ads.zzgch.zzh(zzbkVarZza);
        } else {
            listenableFutureZza = zzfgnVar.zzb(com.google.android.gms.internal.ads.zzfgh.GENERATE_SIGNALS, zzcuwVarZzb.zzc()).zzf(zzbiVarZzb).zzi(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfy)).intValue(), java.util.concurrent.TimeUnit.SECONDS).zza();
            com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZza, new com.google.android.gms.ads.nonagon.signalgeneration.zzaw(zzdehVar), com.google.android.gms.internal.ads.zzbzw.zza);
        }
        com.google.android.gms.internal.ads.zzhez.zzb(listenableFutureZza);
        return listenableFutureZza;
    }
}
