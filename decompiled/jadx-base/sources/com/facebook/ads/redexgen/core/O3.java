package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O3 extends android.webkit.WebViewClient {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"zsPwasR1y7408", "ZGgsKLkccpHpwEVEMRkr0P5MO", "FzTF8imkK53ZXE3O7c0sd3pyoR5CtRCL", "JPkvHHHSAaAEWhLae7UVRehZAXg5QbZs", "c", "Jl8ZDZjQ485DOmiNP3uI8E", "DJVtCfMEOJ4BXbKH6y5pb3wK31xmWsao", "K"};
    public java.util.Date A00;
    public boolean A01 = false;
    public final com.facebook.ads.redexgen.core.C1199Zs A02;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1070Up> A03;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.O1> A04;
    public final java.lang.ref.WeakReference<java.util.concurrent.atomic.AtomicBoolean> A05;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0842Lv> A06;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0987Rk> A07;
    public final java.util.concurrent.atomic.AtomicInteger A08;
    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> A09;
    public final boolean A0A;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {8, 38, 40, 45, 42, -14, 8, 52, 51, 57, 55, 52, 49, -69, -36, -27, -32, -36, -37, 28, 77, 56, 67, 76, 56, 75, 64, 69, 62, -9, 44, 41, 32, -9, 39, 56, 75, okio.Utf8.REPLACEMENT_BYTE, -9, kotlin.io.encoding.Base64.padSymbol, 70, 73, -9, 29, 64, 67, 60, -9, 24, 58, 58, 60, 74, 74, -9, -46, 5, 1, -1, -18, -83, -15, -18, 1, -18, -57, -83, 60, 72, 72, 68, 20, 57, 102, 102, 99, 102, 59, 84, 89, 71, 76, 75, 6, 56, 75, 87, 91, 75, 89, 90, 6, 76, 85, 88, 6, 44, 79, 82, 75, 6, 39, 73, 73, 75, 89, 89, 6, 34, 59, 64, 46, 51, 50, -19, 31, 50, 62, 66, 50, 64, 65, -19, 51, 60, okio.Utf8.REPLACEMENT_BYTE, -19, 19, 54, 57, 50, -19, 14, 48, 48, 50, 64, 64, -19, 49, 50, 59, 54, 50, 49, 67, 68, 77, 72, 68, 67, 62, 84, 81, 72, 62, 79, 64, 83, 71, okio.Utf8.REPLACEMENT_BYTE, 76, 76, 73, 76, 57, kotlin.io.encoding.Base64.padSymbol, 73, 62, okio.Utf8.REPLACEMENT_BYTE, 40, 53, 53, 50, 53, 34, 39, 40, 54, 38, 53, 44, 51, 55, 44, 50, 49, 15, 10, 31, 18, 12, 24, 23, -41, 18, 12, 24, 19, 22, 25, 18, 89, 99, 79, 103, 85, 82, 79, 98, 85, 99, 95, 101, 98, 83, 85, 79, 85, 98, 98, 95, 98, 70, 73, 59, 62, 67, 72, 65, 57, 78, 67, 71, okio.Utf8.REPLACEMENT_BYTE, 57, 67, 72, 57, 71, 67, 70, 70, 67, 77, -3, -12, 3, -55, -55, -44, -31, -31, -18, -44, -36, -33, -29, -24, -18, -31, -44, -30, -33, -34, -35, -30, -44, 46, 47, -19, 51, 52, 47, 50, 37, 66, 53, 65, 69, 53, 67, 68, 47, 57, 52, 101, 86, 105, 101, 32, 97, 93, 82, 90, 95, -8, -29, -18, -21, -26, -31, -14, -29, -10, -22, 62, 44, 41, 38, kotlin.io.encoding.Base64.padSymbol, 48, 44, 62};
        java.lang.String[] strArr = A0C;
        if (strArr[0].length() == strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0C;
        strArr2[3] = "rhE0g4ovzatryzU62WuE8blUNequGZ6x";
        strArr2[6] = "8iaaY9YuVC21lqcoOxYFj2DPKFldlJdP";
        A0B = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0A(java.lang.String str, java.util.List<java.lang.String> list) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.getDefault());
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (lowerCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static {
        A02();
    }

    public O3(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.O1> weakReference, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0987Rk> weakReference2, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C0842Lv> weakReference3, java.lang.ref.WeakReference<java.util.concurrent.atomic.AtomicBoolean> checkAssetsByJavascriptBridge, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1070Up> weakReference4, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicReference<java.lang.String> requestId, boolean z) {
        this.A02 = c1199Zs;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = checkAssetsByJavascriptBridge;
        this.A03 = weakReference4;
        this.A08 = atomicInteger;
        this.A09 = requestId;
        this.A0A = z;
    }

    private android.webkit.WebResourceResponse A00() {
        return new android.webkit.WebResourceResponse(A01(286, 10, 123), java.nio.charset.StandardCharsets.UTF_8.name(), 403, A01(13, 6, 1), java.util.Collections.singletonMap(A01(0, 13, 79), A01(268, 8, 74)), new java.io.ByteArrayInputStream(A01(13, 6, 1).getBytes()));
    }

    private void A03(int i, java.lang.CharSequence charSequence, long j) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean z = charSequence != null;
        try {
            jSONObject.put(A01(org.objectweb.asm.Opcodes.IF_ICMPNE, 10, 100), i);
            jSONObject.put(A01(org.objectweb.asm.Opcodes.TABLESWITCH, 17, 77), charSequence);
            jSONObject.put(A01(com.ironsource.g3.c.b.c, 21, 122), z);
            jSONObject.put(A01(223, 22, 100), j);
            jSONObject.put(A01(276, 10, 90), this.A09.get());
        } catch (org.json.JSONException unused) {
        }
        this.A02.A07().AA0(A01(306, 8, 81), com.facebook.ads.redexgen.core.C8E.A2f, new com.facebook.ads.redexgen.core.C8F(com.facebook.ads.internal.protocol.AdErrorType.WEB_VIEW_FAILED_TO_LOAD.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, java.lang.String str) {
        if (A01(245, 23, 25).equals(str)) {
            this.A02.A0E().AHY();
            return;
        }
        this.A02.A0E().AHZ(i, str);
        java.util.Date finishTime = new java.util.Date();
        long time = finishTime.getTime();
        java.util.Date finishTime2 = this.A00;
        A03(i, str, time - finishTime2.getTime());
        if (this.A04.get() != null) {
            this.A04.get().ABx(i, str);
        }
    }

    private final void A05(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        if (webResourceRequest.getUrl().toString().toLowerCase(java.util.Locale.US).contains(A01(org.objectweb.asm.Opcodes.NEW, 11, 51))) {
            return;
        }
        this.A02.A0E().AHd(webResourceResponse.getStatusCode(), com.facebook.ads.redexgen.core.LT.A01(webResourceResponse.getStatusCode(), A01(67, 10, 126), A01(0, 0, 53) + webResourceRequest.getUrl()));
    }

    private void A07(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A01(org.objectweb.asm.Opcodes.I2B, 15, 105), str);
            jSONObject.put(A01(296, 10, 12), str2);
            jSONObject.put(A01(276, 10, 90), this.A09.get());
        } catch (org.json.JSONException unused) {
        }
        if (this.A02 != null) {
            this.A02.A07().AA0(A01(306, 8, 81), com.facebook.ads.redexgen.core.C8E.A2c, new com.facebook.ads.redexgen.core.C8F(com.facebook.ads.internal.protocol.AdErrorType.WEB_VIEW_CACHE_FILE_WAS_DENIED.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    private boolean A08(android.net.Uri uri) {
        java.lang.String path = uri.getPath();
        java.lang.String scheme = uri.getScheme();
        if (path == null || scheme == null) {
            return true;
        }
        java.lang.String[] strArr = A0C;
        java.lang.String scheme2 = strArr[3];
        java.lang.String path2 = strArr[6];
        if (scheme2.length() != path2.length()) {
            throw new java.lang.RuntimeException();
        }
        A0C[5] = "5na5yijD7UxFpHVkXXcSH2RW6Zg";
        java.lang.String path3 = A01(org.objectweb.asm.Opcodes.IFNULL, 4, 55);
        if (scheme.equals(path3)) {
            boolean zIsDebug = com.facebook.ads.internal.api.BuildConfigApi.isDebug();
            java.lang.String[] strArr2 = A0C;
            java.lang.String scheme3 = strArr2[3];
            java.lang.String path4 = strArr2[6];
            if (scheme3.length() == path4.length()) {
                A0C[5] = "2SO0ZWlaSU1SnxqLnXbiPhTsGSHCmzPH";
                if (zIsDebug) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.String path5 = A01(19, 36, 97);
                    sb.append(path5).append(path).toString();
                }
            } else if (zIsDebug) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.String path6 = A01(19, 36, 97);
                sb2.append(path6).append(path).toString();
            }
            java.util.List<java.lang.String> listA09 = com.facebook.ads.redexgen.core.C04766f.A09(this.A02);
            boolean zA0A = A0A(path, listA09);
            if (!zA0A) {
                if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    java.lang.String path7 = A01(77, 31, 112);
                    sb3.append(path7).append(path).toString();
                }
                java.lang.String str = com.facebook.ads.redexgen.core.C1070Up.A0H;
                java.lang.String path8 = A01(108, 37, 87);
                android.util.Log.w(str, path8);
                java.lang.String path9 = listA09.toString();
                A07(path, path9);
            }
            return zA0A;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        this.A02.A0E().AHa(this.A03.get() != null);
        if (this.A03.get() != null) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.A05.get();
            java.lang.String[] strArr = A0C;
            if (strArr[7].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[3] = "U2DnXjrenRRLx1oMUBfcSIJQu5ANNJpT";
            strArr2[6] = "L4ZmgD3GCXt8DfDAt3P3IJDf6GSeHMJn";
            if (atomicBoolean != null && !this.A05.get().get()) {
                this.A03.get().A0F();
            }
        }
        this.A01 = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0E().AHb();
        this.A00 = new java.util.Date();
        new android.os.Handler().postDelayed(new com.facebook.ads.redexgen.core.C1071Uq(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        this.A01 = true;
        A04(i, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        boolean zA0y = com.facebook.ads.redexgen.core.C0762Im.A0y(this.A02);
        java.lang.String strA01 = A01(0, 0, 53);
        if (zA0y || webResourceRequest.isForMainFrame()) {
            this.A01 = true;
            A04(webResourceError.getErrorCode(), strA01 + ((java.lang.Object) webResourceError.getDescription()));
        } else {
            this.A02.A0E().AHc(com.facebook.ads.redexgen.core.LT.A01(webResourceError.getErrorCode(), strA01 + ((java.lang.Object) webResourceError.getDescription()), strA01 + webResourceRequest.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        A05(webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        this.A02.A0E().AHe();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        com.facebook.ads.redexgen.core.AbstractC0897Ny.A02(com.facebook.ads.redexgen.core.C8E.A2b);
        com.facebook.ads.redexgen.core.O1 adWebViewListener = this.A04.get();
        if (adWebViewListener != null) {
            adWebViewListener.AEC();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        android.net.Uri url = webResourceRequest.getUrl();
        if (this.A0A && !A08(url)) {
            android.webkit.WebResourceResponse webResourceResponseA00 = A00();
            A05(webResourceRequest, webResourceResponseA00);
            return webResourceResponseA00;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (this.A04.get() != null) {
            this.A04.get().ABV(str, new com.facebook.ads.redexgen.core.O8().A03(this.A07.get()).A02(this.A06.get()).A05());
        }
        if (A0C[2].charAt(27) != 'C') {
            throw new java.lang.RuntimeException();
        }
        A0C[5] = "jV60qdj1rgKoRn";
        return true;
    }
}
