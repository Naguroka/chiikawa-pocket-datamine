package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaam {
    public static void zza(android.view.Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (java.lang.IllegalStateException e) {
            com.google.android.gms.internal.ads.zzdo.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
