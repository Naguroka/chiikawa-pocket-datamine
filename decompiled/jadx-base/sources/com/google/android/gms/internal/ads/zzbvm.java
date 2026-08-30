package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbvm {
    private final java.util.List zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final boolean zzd;
    private final boolean zze;
    private final java.lang.String zzf;
    private final int zzg;
    private final org.json.JSONObject zzh;
    private final java.lang.String zzi;
    private final long zzj;
    private final long zzk;

    public zzbvm(org.json.JSONObject jSONObject) {
        this.zzf = jSONObject.optString("url");
        this.zzb = jSONObject.optString("base_uri");
        this.zzc = jSONObject.optString("post_parameters");
        this.zzd = zzm(jSONObject.optString("drt_include"));
        this.zze = zzm(jSONObject.optString("cookies_include", com.json.mediationsdk.metadata.a.g));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        java.lang.String strOptString = jSONObject.optString("errors");
        this.zza = strOptString == null ? null : java.util.Arrays.asList(strOptString.split(","));
        this.zzg = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.zzh = jSONObjectOptJSONObject == null ? new org.json.JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.zzi = jSONObject.optString("pool_key");
        this.zzj = zzl(jSONObject.optString("start_time")).longValue();
        this.zzk = zzl(jSONObject.optString("end_time")).longValue();
    }

    private static java.lang.Long zzl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return java.lang.Long.valueOf(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    private static boolean zzm(java.lang.String str) {
        if (str != null) {
            return str.equals("1") || str.equals(com.json.mediationsdk.metadata.a.g);
        }
        return false;
    }

    public final int zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zzk;
    }

    public final long zzc() {
        return this.zzj;
    }

    public final java.lang.String zzd() {
        return this.zzb;
    }

    public final java.lang.String zze() {
        return this.zzi;
    }

    public final java.lang.String zzf() {
        return this.zzc;
    }

    public final java.lang.String zzg() {
        return this.zzf;
    }

    public final java.util.List zzh() {
        return this.zza;
    }

    public final org.json.JSONObject zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return this.zze;
    }

    public final boolean zzk() {
        return this.zzd;
    }
}
