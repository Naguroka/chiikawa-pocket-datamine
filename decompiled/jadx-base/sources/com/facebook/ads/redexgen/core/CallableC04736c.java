package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class CallableC04736c implements java.util.concurrent.Callable<java.lang.Boolean> {
    public static byte[] A02;
    public final com.facebook.ads.redexgen.core.C04726b A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04766f A01;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 41);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -46, -29, -36, -26, -31, -25, -38, -43, -42, -32};
    }

    public CallableC04736c(com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.C04726b c04726b) {
        this.A01 = c04766f;
        this.A00 = c04726b;
    }

    private final java.lang.Boolean A00() throws java.lang.Throwable {
        java.lang.String strA01;
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return null;
        }
        try {
            android.net.TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                strA01 = A01(0, 6, 72);
            } else {
                strA01 = A01(6, 5, 72);
            }
            java.lang.String str = this.A00.A08;
            java.lang.String creativeType = this.A00.A07;
            com.facebook.ads.redexgen.core.AnonymousClass06 anonymousClass06 = new com.facebook.ads.redexgen.core.AnonymousClass06(str, creativeType, this.A00.A06, strA01, this.A00.A02, this.A00.A05);
            anonymousClass06.A04 = this.A00.A03;
            anonymousClass06.A02 = this.A00.A01;
            anonymousClass06.A05 = this.A00.A04;
            if (com.facebook.ads.redexgen.core.C04796i.A06(this.A01.A04)) {
                com.facebook.ads.redexgen.core.C04766f.A0F.put(this.A00.A08, anonymousClass06);
            }
            return java.lang.Boolean.valueOf(com.facebook.ads.redexgen.core.C04766f.A03(this.A01.A04.A01()).AFn(anonymousClass06) != null);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Boolean call() throws java.lang.Exception {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            return null;
        }
    }
}
