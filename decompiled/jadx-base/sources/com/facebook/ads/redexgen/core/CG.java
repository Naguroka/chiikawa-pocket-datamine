package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class CG extends com.facebook.ads.redexgen.core.C1260as {
    public static java.lang.String[] A01 = {"5vbH5h", "J", "C4GDfN5QjjsYSTm6MxZFmUsCMcA9wBBJ", "6VFwzkwOMMM2Di2Z85K5QmwqwgWhrd8W", "uhhUuQP5WsjWPtKrx", "v18Pv4VwePGedZr395LFzqQB6yfdWBSj", "eHjrumjSh1wPfIUStRl2rH8Zl9vSSm7d", "psLA63BrOeuZ89bQmrhMweOfIVNK7DGd"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.CD A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.C1260as
    public final int A0O(android.view.View view, int i) {
        com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344oA08 = A08();
        if (!abstractC04344oA08.A20()) {
            return 0;
        }
        com.facebook.ads.redexgen.core.C04354p c04354p = (com.facebook.ads.redexgen.core.C04354p) view.getLayoutParams();
        int iA0N = A0N(abstractC04344oA08.A0k(view) - c04354p.leftMargin, abstractC04344oA08.A0n(view) + c04354p.rightMargin, abstractC04344oA08.A0e(), abstractC04344oA08.A0h() - abstractC04344oA08.A0f(), i) + this.A00.A02;
        if (A01[0].length() != 6) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[6] = "LE8phwfR0RxAHMOOl0X9IEx3wOgwcDNd";
        strArr[7] = "Bj9ROfqsKQjGAcpCTsOWpU0U4DTJlpud";
        return iA0N;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CG(com.facebook.ads.redexgen.core.CD cd, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A00 = cd;
    }

    @Override // com.facebook.ads.redexgen.core.C1260as
    public final float A0J(android.util.DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.core.C1260as
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.C1260as
    public final android.graphics.PointF A0P(int i) {
        return this.A00.A4k(i);
    }
}
