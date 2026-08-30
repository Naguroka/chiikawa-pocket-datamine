package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0897Ny extends android.webkit.WebView {
    public static byte[] A01;
    public static final java.lang.String A02;
    public boolean A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 96);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -4, 4, 7, 0, -1, -69, 15, 10, -69, 4, 9, 4, 15, 4, -4, 7, 4, 21, 0, -69, -34, 10, 10, 6, 4, 0, -24, -4, 9, -4, 2, 0, 13, -55, -70, -71, -125, -58, -43, -60, -42, -53, -56, -57, okio.Utf8.REPLACEMENT_BYTE, 54, 75, 54, 72, 56, 71, 62, 69, 73, 15, -4, -22, -25, -28, -5, -18, -22, -4};
    }

    public abstract android.webkit.WebChromeClient A0D();

    public abstract android.webkit.WebViewClient A0E();

    static {
        A01();
        A02 = com.facebook.ads.redexgen.core.AbstractC0897Ny.class.getSimpleName();
    }

    public AbstractC0897Ny(android.app.Activity activity, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(activity);
        A03(c1199Zs);
    }

    public AbstractC0897Ny(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        A03(c1199Zs);
    }

    public static void A02(int i) {
        com.facebook.ads.redexgen.core.C1198Zr context = com.facebook.ads.redexgen.core.AbstractC04997i.A00();
        if (context != null) {
            context.A07().AA0(A00(56, 8, 37), i, new com.facebook.ads.redexgen.core.C8F(A00(35, 10, 3)));
        }
    }

    private void A03(com.facebook.ads.redexgen.core.C7j c7j) {
        setWebChromeClient(A0D());
        setWebViewClient(A0E());
        com.facebook.ads.redexgen.core.O4.A04(this);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        if (c7j.A04().A9O() && android.os.Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            try {
                android.webkit.CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            } catch (java.lang.Exception unused) {
                android.util.Log.w(A02, A00(0, 35, 59));
            }
        }
    }

    private void A04(java.lang.String str) {
        loadUrl(A00(45, 11, 117) + str);
    }

    public final void A05(java.lang.String str) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
            } else {
                A04(str);
            }
        } catch (java.lang.IllegalStateException unused) {
            A04(str);
        }
    }

    public final boolean A06() {
        return this.A00;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.A00 = true;
        super.destroy();
    }
}
