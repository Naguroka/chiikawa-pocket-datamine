package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfmg {
    private static android.view.WindowManager zzb;
    private static final java.lang.String[] zzc = {"x", "y", "width", "height"};
    static float zza = android.content.res.Resources.getSystem().getDisplayMetrics().density;

    public static org.json.JSONObject zza(int i, int i2, int i3, int i4) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("x", i / zza);
            jSONObject.put("y", i2 / zza);
            jSONObject.put("width", i3 / zza);
            jSONObject.put("height", i4 / zza);
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.ads.zzfmh.zza("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void zzb(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.ads.zzfmh.zza("Error with setting ad session id", e);
        }
    }

    public static void zzc(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new org.json.JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    public static void zzd(android.content.Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (android.view.WindowManager) context.getSystemService("window");
        }
    }

    public static void zze(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (java.lang.NullPointerException | org.json.JSONException e) {
            com.google.android.gms.internal.ads.zzfmh.zza("JSONException during JSONObject.put for name [" + str + com.ironsource.y8.i.e, e);
        }
    }

    public static void zzf(org.json.JSONObject jSONObject) {
        float f;
        float f2;
        if (zzb != null) {
            android.graphics.Point point = new android.graphics.Point(0, 0);
            zzb.getDefaultDisplay().getRealSize(point);
            f = point.x / zza;
            f2 = point.y / zza;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf A[LOOP:1: B:42:0x00ab->B:46:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3 A[SYNTHETIC] */
    public static boolean zzg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONArray jSONArrayOptJSONArray;
        org.json.JSONArray jSONArrayOptJSONArray2;
        int i;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            java.lang.String[] strArr = zzc;
            for (int i2 = 0; i2 < 4; i2++) {
                java.lang.String str = strArr[i2];
                if (jSONObject.optDouble(str) == jSONObject2.optDouble(str)) {
                }
            }
            if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && java.lang.Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(java.lang.Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && java.lang.Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(java.lang.Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                org.json.JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("isFriendlyObstructionFor");
                org.json.JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null) {
                    }
                    if (zzh(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                        for (i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            if (zzg(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                            }
                        }
                        return true;
                    }
                } else if (zzh(jSONArrayOptJSONArray3, jSONArrayOptJSONArray4)) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                        if (jSONArrayOptJSONArray3.optString(i3, "").equals(jSONArrayOptJSONArray4.optString(i3, ""))) {
                        }
                    }
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 != null) {
                        if (zzh(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                            while (i < jSONArrayOptJSONArray.length()) {
                                if (zzg(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzh(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
