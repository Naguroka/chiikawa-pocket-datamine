package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S8 {
    public static com.facebook.ads.redexgen.core.InterfaceC0991Ro A00;
    public static byte[] A01;
    public static final java.util.Set<java.lang.String> A02;
    public static final java.util.Set<java.lang.String> A03;
    public static final java.util.concurrent.atomic.AtomicBoolean A04;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{51, 114, 121, 9, 84, 69, 113, 55, 55, 120, 5, 112, 1, 25, 51, 18, 114, 47, 24, 117, 44, 46, 36, 43, 114, 40, 55, 48, 114, 21, 47, 51, 43, 125, 74, okio.Utf8.REPLACEMENT_BYTE, 96, 71, 122, 102, 66, 127, 106, 97, 126, 98, 39, 91, 97, 106, 72, 100, 122, 126, 62, 101, 90, 100, 35, 117, 94, 127, 49, 6, 81, 35, 43, 66, 103, 86, 39, 106, 95, 80, 119, 127, 122, 39, 97, 99, 103, 106, 98, 82, 86, 112, 105, 75, 92, 118, 82, 46, 25, 88, 115, 98, 97, 121, 100, 125, 127, 120, 113, 54, 116, 115, 112, 121, 100, 115, 54, 127, 120, 127, 98, 55, 83, 81, 83, 66, kotlin.io.encoding.Base64.padSymbol, 106, 101, 81, 105, 111, 64, 109, 32, 127, 106, 94, 89, 111, 101, 114, 94, 67, 62, 98, 123, 108, 70, 54, 1, 15, 7, 28, 30, 2, 15, 0, 11, 49, 3, 1, 10, 11, 49, 1, 0, 29, 22, 7, 4, 28, 1, 24, 33, 58, 15, 103, 18, 7, 59, 7, okio.Utf8.REPLACEMENT_BYTE, 22, 108, 5, 96, 3, 3, 0, 49, 22, 37, 26, 39, 19, 29, 109, 57, 51, 4, 104, 95};
    }

    static {
        A07();
        A02 = new java.util.HashSet();
        A03 = new java.util.HashSet();
        A02.add(A05(6, 29, 93));
        A03.add(A05(org.objectweb.asm.Opcodes.JSR, 29, 72));
        A03.add(A05(35, 29, 17));
        A03.add(A05(64, 29, 14));
        A03.add(A05(116, 29, 22));
        A04 = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public static com.facebook.ads.redexgen.core.InterfaceC0993Rq A00(com.facebook.ads.redexgen.core.C7j c7j) {
        return A03(true, c7j);
    }

    public static com.facebook.ads.redexgen.core.InterfaceC0993Rq A01(com.facebook.ads.redexgen.core.C7j c7j) {
        return A02(true, c7j);
    }

    public static com.facebook.ads.redexgen.core.InterfaceC0993Rq A02(boolean z, com.facebook.ads.redexgen.core.C7j c7j) {
        com.facebook.ads.redexgen.core.C0997Ru c0997Ru = new com.facebook.ads.redexgen.core.C0997Ru();
        com.facebook.ads.redexgen.core.C1000Rx networkModuleRequestConfigurationBuilder = A04(c7j);
        if (!A0B(c7j)) {
            c0997Ru.A02(A03);
            c0997Ru.A01(A02);
        }
        if (com.facebook.ads.redexgen.core.L7.A04()) {
            networkModuleRequestConfigurationBuilder.A08(com.facebook.ads.redexgen.core.L7.A02());
        }
        com.facebook.ads.redexgen.core.LF lfA00 = com.facebook.ads.redexgen.core.AbstractC0995Rs.A00();
        com.facebook.ads.redexgen.core.C0997Ru networkModuleConfigurationBuilder = c0997Ru.A00(networkModuleRequestConfigurationBuilder.A09());
        return lfA00.A00(networkModuleConfigurationBuilder.A03(z).A04(c7j.A04().A9O()).A05(), c7j.A07(), com.facebook.ads.redexgen.core.M8.A01());
    }

    public static com.facebook.ads.redexgen.core.InterfaceC0993Rq A03(boolean z, com.facebook.ads.redexgen.core.C7j c7j) {
        return com.facebook.ads.redexgen.core.AbstractC0995Rs.A00().A00(new com.facebook.ads.redexgen.core.C0997Ru().A03(z).A00(A04(c7j).A09()).A04(c7j.A04().A9O()).A05(), c7j.A07(), com.facebook.ads.redexgen.core.M8.A01());
    }

    public static com.facebook.ads.redexgen.core.C1000Rx A04(com.facebook.ads.redexgen.core.C7j c7j) {
        A08(c7j);
        com.facebook.ads.redexgen.core.C1000Rx c1000Rx = new com.facebook.ads.redexgen.core.C1000Rx();
        if (A0B(c7j) || com.facebook.ads.redexgen.core.L7.A04()) {
            c1000Rx.A02(360000).A04(com.unity3d.services.UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        } else {
            c1000Rx.A02(com.facebook.ads.redexgen.core.C0762Im.A09(c7j)).A04(com.facebook.ads.redexgen.core.C0762Im.A0B(c7j));
        }
        c1000Rx.A03(com.facebook.ads.redexgen.core.C0762Im.A0A(c7j)).A05(com.facebook.ads.redexgen.core.C0762Im.A0C(c7j)).A06(com.facebook.ads.redexgen.core.C0762Im.A0D(c7j));
        synchronized (com.facebook.ads.redexgen.core.S8.class) {
            if (A00 != null && (A00 instanceof com.facebook.ads.redexgen.core.InterfaceC0991Ro)) {
                c1000Rx.A07(A00);
            }
        }
        return c1000Rx;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(com.facebook.ads.redexgen.core.C7j c7j) {
        if (!A04.get()) {
            c7j.A07().AA0(A05(org.objectweb.asm.Opcodes.IF_ICMPLT, 7, 110), com.facebook.ads.redexgen.core.C8E.A21, new com.facebook.ads.redexgen.core.C8F(A05(93, 23, 11)));
        }
    }

    public static synchronized void A09(com.facebook.ads.redexgen.core.InterfaceC0991Ro interfaceC0991Ro) {
        A00 = interfaceC0991Ro;
    }

    public static boolean A0A(com.facebook.ads.redexgen.core.C7j c7j) {
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String strA05 = A05(org.objectweb.asm.Opcodes.I2B, 16, 115);
        if (i < 17) {
            return android.provider.Settings.System.getInt(c7j.getContentResolver(), strA05, 0) != 0;
        }
        return android.provider.Settings.Global.getInt(c7j.getContentResolver(), strA05, 0) != 0;
    }

    public static boolean A0B(com.facebook.ads.redexgen.core.C7j c7j) {
        java.lang.String strA8d = c7j.A04().A8d();
        if (!android.text.TextUtils.isEmpty(strA8d)) {
            java.lang.String urlPrefix = A05(3, 3, 58);
            if (!strA8d.endsWith(urlPrefix)) {
                java.lang.String urlPrefix2 = A05(0, 3, 0);
                if (strA8d.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
