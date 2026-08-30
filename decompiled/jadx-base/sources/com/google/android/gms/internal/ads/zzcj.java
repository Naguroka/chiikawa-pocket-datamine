package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcj {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzcj(int i, int i2, float f, float f2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i / i3;
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        int i5 = i4 + i4;
        this.zzh = i5;
        this.zzi = new short[i5];
        int i6 = i5 * i2;
        this.zzj = new short[i6];
        this.zzl = new short[i6];
        this.zzn = new short[i6];
    }

    private final int zzg(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = this.zzb * i;
                iAbs += java.lang.Math.abs(sArr[i9 + i8] - sArr[(i9 + i2) + i8]);
            }
            int i10 = iAbs * i6;
            int i11 = i4 * i2;
            if (i10 < i11) {
                i4 = iAbs;
            }
            if (i10 < i11) {
                i6 = i2;
            }
            int i12 = iAbs * i5;
            int i13 = i7 * i2;
            if (i12 > i13) {
                i7 = iAbs;
            }
            if (i12 > i13) {
                i5 = i2;
            }
            i2++;
        }
        this.zzu = i4 / i6;
        this.zzv = i7 / i5;
        return i6;
    }

    private final void zzh(short[] sArr, int i, int i2) {
        short[] sArrZzl = zzl(this.zzl, this.zzm, i2);
        this.zzl = sArrZzl;
        int i3 = this.zzm;
        int i4 = this.zzb;
        java.lang.System.arraycopy(sArr, i * i4, sArrZzl, i3 * i4, i2 * i4);
        this.zzm += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.zzh / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.zzb;
                i3 = i7 * i2;
                if (i5 < i3) {
                    i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                    i5++;
                }
            }
            this.zzi[i4] = (short) (i6 / i3);
        }
    }

    private static void zzj(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    private final short[] zzl(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.zzb;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : java.util.Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int zza() {
        int i = this.zzm * this.zzb;
        return i + i;
    }

    public final int zzb() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0d;
    }

    public final void zzd(java.nio.ShortBuffer shortBuffer) {
        int iMin = java.lang.Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * iMin);
        int i = this.zzm - iMin;
        this.zzm = i;
        int i2 = this.zzb;
        short[] sArr = this.zzl;
        java.lang.System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    public final void zze() {
        int i;
        int i2 = this.zzk;
        int i3 = this.zzr;
        int i4 = this.zzm;
        float f = this.zzc;
        float f2 = this.zzd;
        int i5 = i4 + ((int) ((((((((double) (i2 - i3)) / ((double) (f / f2))) + ((double) i3)) + this.zzw) + ((double) this.zzo)) / ((double) (this.zze * f2))) + 0.5d));
        this.zzw = 0.0d;
        int i6 = this.zzh;
        this.zzj = zzl(this.zzj, i2, i6 + i6 + i2);
        int i7 = 0;
        while (true) {
            int i8 = this.zzh;
            int i9 = this.zzb;
            i = i8 + i8;
            if (i7 >= i * i9) {
                break;
            }
            this.zzj[(i9 * i2) + i7] = 0;
            i7++;
        }
        this.zzk += i;
        zzk();
        if (this.zzm > i5) {
            this.zzm = i5;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(java.nio.ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = iRemaining / i;
        int i3 = i * i2;
        short[] sArrZzl = zzl(this.zzj, this.zzk, i2);
        this.zzj = sArrZzl;
        shortBuffer.get(sArrZzl, this.zzk * this.zzb, (i3 + i3) / 2);
        this.zzk += i2;
        zzk();
    }

    private final void zzk() {
        int iZzg;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        double d = this.zzc / this.zzd;
        int i7 = this.zzm;
        int i8 = 0;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.zzk;
            if (i10 >= this.zzh) {
                int i11 = 0;
                while (true) {
                    int i12 = this.zzr;
                    if (i12 > 0) {
                        int iMin = java.lang.Math.min(this.zzh, i12);
                        zzh(this.zzj, i11, iMin);
                        this.zzr -= iMin;
                        i11 += iMin;
                    } else {
                        short[] sArr = this.zzj;
                        int i13 = this.zza;
                        int i14 = i13 > 4000 ? i13 / 4000 : i9;
                        if (this.zzb == i9 && i14 == i9) {
                            iZzg = zzg(sArr, i11, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i11, i14);
                            int iZzg2 = zzg(this.zzi, i8, this.zzf / i14, this.zzg / i14);
                            if (i14 != i9) {
                                int i15 = iZzg2 * i14;
                                int i16 = i14 * 4;
                                int i17 = this.zzf;
                                int i18 = i15 - i16;
                                if (i18 >= i17) {
                                    i17 = i18;
                                }
                                int i19 = i15 + i16;
                                int i20 = this.zzg;
                                if (i19 > i20) {
                                    i19 = i20;
                                }
                                if (this.zzb == i9) {
                                    iZzg = zzg(sArr, i11, i17, i19);
                                } else {
                                    zzi(sArr, i11, i9);
                                    iZzg = zzg(this.zzi, i8, i17, i19);
                                }
                            } else {
                                iZzg = iZzg2;
                            }
                        }
                        int i21 = this.zzu;
                        int i22 = (i21 == 0 || (i3 = this.zzs) == 0 || this.zzv > i21 * 3 || i21 + i21 <= this.zzt * 3) ? iZzg : i3;
                        int i23 = i11 + i22;
                        this.zzt = i21;
                        this.zzs = iZzg;
                        double d2 = i22;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzj;
                            double d3 = (-1.0d) + d;
                            if (d >= 2.0d) {
                                double d4 = (d2 / d3) + this.zzw;
                                int iRound = (int) java.lang.Math.round(d4);
                                this.zzw = d4 - ((double) iRound);
                                i2 = iRound;
                            } else {
                                double d5 = ((d2 * (2.0d - d)) / d3) + this.zzw;
                                int iRound2 = (int) java.lang.Math.round(d5);
                                this.zzr = iRound2;
                                this.zzw = d5 - ((double) iRound2);
                                i2 = i22;
                            }
                            short[] sArrZzl = zzl(this.zzl, this.zzm, i2);
                            this.zzl = sArrZzl;
                            zzj(i2, this.zzb, sArrZzl, this.zzm, sArr2, i11, sArr2, i23);
                            this.zzm += i2;
                            i11 += i22 + i2;
                        } else {
                            int i24 = i22;
                            short[] sArr3 = this.zzj;
                            double d6 = 1.0d - d;
                            if (d < 0.5d) {
                                double d7 = ((d2 * d) / d6) + this.zzw;
                                int iRound3 = (int) java.lang.Math.round(d7);
                                this.zzw = d7 - ((double) iRound3);
                                i = iRound3;
                            } else {
                                double d8 = ((d2 * ((d + d) - 1.0d)) / d6) + this.zzw;
                                int iRound4 = (int) java.lang.Math.round(d8);
                                this.zzr = iRound4;
                                this.zzw = d8 - ((double) iRound4);
                                i = i24;
                            }
                            int i25 = i24 + i;
                            short[] sArrZzl2 = zzl(this.zzl, this.zzm, i25);
                            this.zzl = sArrZzl2;
                            int i26 = this.zzb;
                            java.lang.System.arraycopy(sArr3, i11 * i26, sArrZzl2, this.zzm * i26, i26 * i24);
                            zzj(i, this.zzb, this.zzl, this.zzm + i24, sArr3, i23, sArr3, i11);
                            this.zzm += i25;
                            i11 += i;
                        }
                    }
                    if (this.zzh + i11 > i10) {
                        break;
                    }
                    i8 = 0;
                    i9 = 1;
                }
                int i27 = this.zzk - i11;
                short[] sArr4 = this.zzj;
                int i28 = this.zzb;
                java.lang.System.arraycopy(sArr4, i11 * i28, sArr4, 0, i28 * i27);
                this.zzk = i27;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        float f = this.zze * this.zzd;
        if (f == 1.0f || this.zzm == i7) {
            return;
        }
        int i29 = this.zza;
        float f2 = i29 / f;
        long j3 = i29;
        long j4 = (long) f2;
        while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
            j4 /= 2;
            j3 /= 2;
        }
        int i30 = this.zzm - i7;
        short[] sArrZzl3 = zzl(this.zzn, this.zzo, i30);
        this.zzn = sArrZzl3;
        short[] sArr5 = this.zzl;
        int i31 = this.zzb;
        java.lang.System.arraycopy(sArr5, i7 * i31, sArrZzl3, this.zzo * i31, i31 * i30);
        this.zzm = i7;
        this.zzo += i30;
        int i32 = 0;
        while (true) {
            i4 = this.zzo;
            i5 = i4 - 1;
            if (i32 >= i5) {
                break;
            }
            while (true) {
                i6 = this.zzp + 1;
                j = i6;
                long j5 = j * j4;
                j2 = this.zzq;
                if (j5 <= j2 * j3) {
                    break;
                }
                this.zzl = zzl(this.zzl, this.zzm, 1);
                int i33 = 0;
                while (true) {
                    int i34 = this.zzb;
                    if (i33 < i34) {
                        short[] sArr6 = this.zzl;
                        int i35 = this.zzm * i34;
                        short[] sArr7 = this.zzn;
                        int i36 = (i32 * i34) + i33;
                        short s = sArr7[i36];
                        short s2 = sArr7[i36 + i34];
                        long j6 = ((long) this.zzq) * j3;
                        int i37 = this.zzp;
                        long j7 = j3;
                        long j8 = ((long) (i37 + 1)) * j4;
                        long j9 = j8 - (((long) i37) * j4);
                        long j10 = j8 - j6;
                        sArr6[i35 + i33] = (short) (((j10 * ((long) s)) + ((j9 - j10) * ((long) s2))) / j9);
                        i33++;
                        j3 = j7;
                        j4 = j4;
                    }
                }
                this.zzq++;
                this.zzm++;
                j3 = j3;
                j4 = j4;
            }
            long j11 = j3;
            long j12 = j4;
            this.zzp = i6;
            if (j == j11) {
                this.zzp = 0;
                com.google.android.gms.internal.ads.zzcw.zzf(j2 == j12);
                this.zzq = 0;
            }
            i32++;
            j3 = j11;
            j4 = j12;
        }
        if (i5 != 0) {
            short[] sArr8 = this.zzn;
            int i38 = this.zzb;
            java.lang.System.arraycopy(sArr8, i5 * i38, sArr8, 0, (i4 - i5) * i38);
            this.zzo -= i5;
        }
    }
}
