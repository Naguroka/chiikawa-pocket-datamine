package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1370cg extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C03390w A00;
    public final /* synthetic */ java.lang.String A01;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 19);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{36, 48, 39, 51, 55, 39, 44, 33, 59, 29, 33, 35, 50, 50, 43, 44, 37};
    }

    public C1370cg(com.facebook.ads.redexgen.core.C03390w c03390w, java.lang.String str) {
        this.A00 = c03390w;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        java.lang.String strA00 = A00(0, 17, 81);
        try {
            this.A00.A06.await();
            if (this.A00.A0J(this.A01)) {
                ((com.facebook.ads.redexgen.core.C1S) this.A00.A02.A05().get(this.A01)).A04((int) (java.lang.System.currentTimeMillis() / 1000));
                this.A00.A02.A07(this.A01);
                this.A00.A02.A06();
                this.A00.A08();
            }
        } catch (java.lang.InterruptedException e) {
            this.A00.A03.A07().AA0(strA00, com.facebook.ads.redexgen.core.C8E.A1B, new com.facebook.ads.redexgen.core.C8F(e));
        } catch (org.json.JSONException e2) {
            this.A00.A0M();
            this.A00.A03.A07().AA0(strA00, com.facebook.ads.redexgen.core.C8E.A1A, new com.facebook.ads.redexgen.core.C8F(e2));
        }
    }
}
