package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzv {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;

    public zzv() {
        this.zza = new com.google.android.gms.ads.internal.util.client.zzn(1, 0, 1.0d, false);
    }

    private zzv(com.google.android.gms.ads.internal.util.client.zzx zzxVar) {
        this.zza = zzxVar;
    }

    public static com.google.android.gms.ads.internal.util.client.zzv zza(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new com.google.android.gms.ads.internal.util.client.zzv(jSONObjectOptJSONObject == null ? new com.google.android.gms.ads.internal.util.client.zzn(1, 0, 1.0d, false) : new com.google.android.gms.ads.internal.util.client.zzn(jSONObjectOptJSONObject.optInt("max_attempts", 1), jSONObjectOptJSONObject.optInt("initial_backoff_ms", 0), jSONObjectOptJSONObject.optDouble("backoff_multiplier", 1.0d), jSONObjectOptJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final com.google.android.gms.ads.internal.util.client.zzx zzb() {
        return this.zza;
    }
}
