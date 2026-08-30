package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbdq {
    private final java.util.concurrent.ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzo zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzf zzc;
    private final com.google.android.gms.internal.ads.zzdsb zzd;
    private java.lang.Runnable zze;
    private com.google.android.gms.internal.ads.zzbdn zzf;
    private androidx.browser.customtabs.CustomTabsSession zzg;
    private java.lang.String zzh;
    private long zzi = 0;
    private long zzj;
    private org.json.JSONArray zzk;
    private android.content.Context zzl;

    public zzbdq(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar, com.google.android.gms.internal.ads.zzdsb zzdsbVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzoVar;
        this.zzc = zzfVar;
        this.zzd = zzdsbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjJ)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj() {
        com.google.android.gms.internal.ads.zzbdn zzbdnVar = this.zzf;
        if (zzbdnVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (zzbdnVar.zza().booleanValue()) {
            return;
        }
        if (this.zzh != null && this.zzg != null && this.zza != null) {
            if (this.zzi == 0 || com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() > this.zzi) {
            }
            this.zzg.requestPostMessageChannel(android.net.Uri.parse(this.zzh));
            this.zza.schedule(this.zze, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjK)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("PACT max retry connection duration timed out");
    }

    private final void zzk(org.json.JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new org.json.JSONArray((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjM));
            }
            jSONObject.put("eids", this.zzk);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching the PACT active eids JSON: ", e);
        }
    }

    @javax.annotation.Nullable
    public final androidx.browser.customtabs.CustomTabsSession zzb() {
        return this.zzg;
    }

    final org.json.JSONObject zzc(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzc.zze()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.zzbeq.zzf.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zza.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zza());
        }
        return jSONObject;
    }

    final org.json.JSONObject zzd(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzc.zze()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.zzbeq.zzf.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zza.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zza());
        }
        return jSONObject;
    }

    final void zzf() {
        this.zzi = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() + ((long) ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjI)).intValue());
        if (this.zze == null) {
            this.zze = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbdo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            };
        }
        zzj();
    }

    final void zzh(java.lang.String str) {
        try {
            androidx.browser.customtabs.CustomTabsSession customTabsSession = this.zzg;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new java.util.Date(this.zzj).toString());
            zzk(jSONObject);
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zza.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.zza());
            }
            customTabsSession.postMessage(jSONObject.toString(), null);
            com.google.android.gms.internal.ads.zzbdp zzbdpVar = new com.google.android.gms.internal.ads.zzbdp(this, str);
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbeq.zzc.zze()).booleanValue()) {
                this.zzb.zzg(this.zzg, zzbdpVar);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            com.google.android.gms.ads.query.QueryInfo.generate(this.zzl, com.google.android.gms.ads.AdFormat.BANNER, new com.google.android.gms.ads.AdRequest.Builder().addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle).build(), zzbdpVar);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating JSON: ", e);
        }
    }

    public final void zzi(long j) {
        this.zzj = j;
    }

    public final void zzg(@javax.annotation.Nonnull android.content.Context context, @javax.annotation.Nonnull androidx.browser.customtabs.CustomTabsClient customTabsClient, @javax.annotation.Nonnull java.lang.String str, @javax.annotation.Nullable androidx.browser.customtabs.CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("App Context parameter is null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new java.lang.IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        com.google.android.gms.internal.ads.zzbdn zzbdnVar = new com.google.android.gms.internal.ads.zzbdn(this, customTabsCallback, this.zzd);
        this.zzf = zzbdnVar;
        androidx.browser.customtabs.CustomTabsSession customTabsSessionNewSession = customTabsClient.newSession(zzbdnVar);
        this.zzg = customTabsSessionNewSession;
        if (customTabsSessionNewSession == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("CustomTabsClient failed to create new session.");
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zzd, null, "pact_action", new android.util.Pair("pe", "pact_init"));
    }
}
