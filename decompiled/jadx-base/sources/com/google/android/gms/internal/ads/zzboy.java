package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzboy {
    public final java.util.List zza;

    public zzboy(org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.zze.zza("Mediation Response JSON: ".concat(java.lang.String.valueOf(jSONObject.toString(2))));
        }
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                com.google.android.gms.internal.ads.zzbox zzboxVar = new com.google.android.gms.internal.ads.zzbox(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(zzboxVar.zzc);
                arrayList.add(zzboxVar);
                if (i < 0) {
                    java.util.Iterator it = zzboxVar.zza.iterator();
                    while (it.hasNext()) {
                        if (((java.lang.String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i = i2;
                            break;
                        }
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = java.util.Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzv.zzh();
            com.google.android.gms.internal.ads.zzboz.zza(jSONObjectOptJSONObject, "click_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            com.google.android.gms.internal.ads.zzboz.zza(jSONObjectOptJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            com.google.android.gms.internal.ads.zzboz.zza(jSONObjectOptJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            com.google.android.gms.internal.ads.zzboz.zza(jSONObjectOptJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.zzv.zzh();
            com.google.android.gms.internal.ads.zzboz.zza(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            com.google.android.gms.internal.ads.zzbwi.zza(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
