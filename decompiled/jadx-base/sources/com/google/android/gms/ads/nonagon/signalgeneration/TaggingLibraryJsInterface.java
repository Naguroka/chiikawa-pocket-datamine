package com.google.android.gms.ads.nonagon.signalgeneration;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class TaggingLibraryJsInterface {
    private final android.content.Context zza;
    private final android.webkit.WebView zzb;
    private final com.google.android.gms.internal.ads.zzava zzc;
    private final com.google.android.gms.internal.ads.zzfcn zzd;
    private final int zze;
    private final com.google.android.gms.internal.ads.zzdsb zzf;
    private final boolean zzg;
    private final com.google.android.gms.internal.ads.zzgcs zzh = com.google.android.gms.internal.ads.zzbzw.zzf;
    private final com.google.android.gms.internal.ads.zzfja zzi;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzo zzj;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzf zzk;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzl;

    TaggingLibraryJsInterface(android.webkit.WebView webView, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.internal.ads.zzdsb zzdsbVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzfcn zzfcnVar, com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar, com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar) {
        this.zzb = webView;
        android.content.Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzavaVar;
        this.zzf = zzdsbVar;
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        this.zze = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjv)).intValue();
        this.zzg = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjw)).booleanValue();
        this.zzi = zzfjaVar;
        this.zzd = zzfcnVar;
        this.zzj = zzoVar;
        this.zzk = zzfVar;
        this.zzl = zzjVar;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getClickSignals(java.lang.String str) {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            java.lang.String strZzd = this.zzc.zzc().zzd(this.zza, str, this.zzb);
            if (this.zzg) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zzf, null, "csg", new android.util.Pair("clat", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzd;
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    public java.lang.String getClickSignalsWithTimeout(final java.lang.String str, int i) {
        if (i <= 0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (java.lang.String) com.google.android.gms.internal.ads.zzbzw.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbq
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(java.lang.Math.min(i, this.zze), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof java.util.concurrent.TimeoutException ? "17" : "";
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getQueryInfo() {
        com.google.android.gms.ads.internal.zzv.zzq();
        java.lang.String string = java.util.UUID.randomUUID().toString();
        final android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final com.google.android.gms.ads.nonagon.signalgeneration.zzbu zzbuVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzbu(this, string);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzc.zze()).booleanValue()) {
            this.zzj.zzg(this.zzb, zzbuVar);
        } else {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjy)).booleanValue()) {
                this.zzh.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze(bundle, zzbuVar);
                    }
                });
            } else {
                com.google.android.gms.ads.query.QueryInfo.generate(this.zza, com.google.android.gms.ads.AdFormat.BANNER, new com.google.android.gms.ads.AdRequest.Builder().addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle).build(), zzbuVar);
            }
        }
        return string;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getViewSignals() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            java.lang.String strZzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzg) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zzf, null, "vsg", new android.util.Pair("vlat", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzh;
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    public java.lang.String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (java.lang.String) com.google.android.gms.internal.ads.zzbzw.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbo
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(java.lang.Math.min(i, this.zze), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof java.util.concurrent.TimeoutException ? "17" : "";
        }
    }

    @android.webkit.JavascriptInterface
    public void recordClick(final java.lang.String str) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjA)).booleanValue() || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(str);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void reportTouchEvent(java.lang.String str) {
        int i;
        int i2;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int i3 = jSONObject.getInt("x");
            int i4 = jSONObject.getInt("y");
            int i5 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i6 = jSONObject.getInt("type");
            try {
                if (i6 != 0) {
                    int i7 = 1;
                    if (i6 != 1) {
                        i7 = 2;
                        if (i6 != 2) {
                            i7 = 3;
                            i2 = i6 != 3 ? -1 : 0;
                            this.zzc.zzd(android.view.MotionEvent.obtain(0L, i5, i, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                            return;
                        }
                    }
                    i = i7;
                    this.zzc.zzd(android.view.MotionEvent.obtain(0L, i5, i, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                    return;
                }
                this.zzc.zzd(android.view.MotionEvent.obtain(0L, i5, i, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            } catch (java.lang.RuntimeException e) {
                e = e;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            } catch (org.json.JSONException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            }
            i = i2;
        } catch (java.lang.RuntimeException | org.json.JSONException e3) {
            e = e3;
        }
    }

    final /* synthetic */ void zze(android.os.Bundle bundle, com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        android.webkit.CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzv.zzr().zza(this.zza);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(this.zzb) : false);
        com.google.android.gms.ads.query.QueryInfo.generate(this.zza, com.google.android.gms.ads.AdFormat.BANNER, new com.google.android.gms.ads.AdRequest.Builder().addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    final /* synthetic */ void zzf(java.lang.String str) {
        com.google.android.gms.internal.ads.zzfcn zzfcnVar;
        android.net.Uri uriZza = android.net.Uri.parse(str);
        try {
            uriZza = (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlR)).booleanValue() || (zzfcnVar = this.zzd) == null) ? this.zzc.zza(uriZza, this.zza, this.zzb, null) : zzfcnVar.zza(uriZza, this.zza, this.zzb, null);
        } catch (com.google.android.gms.internal.ads.zzavb e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzd(uriZza.toString(), null, null);
    }
}
