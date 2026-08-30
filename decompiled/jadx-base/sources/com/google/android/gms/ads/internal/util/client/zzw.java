package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzw {
    public static com.google.android.gms.ads.internal.util.client.zzw zzd(org.json.JSONObject jSONObject) {
        return new com.google.android.gms.ads.internal.util.client.zzm(jSONObject.optInt("impression_prerequisite", 0), jSONObject.optInt("click_prerequisite", 0), jSONObject.optBoolean("notification_flow_enabled", false));
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc();
}
