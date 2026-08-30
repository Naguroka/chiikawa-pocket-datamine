package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgwk extends com.google.android.gms.internal.ads.zzgwp {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    /* synthetic */ zzgwk(byte[] bArr, int i, int i2, boolean z, com.google.android.gms.internal.ads.zzgwo zzgwoVar) {
        super(null);
        this.zzk = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = i2 + i;
        this.zzh = i;
        this.zzi = i;
    }

    private final void zzC() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i2 = i - this.zzi;
        int i3 = this.zzk;
        if (i2 <= i3) {
            this.zzg = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzg = i4;
        this.zzf = i - i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzA() throws java.io.IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzB() throws java.io.IOException {
        return zzq() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final double zza() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final float zzb() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzc() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zze() throws java.io.IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzf() throws java.io.IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzg() throws java.io.IOException {
        return zzi();
    }

    public final int zzh() throws java.io.IOException {
        int i = this.zzh;
        if (this.zzf - i < 4) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzj() throws java.io.IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzk() throws java.io.IOException {
        return zzD(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzl() throws java.io.IOException {
        if (zzA()) {
            this.zzj = 0;
            return 0;
        }
        int iZzi = zzi();
        this.zzj = iZzi;
        if ((iZzi >>> 3) != 0) {
            return iZzi;
        }
        throw new com.google.android.gms.internal.ads.zzgyg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzm() throws java.io.IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzn() throws java.io.IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzo() throws java.io.IOException {
        return zzq();
    }

    public final long zzp() throws java.io.IOException {
        int i = this.zzh;
        if (this.zzf - i < 8) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzs() throws java.io.IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzt() throws java.io.IOException {
        return zzF(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzu() throws java.io.IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final com.google.android.gms.internal.ads.zzgwj zzv() throws java.io.IOException {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (iZzi <= i - i2) {
                com.google.android.gms.internal.ads.zzgwj zzgwjVarZzv = com.google.android.gms.internal.ads.zzgwj.zzv(this.zze, i2, iZzi);
                this.zzh += iZzi;
                return zzgwjVarZzv;
            }
        }
        if (iZzi == 0) {
            return com.google.android.gms.internal.ads.zzgwj.zzb;
        }
        if (iZzi > 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (iZzi <= i3 - i4) {
                int i5 = iZzi + i4;
                this.zzh = i5;
                return new com.google.android.gms.internal.ads.zzgwg(java.util.Arrays.copyOfRange(this.zze, i4, i5));
            }
        }
        if (iZzi <= 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final java.lang.String zzw() throws java.io.IOException {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (iZzi <= i - i2) {
                java.lang.String str = new java.lang.String(this.zze, i2, iZzi, com.google.android.gms.internal.ads.zzgye.zza);
                this.zzh += iZzi;
                return str;
            }
        }
        if (iZzi == 0) {
            return "";
        }
        if (iZzi < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final java.lang.String zzx() throws java.io.IOException {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (iZzi <= i - i2) {
                java.lang.String strZzh = com.google.android.gms.internal.ads.zzhat.zzh(this.zze, i2, iZzi);
                this.zzh += iZzi;
                return strZzh;
            }
        }
        if (iZzi == 0) {
            return "";
        }
        if (iZzi <= 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final void zzy(int i) throws com.google.android.gms.internal.ads.zzgyg {
        if (this.zzj != i) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final void zzz(int i) {
        this.zzk = i;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzd(int i) throws com.google.android.gms.internal.ads.zzgyg {
        if (i < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + (this.zzh - this.zzi);
        if (i2 < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("Failed to parse the message.");
        }
        int i3 = this.zzk;
        if (i2 > i3) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i2;
        zzC();
        return i3;
    }

    final long zzr() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.zzh;
            if (i2 == this.zzf) {
                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.zze;
            this.zzh = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] < 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzi() throws java.io.IOException {
        int i;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zze;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzh = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.zzh = i5;
                return i;
            }
        }
        return (int) zzr();
    }

    public final long zzq() throws java.io.IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zze;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzh = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 < 0) {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = ((long) i9) ^ (((long) bArr[i5]) << 28);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (((long) bArr[i7]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                }
                                            }
                                        }
                                        i5 = i10;
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                            }
                            j = j5 ^ j4;
                        }
                        this.zzh = i5;
                        return j2;
                    }
                    j = i8 ^ 16256;
                    i5 = i7;
                    j2 = j;
                    this.zzh = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.zzh = i5;
                return j2;
            }
        }
        return zzr();
    }
}
