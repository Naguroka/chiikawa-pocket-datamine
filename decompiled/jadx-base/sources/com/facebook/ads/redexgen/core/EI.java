package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EI implements java.lang.Runnable {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"SBHD4zyCYYuTUtdzO3ruR5mHrnxwLuRg", "0EP9Msc9I8tfBL5U", "frMW", "PP35trxuF6uAvu7ZSNEnPeX", "VFIryW0SGhW14tSFNmX0iOPyizAkcqk5", "WaXRugEVfO2gUoq5HkQlmshQZztZ0bV7", "8EMSMi8y13usURdU6tUq33FsQcblZb5N", "G58b"};
    public java.lang.Thread A00;
    public java.lang.Throwable A01;
    public final int A02;
    public final int A03;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction A04;
    public final com.facebook.ads.redexgen.core.EL A05;
    public volatile int A06;
    public volatile com.facebook.ads.redexgen.core.EP A07;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 42);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0C() {
        A08 = new byte[]{17, 58, 34, 59, 57, 58, 52, 49, 117, 48, 39, 39, 58, 39, 123, 117, 7, 48, 33, 39, 44, 117, 30, 41, okio.Utf8.REPLACEMENT_BYTE, 41, 56, 108, 41, 62, 62, 35, 62, 108, 47, 35, 57, 34, 56, 98, 108, 40, 35, 59, 34, 32, 35, 45, 40, 41, 40, 14, 53, 56, 41, okio.Utf8.REPLACEMENT_BYTE, 108, 113, 108, 17, 54, 45, 50, 50, 43, 44, 37, 51, 6, 20, 12, 71, 14, 20, 71, 20, 19, 6, 21, 19, 2, 3};
    }

    static {
        A0C();
    }

    public EI(int i, com.facebook.ads.redexgen.core.EL el, com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction downloadAction, int i2) {
        this.A02 = i;
        this.A05 = el;
        this.A04 = downloadAction;
        this.A06 = 0;
        this.A03 = i2;
    }

    public /* synthetic */ EI(int i, com.facebook.ads.redexgen.core.EL el, com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction downloadAction, int i2, com.facebook.ads.redexgen.core.EA ea) {
        this(i, el, downloadAction, i2);
    }

    private final float A00() {
        if (this.A07 != null) {
            return this.A07.A7C();
        }
        return -1.0f;
    }

    private int A01() {
        switch (this.A06) {
            case 5:
                return 0;
            case 6:
            case 7:
                return 1;
            default:
                return this.A06;
        }
    }

    private int A02(int i) {
        return java.lang.Math.min((i - 1) * 1000, 5000);
    }

    private final long A05() {
        if (this.A07 != null) {
            return this.A07.A7D();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        if (!A0H(0, 5)) {
            if (!A0H(1, 6)) {
                return;
            }
            A09();
            return;
        }
        this.A05.A07.post(new com.facebook.ads.redexgen.core.EF(this));
    }

    private void A09() {
        if (this.A07 != null) {
            this.A07.cancel();
        }
        java.lang.Thread thread = this.A00;
        java.lang.String[] strArr = A09;
        if (strArr[5].charAt(29) != strArr[6].charAt(29)) {
            throw new java.lang.RuntimeException();
        }
        A09[0] = "31KUupLpNWlzA2pg81mOKO8sRWUw8DLv";
        thread.interrupt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (A0H(0, 1)) {
            this.A00 = new java.lang.Thread(this);
            this.A00.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (A0H(1, 7)) {
            if (A09[0].charAt(16) == '7') {
                throw new java.lang.RuntimeException();
            }
            A09[1] = "XoPzbYQ3";
            com.facebook.ads.redexgen.core.EL.A0K(A07(59, 8, 104), this);
            this.A00.interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0G() {
        return this.A06 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H(int i, int i2) {
        return A0I(i, i2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(int i, int i2, java.lang.Throwable th) {
        if (this.A06 != i) {
            return false;
        }
        this.A06 = i2;
        this.A01 = th;
        if (!(this.A06 != A01())) {
            this.A05.A0F(this);
        }
        return true;
    }

    public final com.facebook.ads.redexgen.core.EK A0M() {
        return new com.facebook.ads.redexgen.core.EK(this.A02, this.A04, A01(), A00(), A05(), this.A01, null);
    }

    public final boolean A0N() {
        if (this.A06 == 5 || this.A06 == 1 || this.A06 == 7) {
            return true;
        }
        int i = this.A06;
        if (A09[4].charAt(18) == '0') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A09;
        strArr[5] = "60RqioC1jfEvrRIwJ1QlUWR9MPqv8biv";
        strArr[6] = "zPUM17gHICdR7z9f43U91xptyEezmbbR";
        return i == 6;
    }

    public final boolean A0O() {
        return this.A06 == 4 || this.A06 == 2 || this.A06 == 3;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            com.facebook.ads.redexgen.core.EL.A0K(A07(67, 15, 77), this);
            java.lang.Throwable finalError = null;
            try {
                this.A07 = this.A04.A07(this.A05.A0A);
                if (this.A04.A03) {
                    this.A07.remove();
                } else {
                    int i = 0;
                    long j = -1;
                    while (!java.lang.Thread.interrupted()) {
                        try {
                            this.A07.A5Z();
                            break;
                        } catch (java.io.IOException e) {
                            long jA7D = this.A07.A7D();
                            if (jA7D != j) {
                                com.facebook.ads.redexgen.core.EL.A0K(A07(22, 37, 102) + jA7D, this);
                                j = jA7D;
                                i = 0;
                            }
                            if (this.A06 != 1 || (i = i + 1) > this.A03) {
                                throw e;
                            }
                            com.facebook.ads.redexgen.core.EL.A0K(A07(0, 22, 127) + i, this);
                            java.lang.Thread.sleep(A02(i));
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                finalError = th;
            }
            this.A05.A07.post(new com.facebook.ads.redexgen.core.EG(this, finalError));
        } catch (java.lang.Throwable th2) {
            com.facebook.ads.redexgen.core.KQ.A00(th2, this);
            if (A09[1].length() == 11) {
                throw new java.lang.RuntimeException();
            }
            A09[3] = "IZEYUhzwAcWwMrWBxMbEfz8";
        }
    }

    public final java.lang.String toString() {
        return super.toString();
    }
}
