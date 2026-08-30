package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1186Zf extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"w4GsGaTCcJA9wFWp2KNopTJOjqP8UDpw", "KJoDcXHO6XERgkU18ZjJw4XTw2kjUjU4", "R80wDz5faPpVYHVxJychiW2DfFSiKcfh", "t0Fzi1DjxmxSLCfz9XJ2VaEQot34azEH", "xhDPy00jOuqmtbPp3auQzix75rw9IX8h", "Uu427jBhvNl8yC5HrJluoVTOz", "6hGUj4iS9agb9", "ga1SCcoGdvIpCjYHRj6uJxXsB"};
    public final /* synthetic */ com.facebook.ads.AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1198Zr A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A03[1].charAt(16) != '8') {
                throw new java.lang.RuntimeException();
            }
            A03[1] = "4HO8Ss9k2AmZ8k9M8zrjCYxt48xbOoMK";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 70);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{3, 52, 59, 112, 35, 37, 51, 51, 53, 35, 35, 54, 37, 60, 60, 41, 112, 57, 62, 57, 36, 57, 49, 60, 57, 42, 53, 52, 113};
    }

    static {
        A02();
    }

    public C1186Zf(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.AudienceNetworkAds.InitListener initListener) {
        this.A01 = c1198Zr;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        try {
            com.facebook.ads.redexgen.core.ZQ.A02().A0C(this.A01);
        } catch (java.lang.Throwable th) {
            this.A01.A07().A3y(th);
        }
        com.facebook.ads.redexgen.core.C05138c.A0C(this.A01);
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.C05138c.A04(this.A00, new com.facebook.ads.redexgen.core.C05128b(true, A00(0, 29, 22)));
        }
    }
}
