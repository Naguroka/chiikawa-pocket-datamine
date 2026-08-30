package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1272b5 implements com.facebook.ads.redexgen.core.C3D {
    public static java.lang.String[] A02 = {"gru2Lda4S7GCbNBLtOIdQEnlbYeRFwfL", "XnGCgKT7Pg2", "mKUX8sgZfunspLF5wjmFH8sDBtb3K48d", "jKk7kH4cQGBiDg5TKe33YqGV3AsPygQR", "TZdQK9usf81OKXIWMb61JsmxOZFMnA3k", "eyC2dzaRwXiJKVGsgdgz1meLL5sRgImY", "S4mkNNYHIh7xNNZ0OEskqLhCY0hDyySt", "ZXfiglEYlIOoTIuj216uQxYNuz12aQjw"};
    public final android.graphics.Rect A00 = new android.graphics.Rect();
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04023h A01;

    public C1272b5(com.facebook.ads.redexgen.core.C04023h c04023h) {
        this.A01 = c04023h;
    }

    @Override // com.facebook.ads.redexgen.core.C3D
    public final com.facebook.ads.redexgen.core.C04053k ABA(android.view.View view, com.facebook.ads.redexgen.core.C04053k c04053k) {
        com.facebook.ads.redexgen.core.C04053k c04053kA06 = com.facebook.ads.redexgen.core.C3T.A06(view, c04053k);
        if (c04053kA06.A07()) {
            return c04053kA06;
        }
        android.graphics.Rect rect = this.A00;
        rect.left = c04053kA06.A03();
        rect.top = c04053kA06.A05();
        rect.right = c04053kA06.A04();
        rect.bottom = c04053kA06.A02();
        int count = this.A01.getChildCount();
        for (int i = 0; i < count; i++) {
            com.facebook.ads.redexgen.core.C04053k c04053kA05 = com.facebook.ads.redexgen.core.C3T.A05(this.A01.getChildAt(i), c04053kA06);
            rect.left = java.lang.Math.min(c04053kA05.A03(), rect.left);
            rect.top = java.lang.Math.min(c04053kA05.A05(), rect.top);
            rect.right = java.lang.Math.min(c04053kA05.A04(), rect.right);
            rect.bottom = java.lang.Math.min(c04053kA05.A02(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        if (A02[1].length() != 11) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[6] = "4mRHs0uPE72ppwyI9I2NgTpzqE63n9j5";
        strArr[2] = "Zp0DshFYJF7gm0rY227qRNMYobzVhEjB";
        com.facebook.ads.redexgen.core.C04053k applied = c04053kA06.A06(i2, i3, i4, i5);
        return applied;
    }
}
