package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzefq implements com.google.android.gms.internal.ads.zzefk {
    private final com.google.android.gms.internal.ads.zzdgq zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;
    private final com.google.android.gms.internal.ads.zzdla zzc;
    private final com.google.android.gms.internal.ads.zzfdi zzd;
    private final com.google.android.gms.internal.ads.zzdnr zze;
    private final com.google.android.gms.internal.ads.zzdrq zzf;

    public zzefq(com.google.android.gms.internal.ads.zzdgq zzdgqVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzdla zzdlaVar, com.google.android.gms.internal.ads.zzfdi zzfdiVar, com.google.android.gms.internal.ads.zzdnr zzdnrVar, com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        this.zza = zzdgqVar;
        this.zzb = zzgcsVar;
        this.zzc = zzdlaVar;
        this.zzd = zzfdiVar;
        this.zze = zzdnrVar;
        this.zzf = zzdrqVar;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzg(final com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar, final org.json.JSONObject jSONObject) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            this.zzf.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzfdi zzfdiVar = this.zzd;
        com.google.android.gms.internal.ads.zzdla zzdlaVar = this.zzc;
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZza = zzfdiVar.zza();
        final com.google.common.util.concurrent.ListenableFuture listenableFutureZza2 = zzdlaVar.zza(zzfcaVar, zzfboVar, jSONObject);
        return com.google.android.gms.internal.ads.zzgch.zzc(listenableFutureZza, listenableFutureZza2).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc(listenableFutureZza2, listenableFutureZza, zzfcaVar, zzfboVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzfca zzfcaVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        return com.google.android.gms.internal.ads.zzgch.zzn(com.google.android.gms.internal.ads.zzgch.zzn(this.zzd.zza(), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzefn
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zze(zzfboVar, (com.google.android.gms.internal.ads.zzdnl) obj);
            }
        }, this.zzb), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzf(zzfcaVar, zzfboVar, (org.json.JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.android.gms.internal.ads.zzfbt zzfbtVar = zzfboVar.zzs;
        return (zzfbtVar == null || zzfbtVar.zzc == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.internal.ads.zzdia zzc(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.common.util.concurrent.ListenableFuture listenableFuture2, com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, org.json.JSONObject jSONObject) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzdif zzdifVar = (com.google.android.gms.internal.ads.zzdif) listenableFuture.get();
        com.google.android.gms.internal.ads.zzdnl zzdnlVar = (com.google.android.gms.internal.ads.zzdnl) listenableFuture2.get();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            this.zzf.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzdig zzdigVarZzd = this.zza.zzd(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, null), new com.google.android.gms.internal.ads.zzdir(zzdifVar), new com.google.android.gms.internal.ads.zzdhd(jSONObject, zzdnlVar));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            this.zzf.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_AD_COMPONENT_CREATION_END.zza(), jCurrentTimeMillis);
            this.zzf.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_CONFIGURE_WEBVIEW_START.zza(), jCurrentTimeMillis);
        }
        zzdigVarZzd.zzh().zzb();
        zzdigVarZzd.zzi().zza(zzdnlVar);
        zzdigVarZzd.zzg().zza(zzdifVar.zzs());
        zzdigVarZzd.zzl().zza(this.zze, zzdifVar.zzq());
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcm)).booleanValue()) {
            this.zzf.zza().putLong(com.google.android.gms.internal.ads.zzdre.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
        return zzdigVarZzd.zza();
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzdnl zzdnlVar, org.json.JSONObject jSONObject) throws java.lang.Exception {
        this.zzd.zzb(com.google.android.gms.internal.ads.zzgch.zzh(zzdnlVar));
        if (jSONObject.optBoolean("success")) {
            return com.google.android.gms.internal.ads.zzgch.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new com.google.android.gms.internal.ads.zzbnv("process json failed");
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzfbo zzfboVar, final com.google.android.gms.internal.ads.zzdnl zzdnlVar) throws java.lang.Exception {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isNonagon", true);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziA)).booleanValue() && com.google.android.gms.common.util.PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.json.hs.n, zzfboVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return com.google.android.gms.internal.ads.zzgch.zzn(zzdnlVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzd(zzdnlVar, (org.json.JSONObject) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, org.json.JSONArray jSONArray) throws java.lang.Exception {
        if (jSONArray.length() == 0) {
            return com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzdvy(3));
        }
        if (zzfcaVar.zza.zza.zzk <= 1) {
            return com.google.android.gms.internal.ads.zzgch.zzm(zzg(zzfcaVar, zzfboVar, jSONArray.getJSONObject(0)), new com.google.android.gms.internal.ads.zzfuc() { // from class: com.google.android.gms.internal.ads.zzefp
                @Override // com.google.android.gms.internal.ads.zzfuc
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.util.Collections.singletonList(com.google.android.gms.internal.ads.zzgch.zzh((com.google.android.gms.internal.ads.zzdia) obj));
                }
            }, this.zzb);
        }
        int length = jSONArray.length();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcn)).booleanValue()) {
            this.zzf.zzc("nsl", java.lang.String.valueOf(length));
        }
        this.zzd.zzc(java.lang.Math.min(length, zzfcaVar.zza.zza.zzk));
        java.util.ArrayList arrayList = new java.util.ArrayList(zzfcaVar.zza.zza.zzk);
        for (int i = 0; i < zzfcaVar.zza.zza.zzk; i++) {
            if (i < length) {
                arrayList.add(zzg(zzfcaVar, zzfboVar, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzdvy(3)));
            }
        }
        return com.google.android.gms.internal.ads.zzgch.zzh(arrayList);
    }
}
