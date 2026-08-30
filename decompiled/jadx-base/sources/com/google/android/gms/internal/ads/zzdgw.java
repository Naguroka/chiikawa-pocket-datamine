package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdgw implements com.google.android.gms.internal.ads.zzher {
    private final com.google.android.gms.internal.ads.zzhfj zza;
    private final com.google.android.gms.internal.ads.zzhfj zzb;
    private final com.google.android.gms.internal.ads.zzhfj zzc;
    private final com.google.android.gms.internal.ads.zzhfj zzd;
    private final com.google.android.gms.internal.ads.zzhfj zze;
    private final com.google.android.gms.internal.ads.zzhfj zzf;

    public zzdgw(com.google.android.gms.internal.ads.zzhfj zzhfjVar, com.google.android.gms.internal.ads.zzhfj zzhfjVar2, com.google.android.gms.internal.ads.zzhfj zzhfjVar3, com.google.android.gms.internal.ads.zzhfj zzhfjVar4, com.google.android.gms.internal.ads.zzhfj zzhfjVar5, com.google.android.gms.internal.ads.zzhfj zzhfjVar6) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
        this.zze = zzhfjVar5;
        this.zzf = zzhfjVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzcgx zzcgxVar = (com.google.android.gms.internal.ads.zzcgx) this.zza.zzb();
        com.google.android.gms.internal.ads.zzcva zzcvaVarZza = ((com.google.android.gms.internal.ads.zzcvl) this.zzb).zza();
        com.google.android.gms.internal.ads.zzdbm zzdbmVarZza = ((com.google.android.gms.internal.ads.zzdcg) this.zzc).zza();
        com.google.android.gms.internal.ads.zzdgl zzdglVarZza = ((com.google.android.gms.internal.ads.zzdgn) this.zzd).zza();
        com.google.android.gms.internal.ads.zzcyl zzcylVarZzb = ((com.google.android.gms.internal.ads.zzcol) this.zze).zzb();
        com.google.android.gms.internal.ads.zzegq zzegqVar = (com.google.android.gms.internal.ads.zzegq) this.zzf.zzb();
        com.google.android.gms.internal.ads.zzcpp zzcppVarZze = zzcgxVar.zze();
        zzcppVarZze.zzi(zzcvaVarZza.zzl());
        zzcppVarZze.zzf(zzdbmVarZza);
        zzcppVarZze.zzd(zzdglVarZza);
        zzcppVarZze.zze(new com.google.android.gms.internal.ads.zzeiw(null));
        zzcppVarZze.zzg(new com.google.android.gms.internal.ads.zzcqr(zzcylVarZzb, null));
        zzcppVarZze.zzc(new com.google.android.gms.internal.ads.zzcoj(null));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdK)).booleanValue()) {
            zzcppVarZze.zzj(com.google.android.gms.internal.ads.zzegz.zzb(zzegqVar));
        }
        com.google.android.gms.internal.ads.zzcrc zzcrcVarZzc = zzcppVarZze.zzh().zzc();
        com.google.android.gms.internal.ads.zzhez.zzb(zzcrcVarZzc);
        return zzcrcVarZzc;
    }
}
