package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PX extends android.webkit.WebViewClient {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"", "6FWFK2Rjg5lzc4YxuKyAM2pjdKcDgsPX", "X8DXQa0II", "SNpKLA", "Qdf29haAswqAmNE65waVoEZq7xKg2wdQ", "zoYtBkcpJPqvxBhZCETS8Gv12yQPTvJi", "ExNOaNYHlEOFqs215y0dlBgemejMJNEa", "gJ6ZUqdzTjndwEo8cFEFcqem1uRbclUa"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0926Pb A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            if (A02[5].charAt(10) != 'q') {
                throw new java.lang.RuntimeException();
            }
            A02[5] = "pKC7szj5R0qBwTmNDTYZuLrnbbbgOopj";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 33);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 99, 117, 101, 116, 111, 118, 114, 111, 105, 104, 124, 113, 124, 91, 106, 121, 107, 112, 6, 17, 17, 12, 17, 32, 12, 7, 6, 90, 93, 74, 85, 95, 83, 82, 18, 85, 95, 83, 13, 17, 17, 21, 58, 0, 23, 23, 10, 23, 19, 17, 10, 12, 17, 10, 23, 26, 106, 109, 115};
    }

    static {
        A01();
    }

    public PX(com.facebook.ads.redexgen.core.C0926Pb c0926Pb) {
        this.A00 = c0926Pb;
    }

    private void A02(int i, java.lang.String str, java.lang.String str2, boolean z) {
        if (z) {
            this.A00.A0S();
        }
        this.A00.A0D.A04(com.facebook.ads.redexgen.core.JE.A0Q, null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A00(19, 9, 66), i);
            jSONObject.put(A00(0, 11, 39), str);
            jSONObject.put(A00(57, 3, 62), str2);
        } catch (org.json.JSONException unused) {
        }
        java.lang.String string = jSONObject.toString();
        this.A00.A0B.A0E().A5l(string);
        this.A00.A0E.A04(com.facebook.ads.redexgen.core.C8E.A16, string);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        this.A00.A0D.A04(com.facebook.ads.redexgen.core.JE.A0R, null);
        this.A00.A0B.A0E().A5m(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00.A00));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        if (this.A00.A03 == null) {
            return;
        }
        this.A00.A03.AED();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (android.os.Build.VERSION.SDK_INT < 23) {
            A02(i, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strA00 = A00(0, 0, 93);
        A02(errorCode, sb.append(strA00).append((java.lang.Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        int statusCode;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(java.util.Locale.US).contains(A00(28, 11, 29))) {
            return;
        }
        if (webResourceResponse != null) {
            statusCode = webResourceResponse.getStatusCode();
        } else {
            statusCode = -1;
        }
        A02(statusCode, A00(39, 10, 68), A00(0, 0, 93) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A00(11, 8, 57), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 66), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (org.json.JSONException unused) {
        }
        java.lang.String string = jSONObject.toString();
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A00.A0B;
        java.lang.String message = A02[5];
        if (message.charAt(10) == 'q') {
            A02[3] = "cKmn9F08G0LbJgt48cswTZGSotGQ5jj";
            c1199Zs.A0E().A5h(string);
            com.facebook.ads.redexgen.core.AbstractC0927Pc.A04(this.A00.A09.A0l());
            if (this.A00.A04 != null) {
                this.A00.A04.ADE();
            }
            java.lang.String message2 = A02[5];
            if (message2.charAt(10) == 'q') {
                A02[3] = "Jr1n";
                return true;
            }
        }
        throw new java.lang.RuntimeException();
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return com.facebook.ads.redexgen.core.C0940Pp.A00(this.A00.A0B, this.A00.A0A, webResourceRequest, this.A00.A0H, this.A00.A09.A10());
    }
}
