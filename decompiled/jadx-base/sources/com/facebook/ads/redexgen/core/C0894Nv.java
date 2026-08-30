package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0894Nv extends android.webkit.WebViewClient {
    public static byte[] A05;
    public com.facebook.ads.redexgen.core.InterfaceC0890Nr A00 = new com.facebook.ads.redexgen.core.InterfaceC0890Nr() { // from class: com.facebook.ads.redexgen.X.Uz
        @Override // com.facebook.ads.redexgen.core.InterfaceC0890Nr
        public final boolean A9c(java.lang.String str) {
            return com.facebook.ads.redexgen.core.C0894Nv.A04(str);
        }
    };
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0892Nt> A01 = new java.lang.ref.WeakReference<>(null);
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1199Zs> A02;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0891Ns> A03;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0887No> A04;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{28, 31, 18, 8, 9, 71, 31, 17, 28, 19, 22, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, kotlin.io.encoding.Base64.padSymbol, 12, 3, 9, 31, 2, 4, 9, 67, 4, 3, 25, 8, 3, 25, 67, 12, 14, 25, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, 127, 114, 56, 127, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, 27, 77, 87, 31, 13, 10, 55, 30, 1, 13, 31};
    }

    public C0894Nv(java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1199Zs> weakReference, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0891Ns> weakReference2, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0887No> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(java.lang.String str, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        c1199Zs.A07().AA0(A00(11, 11, 104), com.facebook.ads.redexgen.core.C8E.A09, new com.facebook.ads.redexgen.core.C8F(A00(111, 5, 91) + str));
    }

    private boolean A03(android.webkit.WebView webView, java.lang.String str) {
        android.content.Intent intent;
        java.lang.String strA00 = A00(116, 8, 68);
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A02.get();
        if (c1199Zs == null) {
            return false;
        }
        if ((com.facebook.ads.redexgen.core.C1079Uy.A0A && (android.text.TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A00.A9c(str)) {
            return true;
        }
        try {
            android.net.Uri uri = com.facebook.ads.redexgen.core.L5.A00(str);
            java.lang.String scheme = uri.getScheme();
            try {
                boolean zA10 = com.facebook.ads.redexgen.core.C0762Im.A10(c1199Zs);
                java.lang.String strA01 = A00(48, 33, 58);
                java.lang.String strA02 = A00(22, 26, 65);
                java.lang.String strA03 = A00(105, 6, 36);
                if (zA10) {
                    if (!com.facebook.ads.redexgen.core.C1079Uy.A0E.contains(scheme) && !A00(101, 4, 123).equals(scheme)) {
                        if (strA03.equalsIgnoreCase(scheme)) {
                            intent = android.content.Intent.parseUri(str, 1);
                            intent.setComponent(null);
                            intent.setSelector(null);
                        } else {
                            intent = new android.content.Intent(strA02, uri);
                        }
                        intent.addCategory(strA01);
                        if (android.os.Build.VERSION.SDK_INT >= 30) {
                            intent.setFlags(268436480);
                        } else {
                            intent.setFlags(268435456);
                        }
                        try {
                            if (!com.facebook.ads.redexgen.core.C0813Kq.A0C(c1199Zs, intent)) {
                                A02(str, c1199Zs);
                            }
                            return true;
                        } catch (com.facebook.ads.redexgen.core.C0811Ko unused) {
                            if (strA03.equals(scheme)) {
                                java.lang.String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                if (!android.text.TextUtils.isEmpty(stringExtra)) {
                                    if (!com.facebook.ads.redexgen.core.C0813Kq.A0C(c1199Zs, new android.content.Intent(strA02, com.facebook.ads.redexgen.core.L5.A00(stringExtra)))) {
                                        A02(str, c1199Zs);
                                    }
                                    return true;
                                }
                            }
                            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(A00(111, 5, 91) + str);
                            c8f.A05(1);
                            c1199Zs.A07().AA1(A00(11, 11, 104), com.facebook.ads.redexgen.core.C8E.A06, c8f);
                            return true;
                        }
                    }
                    return false;
                }
                if (com.facebook.ads.redexgen.core.C1079Uy.A0A && strA03.equalsIgnoreCase(scheme)) {
                    android.content.Intent uri2 = android.content.Intent.parseUri(str, 1);
                    uri2.addCategory(strA01);
                    uri2.setComponent(null);
                    uri2.setSelector(null);
                    if (c1199Zs.getPackageManager().resolveActivity(uri2, 65536) != null && com.facebook.ads.redexgen.core.C0813Kq.A0C(c1199Zs, uri2)) {
                        webView.goBack();
                        return true;
                    }
                } else if ((com.facebook.ads.redexgen.core.C1079Uy.A0A && com.facebook.ads.redexgen.core.LT.A04(str)) || !com.facebook.ads.redexgen.core.C1079Uy.A0E.contains(scheme)) {
                    return com.facebook.ads.redexgen.core.C0813Kq.A0C(c1199Zs, new android.content.Intent(strA02, uri));
                }
                return false;
            } catch (java.lang.Exception e) {
                c1199Zs.A07().AA1(strA00, com.facebook.ads.redexgen.core.C8E.A2d, new com.facebook.ads.redexgen.core.C8F(e));
                c1199Zs.A0E().A99(e.toString());
            }
        } catch (java.lang.SecurityException e2) {
            c1199Zs.A07().AA1(strA00, com.facebook.ads.redexgen.core.C8E.A2d, new com.facebook.ads.redexgen.core.C8F(e2));
            return true;
        }
    }

    public static /* synthetic */ boolean A04(java.lang.String str) {
        return true;
    }

    public final void A05(com.facebook.ads.redexgen.core.InterfaceC0890Nr interfaceC0890Nr) {
        this.A00 = interfaceC0890Nr;
    }

    public final void A06(java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0892Nt> weakReference) {
        this.A01 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        com.facebook.ads.redexgen.core.C0887No timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        com.facebook.ads.redexgen.core.InterfaceC0891Ns interfaceC0891Ns = this.A03.get();
        if (interfaceC0891Ns != null) {
            interfaceC0891Ns.ACw(str);
        }
        com.facebook.ads.redexgen.core.InterfaceC0892Nt interfaceC0892Nt = this.A01.get();
        if (interfaceC0892Nt != null) {
            interfaceC0892Nt.ABL(webView.canGoBack());
            interfaceC0892Nt.AC0(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        com.facebook.ads.redexgen.core.InterfaceC0891Ns listener = this.A03.get();
        if (listener != null) {
            listener.ACy(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        super.onReceivedError(webView, i, str, str2);
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A02.get();
        if (c1199Zs != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String strA00 = A00(0, 0, 109);
            java.lang.String errorMessage = com.facebook.ads.redexgen.core.LT.A01(i, sb.append(strA00).append(str).toString(), strA00 + str2);
            c1199Zs.A0E().A96(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A02.get();
        if (c1199Zs != null) {
            int errorCode = webResourceError.getErrorCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String strA00 = A00(0, 0, 109);
            java.lang.String errorMessage = com.facebook.ads.redexgen.core.LT.A01(errorCode, sb.append(strA00).append((java.lang.Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c1199Zs.A0E().A96(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.facebook.ads.redexgen.core.C1199Zs context = this.A02.get();
        if (context != null) {
            context.A0E().A97();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.facebook.ads.redexgen.core.C1199Zs context = this.A02.get();
        if (context != null) {
            context.A0E().A98();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.facebook.ads.redexgen.core.AbstractC0897Ny.A02(com.facebook.ads.redexgen.core.C8E.A2e);
        com.facebook.ads.redexgen.core.InterfaceC0891Ns listener = this.A03.get();
        if (listener != null) {
            listener.ADL();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        return A03(webView, str);
    }
}
