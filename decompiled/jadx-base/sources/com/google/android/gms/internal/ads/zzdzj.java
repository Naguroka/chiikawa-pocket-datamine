package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzdzj implements com.google.android.gms.internal.ads.zzbnz {
    zzdzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final /* bridge */ /* synthetic */ org.json.JSONObject zzb(java.lang.Object obj) throws org.json.JSONException {
        com.google.android.gms.internal.ads.zzdzk zzdzkVar = (com.google.android.gms.internal.ads.zzdzk) obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjg)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzdzkVar.zzd.zzg());
            jSONObject2.put("ad_request_post_body", zzdzkVar.zzd.zzf());
        }
        jSONObject2.put("base_url", zzdzkVar.zzd.zzd());
        jSONObject2.put("signals", zzdzkVar.zzc);
        jSONObject3.put("body", zzdzkVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(zzdzkVar.zzb.zzb));
        jSONObject3.put("response_code", zzdzkVar.zzb.zza);
        jSONObject3.put("latency", zzdzkVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put(com.json.hs.n, jSONObject3);
        jSONObject.put("flags", zzdzkVar.zzd.zzi());
        return jSONObject;
    }
}
