package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzsh {
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d));
        boolean z = true;
        if (iZzc == 1 && com.google.android.gms.internal.ads.zzsi.zza == null) {
            if (com.google.android.gms.internal.ads.zzei.zza >= 35) {
                z = false;
            } else {
                int iZzb = zzb(false);
                int iZzb2 = zzb(true);
                if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                    z = false;
                }
            }
            com.google.android.gms.internal.ads.zzsi.zza = java.lang.Boolean.valueOf(z);
            if (com.google.android.gms.internal.ads.zzsi.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }

    private static int zzb(boolean z) {
        java.util.List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
            zzzVar.zzaa("video/avc");
            com.google.android.gms.internal.ads.zzab zzabVarZzag = zzzVar.zzag();
            if (zzabVarZzag.zzo != null) {
                java.util.List listZze = com.google.android.gms.internal.ads.zzta.zze(com.google.android.gms.internal.ads.zzsp.zza, zzabVarZzag, z, false);
                for (int i = 0; i < listZze.size(); i++) {
                    if (((com.google.android.gms.internal.ads.zzsg) listZze.get(i)).zzd != null && ((com.google.android.gms.internal.ads.zzsg) listZze.get(i)).zzd.getVideoCapabilities() != null && (supportedPerformancePoints = ((com.google.android.gms.internal.ads.zzsg) listZze.get(i)).zzd.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return zzc(supportedPerformancePoints, new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                    }
                }
            }
        } catch (com.google.android.gms.internal.ads.zzsu unused) {
        }
        return 0;
    }

    private static int zzc(java.util.List list, android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (((android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
