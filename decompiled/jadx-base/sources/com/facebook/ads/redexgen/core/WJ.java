package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WJ extends com.facebook.ads.redexgen.core.C5Y implements com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static java.lang.String[] A0G = {"gicLODNc4Ss02ASp0SH6jYH1jReGCf7D", "ud1g41PfTpgHVgN2zMRJY9l5AGp7t", "qgXpVhlOa1wHLevNk8n", "YvRZAMwcrsdunGxdPmTtNWzK4vSRpQc4", "eiRiwAROr6ki2Hau4nBgoUP0cJGv3yGG", "AknM7mKZVSENDtzyALrGWQlwPvra0WAt", "RqySj6gASebQYnIOdgQzgXbIWVvFlmni", "rcToBCOkHOudlFUS35924ELLk4KD1"};
    public static final java.lang.String A0H;
    public com.facebook.ads.MediaViewVideoRenderer A00;
    public com.facebook.ads.redexgen.core.C1199Zs A01;
    public com.facebook.ads.redexgen.core.JP A02;
    public com.facebook.ads.redexgen.core.C0606Bu A04;
    public com.facebook.ads.redexgen.core.C7V A05;
    public com.facebook.ads.redexgen.core.C7O A06;
    public com.facebook.ads.redexgen.core.AbstractC0986Rj A07;
    public com.facebook.ads.redexgen.core.C0987Rk A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final com.facebook.ads.redexgen.core.InterfaceC0965Qo A0C = new com.facebook.ads.redexgen.core.WP(this);
    public final java.util.concurrent.atomic.AtomicBoolean A0D = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean A0E = new java.util.concurrent.atomic.AtomicBoolean(false);
    public com.facebook.ads.redexgen.core.JZ A03 = com.facebook.ads.redexgen.core.JZ.A03;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 77);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{11, 44, 52, 35, 46, 43, 38, 98, 48, 39, 44, 38, 39, 48, 39, 48, 98, 33, 42, 43, 46, 38, 98, 33, 45, 44, 36, 43, 37, 108, 7, 47, 46, 35, 43, 28, 35, 47, kotlin.io.encoding.Base64.padSymbol, 28, 35, 46, 47, 37, 106, 35, 57, 106, 36, okio.Utf8.REPLACEMENT_BYTE, 38, 38, 113, 106, okio.Utf8.REPLACEMENT_BYTE, 36, 43, 40, 38, 47, 106, 62, 37, 106, 44, 35, 36, 46, 106, 35, 62, 100, 122, 65, 78, 77, 67, 74, 15, 91, 64, 15, 73, 70, 65, 75, 15, 98, 74, 75, 70, 78, 121, 70, 74, 88, 121, 70, 75, 74, 64, 15, 76, 71, 70, 67, 75, 1};
    }

    static {
        A0E();
        A0H = com.facebook.ads.redexgen.core.WJ.class.getSimpleName();
    }

    private com.facebook.ads.redexgen.core.WO A00(com.facebook.ads.internal.api.MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new com.facebook.ads.redexgen.core.WO(this, mediaViewVideoRendererApi);
    }

    private com.facebook.ads.redexgen.core.WN A01(com.facebook.ads.internal.api.MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new com.facebook.ads.redexgen.core.WN(this, mediaViewVideoRendererApi);
    }

    private com.facebook.ads.redexgen.core.WL A02() {
        return new com.facebook.ads.redexgen.core.WL(this);
    }

    private com.facebook.ads.redexgen.core.C0987Rk A05() {
        return new com.facebook.ads.redexgen.core.C0987Rk(this.A00, 50, true, new java.lang.ref.WeakReference(this.A07), this.A01);
    }

    private void A09() {
        if (this.A04 != null) {
            com.facebook.ads.redexgen.core.C0606Bu c0606Bu = this.A04;
            if (A0G[6].charAt(16) != 'd') {
                throw new java.lang.RuntimeException();
            }
            A0G[5] = "Ntv0Vby76dSesAjQjgB6ptCIElpzOEzL";
            ((com.facebook.ads.redexgen.core.C0966Qp) c0606Bu.getVideoView()).setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        if (this.A04 != null) {
            this.A04.getVideoView().setOnTouchListener(new com.facebook.ads.redexgen.core.JO(this));
        }
    }

    private void A0B() {
        if (this.A04 != null) {
            ((com.facebook.ads.redexgen.core.C0966Qp) this.A04.getVideoView()).setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09 && this.A00.hasWindowFocus()) {
            this.A08.A0U();
            return;
        }
        if (this.A04 != null) {
            com.facebook.ads.redexgen.core.EnumC0984Rh state = this.A04.getState();
            java.lang.String[] strArr = A0G;
            if (strArr[7].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A0G[4] = "z79LrkWpr7afRwAllWq14kp6jWBswbkV";
            if (state == com.facebook.ads.redexgen.core.EnumC0984Rh.A05) {
                this.A0B = true;
            }
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = com.facebook.ads.redexgen.core.JZ.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(com.facebook.ads.redexgen.core.W7 w7, com.facebook.ads.redexgen.core.JP jp2) {
        java.lang.String url;
        this.A0A = false;
        this.A0B = false;
        this.A02 = jp2;
        A09();
        com.facebook.ads.redexgen.core.C7V c7v = this.A05;
        if (w7 != null && w7.getAdCoverImage() != null) {
            com.facebook.ads.redexgen.core.JU adCoverImage = w7.getAdCoverImage();
            java.lang.String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new java.lang.RuntimeException();
            }
            A0G[5] = "TnDtOWvYiNMfLmp09Wf7ctnD5adJ0dsa";
            url = adCoverImage.getUrl();
        } else {
            url = null;
        }
        c7v.setImage(url, new com.facebook.ads.redexgen.core.WM(this));
        this.A03 = w7.A18();
        this.A06.setPlayAccessibilityLabel(w7.A1E());
        this.A06.setPauseAccessibilityLabel(w7.A1D());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(com.facebook.ads.redexgen.core.EnumC0969Qs enumC0969Qs) {
        if (this.A04 != null) {
            this.A04.A0b(enumC0969Qs, 24);
        } else {
            if (!com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                return;
            }
            android.util.Log.e(A0H, A06(30, 42, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        if (this.A04 == null || this.A04.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A06) {
            return false;
        }
        return this.A03 == com.facebook.ads.redexgen.core.JZ.A05 || this.A03 == com.facebook.ads.redexgen.core.JZ.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(android.content.Context context, com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer, com.facebook.ads.internal.api.MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        com.facebook.ads.redexgen.core.JR jrA01;
        ((com.facebook.ads.redexgen.core.C5Y) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i) {
            case 0:
                jrA01 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                jrA01 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new java.lang.IllegalArgumentException(A06(0, 30, 15));
        }
        ((com.facebook.ads.redexgen.core.C04525h) mediaViewVideoRendererApi).A06(jrA01);
        this.A01 = com.facebook.ads.redexgen.core.C04465b.A03(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new com.facebook.ads.redexgen.core.C7V(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float density = com.facebook.ads.redexgen.core.LP.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new com.facebook.ads.redexgen.core.C7O(this.A01);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        int i2 = 0;
        while (true) {
            int i3 = this.A00.getChildCount();
            if (A0G[2].length() == 26) {
                throw new java.lang.RuntimeException();
            }
            A0G[6] = "7BCad5LO6te39ERddnjUHTKJR8zzbght";
            if (i2 < i3) {
                android.view.View childAt = this.A00.getChildAt(0);
                if (childAt instanceof com.facebook.ads.redexgen.core.C0606Bu) {
                    this.A04 = (com.facebook.ads.redexgen.core.C0606Bu) childAt;
                } else {
                    i2++;
                }
            }
        }
        if (this.A04 == null) {
            if (com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
                android.util.Log.e(A0H, A06(72, 36, 98));
            }
        } else {
            this.A04.A0c(this.A05);
            com.facebook.ads.redexgen.core.C0606Bu c0606Bu = this.A04;
            com.facebook.ads.redexgen.core.C7O c7o = this.A06;
            java.lang.String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                c0606Bu.A0c(c7o);
            } else {
                A0G[5] = "Z21owOXIiAfqNY46KReygSjUmuqXSFx4";
                c0606Bu.A0c(c7o);
            }
        }
        this.A08.A0W(0);
        this.A08.A0X(250);
        jrA01.AGT();
    }

    @Override // com.facebook.ads.redexgen.core.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean zA0p = com.facebook.ads.redexgen.core.C0762Im.A0p(this.A01);
        this.A00.setOnTouchListener(new com.facebook.ads.redexgen.core.JN(this, zA0p));
        if (!zA0p) {
            A0A();
        }
    }

    @Override // com.facebook.ads.redexgen.core.C5Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.C5Y, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0C();
    }
}
