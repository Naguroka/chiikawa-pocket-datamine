package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbcd {
    private final java.util.List zza = new java.util.ArrayList();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.List zzc = new java.util.ArrayList();

    public final java.util.List zza() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza((com.google.android.gms.internal.ads.zzbcc) it.next());
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(com.google.android.gms.internal.ads.zzbcm.zza());
        return arrayList;
    }

    public final java.util.List zzb() {
        java.util.List listZza = zza();
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza((com.google.android.gms.internal.ads.zzbcc) it.next());
            if (!android.text.TextUtils.isEmpty(str)) {
                listZza.add(str);
            }
        }
        listZza.addAll(com.google.android.gms.internal.ads.zzbcm.zzb());
        return listZza;
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbcc zzbccVar) {
        this.zzb.add(zzbccVar);
    }

    public final void zzd(com.google.android.gms.internal.ads.zzbcc zzbccVar) {
        this.zza.add(zzbccVar);
    }

    public final void zze(android.content.SharedPreferences.Editor editor, int i, org.json.JSONObject jSONObject) {
        for (com.google.android.gms.internal.ads.zzbcc zzbccVar : this.zza) {
            if (zzbccVar.zze() == 1) {
                zzbccVar.zzd(editor, zzbccVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Flag Json is null.");
        }
    }
}
