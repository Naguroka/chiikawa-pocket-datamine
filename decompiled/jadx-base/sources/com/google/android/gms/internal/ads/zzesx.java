package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzesx implements com.google.android.gms.internal.ads.zzetr {
    public static final /* synthetic */ int zzb = 0;
    private static final com.google.android.gms.internal.ads.zzesy zzc = new com.google.android.gms.internal.ads.zzesy(new org.json.JSONArray().toString(), new android.os.Bundle());
    final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzgcs zzd;
    private final java.util.concurrent.ScheduledExecutorService zze;
    private final com.google.android.gms.internal.ads.zzejj zzf;
    private final android.content.Context zzg;
    private final com.google.android.gms.internal.ads.zzfcj zzh;
    private final com.google.android.gms.internal.ads.zzejf zzi;
    private final com.google.android.gms.internal.ads.zzdpm zzj;
    private final com.google.android.gms.internal.ads.zzduc zzk;
    private final int zzl;

    zzesx(com.google.android.gms.internal.ads.zzgcs zzgcsVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.String str, com.google.android.gms.internal.ads.zzejj zzejjVar, android.content.Context context, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzejf zzejfVar, com.google.android.gms.internal.ads.zzdpm zzdpmVar, com.google.android.gms.internal.ads.zzduc zzducVar, int i) {
        this.zzd = zzgcsVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzejjVar;
        this.zzg = context;
        this.zzh = zzfcjVar;
        this.zzi = zzejfVar;
        this.zzj = zzdpmVar;
        this.zzk = zzducVar;
        this.zzl = i;
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzesx zzesxVar) {
        java.lang.String lowerCase = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkM)).booleanValue() ? zzesxVar.zzh.zzf.toLowerCase(java.util.Locale.ROOT) : zzesxVar.zzh.zzf;
        final android.os.Bundle bundleZzg = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbL)).booleanValue() ? zzesxVar.zzk.zzg() : new android.os.Bundle();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbU)).booleanValue()) {
            zzesxVar.zzi(arrayList, zzesxVar.zzf.zza(zzesxVar.zza, lowerCase));
        } else {
            for (java.util.Map.Entry entry : ((com.google.android.gms.internal.ads.zzfxq) zzesxVar.zzf.zzb(zzesxVar.zza, lowerCase)).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                arrayList.add(zzesxVar.zzg(str, (java.util.List) entry.getValue(), zzesxVar.zzf(str), true, true));
            }
            zzesxVar.zzi(arrayList, zzesxVar.zzf.zzc());
        }
        return com.google.android.gms.internal.ads.zzgch.zzb(arrayList).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzess
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                int i = com.google.android.gms.internal.ads.zzesx.zzb;
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.google.common.util.concurrent.ListenableFuture listenableFuture : arrayList) {
                    if (((org.json.JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new com.google.android.gms.internal.ads.zzesy(jSONArray.toString(), bundleZzg);
            }
        }, zzesxVar.zzd);
    }

    private final android.os.Bundle zzf(java.lang.String str) {
        android.os.Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final com.google.android.gms.internal.ads.zzgby zzg(final java.lang.String str, final java.util.List list, final android.os.Bundle bundle, final boolean z, final boolean z2) {
        com.google.android.gms.internal.ads.zzgby zzgbyVarZzu = com.google.android.gms.internal.ads.zzgby.zzu(com.google.android.gms.internal.ads.zzgch.zzk(new com.google.android.gms.internal.ads.zzgbn() { // from class: com.google.android.gms.internal.ads.zzesu
            @Override // com.google.android.gms.internal.ads.zzgbn
            public final com.google.common.util.concurrent.ListenableFuture zza() {
                return this.zza.zzd(str, list, bundle, z, z2);
            }
        }, this.zzd));
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbH)).booleanValue()) {
            zzgbyVarZzu = (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zzo(zzgbyVarZzu, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbA)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zze);
        }
        return (com.google.android.gms.internal.ads.zzgby) com.google.android.gms.internal.ads.zzgch.zze(zzgbyVarZzu, java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzesv
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.String str2 = str;
                java.lang.Throwable th = (java.lang.Throwable) obj;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error calling adapter: ".concat(java.lang.String.valueOf(str2)));
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzmR)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "rtbSignal.fetchRtbJsonInfo-".concat(java.lang.String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "rtbSignal.fetchRtbJsonInfo-".concat(java.lang.String.valueOf(str2)));
                return null;
            }
        }, this.zzd);
    }

    private final void zzh(com.google.android.gms.internal.ads.zzbrd zzbrdVar, android.os.Bundle bundle, java.util.List list, com.google.android.gms.internal.ads.zzejm zzejmVar) throws android.os.RemoteException {
        zzbrdVar.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzg), this.zza, bundle, (android.os.Bundle) list.get(0), this.zzh.zze, zzejmVar);
    }

    private final void zzi(java.util.List list, java.util.Map map) {
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzejn zzejnVar = (com.google.android.gms.internal.ads.zzejn) ((java.util.Map.Entry) it.next()).getValue();
            java.lang.String str = zzejnVar.zza;
            list.add(zzg(str, java.util.Collections.singletonList(zzejnVar.zze), zzf(str), zzejnVar.zzb, zzejnVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        if (this.zzl == 2) {
            return com.google.android.gms.internal.ads.zzgch.zzh(zzc);
        }
        com.google.android.gms.internal.ads.zzfcj zzfcjVar = this.zzh;
        if (zzfcjVar.zzr) {
            if (!java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbN)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfcjVar.zzd)))) {
                return com.google.android.gms.internal.ads.zzgch.zzh(zzc);
            }
        }
        return com.google.android.gms.internal.ads.zzgch.zzk(new com.google.android.gms.internal.ads.zzgbn() { // from class: com.google.android.gms.internal.ads.zzesr
            @Override // com.google.android.gms.internal.ads.zzgbn
            public final com.google.common.util.concurrent.ListenableFuture zza() {
                return com.google.android.gms.internal.ads.zzesx.zzc(this.zza);
            }
        }, this.zzd);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String str, final java.util.List list, final android.os.Bundle bundle, boolean z, boolean z2) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzbrd zzbrdVarZzb;
        final com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        if (z2) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbM)).booleanValue()) {
                try {
                    zzbrdVarZzb = this.zzj.zzb(str);
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
                    zzbrdVarZzb = null;
                }
            } else {
                this.zzi.zzb(str);
                zzbrdVarZzb = this.zzi.zza(str);
            }
        } else {
            zzbrdVarZzb = this.zzj.zzb(str);
        }
        if (zzbrdVarZzb == null) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbC)).booleanValue()) {
                throw null;
            }
            com.google.android.gms.internal.ads.zzejm.zzb(str, zzcabVar);
        } else {
            final com.google.android.gms.internal.ads.zzejm zzejmVar = new com.google.android.gms.internal.ads.zzejm(str, zzbrdVarZzb, zzcabVar, com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbH)).booleanValue()) {
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.zze;
                java.util.Objects.requireNonNull(zzejmVar);
                scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzesw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzejmVar.zzc();
                    }
                }, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbA)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            if (z) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbO)).booleanValue()) {
                    final com.google.android.gms.internal.ads.zzbrd zzbrdVar = zzbrdVarZzb;
                    this.zzd.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzest
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze(zzbrdVar, bundle, list, zzejmVar, zzcabVar);
                        }
                    });
                } else {
                    zzh(zzbrdVarZzb, bundle, list, zzejmVar);
                }
            } else {
                zzejmVar.zzd();
            }
        }
        return zzcabVar;
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzbrd zzbrdVar, android.os.Bundle bundle, java.util.List list, com.google.android.gms.internal.ads.zzejm zzejmVar, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        try {
            zzh(zzbrdVar, bundle, list, zzejmVar);
        } catch (android.os.RemoteException e) {
            zzcabVar.zzd(e);
        }
    }
}
