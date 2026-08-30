package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7V extends com.facebook.ads.redexgen.core.AbstractC1015Sm {
    public static java.lang.String[] A04 = {"hk0dnqphYZ0B2FA2HHbeoaEOUC9cHUBv", "tTD1hmxYdA3U5n9t8Z20NsAIS", "BfpeWRttIDT9n", "BdF5VvNpfNEd8dAFz8yBB3tju8j2QPKu", "opIRFI8OjkHX6xnIsWRzCqWD0", "Ob0oYr4gU4dgC4EVWukqT8XlG8BtSCcB", "HPuRIIJ62FmEL4YF0ip1f4WrSa12U9bK", "7SB"};
    public final android.widget.ImageView A00;
    public final com.facebook.ads.redexgen.core.C1199Zs A01;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.C9R> A02;
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.SZ> A03;

    public C7V(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A03 = new com.facebook.ads.redexgen.core.C0889Nq(this);
        this.A02 = new com.facebook.ads.redexgen.core.NH(this);
        this.A01 = c1199Zs;
        this.A00 = new android.widget.ImageView(c1199Zs);
        this.A00.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.facebook.ads.redexgen.core.M3.A0M(this.A00, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.A00.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1015Sm
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            com.facebook.ads.redexgen.core.C05338w<com.facebook.ads.redexgen.core.AbstractC05348x, com.facebook.ads.redexgen.core.C05328v> eventBus = getVideoView().getEventBus();
            com.facebook.ads.redexgen.core.AbstractC05348x[] abstractC05348xArr = new com.facebook.ads.redexgen.core.AbstractC05348x[2];
            java.lang.String[] strArr = A04;
            if (strArr[3].charAt(25) != strArr[5].charAt(25)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[7] = "Nqq";
            strArr2[2] = "4efeQvUmAeHBj";
            abstractC05348xArr[0] = this.A03;
            abstractC05348xArr[1] = this.A02;
            eventBus.A03(abstractC05348xArr);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1015Sm
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A00.layout(0, 0, i3 - i, i4 - i2);
    }

    public void setImage(java.lang.String str) {
        setImage(str, null);
    }

    public void setImage(java.lang.String str, com.facebook.ads.redexgen.core.O7 o7) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        com.facebook.ads.redexgen.core.AsyncTaskC1068Un downloadImageTask = new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A00, this.A01).A04();
        if (o7 != null) {
            downloadImageTask.A06(o7);
        }
        downloadImageTask.A07(str);
    }
}
