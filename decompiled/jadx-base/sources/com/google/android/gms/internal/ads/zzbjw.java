package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbjw implements com.google.android.gms.internal.ads.zzbjp {
    static final java.util.Map zza = com.google.android.gms.common.util.CollectionUtils.mapOfKeyValueArrays(new java.lang.String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new java.lang.Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final com.google.android.gms.internal.ads.zzbsc zzc;
    private final com.google.android.gms.internal.ads.zzbsj zzd;

    public zzbjw(com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzbsc zzbscVar, com.google.android.gms.internal.ads.zzbsj zzbsjVar) {
        this.zzb = zzbVar;
        this.zzc = zzbscVar;
        this.zzd = zzbsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcex zzcexVar = (com.google.android.gms.internal.ads.zzcex) obj;
        int iIntValue = ((java.lang.Integer) zza.get((java.lang.String) map.get(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY))).intValue();
        int i = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (!zzbVar.zzc()) {
                    zzbVar.zzb(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zzb(map);
                    return;
                }
                if (iIntValue == 3) {
                    new com.google.android.gms.internal.ads.zzbsf(zzcexVar, map).zzb();
                    return;
                }
                if (iIntValue == 4) {
                    new com.google.android.gms.internal.ads.zzbrz(zzcexVar, map).zzc();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (iIntValue != 7) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        java.lang.String str = (java.lang.String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? java.lang.Boolean.parseBoolean((java.lang.String) map.get("allowOrientationChange")) : true;
        if (zzcexVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("AdWebView is null");
            return;
        }
        if (com.ironsource.y8.h.D.equalsIgnoreCase(str)) {
            i = 7;
        } else if (!com.ironsource.y8.h.C.equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        zzcexVar.zzau(i);
    }
}
