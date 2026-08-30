package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdy {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final com.google.android.gms.internal.ads.zzfxs zzc = com.google.android.gms.internal.ads.zzfxs.zzr(java.nio.charset.StandardCharsets.US_ASCII, java.nio.charset.StandardCharsets.UTF_8, java.nio.charset.StandardCharsets.UTF_16, java.nio.charset.StandardCharsets.UTF_16BE, java.nio.charset.StandardCharsets.UTF_16LE);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzdy() {
        this.zzd = com.google.android.gms.internal.ads.zzei.zzf;
    }

    public zzdy(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
    }

    private final char zzO(java.nio.charset.Charset charset, char[] cArr) {
        int iZzP = zzP(charset);
        if (iZzP != 0) {
            int i = iZzP >> 16;
            for (char c : cArr) {
                char c2 = (char) i;
                if (c == c2) {
                    this.zze += (char) iZzP;
                    return c2;
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    private final int zzP(java.nio.charset.Charset charset) {
        byte bZza;
        int i;
        int i2;
        char cZzb;
        int i3;
        int i4;
        int i5 = 1;
        if (charset.equals(java.nio.charset.StandardCharsets.UTF_8) || charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            int i6 = this.zzf;
            int i7 = this.zze;
            if (i6 - i7 > 0) {
                bZza = (byte) com.google.android.gms.internal.ads.zzgan.zza(this.zzd[i7] & 255);
            } else {
                if (!charset.equals(java.nio.charset.StandardCharsets.UTF_16) || charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                    i = this.zzf;
                    i2 = this.zze;
                    if (i - i2 >= 2) {
                        byte[] bArr = this.zzd;
                        cZzb = com.google.android.gms.internal.ads.zzgan.zzb(bArr[i2], bArr[i2 + 1]);
                    } else {
                        if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                            return 0;
                        }
                        i3 = this.zzf;
                        i4 = this.zze;
                        if (i3 - i4 >= 2) {
                            return 0;
                        }
                        byte[] bArr2 = this.zzd;
                        cZzb = com.google.android.gms.internal.ads.zzgan.zzb(bArr2[i4 + 1], bArr2[i4]);
                    }
                } else {
                    if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i3 = this.zzf;
                    i4 = this.zze;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr3 = this.zzd;
                    cZzb = com.google.android.gms.internal.ads.zzgan.zzb(bArr3[i4 + 1], bArr3[i4]);
                }
                bZza = (byte) cZzb;
                i5 = 2;
            }
        } else {
            if (charset.equals(java.nio.charset.StandardCharsets.UTF_16)) {
                i = this.zzf;
                i2 = this.zze;
                if (i - i2 >= 2) {
                    byte[] bArr4 = this.zzd;
                    cZzb = com.google.android.gms.internal.ads.zzgan.zzb(bArr4[i2], bArr4[i2 + 1]);
                } else {
                    if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i3 = this.zzf;
                    i4 = this.zze;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr5 = this.zzd;
                    cZzb = com.google.android.gms.internal.ads.zzgan.zzb(bArr5[i4 + 1], bArr5[i4]);
                }
            } else {
                i = this.zzf;
                i2 = this.zze;
                if (i - i2 >= 2) {
                    byte[] bArr6 = this.zzd;
                    cZzb = com.google.android.gms.internal.ads.zzgan.zzb(bArr6[i2], bArr6[i2 + 1]);
                } else {
                    if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                        return 0;
                    }
                    i3 = this.zzf;
                    i4 = this.zze;
                    if (i3 - i4 >= 2) {
                        return 0;
                    }
                    byte[] bArr7 = this.zzd;
                    cZzb = com.google.android.gms.internal.ads.zzgan.zzb(bArr7[i4 + 1], bArr7[i4]);
                }
            }
            bZza = (byte) cZzb;
            i5 = 2;
        }
        return (com.google.android.gms.internal.ads.zzgan.zza(bZza) << 16) + i5;
    }

    public final java.lang.String zzA(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.zze;
        int i3 = (i2 + i) - 1;
        java.lang.String strZzC = com.google.android.gms.internal.ads.zzei.zzC(this.zzd, i2, (i3 >= this.zzf || this.zzd[i3] != 0) ? i : i - 1);
        this.zze += i;
        return strZzC;
    }

    public final java.lang.String zzB(int i, java.nio.charset.Charset charset) {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        java.lang.String str = new java.lang.String(bArr, i2, i, charset);
        this.zze = i2 + i;
        return str;
    }

    public final java.nio.charset.Charset zzC() {
        int i = this.zzf;
        int i2 = this.zze;
        int i3 = i - i2;
        if (i3 >= 3) {
            byte[] bArr = this.zzd;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.zze = i2 + 3;
                return java.nio.charset.StandardCharsets.UTF_8;
            }
        }
        if (i3 < 2) {
            return null;
        }
        byte[] bArr2 = this.zzd;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.zze = i2 + 2;
            return java.nio.charset.StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.zze = i2 + 2;
        return java.nio.charset.StandardCharsets.UTF_16LE;
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zze = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final short zzE() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zze = i2 + 1;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    public final void zzF(int i) {
        byte[] bArr = this.zzd;
        if (i > bArr.length) {
            this.zzd = java.util.Arrays.copyOf(bArr, i);
        }
    }

    public final void zzG(com.google.android.gms.internal.ads.zzdx zzdxVar, int i) {
        zzH(zzdxVar.zza, 0, i);
        zzdxVar.zzl(0);
    }

    public final void zzH(byte[] bArr, int i, int i2) {
        java.lang.System.arraycopy(this.zzd, this.zze, bArr, i, i2);
        this.zze += i2;
    }

    public final void zzI(int i) {
        byte[] bArr = this.zzd;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzJ(bArr, i);
    }

    public final void zzJ(byte[] bArr, int i) {
        this.zzd = bArr;
        this.zzf = i;
        this.zze = 0;
    }

    public final void zzK(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzd.length) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z);
        this.zzf = i;
    }

    public final void zzL(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzf) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(z);
        this.zze = i;
    }

    public final void zzM(int i) {
        zzL(this.zze + i);
    }

    public final byte[] zzN() {
        return this.zzd;
    }

    public final char zza(java.nio.charset.Charset charset) {
        com.google.android.gms.internal.ads.zzcw.zze(zzc.contains(charset), "Unsupported charset: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(charset))));
        return (char) (zzP(charset) >> 16);
    }

    public final int zzb() {
        return this.zzf - this.zze;
    }

    public final int zzc() {
        return this.zzd.length;
    }

    public final int zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        int i5 = bArr[i2] & 255;
        int i6 = i4 + 1;
        int i7 = bArr[i4] & 255;
        this.zze = i6 + 1;
        return (bArr[i6] & 255) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        int i5 = bArr[i2] & 255;
        this.zze = i4 + 1;
        return (bArr[i4] & 255) | ((i3 << 24) >> 8) | (i5 << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        int i5 = bArr[i2] & 255;
        int i6 = i4 + 1;
        int i7 = bArr[i4] & 255;
        this.zze = i6 + 1;
        return ((bArr[i6] & 255) << 24) | i3 | (i5 << 8) | (i7 << 16);
    }

    public final int zzj() {
        int iZzi = zzi();
        if (iZzi >= 0) {
            return iZzi;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + iZzi);
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zze = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        this.zze = i + 1;
        return bArr[i] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = bArr[i2] & 255;
        this.zze = i2 + 1 + 2;
        return i4 | (i3 << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        int i4 = i2 + 1;
        int i5 = bArr[i2] & 255;
        this.zze = i4 + 1;
        return (bArr[i4] & 255) | (i3 << 16) | (i5 << 8);
    }

    public final int zzp() {
        int iZzg = zzg();
        if (iZzg >= 0) {
            return iZzg;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + iZzg);
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zze = i2 + 1;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final long zzr() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        long j = bArr[i];
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        long j3 = bArr[i3];
        int i5 = i4 + 1;
        long j4 = bArr[i4];
        int i6 = i5 + 1;
        long j5 = bArr[i5];
        int i7 = i6 + 1;
        long j6 = bArr[i6];
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        this.zze = i8 + 1;
        return ((bArr[i8] & 255) << 56) | ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
    }

    public final long zzs() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        long j = bArr[i];
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        long j3 = bArr[i3];
        this.zze = i4 + 1;
        return ((((long) bArr[i4]) & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long zzt() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        long j = bArr[i];
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        long j3 = bArr[i3];
        int i5 = i4 + 1;
        long j4 = bArr[i4];
        int i6 = i5 + 1;
        long j5 = bArr[i5];
        int i7 = i6 + 1;
        long j6 = bArr[i6];
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        this.zze = i8 + 1;
        return (((long) bArr[i8]) & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long zzu() {
        byte[] bArr = this.zzd;
        int i = this.zze;
        int i2 = i + 1;
        long j = bArr[i];
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        int i4 = i3 + 1;
        long j3 = bArr[i3];
        this.zze = i4 + 1;
        return (((long) bArr[i4]) & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long zzw() {
        long jZzt = zzt();
        if (jZzt >= 0) {
            return jZzt;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + jZzt);
    }

    public final long zzx() {
        int i;
        int i2;
        long j = this.zzd[this.zze];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) == 0) {
                if (i3 >= 6) {
                    if (i3 != 7) {
                        break;
                    }
                    i = 1;
                    break;
                }
                j &= (long) (i4 - 1);
                i = 7 - i3;
                break;
            }
            i3--;
        }
        if (i == 0) {
            throw new java.lang.NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i2 = 1; i2 < i; i2++) {
            byte b = this.zzd[this.zze + i2];
            if ((b & 192) != 128) {
                throw new java.lang.NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & okio.Utf8.REPLACEMENT_BYTE));
        }
        this.zze += i;
        return j;
    }

    public final java.lang.String zzy(char c) {
        int i = this.zzf;
        int i2 = this.zze;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.zzf && this.zzd[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.zzd;
        int i3 = this.zze;
        java.lang.String strZzC = com.google.android.gms.internal.ads.zzei.zzC(bArr, i3, i2 - i3);
        this.zze = i2;
        if (i2 < this.zzf) {
            this.zze = i2 + 1;
        }
        return strZzC;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6 A[SYNTHETIC] */
    public final java.lang.String zzz(java.nio.charset.Charset charset) {
        byte[] bArr;
        com.google.android.gms.internal.ads.zzcw.zze(zzc.contains(charset), "Unsupported charset: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(charset))));
        if (this.zzf - this.zze == 0) {
            return null;
        }
        if (!charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            zzC();
        }
        int i = 1;
        if (!charset.equals(java.nio.charset.StandardCharsets.UTF_8) && !charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            i = 2;
            if (!charset.equals(java.nio.charset.StandardCharsets.UTF_16) && !charset.equals(java.nio.charset.StandardCharsets.UTF_16LE) && !charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                throw new java.lang.IllegalArgumentException("Unsupported charset: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(charset))));
            }
        }
        int i2 = this.zze;
        while (true) {
            int i3 = this.zzf;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(java.nio.charset.StandardCharsets.UTF_8) || charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) && com.google.android.gms.internal.ads.zzei.zzL(this.zzd[i2])) {
                break;
            }
            if (charset.equals(java.nio.charset.StandardCharsets.UTF_16) || charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.zzd;
                if (bArr2[i2] == 0 && com.google.android.gms.internal.ads.zzei.zzL(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                    bArr = this.zzd;
                    if (bArr[i2 + 1] == 0 && com.google.android.gms.internal.ads.zzei.zzL(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                    bArr = this.zzd;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        java.lang.String strZzB = zzB(i2 - this.zze, charset);
        if (this.zze != this.zzf && zzO(charset, zza) == '\r') {
            zzO(charset, zzb);
        }
        return strZzB;
    }

    public zzdy(int i) {
        this.zzd = new byte[i];
        this.zzf = i;
    }

    public final long zzv() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.zze == this.zzf) {
                throw new java.lang.IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzm = zzm();
            j |= (127 & jZzm) << (i * 7);
            if ((jZzm & 128) == 0) {
                break;
            }
        }
        return j;
    }

    public zzdy(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}
