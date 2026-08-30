package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MU implements java.lang.Runnable {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.CI A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-106, -108, -122, -109, -128, -125, -106, -121, -121, -122, -109, -122, -123, -128, -124, -115, -118, -124, -116, -128, -126, -121, -107, -122, -109, -128, -123, -122, -115, -126, -102};
    }

    public MU(com.facebook.ads.redexgen.core.CI ci) {
        this.A00 = ci;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(A00(0, 31, 20));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
