package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UA extends com.facebook.ads.redexgen.core.AbstractC0897Ny {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"Hi1Kp4OvuN0Mi1seIlZSQ9fXUMjjvE9p", "a9aQz404TSolCr57kPPHO7UwC5OuSOzH", "iZ3", "0R4wIBceXoURlcuySRfEAV2VVdZMdToQ", "Pns5aPZ6VZAIHBBYLIEekDbTjPHG0hEC", "QEtpGmawVai8H8emaUXHDe6205ss7rIx", "CSF", "KC7cPyOdjWwnXiGHMOi8VSLb8GeuOYES"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0926Pb A00;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 28);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-44, -23, -34, -47, -35, -39, -45, -49, -29, -44, -37, -49, -36, -47, -23, -43, -30, -49, -45, -33, -34, -28, -43, -34, -28, -49, -40, -43, -39, -41, -40, -28, -53, -32, -43, -56, -44, -48, -54, -58, -38, -53, -46, -58, -45, -56, -32, -52, -39, -58, -54, -42, -43, -37, -52, -43, -37, -58, -34, -48, -53, -37, -49};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int dynamicWebViewWidth = getDynamicWebViewWidth();
        int dynamicWebViewHeight = getDynamicWebViewHeight();
        if (dynamicWebViewWidth <= 0 || dynamicWebViewHeight <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = dynamicWebViewWidth / dynamicWebViewHeight;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        boolean z = mode != 1073741824;
        boolean z2 = mode2 != 1073741824;
        int width = getResources().getDisplayMetrics().widthPixels;
        int height = getResources().getDisplayMetrics().heightPixels;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
        if (viewGroup != null) {
            height = Integer.MAX_VALUE;
            width = viewGroup.getWidth() != 0 ? viewGroup.getWidth() : Integer.MAX_VALUE;
            if (viewGroup.getHeight() != 0) {
                height = viewGroup.getHeight();
            }
        }
        int iA01 = A01(dynamicWebViewWidth, width, i);
        int iA02 = A01(dynamicWebViewHeight, height, i2);
        if ((z2 || z) && java.lang.Math.abs((iA01 / iA02) - f) > 1.0E-7d) {
            boolean z3 = false;
            if (z2) {
                iA02 = (int) (iA01 / f);
                z3 = true;
            }
            if (!z3 && z) {
                float f2 = iA02 * f;
                if (A02[4].charAt(14) == 'W') {
                    throw new java.lang.RuntimeException();
                }
                A02[4] = "z0LYwU9eQuMrdS04YY6f4w1GT5TpPfvp";
                iA01 = (int) f2;
            }
        }
        setMeasuredDimension(iA01, iA02);
    }

    static {
        A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UA(com.facebook.ads.redexgen.core.C0926Pb c0926Pb, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A00 = c0926Pb;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int i, int i2, int i3) {
        int specMode = android.view.View.MeasureSpec.getMode(i3);
        int result = android.view.View.MeasureSpec.getSize(i3);
        switch (specMode) {
            case Integer.MIN_VALUE:
                int iMin = java.lang.Math.min(i, result);
                java.lang.String[] strArr = A02;
                java.lang.String str = strArr[0];
                java.lang.String str2 = strArr[7];
                int specMode2 = str.charAt(6);
                if (specMode2 != str2.charAt(6)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A02;
                strArr2[6] = "m6i";
                strArr2[2] = "Lyc";
                return java.lang.Math.min(iMin, i2);
            case 0:
                return java.lang.Math.min(i, i2);
            case 1073741824:
                return result;
            default:
                return i;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0897Ny
    public final android.webkit.WebChromeClient A0D() {
        return new com.facebook.ads.redexgen.core.PW(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0897Ny
    public final android.webkit.WebViewClient A0E() {
        return new com.facebook.ads.redexgen.core.PX(this.A00);
    }

    private int getDynamicWebViewHeight() {
        return this.A00.A09.A0o().optInt(A03(0, 32, 84));
    }

    private int getDynamicWebViewWidth() {
        return this.A00.A09.A0o().optInt(A03(32, 31, 75));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.A00.A02 != null) {
            this.A00.A02.ADo(this, motionEvent);
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (A02[1].charAt(18) != 'P') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[0] = "8G0frzOI4hnuLOXw8ofdNPqhqb4ZK9tq";
        strArr[7] = "WF4GKlO7gB8U235davoNaDl6h9NjfHA4";
        return zOnTouchEvent;
    }
}
