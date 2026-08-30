package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TI extends com.facebook.ads.redexgen.core.OV {
    public final android.widget.ImageView A00;
    public final com.facebook.ads.redexgen.core.C1199Zs A01;

    public TI(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A01 = c1199Zs;
        this.A00 = new android.widget.ImageView(c1199Zs);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(java.lang.String str) {
        com.facebook.ads.redexgen.core.AsyncTaskC1068Un downloadImageTask = new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
