package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcky {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    zzcky(java.util.Map map, java.util.Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(com.google.android.gms.internal.ads.zzfca zzfcaVar) throws java.lang.Exception {
        for (com.google.android.gms.internal.ads.zzfby zzfbyVar : zzfcaVar.zzb.zzc) {
            if (this.zza.containsKey(zzfbyVar.zza) && zzfbyVar.zzb != null) {
                ((com.google.android.gms.internal.ads.zzclb) this.zza.get(zzfbyVar.zza)).zza(zzfbyVar.zzb);
            } else if (this.zzb.containsKey(zzfbyVar.zza) && zzfbyVar.zzb != null) {
                com.google.android.gms.internal.ads.zzcla zzclaVar = (com.google.android.gms.internal.ads.zzcla) this.zzb.get(zzfbyVar.zza);
                org.json.JSONObject jSONObject = zzfbyVar.zzb;
                java.util.HashMap map = new java.util.HashMap();
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    java.lang.String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                zzclaVar.zza(map);
            }
        }
    }
}
