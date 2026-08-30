package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzamf implements com.google.android.gms.internal.ads.zzamj {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final com.google.android.gms.internal.ads.zzdx zzc = new com.google.android.gms.internal.ads.zzdx(new byte[7], 7);
    private final com.google.android.gms.internal.ads.zzdy zzd = new com.google.android.gms.internal.ads.zzdy(java.util.Arrays.copyOf(zza, 10));
    private final java.lang.String zze;
    private final int zzf;
    private java.lang.String zzg;
    private com.google.android.gms.internal.ads.zzadt zzh;
    private com.google.android.gms.internal.ads.zzadt zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private com.google.android.gms.internal.ads.zzadt zzv;
    private long zzw;

    public zzamf(boolean z, java.lang.String str, int i) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = androidx.media3.common.C.TIME_UNSET;
        this.zzu = androidx.media3.common.C.TIME_UNSET;
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 256;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(com.google.android.gms.internal.ads.zzadt zzadtVar, long j, int i, int i2) {
        this.zzj = 4;
        this.zzk = i;
        this.zzv = zzadtVar;
        this.zzw = j;
        this.zzt = i2;
    }

    private final boolean zzk(com.google.android.gms.internal.ads.zzdy zzdyVar, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(zzdyVar.zzb(), i - this.zzk);
        zzdyVar.zzH(bArr, this.zzk, iMin);
        int i2 = this.zzk + iMin;
        this.zzk = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(com.google.android.gms.internal.ads.zzdy zzdyVar, byte[] bArr, int i) {
        if (zzdyVar.zzb() < i) {
            return false;
        }
        zzdyVar.zzH(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0283  */
    /* JADX WARN: Code duplicated, block: B:107:0x0287  */
    /* JADX WARN: Code duplicated, block: B:109:0x028b  */
    /* JADX WARN: Code duplicated, block: B:111:0x028f  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0212  */
    /* JADX WARN: Code duplicated, block: B:73:0x0221  */
    /* JADX WARN: Code duplicated, block: B:75:0x022c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0230  */
    /* JADX WARN: Code duplicated, block: B:79:0x0234  */
    /* JADX WARN: Code duplicated, block: B:84:0x0242  */
    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) throws com.google.android.gms.internal.ads.zzbc {
        int i;
        int i2;
        int i3;
        int i4;
        int iZzd;
        byte[] bArrZzN;
        int iZze;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        byte b2;
        this.zzh.getClass();
        int i9 = com.google.android.gms.internal.ads.zzei.zza;
        while (zzdyVar.zzb() > 0) {
            int i10 = this.zzj;
            int i11 = 13;
            int i12 = 2;
            if (i10 == 0) {
                byte[] bArrZzN2 = zzdyVar.zzN();
                int iZzd2 = zzdyVar.zzd();
                int iZze2 = zzdyVar.zze();
                while (true) {
                    if (iZzd2 < iZze2) {
                        int i13 = iZzd2 + 1;
                        int i14 = bArrZzN2[iZzd2] & 255;
                        if (this.zzl == 512 && zzl((byte) -1, (byte) i14)) {
                            if (!this.zzn) {
                                int i15 = i13 - 2;
                                zzdyVar.zzL(i15 + 1);
                                if (zzm(zzdyVar, this.zzc.zza, 1)) {
                                    this.zzc.zzl(4);
                                    int iZzd3 = this.zzc.zzd(1);
                                    int i16 = this.zzo;
                                    if (i16 == -1 || iZzd3 == i16) {
                                        if (this.zzp == -1) {
                                            if (zzm(zzdyVar, this.zzc.zza, 4)) {
                                                this.zzc.zzl(14);
                                                iZzd = this.zzc.zzd(i11);
                                                if (iZzd >= 7) {
                                                    bArrZzN = zzdyVar.zzN();
                                                    iZze = zzdyVar.zze();
                                                    i5 = i15 + iZzd;
                                                    if (i5 >= iZze) {
                                                        b = bArrZzN[i5];
                                                        if (b == -1) {
                                                            i8 = i5 + 1;
                                                            if (i8 != iZze) {
                                                                b2 = bArrZzN[i8];
                                                                if (zzl((byte) -1, b2) || ((b2 & 8) >> 3) != iZzd3) {
                                                                }
                                                            }
                                                        } else if (b == 73 || ((i6 = i5 + 1) != iZze && (bArrZzN[i6] != 68 || ((i7 = i5 + 2) != iZze && bArrZzN[i7] != 51)))) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (zzm(zzdyVar, this.zzc.zza, 1)) {
                                            this.zzc.zzl(i12);
                                            if (this.zzc.zzd(4) == this.zzp) {
                                                zzdyVar.zzL(i15 + 2);
                                                if (zzm(zzdyVar, this.zzc.zza, 4)) {
                                                    this.zzc.zzl(14);
                                                    iZzd = this.zzc.zzd(i11);
                                                    if (iZzd >= 7) {
                                                        bArrZzN = zzdyVar.zzN();
                                                        iZze = zzdyVar.zze();
                                                        i5 = i15 + iZzd;
                                                        if (i5 >= iZze) {
                                                            b = bArrZzN[i5];
                                                            if (b == -1) {
                                                                i8 = i5 + 1;
                                                                if (i8 != iZze) {
                                                                    b2 = bArrZzN[i8];
                                                                    if (zzl((byte) -1, b2)) {
                                                                    }
                                                                }
                                                            } else if (b == 73) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i = this.zzl;
                                i2 = i | i14;
                                if (i2 != 329) {
                                    i3 = 2;
                                    i4 = 768;
                                } else if (i2 != 511) {
                                    i3 = 2;
                                    i4 = 512;
                                } else if (i2 != 836) {
                                    i3 = 2;
                                    i4 = 1024;
                                } else if (i2 != 1075) {
                                    this.zzj = 2;
                                    this.zzk = 3;
                                    this.zzt = 0;
                                    this.zzd.zzL(0);
                                    zzdyVar.zzL(i13);
                                } else if (i != 256) {
                                    this.zzl = 256;
                                    iZzd2 = i13 - 1;
                                    i11 = 13;
                                    i12 = 2;
                                } else {
                                    i3 = 2;
                                    i12 = i3;
                                    iZzd2 = i13;
                                    i11 = 13;
                                }
                                this.zzl = i4;
                                i12 = i3;
                                iZzd2 = i13;
                                i11 = 13;
                            }
                            this.zzq = (i14 & 8) >> 3;
                            this.zzm = 1 == ((i14 & 1) ^ 1);
                            if (this.zzn) {
                                zzi();
                            } else {
                                this.zzj = 1;
                                this.zzk = 0;
                            }
                            zzdyVar.zzL(i13);
                        } else {
                            i = this.zzl;
                            i2 = i | i14;
                            if (i2 != 329) {
                                i3 = 2;
                                i4 = 768;
                            } else if (i2 != 511) {
                                i3 = 2;
                                i4 = 512;
                            } else if (i2 != 836) {
                                i3 = 2;
                                i4 = 1024;
                            } else if (i2 != 1075) {
                                this.zzj = 2;
                                this.zzk = 3;
                                this.zzt = 0;
                                this.zzd.zzL(0);
                                zzdyVar.zzL(i13);
                            } else if (i != 256) {
                                this.zzl = 256;
                                iZzd2 = i13 - 1;
                                i11 = 13;
                                i12 = 2;
                            } else {
                                i3 = 2;
                                i12 = i3;
                                iZzd2 = i13;
                                i11 = 13;
                            }
                            this.zzl = i4;
                            i12 = i3;
                            iZzd2 = i13;
                            i11 = 13;
                        }
                    } else {
                        zzdyVar.zzL(iZzd2);
                    }
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        int iMin = java.lang.Math.min(zzdyVar.zzb(), this.zzt - this.zzk);
                        this.zzv.zzr(zzdyVar, iMin);
                        int i17 = this.zzk + iMin;
                        this.zzk = i17;
                        if (i17 == this.zzt) {
                            com.google.android.gms.internal.ads.zzcw.zzf(this.zzu != androidx.media3.common.C.TIME_UNSET);
                            this.zzv.zzt(this.zzu, 1, this.zzt, 0, null);
                            this.zzu += this.zzw;
                            zzh();
                        }
                    } else {
                        if (zzk(zzdyVar, this.zzc.zza, true != this.zzm ? 5 : 7)) {
                            this.zzc.zzl(0);
                            if (this.zzr) {
                                this.zzc.zzn(10);
                            } else {
                                int iZzd4 = this.zzc.zzd(2) + 1;
                                if (iZzd4 != 2) {
                                    com.google.android.gms.internal.ads.zzdo.zzf("AdtsReader", "Detected audio object type: " + iZzd4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzn(5);
                                int iZzd5 = this.zzc.zzd(3);
                                int i18 = this.zzp;
                                int i19 = com.google.android.gms.internal.ads.zzabk.zza;
                                byte[] bArr = {(byte) (((i18 >> 1) & 7) | 16), (byte) (((iZzd5 << 3) & 120) | ((i18 << 7) & 128))};
                                com.google.android.gms.internal.ads.zzabi zzabiVarZza = com.google.android.gms.internal.ads.zzabk.zza(bArr);
                                com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                                zzzVar.zzM(this.zzg);
                                zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_AAC);
                                zzzVar.zzA(zzabiVarZza.zzc);
                                zzzVar.zzz(zzabiVarZza.zzb);
                                zzzVar.zzab(zzabiVarZza.zza);
                                zzzVar.zzN(java.util.Collections.singletonList(bArr));
                                zzzVar.zzQ(this.zze);
                                zzzVar.zzY(this.zzf);
                                com.google.android.gms.internal.ads.zzab zzabVarZzag = zzzVar.zzag();
                                this.zzs = 1024000000 / ((long) zzabVarZzag.zzE);
                                this.zzh.zzm(zzabVarZzag);
                                this.zzr = true;
                            }
                            this.zzc.zzn(4);
                            int iZzd6 = this.zzc.zzd(13) - 7;
                            if (this.zzm) {
                                iZzd6 -= 2;
                            }
                            zzj(this.zzh, this.zzs, 0, iZzd6);
                        }
                    }
                } else if (zzk(zzdyVar, this.zzd.zzN(), 10)) {
                    this.zzi.zzr(this.zzd, 10);
                    this.zzd.zzL(6);
                    zzj(this.zzi, 0L, 10, 10 + this.zzd.zzl());
                }
            } else if (zzdyVar.zzb() != 0) {
                com.google.android.gms.internal.ads.zzdx zzdxVar = this.zzc;
                zzdxVar.zza[0] = zzdyVar.zzN()[zzdyVar.zzd()];
                zzdxVar.zzl(2);
                int iZzd7 = this.zzc.zzd(4);
                int i20 = this.zzp;
                if (i20 == -1 || iZzd7 == i20) {
                    if (!this.zzn) {
                        this.zzn = true;
                        this.zzo = this.zzq;
                        this.zzp = iZzd7;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zzg = zzanxVar.zzb();
        com.google.android.gms.internal.ads.zzadt zzadtVarZzw = zzacqVar.zzw(zzanxVar.zza(), 1);
        this.zzh = zzadtVarZzw;
        this.zzv = zzadtVarZzw;
        if (!this.zzb) {
            this.zzi = new com.google.android.gms.internal.ads.zzaci();
            return;
        }
        zzanxVar.zzc();
        com.google.android.gms.internal.ads.zzadt zzadtVarZzw2 = zzacqVar.zzw(zzanxVar.zza(), 5);
        this.zzi = zzadtVarZzw2;
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzM(zzanxVar.zzb());
        zzzVar.zzaa(androidx.media3.common.MimeTypes.APPLICATION_ID3);
        zzadtVarZzw2.zzm(zzzVar.zzag());
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzu = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzu = androidx.media3.common.C.TIME_UNSET;
        zzg();
    }
}
