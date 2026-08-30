package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcbr {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final long zzm;
    public final long zzn;

    public zzcbr(java.lang.String str) {
        org.json.JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (org.json.JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", com.google.android.gms.internal.ads.zzbcl.zzV);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", com.google.android.gms.internal.ads.zzbcl.zzi);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", com.google.android.gms.internal.ads.zzbcl.zzs);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", com.google.android.gms.internal.ads.zzbcl.zze);
        com.google.android.gms.internal.ads.zzbcc zzbccVar = com.google.android.gms.internal.ads.zzbcl.zzd;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (org.json.JSONException unused2) {
            }
        }
        this.zze = zzb(jSONObject, "exo_read_timeout_millis", com.google.android.gms.internal.ads.zzbcl.zzf);
        this.zzf = zzb(jSONObject, "load_check_interval_bytes", com.google.android.gms.internal.ads.zzbcl.zzg);
        this.zzg = zzb(jSONObject, "player_precache_limit", com.google.android.gms.internal.ads.zzbcl.zzh);
        this.zzh = zzb(jSONObject, "socket_receive_buffer_size", com.google.android.gms.internal.ads.zzbcl.zzj);
        this.zzi = zza(jSONObject, "use_cache_data_source", com.google.android.gms.internal.ads.zzbcl.zzep);
        zzb(jSONObject, "min_retry_count", com.google.android.gms.internal.ads.zzbcl.zzk);
        this.zzj = zza(jSONObject, "treat_load_exception_as_non_fatal", com.google.android.gms.internal.ads.zzbcl.zzm);
        this.zzk = zza(jSONObject, "enable_multiple_video_playback", com.google.android.gms.internal.ads.zzbcl.zzbZ);
        this.zzl = zza(jSONObject, "use_range_http_data_source", com.google.android.gms.internal.ads.zzbcl.zzcb);
        this.zzm = zzc(jSONObject, "range_http_data_source_high_water_mark", com.google.android.gms.internal.ads.zzbcl.zzcc);
        this.zzn = zzc(jSONObject, "range_http_data_source_low_water_mark", com.google.android.gms.internal.ads.zzbcl.zzcd);
    }

    private static final boolean zza(org.json.JSONObject jSONObject, java.lang.String str, com.google.android.gms.internal.ads.zzbcc zzbccVar) {
        boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue();
        if (jSONObject == null) {
            return zBooleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (org.json.JSONException unused) {
            return zBooleanValue;
        }
    }

    private static final int zzb(org.json.JSONObject jSONObject, java.lang.String str, com.google.android.gms.internal.ads.zzbcc zzbccVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (org.json.JSONException unused) {
            }
        }
        return ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).intValue();
    }

    private static final long zzc(org.json.JSONObject jSONObject, java.lang.String str, com.google.android.gms.internal.ads.zzbcc zzbccVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (org.json.JSONException unused) {
            }
        }
        return ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).longValue();
    }
}
