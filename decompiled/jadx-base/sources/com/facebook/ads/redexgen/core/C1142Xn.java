package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1142Xn implements com.facebook.ads.redexgen.core.DV {
    public static byte[] A02;
    public android.media.MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 13);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{33, 55, 49, 39, 32, 55, 127, 34, 62, 51, 43, 48, 51, 49, 57};
    }

    public C1142Xn(boolean z) {
        this.A01 = z ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new android.media.MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.core.DV
    public final int A6s() {
        A01();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.DV
    public final android.media.MediaCodecInfo A6t(int i) {
        A01();
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.core.DV
    public final boolean A9g(java.lang.String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 95));
    }

    @Override // com.facebook.ads.redexgen.core.DV
    public final boolean AG5() {
        return true;
    }
}
