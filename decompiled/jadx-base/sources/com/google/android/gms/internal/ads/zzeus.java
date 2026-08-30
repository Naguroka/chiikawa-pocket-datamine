package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeus implements com.google.android.gms.internal.ads.zzetq {
    private final com.google.android.gms.ads.identifier.AdvertisingIdClient.Info zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzfra zzc;

    public zzeus(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info, java.lang.String str, com.google.android.gms.internal.ads.zzfra zzfraVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        try {
            org.json.JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbs.zzg((org.json.JSONObject) obj, "pii");
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = this.zza;
            if (info == null || android.text.TextUtils.isEmpty(info.getId())) {
                java.lang.String str = this.zzb;
                if (str != null) {
                    jSONObjectZzg.put("pdid", str);
                    jSONObjectZzg.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzg.put("rdid", this.zza.getId());
            jSONObjectZzg.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            jSONObjectZzg.put("idtype", "adid");
            com.google.android.gms.internal.ads.zzfra zzfraVar = this.zzc;
            if (zzfraVar.zzc()) {
                jSONObjectZzg.put("paidv1_id_android_3p", zzfraVar.zzb());
                jSONObjectZzg.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
