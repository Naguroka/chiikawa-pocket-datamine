package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C3T {
    public static final com.facebook.ads.redexgen.core.C3S A00;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            A00 = new com.facebook.ads.redexgen.core.C03210d() { // from class: com.facebook.ads.redexgen.X.0U
            };
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            A00 = new com.facebook.ads.redexgen.core.C03210d();
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            A00 = new com.facebook.ads.redexgen.core.C1D();
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            A00 = new com.facebook.ads.redexgen.core.C03541l();
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            A00 = new com.facebook.ads.redexgen.core.C03692a();
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            A00 = new com.facebook.ads.redexgen.core.C3I();
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            A00 = new com.facebook.ads.redexgen.core.C04846o();
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            A00 = new com.facebook.ads.redexgen.core.C0677Fa();
        } else if (android.os.Build.VERSION.SDK_INT >= 15) {
            A00 = new com.facebook.ads.redexgen.core.C1273b6();
        } else {
            A00 = new com.facebook.ads.redexgen.core.C3S();
        }
    }

    public static int A00(android.view.View view) {
        return A00.A03(view);
    }

    public static int A01(android.view.View view) {
        return A00.A04(view);
    }

    public static int A02(android.view.View view) {
        return A00.A05(view);
    }

    public static int A03(android.view.View view) {
        return A00.A06(view);
    }

    public static android.view.Display A04(android.view.View view) {
        return A00.A07(view);
    }

    public static com.facebook.ads.redexgen.core.C04053k A05(android.view.View view, com.facebook.ads.redexgen.core.C04053k c04053k) {
        return A00.A08(view, c04053k);
    }

    public static com.facebook.ads.redexgen.core.C04053k A06(android.view.View view, com.facebook.ads.redexgen.core.C04053k c04053k) {
        return A00.A09(view, c04053k);
    }

    public static void A07(android.view.View view) {
        A00.A0A(view);
    }

    public static void A08(android.view.View view) {
        A00.A0B(view);
    }

    public static void A09(android.view.View view, int i) {
        A00.A0C(view, i);
    }

    public static void A0A(android.view.View view, android.graphics.drawable.Drawable drawable) {
        A00.A0D(view, drawable);
    }

    public static void A0B(android.view.View view, com.facebook.ads.redexgen.core.AnonymousClass37 anonymousClass37) {
        A00.A0E(view, anonymousClass37);
    }

    public static void A0C(android.view.View view, com.facebook.ads.redexgen.core.C3D c3d) {
        A00.A0F(view, c3d);
    }

    public static void A0D(android.view.View view, java.lang.Runnable runnable) {
        A00.A0G(view, runnable);
    }

    public static void A0E(android.view.View view, java.lang.Runnable runnable, long j) {
        A00.A0H(view, runnable, j);
    }

    public static boolean A0F(android.view.View view) {
        return A00.A0K(view);
    }

    public static boolean A0G(android.view.View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(android.view.View view) {
        return A00.A0J(view);
    }
}
