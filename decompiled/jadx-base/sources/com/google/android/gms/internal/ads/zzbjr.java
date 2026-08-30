package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbjr implements com.google.android.gms.internal.ads.zzbjp {
    private final com.google.android.gms.internal.ads.zzbjs zza;

    public zzbjr(com.google.android.gms.internal.ads.zzbjs zzbjsVar) {
        this.zza = zzbjsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = java.lang.Float.parseFloat((java.lang.String) map.get("blurRadius"));
            }
        } catch (java.lang.NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to parse float", e);
        }
        this.zza.zzc(zEquals);
        this.zza.zzb(zEquals2, f);
        zzcexVar.zzay(zEquals);
    }
}
