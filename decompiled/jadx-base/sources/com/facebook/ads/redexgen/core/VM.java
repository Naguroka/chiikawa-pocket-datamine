package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VM extends com.facebook.ads.redexgen.core.AbstractC0853Mg {
    public final com.facebook.ads.redexgen.core.O5 A00;

    public VM(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.view.View.OnClickListener onClickListener) {
        super(c1199Zs, onClickListener);
        this.A00 = new com.facebook.ads.redexgen.core.O5(c1199Zs);
        addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    public final com.facebook.ads.redexgen.core.VM A0F(java.lang.String str) {
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A00, this.A01).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new com.facebook.ads.redexgen.core.VN(this)).A07(str);
        A0C();
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0853Mg
    public int getMediaViewId() {
        return this.A00.getId();
    }
}
