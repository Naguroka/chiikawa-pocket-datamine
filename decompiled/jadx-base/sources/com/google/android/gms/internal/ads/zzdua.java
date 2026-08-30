package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdua {
    private final android.content.Context zzf;
    private final java.lang.ref.WeakReference zzg;
    private final com.google.android.gms.internal.ads.zzdpm zzh;
    private final java.util.concurrent.Executor zzi;
    private final java.util.concurrent.Executor zzj;
    private final java.util.concurrent.ScheduledExecutorService zzk;
    private final com.google.android.gms.internal.ads.zzdsh zzl;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzm;
    private final com.google.android.gms.internal.ads.zzdcr zzo;
    private final com.google.android.gms.internal.ads.zzfhk zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final com.google.android.gms.internal.ads.zzcab zze = new com.google.android.gms.internal.ads.zzcab();
    private final java.util.Map zzn = new java.util.concurrent.ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();

    public zzdua(java.util.concurrent.Executor executor, android.content.Context context, java.lang.ref.WeakReference weakReference, java.util.concurrent.Executor executor2, com.google.android.gms.internal.ads.zzdpm zzdpmVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzdsh zzdshVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdcr zzdcrVar, com.google.android.gms.internal.ads.zzfhk zzfhkVar) {
        this.zzh = zzdpmVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdshVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdcrVar;
        this.zzp = zzfhkVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(final com.google.android.gms.internal.ads.zzdua zzduaVar, java.lang.String str) {
        int i = 5;
        final com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = com.google.android.gms.internal.ads.zzfgv.zza(zzduaVar.zzf, 5);
        zzfgwVarZza.zzi();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONObject jSONObject = new org.json.JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final java.lang.String next = itKeys.next();
                final com.google.android.gms.internal.ads.zzfgw zzfgwVarZza2 = com.google.android.gms.internal.ads.zzfgv.zza(zzduaVar.zzf, i);
                zzfgwVarZza2.zzi();
                zzfgwVarZza2.zzd(next);
                final java.lang.Object obj = new java.lang.Object();
                final com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
                com.google.common.util.concurrent.ListenableFuture listenableFutureZzo = com.google.android.gms.internal.ads.zzgch.zzo(zzcabVar, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbW)).longValue(), java.util.concurrent.TimeUnit.SECONDS, zzduaVar.zzk);
                zzduaVar.zzl.zzc(next);
                zzduaVar.zzo.zzc(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
                listenableFutureZzo.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdtq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzq(obj, zzcabVar, next, jElapsedRealtime, zzfgwVarZza2);
                    }
                }, zzduaVar.zzi);
                arrayList.add(listenableFutureZzo);
                final com.google.android.gms.internal.ads.zzdtz zzdtzVar = new com.google.android.gms.internal.ads.zzdtz(zzduaVar, obj, next, jElapsedRealtime, zzfgwVarZza2, zzcabVar);
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        org.json.JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            java.lang.String strOptString = jSONObject2.optString("format", "");
                            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            android.os.Bundle bundle = new android.os.Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                java.util.Iterator<java.lang.String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    java.lang.String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            org.json.JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new com.google.android.gms.internal.ads.zzblx(strOptString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (org.json.JSONException unused) {
                    }
                }
                zzduaVar.zzv(next, false, "", 0);
                try {
                    final com.google.android.gms.internal.ads.zzfdh zzfdhVarZzc = zzduaVar.zzh.zzc(next, new org.json.JSONObject());
                    zzduaVar.zzj.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdtv
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzn(next, zzdtzVar, zzfdhVarZzc, arrayList2);
                        }
                    });
                } catch (com.google.android.gms.internal.ads.zzfcq e) {
                    try {
                        java.lang.String str2 = "Failed to create Adapter.";
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmP)).booleanValue()) {
                            str2 = "Failed to create Adapter. " + e.getMessage();
                        }
                        zzdtzVar.zze(str2);
                    } catch (android.os.RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
                    }
                }
                i = 5;
            }
            com.google.android.gms.internal.ads.zzgch.zza(arrayList).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdtr
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() throws java.lang.Exception {
                    this.zza.zzf(zzfgwVarZza);
                    return null;
                }
            }, zzduaVar.zzi);
        } catch (org.json.JSONException e3) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e3);
            zzduaVar.zzo.zza("MalformedJson");
            zzduaVar.zzl.zza("MalformedJson");
            zzduaVar.zze.zzd(e3);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "AdapterInitializer.updateAdapterStatus");
            com.google.android.gms.internal.ads.zzfhk zzfhkVar = zzduaVar.zzp;
            zzfgwVarZza.zzh(e3);
            zzfgwVarZza.zzg(false);
            zzfhkVar.zzb(zzfgwVarZza.zzm());
        }
    }

    private final synchronized com.google.common.util.concurrent.ListenableFuture zzu() {
        java.lang.String strZzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
        if (!android.text.TextUtils.isEmpty(strZzc)) {
            return com.google.android.gms.internal.ads.zzgch.zzh(strZzc);
        }
        final com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdts
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(zzcabVar);
            }
        });
        return zzcabVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(java.lang.String str, boolean z, java.lang.String str2, int i) {
        this.zzn.put(str, new com.google.android.gms.internal.ads.zzbln(str, z, i, str2));
    }

    final /* synthetic */ java.lang.Object zzf(com.google.android.gms.internal.ads.zzfgw zzfgwVar) throws java.lang.Exception {
        this.zze.zzc(true);
        zzfgwVar.zzg(true);
        this.zzp.zzb(zzfgwVar.zzm());
        return null;
    }

    public final java.util.List zzg() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.zzn.keySet()) {
            com.google.android.gms.internal.ads.zzbln zzblnVar = (com.google.android.gms.internal.ads.zzbln) this.zzn.get(str);
            arrayList.add(new com.google.android.gms.internal.ads.zzbln(str, zzblnVar.zzb, zzblnVar.zzc, zzblnVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new java.lang.Exception());
        }
    }

    final /* synthetic */ void zzn(java.lang.String str, com.google.android.gms.internal.ads.zzblr zzblrVar, com.google.android.gms.internal.ads.zzfdh zzfdhVar, java.util.List list) {
        try {
            try {
                if (java.util.Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzblrVar.zzf();
                    return;
                }
                android.content.Context context = (android.content.Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfdhVar.zzi(context, zzblrVar, list);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            }
        } catch (android.os.RemoteException e2) {
            throw new com.google.android.gms.internal.ads.zzfvl(e2);
        } catch (com.google.android.gms.internal.ads.zzfcq unused) {
            zzblrVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    final /* synthetic */ void zzo(final com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zzi.execute(new java.lang.Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdtu
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String strZzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
                boolean zIsEmpty = android.text.TextUtils.isEmpty(strZzc);
                com.google.android.gms.internal.ads.zzcab zzcabVar2 = zzcabVar;
                if (zIsEmpty) {
                    zzcabVar2.zzd(new java.lang.Exception());
                } else {
                    zzcabVar2.zzc(strZzc);
                }
            }
        });
    }

    final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    final /* synthetic */ void zzq(java.lang.Object obj, com.google.android.gms.internal.ads.zzcab zzcabVar, java.lang.String str, long j, com.google.android.gms.internal.ads.zzfgw zzfgwVar) {
        synchronized (obj) {
            if (!zzcabVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zzp;
                zzfgwVar.zzc(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.MSG_TIMEOUT);
                zzfgwVar.zzg(false);
                zzfhkVar.zzb(zzfgwVar.zzm());
                zzcabVar.zzc(false);
            }
        }
    }

    public final void zzr() {
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzber.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbV)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdtw
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    com.google.common.util.concurrent.ListenableFuture listenableFutureZzu = zzu();
                    this.zzk.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdtp
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzm();
                        }
                    }, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbX)).longValue(), java.util.concurrent.TimeUnit.SECONDS);
                    com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzu, new com.google.android.gms.internal.ads.zzdty(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(false);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final com.google.android.gms.internal.ads.zzblu zzbluVar) {
        this.zze.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdtt
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.zzdua zzduaVar = this.zza;
                try {
                    zzbluVar.zzb(zzduaVar.zzg());
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
