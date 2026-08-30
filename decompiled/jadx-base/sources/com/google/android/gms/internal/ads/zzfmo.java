package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfmo {
    private org.json.JSONObject zza;
    private final com.google.android.gms.internal.ads.zzfmx zzb;

    public zzfmo(com.google.android.gms.internal.ads.zzfmx zzfmxVar) {
        this.zzb = zzfmxVar;
    }

    public final org.json.JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new com.google.android.gms.internal.ads.zzfmy(this));
    }

    public final void zzc(org.json.JSONObject jSONObject, java.util.HashSet hashSet, long j) {
        this.zzb.zzb(new com.google.android.gms.internal.ads.zzfmz(this, hashSet, jSONObject, j));
    }

    public final void zzd(org.json.JSONObject jSONObject, java.util.HashSet hashSet, long j) {
        this.zzb.zzb(new com.google.android.gms.internal.ads.zzfna(this, hashSet, jSONObject, j));
    }

    public final void zze(org.json.JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
