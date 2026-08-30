package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzrr implements com.google.android.gms.internal.ads.zzse {
    private static final java.util.ArrayDeque zza = new java.util.ArrayDeque();
    private static final java.lang.Object zzb = new java.lang.Object();
    private final android.media.MediaCodec zzc;
    private final android.os.HandlerThread zzd;
    private android.os.Handler zze;
    private final java.util.concurrent.atomic.AtomicReference zzf;
    private final com.google.android.gms.internal.ads.zzda zzg;
    private boolean zzh;

    public zzrr(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread) {
        com.google.android.gms.internal.ads.zzda zzdaVar = new com.google.android.gms.internal.ads.zzda(com.google.android.gms.internal.ads.zzcx.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdaVar;
        this.zzf = new java.util.concurrent.atomic.AtomicReference();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzrr zzrrVar, android.os.Message message) {
        com.google.android.gms.internal.ads.zzrq zzrqVar;
        java.util.ArrayDeque arrayDeque;
        int i = message.what;
        com.google.android.gms.internal.ads.zzrq zzrqVar2 = null;
        if (i != 1) {
            if (i == 2) {
                zzrqVar = (com.google.android.gms.internal.ads.zzrq) message.obj;
                int i2 = zzrqVar.zza;
                int i3 = zzrqVar.zzb;
                android.media.MediaCodec.CryptoInfo cryptoInfo = zzrqVar.zzd;
                long j = zzrqVar.zze;
                int i4 = zzrqVar.zzf;
                try {
                    synchronized (zzb) {
                        zzrrVar.zzc.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i4);
                    }
                } catch (java.lang.RuntimeException e) {
                    com.google.android.gms.internal.ads.zzro.zza(zzrrVar.zzf, null, e);
                }
            } else if (i == 3) {
                zzrrVar.zzg.zze();
            } else if (i != 4) {
                com.google.android.gms.internal.ads.zzro.zza(zzrrVar.zzf, null, new java.lang.IllegalStateException(java.lang.String.valueOf(message.what)));
            } else {
                try {
                    zzrrVar.zzc.setParameters((android.os.Bundle) message.obj);
                } catch (java.lang.RuntimeException e2) {
                    com.google.android.gms.internal.ads.zzro.zza(zzrrVar.zzf, null, e2);
                }
            }
            if (zzrqVar2 != null) {
                arrayDeque = zza;
                synchronized (arrayDeque) {
                    arrayDeque.add(zzrqVar2);
                }
            }
        }
        zzrqVar = (com.google.android.gms.internal.ads.zzrq) message.obj;
        int i5 = zzrqVar.zza;
        int i6 = zzrqVar.zzb;
        try {
            zzrrVar.zzc.queueInputBuffer(i5, 0, zzrqVar.zzc, zzrqVar.zze, zzrqVar.zzf);
        } catch (java.lang.RuntimeException e3) {
            com.google.android.gms.internal.ads.zzro.zza(zzrrVar.zzf, null, e3);
        }
        zzrqVar2 = zzrqVar;
        if (zzrqVar2 != null) {
            arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzrqVar2);
            }
        }
    }

    private static com.google.android.gms.internal.ads.zzrq zzi() {
        java.util.ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new com.google.android.gms.internal.ads.zzrq();
            }
            return (com.google.android.gms.internal.ads.zzrq) arrayDeque.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzb() {
        if (this.zzh) {
            try {
                android.os.Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                android.os.Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                this.zzg.zza();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.lang.IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzc() {
        java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzd(int i, int i2, int i3, long j, int i4) {
        zzc();
        com.google.android.gms.internal.ads.zzrq zzrqVarZzi = zzi();
        zzrqVarZzi.zza(i, 0, i3, j, i4);
        android.os.Handler handler = this.zze;
        int i5 = com.google.android.gms.internal.ads.zzei.zza;
        handler.obtainMessage(1, zzrqVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zze(int i, int i2, com.google.android.gms.internal.ads.zzhe zzheVar, long j, int i3) {
        zzc();
        com.google.android.gms.internal.ads.zzrq zzrqVarZzi = zzi();
        zzrqVarZzi.zza(i, 0, 0, j, 0);
        android.media.MediaCodec.CryptoInfo cryptoInfo = zzrqVarZzi.zzd;
        cryptoInfo.numSubSamples = zzheVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzheVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzheVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzj = zzj(zzheVar.zzb, cryptoInfo.key);
        bArrZzj.getClass();
        cryptoInfo.key = bArrZzj;
        byte[] bArrZzj2 = zzj(zzheVar.zza, cryptoInfo.iv);
        bArrZzj2.getClass();
        cryptoInfo.iv = bArrZzj2;
        cryptoInfo.mode = zzheVar.zzc;
        if (com.google.android.gms.internal.ads.zzei.zza >= 24) {
            cryptoInfo.setPattern(new android.media.MediaCodec.CryptoInfo.Pattern(zzheVar.zzg, zzheVar.zzh));
        }
        this.zze.obtainMessage(2, zzrqVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzf(android.os.Bundle bundle) {
        zzc();
        android.os.Handler handler = this.zze;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzh() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new com.google.android.gms.internal.ads.zzrp(this, this.zzd.getLooper());
        this.zzh = true;
    }

    private static byte[] zzj(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return java.util.Arrays.copyOf(bArr, bArr.length);
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzk(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return java.util.Arrays.copyOf(iArr, iArr.length);
        }
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }
}
