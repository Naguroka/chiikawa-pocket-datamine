package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbzg {
    private java.lang.String zzd;
    private java.lang.String zze;
    private long zzf;
    private org.json.JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final java.util.List zza = new java.util.ArrayList();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.Map zzc = new java.util.HashMap();
    private final java.util.List zzi = new java.util.ArrayList();

    public zzbzg(java.lang.String str, long j) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONObject jSONObjectOptJSONObject2;
        org.json.JSONArray jSONArrayOptJSONArray;
        org.json.JSONObject jSONObjectOptJSONObject3;
        this.zzd = "";
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zzg = new org.json.JSONObject(str);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzly)).booleanValue() && zzj()) {
                return;
            }
            if (this.zzg.optInt("status", -1) != 1) {
                this.zzh = false;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("App settings could not be fetched successfully.");
                return;
            }
            this.zzh = true;
            this.zzd = this.zzg.optString("app_id");
            org.json.JSONArray jSONArrayOptJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    org.json.JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                    java.lang.String strOptString = jSONObject.optString("format");
                    java.lang.String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!android.text.TextUtils.isEmpty(strOptString) && !android.text.TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.zzb.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.zzc.put(strOptString2, new com.google.android.gms.internal.ads.zzboy(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            org.json.JSONArray jSONArrayOptJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                    this.zza.add(jSONArrayOptJSONArray3.optString(i2));
                }
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgI)).booleanValue() && (jSONObjectOptJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    this.zzi.add(jSONArrayOptJSONArray.get(i3).toString());
                }
            }
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzge)).booleanValue() || (jSONObjectOptJSONObject = this.zzg.optJSONObject("common_settings")) == null) {
                return;
            }
            this.zzj = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final java.lang.String zzb() {
        return this.zzd;
    }

    public final java.lang.String zzc() {
        return this.zze;
    }

    public final java.util.List zzd() {
        return this.zzi;
    }

    public final java.util.Map zze() {
        return this.zzc;
    }

    public final org.json.JSONObject zzf() {
        return this.zzg;
    }

    public final void zzg(long j) {
        this.zzf = j;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        if (!android.text.TextUtils.isEmpty(this.zze) && this.zzg != null) {
            long jLongValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlB)).longValue();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlA)).booleanValue() && !android.text.TextUtils.isEmpty(this.zze)) {
                jLongValue = this.zzg.optLong("cache_ttl_sec", ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlB)).longValue());
            }
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            if (jLongValue >= 0 && (this.zzf > jCurrentTimeMillis || java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - this.zzf) > jLongValue)) {
                this.zza.clear();
                this.zzb.clear();
                this.zzc.clear();
                this.zzd = "";
                this.zze = "";
                this.zzg = null;
                this.zzh = false;
                this.zzi.clear();
                this.zzj = false;
                return true;
            }
        }
        return false;
    }
}
