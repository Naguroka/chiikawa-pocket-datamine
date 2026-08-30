package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6Q {
    public static com.facebook.ads.redexgen.core.C6R A00;
    public static boolean A01;
    public static byte[] A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (com.facebook.ads.redexgen.core.C6Q.class) {
            if (A00 == null) {
                return;
            }
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(A00.AFi());
            c8f.A05(1);
            com.facebook.ads.redexgen.core.C1198Zr c1198ZrA00 = com.facebook.ads.redexgen.core.AbstractC04997i.A00();
            if (c1198ZrA00 != null) {
                c1198ZrA00.A07().AA0(A00(0, 9, 49), 3401, c8f);
            }
            A00.reset();
        }
    }

    public static void A03(final long j) {
        if (j > 0) {
            A00 = new com.facebook.ads.redexgen.core.C1208a1();
            new java.lang.Thread(j) { // from class: com.facebook.ads.redexgen.X.6S
                public final long A00;

                {
                    this.A00 = j;
                    start();
                }

                /* JADX WARN: Bottom block not found for handler: all -> 0x0011 */
                @Override // java.lang.Thread, java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() throws java.lang.Throwable {
                    if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            java.lang.Thread.sleep(this.A00);
                        } catch (java.lang.InterruptedException unused) {
                        }
                        com.facebook.ads.redexgen.core.C6Q.A01();
                    }
                }
            };
        }
    }
}
