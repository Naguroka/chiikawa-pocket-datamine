package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgwm extends com.google.android.gms.internal.ads.zzgwp {
    private final java.io.InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzgwm(java.io.InputStream inputStream, int i, com.google.android.gms.internal.ads.zzgwo zzgwoVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        byte[] bArr = com.google.android.gms.internal.ads.zzgye.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final java.util.List zzI(int i) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i > 0) {
            int iMin = java.lang.Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.zze.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i2 = this.zzk + i;
        int i3 = this.zzl;
        if (i2 <= i3) {
            this.zzh = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzh = i4;
        this.zzg = i - i4;
    }

    private final void zzK(int i) throws java.io.IOException {
        if (zzL(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new com.google.android.gms.internal.ads.zzgyg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean zzL(int i) throws java.io.IOException {
        int i2 = this.zzi;
        int i3 = i2 + i;
        int i4 = this.zzg;
        if (i3 <= i4) {
            throw new java.lang.IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i5 = this.zzk;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.zzl) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.zzf;
                java.lang.System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.zzk + i2;
            this.zzk = i5;
            i4 = this.zzg - i2;
            this.zzg = i4;
            this.zzi = 0;
        }
        try {
            int i6 = this.zze.read(this.zzf, i4, java.lang.Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
            if (i6 == 0 || i6 < -1 || i6 > 4096) {
                throw new java.lang.IllegalStateException(java.lang.String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
            }
            if (i6 <= 0) {
                return false;
            }
            this.zzg += i6;
            zzJ();
            if (this.zzg >= i) {
                return true;
            }
            return zzL(i);
        } catch (com.google.android.gms.internal.ads.zzgyg e) {
            e.zza();
            throw e;
        }
    }

    private final byte[] zzM(int i, boolean z) throws java.io.IOException {
        byte[] bArrZzN = zzN(i);
        if (bArrZzN != null) {
            return bArrZzN;
        }
        int i2 = this.zzi;
        int i3 = this.zzg;
        int i4 = i3 - i2;
        this.zzk += i3;
        this.zzi = 0;
        this.zzg = 0;
        java.util.List<byte[]> listZzI = zzI(i - i4);
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.zzf, i2, bArr, 0, i4);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i) throws java.io.IOException {
        if (i == 0) {
            return com.google.android.gms.internal.ads.zzgye.zzb;
        }
        int i2 = this.zzk;
        int i3 = this.zzi;
        int i4 = i2 + i3 + i;
        if (androidx.media3.common.C.RATE_UNSET_INT + i4 > 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.zzl;
        if (i4 > i5) {
            zzC((i5 - i2) - i3);
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.zzg - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.zze.available()) {
                    return null;
                }
            } catch (com.google.android.gms.internal.ads.zzgyg e) {
                e.zza();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.zzf, this.zzi, bArr, 0, i6);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i6 < i) {
            try {
                int i8 = this.zze.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i8;
                i6 += i8;
            } catch (com.google.android.gms.internal.ads.zzgyg e2) {
                e2.zza();
                throw e2;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzA() throws java.io.IOException {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzB() throws java.io.IOException {
        return zzq() != 0;
    }

    public final void zzC(int i) throws java.io.IOException {
        int i2 = this.zzg;
        int i3 = this.zzi;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.zzi = i3 + i;
            return;
        }
        if (i < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.zzk;
        int i6 = i5 + i3;
        int i7 = this.zzl;
        if (i6 + i > i7) {
            zzC((i7 - i5) - i3);
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i6;
        this.zzg = 0;
        this.zzi = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.zze.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new java.lang.IllegalStateException(java.lang.String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (com.google.android.gms.internal.ads.zzgyg e) {
                    e.zza();
                    throw e;
                }
            } catch (java.lang.Throwable th) {
                this.zzk += i4;
                zzJ();
                throw th;
            }
        }
        this.zzk += i4;
        zzJ();
        if (i4 >= i) {
            return;
        }
        int i8 = this.zzg;
        int i9 = i8 - this.zzi;
        this.zzi = i8;
        zzK(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.zzg;
            if (i10 <= i11) {
                this.zzi = i10;
                return;
            } else {
                i9 += i11;
                this.zzi = i11;
                zzK(1);
            }
        }
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
        return this.zzk + this.zzi;
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
        int i = this.zzi;
        if (this.zzg - i < 4) {
            zzK(4);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 4;
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
        int i = this.zzi;
        if (this.zzg - i < 8) {
            zzK(8);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    final long zzr() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.zzi == this.zzg) {
                zzK(1);
            }
            byte[] bArr = this.zzf;
            int i2 = this.zzi;
            this.zzi = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered a malformed varint.");
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
        int i = this.zzg;
        int i2 = this.zzi;
        if (iZzi <= i - i2 && iZzi > 0) {
            com.google.android.gms.internal.ads.zzgwj zzgwjVarZzv = com.google.android.gms.internal.ads.zzgwj.zzv(this.zzf, i2, iZzi);
            this.zzi += iZzi;
            return zzgwjVarZzv;
        }
        if (iZzi == 0) {
            return com.google.android.gms.internal.ads.zzgwj.zzb;
        }
        if (iZzi < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzN = zzN(iZzi);
        if (bArrZzN != null) {
            return com.google.android.gms.internal.ads.zzgwj.zzv(bArrZzN, 0, bArrZzN.length);
        }
        int i3 = this.zzi;
        int i4 = this.zzg;
        int i5 = i4 - i3;
        this.zzk += i4;
        this.zzi = 0;
        this.zzg = 0;
        java.util.List<byte[]> listZzI = zzI(iZzi - i5);
        byte[] bArr = new byte[iZzi];
        java.lang.System.arraycopy(this.zzf, i3, bArr, 0, i5);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return new com.google.android.gms.internal.ads.zzgwg(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final java.lang.String zzw() throws java.io.IOException {
        int iZzi = zzi();
        if (iZzi > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (iZzi <= i - i2) {
                java.lang.String str = new java.lang.String(this.zzf, i2, iZzi, com.google.android.gms.internal.ads.zzgye.zza);
                this.zzi += iZzi;
                return str;
            }
        }
        if (iZzi == 0) {
            return "";
        }
        if (iZzi < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzi > this.zzg) {
            return new java.lang.String(zzM(iZzi, false), com.google.android.gms.internal.ads.zzgye.zza);
        }
        zzK(iZzi);
        java.lang.String str2 = new java.lang.String(this.zzf, this.zzi, iZzi, com.google.android.gms.internal.ads.zzgye.zza);
        this.zzi += iZzi;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final java.lang.String zzx() throws java.io.IOException {
        byte[] bArrZzM;
        int iZzi = zzi();
        int i = this.zzi;
        int i2 = this.zzg;
        if (iZzi <= i2 - i && iZzi > 0) {
            bArrZzM = this.zzf;
            this.zzi = i + iZzi;
        } else {
            if (iZzi == 0) {
                return "";
            }
            if (iZzi < 0) {
                throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iZzi <= i2) {
                zzK(iZzi);
                bArrZzM = this.zzf;
                this.zzi = iZzi;
            } else {
                bArrZzM = zzM(iZzi, false);
            }
        }
        return com.google.android.gms.internal.ads.zzhat.zzh(bArrZzM, i, iZzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final void zzy(int i) throws com.google.android.gms.internal.ads.zzgyg {
        if (this.zzj != i) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final void zzz(int i) {
        this.zzl = i;
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzd(int i) throws com.google.android.gms.internal.ads.zzgyg {
        if (i < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.zzk + this.zzi;
        if (i2 < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("Failed to parse the message.");
        }
        int i3 = this.zzl;
        if (i2 > i3) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i2;
        zzJ();
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] < 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzi() throws java.io.IOException {
        int i;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzi = i4;
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
                this.zzi = i5;
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
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzi = i4;
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
                        this.zzi = i5;
                        return j2;
                    }
                    j = i8 ^ 16256;
                    i5 = i7;
                    j2 = j;
                    this.zzi = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.zzi = i5;
                return j2;
            }
        }
        return zzr();
    }
}
