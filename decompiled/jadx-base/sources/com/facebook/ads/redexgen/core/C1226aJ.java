package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1226aJ extends com.facebook.ads.redexgen.core.C04023h {
    public int A00;

    public C1226aJ(android.content.Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.C04023h, android.view.View
    public final void onMeasure(int i, int i2) {
        int h = this.A00;
        for (int i3 = 0; i3 < height; i3++) {
            android.view.View childAt = getChildAt(i3);
            int height = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            childAt.measure(i, height);
            int height2 = childAt.getMeasuredHeight();
            if (height2 > h) {
                h = height2;
            }
        }
        int height3 = android.view.View.MeasureSpec.makeMeasureSpec(h, 1073741824);
        super.onMeasure(i, height3);
    }
}
