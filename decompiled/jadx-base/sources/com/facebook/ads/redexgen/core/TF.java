package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TF extends android.widget.LinearLayout implements com.facebook.ads.redexgen.core.InterfaceC0957Qg {
    public final com.facebook.ads.NativeBannerAd A00;
    public final com.facebook.ads.redexgen.core.C1199Zs A01;
    public final java.util.ArrayList<android.view.View> A02;
    public static final int A04 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 42.0f);
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 48.0f);
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 54.0f);
    public static final int A07 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);

    public TF(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.redexgen.core.JW jw, com.facebook.ads.redexgen.core.JX jx, com.facebook.ads.MediaView mediaView, com.facebook.ads.AdOptionsView adOptionsView) {
        android.widget.LinearLayout.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams ctaButtonParams;
        super(c1199Zs);
        this.A02 = new java.util.ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c1199Zs;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(jx);
        com.facebook.ads.redexgen.core.OV ov = new com.facebook.ads.redexgen.core.OV(this.A01);
        ov.setFullCircleCorners(true);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(iA00, iA00);
        layoutParams2.gravity = 16;
        ov.addView(mediaView, new android.widget.LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(ov, layoutParams2);
        com.facebook.ads.redexgen.core.C0954Qd c0954Qd = new com.facebook.ads.redexgen.core.C0954Qd(c1199Zs, this.A00, jx, jw, adOptionsView);
        c0954Qd.setPadding(A06, 0, 0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(c0954Qd, layoutParams3);
        if (jx == com.facebook.ads.redexgen.core.JX.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
            ctaButtonParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
            ctaButtonParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        android.widget.TextView ctaButton = new android.widget.TextView(getContext());
        ctaButton.setPadding(A06, A07, A06, A07);
        jw.A05(ctaButton);
        ctaButton.setText(this.A00.getAdCallToAction());
        addView(ctaButton, ctaButtonParams);
        this.A02.add(mediaView);
        this.A02.add(ctaButton);
    }

    public static int A00(com.facebook.ads.redexgen.core.JX jx) {
        switch (jx) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0957Qg
    public android.view.View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0957Qg
    public java.util.ArrayList<android.view.View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0957Qg
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
