package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzqu extends com.google.android.gms.internal.ads.zzci {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;
    private byte[] zzi = com.google.android.gms.internal.ads.zzei.zzf;
    private byte[] zzl = com.google.android.gms.internal.ads.zzei.zzf;

    private final int zzq(int i) {
        int iZzr = ((zzr(androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        com.google.android.gms.internal.ads.zzcw.zzf(iZzr >= 0);
        int iMin = (int) java.lang.Math.min((i * 0.2f) + 0.5f, iZzr);
        int i2 = this.zzd;
        return (iMin / i2) * i2;
    }

    private final int zzr(long j) {
        return (int) ((j * ((long) this.zzb.zzb)) / 1000000);
    }

    private static int zzs(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private final void zzt(boolean z) {
        int i;
        int length;
        int i2 = this.zzk;
        int length2 = this.zzi.length;
        if (i2 != length2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.zzh == 0) {
            if (z) {
                zzu(i2, 3);
                length = i2;
            } else {
                com.google.android.gms.internal.ads.zzcw.zzf(i2 >= (length2 >> 1));
                length = this.zzi.length >> 1;
                zzu(length, 0);
            }
            i = length;
        } else {
            int i3 = length2 >> 1;
            int i4 = i2 - i3;
            if (z) {
                int iZzq = zzq(i4) + (this.zzi.length >> 1);
                zzu(iZzq, 2);
                int i5 = i3 + i4;
                i = iZzq;
                length = i5;
            } else {
                int iZzq2 = zzq(i4);
                zzu(iZzq2, 1);
                i = iZzq2;
                length = i4;
            }
        }
        com.google.android.gms.internal.ads.zzcw.zzg(length % this.zzd == 0, "bytesConsumed is not aligned to frame size: %s" + length);
        com.google.android.gms.internal.ads.zzcw.zzf(i2 >= i);
        this.zzk -= length;
        int i6 = this.zzj + length;
        this.zzj = i6;
        this.zzj = i6 % this.zzi.length;
        int i7 = this.zzh;
        int i8 = this.zzd;
        this.zzh = i7 + (i / i8);
        this.zzg += (long) ((length - i) / i8);
    }

    private final void zzu(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(this.zzk >= i);
        if (i2 == 2) {
            int i4 = this.zzj;
            int i5 = this.zzk;
            int i6 = i4 + i5;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i6 <= length) {
                java.lang.System.arraycopy(bArr, i6 - i, this.zzl, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    java.lang.System.arraycopy(bArr, i7 - i, this.zzl, 0, i);
                } else {
                    int i8 = i - i7;
                    java.lang.System.arraycopy(bArr, length - i8, this.zzl, 0, i8);
                    java.lang.System.arraycopy(this.zzi, 0, this.zzl, i8, i7);
                }
            }
        } else {
            int i9 = this.zzj;
            int i10 = i9 + i;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i10 <= length2) {
                java.lang.System.arraycopy(bArr2, i9, this.zzl, 0, i);
            } else {
                int i11 = length2 - i9;
                java.lang.System.arraycopy(bArr2, i9, this.zzl, 0, i11);
                java.lang.System.arraycopy(this.zzi, 0, this.zzl, i11, i - i11);
            }
        }
        com.google.android.gms.internal.ads.zzcw.zze(i % this.zzd == 0, "sizeToOutput is not aligned to frame size: " + i);
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        com.google.android.gms.internal.ads.zzcw.zze(i % this.zzd == 0, "byteOutput size is not aligned to frame size " + i);
        if (i2 != 3) {
            for (int i12 = 0; i12 < i; i12 += 2) {
                int i13 = i12 + 1;
                int iZzs = zzs(bArr3[i13], bArr3[i12]);
                if (i2 == 0) {
                    i3 = ((((i12 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i12) / (i - 1)) / 1000);
                    }
                }
                int i14 = (iZzs * i3) / 100;
                if (i14 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = 127;
                } else if (i14 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = -128;
                } else {
                    bArr3[i12] = (byte) (i14 & 255);
                    bArr3[i13] = (byte) (i14 >> 8);
                }
            }
        }
        zzj(i).put(bArr3, 0, i).flip();
    }

    private static final boolean zzv(byte b, byte b2) {
        return java.lang.Math.abs(zzs(b, b2)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zze(java.nio.ByteBuffer byteBuffer) {
        int iLimit;
        int i;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzn()) {
            if (this.zzf != 0) {
                com.google.android.gms.internal.ads.zzcw.zzf(this.zzj < this.zzi.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i2 = this.zzd;
                            iLimit = i2 * (iPosition2 / i2);
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i3 = this.zzj;
                int i4 = this.zzk;
                int i5 = i3 + i4;
                int length = this.zzi.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int iMin = java.lang.Math.min(iPosition3, i);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzi, i5, iMin);
                int i6 = this.zzk + iMin;
                this.zzk = i6;
                com.google.android.gms.internal.ads.zzcw.zzf(i6 <= this.zzi.length);
                boolean z = iLimit < iLimit2 && iPosition3 < i;
                zzt(z);
                if (z) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(java.lang.Math.min(iLimit3, byteBuffer.position() + this.zzi.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i7 = this.zzd;
                            iPosition = ((iLimit4 / i7) * i7) + i7;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(java.lang.Math.min(iPosition, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzch
    public final boolean zzg() {
        return super.zzg() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    protected final com.google.android.gms.internal.ads.zzcf zzi(com.google.android.gms.internal.ads.zzcf zzcfVar) throws com.google.android.gms.internal.ads.zzcg {
        if (zzcfVar.zzd == 2) {
            return zzcfVar.zzb == -1 ? com.google.android.gms.internal.ads.zzcf.zza : zzcfVar;
        }
        throw new com.google.android.gms.internal.ads.zzcg("Unhandled input format:", zzcfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final void zzk() {
        if (zzg()) {
            int i = this.zzb.zzc;
            this.zzd = i + i;
            int iZzr = zzr(androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) / 2;
            int i2 = this.zzd;
            int i3 = (iZzr / i2) * i2;
            int i4 = i3 + i3;
            if (this.zzi.length != i4) {
                this.zzi = new byte[i4];
                this.zzl = new byte[i4];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final void zzl() {
        if (this.zzk > 0) {
            zzt(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final void zzm() {
        this.zze = false;
        this.zzi = com.google.android.gms.internal.ads.zzei.zzf;
        this.zzl = com.google.android.gms.internal.ads.zzei.zzf;
    }

    public final long zzo() {
        return this.zzg;
    }

    public final void zzp(boolean z) {
        this.zze = z;
    }
}
