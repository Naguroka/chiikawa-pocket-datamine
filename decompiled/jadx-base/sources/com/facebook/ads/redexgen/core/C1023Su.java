package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1023Su extends com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.C9R> {
    public static java.lang.String[] A01 = {"Xm4oO1fgaoMOjj45N8r00LATVp4gHrYG", "MO5WiyOQHdAIBAUWSCIdsXDipyRYP8jB", "8ZD7midsUGLLHTawsvmUwyHXKE63ocNK", "eXsxAyUW", "", "KTVY2IhXiCn688zdyYvQYy9fTV", "AuZpLEz4ubgydEKdqdaVeIvdhtRZUWrW", "O3ESmZOEeO27LGblO6LyKeoijHa02l1o"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C9S A00;

    public C1023Su(com.facebook.ads.redexgen.core.C9S c9s) {
        this.A00 = c9s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
        int iA00 = c9r.A00();
        int duration = c9r.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && iA00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = iA00 + 500;
        if (duration < currentPosition3) {
            if (duration == 0) {
                com.facebook.ads.redexgen.core.C9S c9s = this.A00;
                int currentPosition4 = this.A00.A00;
                c9s.A0i(currentPosition4);
                return;
            }
            this.A00.A0i(duration);
            return;
        }
        com.facebook.ads.redexgen.core.C9S c9s2 = this.A00;
        java.lang.String[] strArr = A01;
        java.lang.String str = strArr[7];
        java.lang.String str2 = strArr[0];
        int duration2 = str.charAt(6);
        int currentPosition5 = str2.charAt(6);
        if (duration2 == currentPosition5) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[5] = "eYEuq0G9XeIp1YNIhTPdTiyuyz";
        strArr2[3] = "ZD2QUH1g";
        c9s2.A0i(iA00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC05348x
    public final java.lang.Class<com.facebook.ads.redexgen.core.C9R> A01() {
        return com.facebook.ads.redexgen.core.C9R.class;
    }
}
