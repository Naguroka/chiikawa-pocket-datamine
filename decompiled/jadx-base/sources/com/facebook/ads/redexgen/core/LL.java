package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LL {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final android.os.Handler A01 = new android.os.Handler(android.os.Looper.getMainLooper());
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final com.facebook.ads.redexgen.core.LJ A04;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 2);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{84, 91, 94, 84, 92, 104, 68, 88, 66, 69, 84, 82};
    }

    static {
        A03();
    }

    public LL(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.LJ lj) {
        this.A03 = c1199Zs;
        this.A04 = lj;
        this.A02 = abstractC1341cD;
    }

    public static com.facebook.ads.redexgen.core.LL A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.LJ lj) {
        java.lang.Object creativeAsCtaLoggingHelper = c1199Zs.A0H();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new com.facebook.ads.redexgen.core.LL(c1199Zs, abstractC1341cD, lj);
            c1199Zs.A0O(creativeAsCtaLoggingHelper);
        }
        return (com.facebook.ads.redexgen.core.LL) creativeAsCtaLoggingHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(java.lang.String str, com.facebook.ads.redexgen.core.C1T c1t, java.lang.String str2) {
        java.util.Map<java.lang.String, java.lang.String> mapA05 = new com.facebook.ads.redexgen.core.O8().A03(null).A02(null).A05();
        mapA05.put(A02(0, 12, 53), str);
        this.A03.A09().AA9(str2, mapA05);
        if (c1t != null) {
            com.facebook.ads.redexgen.core.C1T.A06(c1t, this.A03);
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A2J(this.A03)) {
            java.util.HashMap map = new java.util.HashMap();
            map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A03, java.lang.Boolean.TRUE.toString());
            map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A04, java.lang.Boolean.TRUE.toString());
            map.put(com.facebook.ads.redexgen.core.AbstractC1376cm.A05, java.lang.Boolean.TRUE.toString());
            this.A03.A09().AAI(str2, map);
        }
        this.A04.ACa();
    }

    private void A06(java.lang.String str, com.facebook.ads.redexgen.core.C1T c1t, java.lang.String str2, long j) {
        this.A00 = true;
        this.A01.postDelayed(new com.facebook.ads.redexgen.core.LI(this, str, c1t, str2), j);
    }

    public static boolean A07(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        return com.facebook.ads.redexgen.core.C0762Im.A1W(c1199Zs) && com.facebook.ads.redexgen.core.L2.A0H(c1199Zs);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    public final com.facebook.ads.redexgen.core.LK A0A(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        boolean z;
        if (com.facebook.ads.redexgen.core.C0762Im.A1c(this.A03)) {
            z = abstractC1341cD.A17() && A07(this.A03);
            return new com.facebook.ads.redexgen.core.LK(z, z);
        }
        boolean zA17 = abstractC1341cD.A17();
        if (zA17) {
            boolean zA07 = A07(this.A03);
            java.lang.String[] strArr = A06;
            if (strArr[5].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A06;
            strArr2[2] = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g";
            strArr2[4] = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA";
            z = zA07;
        }
        return new com.facebook.ads.redexgen.core.LK(zA17, z);
    }

    public final void A0B() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }

    public final void A0C(java.lang.String str, com.facebook.ads.redexgen.core.C1T c1t, java.lang.String str2) {
        A0B();
        A06(str, c1t, str2, this.A02 != null ? this.A02.A0T() : 2000L);
    }

    public final void A0D(java.lang.String str, com.facebook.ads.redexgen.core.C1T c1t, java.lang.String str2) {
        A0B();
        A06(str, c1t, str2, this.A02 != null ? this.A02.A0U() : 2000L);
    }
}
