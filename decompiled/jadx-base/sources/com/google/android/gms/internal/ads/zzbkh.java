package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbkh implements com.google.android.gms.internal.ads.zzbjp {
    private final com.google.android.gms.internal.ads.zzbkg zza;

    public zzbkh(com.google.android.gms.internal.ads.zzbkg zzbkgVar) {
        this.zza = zzbkgVar;
    }

    public static void zzb(com.google.android.gms.internal.ads.zzcex zzcexVar, com.google.android.gms.internal.ads.zzbkg zzbkgVar) {
        zzcexVar.zzag("/reward", new com.google.android.gms.internal.ads.zzbkh(zzbkgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.ads.zzbwi zzbwiVar = null;
        try {
            int i = java.lang.Integer.parseInt((java.lang.String) map.get("amount"));
            java.lang.String str2 = (java.lang.String) map.get("type");
            if (!android.text.TextUtils.isEmpty(str2)) {
                zzbwiVar = new com.google.android.gms.internal.ads.zzbwi(str2, i);
            }
        } catch (java.lang.NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to parse reward amount.", e);
        }
        this.zza.zza(zzbwiVar);
    }
}
