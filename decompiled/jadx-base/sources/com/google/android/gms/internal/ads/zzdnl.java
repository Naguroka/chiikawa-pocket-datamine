package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdnl {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzdrw zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.internal.ads.zzava zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;
    private final com.google.android.gms.internal.ads.zzebk zzi;
    private final com.google.android.gms.internal.ads.zzfja zzj;
    private final com.google.android.gms.internal.ads.zzebv zzk;
    private final com.google.android.gms.internal.ads.zzfcn zzl;
    private com.google.common.util.concurrent.ListenableFuture zzm;
    private final com.google.android.gms.internal.ads.zzdmy zza = new com.google.android.gms.internal.ads.zzdmy();
    private final com.google.android.gms.internal.ads.zzbkf zzh = new com.google.android.gms.internal.ads.zzbkf();

    zzdnl(com.google.android.gms.internal.ads.zzdni zzdniVar) {
        this.zzc = zzdniVar.zzb;
        this.zze = zzdniVar.zze;
        this.zzf = zzdniVar.zzf;
        this.zzg = zzdniVar.zzg;
        this.zzb = zzdniVar.zza;
        this.zzi = zzdniVar.zzd;
        this.zzj = zzdniVar.zzh;
        this.zzd = zzdniVar.zzc;
        this.zzk = zzdniVar.zzi;
        this.zzl = zzdniVar.zzj;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzcex zza(com.google.android.gms.internal.ads.zzcex zzcexVar) {
        zzcexVar.zzag("/result", this.zzh);
        com.google.android.gms.internal.ads.zzcgp zzcgpVarZzN = zzcexVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        com.google.android.gms.internal.ads.zzebk zzebkVar = this.zzi;
        com.google.android.gms.internal.ads.zzfja zzfjaVar = this.zzj;
        com.google.android.gms.internal.ads.zzdrw zzdrwVar = this.zzd;
        com.google.android.gms.internal.ads.zzdmy zzdmyVar = this.zza;
        zzcgpVarZzN.zzV(null, zzdmyVar, zzdmyVar, zzdmyVar, zzdmyVar, false, null, zzbVar, null, null, zzebkVar, zzfjaVar, zzdrwVar, null, null, null, null, null, null);
        return zzcexVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzf(java.lang.String str, org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzcex zzcexVar) throws java.lang.Exception {
        return this.zzh.zzb(zzcexVar, str, jSONObject);
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzg(final java.lang.String str, final org.json.JSONObject jSONObject) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return com.google.android.gms.internal.ads.zzgch.zzh(null);
        }
        return com.google.android.gms.internal.ads.zzgch.zzn(listenableFuture, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdmz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzf(str, jSONObject, (com.google.android.gms.internal.ads.zzcex) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzh(com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar, com.google.android.gms.internal.ads.zzcmk zzcmkVar) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzdnf(this, zzfboVar, zzfbrVar, zzcmkVar), this.zze);
    }

    public final synchronized void zzi() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzdnb(this), this.zze);
        this.zzm = null;
    }

    public final synchronized void zzj(java.lang.String str, java.util.Map map) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzdne(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzk() {
        final java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdQ);
        final android.content.Context context = this.zzc;
        final com.google.android.gms.internal.ads.zzava zzavaVar = this.zzf;
        final com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzg;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final com.google.android.gms.internal.ads.zzebv zzebvVar = this.zzk;
        final com.google.android.gms.internal.ads.zzfcn zzfcnVar = this.zzl;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzm = com.google.android.gms.internal.ads.zzgch.zzm(com.google.android.gms.internal.ads.zzgch.zzk(new com.google.android.gms.internal.ads.zzgbn() { // from class: com.google.android.gms.internal.ads.zzcfi
            @Override // com.google.android.gms.internal.ads.zzgbn
            public final com.google.common.util.concurrent.ListenableFuture zza() throws com.google.android.gms.internal.ads.zzcfj {
                com.google.android.gms.ads.internal.zzv.zzA();
                android.content.Context context2 = context;
                com.google.android.gms.internal.ads.zzcgr zzcgrVarZza = com.google.android.gms.internal.ads.zzcgr.zza();
                com.google.android.gms.internal.ads.zzava zzavaVar2 = zzavaVar;
                com.google.android.gms.internal.ads.zzebv zzebvVar2 = zzebvVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                com.google.android.gms.internal.ads.zzcex zzcexVarZza = com.google.android.gms.internal.ads.zzcfk.zza(context2, zzcgrVarZza, "", false, false, zzavaVar2, null, versionInfoParcel, null, null, zzaVar2, com.google.android.gms.internal.ads.zzbbj.zza(), null, null, zzebvVar2, zzfcnVar);
                final com.google.android.gms.internal.ads.zzcaa zzcaaVarZza = com.google.android.gms.internal.ads.zzcaa.zza(zzcexVarZza);
                zzcexVarZza.zzN().zzC(new com.google.android.gms.internal.ads.zzcgn() { // from class: com.google.android.gms.internal.ads.zzcfh
                    @Override // com.google.android.gms.internal.ads.zzcgn
                    public final void zza(boolean z, int i, java.lang.String str2, java.lang.String str3) {
                        zzcaaVarZza.zzb();
                    }
                });
                zzcexVarZza.loadUrl(str);
                return zzcaaVarZza;
            }
        }, com.google.android.gms.internal.ads.zzbzw.zzf), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzdna
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
                this.zza.zza(zzcexVar);
                return zzcexVar;
            }
        }, this.zze);
        this.zzm = listenableFutureZzm;
        com.google.android.gms.internal.ads.zzbzz.zza(listenableFutureZzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzdnc(this, str, zzbjpVar), this.zze);
    }

    public final void zzm(java.lang.ref.WeakReference weakReference, java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        zzl(str, new com.google.android.gms.internal.ads.zzdnj(this, weakReference, str, zzbjpVar, null));
    }

    public final synchronized void zzn(java.lang.String str, com.google.android.gms.internal.ads.zzbjp zzbjpVar) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzdnd(this, str, zzbjpVar), this.zze);
    }
}
