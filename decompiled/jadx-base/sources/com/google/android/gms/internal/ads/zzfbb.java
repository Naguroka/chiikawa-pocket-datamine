package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfbb implements com.google.android.gms.internal.ads.zzeld {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcgx zzc;
    private final com.google.android.gms.internal.ads.zzfar zzd;
    private final com.google.android.gms.internal.ads.zzezf zze;
    private final com.google.android.gms.internal.ads.zzfcb zzf;
    private final com.google.android.gms.internal.ads.zzfhk zzg;
    private final com.google.android.gms.internal.ads.zzfch zzh;
    private com.google.common.util.concurrent.ListenableFuture zzi;

    public zzfbb(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcgx zzcgxVar, com.google.android.gms.internal.ads.zzezf zzezfVar, com.google.android.gms.internal.ads.zzfar zzfarVar, com.google.android.gms.internal.ads.zzfch zzfchVar, com.google.android.gms.internal.ads.zzfcb zzfcbVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgxVar;
        this.zze = zzezfVar;
        this.zzd = zzfarVar;
        this.zzh = zzfchVar;
        this.zzf = zzfcbVar;
        this.zzg = zzcgxVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.internal.ads.zzdoe zzk(com.google.android.gms.internal.ads.zzezd zzezdVar) {
        com.google.android.gms.internal.ads.zzdoe zzdoeVarZzi = this.zzc.zzi();
        com.google.android.gms.internal.ads.zzcva zzcvaVar = new com.google.android.gms.internal.ads.zzcva();
        zzcvaVar.zzf(this.zza);
        zzcvaVar.zzk(((com.google.android.gms.internal.ads.zzfaz) zzezdVar).zza);
        zzcvaVar.zzj(this.zzf);
        zzdoeVarZzi.zzd(zzcvaVar.zzl());
        zzdoeVarZzi.zzc(new com.google.android.gms.internal.ads.zzdbk().zzn());
        return zzdoeVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzelb zzelbVar, com.google.android.gms.internal.ads.zzelc zzelcVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        com.google.android.gms.internal.ads.zzbwd zzbwdVar = new com.google.android.gms.internal.ads.zzbwd(zzmVar, str);
        if (zzbwdVar.zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfau
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi();
                }
            });
            return false;
        }
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzezf zzezfVar = this.zze;
            if (zzezfVar.zzd() != null) {
                com.google.android.gms.internal.ads.zzfhh zzfhhVarZzh = ((com.google.android.gms.internal.ads.zzdof) zzezfVar.zzd()).zzh();
                zzfhhVarZzh.zzi(5);
                zzfhhVarZzh.zzb(zzbwdVar.zza.zzp);
                zzfhhVarZzh.zzf(zzbwdVar.zza.zzm);
                zzfhhVar = zzfhhVarZzh;
            } else {
                zzfhhVar = null;
            }
        } else {
            zzfhhVar = null;
        }
        com.google.android.gms.internal.ads.zzfdg.zza(this.zza, zzbwdVar.zza.zzf);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue() && zzbwdVar.zza.zzf) {
            this.zzc.zzl().zzo(true);
        }
        android.os.Bundle bundleZza = com.google.android.gms.internal.ads.zzdrg.zza(new android.util.Pair(com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALL.zza(), java.lang.Long.valueOf(zzbwdVar.zza.zzz)), new android.util.Pair(com.google.android.gms.internal.ads.zzdre.DYNAMITE_ENTER.zza(), java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
        com.google.android.gms.internal.ads.zzfch zzfchVar = this.zzh;
        zzfchVar.zzt(zzbwdVar.zzb);
        zzfchVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzd());
        zzfchVar.zzH(zzbwdVar.zza);
        zzfchVar.zzA(bundleZza);
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzfcj zzfcjVarZzJ = zzfchVar.zzJ();
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZzb = com.google.android.gms.internal.ads.zzfgv.zzb(context, com.google.android.gms.internal.ads.zzfhg.zzf(zzfcjVarZzJ), 5, zzbwdVar.zza);
        com.google.android.gms.internal.ads.zzfaz zzfazVar = new com.google.android.gms.internal.ads.zzfaz(null);
        zzfazVar.zza = zzfcjVarZzJ;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzc = this.zze.zzc(new com.google.android.gms.internal.ads.zzezg(zzfazVar, null), new com.google.android.gms.internal.ads.zzeze() { // from class: com.google.android.gms.internal.ads.zzfav
            @Override // com.google.android.gms.internal.ads.zzeze
            public final com.google.android.gms.internal.ads.zzcuy zza(com.google.android.gms.internal.ads.zzezd zzezdVar) {
                return this.zza.zzk(zzezdVar);
            }
        }, null);
        this.zzi = listenableFutureZzc;
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzc, new com.google.android.gms.internal.ads.zzfay(this, zzelcVar, zzfhhVar, zzfgwVarZzb, zzfazVar), this.zzb);
        return true;
    }

    final /* synthetic */ void zzi() {
        this.zzd.zzdz(com.google.android.gms.internal.ads.zzfdk.zzd(6, null, null));
    }

    final void zzj(int i) {
        this.zzh.zzp().zza(i);
    }
}
