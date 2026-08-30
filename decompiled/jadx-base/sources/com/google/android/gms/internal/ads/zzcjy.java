package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcjy extends com.google.android.gms.ads.internal.client.zzcy {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final com.google.android.gms.internal.ads.zzdpm zzc;
    private final com.google.android.gms.internal.ads.zzecy zzd;
    private final com.google.android.gms.internal.ads.zzejj zze;
    private final com.google.android.gms.internal.ads.zzdua zzf;
    private final com.google.android.gms.internal.ads.zzbyi zzg;
    private final com.google.android.gms.internal.ads.zzdpr zzh;
    private final com.google.android.gms.internal.ads.zzduv zzi;
    private final com.google.android.gms.internal.ads.zzbfe zzj;
    private final com.google.android.gms.internal.ads.zzfhk zzk;
    private final com.google.android.gms.internal.ads.zzfdf zzl;
    private final com.google.android.gms.internal.ads.zzctj zzm;
    private final com.google.android.gms.internal.ads.zzdrw zzn;
    private boolean zzo = false;
    private final java.lang.Long zzp = java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());

    zzcjy(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdpm zzdpmVar, com.google.android.gms.internal.ads.zzecy zzecyVar, com.google.android.gms.internal.ads.zzejj zzejjVar, com.google.android.gms.internal.ads.zzdua zzduaVar, com.google.android.gms.internal.ads.zzbyi zzbyiVar, com.google.android.gms.internal.ads.zzdpr zzdprVar, com.google.android.gms.internal.ads.zzduv zzduvVar, com.google.android.gms.internal.ads.zzbfe zzbfeVar, com.google.android.gms.internal.ads.zzfhk zzfhkVar, com.google.android.gms.internal.ads.zzfdf zzfdfVar, com.google.android.gms.internal.ads.zzctj zzctjVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdpmVar;
        this.zzd = zzecyVar;
        this.zze = zzejjVar;
        this.zzf = zzduaVar;
        this.zzg = zzbyiVar;
        this.zzh = zzdprVar;
        this.zzi = zzduvVar;
        this.zzj = zzbfeVar;
        this.zzk = zzfhkVar;
        this.zzl = zzfdfVar;
        this.zzm = zzctjVar;
        this.zzn = zzdrwVar;
    }

    final void zzb() {
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
            java.lang.String strZzi = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzi();
            if (com.google.android.gms.ads.internal.zzv.zzt().zzj(this.zza, strZzi, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzx(false);
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzw("");
        }
    }

    final void zzc(java.lang.Runnable runnable) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        java.util.Map mapZze = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zze();
        if (mapZze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            java.util.HashMap map = new java.util.HashMap();
            java.util.Iterator it = mapZze.values().iterator();
            while (it.hasNext()) {
                for (com.google.android.gms.internal.ads.zzbox zzboxVar : ((com.google.android.gms.internal.ads.zzboy) it.next()).zza) {
                    java.lang.String str = zzboxVar.zzb;
                    for (java.lang.String str2 : zzboxVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new java.util.ArrayList());
                        }
                        if (str != null) {
                            ((java.util.List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                try {
                    com.google.android.gms.internal.ads.zzecz zzeczVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzeczVarZza != null) {
                        com.google.android.gms.internal.ads.zzfdh zzfdhVar = (com.google.android.gms.internal.ads.zzfdh) zzeczVarZza.zzb;
                        if (!zzfdhVar.zzC() && zzfdhVar.zzB()) {
                            zzfdhVar.zzj(this.zza, (com.google.android.gms.internal.ads.zzeet) zzeczVarZza.zzc, (java.util.List) entry.getValue());
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (com.google.android.gms.internal.ads.zzfcq e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    final /* synthetic */ void zzd() {
        com.google.android.gms.internal.ads.zzfdn.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzv.zzs().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final java.lang.String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final java.util.List zzg() throws android.os.RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(java.lang.String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws android.os.RemoteException {
        try {
            com.google.android.gms.internal.ads.zzfrb.zza(this.zza).zzc(z);
            if (z) {
                return;
            }
            try {
                if (this.zza.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new java.io.IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (java.io.IOException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (java.io.IOException e2) {
            throw new android.os.RemoteException(e2.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzk() {
        if (this.zzo) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Mobile ads is initialized already.");
            return;
        }
        com.google.android.gms.internal.ads.zzbcl.zza(this.zza);
        com.google.android.gms.ads.internal.zzv.zzp().zzu(this.zza, this.zzb);
        this.zzm.zzd();
        com.google.android.gms.ads.internal.zzv.zzc().zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzed)).booleanValue()) {
            this.zzh.zzd();
        }
        this.zzi.zzg();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkO)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcjw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx();
                }
            });
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdb)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcju
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd();
                }
            });
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeG)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeH)).booleanValue()) {
                com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcjv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzw();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        java.lang.String strZzq;
        java.lang.Runnable runnable;
        com.google.android.gms.internal.ads.zzbcl.zza(this.zza);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzei)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzv.zzq();
                strZzq = com.google.android.gms.ads.internal.util.zzs.zzq(this.zza);
            } catch (android.os.RemoteException | java.lang.RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "NonagonMobileAdsSettingManager_AppId");
                strZzq = "";
            }
        } else {
            strZzq = "";
        }
        boolean z = true;
        java.lang.String str2 = true == android.text.TextUtils.isEmpty(strZzq) ? str : strZzq;
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeb)).booleanValue() | ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzba)).booleanValue();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzba)).booleanValue()) {
            final java.lang.Runnable runnable2 = (java.lang.Runnable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcjx
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.ads.zzgcs zzgcsVar = com.google.android.gms.internal.ads.zzbzw.zzf;
                    final com.google.android.gms.internal.ads.zzcjy zzcjyVar = this.zza;
                    final java.lang.Runnable runnable3 = runnable2;
                    zzgcsVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcjs
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcjyVar.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = zBooleanValue;
        }
        java.lang.Runnable runnable3 = runnable;
        if (z) {
            com.google.android.gms.ads.internal.zzv.zza().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzp);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(com.google.android.gms.ads.internal.client.zzdl zzdlVar) throws android.os.RemoteException {
        this.zzi.zzh(zzdlVar, com.google.android.gms.internal.ads.zzduu.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str) {
        if (iObjectWrapper == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.zzb.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(com.google.android.gms.internal.ads.zzbpe zzbpeVar) throws android.os.RemoteException {
        this.zzl.zzf(zzbpeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzp(boolean z) {
        com.google.android.gms.ads.internal.zzv.zzs().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzq(float f) {
        com.google.android.gms.ads.internal.zzv.zzs().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzr(java.lang.String str) {
        com.google.android.gms.internal.ads.zzbcl.zza(this.zza);
        if (!android.text.TextUtils.isEmpty(str)) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zza().zza(this.zza, this.zzb, str, null, this.zzk, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(com.google.android.gms.internal.ads.zzblu zzbluVar) throws android.os.RemoteException {
        this.zzf.zzs(zzbluVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjn)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzz(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(com.google.android.gms.ads.internal.client.zzfv zzfvVar) throws android.os.RemoteException {
        this.zzg.zzn(this.zza, zzfvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzv.zzs().zze();
    }

    final /* synthetic */ void zzw() {
        com.google.android.gms.ads.internal.zzv.zzf().zzb(this.zza, this.zzn);
    }

    final /* synthetic */ void zzx() {
        this.zzj.zza(new com.google.android.gms.internal.ads.zzbum());
    }
}
