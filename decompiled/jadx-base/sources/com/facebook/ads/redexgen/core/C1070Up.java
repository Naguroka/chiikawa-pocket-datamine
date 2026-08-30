package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1070Up extends com.facebook.ads.redexgen.core.AbstractC0897Ny {
    public static byte[] A0F;
    public static java.lang.String[] A0G = {"X5ywJXgSTO8PHmyyLHkjy", "LJCQW", "068uN", "say", "rTIjgGKqeW39zjdqZS0Aqu4tLxC", "Qrp", "m8T4zYbfVU3hLt0iEDnj", "pXMACVxBUOAUm1D"};
    public static final java.lang.String A0H;
    public float A00;
    public com.facebook.ads.redexgen.core.C0842Lv A01;
    public com.facebook.ads.redexgen.core.AbstractC0986Rj A02;
    public com.facebook.ads.redexgen.core.C0987Rk A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final android.graphics.Path A07;
    public final android.graphics.RectF A08;
    public final com.facebook.ads.redexgen.core.C1199Zs A09;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.O1> A0A;
    public final java.util.concurrent.atomic.AtomicBoolean A0B;
    public final java.util.concurrent.atomic.AtomicBoolean A0C;
    public final java.util.concurrent.atomic.AtomicInteger A0D;
    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> A0E;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 52);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        A0F = new byte[]{91, 126, 89, 117, 116, 110, 104, 117, 118};
    }

    static {
        A06();
        A0H = com.facebook.ads.redexgen.core.C1070Up.class.getSimpleName();
    }

    public C1070Up(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.O1> weakReference, int i, java.lang.String str) {
        this(c1199Zs, weakReference, i, false);
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(c1199Zs)) {
            c1199Zs.A01().A0A().AHP(this, str == null ? A04(0, 0, 91) : str, false, true);
            this.A06 = true;
        }
    }

    public C1070Up(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.O1> weakReference, int i, boolean z) {
        super(c1199Zs);
        this.A0B = new java.util.concurrent.atomic.AtomicBoolean();
        this.A0C = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.A07 = new android.graphics.Path();
        this.A08 = new android.graphics.RectF();
        this.A0D = new java.util.concurrent.atomic.AtomicInteger(5000);
        this.A0E = new java.util.concurrent.atomic.AtomicReference<>();
        this.A01 = new com.facebook.ads.redexgen.core.C0842Lv();
        this.A05 = true;
        this.A06 = false;
        this.A09 = c1199Zs;
        this.A04 = z;
        this.A0A = weakReference;
        this.A02 = new com.facebook.ads.redexgen.core.C1074Ut(this);
        this.A03 = new com.facebook.ads.redexgen.core.C0987Rk(this, i, new java.lang.ref.WeakReference(this.A02), this.A09);
        setWebChromeClient(A0D());
        setWebViewClient(A0E());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        if (android.os.Build.VERSION.SDK_INT > 16) {
            addJavascriptInterface(new com.facebook.ads.redexgen.core.O0(this, weakReference.get(), this.A03, this.A0B, this.A0C, this.A09), A04(0, 9, 46));
        }
    }

    private final boolean A07() {
        return this.A0B.get();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0897Ny
    public final android.webkit.WebChromeClient A0D() {
        return new com.facebook.ads.redexgen.core.O2();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0897Ny
    public final android.webkit.WebViewClient A0E() {
        return new com.facebook.ads.redexgen.core.O3(this.A09, this.A0A, new java.lang.ref.WeakReference(this.A03), new java.lang.ref.WeakReference(this.A01), new java.lang.ref.WeakReference(this.A0C), new java.lang.ref.WeakReference(this), this.A0D, this.A0E, this.A04);
    }

    public final void A0F() {
        this.A09.A0E().AHR();
        this.A0B.set(true);
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.facebook.ads.redexgen.core.C1072Ur(this.A03));
    }

    public final void A0G(int i, int i2) {
        if (this.A03 != null) {
            this.A03.A0W(i);
            this.A03.A0X(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0897Ny, android.webkit.WebView
    public final void destroy() {
        if (this.A06) {
            this.A09.A01().A0A().AHC(this);
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        com.facebook.ads.redexgen.core.M3.A0J(this);
        this.A02 = null;
        this.A01 = null;
        com.facebook.ads.redexgen.core.O4.A03(this);
        super.destroy();
    }

    public com.facebook.ads.redexgen.core.C0842Lv getTouchDataRecorder() {
        return this.A01;
    }

    public com.facebook.ads.redexgen.core.C0987Rk getViewabilityChecker() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        if (this.A00 > 0.0f) {
            this.A08.set(0.0f, 0.0f, getWidth(), getHeight());
            java.lang.String[] strArr = A0G;
            if (strArr[1].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0G;
            strArr2[1] = "xZYpx";
            strArr2[2] = "aqsn9";
            this.A07.reset();
            this.A07.addRoundRect(this.A08, this.A00, this.A00, android.graphics.Path.Direction.CW);
            canvas.clipPath(this.A07);
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        this.A01.A06(this.A09, motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.A0A.get() != null) {
            this.A0A.get();
        }
        if (this.A03 == null) {
            return;
        }
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A09;
        java.lang.String[] strArr = A0G;
        if (strArr[6].length() == strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0G;
        strArr2[6] = "5ON080OOKwQwIFP5OG7h";
        strArr2[0] = "JBDgk0gsadULglMDLs8S8";
        c1199Zs.A0E().AHf(i);
        if (i == 0 && A07()) {
            this.A03.A0U();
        } else {
            if (i != 8) {
                return;
            }
            this.A03.A0V();
        }
    }

    public void setBlockLocalFileAccessOutsideCache(boolean z) {
        this.A04 = z;
    }

    public void setCheckAssetsByJavascriptBridge(boolean z) {
        this.A0C.set(z);
    }

    public void setCornerRadius(float f) {
        this.A00 = f;
        invalidate();
    }

    public void setLogMultipleImpressions(boolean z) {
        this.A05 = z;
    }

    public void setRequestId(java.lang.String str) {
        this.A0E.set(str);
    }

    public void setWebViewTimeoutInMillis(int i) {
        if (i >= 0) {
            this.A0D.set(i);
        }
    }
}
