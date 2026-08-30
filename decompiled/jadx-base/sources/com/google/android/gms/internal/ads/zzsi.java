package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzsi {
    private static java.lang.Boolean zza;

    public static int zza(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (com.google.android.gms.internal.ads.zzei.zza < 29) {
            return 0;
        }
        java.lang.Boolean bool = zza;
        if (bool == null || !bool.booleanValue()) {
            return com.google.android.gms.internal.ads.zzsh.zza(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
