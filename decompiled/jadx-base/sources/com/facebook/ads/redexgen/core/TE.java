package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TE extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.InterfaceC0957Qg {
    public android.widget.TextView A00;
    public android.widget.TextView A01;
    public android.widget.TextView A02;
    public android.widget.TextView A03;
    public final com.facebook.ads.MediaView A04;
    public final com.facebook.ads.NativeAd A05;
    public final com.facebook.ads.redexgen.core.C0958Qh A06;
    public final java.util.ArrayList<android.view.View> A07;
    public static java.lang.String[] A08 = {"1TbW2eCQhsvMTBw6WLgOl0T9uhpIUPzf", "ziTp6gBPmnDALVepebGOFatIHSWtUxBS", "U8KhSuPVLRzWbOpxbAxolTOugcqmOnaD", "0bQh9HQE8V8VC7fBvS6H2cn6s67Amjp4", "9aGEAiUrkMnbIgwzZX43En2EpYymCUz", "e9g0133auHqHsGsSwLriU2UE0E7n3ej0", "gJVbKnLfSb6S0wmfJEV2eyQXUghITZN0", ""};
    public static final int A0E = (int) (com.facebook.ads.redexgen.core.LP.A02 * 6.0f);
    public static final int A0D = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
    public static final int A0C = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
    public static final int A0A = (int) (com.facebook.ads.redexgen.core.LP.A02 * 350.0f);
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 250.0f);
    public static final int A0B = (int) (com.facebook.ads.redexgen.core.LP.A02 * 175.0f);

    public TE(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.redexgen.core.JW jw, com.facebook.ads.redexgen.core.JX jx, com.facebook.ads.redexgen.core.OU ou, com.facebook.ads.MediaView mediaView, com.facebook.ads.AdOptionsView adOptionsView) {
        super(c1199Zs);
        this.A07 = new java.util.ArrayList<>();
        this.A05 = nativeAd;
        this.A04 = mediaView;
        this.A06 = new com.facebook.ads.redexgen.core.C0958Qh(c1199Zs, this.A05, jw, ou, adOptionsView);
        this.A06.setPadding(A0C, A0C, A0C, A0E);
        addView(this.A06, new android.widget.FrameLayout.LayoutParams(-1, -2));
        if (jx == com.facebook.ads.redexgen.core.JX.A09 || jx == com.facebook.ads.redexgen.core.JX.A0B) {
            A07(jw);
        }
        addView(this.A04, new android.widget.FrameLayout.LayoutParams(-1, -2));
        if (jx != com.facebook.ads.redexgen.core.JX.A0B || this.A05.getAdCreativeType() != com.facebook.ads.NativeAd.AdCreativeType.CAROUSEL) {
            A06(jw);
            A04(jw);
            A05(jw);
        }
        this.A07.add(ou);
        this.A07.add(mediaView);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    private int A00() {
        int measuredHeight;
        int measuredHeight2;
        int linkDescHeight;
        int subtitleHeight = 0;
        if (this.A03 != null && this.A03.getVisibility() == 0) {
            measuredHeight = this.A03.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (this.A02 != null) {
            int linkDescHeight2 = this.A02.getVisibility();
            if (linkDescHeight2 == 0) {
                measuredHeight2 = this.A02.getMeasuredHeight();
            } else {
                measuredHeight2 = 0;
            }
        } else {
            measuredHeight2 = 0;
        }
        if (this.A00 != null) {
            int linkDescHeight3 = this.A00.getVisibility();
            if (linkDescHeight3 == 0) {
                android.widget.TextView textView = this.A00;
                if (A08[0].charAt(24) != 'u') {
                    throw new java.lang.RuntimeException();
                }
                A08[0] = "HiZrVlulAuiH54vlSWYSbySNuASlYz5G";
                linkDescHeight = textView.getMeasuredHeight();
            } else {
                linkDescHeight = 0;
            }
        } else {
            linkDescHeight = 0;
        }
        if (this.A01 != null && this.A01.getVisibility() == 0) {
            subtitleHeight = this.A01.getMeasuredHeight() + A0C + A0D;
        }
        int titleHeight = getMeasuredHeight();
        int ctaHeight = this.A06.getMeasuredHeight();
        return ((((titleHeight - ctaHeight) - measuredHeight) - measuredHeight2) - linkDescHeight) - subtitleHeight;
    }

    private void A01() {
        if (this.A03 != null) {
            this.A03.setLines(1);
        }
        if (this.A02 != null) {
            this.A02.setLines(1);
        }
        if (this.A00 != null) {
            this.A00.setLines(1);
        }
    }

    private void A02(int i) {
        com.facebook.ads.redexgen.core.M3.A0N(this.A04, i > A0B ? 0 : 8);
        com.facebook.ads.redexgen.core.M3.A0N(this.A03, i > A0A ? 0 : 8);
        com.facebook.ads.redexgen.core.M3.A0N(this.A00, i <= A09 ? 8 : 0);
    }

    public static void A03(int i, int i2, android.widget.TextView... textViewArr) {
        for (android.widget.TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int iA04 = com.facebook.ads.redexgen.core.M3.A04(textView, i2);
                textView.setLines(iA04 + 1);
                textView.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * iA04), 1073741824));
                i2 -= textView.getLineHeight() * iA04;
            }
        }
    }

    private void A04(com.facebook.ads.redexgen.core.JW jw) {
        if (this.A05.getAdBodyText() != null && !this.A05.getAdBodyText().trim().isEmpty()) {
            this.A00 = new android.widget.TextView(getContext());
            jw.A06(this.A00);
            this.A00.setText(this.A05.getAdBodyText());
            this.A00.setPadding(A0C, 0, A0C, 0);
            addView(this.A00, new android.widget.FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A05(com.facebook.ads.redexgen.core.JW jw) {
        if (this.A05.hasCallToAction()) {
            this.A01 = new android.widget.TextView(getContext());
            com.facebook.ads.redexgen.core.M3.A0K(this.A01);
            jw.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            this.A01.setPadding(A0D, A0D, A0D, A0D);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(A0D, 0, A0D, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(com.facebook.ads.redexgen.core.JW jw) {
        if (this.A05.getAdHeadline() != null && !this.A05.getAdHeadline().trim().isEmpty()) {
            this.A02 = new android.widget.TextView(getContext());
            jw.A07(this.A02);
            this.A02.setText(this.A05.getAdHeadline());
            this.A02.setPadding(A0C, A0D, A0C, 0);
            addView(this.A02, new android.widget.FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A07(com.facebook.ads.redexgen.core.JW jw) {
        if (this.A05.getAdLinkDescription() != null && !this.A05.getAdLinkDescription().trim().isEmpty()) {
            this.A03 = new android.widget.TextView(getContext());
            jw.A06(this.A03);
            this.A03.setText(this.A05.getAdLinkDescription());
            this.A03.setPadding(A0C, 0, A0C, A0D);
            addView(this.A03, new android.widget.FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0957Qg
    public android.view.View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0957Qg
    public java.util.ArrayList<android.view.View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.facebook.ads.redexgen.core.C0958Qh c0958Qh = this.A06;
        int top = this.A06.getMeasuredHeight();
        c0958Qh.layout(i, i2, i3, top + i2);
        int top2 = this.A06.getMeasuredHeight();
        int i5 = i2 + top2;
        if (this.A03 != null) {
            int visibility = this.A03.getVisibility();
            if (A08[4].length() == 2) {
                throw new java.lang.RuntimeException();
            }
            A08[4] = "Mpk43iWHaBi74JKA9YKWwwxfR5sOjUPQ";
            if (visibility == 0) {
                int measuredHeight = this.A03.getMeasuredHeight();
                int top3 = i5 + measuredHeight;
                this.A03.layout(i, i5, i3, top3);
                i5 += measuredHeight;
            }
        }
        com.facebook.ads.MediaView mediaView = this.A04;
        int top4 = this.A04.getMeasuredHeight();
        mediaView.layout(i, i5, i3, top4 + i5);
        int top5 = this.A04.getMeasuredHeight();
        int i6 = i5 + top5;
        if (this.A02 != null) {
            android.widget.TextView textView = this.A02;
            int top6 = this.A02.getMeasuredHeight();
            textView.layout(i, i6, i3, top6 + i6);
            int top7 = this.A02.getMeasuredHeight();
            i6 += top7;
        }
        if (this.A00 != null) {
            int top8 = this.A00.getVisibility();
            if (top8 == 0) {
                android.widget.TextView textView2 = this.A00;
                int top9 = this.A00.getMeasuredHeight();
                textView2.layout(i, i6, i3, top9 + i6);
            }
        }
        if (this.A01 != null) {
            android.widget.TextView textView3 = this.A01;
            int i7 = A0C + i;
            int top10 = this.A01.getMeasuredHeight();
            int i8 = i4 - top10;
            int top11 = A0C;
            int i9 = i8 - top11;
            int top12 = A0C;
            int i10 = i3 - top12;
            int top13 = A0C;
            textView3.layout(i7, i9, i10, i4 - top13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin;
        A02(android.view.View.MeasureSpec.getSize(i2));
        A01();
        super.onMeasure(i, i2);
        int iA00 = A00();
        int emptySpace = this.A04.getMediaWidth();
        if (emptySpace == 0) {
            iMin = iA00;
        } else {
            int emptySpace2 = this.A04.getMediaHeight();
            if (emptySpace2 == 0 || ((com.facebook.ads.redexgen.core.C1229aM) this.A04.getMediaViewApi()).A0N()) {
                iMin = iA00;
            } else {
                int emptySpace3 = this.A04.getMediaHeight();
                float f = emptySpace3;
                int emptySpace4 = this.A04.getMediaWidth();
                float aspectRatio = f / emptySpace4;
                int emptySpace5 = this.A04.getMeasuredWidth();
                iMin = java.lang.Math.min((int) (emptySpace5 * aspectRatio), iA00);
            }
        }
        com.facebook.ads.MediaView mediaView = this.A04;
        int mediaViewHeight = A08[4].length();
        if (mediaViewHeight == 2) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A08;
        strArr[3] = "bBjhlDCZcebcBoQzUAOgAVf3zFQrapwM";
        strArr[2] = "urvh83LMTjJVKtjaQ5bPrRJiE37dq76T";
        int emptySpace6 = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        mediaView.measure(i, emptySpace6);
        if (iMin < iA00) {
            A03(i, iA00 - iMin, this.A02, this.A00, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0957Qg
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
