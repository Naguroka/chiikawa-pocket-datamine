package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.84, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass84 implements java.lang.Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final com.facebook.ads.redexgen.core.C1198Zr A00;
    public final com.facebook.ads.redexgen.core.C8B A01;
    public final java.lang.Thread.UncaughtExceptionHandler A02;
    public final java.util.Map<java.lang.String, java.lang.String> A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 48);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -51, -102, -74, -64, -64, -74, -69, -76, 109, -112, -68, -69, -63, -78, -59, -63, -102, -90, -92, 101, -99, -104, -102, -100, -103, -90, -90, -94, 101, -104, -101, -86, 2, 17, 0, 18, 7, 7, 9, -10, 8, 13, 4, -7, -20, -18, -37, -19, -14, -23, -34, -40, -36, -24, -35, -34};
    }

    public AnonymousClass84(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.AnonymousClass83 anonymousClass83) {
        this(uncaughtExceptionHandler, c1198Zr, anonymousClass83, com.facebook.ads.redexgen.core.C8C.A00());
    }

    public AnonymousClass84(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.AnonymousClass83 anonymousClass83, com.facebook.ads.redexgen.core.C8B c8b) {
        this.A02 = uncaughtExceptionHandler;
        if (c1198Zr != null) {
            this.A00 = c1198Zr;
            this.A03 = anonymousClass83.A8N(c1198Zr);
            this.A01 = c8b;
            return;
        }
        throw new java.lang.IllegalArgumentException(A00(2, 15, 29));
    }

    public static void A02() {
        try {
            android.os.Process.killProcess(android.os.Process.myPid());
        } catch (java.lang.Throwable unused) {
        }
        try {
            java.lang.System.exit(10);
        } catch (java.lang.Throwable unused2) {
        }
    }

    private void A03(java.lang.Thread thread, java.lang.Throwable th) {
        if (this.A02 != null) {
            this.A02.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        try {
            java.lang.String strA03 = com.facebook.ads.redexgen.core.AbstractC0832Ll.A03(this.A00, th);
            if (!android.text.TextUtils.isEmpty(strA03)) {
                java.lang.String stackTraceString = A00(17, 16, 7);
                if (strA03.contains(stackTraceString)) {
                    java.util.Map<java.lang.String, java.lang.String> mapA02 = new com.facebook.ads.redexgen.core.AnonymousClass82(strA03, this.A03).A02();
                    java.lang.String strA00 = A00(38, 7, 100);
                    java.lang.String stackTraceString2 = A00(33, 5, 111);
                    mapA02.put(strA00, stackTraceString2);
                    java.lang.Throwable thA00 = com.facebook.ads.redexgen.core.KL.A00();
                    java.lang.String strA01 = A00(45, 12, 73);
                    if (thA00 == th) {
                        java.lang.String stackTraceString3 = A00(1, 1, 108);
                        mapA02.put(strA01, stackTraceString3);
                    } else {
                        java.lang.String stackTraceString4 = A00(0, 1, 81);
                        mapA02.put(strA01, stackTraceString4);
                    }
                    this.A01.AHi(new com.facebook.ads.redexgen.core.C8I(this.A00.A08().A01(), this.A00.A08().A02(), mapA02), this.A00);
                    if (com.facebook.ads.redexgen.core.C0762Im.A20(this.A00)) {
                        com.facebook.ads.redexgen.core.C0762Im.A0c(this.A00);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        A03(thread, th);
    }
}
