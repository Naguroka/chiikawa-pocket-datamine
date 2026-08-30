package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdta {
    private java.lang.Long zza;
    private final java.lang.String zzb;
    private java.lang.String zzc;
    private java.lang.Integer zzd;
    private java.lang.String zze;
    private java.lang.Integer zzf;

    /* synthetic */ zzdta(java.lang.String str, com.google.android.gms.internal.ads.zzdtb zzdtbVar) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ java.lang.String zza(com.google.android.gms.internal.ads.zzdta zzdtaVar) {
        java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjQ);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdtaVar.zza);
            jSONObject.put("eventCategory", zzdtaVar.zzb);
            jSONObject.putOpt(androidx.core.app.NotificationCompat.CATEGORY_EVENT, zzdtaVar.zzc);
            jSONObject.putOpt(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, zzdtaVar.zzd);
            jSONObject.putOpt("rewardType", zzdtaVar.zze);
            jSONObject.putOpt(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, zzdtaVar.zzf);
        } catch (org.json.JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
