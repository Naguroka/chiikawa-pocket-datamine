package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QA implements java.lang.Runnable {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05399c A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{22, 41, 36, 37, 47, 16, 44, 33, 57, 34, 33, 35, 43, 5, 50, 50, 47, 50};
    }

    public QA(com.facebook.ads.redexgen.core.C05399c c05399c) {
        this.A00 = c05399c;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0M(A00(0, 18, 81));
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
