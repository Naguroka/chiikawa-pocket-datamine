package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbie implements com.google.android.gms.internal.ads.zzbjp {
    private final com.google.android.gms.internal.ads.zzbif zza;

    public zzbie(com.google.android.gms.internal.ads.zzbif zzbifVar) {
        this.zza = zzbifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        if (this.zza == null) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get("name");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        android.os.Bundle bundleZza = null;
        if (map.containsKey("info")) {
            try {
                bundleZza = com.google.android.gms.ads.internal.util.zzbs.zza(new org.json.JSONObject((java.lang.String) map.get("info")));
            } catch (org.json.JSONException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleZza == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundleZza);
        }
    }
}
