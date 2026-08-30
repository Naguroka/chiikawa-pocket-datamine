package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0599Bn extends com.facebook.ads.redexgen.core.AbstractC1012Sj {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"cVYzzU3WDwilAiB6lBwH", "ltb11yKnDLf", "qD1l7ddw57WScFbFlpW6gLQQ4LJZYMm4", "7tmDLtuP1dSUokfmYRKMMhnjp75BOUEQ", "O1T", "OUAaXGhWo5xW6BfvCbr", "NPW6PnCzVK8iTd9b27h5", "ykk8Miz3Z2gvnB5Rb4Sxgn912BIo"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.V7 A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            if (A02[2].charAt(8) != '5') {
                throw new java.lang.RuntimeException();
            }
            A02[5] = "7KI0j9KfVtSFY3dF";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 70);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, 28, 17, 16, 26, 60, 27, 1, 16, 7, 6, 1, 28, 1, 20, 25, 48, 3, 16, 27, 1};
    }

    static {
        A01();
    }

    public C0599Bn(com.facebook.ads.redexgen.core.V7 v7) {
        this.A00 = v7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
        this.A00.A06.A4Q(A00(0, 21, 51), c9r);
    }
}
