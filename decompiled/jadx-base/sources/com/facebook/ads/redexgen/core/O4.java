package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class O4 {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 82);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{11, 8, 5, 31, 30, 80, 8, 6, 11, 4, 1, 119, 107, 107, 111, 108, 37, 48, 48, 104, 104, 104, 49, 58, 108, 49, 121, 126, 124, 122, 125, 112, 112, 116, 49, 124, 112, 114, 49, 45, 45, 41, 42, 99, 118, 118, 46, 46, 46, 119, okio.Utf8.REPLACEMENT_BYTE, 56, 58, 60, 59, 54, 54, 50, 119, 58, 54, 52, 118, 74, 92, 77, 116, 80, 65, 92, 93, 122, 86, 87, 77, 92, 87, 77, 116, 86, 93, 92};
    }

    public static java.lang.String A01(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? A00(38, 25, 11) : java.lang.String.format(java.util.Locale.US, A00(11, 27, 77), str);
    }

    public static void A03(android.webkit.WebView webView) {
        webView.loadUrl(A00(0, 11, 56));
        webView.clearCache(true);
    }

    public static void A04(android.webkit.WebView webView) {
        android.webkit.WebSettings settings = webView.getSettings();
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        } else {
            try {
                android.webkit.WebSettings.class.getMethod(A00(63, 19, 107), new java.lang.Class[0]).invoke(settings, 0);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
