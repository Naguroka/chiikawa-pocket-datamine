package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgwn extends com.google.android.gms.internal.ads.zzgwp {
    private final java.nio.ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzgwn(java.nio.ByteBuffer byteBuffer, boolean z, com.google.android.gms.internal.ads.zzgwo zzgwoVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zze = byteBuffer;
        long jZze = com.google.android.gms.internal.ads.zzhao.zze(byteBuffer);
        this.zzf = jZze;
        this.zzg = ((long) byteBuffer.limit()) + jZze;
        long jPosition = jZze + ((long) byteBuffer.position());
        this.zzh = jPosition;
        this.zzi = jPosition;
    }

    private final int zzC() {
        return (int) (this.zzg - this.zzh);
    }

    private final void zzI() {
        long j = this.zzg + ((long) this.zzj);
        this.zzg = j;
        int i = (int) (j - this.zzi);
        int i2 = this.zzl;
        if (i <= i2) {
            this.zzj = 0;
            return;
        }
        int i3 = i - i2;
        this.zzj = i3;
        this.zzg = j - ((long) i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzA() throws java.io.IOException {
        return this.zzh == this.zzg;
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
        return (int) (this.zzh - this.zzi);
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
        long j = this.zzh;
        if (this.zzg - j < 4) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzh = 4 + j;
        int iZza = com.google.android.gms.internal.ads.zzhao.zza(j) & 255;
        int iZza2 = com.google.android.gms.internal.ads.zzhao.zza(1 + j) & 255;
        int iZza3 = com.google.android.gms.internal.ads.zzhao.zza(2 + j) & 255;
        return ((com.google.android.gms.internal.ads.zzhao.zza(j + 3) & 255) << 24) | (iZza2 << 8) | iZza | (iZza3 << 16);
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
            this.zzk = 0;
            return 0;
        }
        int iZzi = zzi();
        this.zzk = iZzi;
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
        long j = this.zzh;
        if (this.zzg - j < 8) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzh = 8 + j;
        long jZza = com.google.android.gms.internal.ads.zzhao.zza(j);
        long jZza2 = com.google.android.gms.internal.ads.zzhao.zza(1 + j);
        long jZza3 = com.google.android.gms.internal.ads.zzhao.zza(2 + j);
        long jZza4 = com.google.android.gms.internal.ads.zzhao.zza(3 + j);
        long jZza5 = com.google.android.gms.internal.ads.zzhao.zza(4 + j);
        return ((((long) com.google.android.gms.internal.ads.zzhao.zza(j + 7)) & 255) << 56) | (jZza & 255) | ((jZza2 & 255) << 8) | ((jZza3 & 255) << 16) | ((jZza4 & 255) << 24) | ((jZza5 & 255) << 32) | ((com.google.android.gms.internal.ads.zzhao.zza(5 + j) & 255) << 40) | ((com.google.android.gms.internal.ads.zzhao.zza(6 + j) & 255) << 48);
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
        if (iZzi <= 0 || iZzi > zzC()) {
            if (iZzi == 0) {
                return com.google.android.gms.internal.ads.zzgwj.zzb;
            }
            if (iZzi < 0) {
                throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzi];
        long j = iZzi;
        com.google.android.gms.internal.ads.zzhao.zzo(this.zzh, bArr, 0L, j);
        this.zzh += j;
        return new com.google.android.gms.internal.ads.zzgwg(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final java.lang.String zzw() throws java.io.IOException {
        int iZzi = zzi();
        if (iZzi <= 0 || iZzi > zzC()) {
            if (iZzi == 0) {
                return "";
            }
            if (iZzi < 0) {
                throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzi];
        long j = iZzi;
        com.google.android.gms.internal.ads.zzhao.zzo(this.zzh, bArr, 0L, j);
        java.lang.String str = new java.lang.String(bArr, com.google.android.gms.internal.ads.zzgye.zza);
        this.zzh += j;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final java.lang.String zzx() throws java.io.IOException {
        int iZzi = zzi();
        if (iZzi > 0 && iZzi <= zzC()) {
            java.lang.String strZzg = com.google.android.gms.internal.ads.zzhat.zzg(this.zze, (int) (this.zzh - this.zzf), iZzi);
            this.zzh += (long) iZzi;
            return strZzg;
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
        if (this.zzk != i) {
            throw new com.google.android.gms.internal.ads.zzgyg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final void zzz(int i) {
        this.zzl = i;
        zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final int zzd(int i) throws com.google.android.gms.internal.ads.zzgyg {
        if (i < 0) {
            throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzc = i + zzc();
        int i2 = this.zzl;
        if (iZzc > i2) {
            throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = iZzc;
        zzI();
        return i2;
    }

    final long zzr() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.zzh;
            if (j2 == this.zzg) {
                throw new com.google.android.gms.internal.ads.zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.zzh = 1 + j2;
            byte bZza = com.google.android.gms.internal.ads.zzhao.zza(j2);
            j |= ((long) (bZza & 127)) << i;
            if ((bZza & 128) == 0) {
                return j;
            }
        }
        throw new com.google.android.gms.internal.ads.zzgyg("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (com.google.android.gms.internal.ads.zzhao.zza(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzi() throws java.io.IOException {
        int i;
        long j = this.zzh;
        if (this.zzg != j) {
            long j2 = j + 1;
            byte bZza = com.google.android.gms.internal.ads.zzhao.zza(j);
            if (bZza >= 0) {
                this.zzh = j2;
                return bZza;
            }
            if (this.zzg - j2 >= 9) {
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
                this.zzh = j3;
                return i;
            }
        }
        return (int) zzr();
    }

    public final long zzq() throws java.io.IOException {
        long jZza;
        long j;
        long j2;
        int i;
        long j3 = this.zzh;
        if (this.zzg != j3) {
            long j4 = j3 + 1;
            byte bZza = com.google.android.gms.internal.ads.zzhao.zza(j3);
            if (bZza >= 0) {
                this.zzh = j4;
                return bZza;
            }
            if (this.zzg - j4 >= 9) {
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
                        this.zzh = j5;
                        return jZza;
                    }
                    jZza = iZza2 ^ 16256;
                    j5 = j6;
                    this.zzh = j5;
                    return jZza;
                }
                i = iZza ^ (-128);
                jZza = i;
                this.zzh = j5;
                return jZza;
            }
        }
        return zzr();
    }
}
