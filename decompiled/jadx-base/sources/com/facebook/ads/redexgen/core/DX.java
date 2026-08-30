package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class DX {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-33, -21, -24, -21, -18, -87, -18, -35, -22, -29, -31, -8, 4, 1, 4, 7, -62, 8, 9, -10, 3, -7, -10, 7, -7, -15, -3, -6, -3, 0, -69, 2, 0, -17, -4, 1, -12, -13, 0, 35, 51, 36, -19, -9, -13, 1, -68, 2, 3, -16, 3, -8, -14, -68, -8, -3, -11, -2};
    }

    public static void A02(android.media.MediaFormat mediaFormat, com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo colorInfo) {
        if (colorInfo != null) {
            A04(mediaFormat, A00(25, 14, 61), colorInfo.A03);
            A04(mediaFormat, A00(11, 14, 68), colorInfo.A02);
            A04(mediaFormat, A00(0, 11, 43), colorInfo.A01);
            A05(mediaFormat, A00(43, 15, 62), colorInfo.A04);
        }
    }

    public static void A03(android.media.MediaFormat mediaFormat, java.lang.String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void A04(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void A05(android.media.MediaFormat mediaFormat, java.lang.String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, java.nio.ByteBuffer.wrap(bArr));
        }
    }

    public static void A06(android.media.MediaFormat mediaFormat, java.util.List<byte[]> list) {
        for (int i = 0; i < i; i++) {
            mediaFormat.setByteBuffer(A00(39, 4, 111) + i, java.nio.ByteBuffer.wrap(list.get(i)));
        }
    }
}
