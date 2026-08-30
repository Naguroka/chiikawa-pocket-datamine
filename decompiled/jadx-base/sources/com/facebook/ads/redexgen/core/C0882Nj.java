package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0882Nj extends android.widget.LinearLayout {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"SfnKd94fp0LIHLn5JRYBcVoydcWvvWC", "zcIUR0bnd2fDOpnzxhHInmQw6nqRGEtO", "", "Rlzv6bB7Czucpp1t79MjvCXFuIOZg8dc", "c1MACJD11uXVhN3Ickl6ZqMudEgzXQA", "WTgVZUaV9yT0hbCJXLqGbS", "77CVi", "3ZIeaeVMqGSC8jDTqrHFXNca0PmxnycW"};
    public static final int A0G;
    public static final int A0H;
    public static final android.net.Uri A0I;
    public static final android.view.View.OnTouchListener A0J;
    public android.widget.ImageView A00;
    public android.widget.ImageView A01;
    public android.widget.ImageView A02;
    public android.widget.ImageView A03;
    public android.widget.LinearLayout A04;
    public com.facebook.ads.redexgen.core.InterfaceC0881Ni A05;
    public com.facebook.ads.redexgen.core.C0888Np A06;
    public java.lang.String A07;
    public boolean A08;
    public final float A09;
    public final android.webkit.WebView A0A;
    public final com.facebook.ads.redexgen.core.C1199Zs A0B;
    public final com.facebook.ads.redexgen.core.InterfaceC0892Nt A0C;
    public final boolean A0D;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 59);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0E = new byte[]{-23, 8, 10, 18, -114, -73, -70, -66, -80, -22, 19, 22, 27, 5, 22, 8, -74, -41, -52, -43, -121, -43, -56, -37, -48, -35, -52, -121, -55, -39, -42, -34, -38, -52, -39, -6, -5, 8, 14, 13, -45, -5, 5, -6, 7, 4, 23, 36, 26, 40, 37, 31, 26, -28, 31, 36, 42, 27, 36, 42, -28, 23, 25, 42, 31, 37, 36, -28, 12, -1, -5, 13, 18, 30, 28, -35, 16, 29, 19, 33, 30, 24, 19, -35, 18, 23, 33, 30, 28, 20, -68, -56, -56, -60, -114, -125, -125, -53, -53, -53, -126, -70, -75, -73, -71, -74, -61, -61, -65, -126, -73, -61, -63};
    }

    static {
        A0A();
        A0G = android.graphics.Color.rgb(224, 224, 224);
        A0I = com.facebook.ads.redexgen.core.L5.A00(A06(90, 23, 25));
        A0J = new com.facebook.ads.redexgen.core.ViewOnTouchListenerC0876Nd();
        A0H = android.graphics.Color.argb(34, 0, 0, 0);
    }

    public C0882Nj(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.webkit.WebView webView) {
        this(c1199Zs, webView, false);
    }

    public C0882Nj(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.webkit.WebView webView, boolean z) {
        super(c1199Zs);
        this.A09 = getResources().getDisplayMetrics().density;
        this.A0C = new com.facebook.ads.redexgen.core.V0(this);
        this.A0A = webView;
        this.A0B = c1199Zs;
        this.A08 = com.facebook.ads.redexgen.core.AbstractC0763In.A06(c1199Zs);
        this.A0D = z;
        A08();
    }

    private void A08() {
        int buttonSizePx;
        int i = (int) (this.A09 * 50.0f);
        com.facebook.ads.redexgen.core.M3.A0M(this, -1);
        setGravity(16);
        this.A01 = new android.widget.ImageView(this.A0B);
        this.A01.setContentDescription(A06(4, 5, 16));
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i, i);
        this.A01.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0J);
        this.A01.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0877Ne(this));
        addView(this.A01, layoutParams);
        if (this.A08 && !com.facebook.ads.redexgen.core.C0762Im.A2j(this.A0B)) {
            this.A00 = new android.widget.ImageView(this.A0B);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 108));
            android.view.ViewGroup.LayoutParams backButtonParams = new android.widget.LinearLayout.LayoutParams(i, i);
            this.A00.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.BACK_ARROW));
            this.A00.setOnTouchListener(A0J);
            this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0878Nf(this));
            addView(this.A00, backButtonParams);
        }
        this.A06 = new com.facebook.ads.redexgen.core.C0888Np(this.A0B);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
        if (this.A08 || com.facebook.ads.redexgen.core.C0762Im.A2j(this.A0B)) {
            buttonSizePx = 1056964608;
        } else {
            buttonSizePx = 1065353216;
        }
        layoutParams2.weight = buttonSizePx;
        this.A06.setGravity(17);
        if (com.facebook.ads.redexgen.core.C0762Im.A2j(this.A0B) && !this.A0D) {
            this.A04 = new android.widget.LinearLayout(this.A0B);
            this.A04.setOrientation(1);
            android.widget.LinearLayout linearLayout = this.A04;
            int i2 = (int) (this.A09 * 2.0f);
            int buttonSizePx2 = (int) (this.A09 * 2.0f);
            linearLayout.setPadding(0, i2, 0, buttonSizePx2);
            layoutParams2.setMarginStart(0);
            addView(this.A04, layoutParams2);
            android.widget.ImageView imageView = new android.widget.ImageView(this.A0B);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.HANDLER));
            int i3 = (int) (this.A09 * 4.0f);
            int buttonSizePx3 = (int) (this.A09 * 4.0f);
            imageView.setPadding(0, i3, 0, buttonSizePx3);
            this.A04.addView(imageView, new android.widget.LinearLayout.LayoutParams(-1, -2));
            android.widget.LinearLayout.LayoutParams titleViewsParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(this.A06, titleViewsParams);
        } else {
            addView(this.A06, layoutParams2);
        }
        if (this.A08 && !com.facebook.ads.redexgen.core.C0762Im.A2j(this.A0B)) {
            this.A02 = new android.widget.ImageView(this.A0B);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 105));
            android.view.ViewGroup.LayoutParams titleViewsParams2 = new android.widget.LinearLayout.LayoutParams(i, i);
            this.A02.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(com.facebook.ads.redexgen.core.MC.A02(com.facebook.ads.redexgen.core.MB.BACK_ARROW));
            this.A02.setOnTouchListener(A0J);
            this.A02.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0879Ng(this));
            addView(this.A02, titleViewsParams2);
        }
        this.A03 = new android.widget.ImageView(this.A0B);
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(i, i);
        this.A03.setContentDescription(A06(16, 19, 44));
        this.A03.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0J);
        this.A03.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC0880Nh(this));
        addView(this.A03, layoutParams3);
        A09();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0092  */
    private void A09() {
        android.content.pm.PackageManager packageManager = this.A0B.getPackageManager();
        android.graphics.Bitmap bitmapA01 = null;
        if (packageManager != null) {
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new android.content.Intent(A06(46, 26, 123), A0I), 65536);
            if (listQueryIntentActivities.isEmpty()) {
                this.A03.setVisibility(8);
            } else if (listQueryIntentActivities.size() == 1 && listQueryIntentActivities.get(0).activityInfo != null) {
                if (A06(72, 18, 116).equals(listQueryIntentActivities.get(0).activityInfo.packageName)) {
                    com.facebook.ads.redexgen.core.MB mb = com.facebook.ads.redexgen.core.MB.BROWSER_LAUNCH_CHROME;
                    if (A0F[2].length() == 9) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A0F;
                    strArr[4] = "u6Y9G9nX8SS9WzQYhqSHhnICOqiH6N8";
                    strArr[0] = "u87jsv4Qx8TBqcflHkBU630hheaj5W5";
                    bitmapA01 = com.facebook.ads.redexgen.core.MC.A01(mb);
                } else {
                    bitmapA01 = com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.BROWSER_LAUNCH_NATIVE);
                }
            } else {
                bitmapA01 = com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.BROWSER_LAUNCH_NATIVE);
            }
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A2j(this.A0B)) {
            this.A03.setVisibility(0);
            bitmapA01 = com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.BROWSER_LAUNCH_NATIVE);
        }
        this.A03.setImageBitmap(bitmapA01);
    }

    public com.facebook.ads.redexgen.core.InterfaceC0892Nt getBrowserNavigationListener() {
        return this.A0C;
    }

    public void setListener(com.facebook.ads.redexgen.core.InterfaceC0881Ni interfaceC0881Ni) {
        this.A05 = interfaceC0881Ni;
    }

    public void setTitle(java.lang.String str) {
        this.A06.setTitle(str);
    }

    public void setUrl(java.lang.String str) {
        this.A07 = str;
        if (android.text.TextUtils.isEmpty(this.A07) || A06(35, 11, 94).equals(this.A07)) {
            this.A06.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new android.graphics.PorterDuffColorFilter(A0G, android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            this.A06.setSubtitle(this.A07);
            this.A03.setEnabled(true);
            this.A03.setColorFilter((android.graphics.ColorFilter) null);
        }
    }
}
