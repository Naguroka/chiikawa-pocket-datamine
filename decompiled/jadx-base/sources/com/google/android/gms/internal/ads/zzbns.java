package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbns {
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.internal.ads.zzfhk zze;
    private final com.google.android.gms.ads.internal.util.zzbd zzf;
    private final com.google.android.gms.ads.internal.util.zzbd zzg;
    private com.google.android.gms.internal.ads.zzbnr zzh;
    private final java.lang.Object zza = new java.lang.Object();
    private int zzi = 1;

    public zzbns(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, com.google.android.gms.ads.internal.util.zzbd zzbdVar, com.google.android.gms.ads.internal.util.zzbd zzbdVar2, com.google.android.gms.internal.ads.zzfhk zzfhkVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfhkVar;
        this.zzf = zzbdVar;
        this.zzg = zzbdVar2;
    }

    public final com.google.android.gms.internal.ads.zzbnm zzb(com.google.android.gms.internal.ads.zzava zzavaVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized (this.zza) {
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                com.google.android.gms.internal.ads.zzbnr zzbnrVar = this.zzh;
                if (zzbnrVar != null && this.zzi == 0) {
                    zzbnrVar.zzj(new com.google.android.gms.internal.ads.zzcaf() { // from class: com.google.android.gms.internal.ads.zzbna
                        @Override // com.google.android.gms.internal.ads.zzcaf
                        public final void zza(java.lang.Object obj) {
                            this.zza.zzk((com.google.android.gms.internal.ads.zzbmn) obj);
                        }
                    }, new com.google.android.gms.internal.ads.zzcad() { // from class: com.google.android.gms.internal.ads.zzbnb
                        @Override // com.google.android.gms.internal.ads.zzcad
                        public final void zza() {
                        }
                    });
                }
            }
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
            com.google.android.gms.internal.ads.zzbnr zzbnrVar2 = this.zzh;
            if (zzbnrVar2 != null && zzbnrVar2.zze() != -1) {
                int i = this.zzi;
                if (i == 0) {
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                    return this.zzh.zza();
                }
                if (i != 1) {
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                    return this.zzh.zza();
                }
                this.zzi = 2;
                zzd(null);
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            this.zzh = zzd(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
            return this.zzh.zza();
        }
    }

    protected final com.google.android.gms.internal.ads.zzbnr zzd(com.google.android.gms.internal.ads.zzava zzavaVar) {
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = com.google.android.gms.internal.ads.zzfgv.zza(this.zzb, 6);
        zzfgwVarZza.zzi();
        final com.google.android.gms.internal.ads.zzbnr zzbnrVar = new com.google.android.gms.internal.ads.zzbnr(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final com.google.android.gms.internal.ads.zzava zzavaVar2 = null;
        com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable(zzavaVar2, zzbnrVar) { // from class: com.google.android.gms.internal.ads.zzbnc
            public final /* synthetic */ com.google.android.gms.internal.ads.zzbnr zzb;

            {
                this.zzb = zzbnrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbnrVar.zzj(new com.google.android.gms.internal.ads.zzbnh(this, zzbnrVar, zzfgwVarZza), new com.google.android.gms.internal.ads.zzbni(this, zzbnrVar, zzfgwVarZza));
        return zzbnrVar;
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.internal.ads.zzbnr zzbnrVar) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            com.google.android.gms.internal.ads.zzbmv zzbmvVar = new com.google.android.gms.internal.ads.zzbmv(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbmvVar.zzk(new com.google.android.gms.internal.ads.zzbmy(this, arrayList, jCurrentTimeMillis, zzbnrVar, zzbmvVar));
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbmvVar.zzq("/jsLoaded", new com.google.android.gms.internal.ads.zzbnd(this, jCurrentTimeMillis, zzbnrVar, zzbmvVar));
            com.google.android.gms.ads.internal.util.zzby zzbyVar = new com.google.android.gms.ads.internal.util.zzby();
            com.google.android.gms.internal.ads.zzbne zzbneVar = new com.google.android.gms.internal.ads.zzbne(this, null, zzbmvVar, zzbyVar);
            zzbyVar.zzb(zzbneVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbmvVar.zzq("/requestReload", zzbneVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(java.lang.String.valueOf(this.zzc)));
            if (this.zzc.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbmvVar.zzh(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.zzc.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbmvVar.zzf(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbmvVar.zzg(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new com.google.android.gms.internal.ads.zzbng(this, zzbnrVar, zzbmvVar, arrayList, jCurrentTimeMillis), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzc)).intValue());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating webview.", th);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhB)).booleanValue()) {
                zzbnrVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhD)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnrVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnrVar.zzg();
            }
        }
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzbnr zzbnrVar, final com.google.android.gms.internal.ads.zzbmn zzbmnVar, java.util.ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbnrVar.zze() != -1 && zzbnrVar.zze() != 1) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhB)).booleanValue()) {
                    zzbnrVar.zzh(new java.util.concurrent.TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                } else {
                    zzbnrVar.zzg();
                }
                com.google.android.gms.internal.ads.zzgcs zzgcsVar = com.google.android.gms.internal.ads.zzbzw.zzf;
                java.util.Objects.requireNonNull(zzbmnVar);
                zzgcsVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbmx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmnVar.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + java.lang.String.valueOf(com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzb)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbnrVar.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + java.lang.String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - j) + " ms. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzbmn zzbmnVar) {
        if (zzbmnVar.zzi()) {
            this.zzi = 1;
        }
    }
}
