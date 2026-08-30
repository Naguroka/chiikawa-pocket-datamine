package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U7 extends com.facebook.ads.redexgen.core.AbstractC0986Rj {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.U6 A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-37, -32, -39, -31, -26, -35, -36, -41, -39, -36, -41, -31, -26, -36, -35, -16};
    }

    public U7(com.facebook.ads.redexgen.core.U6 u6) {
        this.A00 = u6;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0986Rj
    public final void A03() {
        if (!this.A00.A09.A07()) {
            this.A00.A09.A05();
            if (!android.text.TextUtils.isEmpty(this.A00.A05.A1U())) {
                java.util.Map<java.lang.String, java.lang.String> mapA05 = new com.facebook.ads.redexgen.core.O8().A03(this.A00.A0C).A02(this.A00.A09).A04(this.A00.A05.A0b()).A05();
                mapA05.put(A00(0, 16, 42), A00(0, 0, 96) + this.A00.A01);
                this.A00.A07.AA6(this.A00.A05.A1U(), mapA05);
                com.facebook.ads.redexgen.core.C0805Kh.A00(this.A00.A06).A0E(this.A00.A0B.A83(), this.A00.A05.A1U());
                com.facebook.ads.redexgen.core.C1T.A07(this.A00.A05.A1Q(), this.A00.A06);
                this.A00.A06.A0E().A36();
                if (!this.A00.A03) {
                    com.facebook.ads.redexgen.core.C2M.A02(this.A00.A05.A0a(), com.facebook.ads.redexgen.core.AbstractC0825Le.A00(this.A00.A05.A0c()));
                }
                if (!this.A00.A04) {
                    this.A00.A0A.A4P(this.A00.A0B.A7Z());
                }
            }
        }
    }
}
