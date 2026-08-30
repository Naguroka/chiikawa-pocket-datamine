package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzeww implements com.google.android.gms.internal.ads.zzeld {
    protected final com.google.android.gms.internal.ads.zzcgx zza;
    private final android.content.Context zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.ads.zzexm zzd;
    private final com.google.android.gms.internal.ads.zzezf zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final android.view.ViewGroup zzg;
    private final com.google.android.gms.internal.ads.zzfhk zzh;
    private final com.google.android.gms.internal.ads.zzfch zzi;

    @javax.annotation.Nullable
    private com.google.common.util.concurrent.ListenableFuture zzj;

    protected zzeww(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcgx zzcgxVar, com.google.android.gms.internal.ads.zzezf zzezfVar, com.google.android.gms.internal.ads.zzexm zzexmVar, com.google.android.gms.internal.ads.zzfch zzfchVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgxVar;
        this.zze = zzezfVar;
        this.zzd = zzexmVar;
        this.zzi = zzfchVar;
        this.zzf = versionInfoParcel;
        this.zzg = new android.widget.FrameLayout(context);
        this.zzh = zzcgxVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized com.google.android.gms.internal.ads.zzcuy zzm(com.google.android.gms.internal.ads.zzezd zzezdVar) {
        com.google.android.gms.internal.ads.zzewu zzewuVar = (com.google.android.gms.internal.ads.zzewu) zzezdVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzia)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcoj zzcojVar = new com.google.android.gms.internal.ads.zzcoj(this.zzg);
            com.google.android.gms.internal.ads.zzcva zzcvaVar = new com.google.android.gms.internal.ads.zzcva();
            zzcvaVar.zzf(this.zzb);
            zzcvaVar.zzk(zzewuVar.zza);
            com.google.android.gms.internal.ads.zzcvc zzcvcVarZzl = zzcvaVar.zzl();
            com.google.android.gms.internal.ads.zzdbk zzdbkVar = new com.google.android.gms.internal.ads.zzdbk();
            zzdbkVar.zzc(this.zzd, this.zzc);
            zzdbkVar.zzl(this.zzd, this.zzc);
            return zze(zzcojVar, zzcvcVarZzl, zzdbkVar.zzn());
        }
        com.google.android.gms.internal.ads.zzexm zzexmVarZzi = com.google.android.gms.internal.ads.zzexm.zzi(this.zzd);
        com.google.android.gms.internal.ads.zzdbk zzdbkVar2 = new com.google.android.gms.internal.ads.zzdbk();
        zzdbkVar2.zzb(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzg(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzh(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzi(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzc(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzl(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzm(zzexmVarZzi);
        com.google.android.gms.internal.ads.zzcoj zzcojVar2 = new com.google.android.gms.internal.ads.zzcoj(this.zzg);
        com.google.android.gms.internal.ads.zzcva zzcvaVar2 = new com.google.android.gms.internal.ads.zzcva();
        zzcvaVar2.zzf(this.zzb);
        zzcvaVar2.zzk(zzewuVar.zza);
        return zze(zzcojVar2, zzcvaVar2.zzl(), zzdbkVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzelb zzelbVar, com.google.android.gms.internal.ads.zzelc zzelcVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzfhh zzfhhVar;
        com.google.android.gms.internal.ads.zzcnw zzcnwVar;
        if (!zzmVar.zzb()) {
            boolean z = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbej.zzd.zze()).booleanValue() && ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzla)).booleanValue();
            if (this.zzf.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlb)).intValue() || !z) {
                com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzewq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk();
                }
            });
            return false;
        }
        if (this.zzj != null) {
            return false;
        }
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue() || (zzcnwVar = (com.google.android.gms.internal.ads.zzcnw) this.zze.zzd()) == null) {
            zzfhhVar = null;
        } else {
            com.google.android.gms.internal.ads.zzfhh zzfhhVarZzh = zzcnwVar.zzh();
            zzfhhVarZzh.zzi(7);
            zzfhhVarZzh.zzb(zzmVar.zzp);
            zzfhhVarZzh.zzf(zzmVar.zzm);
            zzfhhVar = zzfhhVarZzh;
        }
        com.google.android.gms.internal.ads.zzfdg.zza(this.zzb, zzmVar.zzf);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue() && zzmVar.zzf) {
            this.zza.zzl().zzo(true);
        }
        android.os.Bundle bundleZza = com.google.android.gms.internal.ads.zzdrg.zza(new android.util.Pair(com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALL.zza(), java.lang.Long.valueOf(zzmVar.zzz)), new android.util.Pair(com.google.android.gms.internal.ads.zzdre.DYNAMITE_ENTER.zza(), java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
        com.google.android.gms.internal.ads.zzfch zzfchVar = this.zzi;
        zzfchVar.zzt(str);
        zzfchVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzb());
        zzfchVar.zzH(zzmVar);
        zzfchVar.zzA(bundleZza);
        android.content.Context context = this.zzb;
        com.google.android.gms.internal.ads.zzfcj zzfcjVarZzJ = zzfchVar.zzJ();
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZzb = com.google.android.gms.internal.ads.zzfgv.zzb(context, com.google.android.gms.internal.ads.zzfhg.zzf(zzfcjVarZzJ), 7, zzmVar);
        com.google.android.gms.internal.ads.zzewu zzewuVar = new com.google.android.gms.internal.ads.zzewu(null);
        zzewuVar.zza = zzfcjVarZzJ;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzc = this.zze.zzc(new com.google.android.gms.internal.ads.zzezg(zzewuVar, null), new com.google.android.gms.internal.ads.zzeze() { // from class: com.google.android.gms.internal.ads.zzewr
            @Override // com.google.android.gms.internal.ads.zzeze
            public final com.google.android.gms.internal.ads.zzcuy zza(com.google.android.gms.internal.ads.zzezd zzezdVar) {
                return this.zza.zzm(zzezdVar);
            }
        }, null);
        this.zzj = listenableFutureZzc;
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzc, new com.google.android.gms.internal.ads.zzewt(this, zzelcVar, zzfhhVar, zzfgwVarZzb, zzewuVar), this.zzc);
        return true;
    }

    protected abstract com.google.android.gms.internal.ads.zzcuy zze(com.google.android.gms.internal.ads.zzcoj zzcojVar, com.google.android.gms.internal.ads.zzcvc zzcvcVar, com.google.android.gms.internal.ads.zzdbm zzdbmVar);

    final /* synthetic */ void zzk() {
        this.zzd.zzdz(com.google.android.gms.internal.ads.zzfdk.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        this.zzi.zzu(zzyVar);
    }
}
