package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzxl {
    private final android.media.Spatializer zza;
    private final boolean zzb;
    private android.os.Handler zzc;
    private android.media.Spatializer.OnSpatializerStateChangedListener zzd;

    private zzxl(android.media.Spatializer spatializer) {
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static com.google.android.gms.internal.ads.zzxl zza(android.content.Context context) {
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzxl(audioManager.getSpatializer());
    }

    public final void zzb(com.google.android.gms.internal.ads.zzxt zzxtVar, android.os.Looper looper) {
        if (this.zzd == null && this.zzc == null) {
            this.zzd = new com.google.android.gms.internal.ads.zzxk(this, zzxtVar);
            final android.os.Handler handler = new android.os.Handler(looper);
            this.zzc = handler;
            android.media.Spatializer spatializer = this.zza;
            java.util.Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.zzxj
                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.zzd);
        }
    }

    public final void zzc() {
        android.media.Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.zzd;
        if (onSpatializerStateChangedListener == null || this.zzc == null) {
            return;
        }
        this.zza.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        android.os.Handler handler = this.zzc;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        handler.removeCallbacksAndMessages(null);
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zze zzeVar, com.google.android.gms.internal.ads.zzab zzabVar) {
        int i;
        if (java.util.Objects.equals(zzabVar.zzo, androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC) && zzabVar.zzD == 16) {
            i = 12;
        } else {
            i = (java.util.Objects.equals(zzabVar.zzo, "audio/iamf") && zzabVar.zzD == -1) ? 6 : zzabVar.zzD;
        }
        int iZzi = com.google.android.gms.internal.ads.zzei.zzi(i);
        if (iZzi == 0) {
            return false;
        }
        android.media.AudioFormat.Builder channelMask = new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(iZzi);
        int i2 = zzabVar.zzE;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return this.zza.canBeSpatialized(zzeVar.zza().zza, channelMask.build());
    }

    public final boolean zze() {
        return this.zza.isAvailable();
    }

    public final boolean zzf() {
        return this.zza.isEnabled();
    }

    public final boolean zzg() {
        return this.zzb;
    }
}
