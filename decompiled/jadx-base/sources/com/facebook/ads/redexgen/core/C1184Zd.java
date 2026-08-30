package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1184Zd extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ com.facebook.ads.AudienceNetworkAds.InitResult A01;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 77);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{81, 3, 92, 81, 80, 80, 1, 84, 16, 7, 8, 99, 42, 45, 42, 55, 42, 34, 47, 42, 57, 34, 55, 42, 44, 45, 99, 32, 44, 46, 51, 47, 38, 55, 38, 17, 22, 13, 48, 2, 5, 6};
    }

    public C1184Zd(com.facebook.ads.AudienceNetworkAds.InitListener initListener, com.facebook.ads.AudienceNetworkAds.InitResult initResult) {
        this.A00 = initListener;
        this.A01 = initResult;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(35, 7, 46), A00(8, 27, 14), A00(0, 8, 40));
        this.A00.onInitialized(this.A01);
    }
}
