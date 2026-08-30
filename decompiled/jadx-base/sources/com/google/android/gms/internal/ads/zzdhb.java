package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzdhb implements com.google.android.gms.internal.ads.zzdin {
    private com.google.android.gms.ads.internal.client.zzdd zzC;
    private final com.google.android.gms.internal.ads.zzdjh zzD;
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdiq zzb;
    private final org.json.JSONObject zzc;
    private final com.google.android.gms.internal.ads.zzdnl zzd;
    private final com.google.android.gms.internal.ads.zzdif zze;
    private final com.google.android.gms.internal.ads.zzava zzf;
    private final com.google.android.gms.internal.ads.zzcwl zzg;
    private final com.google.android.gms.internal.ads.zzcvr zzh;
    private final com.google.android.gms.internal.ads.zzddq zzi;
    private final com.google.android.gms.internal.ads.zzfbo zzj;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzk;
    private final com.google.android.gms.internal.ads.zzfcj zzl;
    private final com.google.android.gms.internal.ads.zzcnh zzm;
    private final com.google.android.gms.internal.ads.zzdjl zzn;
    private final com.google.android.gms.common.util.Clock zzo;
    private final com.google.android.gms.internal.ads.zzddm zzp;
    private final com.google.android.gms.internal.ads.zzfja zzq;
    private final com.google.android.gms.internal.ads.zzdpb zzr;
    private final com.google.android.gms.internal.ads.zzfhh zzs;
    private final com.google.android.gms.internal.ads.zzebv zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private android.graphics.Point zzy = new android.graphics.Point();
    private android.graphics.Point zzz = new android.graphics.Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdhb(android.content.Context context, com.google.android.gms.internal.ads.zzdiq zzdiqVar, org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzdnl zzdnlVar, com.google.android.gms.internal.ads.zzdif zzdifVar, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.internal.ads.zzcwl zzcwlVar, com.google.android.gms.internal.ads.zzcvr zzcvrVar, com.google.android.gms.internal.ads.zzddq zzddqVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzcnh zzcnhVar, com.google.android.gms.internal.ads.zzdjl zzdjlVar, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzddm zzddmVar, com.google.android.gms.internal.ads.zzfja zzfjaVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzebv zzebvVar, com.google.android.gms.internal.ads.zzdpb zzdpbVar, com.google.android.gms.internal.ads.zzdjh zzdjhVar) {
        this.zza = context;
        this.zzb = zzdiqVar;
        this.zzc = jSONObject;
        this.zzd = zzdnlVar;
        this.zze = zzdifVar;
        this.zzf = zzavaVar;
        this.zzg = zzcwlVar;
        this.zzh = zzcvrVar;
        this.zzi = zzddqVar;
        this.zzj = zzfboVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzfcjVar;
        this.zzm = zzcnhVar;
        this.zzn = zzdjlVar;
        this.zzo = clock;
        this.zzp = zzddmVar;
        this.zzq = zzfjaVar;
        this.zzs = zzfhhVar;
        this.zzt = zzebvVar;
        this.zzr = zzdpbVar;
        this.zzD = zzdjhVar;
    }

    private final java.lang.String zzE(android.view.View view) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdE)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, null);
        } catch (java.lang.Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting data.");
            return null;
        }
    }

    private final java.lang.String zzF(android.view.View view, java.util.Map map) {
        if (map != null && view != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (view.equals((android.view.View) ((java.lang.ref.WeakReference) entry.getValue()).get())) {
                    return (java.lang.String) entry.getKey();
                }
            }
        }
        int iZzc = this.zze.zzc();
        if (iZzc == 1) {
            return "1099";
        }
        if (iZzc == 2) {
            return "2099";
        }
        if (iZzc != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzG(java.lang.String str) {
        org.json.JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean zzH() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzI(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, java.lang.String str, org.json.JSONObject jSONObject5, boolean z, android.view.View view) {
        try {
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdE)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            android.content.Context context = this.zza;
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            com.google.android.gms.ads.internal.zzv.zzq();
            android.util.DisplayMetrics displayMetricsZzu = com.google.android.gms.ads.internal.util.zzs.zzu((android.view.WindowManager) context.getSystemService("window"));
            com.google.android.gms.internal.ads.zzdha zzdhaVar = null;
            try {
                jSONObject7.put("width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, displayMetricsZzu.widthPixels));
                jSONObject7.put("height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, displayMetricsZzu.heightPixels));
            } catch (org.json.JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzix)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new com.google.android.gms.internal.ads.zzdgy(this, zzdhaVar));
            } else {
                this.zzd.zzl("/logScionEvent", new com.google.android.gms.internal.ads.zzdgx(this, zzdhaVar));
            }
            this.zzd.zzl("/nativeImpression", new com.google.android.gms.internal.ads.zzdgz(this, view, zzdhaVar));
            com.google.android.gms.internal.ads.zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzu) {
                return true;
            }
            com.google.android.gms.internal.ads.zzfbo zzfboVar = this.zzj;
            this.zzu = com.google.android.gms.ads.internal.zzv.zzt().zzn(this.zza, this.zzk.afmaVersion, zzfboVar.zzC.toString(), this.zzl.zzf);
            return true;
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzA(android.view.View view, java.util.Map map) {
        this.zzy = new android.graphics.Point();
        this.zzz = new android.graphics.Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzB() {
        if (zza() == 0) {
            return true;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzls)).booleanValue()) {
            return this.zzl.zzi.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzC() {
        return zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzD(android.os.Bundle bundle) {
        if (zzG("impression_reporting")) {
            return zzI(null, null, null, null, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlo)).booleanValue() ? zzE(null) : null, com.google.android.gms.ads.internal.client.zzbc.zzb().zzk(bundle, null), false, null);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzls)).booleanValue()) {
            return this.zzl.zzi.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final org.json.JSONObject zze(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        android.content.Context context = this.zza;
        org.json.JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view, scaleType);
        org.json.JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbv.zzg(context, view);
        org.json.JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view);
        org.json.JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzg);
            jSONObject.put("scroll_view_signal", jSONObjectZzf);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final org.json.JSONObject zzf(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        org.json.JSONObject jSONObjectZze = zze(view, map, map2, scaleType);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (this.zzx && zzH()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZze != null) {
                jSONObject.put("nas", jSONObjectZze);
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzh() {
        try {
            com.google.android.gms.ads.internal.client.zzdd zzddVar = this.zzC;
            if (zzddVar != null) {
                zzddVar.zze();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzi() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzj() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzl(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z, android.widget.ImageView.ScaleType scaleType) {
        android.content.Context context = this.zza;
        org.json.JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view2, scaleType);
        org.json.JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbv.zzg(context, view2);
        org.json.JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view2);
        org.json.JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view2);
        java.lang.String strZzF = zzF(view, map);
        zzo(true == ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdL)).booleanValue() ? view2 : view, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzF, com.google.android.gms.ads.internal.util.zzbv.zzc(strZzF, context, this.zzz, this.zzy), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzm(java.lang.String str) {
        zzo(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzn(android.os.Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Click data is null. No click is reported.");
        } else if (!zzG("click_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            android.os.Bundle bundle2 = bundle.getBundle("click_signal");
            zzo(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzbc.zzb().zzk(bundle, null), false, false);
        }
    }

    protected final void zzo(android.view.View view, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, java.lang.String str, org.json.JSONObject jSONObject5, org.json.JSONObject jSONObject6, boolean z, boolean z2) {
        java.lang.String strZzd;
        try {
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            org.json.JSONObject jSONObject8 = new org.json.JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z);
            com.google.android.gms.internal.ads.zzbfl zzbflVar = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbflVar != null && zzbflVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.zze.zzH().isEmpty() || this.zze.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put(com.ironsource.aa.a.d, this.zzo.currentTimeMillis());
            if (this.zzx && zzH()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            try {
                org.json.JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new org.json.JSONObject();
                }
                strZzd = this.zzf.zzc().zzd(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (java.lang.Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception obtaining click signals", e);
                strZzd = null;
            }
            jSONObject8.put("click_signals", strZzd);
            jSONObject8.put("open_chrome_custom_tab", true);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziB)).booleanValue() && com.google.android.gms.common.util.PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziC)).booleanValue() && com.google.android.gms.common.util.PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put(com.json.z8.CLICK, jSONObject8);
            org.json.JSONObject jSONObject9 = new org.json.JSONObject();
            long jCurrentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", jCurrentTimeMillis - this.zzA);
            jSONObject9.put("time_from_last_touch", jCurrentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.zzj.zzb()) {
                org.json.JSONObject jSONObject10 = (org.json.JSONObject) this.zzc.get("tracking_urls_and_actions");
                java.lang.String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzq(string, this.zze);
                }
            }
            com.google.android.gms.internal.ads.zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (org.json.JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzp(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z, android.widget.ImageView.ScaleType scaleType, int i) {
        org.json.JSONObject jSONObject;
        boolean z2 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzls)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzx) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzH()) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        org.json.JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbv.zzd(this.zza, map, map2, view2, scaleType);
        org.json.JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbv.zzg(this.zza, view2);
        org.json.JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view2);
        org.json.JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbv.zze(this.zza, view2);
        java.lang.String strZzF = zzF(view, map);
        org.json.JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbv.zzc(strZzF, this.zza, this.zzz, this.zzy);
        if (z2) {
            try {
                org.json.JSONObject jSONObject2 = this.zzc;
                android.graphics.Point point = this.zzz;
                android.graphics.Point point2 = this.zzy;
                try {
                    jSONObject = new org.json.JSONObject();
                    try {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (java.lang.Exception e) {
                        e = e;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (org.json.JSONException e3) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzo(view2, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzF, jSONObjectZzc, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzq() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ad", this.zzc);
            com.google.android.gms.internal.ads.zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzr(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        android.content.Context context = this.zza;
        zzI(com.google.android.gms.ads.internal.util.zzbv.zzg(context, view), com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbv.zzf(view), com.google.android.gms.ads.internal.util.zzbv.zze(context, view), zzE(view), null, com.google.android.gms.ads.internal.util.zzbv.zzh(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzs() {
        zzI(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzt(android.view.View view, android.view.MotionEvent motionEvent, android.view.View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbv.zza(motionEvent, view2);
        long jCurrentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = jCurrentTimeMillis;
            this.zzz = this.zzy;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(this.zzy.x, this.zzy.y);
        this.zzf.zzd(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzu(android.os.Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!zzG("touch_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzv(android.view.View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        com.google.android.gms.internal.ads.zzdjl zzdjlVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdjlVar);
        view.setClickable(true);
        zzdjlVar.zzc = new java.lang.ref.WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzw() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzx(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzC = zzddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzy(com.google.android.gms.internal.ads.zzbhq zzbhqVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc(zzbhqVar);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzz(android.view.View view, java.util.Map map, java.util.Map map2, android.view.View.OnTouchListener onTouchListener, android.view.View.OnClickListener onClickListener) {
        this.zzy = new android.graphics.Point();
        this.zzz = new android.graphics.Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zZzi = com.google.android.gms.ads.internal.util.zzbv.zzi(this.zzk.clientJarVersion);
        if (map != null) {
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            java.util.Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                android.view.View view3 = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzk(com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzdhVar == null) {
                com.google.android.gms.internal.ads.zzdif zzdifVar = this.zze;
                if (zzdifVar.zzk() != null) {
                    this.zzw = true;
                    this.zzq.zzd(zzdifVar.zzk().zzf(), this.zzj.zzax, this.zzs);
                    zzh();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzd(zzdhVar.zzf(), this.zzj.zzax, this.zzs);
            zzh();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
