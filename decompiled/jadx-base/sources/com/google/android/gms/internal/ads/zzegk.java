package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzegk extends com.google.android.gms.internal.ads.zzegf {
    private final com.google.android.gms.internal.ads.zzcgx zza;
    private final com.google.android.gms.internal.ads.zzcva zzb;
    private final com.google.android.gms.internal.ads.zzeiw zzc;
    private final com.google.android.gms.internal.ads.zzdbm zzd;
    private final com.google.android.gms.internal.ads.zzegq zze;
    private final com.google.android.gms.internal.ads.zzedb zzf;

    public zzegk(com.google.android.gms.internal.ads.zzcgx zzcgxVar, com.google.android.gms.internal.ads.zzcva zzcvaVar, com.google.android.gms.internal.ads.zzeiw zzeiwVar, com.google.android.gms.internal.ads.zzdbm zzdbmVar, com.google.android.gms.internal.ads.zzegq zzegqVar, com.google.android.gms.internal.ads.zzedb zzedbVar) {
        this.zza = zzcgxVar;
        this.zzb = zzcvaVar;
        this.zzc = zzeiwVar;
        this.zzd = zzdbmVar;
        this.zze = zzegqVar;
        this.zzf = zzedbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegf
    protected final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfcj zzfcjVar, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfca zzfcaVar) {
        com.google.android.gms.internal.ads.zzcva zzcvaVar = this.zzb;
        zzcvaVar.zzk(zzfcjVar);
        zzcvaVar.zzg(bundle);
        zzcvaVar.zzh(new com.google.android.gms.internal.ads.zzcut(zzfcaVar, zzfboVar, this.zze));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zzf);
        }
        com.google.android.gms.internal.ads.zzcgx zzcgxVar = this.zza;
        com.google.android.gms.internal.ads.zzcva zzcvaVar2 = this.zzb;
        com.google.android.gms.internal.ads.zzdft zzdftVarZzg = zzcgxVar.zzg();
        zzdftVarZzg.zze(zzcvaVar2.zzl());
        zzdftVarZzg.zzd(this.zzd);
        zzdftVarZzg.zzc(this.zzc);
        com.google.android.gms.internal.ads.zzcsd zzcsdVarZza = zzdftVarZzg.zzf().zza();
        return zzcsdVarZza.zzh(zzcsdVarZza.zzi());
    }
}
