package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC05308t {
    public static java.lang.String A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"qZcb6NmBns1n3v1", "rTLETUx3xNnjwSb02Sx6jVZM5Fuzg7Of", "ujF8Yx1ooHYTWOANWsLoHgp9GHsWq5OG", "emoc9RIZRY17k1iV3jHEmbNdIKvpuqWe", "9dj0hHqqeHaqkXambHAPXjsskYxWzSoy", "H6Wp9lsP8ocDK9Bk7hE2Cfl7XjXVKK5i", "baRwZ59Bd0PN8tFBdjuxnLHZSOlJTNRT", "2xLvEFwTfIQTf34sGOrn6donSx3FaGAc"};
    public static final java.util.concurrent.atomic.AtomicBoolean A03;
    public static final java.util.concurrent.atomic.AtomicReference<java.lang.String> A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{-56, 3, -18, -22, -23, -10, -41, -23, 29, 12, 17, 13, 22, 11, 13, -10, 13, 28, 31, 23, 26, 19, -18, 23, 26, -23, 22, 12, 26, 23, 17, 12, -29, -18, -22, -5, -10, -41, 6, -18, -7, -11, -12, 9, -30, -18, -7, -11, -11, 9, -30, -71, -60, -64, -54, -63, -83, -53, -42, -46, -29, -26, -65, -63, -67, -68, -67, -86, -55, -59, -39, -42, -78, 64, 57, 79, 62, 69, 60, 60, 54, 79, 76, 79, 80, 88, 79, -9, 57, 69, 67, 4, 60, 55, 57, 59, 56, 69, 69, 65, 4, 55, 58, 73, 4, okio.Utf8.REPLACEMENT_BYTE, 68, 74, 59, 72, 68, 55, 66, 4, 75, 55, 52, 50, 59, 50, okio.Utf8.REPLACEMENT_BYTE, 54, 48, 25, 37, 37, 33, -33, 18, 24, 22, 31, 37, 31, 29, 15, 28, 9, 11, 17, 15, 24, 30, -20, -22, -36, -23, -42, -40, -34, -36, -27, -21, -42, -29, -40, -22, -21, -42, -23, -36, -35, -23, -36, -22, -33, 59, 41, 38, 35, 58, 45, 41, 59};
    }

    static {
        A08();
        A00 = A00(80, 7, 107);
        A03 = new java.util.concurrent.atomic.AtomicBoolean();
        A04 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public static java.lang.String A01(com.facebook.ads.redexgen.core.C7j c7j) {
        return android.webkit.WebSettings.getDefaultUserAgent(c7j);
    }

    public static java.lang.String A02(final com.facebook.ads.redexgen.core.C7j c7j) {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<java.lang.String>() { // from class: com.facebook.ads.redexgen.X.8s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final java.lang.String call() {
                java.lang.String browserUserAgent = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC05308t.A04.get();
                if (browserUserAgent != null) {
                    return browserUserAgent;
                }
                android.webkit.WebView webView = new android.webkit.WebView(c7j.getApplicationContext());
                webView.setWebViewClient(new android.webkit.WebViewClient() { // from class: com.facebook.ads.redexgen.X.8r
                    @Override // android.webkit.WebViewClient
                    public final boolean onRenderProcessGone(android.webkit.WebView webView2, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
                        com.facebook.ads.redexgen.core.AbstractC0897Ny.A02(com.facebook.ads.redexgen.core.C8E.A2j);
                        return true;
                    }
                });
                java.lang.String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    com.facebook.ads.redexgen.core.AbstractC05308t.A04.set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i = 0; i < 3; i++) {
            com.facebook.ads.redexgen.core.ExecutorC0844Lx.A00(futureTask);
            try {
                return (java.lang.String) futureTask.get();
            } catch (java.lang.Throwable th) {
                A09(c7j, th);
                android.os.SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static java.lang.String A03(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.C8O c8o) {
        java.lang.String strA07 = c8o.A07();
        if (android.text.TextUtils.isEmpty(strA07) && !A03.getAndSet(true)) {
            com.facebook.ads.redexgen.core.C8D c8dA07 = c7j.A07();
            int i = com.facebook.ads.redexgen.core.C8E.A1Z;
            java.lang.String bundle = A00(73, 7, 122);
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(bundle);
            java.lang.String bundle2 = A00(116, 7, 87);
            c8dA07.AA0(bundle2, i, c8f);
        }
        return strA07;
    }

    public static java.lang.String A04(com.facebook.ads.redexgen.core.C7j c7j, boolean z) {
        if (c7j == null) {
            return A00;
        }
        if (z) {
            return java.lang.System.getProperty(A00(123, 10, 59));
        }
        java.lang.String str = A04.get();
        if (str != null) {
            return str;
        }
        long jA01 = com.facebook.ads.redexgen.core.AbstractC0761Il.A01(c7j);
        java.lang.String strA00 = A00(org.objectweb.asm.Opcodes.D2L, 23, 1);
        java.lang.String strA01 = A00(org.objectweb.asm.Opcodes.I2L, 10, 52);
        java.lang.String strA02 = A00(88, 28, 96);
        if (jA01 > 0) {
            android.content.SharedPreferences sharedPreferences = c7j.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(strA02, c7j), 0);
            java.lang.String string = sharedPreferences.getString(strA01, null);
            long j = sharedPreferences.getLong(strA00, 0L);
            if (!android.text.TextUtils.isEmpty(string) && java.lang.System.currentTimeMillis() - j < jA01) {
                A04.set(string);
                java.lang.String[] strArr = A02;
                java.lang.String str2 = strArr[6];
                java.lang.String browserUserAgent = strArr[3];
                if (str2.charAt(17) != browserUserAgent.charAt(17)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A02;
                strArr2[6] = "raDju45r7vWAWvtCMjs7ezmbeHuUzRMZ";
                strArr2[3] = "IEXEfOXuBGyf1jRfSjx88B0PyUJh9Pa6";
                return string;
            }
        }
        java.lang.String strA03 = null;
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            try {
                strA03 = A01(c7j);
                A04.set(strA03);
            } catch (java.lang.Throwable t) {
                A09(c7j, t);
            }
        }
        if (strA03 == null) {
            strA03 = A02(c7j);
        }
        if (strA03 == null) {
            return A00;
        }
        if (jA01 > 0) {
            android.content.SharedPreferences sharedPreferences2 = c7j.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(strA02, c7j), 0);
            sharedPreferences2.edit().putString(strA01, A04.get()).apply();
            sharedPreferences2.edit().putLong(strA00, java.lang.System.currentTimeMillis()).apply();
        }
        return strA03;
    }

    public static java.lang.String A05(com.facebook.ads.redexgen.core.C8O c8o, com.facebook.ads.redexgen.core.C7j c7j) {
        if (com.facebook.ads.redexgen.core.AbstractC0761Il.A04(c7j)) {
            return A00(63, 5, 5) + A03(c7j, c8o) + A00(39, 6, 61) + c8o.A06() + A00(45, 6, 61) + c8o.A04() + A00(38, 1, 85);
        }
        return A00(0, 0, 76);
    }

    public static java.lang.String A06(com.facebook.ads.redexgen.core.C8O c8o, com.facebook.ads.redexgen.core.C7j c7j, boolean z) {
        return A04(c7j, z) + A00(0, 38, 50) + c7j.A04().A8f() + A00(57, 6, 26) + com.facebook.ads.redexgen.core.C8O.A04 + A00(38, 1, 85) + A05(c8o, c7j) + A00(68, 5, 13) + c7j.A04().A8g() + A00(51, 6, 8) + java.util.Locale.getDefault().toString() + A00(87, 1, 36);
    }

    public static void A09(com.facebook.ads.redexgen.core.C7j c7j, java.lang.Throwable th) {
        c7j.A07().AA0(A00(org.objectweb.asm.Opcodes.IF_ACMPNE, 8, 78), com.facebook.ads.redexgen.core.C8E.A2i, new com.facebook.ads.redexgen.core.C8F(th));
    }
}
