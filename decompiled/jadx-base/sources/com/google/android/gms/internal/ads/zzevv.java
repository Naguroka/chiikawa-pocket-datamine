package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzevv implements com.google.android.gms.internal.ads.zzetq {
    private final android.os.Bundle zza;

    public zzevv(android.os.Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbs.zzg(com.google.android.gms.ads.internal.util.zzbs.zzg(jSONObject, com.ironsource.y8.h.G), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(this.zza));
            } catch (org.json.JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
