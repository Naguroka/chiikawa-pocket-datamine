package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzad {
    public static android.os.Bundle zza(android.content.Context context, java.lang.String str, android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (android.text.TextUtils.isEmpty(str)) {
            return android.os.Bundle.EMPTY;
        }
        android.preference.PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }

    public static android.os.Bundle zzb(android.content.Context context, java.lang.String str) {
        org.json.JSONArray jSONArray;
        int i;
        java.lang.Object obj;
        android.content.SharedPreferences sharedPreferences;
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new org.json.JSONArray(str);
            } catch (org.json.JSONException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("JSON parsing error", e);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return android.os.Bundle.EMPTY;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            java.lang.String strOptString = jSONObjectOptJSONObject.optString("bk");
            java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i = 1;
            } else if (iOptInt != 1) {
                i = iOptInt != 2 ? 0 : 3;
            } else {
                i = 2;
            }
            if (!android.text.TextUtils.isEmpty(strOptString) && !android.text.TextUtils.isEmpty(strOptString2) && i != 0) {
                java.util.List listZzf = com.google.android.gms.internal.ads.zzfvc.zzb(com.google.android.gms.internal.ads.zzfty.zzc('/')).zzf(strOptString2);
                if (listZzf.size() > 2 || listZzf.isEmpty()) {
                    obj = null;
                } else {
                    if (listZzf.size() == 1) {
                        sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (java.lang.String) listZzf.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((java.lang.String) listZzf.get(0), 0);
                        str2 = (java.lang.String) listZzf.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i3 = i - 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (obj instanceof java.lang.Boolean) {
                                bundle.putBoolean(strOptString, ((java.lang.Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof java.lang.Integer) {
                            bundle.putInt(strOptString, ((java.lang.Integer) obj).intValue());
                        } else if (obj instanceof java.lang.Long) {
                            bundle.putLong(strOptString, ((java.lang.Long) obj).longValue());
                        } else if (obj instanceof java.lang.Float) {
                            bundle.putFloat(strOptString, ((java.lang.Float) obj).floatValue());
                        }
                    } else if (obj instanceof java.lang.String) {
                        bundle.putString(strOptString, (java.lang.String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static void zzc(android.content.Context context) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgb)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            com.google.android.gms.internal.ads.zzfre zzfreVarZzj = com.google.android.gms.internal.ads.zzfre.zzj(context);
            com.google.android.gms.internal.ads.zzfrf zzfrfVarZzi = com.google.android.gms.internal.ads.zzfrf.zzi(context);
            com.google.android.gms.internal.ads.zzfrg zzfrgVarZza = com.google.android.gms.internal.ads.zzfrg.zza(context);
            zzfreVarZzj.zzk();
            zzfreVarZzj.zzl();
            zzfrfVarZzi.zzj();
            zzfrgVarZza.zzb(null);
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new java.io.IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (java.io.IOException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "clearStorageOnIdlessMode_scar");
        }
    }
}
