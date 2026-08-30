package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbje implements com.google.android.gms.internal.ads.zzbjp {
    zzbje() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) map.get("args"));
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            android.content.SharedPreferences.Editor editorEdit = android.preference.PreferenceManager.getDefaultSharedPreferences(zzcexVar.getContext()).edit();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object obj2 = jSONObject.get(next);
                if (obj2 instanceof java.lang.Integer) {
                    editorEdit.putInt(next, ((java.lang.Integer) obj2).intValue());
                } else if (obj2 instanceof java.lang.Long) {
                    editorEdit.putLong(next, ((java.lang.Long) obj2).longValue());
                } else if (obj2 instanceof java.lang.Double) {
                    editorEdit.putFloat(next, ((java.lang.Double) obj2).floatValue());
                } else if (obj2 instanceof java.lang.Float) {
                    editorEdit.putFloat(next, ((java.lang.Float) obj2).floatValue());
                } else if (obj2 instanceof java.lang.Boolean) {
                    editorEdit.putBoolean(next, ((java.lang.Boolean) obj2).booleanValue());
                } else if (obj2 instanceof java.lang.String) {
                    editorEdit.putString(next, (java.lang.String) obj2);
                }
            }
            editorEdit.apply();
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "GMSG write local storage KV pairs handler");
        }
    }
}
