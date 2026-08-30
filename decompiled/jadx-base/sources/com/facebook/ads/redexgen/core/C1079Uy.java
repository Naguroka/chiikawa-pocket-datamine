package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1079Uy extends com.facebook.ads.redexgen.core.AbstractC0897Ny {
    public static android.webkit.ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"r5lFqG0C0bBGIxytTEblkmz8pOWiln6U", "Y5tMFhpuLobi6U3v3neZGAzEpbrZh2e0", "35iZKMkwZFt7WP5rciHAZ1WswbletKXm", "1wdh7bxI31pnh6pFTaTypUqx", "X0GEkrMG66X1N8QG", "HQ8AmQiqT9dTkfwWyhZ7u2ZNdQoS7Fbv", "yjHJSxajRdLfdjSgilcNPSPFyTq4dELg", "ut8cBtSHXrZx3QiSKTpc7NoA9ie10da9"};
    public static final java.lang.String A0D;
    public static final java.util.Set<java.lang.String> A0E;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public com.facebook.ads.redexgen.core.C1199Zs A04;
    public com.facebook.ads.redexgen.core.C0887No A05;
    public com.facebook.ads.redexgen.core.InterfaceC0891Ns A06;
    public com.facebook.ads.redexgen.core.C0894Nv A07;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 50);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{43, 55, 55, 51, 100, 120, 120, 124, 127};
    }

    static {
        A08();
        A0D = com.facebook.ads.redexgen.core.C1079Uy.class.getSimpleName();
        A0E = new java.util.HashSet(2);
        A09 = false;
        A0A = false;
        A0E.add(A05(0, 4, 113));
        A0E.add(A05(4, 5, 62));
    }

    public C1079Uy(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.app.Activity activity, com.facebook.ads.redexgen.core.InterfaceC0891Ns interfaceC0891Ns) {
        super(activity, c1199Zs);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c1199Zs, interfaceC0891Ns);
    }

    public C1079Uy(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.InterfaceC0891Ns interfaceC0891Ns) {
        super(c1199Zs);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c1199Zs, interfaceC0891Ns);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0897Ny
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C0894Nv A0E() {
        return new com.facebook.ads.redexgen.core.C0894Nv(new java.lang.ref.WeakReference(this.A04), new java.lang.ref.WeakReference(this.A06), new java.lang.ref.WeakReference(this.A05));
    }

    private void A07() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A09(int i, int i2, android.content.Intent intent) {
        if (A08 != null && i == 1001) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                A08.onReceiveValue(android.webkit.WebChromeClient.FileChooserParams.parseResult(i2, intent));
            } else {
                A08.onReceiveValue(intent.getData());
            }
            A08 = null;
        }
    }

    private void A0A(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.InterfaceC0891Ns interfaceC0891Ns) {
        this.A04 = c1199Zs;
        this.A06 = interfaceC0891Ns;
        this.A05 = new com.facebook.ads.redexgen.core.C0887No(this);
        A09 = com.facebook.ads.redexgen.core.AbstractC0763In.A03(this.A04);
        A0A = com.facebook.ads.redexgen.core.AbstractC0763In.A04(this.A04);
        android.webkit.WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0D());
        this.A07 = A0E();
        setWebViewClient(this.A07);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0897Ny
    public final android.webkit.WebChromeClient A0D() {
        return new com.facebook.ads.redexgen.core.C0893Nu(new java.lang.ref.WeakReference(this.A04), new java.lang.ref.WeakReference(this.A06), new java.lang.ref.WeakReference(this.A05));
    }

    public final void A0F(long j) {
        if (this.A00 < 0) {
            this.A00 = j;
        }
        A07();
        java.lang.String[] strArr = A0C;
        if (strArr[6].charAt(18) == strArr[0].charAt(18)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0C;
        strArr2[4] = "TnIn5PelVgDBsDwa";
        strArr2[3] = "kaGwwHcDVWZGOuagxs1W4ZQa";
    }

    public final void A0G(long j) {
        if (this.A01 < 0) {
            this.A01 = j;
        }
        A07();
    }

    public final void A0H(long j) {
        if (this.A02 < 0) {
            this.A02 = j;
        }
        A07();
        java.lang.String[] strArr = A0C;
        if (strArr[5].charAt(4) == strArr[7].charAt(4)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0C;
        strArr2[6] = "DwC46XxC2zY9iA5O924mXxlTXzY8IGhb";
        strArr2[0] = "1LscF1ZcfF08U7LpSibJFf3LFm8iDmJu";
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0897Ny, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        com.facebook.ads.redexgen.core.O4.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public java.lang.String getFirstUrl() {
        android.webkit.WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        if (webBackForwardListCopyBackForwardList.getSize() > 0) {
            return webBackForwardListCopyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = java.lang.System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(com.facebook.ads.redexgen.core.InterfaceC0892Nt interfaceC0892Nt) {
        this.A07.A06(new java.lang.ref.WeakReference<>(interfaceC0892Nt));
    }

    public void setInterceptRedirectRequest(com.facebook.ads.redexgen.core.InterfaceC0890Nr interfaceC0890Nr) {
        this.A07.A05(interfaceC0890Nr);
    }
}
