package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdvc implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private final org.json.JSONObject zza = new org.json.JSONObject();
    private java.util.List zzb;

    zzdvc() {
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if (str != null && this.zzb.contains(str)) {
            try {
                java.lang.Object obj = sharedPreferences.getAll().get(str);
                if (obj == null) {
                    this.zza.remove(str);
                } else {
                    this.zza.put(str, obj);
                }
            } catch (org.json.JSONException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
            }
        }
    }

    public final org.json.JSONObject zza() throws org.json.JSONException {
        return this.zza;
    }

    final void zzb(android.content.SharedPreferences sharedPreferences, java.util.List list) {
        this.zzb = list;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            onSharedPreferenceChanged(sharedPreferences, (java.lang.String) it.next());
        }
    }
}
