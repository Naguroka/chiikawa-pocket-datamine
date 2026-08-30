package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbox {
    public final java.util.List zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;

    public zzbox(org.json.JSONObject jSONObject) throws org.json.JSONException {
        jSONObject.optString("id");
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zza = java.util.Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzv.zzh();
        com.google.android.gms.internal.ads.zzboz.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzv.zzh();
        com.google.android.gms.internal.ads.zzboz.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        com.google.android.gms.internal.ads.zzboz.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        com.google.android.gms.internal.ads.zzboz.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        com.google.android.gms.internal.ads.zzboz.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        com.google.android.gms.internal.ads.zzboz.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzv.zzh();
        com.google.android.gms.internal.ads.zzboz.zza(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            com.google.android.gms.ads.internal.zzv.zzh();
            com.google.android.gms.internal.ads.zzboz.zza(jSONObjectOptJSONObject, "manual_impression_urls");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.zzb = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        com.google.android.gms.ads.internal.zzv.zzh();
        com.google.android.gms.internal.ads.zzboz.zza(jSONObject, "template_ids");
        org.json.JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.zzc = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
