package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f1336a = {androidx.media3.common.MimeTypes.AUDIO_MPEG_L1, androidx.media3.common.MimeTypes.AUDIO_MPEG_L2, androidx.media3.common.MimeTypes.AUDIO_MPEG};
    private static final int[] b = {44100, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] c = {32000, 64000, 96000, 128000, 160000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] d = {32000, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000, 176000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] e = {32000, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    private static final int[] f = {32000, androidx.media3.extractor.MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 160000, androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] g = {8000, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 24000, 32000, androidx.media3.extractor.MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, 56000, 64000, androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1337a;
        public java.lang.String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public boolean a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            if (!com.applovin.impl.sf.c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f1337a = i2;
            this.b = com.applovin.impl.sf.f1336a[3 - i3];
            int i7 = com.applovin.impl.sf.b[i5];
            this.d = i7;
            if (i2 == 2) {
                this.d = i7 / 2;
            } else if (i2 == 0) {
                this.d = i7 / 4;
            }
            int i8 = (i >>> 9) & 1;
            this.g = com.applovin.impl.sf.b(i2, i3);
            if (i3 == 3) {
                if (i2 == 3) {
                    i6 = com.applovin.impl.sf.c[i4 - 1];
                } else {
                    i6 = com.applovin.impl.sf.d[i4 - 1];
                }
                this.f = i6;
                this.c = (((i6 * 12) / this.d) + i8) * 4;
            } else {
                int i9 = org.objectweb.asm.Opcodes.D2F;
                if (i2 == 3) {
                    int i10 = i3 == 2 ? com.applovin.impl.sf.e[i4 - 1] : com.applovin.impl.sf.f[i4 - 1];
                    this.f = i10;
                    this.c = ((i10 * org.objectweb.asm.Opcodes.D2F) / this.d) + i8;
                } else {
                    int i11 = com.applovin.impl.sf.g[i4 - 1];
                    this.f = i11;
                    if (i3 == 1) {
                        i9 = 72;
                    }
                    this.c = ((i9 * i11) / this.d) + i8;
                }
            }
            this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? c[i4 - 1] : d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? e[i4 - 1] : f[i4 - 1];
        } else {
            i6 = g[i4 - 1];
        }
        int i9 = org.objectweb.asm.Opcodes.D2F;
        if (i2 == 3) {
            return ((i6 * org.objectweb.asm.Opcodes.D2F) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i6) / i7) + i8;
    }

    public static int d(int i) {
        int i2;
        int i3;
        if (!c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return b(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK;
        }
        throw new java.lang.IllegalArgumentException();
    }
}
