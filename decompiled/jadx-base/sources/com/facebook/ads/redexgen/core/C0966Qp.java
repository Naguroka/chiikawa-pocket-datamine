package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0966Qp extends android.widget.RelativeLayout {
    public static java.lang.String[] A03 = {"Ym3c0mHmt8I3OfABPCOx9UJ2Q16UuduY", "K4DkQJV", "KARr27mhou56jkSxhuic5Eo8", "doL6IsbVcBXoE3lEPdAb4lspmNlkYQBg", "ZiamaIcezCYLNnFM0CzM2w39hefukKsr", "QAAEQWAERntefxGdirzkY0W9ygCVb18Z", "ecvamyNjiJSZyZ2FY2suHBqgS12IICXX", "BDk4Rb0w5P1ojifCZQT7pVNvZTakDsaU"};
    public com.facebook.ads.redexgen.core.C7V A00;
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0965Qo> A01;
    public final com.facebook.ads.redexgen.core.InterfaceC0982Rf A02;

    public C0966Qp(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.InterfaceC0982Rf interfaceC0982Rf) {
        super(c1199Zs);
        this.A02 = interfaceC0982Rf;
        com.facebook.ads.redexgen.core.M3.A0J((android.view.View) this.A02);
        addView(this.A02.getView(), new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(com.facebook.ads.redexgen.core.AbstractC1015Sm abstractC1015Sm) {
        addView(abstractC1015Sm, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (com.facebook.ads.redexgen.core.C7V) abstractC1015Sm;
    }

    public final void A01(com.facebook.ads.redexgen.core.AbstractC1015Sm abstractC1015Sm) {
        com.facebook.ads.redexgen.core.M3.A0J(abstractC1015Sm);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A91();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((android.view.View) this.A02).layout(0, 0, getWidth(), getHeight());
        if (this.A00 != null) {
            this.A00.layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = false;
        int heightSpecSize = this.A02.getVideoWidth();
        int widthSpecMode = this.A02.getVideoHeight();
        int width = getDefaultSize(heightSpecSize, i);
        int height = getDefaultSize(widthSpecMode, i2);
        if (heightSpecSize > 0 && widthSpecMode > 0) {
            z = true;
            int mode = android.view.View.MeasureSpec.getMode(i);
            int heightSpecMode = android.view.View.MeasureSpec.getSize(i);
            int widthSpecSize = android.view.View.MeasureSpec.getMode(i2);
            int mVideoHeight = android.view.View.MeasureSpec.getSize(i2);
            if (mode != 1073741824 || widthSpecSize != 1073741824) {
                if (mode == 1073741824) {
                    width = heightSpecMode;
                    height = (width * widthSpecMode) / heightSpecSize;
                    if (widthSpecSize == Integer.MIN_VALUE && height > mVideoHeight) {
                        height = mVideoHeight;
                    }
                } else if (widthSpecSize == 1073741824) {
                    height = mVideoHeight;
                    width = (height * heightSpecSize) / widthSpecMode;
                    if (mode == Integer.MIN_VALUE && width > heightSpecMode) {
                        width = heightSpecMode;
                    }
                } else {
                    width = heightSpecSize;
                    height = widthSpecMode;
                    if (widthSpecSize == Integer.MIN_VALUE && height > mVideoHeight) {
                        height = mVideoHeight;
                        width = (height * heightSpecSize) / widthSpecMode;
                    }
                    if (mode == Integer.MIN_VALUE && width > heightSpecMode) {
                        width = heightSpecMode;
                        height = (width * widthSpecMode) / heightSpecSize;
                    }
                }
            } else {
                width = heightSpecMode;
                height = mVideoHeight;
                int mVideoWidth = heightSpecSize * height;
                if (mVideoWidth < width * widthSpecMode) {
                    int width2 = height * heightSpecSize;
                    java.lang.String[] strArr = A03;
                    java.lang.String str = strArr[2];
                    java.lang.String str2 = strArr[1];
                    int mVideoWidth2 = str.length();
                    if (mVideoWidth2 == str2.length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A03;
                    strArr2[5] = "U4zbj2Wm0uAraatZAyMG0dkAaN2sbGyV";
                    strArr2[7] = "NaQeXa1xIolrwrGsNa3PifVvRhjqFXGF";
                    width = width2 / widthSpecMode;
                } else {
                    int mVideoWidth3 = heightSpecSize * height;
                    if (mVideoWidth3 > width * widthSpecMode) {
                        height = (width * widthSpecMode) / heightSpecSize;
                    }
                }
            }
        }
        setMeasuredDimension(width, height);
        if (!z || this.A01 == null) {
            return;
        }
        java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC0965Qo> weakReference = this.A01;
        int mVideoWidth4 = A03[6].charAt(8);
        if (mVideoWidth4 != 105) {
            throw new java.lang.RuntimeException();
        }
        A03[3] = "u6I59svdNPk3v5MrivI4HijRJO25VXOb";
        if (weakReference.get() != null) {
            this.A01.get().AE2();
        }
    }

    public void setViewImplInflationListener(com.facebook.ads.redexgen.core.InterfaceC0965Qo interfaceC0965Qo) {
        this.A01 = new java.lang.ref.WeakReference<>(interfaceC0965Qo);
    }
}
