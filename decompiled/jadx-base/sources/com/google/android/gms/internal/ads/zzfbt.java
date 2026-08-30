package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfbt {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final org.json.JSONObject zzc;
    public final org.json.JSONObject zzd;

    zzfbt(android.util.JsonReader jsonReader) throws java.lang.IllegalStateException, org.json.JSONException, java.io.IOException, java.lang.NumberFormatException {
        org.json.JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
        this.zzd = jSONObjectZzi;
        this.zza = jSONObjectZzi.optString("ad_html", null);
        this.zzb = jSONObjectZzi.optString("ad_base_url", null);
        this.zzc = jSONObjectZzi.optJSONObject("ad_json");
    }
}
