package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzana {
    public static com.google.android.gms.internal.ads.zzamy zza(com.google.android.gms.internal.ads.zzdx zzdxVar) throws com.google.android.gms.internal.ads.zzbc {
        int iZzd;
        int i;
        char c;
        int i2;
        int iZzd2;
        char c2;
        int iZzd3 = zzdxVar.zzd(8);
        int i3 = 5;
        int iZzd4 = zzdxVar.zzd(5);
        if (iZzd4 != 31) {
            switch (iZzd4) {
                case 0:
                    iZzd = 96000;
                    break;
                case 1:
                    iZzd = 88200;
                    break;
                case 2:
                    iZzd = 64000;
                    break;
                case 3:
                    iZzd = androidx.media3.extractor.OpusUtil.SAMPLE_RATE;
                    break;
                case 4:
                    iZzd = 44100;
                    break;
                case 5:
                    iZzd = 32000;
                    break;
                case 6:
                    iZzd = 24000;
                    break;
                case 7:
                    iZzd = 22050;
                    break;
                case 8:
                    iZzd = androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
                    break;
                case 9:
                    iZzd = 12000;
                    break;
                case 10:
                    iZzd = 11025;
                    break;
                case 11:
                    iZzd = 8000;
                    break;
                case 12:
                    iZzd = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw com.google.android.gms.internal.ads.zzbc.zzc("Unsupported sampling rate index " + iZzd4);
                case 15:
                    iZzd = 57600;
                    break;
                case 16:
                    iZzd = 51200;
                    break;
                case 17:
                    iZzd = androidx.media3.extractor.MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
                    break;
                case 18:
                    iZzd = 38400;
                    break;
                case 19:
                    iZzd = 34150;
                    break;
                case 20:
                    iZzd = 28800;
                    break;
                case 21:
                    iZzd = 25600;
                    break;
                case 22:
                    iZzd = 20000;
                    break;
                case 23:
                    iZzd = 19200;
                    break;
                case 24:
                    iZzd = 17075;
                    break;
                case 25:
                    iZzd = 14400;
                    break;
                case 26:
                    iZzd = 12800;
                    break;
                case 27:
                    iZzd = 9600;
                    break;
            }
        } else {
            iZzd = zzdxVar.zzd(24);
        }
        int iZzd5 = zzdxVar.zzd(3);
        int i4 = 1;
        if (iZzd5 == 0) {
            i = 768;
        } else if (iZzd5 == 1) {
            i = 1024;
        } else if (iZzd5 == 2 || iZzd5 == 3) {
            i = 2048;
        } else {
            if (iZzd5 != 4) {
                throw com.google.android.gms.internal.ads.zzbc.zzc("Unsupported coreSbrFrameLengthIndex " + iZzd5);
            }
            i = 4096;
        }
        if (iZzd5 == 0 || iZzd5 == 1) {
            c = 0;
        } else if (iZzd5 == 2) {
            c = 2;
        } else if (iZzd5 == 3) {
            c = 3;
        } else {
            if (iZzd5 != 4) {
                throw com.google.android.gms.internal.ads.zzbc.zzc("Unsupported coreSbrFrameLengthIndex " + iZzd5);
            }
            c = 1;
        }
        zzdxVar.zzn(2);
        zze(zzdxVar);
        int iZzd6 = zzdxVar.zzd(5);
        int i5 = 0;
        int iZzc = 0;
        while (true) {
            int i6 = 16;
            if (i5 < iZzd6 + 1) {
                int iZzd7 = zzdxVar.zzd(3);
                iZzc += zzc(zzdxVar, 5, 8, 16) + 1;
                if ((iZzd7 == 0 || iZzd7 == 2) && zzdxVar.zzp()) {
                    zze(zzdxVar);
                }
                i5++;
            } else {
                int iZzc2 = zzc(zzdxVar, 4, 8, 16) + 1;
                zzdxVar.zzm();
                int i7 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i7 >= iZzc2) {
                        int i8 = iZzd3;
                        byte[] bArr = null;
                        if (zzdxVar.zzp()) {
                            int iZzc3 = zzc(zzdxVar, 2, 4, 8) + 1;
                            for (int i9 = 0; i9 < iZzc3; i9++) {
                                int iZzc4 = zzc(zzdxVar, 4, 8, 16);
                                int iZzc5 = zzc(zzdxVar, 4, 8, 16);
                                if (iZzc4 == 7) {
                                    int iZzd8 = zzdxVar.zzd(4) + 1;
                                    zzdxVar.zzn(4);
                                    byte[] bArr2 = new byte[iZzd8];
                                    for (int i10 = 0; i10 < iZzd8; i10++) {
                                        bArr2[i10] = (byte) zzdxVar.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzdxVar.zzn(iZzc5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzd) {
                            case 14700:
                            case androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case androidx.media3.extractor.OpusUtil.SAMPLE_RATE /* 48000 */:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                throw com.google.android.gms.internal.ads.zzbc.zzc("Unsupported sampling rate " + iZzd);
                        }
                        return new com.google.android.gms.internal.ads.zzamy(i8, (int) (((double) iZzd) * d), (int) (((double) i) * d), bArr3, null);
                    }
                    int iZzd9 = zzdxVar.zzd(2);
                    if (iZzd9 == 0) {
                        i2 = iZzd3;
                        zzf(zzdxVar);
                        if (c > 0) {
                            zzd(zzdxVar);
                        }
                    } else if (iZzd9 != i4) {
                        if (iZzd9 == 3) {
                            zzc(zzdxVar, 4, 8, i6);
                            int iZzc6 = zzc(zzdxVar, 4, 8, i6);
                            if (zzdxVar.zzp()) {
                                zzc(zzdxVar, 8, i6, 0);
                            }
                            zzdxVar.zzm();
                            if (iZzc6 > 0) {
                                zzdxVar.zzn(iZzc6 * 8);
                            }
                        }
                        i2 = iZzd3;
                    } else {
                        if (zzf(zzdxVar)) {
                            zzdxVar.zzm();
                        }
                        if (c > 0) {
                            zzd(zzdxVar);
                            iZzd2 = zzdxVar.zzd(2);
                            c2 = c;
                        } else {
                            iZzd2 = 0;
                            c2 = 0;
                        }
                        if (iZzd2 > 0) {
                            zzdxVar.zzn(6);
                            int iZzd10 = zzdxVar.zzd(2);
                            zzdxVar.zzn(4);
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(i3);
                            }
                            if (iZzd2 == 2 || iZzd2 == 3) {
                                zzdxVar.zzn(6);
                            }
                            if (iZzd10 == 2) {
                                zzdxVar.zzm();
                            }
                        }
                        i2 = iZzd3;
                        int iFloor = ((int) java.lang.Math.floor(java.lang.Math.log(iZzc - 1) / java.lang.Math.log(2.0d))) + 1;
                        int iZzd11 = zzdxVar.zzd(2);
                        if (iZzd11 > 0 && zzdxVar.zzp()) {
                            zzdxVar.zzn(iFloor);
                        }
                        if (zzdxVar.zzp()) {
                            zzdxVar.zzn(iFloor);
                        }
                        if (c2 == 0 && iZzd11 == 0) {
                            zzdxVar.zzm();
                        }
                    }
                    i7++;
                    iZzd3 = i2;
                    i3 = 5;
                    i4 = 1;
                    i6 = 16;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042  */
    public static boolean zzb(com.google.android.gms.internal.ads.zzdx zzdxVar, com.google.android.gms.internal.ads.zzamx zzamxVar) throws com.google.android.gms.internal.ads.zzbc {
        long jZze;
        zzdxVar.zzb();
        int iZzc = zzc(zzdxVar, 3, 8, 8);
        zzamxVar.zza = iZzc;
        if (iZzc == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.zzcw.zzd(java.lang.Math.max(java.lang.Math.max(2, 8), 32) <= 63);
        com.google.android.gms.internal.ads.zzgal.zza(com.google.android.gms.internal.ads.zzgal.zza(3L, 255L), 4294967296L);
        if (zzdxVar.zza() < 2) {
            jZze = -1;
        } else {
            jZze = zzdxVar.zze(2);
            if (jZze == 3) {
                if (zzdxVar.zza() < 8) {
                    jZze = -1;
                } else {
                    long jZze2 = zzdxVar.zze(8);
                    long j = 3 + jZze2;
                    if (jZze2 != 255) {
                        jZze = j;
                    } else if (zzdxVar.zza() < 32) {
                        jZze = -1;
                    } else {
                        jZze = zzdxVar.zze(32) + j;
                    }
                }
            }
        }
        zzamxVar.zzb = jZze;
        if (jZze == -1) {
            return false;
        }
        if (jZze > 16) {
            throw com.google.android.gms.internal.ads.zzbc.zzc("Contains sub-stream with an invalid packet label " + jZze);
        }
        if (jZze == 0) {
            int i = zzamxVar.zza;
            if (i == 1) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i == 2) {
                throw com.google.android.gms.internal.ads.zzbc.zza("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i == 17) {
                throw com.google.android.gms.internal.ads.zzbc.zza("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iZzc2 = zzc(zzdxVar, 11, 24, 24);
        zzamxVar.zzc = iZzc2;
        return iZzc2 != -1;
    }

    private static int zzc(com.google.android.gms.internal.ads.zzdx zzdxVar, int i, int i2, int i3) {
        com.google.android.gms.internal.ads.zzcw.zzd(java.lang.Math.max(java.lang.Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        com.google.android.gms.internal.ads.zzgaj.zza(com.google.android.gms.internal.ads.zzgaj.zza(i4, i5), 1 << i3);
        if (zzdxVar.zza() < i) {
            return -1;
        }
        int iZzd = zzdxVar.zzd(i);
        if (iZzd != i4) {
            return iZzd;
        }
        if (zzdxVar.zza() < i2) {
            return -1;
        }
        int iZzd2 = zzdxVar.zzd(i2);
        int i6 = iZzd + iZzd2;
        if (iZzd2 != i5) {
            return i6;
        }
        if (zzdxVar.zza() < i3) {
            return -1;
        }
        return i6 + zzdxVar.zzd(i3);
    }

    private static void zzd(com.google.android.gms.internal.ads.zzdx zzdxVar) {
        zzdxVar.zzn(3);
        zzdxVar.zzn(8);
        boolean zZzp = zzdxVar.zzp();
        boolean zZzp2 = zzdxVar.zzp();
        if (zZzp) {
            zzdxVar.zzn(5);
        }
        if (zZzp2) {
            zzdxVar.zzn(6);
        }
    }

    private static void zze(com.google.android.gms.internal.ads.zzdx zzdxVar) {
        int iZzd;
        int iZzd2 = zzdxVar.zzd(2);
        if (iZzd2 == 0) {
            zzdxVar.zzn(6);
            return;
        }
        int iZzc = zzc(zzdxVar, 5, 8, 16) + 1;
        if (iZzd2 == 1) {
            zzdxVar.zzn(iZzc * 7);
            return;
        }
        if (iZzd2 == 2) {
            boolean zZzp = zzdxVar.zzp();
            int i = true != zZzp ? 5 : 1;
            int i2 = true == zZzp ? 7 : 5;
            int i3 = true == zZzp ? 8 : 6;
            int i4 = 0;
            while (i4 < iZzc) {
                if (zzdxVar.zzp()) {
                    zzdxVar.zzn(7);
                    iZzd = 0;
                } else {
                    if (zzdxVar.zzd(2) == 3 && zzdxVar.zzd(i2) * i != 0) {
                        zzdxVar.zzm();
                    }
                    iZzd = zzdxVar.zzd(i3) * i;
                    if (iZzd != 0 && iZzd != 180) {
                        zzdxVar.zzm();
                    }
                    zzdxVar.zzm();
                }
                if (iZzd != 0 && iZzd != 180 && zzdxVar.zzp()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    private static boolean zzf(com.google.android.gms.internal.ads.zzdx zzdxVar) {
        zzdxVar.zzn(3);
        boolean zZzp = zzdxVar.zzp();
        if (zZzp) {
            zzdxVar.zzn(13);
        }
        return zZzp;
    }
}
