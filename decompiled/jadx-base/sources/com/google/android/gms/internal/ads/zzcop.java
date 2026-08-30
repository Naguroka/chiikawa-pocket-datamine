package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcop extends com.google.android.gms.internal.ads.zzcom {
    private final android.content.Context zzc;
    private final android.view.View zzd;
    private final com.google.android.gms.internal.ads.zzcex zze;
    private final com.google.android.gms.internal.ads.zzfbp zzf;
    private final com.google.android.gms.internal.ads.zzcqx zzg;
    private final com.google.android.gms.internal.ads.zzdiq zzh;
    private final com.google.android.gms.internal.ads.zzddu zzi;
    private final com.google.android.gms.internal.ads.zzhel zzj;
    private final java.util.concurrent.Executor zzk;
    private com.google.android.gms.ads.internal.client.zzs zzl;

    zzcop(com.google.android.gms.internal.ads.zzcqy zzcqyVar, android.content.Context context, com.google.android.gms.internal.ads.zzfbp zzfbpVar, android.view.View view, com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzcqx zzcqxVar, com.google.android.gms.internal.ads.zzdiq zzdiqVar, com.google.android.gms.internal.ads.zzddu zzdduVar, com.google.android.gms.internal.ads.zzhel zzhelVar, java.util.concurrent.Executor executor) {
        super(zzcqyVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcexVar;
        this.zzf = zzfbpVar;
        this.zzg = zzcqxVar;
        this.zzh = zzdiqVar;
        this.zzi = zzdduVar;
        this.zzj = zzhelVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzcop zzcopVar) {
        com.google.android.gms.internal.ads.zzbhh zzbhhVarZze = zzcopVar.zzh.zze();
        if (zzbhhVarZze == null) {
            return;
        }
        try {
            zzbhhVarZze.zze((com.google.android.gms.ads.internal.client.zzby) zzcopVar.zzj.zzb(), com.google.android.gms.dynamic.ObjectWrapper.wrap(zzcopVar.zzc));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final int zzc() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhJ)).booleanValue() && this.zzb.zzag) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhK)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final android.view.View zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        try {
            return this.zzg.zza();
        } catch (com.google.android.gms.internal.ads.zzfcq unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final com.google.android.gms.internal.ads.zzfbp zzf() {
        com.google.android.gms.ads.internal.client.zzs zzsVar = this.zzl;
        if (zzsVar != null) {
            return com.google.android.gms.internal.ads.zzfcp.zzb(zzsVar);
        }
        com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzb;
        if (zzfboVar.zzac) {
            for (java.lang.String str : zzfboVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            android.view.View view = this.zzd;
            return new com.google.android.gms.internal.ads.zzfbp(view.getWidth(), view.getHeight(), false);
        }
        return (com.google.android.gms.internal.ads.zzfbp) this.zzb.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final com.google.android.gms.internal.ads.zzfbp zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final void zzh() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final void zzi(android.view.ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar) {
        com.google.android.gms.internal.ads.zzcex zzcexVar;
        if (viewGroup == null || (zzcexVar = this.zze) == null) {
            return;
        }
        zzcexVar.zzaj(com.google.android.gms.internal.ads.zzcgr.zzc(zzsVar));
        viewGroup.setMinimumHeight(zzsVar.zzc);
        viewGroup.setMinimumWidth(zzsVar.zzf);
        this.zzl = zzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqz
    public final void zzk() {
        this.zzk.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcoo
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.zzcop.zzj(this.zza);
            }
        });
        super.zzk();
    }
}
