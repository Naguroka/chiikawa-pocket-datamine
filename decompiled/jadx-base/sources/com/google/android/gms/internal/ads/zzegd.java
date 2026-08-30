package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzegd extends com.google.android.gms.internal.ads.zzegf {
    private final com.google.android.gms.internal.ads.zzcgx zza;
    private final com.google.android.gms.internal.ads.zzdgl zzb;
    private final com.google.android.gms.internal.ads.zzcva zzc;
    private final com.google.android.gms.internal.ads.zzdbm zzd;
    private final com.google.android.gms.internal.ads.zzegq zze;
    private final com.google.android.gms.internal.ads.zzedb zzf;

    public zzegd(com.google.android.gms.internal.ads.zzcgx zzcgxVar, com.google.android.gms.internal.ads.zzdgl zzdglVar, com.google.android.gms.internal.ads.zzcva zzcvaVar, com.google.android.gms.internal.ads.zzdbm zzdbmVar, com.google.android.gms.internal.ads.zzegq zzegqVar, com.google.android.gms.internal.ads.zzedb zzedbVar) {
        this.zza = zzcgxVar;
        this.zzb = zzdglVar;
        this.zzc = zzcvaVar;
        this.zzd = zzdbmVar;
        this.zze = zzegqVar;
        this.zzf = zzedbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegf
    protected final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfcj zzfcjVar, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        com.google.android.gms.internal.ads.zzcva zzcvaVar = this.zzc;
        zzcvaVar.zzk(zzfcjVar);
        zzcvaVar.zzg(bundle);
        zzcvaVar.zzh(new com.google.android.gms.internal.ads.zzcut(zzfcaVar, zzfboVar, this.zze));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdH)).booleanValue()) {
            this.zzc.zze(this.zzf);
        }
        com.google.android.gms.internal.ads.zzcgx zzcgxVar = this.zza;
        com.google.android.gms.internal.ads.zzcva zzcvaVar2 = this.zzc;
        com.google.android.gms.internal.ads.zzdgp zzdgpVarZzh = zzcgxVar.zzh();
        zzdgpVarZzh.zzf(zzcvaVar2.zzl());
        zzdgpVarZzh.zze(this.zzd);
        zzdgpVarZzh.zzd(this.zzb);
        zzdgpVarZzh.zzc(new com.google.android.gms.internal.ads.zzcoj(null));
        com.google.android.gms.internal.ads.zzcsd zzcsdVarZza = zzdgpVarZzh.zzg().zza();
        return zzcsdVarZza.zzh(zzcsdVarZza.zzi());
    }
}
