package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.57, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass57 {
    public static java.lang.String[] A00 = {"X094Ff6hX91n4UOeNZ5q6xBODyRF", "3SZuvdCuB3BE6lfK5qku2XxobaMEdUie", "GC5CoEiK4nrbG2wHW0FtwppW4DiO", "wga3z1tjiA3hov6SpIvZwMukezgQNZlv", "3xUgR2JHsSdawQ9thG1dfHrpvR", "GYcoMrIBN4ZdBxcuGgG7c5lcAAiSjlKe", "4bECUaOSHZBdJ", ""};

    public static int A00(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C4Y c4y, android.view.View view, android.view.View view2, com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o, boolean z) {
        if (abstractC04344o.A0W() == 0) {
            return 0;
        }
        int iA03 = anonymousClass53.A03();
        if (A00[0].length() != 28) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A00;
        strArr[1] = "A1oAKfZoAPhZUsftVBl6ZIJw4txQWtbe";
        strArr[5] = "SaLVqq6GZrXjANh28rEV2dsKSTV0teZe";
        if (iA03 == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return java.lang.Math.abs(abstractC04344o.A0p(view) - abstractC04344o.A0p(view2)) + 1;
        }
        int iA0C = c4y.A0C(view2) - c4y.A0F(view);
        int extend = c4y.A0B();
        return java.lang.Math.min(extend, iA0C);
    }

    public static int A01(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C4Y c4y, android.view.View view, android.view.View view2, com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o, boolean z) {
        if (abstractC04344o.A0W() == 0 || anonymousClass53.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return anonymousClass53.A03();
        }
        int iA0C = c4y.A0C(view2) - c4y.A0F(view);
        int iA0p = abstractC04344o.A0p(view);
        int laidOutArea = abstractC04344o.A0p(view2);
        float fAbs = iA0C / (java.lang.Math.abs(iA0p - laidOutArea) + 1);
        int laidOutArea2 = anonymousClass53.A03();
        return (int) (fAbs * laidOutArea2);
    }

    public static int A02(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.C4Y c4y, android.view.View view, android.view.View view2, com.facebook.ads.redexgen.core.AbstractC04344o abstractC04344o, boolean z, boolean z2) {
        int laidOutArea;
        if (abstractC04344o.A0W() == 0 || anonymousClass53.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        int maxPosition = java.lang.Math.min(abstractC04344o.A0p(view), abstractC04344o.A0p(view2));
        int iA0p = abstractC04344o.A0p(view);
        int minPosition = abstractC04344o.A0p(view2);
        int iMax = java.lang.Math.max(iA0p, minPosition);
        if (z2) {
            int minPosition2 = anonymousClass53.A03();
            laidOutArea = java.lang.Math.max(0, (minPosition2 - iMax) - 1);
        } else {
            laidOutArea = java.lang.Math.max(0, maxPosition);
        }
        if (!z) {
            return laidOutArea;
        }
        int itemsBefore = c4y.A0C(view2);
        int minPosition3 = c4y.A0F(view);
        int maxPosition2 = java.lang.Math.abs(itemsBefore - minPosition3);
        int itemsBefore2 = abstractC04344o.A0p(view);
        int minPosition4 = abstractC04344o.A0p(view2);
        float fAbs = laidOutArea * (maxPosition2 / (java.lang.Math.abs(itemsBefore2 - minPosition4) + 1));
        int itemsBefore3 = c4y.A0A();
        int minPosition5 = c4y.A0F(view);
        return java.lang.Math.round(fAbs + (itemsBefore3 - minPosition5));
    }
}
