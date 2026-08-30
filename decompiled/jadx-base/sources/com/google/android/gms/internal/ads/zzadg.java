package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzadg {
    private static final java.lang.String[] zza = {androidx.media3.common.MimeTypes.AUDIO_MPEG_L1, androidx.media3.common.MimeTypes.AUDIO_MPEG_L2, androidx.media3.common.MimeTypes.AUDIO_MPEG};
    private static final int[] zzb = {44100, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] zze = {32000, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    private static final int[] zzf = {32000, androidx.media3.extractor.MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] zzg = {8000, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, androidx.media3.extractor.MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    public static int zzc(int i) {
        int i2;
        int i3;
        if (!zzm(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = i >>> 12;
        int i5 = (i >>> 10) & 3;
        int i6 = i4 & 15;
        if (i6 == 0 || i6 == 15 || i5 == 3) {
            return -1;
        }
        return zzl(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 != 2) {
            return androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK;
        }
        return 1152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int zzb(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!zzm(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = i4 - 1;
        int i8 = zzb[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? zzc[i7] : zzd[i7]) * 12) / i8) + i9) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? zze[i7] : zzf[i7];
        } else {
            i6 = zzg[i7];
        }
        int i10 = org.objectweb.asm.Opcodes.D2F;
        if (i2 == 3) {
            return ((i6 * org.objectweb.asm.Opcodes.D2F) / i8) + i9;
        }
        if (i3 == 1) {
            i10 = 72;
        }
        return ((i10 * i6) / i8) + i9;
    }
}
