package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zztc implements com.google.android.gms.internal.ads.zzsd {
    private final android.media.MediaCodec zza;
    private final com.google.android.gms.internal.ads.zzrz zzb;

    /* synthetic */ zztc(android.media.MediaCodec mediaCodec, com.google.android.gms.internal.ads.zzrz zzrzVar, com.google.android.gms.internal.ads.zztb zztbVar) {
        this.zza = mediaCodec;
        this.zzb = zzrzVar;
        if (com.google.android.gms.internal.ads.zzei.zza < 35 || zzrzVar == null) {
            return;
        }
        zzrzVar.zza(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final int zzb(android.media.MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final android.media.MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final java.nio.ByteBuffer zzf(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final java.nio.ByteBuffer zzg(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzj() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzk(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzl(int i, int i2, com.google.android.gms.internal.ads.zzhe zzheVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzheVar.zza(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzm() {
        com.google.android.gms.internal.ads.zzrz zzrzVar;
        try {
            if (com.google.android.gms.internal.ads.zzei.zza >= 30 && com.google.android.gms.internal.ads.zzei.zza < 33) {
                this.zza.stop();
            }
            if (com.google.android.gms.internal.ads.zzei.zza >= 35 && this.zzb != null) {
            }
        } finally {
            if (com.google.android.gms.internal.ads.zzei.zza >= 35 && (zzrzVar = this.zzb) != null) {
                zzrzVar.zzc(this.zza);
            }
            this.zza.release();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzn(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzo(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzp(android.view.Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzq(android.os.Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzr(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final /* synthetic */ boolean zzs(com.google.android.gms.internal.ads.zzsc zzscVar) {
        return false;
    }
}
