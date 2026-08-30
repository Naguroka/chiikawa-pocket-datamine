package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class LB implements java.lang.Runnable {
    public static java.lang.String[] A04 = {"nCRFoG2V5rxtp9CJ0zj2vqX2pOjohwfk", "4wjnoNx3VOTWdL7VvzY4PdOFwDa8aAyk", "NZwRvgeKfVOQj3OAbWBZydUCa0", "QhytIBUnuaSIq9HsTJzjLcd0Gyd", "BSNgfeEt9bBv41mFKDcPuiwW51mPbBL", "ThuVKQMdtpTlOVe04IgNONUKoYEgRLHM", "EXwZjrYuwLfsbcbpnacjwuDYCB43acny", "AVskEroBo8UlfYPInQ7Yx5KSddGfFQyi"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1198Zr A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.LZ A01;
    public final /* synthetic */ java.lang.String A02;
    public final /* synthetic */ int[] A03;

    public LB(int[] iArr, java.lang.String str, com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.LZ lz) {
        this.A03 = iArr;
        this.A02 = str;
        this.A00 = c1198Zr;
        this.A01 = lz;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            int[] iArr = this.A03;
            iArr[0] = iArr[0] + 1000;
            int i = this.A03[0];
            if (A04[5].charAt(0) == 'R') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A04;
            strArr[6] = "K9ogtrTQz9r2EYsYEG2F5l0cYywtmYZ4";
            strArr[7] = "6mL3lrEUp2ULAISFIzSh85ZjlbRVvlWv";
            if (i > 600000) {
                com.facebook.ads.redexgen.core.LC.A02.removeCallbacks(this);
                com.facebook.ads.redexgen.core.LC.A03.remove(this.A02);
            } else {
                if (com.facebook.ads.redexgen.core.LC.A08(this.A00.getPackageManager(), this.A02)) {
                    com.facebook.ads.redexgen.core.LC.A02.removeCallbacks(this);
                    com.facebook.ads.redexgen.core.LC.A03.remove(this.A02);
                    this.A01.ACv(this.A02);
                    return;
                }
                com.facebook.ads.redexgen.core.LC.A02.postDelayed(this, 1000L);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
            if (A04[2].length() != 26) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[4] = "FQThdvyXjGVQZyAeyGp3f4l1pRfTgr0";
            strArr2[3] = "sqm3iAA5OiJF7R8ZxJPsoNc3WTf";
        }
    }
}
