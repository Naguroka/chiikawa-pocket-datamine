package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzduv implements com.google.android.gms.internal.ads.zzdvw, com.google.android.gms.internal.ads.zzdug {
    private final com.google.android.gms.internal.ads.zzdvg zza;
    private final com.google.android.gms.internal.ads.zzdvx zzb;
    private final com.google.android.gms.internal.ads.zzduh zzc;
    private final com.google.android.gms.internal.ads.zzduq zzd;
    private final com.google.android.gms.internal.ads.zzduf zze;
    private final com.google.android.gms.internal.ads.zzdvs zzf;
    private final com.google.android.gms.internal.ads.zzdvc zzg;
    private final com.google.android.gms.internal.ads.zzdvc zzh;
    private final java.lang.String zzi;
    private final android.content.Context zzj;

    @javax.annotation.Nullable
    private final java.lang.String zzk;
    private org.json.JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final java.util.Map zzl = new java.util.HashMap();
    private final java.util.Map zzm = new java.util.HashMap();
    private final java.util.Map zzn = new java.util.HashMap();
    private java.lang.String zzo = com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
    private long zzq = Long.MAX_VALUE;
    private com.google.android.gms.internal.ads.zzdur zzr = com.google.android.gms.internal.ads.zzdur.NONE;
    private com.google.android.gms.internal.ads.zzduu zzv = com.google.android.gms.internal.ads.zzduu.UNKNOWN;
    private long zzw = 0;
    private java.lang.String zzx = "";

    zzduv(com.google.android.gms.internal.ads.zzdvg zzdvgVar, com.google.android.gms.internal.ads.zzdvx zzdvxVar, com.google.android.gms.internal.ads.zzduh zzduhVar, android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzduq zzduqVar, com.google.android.gms.internal.ads.zzdvs zzdvsVar, com.google.android.gms.internal.ads.zzdvc zzdvcVar, com.google.android.gms.internal.ads.zzdvc zzdvcVar2, @javax.annotation.Nullable java.lang.String str) {
        this.zza = zzdvgVar;
        this.zzb = zzdvxVar;
        this.zzc = zzduhVar;
        this.zze = new com.google.android.gms.internal.ads.zzduf(context);
        this.zzi = versionInfoParcel.afmaVersion;
        this.zzk = str;
        this.zzd = zzduqVar;
        this.zzf = zzdvsVar;
        this.zzg = zzdvcVar;
        this.zzh = zzdvcVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzv.zzt().zzg(this);
    }

    private final synchronized void zzA(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((com.google.android.gms.internal.ads.zzdur) java.lang.Enum.valueOf(com.google.android.gms.internal.ads.zzdur.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON);
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (org.json.JSONException unused) {
        }
    }

    private final synchronized org.json.JSONObject zzt() throws org.json.JSONException {
        org.json.JSONObject jSONObject;
        jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : this.zzl.entrySet()) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (com.google.android.gms.internal.ads.zzduj zzdujVar : (java.util.List) entry.getValue()) {
                if (zzdujVar.zzg()) {
                    jSONArray.put(zzdujVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((java.lang.String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzu() {
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjq))) {
            this.zzg.zzb(android.preference.PreferenceManager.getDefaultSharedPreferences(this.zzj), java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjq)).split(",")));
        }
        if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjr))) {
            this.zzh.zzb(this.zzj.getSharedPreferences(com.applovin.sdk.AppLovinMediationProvider.ADMOB, 0), java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjr)).split(",")));
        }
        zzA(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk());
        this.zzx = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzl();
    }

    private final void zzv() {
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzB(zzd());
    }

    private final synchronized void zzw(com.google.android.gms.internal.ads.zzdur zzdurVar, boolean z) {
        if (this.zzr != zzdurVar) {
            if (zzq()) {
                zzy();
            }
            this.zzr = zzdurVar;
            if (zzq()) {
                zzz();
            }
            if (z) {
                zzv();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a A[Catch: all -> 0x003c, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:12:0x0026, B:17:0x0035, B:13:0x002a, B:15:0x0030), top: B:25:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0030 A[Catch: all -> 0x003c, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:12:0x0026, B:17:0x0035, B:13:0x002a, B:15:0x0030), top: B:25:0x0001 }] */
    private final synchronized void zzx(boolean z, boolean z2) {
        if (this.zzs != z) {
            this.zzs = z;
            if (z) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue() || !com.google.android.gms.ads.internal.zzv.zzt().zzl()) {
                    zzz();
                } else if (!zzq()) {
                    zzy();
                }
            } else if (!zzq()) {
                zzy();
            }
            if (z2) {
                zzv();
            }
        }
    }

    private final synchronized void zzy() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzz() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzc();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    public final com.google.android.gms.internal.ads.zzdur zza() {
        return this.zzr;
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcab zzcabVar;
        zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        if (this.zzm.containsKey(str)) {
            zzcabVar.zzc((com.google.android.gms.internal.ads.zzduj) this.zzm.get(str));
        } else {
            if (!this.zzn.containsKey(str)) {
                this.zzn.put(str, new java.util.ArrayList());
            }
            ((java.util.List) this.zzn.get(str)).add(zzcabVar);
        }
        return zzcabVar;
    }

    public final synchronized java.lang.String zzc() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue() && zzq()) {
            if (this.zzq < com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                this.zzo = com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals(com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON)) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized java.lang.String zzd() {
        org.json.JSONObject jSONObject;
        jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized org.json.JSONObject zze() {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.json.ce.A, "ANDROID");
            if (!android.text.TextUtils.isEmpty(this.zzk)) {
                jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.zzk);
            }
            jSONObject.put("internalSdkVersion", this.zzi);
            jSONObject.put("osVersion", android.os.Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjn)).booleanValue()) {
                java.lang.String strZzn = com.google.android.gms.ads.internal.zzv.zzp().zzn();
                if (!android.text.TextUtils.isEmpty(strZzn)) {
                    jSONObject.put(com.json.ce.E, strZzn);
                }
            }
            if (this.zzq < com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                this.zzo = com.applovin.impl.sdk.utils.JsonUtils.EMPTY_JSON;
            }
            jSONObject.put("networkExtras", this.zzo);
            jSONObject.put("adSlots", zzt());
            jSONObject.put("appInfo", this.zze.zza());
            java.lang.String strZzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
            if (!android.text.TextUtils.isEmpty(strZzc)) {
                jSONObject.put("cld", new org.json.JSONObject(strZzc));
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjd)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Server data: " + jSONObject2.toString());
                jSONObject.put(com.json.j5.s, this.zzp);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue()) {
                jSONObject.put("openAction", this.zzv);
                jSONObject.put("gesture", this.zzr);
            }
            jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzv.zzt().zzl());
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.zzr());
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjp)).booleanValue()) {
                jSONObject.put("uiStorage", new org.json.JSONObject(this.zzx));
            }
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjr))) {
                jSONObject.put("gmaDisk", this.zzh.zza());
            }
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjq))) {
                jSONObject.put("userDisk", this.zzg.zza());
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "Inspector.toJson");
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized void zzf(java.lang.String str, com.google.android.gms.internal.ads.zzduj zzdujVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue() && zzq()) {
            if (this.zzt >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziP)).intValue()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzl.containsKey(str)) {
                this.zzl.put(str, new java.util.ArrayList());
            }
            this.zzt++;
            ((java.util.List) this.zzl.get(str)).add(zzdujVar);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjl)).booleanValue()) {
                java.lang.String strZzc = zzdujVar.zzc();
                this.zzm.put(strZzc, zzdujVar);
                if (this.zzn.containsKey(strZzc)) {
                    java.util.List list = (java.util.List) this.zzn.get(strZzc);
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.internal.ads.zzcab) it.next()).zzc(zzdujVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
                zzu();
                return;
            }
            java.lang.String strZzk = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk();
            if (android.text.TextUtils.isEmpty(strZzk)) {
                return;
            }
            try {
                if (new org.json.JSONObject(strZzk).optBoolean("isTestMode", false)) {
                    zzu();
                }
            } catch (org.json.JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzdl zzdlVar, com.google.android.gms.internal.ads.zzduu zzduuVar) {
        if (!zzq()) {
            try {
                zzdlVar.zze(com.google.android.gms.internal.ads.zzfdk.zzd(18, null, null));
                return;
            } catch (android.os.RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zziN)).booleanValue()) {
            this.zzv = zzduuVar;
            this.zza.zzj(zzdlVar, new com.google.android.gms.internal.ads.zzbkj(this), new com.google.android.gms.internal.ads.zzbkc(this.zzf), new com.google.android.gms.internal.ads.zzbjq(this));
            return;
        } else {
            try {
                zzdlVar.zze(com.google.android.gms.internal.ads.zzfdk.zzd(1, null, null));
                return;
            } catch (android.os.RemoteException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized void zzi(java.lang.String str, long j) {
        this.zzo = str;
        this.zzq = j;
        zzv();
    }

    public final synchronized void zzj(java.lang.String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzC(this.zzx);
    }

    public final synchronized void zzk(long j) {
        this.zzw += j;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    public final void zzl(boolean z) {
        if (this.zzu) {
            if (z) {
                if (!this.zzs) {
                    zzz();
                    return;
                }
            }
        } else if (z) {
            zzu();
            if (!this.zzs) {
                zzz();
                return;
            }
        }
        if (zzq()) {
            return;
        }
        zzy();
    }

    public final void zzm(com.google.android.gms.internal.ads.zzdur zzdurVar) {
        zzw(zzdurVar, true);
    }

    public final synchronized void zzn(org.json.JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z) {
        if (!this.zzu && z) {
            zzu();
        }
        zzx(z, true);
    }

    public final boolean zzp() {
        return this.zzp != null;
    }

    public final synchronized boolean zzq() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjc)).booleanValue()) {
            return this.zzs || com.google.android.gms.ads.internal.zzv.zzt().zzl();
        }
        return this.zzs;
    }

    public final synchronized boolean zzr() {
        return this.zzs;
    }

    public final boolean zzs() {
        return this.zzw < ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzji)).longValue();
    }
}
