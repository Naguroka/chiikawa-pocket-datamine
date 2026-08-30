package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1314bm implements com.facebook.ads.redexgen.core.AnonymousClass17 {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"prnrxiqBIRUWmtrywfPqKqEQqhVy", "ZIMYOFT0ZsWMsvQaDuWdcBD1JUfFlpFK", "eDL3S9t0lib8FebdadRdAEhF6DEMjh5k", "bs6kAZMpX5XJVmB6S4pTEB090dM9ax0i", "QHqe8jS5x4PwEQqsnwl", "gxNXj6OyEOj3k7PGi9sSLvTTkEfltc4s", "tcOGThQLxe2W2uuyyUr03jLhoPapxorM", "Kh0wErWL647o91YILjhTKlO7bRERsR4e"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0681Fe A00;
    public final /* synthetic */ java.lang.Runnable A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 23);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A03[4].length() == 18) {
            throw new java.lang.RuntimeException();
        }
        A03[7] = "PFnJtf9LUj4qa4JPPUOTumvSeGZYJypM";
        A02 = new byte[]{15, 14, 15, 13, 14, 94, 0, 9, 118, 65, 83, 69, 86, 64, 65, 64, 4, 114, 77, 64, 65, 75, 4, 77, 73, 84, 86, 65, 87, 87, 77, 75, 74, 4, 66, 77, 86, 65, 64, 64, 65, 125, 74, 88, 78, 93, 75, 74, 75, 121, 70, 75, 74, 64, 110, 75, 99, 64, 72, 72, 70, 65, 72, 102, 66, 95, 93, 74, 92, 92, 70, 64, 65};
    }

    static {
        A01();
    }

    public C1314bm(com.facebook.ads.redexgen.core.C0681Fe c0681Fe, java.lang.Runnable runnable) {
        this.A00 = c0681Fe;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass17
    public final void ADO(com.facebook.ads.redexgen.core.AbstractC1345cH abstractC1345cH) {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass17
    public final void ADP(com.facebook.ads.redexgen.core.AbstractC1345cH abstractC1345cH) {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass17
    public final void ADQ(com.facebook.ads.redexgen.core.AbstractC1345cH abstractC1345cH) {
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass17
    public final void ADR(com.facebook.ads.redexgen.core.AbstractC1345cH abstractC1345cH) {
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A01 = abstractC1345cH;
        this.A00.A0K();
        if (this.A00.A07 != null) {
            this.A00.A07.A0F(abstractC1345cH);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass17
    public final void ADS(com.facebook.ads.redexgen.core.AbstractC1345cH abstractC1345cH) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(39, 34, 56), A00(8, 31, 51), A00(0, 8, 47));
        this.A00.A07.A0D();
        this.A00.A0N();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass17
    public final void ADT(com.facebook.ads.redexgen.core.AbstractC1345cH abstractC1345cH) {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass17
    public final void ADU(com.facebook.ads.redexgen.core.AbstractC1345cH abstractC1345cH, com.facebook.ads.AdError adError) {
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A0B.A0E().A5F(adError.getErrorCode(), adError.getErrorMessage());
        if (com.facebook.ads.AdError.AD_PRESENTATION_ERROR.equals(adError) && com.facebook.ads.redexgen.core.C0762Im.A1o(this.A00.A0B)) {
            this.A00.A07.A0G(com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.AD_PRESENTATION_ERROR));
        } else if (com.facebook.ads.AdError.NO_FILL.equals(adError)) {
            this.A00.A07.A0G(com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL));
        } else {
            this.A00.A07.A0G(com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR));
        }
        this.A00.A0P(abstractC1345cH);
        if (A03[7].charAt(7) != 'L') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A03;
        strArr[1] = "5mDNAkmPsKXxtvZqFgypt4QK4uBiUiuf";
        strArr[2] = "5tmiAUheAxojxdkmR27o6gIBrLCMojmA";
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass17
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A07.A09();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass17
    public final void onRewardedVideoClosed() {
        this.A00.A07.A0A();
    }
}
