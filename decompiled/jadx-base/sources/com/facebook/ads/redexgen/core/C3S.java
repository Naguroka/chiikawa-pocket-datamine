package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3S {
    public static java.lang.reflect.Field A00;
    public static boolean A01;
    public static java.lang.reflect.Field A02;
    public static java.lang.reflect.Field A03;
    public static boolean A04;
    public static boolean A05;
    public static byte[] A06;
    public static java.lang.String[] A07 = {"02HXzqXk73QVshK", "Vd3PIQVGbymKr1peOQp46bHqBe5g9xLl", "HcoaSp9EGPDRlMz", "LE49K9mUXs4bvL0Dhr0uWsVmH5LUwBm4", "LDPLoHz6UrHGmx6GMbvpIivkJ6REIOLV", "AJsKzOma0c3h", "nSSDOEXzoGvtoIqz4QDa0TtkmnPlbH1G", "jHxdDI4CDuwq"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 29);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-28, -72, -38, -38, -36, -22, -22, -32, -39, -32, -29, -32, -21, -16, -69, -36, -29, -36, -34, -40, -21, -36, -94, -126, -98, -93, 125, -102, -98, -100, -99, -87, -109, 115, -113, -108, 125, -113, -118, -102, -114, -32, -46, -41, -51, -40, -32};
    }

    static {
        A02();
        A01 = false;
    }

    private final long A00() {
        return android.animation.ValueAnimator.getFrameDelay();
    }

    public int A03(android.view.View view) {
        return 0;
    }

    public int A04(android.view.View view) {
        return 0;
    }

    public int A05(android.view.View view) {
        if (!A04) {
            try {
                A02 = android.view.View.class.getDeclaredField(A01(22, 10, 24));
                A02.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
            }
            A04 = true;
        }
        if (A02 != null) {
            try {
                return ((java.lang.Integer) A02.get(view)).intValue();
            } catch (java.lang.Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public int A06(android.view.View view) {
        if (!A05) {
            try {
                A03 = android.view.View.class.getDeclaredField(A01(32, 9, 9));
                A03.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
            }
            A05 = true;
        }
        if (A03 != null) {
            try {
                return ((java.lang.Integer) A03.get(view)).intValue();
            } catch (java.lang.Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public android.view.Display A07(android.view.View view) {
        if (A0J(view)) {
            java.lang.Object systemService = view.getContext().getSystemService(A01(41, 6, 76));
            if (A07[1].charAt(22) != 'H') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A07;
            strArr[7] = "dM00LoaEDvCF";
            strArr[5] = "OddPVl80Vy9V";
            return ((android.view.WindowManager) systemService).getDefaultDisplay();
        }
        return null;
    }

    public com.facebook.ads.redexgen.core.C04053k A08(android.view.View view, com.facebook.ads.redexgen.core.C04053k c04053k) {
        return c04053k;
    }

    public com.facebook.ads.redexgen.core.C04053k A09(android.view.View view, com.facebook.ads.redexgen.core.C04053k c04053k) {
        return c04053k;
    }

    public void A0A(android.view.View view) {
        view.postInvalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0B(android.view.View view) {
        if (view instanceof com.facebook.ads.redexgen.core.C3A) {
            ((com.facebook.ads.redexgen.core.C3A) view).stopNestedScroll();
        }
    }

    public void A0C(android.view.View view, int i) {
    }

    public void A0D(android.view.View view, android.graphics.drawable.Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public final void A0E(android.view.View view, com.facebook.ads.redexgen.core.AnonymousClass37 anonymousClass37) {
        view.setAccessibilityDelegate(anonymousClass37 == null ? null : anonymousClass37.A00());
    }

    public void A0F(android.view.View view, com.facebook.ads.redexgen.core.C3D c3d) {
    }

    public void A0G(android.view.View view, java.lang.Runnable runnable) {
        view.postDelayed(runnable, A00());
    }

    public void A0H(android.view.View view, java.lang.Runnable runnable, long j) {
        view.postDelayed(runnable, A00() + j);
    }

    public boolean A0I(android.view.View view) {
        return false;
    }

    public boolean A0J(android.view.View view) {
        return view.getWindowToken() != null;
    }

    public final boolean A0K(android.view.View view) {
        if (A01) {
            return false;
        }
        java.lang.reflect.Field field = A00;
        if (A07[6].charAt(21) == 'T') {
            A07[1] = "Q1ruOHxOk6WILPvKf2GjHGHRzmp539Hk";
            if (field == null) {
                try {
                    A00 = android.view.View.class.getDeclaredField(A01(0, 22, 90));
                    A00.setAccessible(true);
                } catch (java.lang.Throwable unused) {
                    A01 = true;
                    if (A07[6].charAt(21) == 'T') {
                        java.lang.String[] strArr = A07;
                        strArr[0] = "nDS37f2fXP1nkU7";
                        strArr[2] = "CEc31ZmnNMQB0dp";
                        return false;
                    }
                }
            }
            try {
                return A00.get(view) != null;
            } catch (java.lang.Throwable unused2) {
                A01 = true;
                return false;
            }
        }
        throw new java.lang.RuntimeException();
    }
}
