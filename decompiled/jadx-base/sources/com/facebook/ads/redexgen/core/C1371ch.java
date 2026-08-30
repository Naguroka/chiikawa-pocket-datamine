package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1371ch extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C03390w A00;
    public final /* synthetic */ java.lang.String A01;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 55);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C1371ch(com.facebook.ads.redexgen.core.C03390w c03390w, java.lang.String str) {
        this.A00 = c03390w;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        try {
            this.A00.A06.await();
            synchronized (this.A00.A02) {
                try {
                    java.util.Iterator<java.lang.String> itKeys = this.A00.A02.A05().keys();
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        if (this.A00.A0J(this.A01)) {
                            this.A00.A0E((com.facebook.ads.redexgen.core.C1S) this.A00.A02.A05().get(next), next, next.equals(this.A01));
                        }
                    }
                    this.A00.A02.A06();
                    this.A00.A08();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (java.lang.InterruptedException e) {
            com.facebook.ads.redexgen.core.C8D c8dA07 = this.A00.A03.A07();
            java.lang.String encryptedId = A00(0, 17, 22);
            c8dA07.AA0(encryptedId, com.facebook.ads.redexgen.core.C8E.A1B, new com.facebook.ads.redexgen.core.C8F(e));
        } catch (org.json.JSONException e2) {
            this.A00.A0M();
            com.facebook.ads.redexgen.core.C8D c8dA08 = this.A00.A03.A07();
            java.lang.String encryptedId2 = A00(0, 17, 22);
            c8dA08.AA0(encryptedId2, com.facebook.ads.redexgen.core.C8E.A1A, new com.facebook.ads.redexgen.core.C8F(e2));
        }
    }
}
