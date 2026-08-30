package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdpt {
    public static java.lang.String zza(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        org.json.JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    org.json.JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (zzb(jSONArrayOptJSONArray2, str) && !zzb(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    private static boolean zzb(org.json.JSONArray jSONArray, java.lang.String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                java.lang.String strOptString = jSONArray.optString(i);
                try {
                    if ((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkN)).booleanValue() ? java.util.regex.Pattern.compile(strOptString, 2) : java.util.regex.Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                        return true;
                    }
                } catch (java.util.regex.PatternSyntaxException e) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
            }
        }
        return false;
    }
}
