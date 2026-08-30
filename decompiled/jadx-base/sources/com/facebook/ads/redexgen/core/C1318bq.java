package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1318bq implements com.facebook.ads.redexgen.core.AnonymousClass14 {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"HqViDmZKE9gqowyTLi9oGTmraxBLxdfb", "ZDhLRf5Uu21mhR1h1Q7a0O5z7jEhSu9k", "2GbaqYyT8OuzZpNttfxCN9qv1cIIYzBc", "fbbf2hOViPWoQMO0MuifN9tE3LO9hSeI", "DwEg34XuIOHddfNq0Duo86gfWbmgRcX4", "GcZc2s8wIoPvhyGTdTaWZVIVIYLPtEuL", "AIVK7lVsrhvQj", "0MZsasdmKrVN6CPRKwrl3lR9QzLAtIP"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0684Fh A04;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C8U A05;
    public final /* synthetic */ java.lang.Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 16);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, -112, -112, -115, -112, -59, -53, -65};
    }

    static {
        A01();
    }

    public C1318bq(com.facebook.ads.redexgen.core.C0684Fh c0684Fh, java.lang.Runnable runnable, long j, com.facebook.ads.redexgen.core.C8U c8u) {
        this.A04 = c0684Fh;
        this.A06 = runnable;
        this.A03 = j;
        this.A05 = c8u;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final void ACn(com.facebook.ads.redexgen.core.C1358cU c1358cU) {
        if (!this.A00) {
            this.A00 = true;
            java.lang.String[] strArr = A08;
            if (strArr[1].charAt(12) != strArr[5].charAt(12)) {
                throw new java.lang.RuntimeException();
            }
            A08[0] = "A302cEzPVYQXumyZNbB7zeSxM9mEDz6J";
            this.A04.A05(this.A05.A03(com.facebook.ads.redexgen.core.C8Y.A02), null);
        }
        if (this.A04.A07 != null) {
            this.A04.A07.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final void ACo(com.facebook.ads.redexgen.core.C1358cU c1358cU) {
        if (c1358cU != this.A04.A00) {
            return;
        }
        android.os.Handler handlerA0G = this.A04.A0G();
        java.lang.Runnable runnable = this.A06;
        if (A08[7].length() != 31) {
            throw new java.lang.RuntimeException();
        }
        A08[0] = "XfIEhebH8X778eyni9LsSDQR6QKL4f9o";
        handlerA0G.removeCallbacks(runnable);
        this.A04.A01 = c1358cU;
        this.A04.A07.A0F(c1358cU);
        if (!this.A02) {
            this.A02 = true;
            java.util.Map mapA01 = this.A04.A01(this.A03);
            if (A08[3].charAt(7) == 'h') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A08;
            strArr[1] = "6CdPuG9VNNO8hZ7pQWbBuknU9qSrspmw";
            strArr[5] = "JYrF77GwPBrAhOPn8MtwFVV4pu279MHz";
            this.A04.A05(this.A05.A03(com.facebook.ads.redexgen.core.C8Y.A04), mapA01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final void ACp(com.facebook.ads.redexgen.core.C1358cU c1358cU) {
        if (!this.A01) {
            this.A01 = true;
            this.A04.A05(this.A05.A03(com.facebook.ads.redexgen.core.C8Y.A03), null);
        }
        this.A04.A0N();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass14
    public final void ACr(com.facebook.ads.redexgen.core.C1358cU c1358cU, com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        if (c1358cU != this.A04.A00) {
            return;
        }
        this.A04.A0G().removeCallbacks(this.A06);
        this.A04.A0P(c1358cU);
        if (!this.A02) {
            this.A02 = true;
            java.util.Map mapA01 = this.A04.A01(this.A03);
            mapA01.put(A00(0, 5, 14), java.lang.String.valueOf(c0779Jg.A03().getErrorCode()));
            mapA01.put(A00(5, 3, 72), java.lang.String.valueOf(c0779Jg.A04()));
            this.A04.A05(this.A05.A03(com.facebook.ads.redexgen.core.C8Y.A04), mapA01);
        }
        this.A04.ABs(c0779Jg);
    }
}
