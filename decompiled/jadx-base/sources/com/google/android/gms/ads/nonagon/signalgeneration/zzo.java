package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzo {
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.Map zzb = new java.util.HashMap();
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzdsb zzd;
    private final java.util.concurrent.ExecutorService zze;

    zzo(android.content.Context context, com.google.android.gms.internal.ads.zzdsb zzdsbVar, java.util.concurrent.ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzdsbVar;
        this.zze = executorService;
    }

    private final void zzh(final boolean z) {
        java.util.Map map = this.zzb;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        this.zzb.put(boolValueOf, new java.util.ArrayList());
        this.zze.submit(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(z);
            }
        });
    }

    private final void zzi(com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVar, android.util.Pair pair, boolean z) {
        zzqVar.zzd();
        com.google.android.gms.ads.query.QueryInfo queryInfoZzb = zzqVar.zzb();
        if (queryInfoZzb != null) {
            ((com.google.android.gms.ads.query.QueryInfoGenerationCallback) pair.first).onSuccess(queryInfoZzb);
        } else {
            ((com.google.android.gms.ads.query.QueryInfoGenerationCallback) pair.first).onFailure(zzqVar.zzc());
        }
        com.google.android.gms.internal.ads.zzdsb zzdsbVar = this.zzd;
        android.util.Pair[] pairArr = new android.util.Pair[7];
        pairArr[0] = new android.util.Pair("se", "query_g");
        pairArr[1] = new android.util.Pair(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.ads.AdFormat.BANNER.name());
        pairArr[2] = new android.util.Pair("rtype", java.lang.Integer.toString(6));
        pairArr[3] = new android.util.Pair("scar", com.json.mediationsdk.metadata.a.g);
        pairArr[4] = new android.util.Pair("lat_ms", java.lang.Long.toString(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - ((java.lang.Long) pair.second).longValue()));
        pairArr[5] = new android.util.Pair("sgpc_h", java.lang.Boolean.toString(z));
        pairArr[6] = new android.util.Pair("sgpc_rs", java.lang.Boolean.toString(zzqVar.zzb() != null));
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(zzdsbVar, null, "sgpcr", pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzd(boolean z, boolean z2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        bundle.putBoolean("accept_3p_cookie", z);
        java.util.Map map = this.zza;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzq) map.get(boolValueOf);
        int iZza = 0;
        if (z2 && zzqVar != null) {
            iZza = zzqVar.zza() + 1;
        }
        int i = iZza;
        com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVar2 = (com.google.android.gms.ads.nonagon.signalgeneration.zzq) this.zza.get(boolValueOf);
        final com.google.android.gms.ads.nonagon.signalgeneration.zzp zzpVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzp(this, z, i, zzqVar2 == null ? null : java.lang.Boolean.valueOf(zzqVar2.zzf()), this.zzd);
        final com.google.android.gms.ads.AdRequest adRequestBuild = new com.google.android.gms.ads.AdRequest.Builder().addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle).build();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkV)).booleanValue()) {
            this.zze.submit(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.zza.zza(adRequestBuild, zzpVar);
                }
            });
        } else {
            com.google.android.gms.ads.query.QueryInfo.generate(this.zzc, com.google.android.gms.ads.AdFormat.BANNER, adRequestBuild, zzpVar);
        }
    }

    final /* synthetic */ java.lang.Object zza(com.google.android.gms.ads.AdRequest adRequest, com.google.android.gms.ads.nonagon.signalgeneration.zzp zzpVar) throws java.lang.Exception {
        com.google.android.gms.ads.query.QueryInfo.generate(this.zzc, com.google.android.gms.ads.AdFormat.BANNER, adRequest, zzpVar);
        return true;
    }

    public final synchronized void zzb() {
        zzh(true);
        zzh(false);
    }

    final /* synthetic */ void zzc(boolean z) {
        zzd(z, false);
    }

    final /* synthetic */ void zze(java.lang.Object obj, android.util.Pair pair) {
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof android.webkit.WebView) {
            android.webkit.CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzv.zzr().zza(this.zzc);
            if (cookieManagerZza != null) {
                zAcceptThirdPartyCookies = cookieManagerZza.acceptThirdPartyCookies((android.webkit.WebView) obj);
            }
        }
        java.util.Map map = this.zza;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zAcceptThirdPartyCookies);
        com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzq) map.get(boolValueOf);
        if (zzqVar != null && !zzqVar.zze()) {
            zzi(zzqVar, pair, true);
            return;
        }
        java.util.List arrayList = (java.util.List) this.zzb.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.zzb.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    final synchronized void zzf(final boolean z, com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVar) {
        java.util.Map map = this.zza;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVar2 = (com.google.android.gms.ads.nonagon.signalgeneration.zzq) map.get(boolValueOf);
        if (zzqVar2 == null || zzqVar2.zze() || zzqVar2.zzb() == null || zzqVar.zzb() != null) {
            this.zza.put(boolValueOf, zzqVar);
        }
        long jLongValue = (zzqVar.zzb() != null ? (java.lang.Long) com.google.android.gms.internal.ads.zzbeq.zzd.zze() : (java.lang.Long) com.google.android.gms.internal.ads.zzbeq.zze.zze()).longValue();
        final boolean z2 = zzqVar.zzb() == null;
        com.google.android.gms.internal.ads.zzbzw.zzd.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(z, z2);
            }
        }, jLongValue, java.util.concurrent.TimeUnit.SECONDS);
        java.util.List list = (java.util.List) this.zzb.get(boolValueOf);
        this.zzb.put(boolValueOf, new java.util.ArrayList());
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                zzi(zzqVar, (android.util.Pair) it.next(), false);
            }
        }
    }

    public final synchronized void zzg(final java.lang.Object obj, com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final android.util.Pair pair = new android.util.Pair(queryInfoGenerationCallback, java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
        com.google.android.gms.internal.ads.zzbzw.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze(obj, pair);
            }
        });
    }
}
