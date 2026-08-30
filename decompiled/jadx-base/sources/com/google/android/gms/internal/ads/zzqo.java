package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzqo implements com.google.android.gms.internal.ads.zzpy {
    protected zzqo(com.google.android.gms.internal.ads.zzqn zzqnVar) {
    }

    protected static int zza(int i, int i2, int i3) {
        return com.google.android.gms.internal.ads.zzgaq.zzb(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    protected static int zzb(int i) {
        if (i == 20) {
            return androidx.media3.extractor.OpusUtil.MAX_BYTES_PER_SECOND;
        }
        if (i == 30) {
            return androidx.media3.extractor.DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
        }
        switch (i) {
            case 5:
                return androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
                return 768000;
            case 7:
                return androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return androidx.media3.extractor.DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return androidx.media3.extractor.MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 10:
                return androidx.media3.extractor.AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
            case 11:
                return androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return androidx.media3.extractor.Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
                    case 15:
                        return 8000;
                    case 16:
                        return androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
                    case 17:
                        return androidx.media3.extractor.Ac4Util.MAX_RATE_BYTES_PER_SECOND;
                    case 18:
                        return 768000;
                    default:
                        throw new java.lang.IllegalArgumentException();
                }
        }
    }
}
