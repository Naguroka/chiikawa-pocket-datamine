package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzboz {
    public static final java.util.List zza(org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException {
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
