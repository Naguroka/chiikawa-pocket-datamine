package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PC extends android.widget.TextView implements com.facebook.ads.redexgen.core.InterfaceC0970Qt {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"KyDK4ozsSQOI8CeBEp6vN7GPAMaKi3Lj", "3K3dE7OkNcMTAukVEMEsyydi1KZJfoYe", "AKsSDy", "td2HYxymrySRBlk8LVzv2Nj", "9YKsZJjoWB8K3TGCGylWNfB", "C67xSy", "ZVZacBuH1Jrb8cRz3UZ99yjmQBL5sCV1", "zO36dBYDIleQnJstGNGNdS3bkLsuKmlY"};
    public static final int A04;
    public com.facebook.ads.redexgen.core.T7 A00;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.C9O> A01;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A03;
            if (strArr[0].charAt(28) == strArr[1].charAt(28)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[0] = "iGxWfyiSQAQNOwaGoqCiMbtpxtO5GMjZ";
            strArr2[1] = "gQ1pvXOTKlX7L3B8LOaiCsG8OhRO9Yk5";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 61);
            i4++;
        }
    }

    public static void A04() {
        A02 = new byte[]{15, 26, 24, 78, 16, 15, 26, 24, 78, 18, 18, 24, 18, 18};
    }

    static {
        A04();
        A04 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 6.0f);
    }

    public PC(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A01 = new com.facebook.ads.redexgen.core.PV(this);
        com.facebook.ads.redexgen.core.M3.A0S(this, com.facebook.ads.redexgen.core.M3.A06(855638016, A04));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String A02(long j) {
        if (j <= 0) {
            return A01(9, 5, 31);
        }
        long minutes = java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j);
        long minutes2 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j % 60000);
        return java.lang.String.format(java.util.Locale.US, A01(0, 9, 23), java.lang.Long.valueOf(minutes), java.lang.Long.valueOf(minutes2));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void A9r(com.facebook.ads.redexgen.core.T7 t7) {
        this.A00 = t7;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void AHD(com.facebook.ads.redexgen.core.T7 t7) {
        this.A00 = t7;
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A01);
        }
    }
}
