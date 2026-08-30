package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeya implements com.google.android.gms.internal.ads.zzeld {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzcgx zzc;
    private final com.google.android.gms.internal.ads.zzekn zzd;
    private final com.google.android.gms.internal.ads.zzekr zze;
    private final android.view.ViewGroup zzf;
    private com.google.android.gms.internal.ads.zzbdg zzg;
    private final com.google.android.gms.internal.ads.zzcyl zzh;
    private final com.google.android.gms.internal.ads.zzfhk zzi;
    private final com.google.android.gms.internal.ads.zzdar zzj;
    private final com.google.android.gms.internal.ads.zzfch zzk;
    private com.google.common.util.concurrent.ListenableFuture zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private com.google.android.gms.internal.ads.zzelc zzo;

    public zzeya(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.internal.ads.zzcgx zzcgxVar, com.google.android.gms.internal.ads.zzekn zzeknVar, com.google.android.gms.internal.ads.zzekr zzekrVar, com.google.android.gms.internal.ads.zzfch zzfchVar, com.google.android.gms.internal.ads.zzdar zzdarVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgxVar;
        this.zzd = zzeknVar;
        this.zze = zzekrVar;
        this.zzk = zzfchVar;
        this.zzh = zzcgxVar.zzf();
        this.zzi = zzcgxVar.zzz();
        this.zzf = new android.widget.FrameLayout(context);
        this.zzj = zzdarVar;
        zzfchVar.zzs(zzsVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzt() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhZ)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzexw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(zzeVar);
                }
            });
        }
        com.google.android.gms.internal.ads.zzelc zzelcVar = this.zzo;
        if (zzelcVar != null) {
            zzelcVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzl;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.internal.ads.zzelb zzelbVar, com.google.android.gms.internal.ads.zzelc zzelcVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcpq zzcpqVarZzk;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzexy
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzl().zzo(true);
            }
            android.os.Bundle bundleZza = com.google.android.gms.internal.ads.zzdrg.zza(new android.util.Pair(com.google.android.gms.internal.ads.zzdre.PUBLIC_API_CALL.zza(), java.lang.Long.valueOf(zzmVar.zzz)), new android.util.Pair(com.google.android.gms.internal.ads.zzdre.DYNAMITE_ENTER.zza(), java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
            com.google.android.gms.internal.ads.zzfch zzfchVar = this.zzk;
            zzfchVar.zzt(str);
            zzfchVar.zzH(zzmVar);
            zzfchVar.zzA(bundleZza);
            android.content.Context context = this.zza;
            com.google.android.gms.internal.ads.zzfcj zzfcjVarZzJ = zzfchVar.zzJ();
            com.google.android.gms.internal.ads.zzfgw zzfgwVarZzb = com.google.android.gms.internal.ads.zzfgv.zzb(context, com.google.android.gms.internal.ads.zzfhg.zzf(zzfcjVarZzJ), 3, zzmVar);
            com.google.android.gms.internal.ads.zzfhh zzfhhVarZzj = null;
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzber.zzd.zze()).booleanValue() || !this.zzk.zzh().zzk) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhZ)).booleanValue()) {
                    com.google.android.gms.internal.ads.zzcpp zzcppVarZze = this.zzc.zze();
                    com.google.android.gms.internal.ads.zzcva zzcvaVar = new com.google.android.gms.internal.ads.zzcva();
                    zzcvaVar.zzf(this.zza);
                    zzcvaVar.zzk(zzfcjVarZzJ);
                    zzcppVarZze.zzi(zzcvaVar.zzl());
                    com.google.android.gms.internal.ads.zzdbk zzdbkVar = new com.google.android.gms.internal.ads.zzdbk();
                    zzdbkVar.zzj(this.zzd, this.zzb);
                    zzdbkVar.zzk(this.zzd, this.zzb);
                    zzcppVarZze.zzf(zzdbkVar.zzn());
                    zzcppVarZze.zze(new com.google.android.gms.internal.ads.zzeiw(this.zzg));
                    zzcppVarZze.zzd(new com.google.android.gms.internal.ads.zzdgl(com.google.android.gms.internal.ads.zzdiq.zza, null));
                    zzcppVarZze.zzg(new com.google.android.gms.internal.ads.zzcqr(this.zzh, this.zzj));
                    zzcppVarZze.zzc(new com.google.android.gms.internal.ads.zzcoj(this.zzf));
                    zzcpqVarZzk = zzcppVarZze.zzh();
                } else {
                    com.google.android.gms.internal.ads.zzcpp zzcppVarZze2 = this.zzc.zze();
                    com.google.android.gms.internal.ads.zzcva zzcvaVar2 = new com.google.android.gms.internal.ads.zzcva();
                    zzcvaVar2.zzf(this.zza);
                    zzcvaVar2.zzk(zzfcjVarZzJ);
                    zzcppVarZze2.zzi(zzcvaVar2.zzl());
                    com.google.android.gms.internal.ads.zzdbk zzdbkVar2 = new com.google.android.gms.internal.ads.zzdbk();
                    zzdbkVar2.zzj(this.zzd, this.zzb);
                    zzdbkVar2.zza(this.zzd, this.zzb);
                    zzdbkVar2.zza(this.zze, this.zzb);
                    zzdbkVar2.zzl(this.zzd, this.zzb);
                    zzdbkVar2.zzd(this.zzd, this.zzb);
                    zzdbkVar2.zze(this.zzd, this.zzb);
                    zzdbkVar2.zzf(this.zzd, this.zzb);
                    zzdbkVar2.zzb(this.zzd, this.zzb);
                    zzdbkVar2.zzk(this.zzd, this.zzb);
                    zzdbkVar2.zzi(this.zzd, this.zzb);
                    zzcppVarZze2.zzf(zzdbkVar2.zzn());
                    zzcppVarZze2.zze(new com.google.android.gms.internal.ads.zzeiw(this.zzg));
                    zzcppVarZze2.zzd(new com.google.android.gms.internal.ads.zzdgl(com.google.android.gms.internal.ads.zzdiq.zza, null));
                    zzcppVarZze2.zzg(new com.google.android.gms.internal.ads.zzcqr(this.zzh, this.zzj));
                    zzcppVarZze2.zzc(new com.google.android.gms.internal.ads.zzcoj(this.zzf));
                    zzcpqVarZzk = zzcppVarZze2.zzh();
                }
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbee.zzc.zze()).booleanValue()) {
                    zzfhhVarZzj = zzcpqVarZzk.zzj();
                    zzfhhVarZzj.zzi(3);
                    zzfhhVarZzj.zzb(zzmVar.zzp);
                    zzfhhVarZzj.zzf(zzmVar.zzm);
                }
                this.zzo = zzelcVar;
                com.google.android.gms.internal.ads.zzcsd zzcsdVarZzd = zzcpqVarZzk.zzd();
                com.google.common.util.concurrent.ListenableFuture listenableFutureZzh = zzcsdVarZzd.zzh(zzcsdVarZzd.zzi());
                this.zzl = listenableFutureZzh;
                com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzh, new com.google.android.gms.internal.ads.zzexz(this, zzfhhVarZzj, zzfgwVarZzb, zzcpqVarZzk), this.zzb);
                return true;
            }
            com.google.android.gms.internal.ads.zzekn zzeknVar = this.zzd;
            if (zzeknVar != null) {
                zzeknVar.zzdz(com.google.android.gms.internal.ads.zzfdk.zzd(7, null, null));
            }
        } else if (!this.zzk.zzS()) {
            this.zzm = true;
        }
        return false;
    }

    public final android.view.ViewGroup zzc() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.zzfch zzf() {
        return this.zzk;
    }

    final /* synthetic */ void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzdz(zzeVar);
    }

    final /* synthetic */ void zzk() {
        this.zzd.zzdz(com.google.android.gms.internal.ads.zzfdk.zzd(6, null, null));
    }

    public final void zzl() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzm() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        this.zze.zza(zzbiVar);
    }

    public final void zzo(com.google.android.gms.internal.ads.zzcyf zzcyfVar) {
        this.zzh.zzo(zzcyfVar, this.zzb);
    }

    public final void zzp(com.google.android.gms.internal.ads.zzbdg zzbdgVar) {
        this.zzg = zzbdgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzq() {
        synchronized (this) {
            com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzl;
            if (listenableFuture != null && listenableFuture.isDone()) {
                try {
                    com.google.android.gms.internal.ads.zzcom zzcomVar = (com.google.android.gms.internal.ads.zzcom) this.zzl.get();
                    this.zzl = null;
                    this.zzf.removeAllViews();
                    if (zzcomVar.zzd() != null) {
                        android.view.ViewParent parent = zzcomVar.zzd().getParent();
                        if (parent instanceof android.view.ViewGroup) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Banner view provided from " + (zzcomVar.zzm() != null ? zzcomVar.zzm().zzg() : "") + " already has a parent view. Removing its old parent.");
                            ((android.view.ViewGroup) parent).removeView(zzcomVar.zzd());
                        }
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhZ)).booleanValue()) {
                        com.google.android.gms.internal.ads.zzczz zzczzVarZzo = zzcomVar.zzo();
                        zzczzVarZzo.zza(this.zzd);
                        zzczzVarZzo.zzc(this.zze);
                    }
                    this.zzf.addView(zzcomVar.zzd());
                    com.google.android.gms.internal.ads.zzelc zzelcVar = this.zzo;
                    if (zzelcVar != null) {
                        zzelcVar.zzb(zzcomVar);
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhZ)).booleanValue()) {
                        java.util.concurrent.Executor executor = this.zzb;
                        final com.google.android.gms.internal.ads.zzekn zzeknVar = this.zzd;
                        java.util.Objects.requireNonNull(zzeknVar);
                        executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzexx
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzeknVar.zzs();
                            }
                        });
                    }
                    if (zzcomVar.zza() >= 0) {
                        this.zzm = false;
                        this.zzh.zzd(zzcomVar.zza());
                        this.zzh.zze(zzcomVar.zzc());
                    } else {
                        this.zzm = true;
                        this.zzh.zzd(zzcomVar.zzc());
                    }
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                    zzt();
                    com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                    this.zzm = true;
                    this.zzh.zza();
                }
            } else if (this.zzl != null) {
                com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                this.zzm = true;
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                this.zzm = true;
                this.zzh.zza();
            }
        }
    }

    public final boolean zzs() {
        java.lang.Object parent = this.zzf.getParent();
        if (!(parent instanceof android.view.View)) {
            return false;
        }
        android.view.View view = (android.view.View) parent;
        com.google.android.gms.ads.internal.zzv.zzq();
        return com.google.android.gms.ads.internal.util.zzs.zzW(view, view.getContext());
    }
}
