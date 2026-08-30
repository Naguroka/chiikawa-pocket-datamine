package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzab {
    private boolean zza = false;
    private float zzb = 1.0f;

    public static float zzb(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    private final synchronized boolean zzf() {
        return this.zzb >= 0.0f;
    }

    public final synchronized float zza() {
        if (!zzf()) {
            return 1.0f;
        }
        return this.zzb;
    }

    public final synchronized void zzc(boolean z) {
        this.zza = z;
    }

    public final synchronized void zzd(float f) {
        this.zzb = f;
    }

    public final synchronized boolean zze() {
        return this.zza;
    }
}
