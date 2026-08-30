package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class NF {
    public static java.lang.String[] A00 = {"B", "b", "N7Y4O4Xp0bXRpwQYmrnUbbD5XPNn0nfl", "PsTgqcCc8jcMoxm2RXWy1mA6rhf59", "zMLnehec4ICfDGOtTSDp3symXOGZpaRx", "AnvCnC9uV", "JoTWE5M61fQkMjrwCjPz5KG5vu8cqeKb", "O6aKPphMSjoWO4xDWlhiQ7T2kp0fs"};
    public static final int A01 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 200.0f);
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 200.0f);
    public static final int A02 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 50.0f);

    public static com.facebook.ads.redexgen.core.AnonymousClass13 A00(com.facebook.ads.NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return com.facebook.ads.redexgen.core.AnonymousClass13.A04;
        }
        if (A03(nativeAdLayout)) {
            return com.facebook.ads.redexgen.core.AnonymousClass13.A05;
        }
        return com.facebook.ads.redexgen.core.AnonymousClass13.A03;
    }

    public static com.facebook.ads.redexgen.core.NE A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, android.view.View view) {
        if (view == null) {
            return null;
        }
        int w = view.getWidth();
        int height = view.getHeight();
        if (w >= A01 && height >= A01) {
            return new com.facebook.ads.redexgen.core.V1(c1199Zs, j7, str);
        }
        if (w >= A03) {
            int i = A02;
            java.lang.String[] strArr = A00;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A00;
            strArr2[7] = "MXaU9iKOIfaGo19ccmM4SYJQh1BEv";
            strArr2[3] = "urarsFS1owFx4szCeqq2cq67A77KP";
            if (height >= i) {
                return new com.facebook.ads.redexgen.core.V2(c1199Zs, j7, str);
            }
        }
        return null;
    }

    public static com.facebook.ads.redexgen.core.V3 A02(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, com.facebook.ads.redexgen.core.C1Z c1z, com.facebook.ads.redexgen.core.MS ms, com.facebook.ads.redexgen.core.MR mr) {
        return new com.facebook.ads.redexgen.core.V3(c1199Zs, j7, str, c1z, ms, mr);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public static boolean A03(com.facebook.ads.NativeAdLayout nativeAdLayout) {
        int i;
        int h;
        int w;
        int w2;
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w3 = A01;
        if (width < w3) {
            i = A03;
            java.lang.String[] strArr = A00;
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[0];
            h = str.length();
            w = str2.length();
            if (h != w) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A00;
            strArr2[1] = "e";
            strArr2[0] = "I";
            if (width >= i) {
                w2 = A02;
                if (height < w2) {
                }
            }
            return true;
        }
        int w4 = A01;
        if (height < w4) {
            i = A03;
            java.lang.String[] strArr3 = A00;
            java.lang.String str3 = strArr3[1];
            java.lang.String str4 = strArr3[0];
            h = str3.length();
            w = str4.length();
            if (h != w) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr4 = A00;
            strArr4[1] = "e";
            strArr4[0] = "I";
            if (width >= i) {
                w2 = A02;
                if (height < w2) {
                }
            }
            return true;
        }
        return false;
    }
}
