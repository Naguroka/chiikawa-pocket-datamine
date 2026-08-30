package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EC implements java.lang.Runnable {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.EL A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 90);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-54, -20, -3, -14, -8, -9, -87, -17, -14, -11, -18, -87, -11, -8, -22, -19, -14, -9, -16, -87, -17, -22, -14, -11, -18, -19, -73, -53, -10, -2, -11, -13, -10, -24, -21, -44, -24, -11, -24, -18, -20, -7};
    }

    public EC(com.facebook.ads.redexgen.core.EL el) {
        this.A00 = el;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[] actions;
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            try {
                actions = this.A00.A09.A03(this.A00.A0E);
            } catch (java.lang.Throwable th) {
                android.util.Log.e(A00(27, 15, 45), A00(0, 27, 47), th);
                actions = new com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[0];
            }
            this.A00.A07.post(new com.facebook.ads.redexgen.core.EB(this, actions));
        } catch (java.lang.Throwable th2) {
            com.facebook.ads.redexgen.core.KQ.A00(th2, this);
        }
    }
}
