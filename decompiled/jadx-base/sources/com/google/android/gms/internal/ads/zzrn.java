package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzrn implements com.google.android.gms.internal.ads.zzsd {
    private final android.media.MediaCodec zza;
    private final com.google.android.gms.internal.ads.zzrt zzb;
    private final com.google.android.gms.internal.ads.zzse zzc;
    private final com.google.android.gms.internal.ads.zzrz zzd;
    private boolean zze;
    private int zzf = 0;

    /* synthetic */ zzrn(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, com.google.android.gms.internal.ads.zzse zzseVar, com.google.android.gms.internal.ads.zzrz zzrzVar, com.google.android.gms.internal.ads.zzrm zzrmVar) {
        this.zza = mediaCodec;
        this.zzb = new com.google.android.gms.internal.ads.zzrt(handlerThread);
        this.zzc = zzseVar;
        this.zzd = zzrzVar;
    }

    static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzrn zzrnVar, android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i) {
        com.google.android.gms.internal.ads.zzrz zzrzVar;
        zzrnVar.zzb.zzf(zzrnVar.zza);
        android.os.Trace.beginSection("configureCodec");
        zzrnVar.zza.configure(mediaFormat, surface, (android.media.MediaCrypto) null, i);
        android.os.Trace.endSection();
        zzrnVar.zzc.zzh();
        android.os.Trace.beginSection("startCodec");
        zzrnVar.zza.start();
        android.os.Trace.endSection();
        if (com.google.android.gms.internal.ads.zzei.zza >= 35 && (zzrzVar = zzrnVar.zzd) != null) {
            zzrzVar.zza(zzrnVar.zza);
        }
        zzrnVar.zzf = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String zzt(int i, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final int zzb(android.media.MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final android.media.MediaFormat zzc() {
        return this.zzb.zzc();
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
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzk(int i, int i2, int i3, long j, int i4) {
        this.zzc.zzd(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzl(int i, int i2, com.google.android.gms.internal.ads.zzhe zzheVar, long j, int i3) {
        this.zzc.zze(i, 0, zzheVar, j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzm() {
        com.google.android.gms.internal.ads.zzrz zzrzVar;
        com.google.android.gms.internal.ads.zzrz zzrzVar2;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzg();
                    this.zzb.zzh();
                }
                this.zzf = 2;
            } finally {
                if (!this.zze) {
                    if (com.google.android.gms.internal.ads.zzei.zza >= 30 && com.google.android.gms.internal.ads.zzei.zza < 33) {
                        this.zza.stop();
                    }
                    if (com.google.android.gms.internal.ads.zzei.zza >= 35 && (zzrzVar2 = this.zzd) != null) {
                        zzrzVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
            }
        } catch (java.lang.Throwable th) {
            if (com.google.android.gms.internal.ads.zzei.zza >= 35 && (zzrzVar = this.zzd) != null) {
                zzrzVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th;
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
        this.zzc.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzr(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final boolean zzs(com.google.android.gms.internal.ads.zzsc zzscVar) {
        this.zzb.zzg(zzscVar);
        return true;
    }
}
