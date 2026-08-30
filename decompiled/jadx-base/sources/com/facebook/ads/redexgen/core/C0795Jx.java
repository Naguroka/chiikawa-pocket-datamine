package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0795Jx implements com.facebook.ads.redexgen.core.SL {
    public static boolean A03;
    public static byte[] A04;
    public static java.lang.String[] A05 = {"HV3bjOQFG6hG19mK6btv5ZItymBNR4jb", "f8frJPlJVlZQfTmtqYpYtimfJzE", "snhVz6l74gACRZpxcVOl8ZhDE", "ioIXRoWDB2y5rIxXUVMK", "pJOGedThy6U23H0Dqr8MrVjxKTkAUTUw", "Z2sPBilUji", "eoagJWSpw9dhQ5uILEfDMJsGfxbL2OXR", "ioOrVGKFmPeoWtk9SUaiMK94AxkbTfSp"};
    public static final com.facebook.ads.redexgen.core.SJ A06;
    public static final java.lang.String A07;
    public long A00 = 0;
    public final com.facebook.ads.redexgen.core.SK A01;
    public final com.facebook.ads.redexgen.core.SQ A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] - i3;
            java.lang.String[] strArr = A05;
            if (strArr[2].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[6] = "SjioWZFjItKuhqld4sWZUQTfHHPQcsy5";
            strArr2[4] = "wEt2AMMlWwKWRpacJrxPlGBsPjvVn5Jo";
            bArrCopyOfRange[i4] = (byte) (i5 - 117);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A05[0].charAt(9) == 'h') {
            throw new java.lang.RuntimeException();
        }
        A05[7] = "NMMzHy25EZUbJzWBlBjuS5XjO6LPkHkX";
        A04 = new byte[]{-8, 33, 36, 21, 27, 32, 25, -46, 32, 23, 42, 38, -46, 37, 43, 32, 21, -46, 19, 38, -46, -47, -27, -10, -17, -92, -27, -9, -92, -14, -13, -92, -9, -3, -14, -25, -20, -10, -13, -14, -19, -2, -27, -8, -19, -13, -14, -92, -9, -25, -20, -23, -24, -7, -16, -23, -24, -78, -92, -48, -27, -9, -8, -92, -9, -3, -14, -25, -92, -27, -8, -92, -87, -24, -78, -92, -46, -23, -4, -8, -92, -9, -3, -14, -25, -92, -27, -8, -92, -87, -24, -78, 14, 39, 32, 32, 43, -37, 33, 42, 45, -37, -32, 31, -37, 40, 36, 39, 39, 36, 46, -23, 3, 2, -26, 9, 2, -38, -3, 2, -3, 7, -4, -7, -8};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.SL
    public final synchronized void A66(int i) {
        long jA5L = this.A02.A5L() + (((long) i) * 1000000 * ((long) (A03 ? 1 : 1000)));
        if (this.A00 == 0 || this.A00 > jA5L) {
            this.A00 = jA5L;
            notifyAll();
        }
    }

    static {
        A02();
        A07 = com.facebook.ads.redexgen.core.C0795Jx.class.getSimpleName();
        A06 = new com.facebook.ads.redexgen.core.C0796Jy();
        A03 = false;
    }

    public C0795Jx(com.facebook.ads.redexgen.core.SK sk, com.facebook.ads.redexgen.core.SQ sq) {
        this.A01 = sk;
        this.A02 = sq;
        java.lang.Thread scheduler = new java.lang.Thread(new com.facebook.ads.redexgen.core.SM(this));
        scheduler.start();
    }

    private void A01() {
        while (true) {
            synchronized (this) {
                if (this.A00 == 0) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                } else {
                    long jA5L = this.A02.A5L();
                    if (jA5L < this.A00) {
                        int millisToSleep = (int) ((this.A00 - jA5L) / 1000000);
                        if (millisToSleep >= 1) {
                            java.lang.String.format(java.util.Locale.US, A00(92, 20, 70), java.lang.Integer.valueOf(millisToSleep));
                            try {
                                long current = millisToSleep;
                                this.A02.AGr(this, current);
                            } catch (java.lang.InterruptedException unused2) {
                            }
                        }
                    }
                    this.A00 = 0L;
                    this.A01.AFt();
                    long jA5L2 = this.A02.A5L();
                    if (0 != 0) {
                        throw new java.lang.NullPointerException(A00(112, 13, 31));
                    }
                    synchronized (this) {
                        if (this.A00 < jA5L2) {
                            java.lang.String.format(java.util.Locale.US, A00(21, 71, 15), java.lang.Long.valueOf(jA5L2), java.lang.Long.valueOf(this.A00));
                            this.A00 = 0L;
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void A03(com.facebook.ads.redexgen.core.C0795Jx c0795Jx) {
        c0795Jx.A01();
        throw null;
    }

    @Override // com.facebook.ads.redexgen.core.SL
    public final synchronized void A67() {
        this.A00 = this.A02.A5L();
        java.lang.String str = A00(0, 21, 61) + this.A00;
        notifyAll();
    }
}
