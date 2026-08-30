package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FZ extends com.facebook.ads.redexgen.core.C1270b2 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"VY80zOaYPxkOtyUrTAwyx7zC77lFdeof", "qJYWmvtZwfwBqccNWJcDxq0wxgEd", "0lF9l2PIa0G", "8HUI8rnTM6nJrcfosCRNO8OvNswxKEJA", "TWKnH1rmbYSUhH4KNgSY2AsRWoqO1pqp", "o5QSN7NKgyovRW2", "W85", "rhxQt59st5mNUHdFmf4JU2hKMVhH4nOT"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 44);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-101, -33, -22, -32, -18, -101, -23, -22, -17, -101, -28, -24, -21, -25, -32, -24, -32, -23, -17, -101, -28, -23, -17, -32, -19, -31, -36, -34, -32, -101, -24, -32, -17, -29, -22, -33, -101, -22, -23, -55, -32, -18, -17, -32, -33, -63, -25, -28, -23, -30, 101, -87, -76, -86, -72, 101, -77, -76, -71, 101, -82, -78, -75, -79, -86, -78, -86, -77, -71, 101, -82, -77, -71, -86, -73, -85, -90, -88, -86, 101, -78, -86, -71, -83, -76, -87, 101, -76, -77, -109, -86, -72, -71, -86, -87, -107, -73, -86, -117, -79, -82, -77, -84, 84, -104, -93, -103, -89, 84, -94, -93, -88, 84, -99, -95, -92, -96, -103, -95, -103, -94, -88, 84, -99, -94, -88, -103, -90, -102, -107, -105, -103, 84, -95, -103, -88, -100, -93, -104, 84, -93, -94, -126, -103, -89, -88, -103, -104, -124, -90, -103, -121, -105, -90, -93, -96, -96, -127, -59, -48, -58, -44, -127, -49, -48, -43, -127, -54, -50, -47, -51, -58, -50, -58, -49, -43, -127, -54, -49, -43, -58, -45, -57, -62, -60, -58, -127, -50, -58, -43, -55, -48, -59, -127, -48, -49, -81, -58, -44, -43, -58, -59, -76, -60, -45, -48, -51, -51, -66, 2, 13, 3, 17, -66, 12, 13, 18, -66, 7, 11, 14, 10, 3, 11, 3, 12, 18, -66, 7, 12, 18, 3, 16, 4, -1, 1, 3, -66, 11, 3, 18, 6, 13, 2, -66, 13, 12, -20, 3, 17, 18, 3, 2, -15, 1, 16, 13, 10, 10, -33, 1, 1, 3, 14, 18, 3, 2, -106, -38, -27, -37, -23, -106, -28, -27, -22, -106, -33, -29, -26, -30, -37, -29, -37, -28, -22, -106, -33, -28, -22, -37, -24, -36, -41, -39, -37, -106, -29, -37, -22, -34, -27, -38, -106, -27, -28, -55, -22, -41, -24, -22, -60, -37, -23, -22, -37, -38, -55, -39, -24, -27, -30, -30, -84, -16, -5, -15, -1, -84, -6, -5, 0, -84, -11, -7, -4, -8, -15, -7, -15, -6, 0, -84, -11, -6, 0, -15, -2, -14, -19, -17, -15, -84, -7, -15, 0, -12, -5, -16, -84, -5, -6, -33, 0, -5, -4, -38, -15, -1, 0, -15, -16, -33, -17, -2, -5, -8, -8, -36, -17, -21, -3, -42, -25, -8, -21, -12, -6, -90, -25, -6, -10, 8, -31, -14, 3, -10, -1, 5, -44, 0, -2, 1, -14, 5};
        if (A01[3].charAt(4) != '8') {
            throw new java.lang.RuntimeException();
        }
        A01[3] = "0rHD8iYFkM5KLcEdxbz1wO1gXSem16M8";
        A00 = bArr;
    }

    static {
        A02();
    }

    @Override // com.facebook.ads.redexgen.core.C04033i
    public final void A03(android.view.ViewParent viewParent, android.view.View view) {
        try {
            viewParent.onStopNestedScroll(view);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e(A01(389, 16, 101), A01(378, 11, 90) + viewParent + A01(323, 55, 96), e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C04033i
    public final void A04(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int i3, int i4) {
        try {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e(A01(389, 16, 101), A01(378, 11, 90) + viewParent + A01(157, 51, 53), e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C04033i
    public final void A05(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int[] iArr) {
        try {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e(A01(389, 16, 101), A01(378, 11, 90) + viewParent + A01(103, 54, 8), e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C04033i
    public final void A06(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i) {
        try {
            viewParent.onNestedScrollAccepted(view, view2, i);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e(A01(389, 16, 101), A01(378, 11, 90) + viewParent + A01(208, 59, 114), e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C04033i
    public final boolean A07(android.view.ViewParent viewParent, android.view.View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e(A01(389, 16, 101), A01(378, 11, 90) + viewParent + A01(50, 53, 25), e);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.C04033i
    public final boolean A08(android.view.ViewParent viewParent, android.view.View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e(A01(389, 16, 101), A01(378, 11, 90) + viewParent + A01(0, 50, 79), e);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.C04033i
    public final boolean A09(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i) {
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e(A01(389, 16, 101), A01(378, 11, 90) + viewParent + A01(267, 56, 74), e);
            return false;
        }
    }
}
