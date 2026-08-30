package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1229aM extends com.facebook.ads.redexgen.core.C5Y implements com.facebook.ads.internal.api.MediaViewApi, com.facebook.ads.internal.context.Repairable, com.facebook.ads.redexgen.core.InterfaceC04957e {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"opPNeHLRCwNMjghH70VvpS5N8kNNBiJu", "eEOY2RUjN4bpbDsCyz0GPhNNbfKnjNLD", "VFQc0pqb8IELGhnpfLoj2hUSBo2VhTCu", "GBUHck22", "gxS7cL5mKFosIlCCzwl1gr8LaZQoy", "JvRhV7isjcFk5", "Q8NK4BrUIZ6kI5bk", "yT7QEu4e"};
    public static final java.lang.String A0G;
    public android.view.View A00;
    public android.view.View A01;
    public android.widget.ImageView A02;
    public com.facebook.ads.MediaView A03;
    public com.facebook.ads.MediaViewListener A04;
    public com.facebook.ads.MediaViewVideoRenderer A05;
    public com.facebook.ads.internal.api.AdComponentViewParentApi A06;
    public com.facebook.ads.redexgen.core.C1199Zs A07;
    public com.facebook.ads.redexgen.core.C3C A08;
    public com.facebook.ads.redexgen.core.O5 A09;
    public com.facebook.ads.redexgen.core.BN A0A;
    public com.facebook.ads.redexgen.core.QS A0B;
    public boolean A0C;
    public boolean A0D;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A0F;
            if (strArr[6].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0F;
            strArr2[6] = "ck5ggAbj2vioxfDq";
            strArr2[4] = "NneLGMvrJ83sFMBsADIKrHrKRcoTv";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 74);
            i4++;
        }
    }

    public static void A08() {
        A0E = new byte[]{-61, -31, -14, -17, -11, -13, -27, -20, -96, -14, -27, -18, -28, -27, -14, -27, -14, -96, -19, -11, -13, -12, -96, -30, -27, -96, -13, -27, -12, -96, -30, -27, -26, -17, -14, -27, -96, -18, -31, -12, -23, -10, -27, -63, -28, -82, 9, 5, 4, 56, 39, 44, 40, 49, 38, 40, 17, 40, 55, 58, 50, 53, 46, -52, -16, -28, -22, -24, -93, -11, -24, -15, -25, -24, -11, -24, -11, -93, -16, -8, -10, -9, -93, -27, -24, -93, -10, -24, -9, -93, -27, -24, -23, -14, -11, -24, -93, -15, -28, -9, -20, -7, -24, -60, -25, -79, -7, 29, 17, 23, 21, -48, 34, 21, 30, 20, 21, 34, 21, 34, -48, 29, 37, 35, 36, -48, 18, 21, -48, 35, 21, 36, -48, 18, 21, 22, 31, 34, 21, -48, 30, 17, 36, 25, 38, 21, -14, 17, 30, 30, 21, 34, -15, 20, -34, -83, -46, -38, -59, -48, -51, -56, -124, -70, -51, -55, -37, -124, -57, -45, -46, -41, -40, -42, -39, -57, -40, -45, -42, -124, -44, -59, -42, -59, -47, -41, -124, -40, -35, -44, -55, -110, -62, -43, -24, -35, -22, -39, -108, -75, -40, -108, -67, -41, -29, -30, -108, -35, -25, -108, -30, -23, -32, -32, -94, -26, -7, -12, -11, -1, -80, 2, -11, -2, -12, -11, 2, -11, 2, -80, -3, 5, 3, 4, -80, -14, -11, -80, 3, -11, 4, -80, -14, -11, -10, -1, 2, -11, -80, -2, -15, 4, -7, 6, -11, -47, -12, -66, -41, -26, -33, -70, -58, -60, -123, -67, -72, -70, -68, -71, -58, -58, -62, -123, -72, -69, -54, -123, -59, -72, -53, -64, -51, -68, -123, -70, -61, -64, -70, -62, -68, -69, -15, -28, -33, -32, -22, -48, -19, -25, -72};
    }

    static {
        A08();
        A0G = com.facebook.ads.MediaView.class.getSimpleName();
    }

    private void A05() {
        if (this.A0A != null) {
            this.A0A.setVisibility(8);
            com.facebook.ads.redexgen.core.C3T.A0A(this.A0A.getDynamicWebViewController().A0O(), new android.graphics.drawable.ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A06() {
        if (!this.A0D) {
            if (this.A01 != null) {
                com.facebook.ads.redexgen.core.M3.A0J(this.A08);
            }
            float f = com.facebook.ads.redexgen.core.LP.A02;
            float density = 4.0f * f;
            int hPadding = java.lang.Math.round(density);
            float density2 = 12.0f * f;
            int vPadding = java.lang.Math.round(density2);
            this.A08.setChildSpacing(hPadding);
            this.A08.setPadding(0, vPadding, 0, vPadding);
            this.A08.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A01 = this.A08;
            this.A03.addView(this.A01, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException(A04(0, 46, 54));
    }

    private void A07() {
        com.facebook.ads.redexgen.core.LU.A04(this.A03, com.facebook.ads.redexgen.core.LU.A0B);
        com.facebook.ads.redexgen.core.LU.A04(this.A09, com.facebook.ads.redexgen.core.LU.A0B);
        com.facebook.ads.redexgen.core.LU.A04(this.A05, com.facebook.ads.redexgen.core.LU.A0B);
        com.facebook.ads.redexgen.core.LU.A04(this.A01, com.facebook.ads.redexgen.core.LU.A0B);
    }

    private final void A09(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A0A(android.view.View view, com.facebook.ads.redexgen.core.W7 w7) {
        if (this.A0B != null) {
            this.A03.removeView(this.A0B);
        }
        if (!w7.A1f()) {
            return;
        }
        java.lang.String strA1C = w7.A1C();
        if (this.A03.getContext() == null) {
            return;
        }
        this.A0B = com.facebook.ads.redexgen.core.QR.A01(this.A07, strA1C);
        if (this.A0B != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(5, view.getId());
            layoutParams.addRule(7, view.getId());
            layoutParams.addRule(6, view.getId());
            layoutParams.addRule(8, view.getId());
            if (android.os.Build.VERSION.SDK_INT >= 17) {
                layoutParams.addRule(16, view.getId());
                layoutParams.addRule(17, view.getId());
            }
            A09(this.A0B, layoutParams);
            this.A06.bringChildToFront(this.A0B);
        }
    }

    private void A0B(android.widget.ImageView imageView) {
        if (!this.A0D) {
            android.widget.ImageView imageView2 = this.A02;
            if (A0F[5].length() != 13) {
                throw new java.lang.RuntimeException();
            }
            A0F[1] = "0pGJtKTiEG7M1QZmgSqLESVqtH6XSoGw";
            if (imageView2 != null) {
                com.facebook.ads.redexgen.core.M3.A0J(this.A02);
            }
            imageView.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(com.facebook.ads.redexgen.core.M3.A00());
            this.A02 = imageView;
            return;
        }
        throw new java.lang.IllegalStateException(A04(106, 49, 102));
    }

    private final void A0C(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i, int i2, com.facebook.ads.MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new android.widget.ImageView(c1199Zs, attributeSet, i, i2));
        A0H(new com.facebook.ads.redexgen.core.O5(c1199Zs, attributeSet, i, i2));
        this.A08 = new com.facebook.ads.redexgen.core.C3C(c1199Zs, attributeSet, i);
        A06();
        setVideoRenderer(new com.facebook.ads.DefaultMediaViewVideoRenderer(c1199Zs, attributeSet, i, i2));
        A07();
    }

    private final void A0D(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i, com.facebook.ads.MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new android.widget.ImageView(c1199Zs, attributeSet, i));
        A0H(new com.facebook.ads.redexgen.core.O5(c1199Zs, attributeSet, i));
        this.A08 = new com.facebook.ads.redexgen.core.C3C(c1199Zs, attributeSet, i);
        A06();
        setVideoRenderer(new com.facebook.ads.DefaultMediaViewVideoRenderer(c1199Zs, attributeSet, i));
        A07();
    }

    private final void A0E(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, com.facebook.ads.MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new android.widget.ImageView(c1199Zs, attributeSet));
        A0H(new com.facebook.ads.redexgen.core.O5(c1199Zs, attributeSet));
        this.A08 = new com.facebook.ads.redexgen.core.C3C(c1199Zs, attributeSet);
        A06();
        setVideoRenderer(new com.facebook.ads.DefaultMediaViewVideoRenderer(c1199Zs, attributeSet));
        A07();
    }

    private final void A0F(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new android.widget.ImageView(c1199Zs));
        A0H(new com.facebook.ads.redexgen.core.O5(c1199Zs));
        this.A08 = new com.facebook.ads.redexgen.core.C3C(c1199Zs);
        A06();
        setVideoRenderer(new com.facebook.ads.DefaultMediaViewVideoRenderer(c1199Zs));
        A07();
    }

    private void A0G(com.facebook.ads.redexgen.core.W7 w7, boolean z, com.facebook.ads.redexgen.core.JU ju) {
        com.facebook.ads.redexgen.core.AsyncTaskC1068Un asyncTaskC1068UnA04 = new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A02, this.A07).A04();
        if (z) {
            asyncTaskC1068UnA04.A06(new com.facebook.ads.redexgen.core.C1236aT(this, w7));
        }
        asyncTaskC1068UnA04.A07(ju.getUrl());
    }

    private void A0H(com.facebook.ads.redexgen.core.O5 o5) {
        if (!this.A0D) {
            if (this.A09 != null) {
                this.A03.removeView(this.A09);
            }
            o5.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(o5, layoutParams);
            this.A09 = o5;
            return;
        }
        throw new java.lang.IllegalStateException(A04(63, 43, 57));
    }

    private boolean A0I(com.facebook.ads.NativeAd nativeAd) {
        java.util.List<com.facebook.ads.NativeAd> carousel = ((com.facebook.ads.redexgen.core.C04555k) nativeAd.getNativeAdApi()).A03();
        if (carousel == null) {
            return false;
        }
        java.util.Iterator<com.facebook.ads.NativeAd> it = carousel.iterator();
        while (it.hasNext()) {
            if (it.next().getAdCoverImage() == null) {
                return false;
            }
        }
        if (A0F[5].length() != 13) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0F;
        strArr[6] = "NNKiamhSotpSBh0S";
        strArr[4] = "WQowSckFUFZtjqKDGN1yGWQ8HKryj";
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(com.facebook.ads.NativeAd nativeAd) {
        return android.os.Build.VERSION.SDK_INT >= 14 && !android.text.TextUtils.isEmpty(((com.facebook.ads.redexgen.core.C04555k) nativeAd.getNativeAdApi()).A02());
    }

    /* JADX WARN: Code duplicated, block: B:67:0x02f3  */
    public final void A0L(com.facebook.ads.NativeAd nativeAd) {
        com.facebook.ads.redexgen.core.AbstractC1342cE c0691Fo;
        android.view.ViewParent parent;
        com.facebook.ads.redexgen.core.C1199Zs adObjectContext = ((com.facebook.ads.redexgen.core.W7) nativeAd.getInternalNativeAd()).A11();
        adObjectContext.A0N(this);
        this.A07.A0K(adObjectContext);
        this.A07.A0J(adObjectContext.A0E());
        this.A0D = true;
        com.facebook.ads.redexgen.core.W7 w7A0L = com.facebook.ads.redexgen.core.W7.A0L(nativeAd.getInternalNativeAd());
        w7A0L.A1S(this.A03);
        this.A02.setVisibility(8);
        this.A02.setImageDrawable(null);
        if (w7A0L.A0z() != null && w7A0L.A0z().A19()) {
            if (!android.text.TextUtils.isEmpty(w7A0L.A0z().A1P().A0E().A08())) {
                w7A0L.A11().A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A0A);
            } else {
                w7A0L.A11().A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A09);
            }
            A05();
            this.A09.setVisibility(8);
            this.A09.setImage(null, null);
            this.A05.setVisibility(8);
            this.A05.unsetNativeAd();
            ((com.facebook.ads.redexgen.core.C04525h) this.A05.getMediaViewVideoRendererApi()).A03();
            if (this.A01 != null) {
                this.A01.setVisibility(8);
                if (this.A01 instanceof com.facebook.ads.redexgen.core.C0895Nw) {
                    ((com.facebook.ads.redexgen.core.C0895Nw) this.A01).A04();
                } else {
                    ((com.facebook.ads.redexgen.core.FL) this.A01).setAdapter(null);
                }
            }
            A01(false);
            this.A0A = new com.facebook.ads.redexgen.core.BN(this.A07, this.A07.A09(), new com.facebook.ads.redexgen.core.C1234aR(this, w7A0L, nativeAd), w7A0L.A0z(), A04(261, 31, 13), 4, w7A0L.A19());
            com.facebook.ads.redexgen.core.LU.A04(this.A0A, com.facebook.ads.redexgen.core.LU.A0B);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            this.A03.addView(this.A0A, layoutParams);
            this.A00 = this.A0A;
            bringChildToFront(this.A0A);
            this.A0A.setVisibility(0);
            A0A(this.A0A, w7A0L);
            A01(true);
            return;
        }
        if (A0I(nativeAd)) {
            w7A0L.A11().A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A04);
            boolean z = w7A0L.A17() == com.facebook.ads.redexgen.core.JX.A0B;
            if (!com.facebook.ads.redexgen.core.C0762Im.A2i(this.A07) || z) {
                this.A01 = this.A08;
                ((com.facebook.ads.redexgen.core.C3C) this.A01).setCurrentPosition(0);
                ((com.facebook.ads.redexgen.core.C3C) this.A01).setShowTextInCarousel(z);
                if (!z) {
                    c0691Fo = new com.facebook.ads.redexgen.core.C0691Fo((com.facebook.ads.redexgen.core.C3C) this.A01, w7A0L.A1H(), this.A07);
                } else {
                    c0691Fo = new com.facebook.ads.redexgen.core.Fp(this.A07, (com.facebook.ads.redexgen.core.C3C) this.A01, w7A0L.A1H(), w7A0L.A16());
                }
                c0691Fo.A0G(new com.facebook.ads.redexgen.core.C1233aQ(this, w7A0L));
                ((com.facebook.ads.redexgen.core.FL) this.A01).setAdapter(c0691Fo);
            } else {
                A01(false);
                int width = this.A03.getWidth();
                if (width == 0) {
                    if (this.A03.getParent() instanceof android.view.ViewGroup) {
                        parent = this.A03.getParent();
                    } else {
                        parent = null;
                    }
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    while (width == 0 && viewGroup != null) {
                        width = viewGroup.getWidth();
                        boolean z2 = viewGroup.getParent() instanceof android.view.ViewGroup;
                        java.lang.String[] strArr = A0F;
                        if (strArr[2].charAt(31) != strArr[0].charAt(31)) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A0F;
                        strArr2[6] = "X2xGJjQ8zu6cU8Eo";
                        strArr2[4] = "AZj2zr3QMe0wQwV9kynIxRcnRDB4X";
                        viewGroup = (android.view.ViewGroup) (z2 ? viewGroup.getParent() : null);
                    }
                }
                com.facebook.ads.redexgen.core.M3.A0J(this.A01);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                this.A01 = new com.facebook.ads.redexgen.core.C0895Nw(this.A07);
                this.A03.addView(this.A01, layoutParams2);
                ((com.facebook.ads.redexgen.core.C0895Nw) this.A01).A05(w7A0L, width);
                com.facebook.ads.redexgen.core.M3.A0K(this.A01);
                A01(true);
            }
            this.A00 = this.A01;
            A05();
            this.A09.setVisibility(8);
            this.A09.setImage(null, null);
            this.A05.setVisibility(8);
            this.A05.unsetNativeAd();
            ((com.facebook.ads.redexgen.core.C04525h) this.A05.getMediaViewVideoRendererApi()).A03();
            bringChildToFront(this.A01);
            this.A01.setVisibility(0);
            A0A(this.A01, w7A0L);
            return;
        }
        boolean zA0J = A0J(nativeAd);
        java.lang.String[] strArr3 = A0F;
        if (strArr3[3].length() != strArr3[7].length()) {
            throw new java.lang.RuntimeException();
        }
        A0F[5] = "QrlGDx1qLp0kN";
        if (zA0J) {
            w7A0L.A11().A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A0D);
            w7A0L.A1d(this.A0C);
            this.A00 = this.A05.getMediaViewVideoRendererApi().getVideoView();
            A05();
            this.A09.setVisibility(8);
            this.A09.setImage(null, null);
            if (this.A01 != null) {
                this.A01.setVisibility(8);
                if (this.A01 instanceof com.facebook.ads.redexgen.core.C0895Nw) {
                    ((com.facebook.ads.redexgen.core.C0895Nw) this.A01).A04();
                } else {
                    ((com.facebook.ads.redexgen.core.FL) this.A01).setAdapter(null);
                }
            }
            bringChildToFront(this.A05);
            com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer = this.A05;
            java.lang.String[] strArr4 = A0F;
            if (strArr4[2].charAt(31) != strArr4[0].charAt(31)) {
                java.lang.String[] strArr5 = A0F;
                strArr5[2] = "KRt7yuKunmEFowe58PEdTHnfFAzQvUNu";
                strArr5[0] = "FpiuEPXAVB8biFGx18DJjcPDa6TrT1Ju";
                mediaViewVideoRenderer.setNativeAd(nativeAd);
                ((com.facebook.ads.redexgen.core.C04525h) this.A05.getMediaViewVideoRendererApi()).A04(nativeAd);
                this.A05.setVisibility(0);
                if (w7A0L.getAdCoverImage() != null) {
                    new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A03, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new com.facebook.ads.redexgen.core.C1232aP(this, w7A0L)).A07(w7A0L.getAdCoverImage().getUrl());
                }
            } else {
                java.lang.String[] strArr6 = A0F;
                strArr6[6] = "rknJE6EzKshvoL3E";
                strArr6[4] = "1VlRGSe6v9ZgAEzaXTE4MJVCDSD8V";
                mediaViewVideoRenderer.setNativeAd(nativeAd);
                ((com.facebook.ads.redexgen.core.C04525h) this.A05.getMediaViewVideoRendererApi()).A04(nativeAd);
                this.A05.setVisibility(0);
                if (w7A0L.getAdCoverImage() != null) {
                    new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A03, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new com.facebook.ads.redexgen.core.C1232aP(this, w7A0L)).A07(w7A0L.getAdCoverImage().getUrl());
                }
            }
            if (com.facebook.ads.internal.api.BuildConfigApi.isDebug()) {
                android.util.Log.i(A0G, A04(292, 9, 49) + ((com.facebook.ads.redexgen.core.C04555k) nativeAd.getNativeAdApi()).A02());
            }
            A0A(this.A05, w7A0L);
            return;
        }
        if (nativeAd.getAdCoverImage() == null) {
            return;
        }
        w7A0L.A11().A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A0B);
        this.A00 = this.A09.getBodyImageView();
        A05();
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((com.facebook.ads.redexgen.core.C04525h) this.A05.getMediaViewVideoRendererApi()).A03();
        if (this.A01 != null) {
            this.A01.setVisibility(8);
            if (this.A01 instanceof com.facebook.ads.redexgen.core.C0895Nw) {
                ((com.facebook.ads.redexgen.core.C0895Nw) this.A01).A04();
            } else {
                ((com.facebook.ads.redexgen.core.FL) this.A01).setAdapter(null);
            }
        }
        bringChildToFront(this.A09);
        this.A09.setVisibility(0);
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A09, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new com.facebook.ads.redexgen.core.C1231aO(this, w7A0L)).A07(w7A0L.getAdCoverImage().getUrl());
        A0A(this.A09, w7A0L);
    }

    public final void A0M(com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi, boolean z) {
        com.facebook.ads.redexgen.core.C1199Zs c1199ZsA11 = ((com.facebook.ads.redexgen.core.W7) nativeAdBaseApi).A11();
        com.facebook.ads.redexgen.core.C1199Zs adObjectContext = this.A07;
        adObjectContext.A0K(c1199ZsA11);
        c1199ZsA11.A0N(this);
        this.A0D = true;
        com.facebook.ads.redexgen.core.W7 w7A0L = com.facebook.ads.redexgen.core.W7.A0L(nativeAdBaseApi);
        w7A0L.A1R(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((com.facebook.ads.redexgen.core.C04525h) this.A05.getMediaViewVideoRendererApi()).A03();
        if (this.A01 != null) {
            this.A01.setVisibility(8);
            if (this.A01 instanceof com.facebook.ads.redexgen.core.C0895Nw) {
                ((com.facebook.ads.redexgen.core.C0895Nw) this.A01).A04();
            } else {
                ((com.facebook.ads.redexgen.core.FL) this.A01).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        com.facebook.ads.redexgen.core.JU adIcon = w7A0L.getAdIcon();
        if (adIcon != null) {
            com.facebook.ads.redexgen.core.C04766f c04766fA10 = w7A0L.A10();
            if (A0F[1].charAt(7) == 'A') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0F;
            strArr[3] = "8vonm0Gh";
            strArr[7] = "EfYx5Mmt";
            android.graphics.Bitmap bitmapA0M = c04766fA10.A0M(adIcon.getUrl());
            if (bitmapA0M != null) {
                this.A02.setImageBitmap(bitmapA0M);
                if (z) {
                    this.A03.post(new com.facebook.ads.redexgen.core.C1237aU(this, w7A0L));
                }
            } else {
                A0G(w7A0L, z, adIcon);
            }
        } else {
            com.facebook.ads.redexgen.core.W6 w6A15 = w7A0L.A15();
            com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            c1199ZsA11.A0E().A38(w7A0L.A0x(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (w6A15 != null) {
                w6A15.ABs(com.facebook.ads.redexgen.core.C0779Jg.A00(adErrorType));
            }
            android.util.Log.e(A04(46, 17, 121), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                com.facebook.ads.redexgen.core.C1199Zs adObjectContext2 = this.A07;
                adObjectContext2.A07().AA0(A04(258, 3, 44), com.facebook.ads.redexgen.core.C8E.A0W, new com.facebook.ads.redexgen.core.C8F(A04(192, 23, 42)));
            }
        }
        A0A(this.A02, w7A0L);
    }

    public final boolean A0N() {
        if (this.A01 != null) {
            android.view.View view = this.A01;
            if (A0F[5].length() != 13) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0F;
            strArr[3] = "f43XNCk8";
            strArr[7] = "DdRxJSTL";
            if (view.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04957e
    public final com.facebook.ads.redexgen.core.C1199Zs A6G() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(android.view.View view) {
        if (view != this.A01 && view != this.A05 && view != this.A09) {
            android.widget.ImageView imageView = this.A02;
            if (A0F[5].length() != 13) {
                throw new java.lang.RuntimeException();
            }
            A0F[1] = "R8dYcckG0onv7yQggjKFRkmHXZbq9UJh";
            if (view != imageView) {
                return;
            }
        }
        this.A06.bringChildToFront(view);
        if (this.A0B != null) {
            this.A06.bringChildToFront(this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final com.facebook.ads.internal.api.AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final android.view.View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r3.getVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r4.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r3.getVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r4.A03.getVisibility() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        return r4.A03.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        return 0;
     */
    @Override // com.facebook.ads.internal.api.MediaViewApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            int imageWidth = this.A09.getImageWidth();
            java.lang.String[] strArr = A0F;
            if (strArr[2].charAt(31) != strArr[0].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0F;
            strArr2[6] = "us0p5hBNoGIfish2";
            strArr2[4] = "DFvDCw92fILzmemlu9XfPwpsPQRiq";
            return imageWidth;
        }
        com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer = this.A05;
        if (A0F[1].charAt(7) != 'A') {
            java.lang.String[] strArr3 = A0F;
            strArr3[3] = "7zc9sXuG";
            strArr3[7] = "ncWuDUJK";
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(com.facebook.ads.internal.api.AdViewConstructorParams adViewConstructorParams, com.facebook.ads.MediaView mediaView) {
        android.content.Context context = adViewConstructorParams.getContext();
        if (context instanceof com.facebook.ads.redexgen.core.C1199Zs) {
            this.A07 = (com.facebook.ads.redexgen.core.C1199Zs) context;
        } else {
            this.A07 = com.facebook.ads.redexgen.core.C04465b.A03(context);
        }
        this.A07.A0N(this);
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                A0F(this.A07, mediaView);
                break;
            case 1:
                A0E(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
                break;
            case 2:
                com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A07;
                android.util.AttributeSet attributeSet = adViewConstructorParams.getAttributeSet();
                if (A0F[1].charAt(7) == 'A') {
                    throw new java.lang.RuntimeException();
                }
                A0F[1] = "4tObUcmoIw93Quo4uXvWt9YCbUPkknut";
                A0D(c1199Zs, attributeSet, adViewConstructorParams.getDefStyleAttr(), mediaView);
                break;
                break;
            case 3:
                A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
                break;
            default:
                throw new java.lang.IllegalArgumentException(A04(155, 37, 26));
        }
        A01(true);
    }

    @Override // com.facebook.ads.redexgen.core.C5Y, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(com.facebook.ads.internal.api.AdComponentView adComponentView, com.facebook.ads.internal.api.AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(java.lang.Throwable th) {
        int width = this.A03.getWidth();
        int currentHeight = this.A03.getHeight();
        if (width > 0 && currentHeight > 0) {
            this.A03.repair(th);
            this.A03.getLayoutParams().width = width;
            this.A03.getLayoutParams().height = currentHeight;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(com.facebook.ads.MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((com.facebook.ads.redexgen.core.C04525h) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((com.facebook.ads.redexgen.core.C04525h) this.A05.getMediaViewVideoRendererApi()).A07(new com.facebook.ads.redexgen.core.C1230aN(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            if (this.A05 != null) {
                this.A03.removeView(this.A05);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((com.facebook.ads.redexgen.core.C04525h) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A09());
            mediaViewVideoRenderer.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((com.facebook.ads.redexgen.core.C1229aM) this.A03.getMediaViewApi()).A09(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(this.A05 instanceof com.facebook.ads.DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(com.facebook.ads.redexgen.core.M3.A00());
            return;
        }
        throw new java.lang.IllegalStateException(A04(215, 43, 70));
    }
}
