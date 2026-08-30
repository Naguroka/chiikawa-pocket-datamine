package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O2 extends android.webkit.WebChromeClient {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"qIelJ", "lKTIcg2UjfF14Z8Xhui", "NLc2w0oJuVItZcslj1CIxITo5xRh8cik", "7h0SW3CZf", "7u0iJws4mJjRjrjcNYguso1ZQWILKCjj", "5VZ", "KSQwjaQJUqtoICfJeANBQIZfUxb6Ta6M", "WWxpfzOlcldolHheyTOG"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            java.lang.String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[1] = "CG0OpRrZpH4z5OjNzt5";
            strArr2[5] = "sch";
            bArrCopyOfRange[i4] = (byte) ((b - i3) - 37);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-99, -55, -56, -51, -55, -58, -65, 122, -57, -65, -51, -51, -69, -63, -65, -108, 122, -39, -4, -18, -15, -10, -5, -12, -83, -3, -1, -4, -12, -1, -14, 0, 0, -57, -83};
    }

    static {
        A01();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
            java.lang.String str = A00(0, 17, 53) + consoleMessage.message();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(android.webkit.WebView webView, int i) {
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
            java.lang.String str = A00(17, 18, 104) + i;
        }
    }
}
