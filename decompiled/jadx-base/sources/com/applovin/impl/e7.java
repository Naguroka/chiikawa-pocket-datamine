package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f747a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = {-1, 8000, androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] c = {64, 112, 128, 192, 224, 256, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, com.json.mediationsdk.utils.IronSourceConstants.IS_AD_UNIT_CAPPED, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static boolean a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static int d(byte[] bArr) {
        int i;
        byte b2;
        int i2;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            i2 = b3 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i2 = b2 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int a(byte[] bArr) {
        int i;
        byte b2;
        int i2;
        int i3;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i3 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i3 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b3 = bArr[8];
            }
            i2 = (((b3 & 60) >> 2) | i3) + 1;
            z = true;
            if (z) {
                return (i2 * 16) / 14;
            }
            return i2;
        }
        i = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i2 = (((b2 & 240) >> 4) | i) + 1;
        if (z) {
            return (i2 * 16) / 14;
        }
        return i2;
    }

    private static com.applovin.impl.zg b(byte[] bArr) {
        if (bArr[0] == 127) {
            return new com.applovin.impl.zg(bArr);
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        if (c(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b2 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b2;
            }
        }
        com.applovin.impl.zg zgVar = new com.applovin.impl.zg(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            com.applovin.impl.zg zgVar2 = new com.applovin.impl.zg(bArrCopyOf);
            while (zgVar2.b() >= 16) {
                zgVar2.d(2);
                zgVar.a(zgVar2.a(14), 14);
            }
        }
        zgVar.a(bArrCopyOf);
        return zgVar;
    }

    private static boolean c(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == -2 || b2 == -1;
    }

    public static int a(java.nio.ByteBuffer byteBuffer) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int iPosition = byteBuffer.position();
        byte b4 = byteBuffer.get(iPosition);
        if (b4 != -2) {
            if (b4 == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b3 = byteBuffer.get(iPosition + 7);
            } else if (b4 != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b2 = byteBuffer.get(iPosition + 5);
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b3 = byteBuffer.get(iPosition + 6);
            }
            i2 = b3 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b2 = byteBuffer.get(iPosition + 4);
        i2 = b2 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    public static com.applovin.impl.e9 a(byte[] bArr, java.lang.String str, java.lang.String str2, com.applovin.impl.x6 x6Var) {
        com.applovin.impl.zg zgVarB = b(bArr);
        zgVarB.d(60);
        int i = f747a[zgVarB.a(6)];
        int i2 = b[zgVarB.a(4)];
        int iA = zgVarB.a(5);
        int[] iArr = c;
        int i3 = iA >= iArr.length ? -1 : (iArr[iA] * 1000) / 2;
        zgVarB.d(10);
        return new com.applovin.impl.e9.b().c(str).f(androidx.media3.common.MimeTypes.AUDIO_DTS).b(i3).c(i + (zgVarB.a(2) > 0 ? 1 : 0)).n(i2).a(x6Var).e(str2).a();
    }
}
