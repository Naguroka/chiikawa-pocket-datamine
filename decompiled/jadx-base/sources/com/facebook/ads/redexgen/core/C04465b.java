package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04465b {
    public static java.lang.String[] A00 = {"9O", "28H1kjICyCSP", "QKFmg3qmSW84YfLR5DXewrEtWZ47Hzy", "P", "Em", "YyES7HR0UsWs", "rGxFrAuyTsOha0QpVFZkpdTTHXBTZM0k", "CeAnScf1I32vhT13KQ6XZJy"};

    public static com.facebook.ads.redexgen.core.C0S A00(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC05017l interfaceC05017l) {
        return A01(context, interfaceC05017l, null);
    }

    public static com.facebook.ads.redexgen.core.C0S A01(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC05017l interfaceC05017l, java.lang.String str) {
        com.facebook.ads.redexgen.core.C1198Zr sdkContext = A09(context);
        com.facebook.ads.redexgen.core.C0W c0wA7V = interfaceC05017l.A7V(sdkContext);
        if (c0wA7V != null) {
            return str != null ? c0wA7V.AAj(str) : c0wA7V.AAi();
        }
        return new com.facebook.ads.redexgen.core.C1378co();
    }

    public static com.facebook.ads.redexgen.core.C1199Zs A02(android.app.Activity activity) {
        return new com.facebook.ads.redexgen.core.C1199Zs(activity, (com.facebook.ads.redexgen.core.InterfaceC05017l) A0A(), A00(activity, A0A()));
    }

    public static com.facebook.ads.redexgen.core.C1199Zs A03(android.content.Context context) {
        return new com.facebook.ads.redexgen.core.C1199Zs(context, A0A(), new com.facebook.ads.redexgen.core.C1378co());
    }

    public static com.facebook.ads.redexgen.core.C1199Zs A04(android.content.Context context) {
        if (com.facebook.ads.redexgen.core.C0762Im.A0t(context)) {
            return new com.facebook.ads.redexgen.core.C1199Zs(context, A0A(), A00(context, A0A()));
        }
        com.facebook.ads.redexgen.core.C1199Zs c1199ZsA03 = A03(context);
        if (A00[2].length() == 11) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A00;
        strArr[3] = "B";
        strArr[7] = "J1bgC2YpAkuTguvKBul5HQJ";
        return c1199ZsA03;
    }

    public static com.facebook.ads.redexgen.core.C1199Zs A05(android.content.Context context, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C1199Zs(context, A0A(), A01(context, A0A(), str));
    }

    public static com.facebook.ads.redexgen.core.C1199Zs A06(android.content.Context context, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C1199Zs(context, A0A(), A01(context, A0A(), str));
    }

    public static com.facebook.ads.redexgen.core.C1199Zs A07(android.content.Context context, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C1199Zs(context, A0A(), A01(context, A0A(), str));
    }

    public static com.facebook.ads.redexgen.core.C0669Ei A08(android.content.Context context) {
        return new com.facebook.ads.redexgen.core.C0669Ei(context, A0A(), A0A().A7V(A09(context)));
    }

    public static com.facebook.ads.redexgen.core.C1198Zr A09(android.content.Context context) {
        return new com.facebook.ads.redexgen.core.C1198Zr(context, A0A());
    }

    public static synchronized com.facebook.ads.redexgen.core.ZQ A0A() {
        return com.facebook.ads.redexgen.core.ZQ.A02();
    }
}
