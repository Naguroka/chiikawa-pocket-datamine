package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzevo implements com.google.android.gms.internal.ads.zzetq {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public zzevo(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        try {
            org.json.JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbs.zzg((org.json.JSONObject) obj, "pii");
            jSONObjectZzg.put("doritos", this.zza);
            jSONObjectZzg.put("doritos_v2", this.zzb);
        } catch (org.json.JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting doritos string.");
        }
    }
}
