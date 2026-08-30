package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0602Bq extends com.facebook.ads.redexgen.core.T7 {
    public C0602Bq(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int newWidthSpec = android.view.View.MeasureSpec.getMode(i);
        if (newWidthSpec == 1073741824) {
            i2 = i;
        } else {
            int newWidthSpec2 = android.view.View.MeasureSpec.getMode(i2);
            if (newWidthSpec2 == 1073741824) {
                i = i2;
            }
        }
        super.onMeasure(i, i2);
    }
}
