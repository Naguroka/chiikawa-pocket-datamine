package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbtk {
    public final boolean zza;
    public final java.lang.String zzb;
    public final boolean zzc;

    public zzbtk(boolean z, java.lang.String str, boolean z2) {
        this.zza = z;
        this.zzb = str;
        this.zzc = z2;
    }

    public static com.google.android.gms.internal.ads.zzbtk zza(org.json.JSONObject jSONObject) {
        return new com.google.android.gms.internal.ads.zzbtk(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
