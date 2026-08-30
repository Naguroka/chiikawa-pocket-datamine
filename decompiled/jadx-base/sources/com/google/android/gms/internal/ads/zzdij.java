package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdij extends com.google.android.gms.internal.ads.zzdik {
    private final org.json.JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final java.lang.String zzg;
    private final org.json.JSONObject zzh;

    public zzdij(com.google.android.gms.internal.ads.zzfbo zzfboVar, org.json.JSONObject jSONObject) {
        super(zzfboVar);
        this.zzb = com.google.android.gms.ads.internal.util.zzbs.zzh(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = com.google.android.gms.ads.internal.util.zzbs.zzl(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = com.google.android.gms.ads.internal.util.zzbs.zzl(false, jSONObject, com.json.z8.ATTRIBUTION, "allow_pub_rendering");
        this.zze = com.google.android.gms.ads.internal.util.zzbs.zzl(false, jSONObject, "enable_omid");
        this.zzg = com.google.android.gms.ads.internal.util.zzbs.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfj)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final com.google.android.gms.internal.ads.zzfcm zza() {
        org.json.JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new com.google.android.gms.internal.ads.zzfcm(jSONObject) : this.zza.zzV;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final java.lang.String zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final org.json.JSONObject zzc() {
        org.json.JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new org.json.JSONObject(this.zza.zzz);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzg() {
        return this.zzf;
    }
}
