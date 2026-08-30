package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzrt extends android.media.MediaCodec.Callback {
    private final android.os.HandlerThread zzb;
    private android.os.Handler zzc;
    private android.media.MediaFormat zzh;
    private android.media.MediaFormat zzi;
    private android.media.MediaCodec.CodecException zzj;
    private android.media.MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private java.lang.IllegalStateException zzn;
    private com.google.android.gms.internal.ads.zzsc zzo;
    private final java.lang.Object zza = new java.lang.Object();
    private final androidx.collection.CircularIntArray zzd = new androidx.collection.CircularIntArray();
    private final androidx.collection.CircularIntArray zze = new androidx.collection.CircularIntArray();
    private final java.util.ArrayDeque zzf = new java.util.ArrayDeque();
    private final java.util.ArrayDeque zzg = new java.util.ArrayDeque();

    zzrt(android.os.HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzrt zzrtVar) {
        synchronized (zzrtVar.zza) {
            if (zzrtVar.zzm) {
                return;
            }
            long j = zzrtVar.zzl - 1;
            zzrtVar.zzl = j;
            if (j > 0) {
                return;
            }
            if (j >= 0) {
                zzrtVar.zzj();
                return;
            }
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException();
            synchronized (zzrtVar.zza) {
                zzrtVar.zzn = illegalStateException;
            }
        }
    }

    private final void zzi(android.media.MediaFormat mediaFormat) {
        this.zze.addLast(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzj() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (android.media.MediaFormat) this.zzg.getLast();
        }
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzk() {
        java.lang.IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        android.media.MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        android.media.MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    private final boolean zzl() {
        return this.zzl > 0 || this.zzm;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i) {
        synchronized (this.zza) {
            this.zzd.addLast(i);
            com.google.android.gms.internal.ads.zzsc zzscVar = this.zzo;
            if (zzscVar != null) {
                com.google.android.gms.internal.ads.zzsn zzsnVar = ((com.google.android.gms.internal.ads.zzsk) zzscVar).zza;
                if (zzsnVar.zzo != null) {
                    zzsnVar.zzo.zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i, android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            android.media.MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzi(mediaFormat);
                this.zzi = null;
            }
            this.zze.addLast(i);
            this.zzf.add(bufferInfo);
            com.google.android.gms.internal.ads.zzsc zzscVar = this.zzo;
            if (zzscVar != null) {
                com.google.android.gms.internal.ads.zzsn zzsnVar = ((com.google.android.gms.internal.ads.zzsk) zzscVar).zza;
                if (zzsnVar.zzo != null) {
                    zzsnVar.zzo.zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzi(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            zzk();
            int iPopFirst = -1;
            if (zzl()) {
                return -1;
            }
            if (!this.zzd.isEmpty()) {
                iPopFirst = this.zzd.popFirst();
            }
            return iPopFirst;
        }
    }

    public final int zzb(android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            zzk();
            if (zzl()) {
                return -1;
            }
            if (this.zze.isEmpty()) {
                return -1;
            }
            int iPopFirst = this.zze.popFirst();
            if (iPopFirst >= 0) {
                com.google.android.gms.internal.ads.zzcw.zzb(this.zzh);
                android.media.MediaCodec.BufferInfo bufferInfo2 = (android.media.MediaCodec.BufferInfo) this.zzf.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iPopFirst == -2) {
                this.zzh = (android.media.MediaFormat) this.zzg.remove();
                iPopFirst = -2;
            }
            return iPopFirst;
        }
    }

    public final android.media.MediaFormat zzc() {
        android.media.MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new java.lang.IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzl++;
            android.os.Handler handler = this.zzc;
            int i = com.google.android.gms.internal.ads.zzei.zza;
            handler.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzrs
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.ads.zzrt.zzd(this.zza);
                }
            });
        }
    }

    public final void zzf(android.media.MediaCodec mediaCodec) {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzc == null);
        this.zzb.start();
        android.os.Handler handler = new android.os.Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg(com.google.android.gms.internal.ads.zzsc zzscVar) {
        synchronized (this.zza) {
            this.zzo = zzscVar;
        }
    }

    public final void zzh() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }
}
