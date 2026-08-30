package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0904Of {
    public static float A00(com.facebook.ads.redexgen.core.C1F c1f) {
        int height = c1f.A0E().A01();
        int width = c1f.A0E().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        int availableWidth = (int) (((double) (com.facebook.ads.redexgen.core.LO.A00().widthPixels - (com.facebook.ads.redexgen.core.AbstractC0907Oi.A07 * 2))) / d);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = com.facebook.ads.redexgen.core.M3.A01(16);
        int ctaTextHeight = com.facebook.ads.redexgen.core.OL.A0B;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = com.facebook.ads.redexgen.core.AbstractC0907Oi.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = com.facebook.ads.redexgen.core.LO.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static com.facebook.ads.redexgen.core.ViewOnClickListenerC0903Oe A03(com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.ViewOnClickListenerC0903Oe(viewOnClickListenerC1063Ui, str);
    }

    public static boolean A04(double d) {
        return d < 0.9d;
    }

    public static boolean A05(double d, int i) {
        return A02(i) < A01(d);
    }

    public static boolean A06(int i, int i2, double d) {
        return i == 2 || A05(d, i2);
    }
}
