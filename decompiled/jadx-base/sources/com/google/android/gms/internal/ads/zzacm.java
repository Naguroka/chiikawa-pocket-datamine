package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzacm {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, com.json.mediationsdk.utils.IronSourceConstants.IS_AD_UNIT_CAPPED, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 96000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(byte[] bArr) {
        com.google.android.gms.internal.ads.zzdx zzdxVarZzg = zzg(bArr);
        zzdxVarZzg.zzn(42);
        return zzdxVarZzg.zzd(true != zzdxVarZzg.zzp() ? 8 : 12) + 1;
    }

    public static int zzb(byte[] bArr) {
        com.google.android.gms.internal.ads.zzdx zzdxVarZzg = zzg(bArr);
        zzdxVarZzg.zzn(32);
        return zzf(zzdxVarZzg, zzj, true) + 1;
    }

    public static com.google.android.gms.internal.ads.zzab zzc(byte[] bArr, java.lang.String str, java.lang.String str2, int i, com.google.android.gms.internal.ads.zzu zzuVar) {
        com.google.android.gms.internal.ads.zzdx zzdxVarZzg = zzg(bArr);
        zzdxVarZzg.zzn(60);
        int i2 = zzb[zzdxVarZzg.zzd(6)];
        int i3 = zzc[zzdxVarZzg.zzd(4)];
        int iZzd = zzdxVarZzg.zzd(5);
        int i4 = iZzd >= 29 ? -1 : (zzd[iZzd] * 1000) / 2;
        zzdxVarZzg.zzn(10);
        int i5 = i2 + (zzdxVarZzg.zzd(2) > 0 ? 1 : 0);
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzM(str);
        zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_DTS);
        zzzVar.zzy(i4);
        zzzVar.zzz(i5);
        zzzVar.zzab(i3);
        zzzVar.zzF(null);
        zzzVar.zzQ(str2);
        zzzVar.zzY(i);
        return zzzVar.zzag();
    }

    public static com.google.android.gms.internal.ads.zzack zzd(byte[] bArr) throws com.google.android.gms.internal.ads.zzbc {
        int iZzd;
        int i;
        int iZzd2;
        long jZzu;
        int i2;
        com.google.android.gms.internal.ads.zzdx zzdxVarZzg = zzg(bArr);
        zzdxVarZzg.zzn(40);
        int iZzd3 = zzdxVarZzg.zzd(2);
        boolean zZzp = zzdxVarZzg.zzp();
        int i3 = true != zZzp ? 16 : 20;
        zzdxVarZzg.zzn(true != zZzp ? 8 : 12);
        int iZzd4 = zzdxVarZzg.zzd(i3) + 1;
        boolean zZzp2 = zzdxVarZzg.zzp();
        int i4 = 0;
        if (zZzp2) {
            iZzd = zzdxVarZzg.zzd(2);
            int iZzd5 = zzdxVarZzg.zzd(3) + 1;
            if (zzdxVarZzg.zzp()) {
                zzdxVarZzg.zzn(36);
            }
            int iZzd6 = zzdxVarZzg.zzd(3) + 1;
            int iZzd7 = zzdxVarZzg.zzd(3) + 1;
            if (iZzd6 != 1 || iZzd7 != 1) {
                throw com.google.android.gms.internal.ads.zzbc.zzc("Multiple audio presentations or assets not supported");
            }
            int i5 = iZzd3 + 1;
            int iZzd8 = zzdxVarZzg.zzd(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                if (((iZzd8 >> i6) & 1) == 1) {
                    zzdxVarZzg.zzn(8);
                }
            }
            int i7 = iZzd5 * 512;
            if (zzdxVarZzg.zzp()) {
                zzdxVarZzg.zzn(2);
                int iZzd9 = (zzdxVarZzg.zzd(2) + 1) << 2;
                int iZzd10 = zzdxVarZzg.zzd(2) + 1;
                while (i4 < iZzd10) {
                    zzdxVarZzg.zzn(iZzd9);
                    i4++;
                }
            }
            i4 = i7;
        } else {
            iZzd = -1;
        }
        zzdxVarZzg.zzn(i3);
        zzdxVarZzg.zzn(12);
        if (zZzp2) {
            if (zzdxVarZzg.zzp()) {
                zzdxVarZzg.zzn(4);
            }
            if (zzdxVarZzg.zzp()) {
                zzdxVarZzg.zzn(24);
            }
            if (zzdxVarZzg.zzp()) {
                zzdxVarZzg.zzo(zzdxVarZzg.zzd(10) + 1);
            }
            zzdxVarZzg.zzn(5);
            int i8 = zze[zzdxVarZzg.zzd(4)];
            iZzd2 = zzdxVarZzg.zzd(8) + 1;
            i = i8;
        } else {
            i = -2147483647;
            iZzd2 = -1;
        }
        if (zZzp2) {
            if (iZzd == 0) {
                i2 = 32000;
            } else if (iZzd == 1) {
                i2 = 44100;
            } else {
                if (iZzd != 2) {
                    throw com.google.android.gms.internal.ads.zzbc.zza("Unsupported reference clock code in DTS HD header: " + iZzd, null);
                }
                i2 = androidx.media3.extractor.OpusUtil.SAMPLE_RATE;
            }
            jZzu = com.google.android.gms.internal.ads.zzei.zzu(i4, 1000000L, i2, java.math.RoundingMode.DOWN);
        } else {
            jZzu = androidx.media3.common.C.TIME_UNSET;
        }
        return new com.google.android.gms.internal.ads.zzack(androidx.media3.common.MimeTypes.AUDIO_DTS_EXPRESS, iZzd2, i, iZzd4, jZzu, 0, null);
    }

    public static com.google.android.gms.internal.ads.zzack zze(byte[] bArr, java.util.concurrent.atomic.AtomicInteger atomicInteger) throws com.google.android.gms.internal.ads.zzbc {
        long jZzu;
        int iZzd;
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzdx zzdxVarZzg = zzg(bArr);
        int iZzd2 = zzdxVarZzg.zzd(32);
        int iZzf = zzf(zzdxVarZzg, zzf, true) + 1;
        char c = iZzd2 == 1078008818 ? (char) 1 : (char) 0;
        if (c == 0) {
            jZzu = androidx.media3.common.C.TIME_UNSET;
            iZzd = androidx.media3.common.C.RATE_UNSET_INT;
        } else {
            if (!zzdxVarZzg.zzp()) {
                throw com.google.android.gms.internal.ads.zzbc.zzc("Only supports full channel mask-based audio presentation");
            }
            int i3 = iZzf - 2;
            if ((((char) (bArr[i3] << 8)) | (bArr[iZzf - 1] & 255)) != com.google.android.gms.internal.ads.zzei.zze(bArr, 0, i3, 65535)) {
                throw com.google.android.gms.internal.ads.zzbc.zza("CRC check failed", null);
            }
            int iZzd3 = zzdxVarZzg.zzd(2);
            if (iZzd3 == 0) {
                i = 512;
            } else if (iZzd3 == 1) {
                i = 480;
            } else {
                if (iZzd3 != 2) {
                    throw com.google.android.gms.internal.ads.zzbc.zza("Unsupported base duration index in DTS UHD header: " + iZzd3, null);
                }
                i = androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK;
            }
            int iZzd4 = zzdxVarZzg.zzd(3) + 1;
            int iZzd5 = zzdxVarZzg.zzd(2);
            if (iZzd5 == 0) {
                i2 = 32000;
            } else if (iZzd5 == 1) {
                i2 = 44100;
            } else {
                if (iZzd5 != 2) {
                    throw com.google.android.gms.internal.ads.zzbc.zza("Unsupported clock rate index in DTS UHD header: " + iZzd5, null);
                }
                i2 = androidx.media3.extractor.OpusUtil.SAMPLE_RATE;
            }
            if (zzdxVarZzg.zzp()) {
                zzdxVarZzg.zzn(36);
            }
            iZzd = (1 << zzdxVarZzg.zzd(2)) * i2;
            jZzu = com.google.android.gms.internal.ads.zzei.zzu(i * iZzd4, 1000000L, i2, java.math.RoundingMode.DOWN);
        }
        int i4 = iZzd;
        long j = jZzu;
        int iZzf2 = 0;
        for (char c2 = 0; c2 < c; c2 = 1) {
            iZzf2 += zzf(zzdxVarZzg, zzg, true);
        }
        for (int i5 = 0; i5 <= 0; i5++) {
            if (c != 0) {
                atomicInteger.set(zzf(zzdxVarZzg, zzh, true));
            }
            iZzf2 += atomicInteger.get() != 0 ? zzf(zzdxVarZzg, zzi, true) : 0;
        }
        return new com.google.android.gms.internal.ads.zzack(androidx.media3.common.MimeTypes.AUDIO_DTS_X, 2, i4, iZzf + iZzf2, j, 0, null);
    }

    private static int zzf(com.google.android.gms.internal.ads.zzdx zzdxVar, int[] iArr, boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && zzdxVar.zzp(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return i3 + zzdxVar.zzd(iArr[i]);
    }

    private static com.google.android.gms.internal.ads.zzdx zzg(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new com.google.android.gms.internal.ads.zzdx(bArr, bArr.length);
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        int length = bArrCopyOf.length;
        com.google.android.gms.internal.ads.zzdx zzdxVar = new com.google.android.gms.internal.ads.zzdx(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            com.google.android.gms.internal.ads.zzdx zzdxVar2 = new com.google.android.gms.internal.ads.zzdx(bArrCopyOf, length);
            while (zzdxVar2.zza() >= 16) {
                zzdxVar2.zzn(2);
                zzdxVar.zzg(zzdxVar2.zzd(14), 14);
            }
        }
        zzdxVar.zzk(bArrCopyOf, bArrCopyOf.length);
        return zzdxVar;
    }
}
