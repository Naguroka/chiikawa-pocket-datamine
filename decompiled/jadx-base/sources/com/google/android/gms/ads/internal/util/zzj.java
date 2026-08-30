package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzj implements com.google.android.gms.ads.internal.util.zzg {
    private boolean zzb;
    private com.google.common.util.concurrent.ListenableFuture zzd;
    private android.content.SharedPreferences zzf;
    private android.content.SharedPreferences.Editor zzg;
    private java.lang.String zzi;
    private java.lang.String zzj;
    private final java.lang.Object zza = new java.lang.Object();
    private final java.util.List zzc = new java.util.ArrayList();
    private com.google.android.gms.internal.ads.zzazj zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private java.lang.String zzl = "-1";
    private int zzm = -1;
    private com.google.android.gms.internal.ads.zzbzg zzn = new com.google.android.gms.internal.ads.zzbzg("", 0);
    private long zzo = 0;
    private long zzp = 0;
    private int zzq = -1;
    private int zzr = 0;
    private java.util.Set zzs = java.util.Collections.emptySet();
    private org.json.JSONObject zzt = new org.json.JSONObject();
    private boolean zzu = true;
    private boolean zzv = true;
    private java.lang.String zzw = null;
    private java.lang.String zzx = "";
    private boolean zzy = false;
    private java.lang.String zzz = "";
    private java.lang.String zzA = com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
    private int zzB = -1;
    private int zzC = -1;
    private long zzD = 0;

    private final void zzR() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzd;
        if (listenableFuture == null || listenableFuture.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Interrupted while waiting for preferences loaded.", e);
        } catch (java.util.concurrent.CancellationException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (java.util.concurrent.ExecutionException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (java.util.concurrent.TimeoutException e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzS() {
        com.google.android.gms.internal.ads.zzbzw.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(int i) {
        zzR();
        synchronized (this.zza) {
            this.zzm = i;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                if (i == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzx.equals(str)) {
                    return;
                }
                this.zzx = str;
                android.content.SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjp)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzA.equals(str)) {
                    return;
                }
                this.zzA = str;
                android.content.SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_ui_storage", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (z == this.zzk) {
                return;
            }
            this.zzk = z;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(boolean z) {
        zzR();
        synchronized (this.zza) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() + ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkp)).longValue();
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("is_topics_ad_personalization_allowed", z);
                this.zzg.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(java.lang.String str, java.lang.String str2, boolean z) {
        zzR();
        synchronized (this.zza) {
            org.json.JSONArray jSONArrayOptJSONArray = this.zzt.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new org.json.JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null) {
                    return;
                }
                if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                    if (!z || !jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                        length = i;
                        break;
                    }
                    return;
                }
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
                jSONArrayOptJSONArray.put(length, jSONObject);
                this.zzt.put(str, jSONArrayOptJSONArray);
            } catch (org.json.JSONException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not update native advanced settings", e);
            }
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzt.toString());
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(int i) {
        zzR();
        synchronized (this.zza) {
            if (this.zzq == i) {
                return;
            }
            this.zzq = i;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("request_in_session_count", i);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(int i) {
        zzR();
        synchronized (this.zza) {
            if (this.zzC == i) {
                return;
            }
            this.zzC = i;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(long j) {
        zzR();
        synchronized (this.zza) {
            if (this.zzD == j) {
                return;
            }
            this.zzD = j;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(java.lang.String str) {
        zzR();
        synchronized (this.zza) {
            this.zzl = str;
            if (this.zzg != null) {
                if (str.equals("-1")) {
                    this.zzg.remove(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY);
                } else {
                    this.zzg.putString(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY, str);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzK() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzu;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzL() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzv;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzy;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaH)).booleanValue()) {
            return false;
        }
        zzR();
        synchronized (this.zza) {
            z = this.zzk;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        zzR();
        synchronized (this.zza) {
            android.content.SharedPreferences sharedPreferences = this.zzf;
            boolean z = false;
            if (sharedPreferences == null) {
                return false;
            }
            if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < java.lang.System.currentTimeMillis()) {
                return false;
            }
            if (this.zzf.getBoolean("is_topics_ad_personalization_allowed", false) && !this.zzk) {
                z = true;
            }
            return z;
        }
    }

    public final com.google.android.gms.internal.ads.zzazj zzP() {
        if (!this.zzb) {
            return null;
        }
        if ((zzK() && zzL()) || !((java.lang.Boolean) com.google.android.gms.internal.ads.zzbec.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            if (android.os.Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zze == null) {
                this.zze = new com.google.android.gms.internal.ads.zzazj();
            }
            this.zze.zzd();
            com.google.android.gms.ads.internal.util.client.zzo.zzi("start fetching content...");
            return this.zze;
        }
    }

    final /* synthetic */ void zzQ(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.applovin.sdk.AppLovinMediationProvider.ADMOB, 0);
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (this.zza) {
                this.zzf = sharedPreferences;
                this.zzg = editorEdit;
                if (com.google.android.gms.common.util.PlatformVersion.isAtLeastM()) {
                    android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                }
                this.zzh = this.zzf.getBoolean("use_https", this.zzh);
                this.zzu = this.zzf.getBoolean("content_url_opted_out", this.zzu);
                this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
                this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
                this.zzv = this.zzf.getBoolean("content_vertical_opted_out", this.zzv);
                this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
                this.zzr = this.zzf.getInt("version_code", this.zzr);
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbed.zzg.zze()).booleanValue() && com.google.android.gms.ads.internal.client.zzbe.zzc().zze()) {
                    this.zzn = new com.google.android.gms.internal.ads.zzbzg("", 0L);
                } else {
                    this.zzn = new com.google.android.gms.internal.ads.zzbzg(this.zzf.getString("app_settings_json", this.zzn.zzc()), this.zzf.getLong("app_settings_last_update_ms", this.zzn.zza()));
                }
                this.zzo = this.zzf.getLong("app_last_background_time_ms", this.zzo);
                this.zzq = this.zzf.getInt("request_in_session_count", this.zzq);
                this.zzp = this.zzf.getLong("first_ad_req_time_ms", this.zzp);
                this.zzs = this.zzf.getStringSet("never_pool_slots", this.zzs);
                this.zzw = this.zzf.getString("display_cutout", this.zzw);
                this.zzB = this.zzf.getInt("app_measurement_npa", this.zzB);
                this.zzC = this.zzf.getInt("sd_app_measure_npa", this.zzC);
                this.zzD = this.zzf.getLong("sd_app_measure_npa_ts", this.zzD);
                this.zzx = this.zzf.getString("inspector_info", this.zzx);
                this.zzy = this.zzf.getBoolean("linked_device", this.zzy);
                this.zzz = this.zzf.getString("linked_ad_unit", this.zzz);
                this.zzA = this.zzf.getString("inspector_ui_storage", this.zzA);
                this.zzl = this.zzf.getString(com.unity3d.ads.core.data.datasource.AndroidTcfDataSource.TCF_TCSTRING_KEY, this.zzl);
                this.zzm = this.zzf.getInt("gad_has_consent_for_cookies", this.zzm);
                try {
                    this.zzt = new org.json.JSONObject(this.zzf.getString("native_advanced_settings", com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON));
                } catch (org.json.JSONException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not convert native advanced settings to json object", e);
                }
                zzS();
            }
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            com.google.android.gms.ads.internal.util.zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i;
        zzR();
        synchronized (this.zza) {
            i = this.zzr;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        zzR();
        return this.zzm;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i;
        zzR();
        synchronized (this.zza) {
            i = this.zzq;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j;
        zzR();
        synchronized (this.zza) {
            j = this.zzo;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j;
        zzR();
        synchronized (this.zza) {
            j = this.zzp;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j;
        zzR();
        synchronized (this.zza) {
            j = this.zzD;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final com.google.android.gms.internal.ads.zzbzg zzg() {
        com.google.android.gms.internal.ads.zzbzg zzbzgVar;
        zzR();
        synchronized (this.zza) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlz)).booleanValue() && this.zzn.zzj()) {
                java.util.Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
            }
            zzbzgVar = this.zzn;
        }
        return zzbzgVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final com.google.android.gms.internal.ads.zzbzg zzh() {
        com.google.android.gms.internal.ads.zzbzg zzbzgVar;
        synchronized (this.zza) {
            zzbzgVar = this.zzn;
        }
        return zzbzgVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzi() {
        java.lang.String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzj() {
        java.lang.String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzw;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzk() {
        java.lang.String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzx;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzl() {
        java.lang.String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzA;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzm() {
        zzR();
        return this.zzl;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final org.json.JSONObject zzn() {
        org.json.JSONObject jSONObject;
        zzR();
        synchronized (this.zza) {
            jSONObject = this.zzt;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzo(java.lang.Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(final android.content.Context context) {
        synchronized (this.zza) {
            if (this.zzf != null) {
                return;
            }
            com.google.android.gms.internal.ads.zzgcs zzgcsVar = com.google.android.gms.internal.ads.zzbzw.zza;
            final java.lang.String str = com.applovin.sdk.AppLovinMediationProvider.ADMOB;
            this.zzd = zzgcsVar.zza(new java.lang.Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzi
                public final /* synthetic */ android.content.Context zzb;
                public final /* synthetic */ java.lang.String zzc = com.applovin.sdk.AppLovinMediationProvider.ADMOB;

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzQ(this.zzb, this.zzc);
                }
            });
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq() {
        zzR();
        synchronized (this.zza) {
            this.zzt = new org.json.JSONObject();
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(long j) {
        zzR();
        synchronized (this.zza) {
            if (this.zzo == j) {
                return;
            }
            this.zzo = j;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs(java.lang.String str) {
        zzR();
        synchronized (this.zza) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            if (str != null && !str.equals(this.zzn.zzc())) {
                this.zzn = new com.google.android.gms.internal.ads.zzbzg(str, jCurrentTimeMillis);
                android.content.SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.zzg.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                    this.zzg.apply();
                }
                zzS();
                java.util.Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                return;
            }
            this.zzn.zzg(jCurrentTimeMillis);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(int i) {
        zzR();
        synchronized (this.zza) {
            if (this.zzr == i) {
                return;
            }
            this.zzr = i;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("version_code", i);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (this.zzu == z) {
                return;
            }
            this.zzu = z;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (this.zzv == z) {
                return;
            }
            this.zzv = z;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzz.equals(str)) {
                    return;
                }
                this.zzz = str;
                android.content.SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzy == z) {
                    return;
                }
                this.zzy = z;
                android.content.SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("linked_device", z);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(java.lang.String str) {
        zzR();
        synchronized (this.zza) {
            if (android.text.TextUtils.equals(this.zzw, str)) {
                return;
            }
            this.zzw = str;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(long j) {
        zzR();
        synchronized (this.zza) {
            if (this.zzp == j) {
                return;
            }
            this.zzp = j;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j);
                this.zzg.apply();
            }
            zzS();
        }
    }
}
