package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzezr implements com.google.android.gms.internal.ads.zzeld {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcgx zzc;
    private final com.google.android.gms.internal.ads.zzekn zzd;
    private final com.google.android.gms.internal.ads.zzfar zze;
    private com.google.android.gms.internal.ads.zzbdg zzf;
    private final com.google.android.gms.internal.ads.zzfhk zzg;
    private final com.google.android.gms.internal.ads.zzfch zzh;
    private com.google.common.util.concurrent.ListenableFuture zzi;

    public zzezr(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcgx zzcgxVar, com.google.android.gms.internal.ads.zzekn zzeknVar, com.google.android.gms.internal.ads.zzfar zzfarVar, com.google.android.gms.internal.ads.zzfch zzfchVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgxVar;
        this.zzd = zzeknVar;
        this.zzh = zzfchVar;
        this.zze = zzfarVar;
        this.zzg = zzcgxVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzelb zzelbVar, com.google.android.gms.internal.ads.zzelc zzelcVar) {
        com.google.android.gms.internal.ads.zzdfu zzdfuVarZzf;
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzezl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzl().zzo(true);
        }
        com.google.android.gms.ads.internal.client.zzs zzsVar = ((com.google.android.gms.internal.ads.zzezk) zzelbVar).zza;
        android.os.Bundle bundleZza = com.google.android.gms.internal.ads.zzdrg.zza(new android.util.Pair(com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALL.zza(), java.lang.Long.valueOf(zzmVar.zzz)), new android.util.Pair(com.google.android.gms.internal.ads.zzdre.DYNAMITE_ENTER.zza(), java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
        com.google.android.gms.internal.ads.zzfch zzfchVar = this.zzh;
        zzfchVar.zzt(str);
        zzfchVar.zzs(zzsVar);
        zzfchVar.zzH(zzmVar);
        zzfchVar.zzA(bundleZza);
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzfcj zzfcjVarZzJ = zzfchVar.zzJ();
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZzb = com.google.android.gms.internal.ads.zzfgv.zzb(context, com.google.android.gms.internal.ads.zzfhg.zzf(zzfcjVarZzJ), 4, zzmVar);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzib)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdft zzdftVarZzg = this.zzc.zzg();
            com.google.android.gms.internal.ads.zzcva zzcvaVar = new com.google.android.gms.internal.ads.zzcva();
            zzcvaVar.zzf(this.zza);
            zzcvaVar.zzk(zzfcjVarZzJ);
            zzdftVarZzg.zze(zzcvaVar.zzl());
            com.google.android.gms.internal.ads.zzdbk zzdbkVar = new com.google.android.gms.internal.ads.zzdbk();
            zzdbkVar.zzj(this.zzd, this.zzb);
            zzdbkVar.zzk(this.zzd, this.zzb);
            zzdftVarZzg.zzd(zzdbkVar.zzn());
            zzdftVarZzg.zzc(new com.google.android.gms.internal.ads.zzeiw(this.zzf));
            zzdfuVarZzf = zzdftVarZzg.zzh();
        } else {
            com.google.android.gms.internal.ads.zzdbk zzdbkVar2 = new com.google.android.gms.internal.ads.zzdbk();
            com.google.android.gms.internal.ads.zzfar zzfarVar = this.zze;
            if (zzfarVar != null) {
                zzdbkVar2.zze(zzfarVar, this.zzb);
                zzdbkVar2.zzf(this.zze, this.zzb);
                zzdbkVar2.zzb(this.zze, this.zzb);
            }
            com.google.android.gms.internal.ads.zzdft zzdftVarZzg2 = this.zzc.zzg();
            com.google.android.gms.internal.ads.zzcva zzcvaVar2 = new com.google.android.gms.internal.ads.zzcva();
            zzcvaVar2.zzf(this.zza);
            zzcvaVar2.zzk(zzfcjVarZzJ);
            zzdftVarZzg2.zze(zzcvaVar2.zzl());
            zzdbkVar2.zzj(this.zzd, this.zzb);
            zzdbkVar2.zze(this.zzd, this.zzb);
            zzdbkVar2.zzf(this.zzd, this.zzb);
            zzdbkVar2.zzb(this.zzd, this.zzb);
            zzdbkVar2.zza(this.zzd, this.zzb);
            zzdbkVar2.zzl(this.zzd, this.zzb);
            zzdbkVar2.zzk(this.zzd, this.zzb);
            zzdbkVar2.zzi(this.zzd, this.zzb);
            zzdbkVar2.zzc(this.zzd, this.zzb);
            zzdftVarZzg2.zzd(zzdbkVar2.zzn());
            zzdftVarZzg2.zzc(new com.google.android.gms.internal.ads.zzeiw(this.zzf));
            zzdfuVarZzf = zzdftVarZzg2.zzh();
        }
        com.google.android.gms.internal.ads.zzdfu zzdfuVar = zzdfuVarZzf;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzfhh zzfhhVarZzf = zzdfuVar.zzf();
            zzfhhVarZzf.zzi(4);
            zzfhhVarZzf.zzb(zzmVar.zzp);
            zzfhhVarZzf.zzf(zzmVar.zzm);
            zzfhhVar = zzfhhVarZzf;
        } else {
            zzfhhVar = null;
        }
        com.google.android.gms.internal.ads.zzcsd zzcsdVarZza = zzdfuVar.zza();
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzh = zzcsdVarZza.zzh(zzcsdVarZza.zzi());
        this.zzi = listenableFutureZzh;
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzh, new com.google.android.gms.internal.ads.zzezq(this, zzelcVar, zzfhhVar, zzfgwVarZzb, zzdfuVar), this.zzb);
        return true;
    }

    final /* synthetic */ void zzh() {
        this.zzd.zzdz(com.google.android.gms.internal.ads.zzfdk.zzd(6, null, null));
    }

    public final void zzi(com.google.android.gms.internal.ads.zzbdg zzbdgVar) {
        this.zzf = zzbdgVar;
    }
}
