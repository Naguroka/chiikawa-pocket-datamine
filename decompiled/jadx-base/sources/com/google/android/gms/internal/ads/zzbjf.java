package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbjf implements com.google.android.gms.internal.ads.zzbjp {
    zzbjf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.lang.String) map.get("args"));
            android.content.SharedPreferences.Editor editorEdit = android.preference.PreferenceManager.getDefaultSharedPreferences(zzcexVar.getContext()).edit();
            for (int i = 0; i < jSONArray.length(); i++) {
                editorEdit.remove(jSONArray.getString(i));
            }
            editorEdit.apply();
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "GMSG clear local storage keys handler");
        }
    }
}
