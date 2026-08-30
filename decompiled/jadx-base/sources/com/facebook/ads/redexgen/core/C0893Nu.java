package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0893Nu extends android.webkit.WebChromeClient {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"UcT", "7pCxO", "d1eUuJRsSQrbyeV", "NvcYkIOLS6u3Z", "4rhEUJepg5yzUmxbs6HYJp18fCLzs", "c8rjrCABAqtuVN2R", "gqC4klM2hvrTEGu", "cDVUBFjHiz5XJka2"};
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1199Zs> A00;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0891Ns> A01;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0887No> A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A04;
            if (strArr[4].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[0] = "xQ2";
            strArr2[1] = "BwhB4";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 36);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{81, 86, 81, -66, -31, -28, -35, -104, -69, -32, -25, -25, -21, -35, -22, -117, -104, -114, -100, -103, -109, -114, 88, -109, -104, -98, -113, -104, -98, 88, -117, -115, -98, -109, -103, -104, 88, 113, 111, 126, -119, 109, 121, 120, 126, 111, 120, 126, -32, -19, -29, -15, -18, -24, -29, -83, -24, -19, -13, -28, -19, -13, -83, -30, -32, -13, -28, -26, -18, -15, -8, -83, -50, -49, -60, -51, -64, -63, -53, -60, -68, -86, -89, -92, -69, -82, -86, -68};
    }

    static {
        A01();
    }

    public C0893Nu(java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1199Zs> weakReference, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0891Ns> weakReference2, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0887No> weakReference3) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
        this.A02 = weakReference3;
    }

    private boolean A02(android.webkit.ValueCallback valueCallback) {
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A00.get();
        if (c1199Zs == null || c1199Zs.A0D() == null || !com.facebook.ads.redexgen.core.C1079Uy.A09) {
            return false;
        }
        if (com.facebook.ads.redexgen.core.C1079Uy.A08 != null) {
            com.facebook.ads.redexgen.core.C1079Uy.A08.onReceiveValue(null);
            java.lang.String[] strArr = A04;
            if (strArr[4].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[4] = "8y9TMu8YjdwMhcx8OyIx8Raox9jk1";
            strArr2[3] = "8D57YjnpkPWjk";
            android.webkit.ValueCallback unused = com.facebook.ads.redexgen.core.C1079Uy.A08 = null;
        }
        android.webkit.ValueCallback unused2 = com.facebook.ads.redexgen.core.C1079Uy.A08 = valueCallback;
        try {
            android.content.Intent intent = new android.content.Intent(A00(15, 33, 6));
            intent.addCategory(A00(48, 32, 91));
            intent.setType(A00(0, 3, 3));
            c1199Zs.A0D().startActivityForResult(android.content.Intent.createChooser(intent, A00(3, 12, 84)), 1001);
            return true;
        } catch (java.lang.Exception e) {
            c1199Zs.A07().AA1(A00(80, 8, 33), com.facebook.ads.redexgen.core.C8E.A2d, new com.facebook.ads.redexgen.core.C8F(e));
            android.webkit.ValueCallback unused3 = com.facebook.ads.redexgen.core.C1079Uy.A08 = null;
            return false;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        java.lang.String strMessage = consoleMessage.message();
        com.facebook.ads.redexgen.core.C0887No c0887No = this.A02.get();
        if (!android.text.TextUtils.isEmpty(strMessage) && consoleMessage.messageLevel() == android.webkit.ConsoleMessage.MessageLevel.LOG && c0887No != null) {
            c0887No.A04(strMessage);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(android.webkit.WebView webView, int i) {
        super.onProgressChanged(webView, i);
        com.facebook.ads.redexgen.core.C0887No timingLogger = this.A02.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        com.facebook.ads.redexgen.core.InterfaceC0891Ns interfaceC0891Ns = this.A01.get();
        if (interfaceC0891Ns != null) {
            interfaceC0891Ns.ADG(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(android.webkit.WebView webView, java.lang.String str) {
        super.onReceivedTitle(webView, str);
        com.facebook.ads.redexgen.core.InterfaceC0891Ns listener = this.A01.get();
        if (listener != null) {
            listener.ADJ(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> filePathCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        return A02(filePathCallback);
    }
}
