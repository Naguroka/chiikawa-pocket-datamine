package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QE {
    public final int[] A00(android.view.View view, int i, int i2) {
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        int childHeightSpec = android.view.ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), c04354p.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, android.view.ViewGroup.getChildMeasureSpec(i2, childWidthSpec + view.getPaddingBottom(), c04354p.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c04354p.leftMargin + c04354p.rightMargin, childWidthSpec3 + c04354p.bottomMargin + c04354p.topMargin};
    }
}
