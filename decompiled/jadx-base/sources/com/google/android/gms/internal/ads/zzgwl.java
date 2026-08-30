package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgwl extends com.google.android.gms.internal.ads.zzgwp {
    private final java.lang.Iterable zze;
    private final java.util.Iterator zzf;
    private java.nio.ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    /* synthetic */ zzgwl(java.lang.Iterable iterable, int i, boolean z, com.google.android.gms.internal.ads.zzgwo zzgwoVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = i;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i != 0) {
            zzM();
            return;
        }
        this.zzg = com.google.android.gms.internal.ads.zzgye.zzc;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzI() {
        return (int) ((((long) (this.zzh - this.zzl)) - this.zzm) + this.zzn);
    }

    private final void zzJ() throws com.google.android.gms.internal.ads.zzgyg {
        if (!this.zzf.hasNext()) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        zzM();
    }

    private final void zzK(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 > zzI()) {
            if (i2 > 0) {
                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzJ();
            }
            int iMin = java.lang.Math.min(i3, (int) (this.zzo - this.zzm));
            long j = iMin;
            com.google.android.gms.internal.ads.zzhao.zzo(this.zzm, bArr, i2 - i3, j);
            i3 -= iMin;
            this.zzm += j;
        }
    }

    private final void zzL() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzj;
        if (i <= i2) {
            this.zzi = 0;
            return;
        }
        int i3 = i - i2;
        this.zzi = i3;
        this.zzh = i - i3;
    }

    private final void zzM() {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long jPosition = byteBuffer.position();
        this.zzm = jPosition;
        this.zzn = jPosition;
        this.zzo = this.zzg.limit();
        long jZze = com.google.android.gms.internal.ads.zzhao.zze(this.zzg);
        this.zzm += jZze;
        this.zzn += jZze;
        this.zzo += jZze;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzA() throws java.io.IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzB() throws java.io.IOException {
        return zzr() != 0;
    }

    final long zzC() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZzh = zzh();
            j |= ((long) (bZzh & 127)) << i;
            if ((bZzh & 128) == 0) {
                return j;
            }
        }
        throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final double zza() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final float zzb() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzc() {
        return (int) ((((long) this.zzl) + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zze() throws java.io.IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzf() throws java.io.IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzg() throws java.io.IOException {
        return zzp();
    }

    public final byte zzh() throws java.io.IOException {
        if (this.zzo - this.zzm == 0) {
            zzJ();
        }
        long j = this.zzm;
        this.zzm = 1 + j;
        return com.google.android.gms.internal.ads.zzhao.zza(j);
    }

    public final int zzi() throws java.io.IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 4) {
            int iZzh = zzh() & 255;
            int iZzh2 = (zzh() & 255) << 8;
            return iZzh | iZzh2 | ((zzh() & 255) << 16) | ((zzh() & 255) << 24);
        }
        this.zzm = 4 + j2;
        int iZza = com.google.android.gms.internal.ads.zzhao.zza(j2) & 255;
        int iZza2 = (com.google.android.gms.internal.ads.zzhao.zza(1 + j2) & 255) << 8;
        return iZza | iZza2 | ((com.google.android.gms.internal.ads.zzhao.zza(2 + j2) & 255) << 16) | ((com.google.android.gms.internal.ads.zzhao.zza(j2 + 3) & 255) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzj() throws java.io.IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzk() throws java.io.IOException {
        return zzD(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzl() throws java.io.IOException {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int iZzp = zzp();
        this.zzk = iZzp;
        if ((iZzp >>> 3) != 0) {
            return iZzp;
        }
        throw new com.google.android.gms.internal.ads.zzgyg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzm() throws java.io.IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzn() throws java.io.IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzo() throws java.io.IOException {
        return zzr();
    }

    public final long zzq() throws java.io.IOException {
        long j = this.zzo;
        long j2 = this.zzm;
        if (j - j2 < 8) {
            long jZzh = ((long) zzh()) & 255;
            long jZzh2 = (((long) zzh()) & 255) << 8;
            long jZzh3 = (((long) zzh()) & 255) << 16;
            long jZzh4 = (((long) zzh()) & 255) << 24;
            long jZzh5 = (((long) zzh()) & 255) << 32;
            long jZzh6 = (((long) zzh()) & 255) << 40;
            return jZzh | jZzh2 | jZzh3 | jZzh4 | jZzh5 | jZzh6 | ((((long) zzh()) & 255) << 48) | ((((long) zzh()) & 255) << 56);
        }
        this.zzm = 8 + j2;
        long jZza = ((long) com.google.android.gms.internal.ads.zzhao.zza(j2)) & 255;
        long jZza2 = (((long) com.google.android.gms.internal.ads.zzhao.zza(1 + j2)) & 255) << 8;
        long jZza3 = (((long) com.google.android.gms.internal.ads.zzhao.zza(j2 + 2)) & 255) << 16;
        long jZza4 = (((long) com.google.android.gms.internal.ads.zzhao.zza(3 + j2)) & 255) << 24;
        long jZza5 = (((long) com.google.android.gms.internal.ads.zzhao.zza(j2 + 4)) & 255) << 32;
        long jZza6 = (((long) com.google.android.gms.internal.ads.zzhao.zza(j2 + 5)) & 255) << 40;
        return jZza5 | jZza | jZza2 | jZza3 | jZza4 | jZza6 | ((((long) com.google.android.gms.internal.ads.zzhao.zza(j2 + 6)) & 255) << 48) | ((((long) com.google.android.gms.internal.ads.zzhao.zza(j2 + 7)) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzs() throws java.io.IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzt() throws java.io.IOException {
        return zzF(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final long zzu() throws java.io.IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final com.google.android.gms.internal.ads.zzgwj zzv() throws java.io.IOException {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzp;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iZzp];
                com.google.android.gms.internal.ads.zzhao.zzo(j2, bArr, 0L, j3);
                this.zzm += j3;
                return new com.google.android.gms.internal.ads.zzgwg(bArr);
            }
        }
        if (iZzp > 0 && iZzp <= zzI()) {
            byte[] bArr2 = new byte[iZzp];
            zzK(bArr2, 0, iZzp);
            return new com.google.android.gms.internal.ads.zzgwg(bArr2);
        }
        if (iZzp == 0) {
            return com.google.android.gms.internal.ads.zzgwj.zzb;
        }
        if (iZzp < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final java.lang.String zzw() throws java.io.IOException {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzp;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[iZzp];
                com.google.android.gms.internal.ads.zzhao.zzo(j2, bArr, 0L, j3);
                java.lang.String str = new java.lang.String(bArr, com.google.android.gms.internal.ads.zzgye.zza);
                this.zzm += j3;
                return str;
            }
        }
        if (iZzp > 0 && iZzp <= zzI()) {
            byte[] bArr2 = new byte[iZzp];
            zzK(bArr2, 0, iZzp);
            return new java.lang.String(bArr2, com.google.android.gms.internal.ads.zzgye.zza);
        }
        if (iZzp == 0) {
            return "";
        }
        if (iZzp < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final java.lang.String zzx() throws java.io.IOException {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j = this.zzo;
            long j2 = this.zzm;
            long j3 = iZzp;
            if (j3 <= j - j2) {
                java.lang.String strZzg = com.google.android.gms.internal.ads.zzhat.zzg(this.zzg, (int) (j2 - this.zzn), iZzp);
                this.zzm += j3;
                return strZzg;
            }
        }
        if (iZzp >= 0 && iZzp <= zzI()) {
            byte[] bArr = new byte[iZzp];
            zzK(bArr, 0, iZzp);
            return com.google.android.gms.internal.ads.zzhat.zzh(bArr, 0, iZzp);
        }
        if (iZzp == 0) {
            return "";
        }
        if (iZzp <= 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final void zzy(int i) throws com.google.android.gms.internal.ads.zzgyg {
        if (this.zzk != i) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final void zzz(int i) {
        this.zzj = i;
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzd(int i) throws com.google.android.gms.internal.ads.zzgyg {
        if (i < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzc = i + zzc();
        int i2 = this.zzj;
        if (iZzc > i2) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = iZzc;
        zzL();
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (com.google.android.gms.internal.ads.zzhao.zza(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzp() throws java.io.IOException {
        int i;
        long j = this.zzm;
        if (this.zzo != j) {
            long j2 = j + 1;
            byte bZza = com.google.android.gms.internal.ads.zzhao.zza(j);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j3 = j2 + 1;
                int iZza = bZza ^ (com.google.android.gms.internal.ads.zzhao.zza(j2) << 7);
                if (iZza < 0) {
                    i = iZza ^ (-128);
                } else {
                    long j4 = j3 + 1;
                    int iZza2 = iZza ^ (com.google.android.gms.internal.ads.zzhao.zza(j3) << 14);
                    if (iZza2 >= 0) {
                        i = iZza2 ^ 16256;
                    } else {
                        j3 = j4 + 1;
                        int iZza3 = iZza2 ^ (com.google.android.gms.internal.ads.zzhao.zza(j4) << 21);
                        if (iZza3 < 0) {
                            i = iZza3 ^ (-2080896);
                        } else {
                            j4 = j3 + 1;
                            byte bZza2 = com.google.android.gms.internal.ads.zzhao.zza(j3);
                            i = (iZza3 ^ (bZza2 << 28)) ^ 266354560;
                            if (bZza2 < 0) {
                                j3 = j4 + 1;
                                if (com.google.android.gms.internal.ads.zzhao.zza(j4) < 0) {
                                    j4 = j3 + 1;
                                    if (com.google.android.gms.internal.ads.zzhao.zza(j3) < 0) {
                                        j3 = j4 + 1;
                                        if (com.google.android.gms.internal.ads.zzhao.zza(j4) < 0) {
                                            j4 = j3 + 1;
                                            if (com.google.android.gms.internal.ads.zzhao.zza(j3) < 0) {
                                                j3 = j4 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j3 = j4;
                }
                this.zzm = j3;
                return i;
            }
        }
        return (int) zzC();
    }

    public final long zzr() throws java.io.IOException {
        long jZza;
        long j;
        long j2;
        int i;
        long j3 = this.zzm;
        if (this.zzo != j3) {
            long j4 = j3 + 1;
            byte bZza = com.google.android.gms.internal.ads.zzhao.zza(j3);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j5 = j4 + 1;
                int iZza = bZza ^ (com.google.android.gms.internal.ads.zzhao.zza(j4) << 7);
                if (iZza >= 0) {
                    long j6 = j5 + 1;
                    int iZza2 = iZza ^ (com.google.android.gms.internal.ads.zzhao.zza(j5) << 14);
                    if (iZza2 < 0) {
                        j5 = j6 + 1;
                        int iZza3 = iZza2 ^ (com.google.android.gms.internal.ads.zzhao.zza(j6) << 21);
                        if (iZza3 < 0) {
                            i = iZza3 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long jZza2 = ((long) iZza3) ^ (((long) com.google.android.gms.internal.ads.zzhao.zza(j5)) << 28);
                            if (jZza2 >= 0) {
                                j2 = 266354560;
                            } else {
                                long j7 = j6 + 1;
                                long jZza3 = jZza2 ^ (((long) com.google.android.gms.internal.ads.zzhao.zza(j6)) << 35);
                                if (jZza3 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    jZza2 = jZza3 ^ (((long) com.google.android.gms.internal.ads.zzhao.zza(j7)) << 42);
                                    if (jZza2 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        jZza3 = jZza2 ^ (((long) com.google.android.gms.internal.ads.zzhao.zza(j6)) << 49);
                                        if (jZza3 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            jZza = (jZza3 ^ (((long) com.google.android.gms.internal.ads.zzhao.zza(j7)) << 56)) ^ 71499008037633920L;
                                            if (jZza < 0) {
                                                long j8 = 1 + j6;
                                                if (com.google.android.gms.internal.ads.zzhao.zza(j6) >= 0) {
                                                    j5 = j8;
                                                }
                                            }
                                        }
                                    }
                                }
                                jZza = jZza3 ^ j;
                                j5 = j7;
                            }
                            jZza = jZza2 ^ j2;
                        }
                        this.zzm = j5;
                        return jZza;
                    }
                    jZza = iZza2 ^ 16256;
                    j5 = j6;
                    this.zzm = j5;
                    return jZza;
                }
                i = iZza ^ (-128);
                jZza = i;
                this.zzm = j5;
                return jZza;
            }
        }
        return zzC();
    }
}
