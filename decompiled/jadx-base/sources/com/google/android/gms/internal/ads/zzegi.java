package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzegi extends com.google.android.gms.internal.ads.zzegf {
    private final com.google.android.gms.internal.ads.zzcgx zza;
    private final com.google.android.gms.internal.ads.zzcva zzb;
    private final com.google.android.gms.internal.ads.zzeiw zzc;
    private final com.google.android.gms.internal.ads.zzdbm zzd;
    private final com.google.android.gms.internal.ads.zzdgl zze;
    private final com.google.android.gms.internal.ads.zzcyl zzf;
    private final android.view.ViewGroup zzg;
    private final com.google.android.gms.internal.ads.zzdar zzh;
    private final com.google.android.gms.internal.ads.zzegq zzi;
    private final com.google.android.gms.internal.ads.zzedb zzj;

    public zzegi(com.google.android.gms.internal.ads.zzcgx zzcgxVar, com.google.android.gms.internal.ads.zzcva zzcvaVar, com.google.android.gms.internal.ads.zzeiw zzeiwVar, com.google.android.gms.internal.ads.zzdbm zzdbmVar, com.google.android.gms.internal.ads.zzdgl zzdglVar, com.google.android.gms.internal.ads.zzcyl zzcylVar, android.view.ViewGroup viewGroup, com.google.android.gms.internal.ads.zzdar zzdarVar, com.google.android.gms.internal.ads.zzegq zzegqVar, com.google.android.gms.internal.ads.zzedb zzedbVar) {
        this.zza = zzcgxVar;
        this.zzb = zzcvaVar;
        this.zzc = zzeiwVar;
        this.zzd = zzdbmVar;
        this.zze = zzdglVar;
        this.zzf = zzcylVar;
        this.zzg = viewGroup;
        this.zzh = zzdarVar;
        this.zzi = zzegqVar;
        this.zzj = zzedbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegf
    protected final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfcj zzfcjVar, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        com.google.android.gms.internal.ads.zzcva zzcvaVar = this.zzb;
        zzcvaVar.zzk(zzfcjVar);
        zzcvaVar.zzg(bundle);
        zzcvaVar.zzh(new com.google.android.gms.internal.ads.zzcut(zzfcaVar, zzfboVar, this.zzi));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zzj);
        }
        com.google.android.gms.internal.ads.zzcgx zzcgxVar = this.zza;
        com.google.android.gms.internal.ads.zzcva zzcvaVar2 = this.zzb;
        com.google.android.gms.internal.ads.zzcpp zzcppVarZze = zzcgxVar.zze();
        zzcppVarZze.zzi(zzcvaVar2.zzl());
        zzcppVarZze.zzf(this.zzd);
        zzcppVarZze.zze(this.zzc);
        zzcppVarZze.zzd(this.zze);
        zzcppVarZze.zzg(new com.google.android.gms.internal.ads.zzcqr(this.zzf, this.zzh));
        zzcppVarZze.zzc(new com.google.android.gms.internal.ads.zzcoj(this.zzg));
        com.google.android.gms.internal.ads.zzcsd zzcsdVarZzd = zzcppVarZze.zzk().zzd();
        return zzcsdVarZzd.zzh(zzcsdVarZzd.zzi());
    }
}
