package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1319br extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"oXE2C4io4CadFj", "SLi30xh9eEh4aNBWy87TaVqEnPCRDurp", "eis5RYtigxDn0kuTv6xEcFlmBnmepzOu", "7zfUioi34Z20h4XlF6Svx2fywMYufGtL", "3ch3CCIwylkue97fKtVgZja7Sq2vQTLD", "WcYwUSLGNymzaUHoHnyTUfb", "YL0d97V0Q3k08jxWq5XvLfGqClGTo7H3", "GhmWEJEURttFfnvoo6VO1smQO3ReaFoJ"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1358cU A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C03631u A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0684Fh A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C8U A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 28);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-97, -93, -59, -24, -27, -12, -8, -23, -10, -92, -8, -19, -15, -23, -13, -7, -8, -78, -74, -61, -61, -64, -61, -73, -67, -79, -4, -15, -11, -19, -9, -3, -4};
        java.lang.String[] strArr = A06;
        if (strArr[6].charAt(10) != strArr[4].charAt(10)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[6] = "j4Ns4hKT00kRsJcq4mYGiSVRR39xkXLE";
        strArr2[4] = "aj4N2GTd0jkYX56rliTu9cnftT6aRfqb";
    }

    static {
        A02();
    }

    public C1319br(com.facebook.ads.redexgen.core.C0684Fh c0684Fh, com.facebook.ads.redexgen.core.C03631u c03631u, com.facebook.ads.redexgen.core.C1358cU c1358cU, long j, com.facebook.ads.redexgen.core.C8U c8u) {
        this.A03 = c0684Fh;
        this.A02 = c03631u;
        this.A01 = c1358cU;
        this.A00 = j;
        this.A04 = c8u;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        this.A03.A0S(this.A02);
        this.A03.A0P(this.A01);
        java.util.Map mapA01 = this.A03.A01(this.A00);
        mapA01.put(A00(18, 5, 53), A00(0, 2, 86));
        mapA01.put(A00(23, 3, 46), A00(26, 7, 108));
        this.A03.A05(this.A04.A03(com.facebook.ads.redexgen.core.C8Y.A04), mapA01);
        this.A03.ABs(new com.facebook.ads.redexgen.core.C0779Jg(com.facebook.ads.internal.protocol.AdErrorType.NETWORK_ERROR, A00(2, 16, 104)));
    }
}
