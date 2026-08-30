package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05138c {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static java.lang.String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final java.util.concurrent.atomic.AtomicBoolean A04;
    public static final java.util.concurrent.atomic.AtomicBoolean A05;
    public static final java.util.concurrent.atomic.AtomicBoolean A06;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 33);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-87, -40, -42, -84, -41, -86, -87, -41, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, 13, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, 14, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new java.util.concurrent.atomic.AtomicBoolean();
        A04 = new java.util.concurrent.atomic.AtomicBoolean();
        A05 = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public static com.facebook.ads.redexgen.core.C1183Zc A00() {
        return new com.facebook.ads.redexgen.core.C1183Zc();
    }

    public static com.facebook.ads.redexgen.core.C1182Zb A01(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        return new com.facebook.ads.redexgen.core.C1182Zb(c1198Zr);
    }

    public static void A04(com.facebook.ads.AudienceNetworkAds.InitListener initListener, com.facebook.ads.AudienceNetworkAds.InitResult initResult) {
        com.facebook.ads.redexgen.core.ExecutorC0844Lx.A01.execute(new com.facebook.ads.redexgen.core.C1184Zd(initListener, initResult));
    }

    public static void A06(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (com.facebook.ads.redexgen.core.Io.A0P(c1198Zr) && !A05.getAndSet(true)) {
            try {
                java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new com.facebook.ads.redexgen.core.AnonymousClass84(java.lang.Thread.getDefaultUncaughtExceptionHandler(), c1198Zr, new com.facebook.ads.redexgen.core.ZZ());
                java.lang.Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (java.lang.Exception e) {
                c1198Zr.A07().AA0(A02(org.objectweb.asm.Opcodes.IFNULL, 7, 78), com.facebook.ads.redexgen.core.C8E.A1X, new com.facebook.ads.redexgen.core.C8F(e));
            }
        }
    }

    public static void A07(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        A0H(c1198Zr, null, null, 3);
    }

    public static void A08(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        A0H(c1198Zr, null, null, 3);
    }

    public static void A09(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (com.facebook.ads.redexgen.core.C0762Im.A2D(c1198Zr)) {
            A0F(c1198Zr, 0);
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A2L(c1198Zr)) {
            A0B(c1198Zr);
        }
    }

    public static void A0A(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (com.facebook.ads.redexgen.core.C0762Im.A2E(c1198Zr)) {
            java.lang.String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c1198Zr, null, 3);
        }
    }

    public static void A0B(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        com.facebook.ads.redexgen.core.M8.A06.execute(new com.facebook.ads.redexgen.core.C1185Ze(c1198Zr));
    }

    public static void A0C(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        com.facebook.ads.redexgen.core.C2B.A02(c1198Zr);
        com.facebook.ads.redexgen.core.AnonymousClass88.A0C(c1198Zr, new com.facebook.ads.redexgen.core.ZY(c1198Zr), new com.facebook.ads.redexgen.core.C1189Zi(), com.facebook.ads.internal.api.BuildConfigApi.isDebug());
        c1198Zr.A09();
        A0D(c1198Zr);
    }

    public static void A0D(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        android.content.SharedPreferences sharedPreferences = com.facebook.ads.internal.dynamicloading.FlashPreferences.getSharedPreferences(c1198Zr);
        java.lang.String string = sharedPreferences.getString(A02(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 12, 121), null);
        java.lang.String string2 = sharedPreferences.getString(A02(239, 11, 116), null);
        if (string != null && string2 != null) {
            com.facebook.ads.redexgen.core.C8D c8dA07 = c1198Zr.A07();
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(string2);
            java.lang.String flashConfig = A02(org.objectweb.asm.Opcodes.PUTFIELD, 5, 63);
            c8dA07.AAS(flashConfig, 3701, c8f);
        }
    }

    public static void A0F(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, int i) {
        com.facebook.ads.redexgen.core.AbstractC04997i.A01(c1198Zr);
        if (A04.getAndSet(true)) {
            return;
        }
        if (com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild() || com.facebook.ads.internal.settings.AdInternalSettings.isDebuggerOn()) {
            com.facebook.ads.redexgen.core.AbstractC0792Ju.A02();
        }
        A06(c1198Zr);
        com.facebook.ads.redexgen.core.AbstractC0799Kb.A00(com.facebook.ads.redexgen.core.C0762Im.A0n(c1198Zr), com.facebook.ads.internal.api.BuildConfigApi.isDebug(), A00(), A01(c1198Zr));
        com.facebook.ads.redexgen.core.C6Q.A03(com.facebook.ads.redexgen.core.C0762Im.A04(c1198Zr));
        if (!com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            com.facebook.ads.redexgen.core.S8.A09(new com.facebook.ads.redexgen.core.C1181Za(c1198Zr));
        }
        if (i == 3) {
            android.util.Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c1198Zr.A07().AAS(A02(org.objectweb.asm.Opcodes.GETSTATIC, 3, 6), com.facebook.ads.redexgen.core.C8E.A0R, new com.facebook.ads.redexgen.core.C8F(A02(215, 24, 67)));
        }
        com.facebook.ads.internal.util.activity.ActivityUtils.A04(c1198Zr, com.facebook.ads.AudienceNetworkActivity.class);
        com.facebook.ads.redexgen.core.M8.A05(c1198Zr);
        com.facebook.ads.redexgen.core.JI.A05(c1198Zr);
        com.facebook.ads.redexgen.core.C03390w.A01(c1198Zr);
        if (com.facebook.ads.redexgen.core.C0762Im.A11(c1198Zr)) {
            com.facebook.ads.redexgen.core.C5J.A00(c1198Zr);
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(c1198Zr)) {
            com.facebook.ads.redexgen.core.ZQ.A02().A8G(c1198Zr);
        }
    }

    public static void A0G(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.AudienceNetworkAds.InitListener initListener, int i) {
        com.facebook.ads.redexgen.core.AbstractC04997i.A01(c1198Zr);
        boolean z = false;
        synchronized (com.facebook.ads.redexgen.core.C05138c.class) {
            boolean execute = A00;
            if (!execute) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z = true;
                        }
                    }
                } else {
                    A00 = true;
                    z = true;
                }
            }
        }
        if (z) {
            A0F(c1198Zr, i);
            com.facebook.ads.redexgen.core.M8.A08.execute(new com.facebook.ads.redexgen.core.C1186Zf(c1198Zr, initListener));
        } else {
            if (i != 1) {
                return;
            }
            java.lang.String strA02 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new com.facebook.ads.redexgen.core.C05128b(true, strA02));
            } else {
                android.util.Log.w(A02(8, 17, 99), strA02);
            }
        }
    }

    public static void A0H(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper, com.facebook.ads.AudienceNetworkAds.InitListener initListener, int i) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A02(com.ironsource.g3.c.b.INSTANCE_AUCTION_SUCCESS, 10, 115), A02(25, 26, 52), A02(0, 8, 82));
        com.facebook.ads.redexgen.core.S8.A06();
        A0G(c1198Zr, initListener, i);
    }

    public static synchronized boolean A0I() {
        return A00;
    }
}
