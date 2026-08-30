package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzrz {
    private final java.util.HashSet zza;
    private android.media.LoudnessCodecController zzb;

    public zzrz() {
        throw null;
    }

    public zzrz(com.google.android.gms.internal.ads.zzry zzryVar) {
        this.zza = new java.util.HashSet();
    }

    public final void zza(android.media.MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            com.google.android.gms.internal.ads.zzcw.zzf(this.zza.add(mediaCodec));
        }
    }

    public final void zzb() {
        this.zza.clear();
        android.media.LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void zzc(android.media.MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController;
        if (!this.zza.remove(mediaCodec) || (loudnessCodecController = this.zzb) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void zzd(int i) {
        android.media.LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.zzb = null;
        }
        android.media.LoudnessCodecController loudnessCodecControllerCreate = android.media.LoudnessCodecController.create(i, com.google.android.gms.internal.ads.zzgcz.zzc(), new com.google.android.gms.internal.ads.zzrw(this));
        this.zzb = loudnessCodecControllerCreate;
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((android.media.MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
