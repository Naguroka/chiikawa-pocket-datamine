package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UE extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.MS {
    public static java.lang.String[] A03 = {"wtXzJScKRPxajxCcdRbPmb0KadlxC", "7nKoFE8ui8VEpuvPlBMmVCUEP2sqkB6T", "33CWdOtYDTa7rzeiAlLBu", "lc", "strpzcWL7DajPBiGDWIDQH24h3nkF6Q8", "KD2NqWHNK6oFw2qGkV253wUFP2DdgfCk", "fVTYPEGDbO1sEyo8c0rX1ThQbYeRG1Ca", "mBAzb1XhvrptTGzmv2edBpTADNq"};
    public java.lang.String A00;
    public final com.facebook.ads.redexgen.core.MR A01;
    public final com.facebook.ads.redexgen.core.C0926Pb A02;

    public UE(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0926Pb c0926Pb, java.lang.String str) {
        super(c1199Zs);
        this.A02 = c0926Pb;
        this.A01 = mr;
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void A9q(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        com.facebook.ads.redexgen.core.C0926Pb.A0B().incrementAndGet();
        this.A02.A0V();
        com.facebook.ads.redexgen.core.M3.A0J(this.A02.A0O());
        addView(this.A02.A0O(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.A01.A3q(this, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ACz(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void ADN(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void AFx(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public java.lang.String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().AC4();
        }
        java.util.concurrent.atomic.AtomicInteger atomicIntegerA0B = com.facebook.ads.redexgen.core.C0926Pb.A0B();
        java.lang.String[] strArr = A03;
        if (strArr[7].length() == strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[7] = "U60adJ6O15pnx6aeoiW8dFURNXF";
        strArr2[0] = "aGZEm4xR2YGCAhvP8isAV9os5hRSz";
        atomicIntegerA0B.decrementAndGet();
    }

    public void setListener(com.facebook.ads.redexgen.core.MR mr) {
    }
}
