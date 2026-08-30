package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class V4 implements com.facebook.ads.redexgen.core.NG {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.NE A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, 13, 15, 76, 4, 3, 1, 7, 0, 13, 13, 9, 76, 3, 6, 17, 76, 3, 6, 16, 7, 18, 13, 16, 22, 11, 12, 5, 76, 36, 43, 44, 43, 49, 42, kotlin.io.encoding.Base64.padSymbol, 35, 38, kotlin.io.encoding.Base64.padSymbol, 48, 39, 50, 45, 48, 54, 43, 44, 37, kotlin.io.encoding.Base64.padSymbol, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public V4(com.facebook.ads.redexgen.core.NE ne) {
        this.A00 = ne;
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void A4h() {
        if (this.A00.A07 != null) {
            this.A00.A07.A4P(A00(0, 53, 115));
        }
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void A4i() {
        this.A00.A0M();
        if (this.A00.A08 != null) {
            this.A00.A08.ADN(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void A8n() {
        if (this.A00.A03 == null) {
            A4i();
            if (A02[0].charAt(15) == 'S') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        com.facebook.ads.redexgen.core.NE.A01(this.A00);
        if (this.A00.A03.A02() == null) {
            this.A00.A0C();
        } else {
            com.facebook.ads.redexgen.core.NE ne = this.A00;
            com.facebook.ads.redexgen.core.NE ne2 = this.A00;
            if (A02[7].length() != 21) {
                java.lang.String[] strArr2 = A02;
                strArr2[1] = "INFlSY3hMh2PzUDbq0dGz0F";
                strArr2[3] = "HzdMOFaNJmeC7SCfZ9pfkiD";
                ne.A0E(ne2.A03.A02());
            } else {
                A02[0] = "z9yYgUlQPv8m5YvZTPOnZi9Yl33249VB";
                ne.A0E(ne2.A03.A02());
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 16 && com.facebook.ads.redexgen.core.C0762Im.A2N(this.A00.A05)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void A9m() {
        if (!android.text.TextUtils.isEmpty(this.A00.A04.A0I())) {
            com.facebook.ads.redexgen.core.L2.A0M(new com.facebook.ads.redexgen.core.L2(), this.A00.A05, com.facebook.ads.redexgen.core.L5.A00(this.A00.A04.A0I()), this.A00.A09);
        }
        this.A00.A02.A04();
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void A9n() {
        this.A00.A0M();
        if (this.A00.A08 != null) {
            this.A00.A08.ADN(true);
        }
        if (!android.text.TextUtils.isEmpty(this.A00.A04.A0C())) {
            com.facebook.ads.redexgen.core.L2.A0M(new com.facebook.ads.redexgen.core.L2(), this.A00.A05, com.facebook.ads.redexgen.core.L5.A00(this.A00.A04.A0C()), this.A00.A09);
        }
        this.A00.A02.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void ACj(com.facebook.ads.redexgen.core.C2U c2u) {
        com.facebook.ads.redexgen.core.C2W c2wA0B;
        com.facebook.ads.redexgen.core.NE.A00(this.A00);
        this.A00.A01 = c2u;
        if (this.A00.A01 == com.facebook.ads.redexgen.core.C2U.A04) {
            c2wA0B = this.A00.A04.A0A();
        } else {
            com.facebook.ads.redexgen.core.NE ne = this.A00;
            if (A02[0].charAt(15) != 'S') {
                java.lang.String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c2wA0B = ne.A04.A0B();
            } else {
                c2wA0B = ne.A04.A0B();
            }
        }
        com.facebook.ads.redexgen.core.NE ne2 = this.A00;
        java.lang.String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        ne2.A0E(c2wA0B);
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void ACt(com.facebook.ads.redexgen.core.C2W c2w) {
        com.facebook.ads.redexgen.core.NE.A00(this.A00);
        this.A00.A02.A07(c2w.A01());
        if (c2w.A05().isEmpty()) {
            this.A00.A0D(c2w);
            return;
        }
        com.facebook.ads.redexgen.core.NE ne = this.A00;
        java.lang.String[] strArr = A02;
        if (strArr[2].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
        strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
        ne.A0E(c2w);
    }
}
