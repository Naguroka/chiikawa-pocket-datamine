package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1143Xo implements com.facebook.ads.redexgen.core.DV {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 47);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{73, 86, 91, 90, 80, 16, 94, 73, 92};
    }

    public C1143Xo() {
    }

    @Override // com.facebook.ads.redexgen.core.DV
    public final int A6s() {
        return android.media.MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.core.DV
    public final android.media.MediaCodecInfo A6t(int i) {
        return android.media.MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.DV
    public final boolean A9g(java.lang.String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 16).equals(str);
    }

    @Override // com.facebook.ads.redexgen.core.DV
    public final boolean AG5() {
        return false;
    }
}
