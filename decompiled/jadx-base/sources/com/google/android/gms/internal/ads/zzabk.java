package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzabk {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static com.google.android.gms.internal.ads.zzabi zza(byte[] bArr) throws com.google.android.gms.internal.ads.zzbc {
        return zzb(new com.google.android.gms.internal.ads.zzdx(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
    
        if (r11 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzabi zzb(com.google.android.gms.internal.ads.zzdx zzdxVar, boolean z) throws com.google.android.gms.internal.ads.zzbc {
        int iZzc = zzc(zzdxVar);
        int iZzd = zzd(zzdxVar);
        int iZzd2 = zzdxVar.zzd(4);
        java.lang.String str = "mp4a.40." + iZzc;
        int i = 22;
        if (iZzc == 5 || iZzc == 29) {
            iZzd = zzd(zzdxVar);
            iZzc = zzc(zzdxVar);
            if (iZzc == 22) {
                iZzd2 = zzdxVar.zzd(4);
            }
        }
        if (z) {
            int i2 = 3;
            if (iZzc != 1 && iZzc != 2 && iZzc != 3 && iZzc != 4 && iZzc != 6 && iZzc != 7 && iZzc != 17) {
                switch (iZzc) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw com.google.android.gms.internal.ads.zzbc.zzc("Unsupported audio object type: " + iZzc);
                }
            }
            if (zzdxVar.zzp()) {
                com.google.android.gms.internal.ads.zzdo.zzf("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzdxVar.zzp()) {
                zzdxVar.zzn(14);
            }
            boolean zZzp = zzdxVar.zzp();
            if (iZzd2 == 0) {
                throw new java.lang.UnsupportedOperationException();
            }
            if (iZzc == 6) {
                zzdxVar.zzn(3);
            } else if (iZzc == 20) {
                iZzc = 20;
                zzdxVar.zzn(3);
            }
            if (zZzp) {
                if (iZzc == 22) {
                    zzdxVar.zzn(16);
                } else {
                    i = iZzc;
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    zzdxVar.zzn(3);
                }
                zzdxVar.zzn(1);
            }
            switch (iZzc) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iZzd3 = zzdxVar.zzd(2);
                    if (iZzd3 == 2) {
                        i2 = iZzd3;
                    }
                    throw com.google.android.gms.internal.ads.zzbc.zzc("Unsupported epConfig: " + i2);
            }
        }
        int i3 = zzc[iZzd2];
        if (i3 != -1) {
            return new com.google.android.gms.internal.ads.zzabi(iZzd, i3, str, null);
        }
        throw com.google.android.gms.internal.ads.zzbc.zza(null, null);
    }

    private static int zzc(com.google.android.gms.internal.ads.zzdx zzdxVar) {
        int iZzd = zzdxVar.zzd(5);
        return iZzd == 31 ? zzdxVar.zzd(6) + 32 : iZzd;
    }

    private static int zzd(com.google.android.gms.internal.ads.zzdx zzdxVar) throws com.google.android.gms.internal.ads.zzbc {
        int iZzd = zzdxVar.zzd(4);
        if (iZzd == 15) {
            if (zzdxVar.zza() >= 24) {
                return zzdxVar.zzd(24);
            }
            throw com.google.android.gms.internal.ads.zzbc.zza("AAC header insufficient data", null);
        }
        if (iZzd < 13) {
            return zzb[iZzd];
        }
        throw com.google.android.gms.internal.ads.zzbc.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
