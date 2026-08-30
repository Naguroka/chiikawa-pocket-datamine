package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OM implements android.view.View.OnClickListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"fjtAB", "bsaRMRqbX1J53zhFSd", "3x", "d1GXs2u7l6dphEhs75uHz8nXS", "xBLq5iNxiropzdSod3RzWHu9Svz5m1J", "bqiGUlPWwNgoqXE8vIE4LDwWoR3rV8W6", "Cst7knLO4cVZP", "zRpbMV9q"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.BZ A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 83);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{115, 119, 123, 125, 127};
    }

    static {
        A01();
    }

    public OM(com.facebook.ads.redexgen.core.BZ bz) {
        this.A00 = bz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 73));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            if (A02[2].length() == 17) {
                throw new java.lang.RuntimeException();
            }
            A02[0] = "IkNABMfZpUuzelGW3VlRw";
        }
    }
}
