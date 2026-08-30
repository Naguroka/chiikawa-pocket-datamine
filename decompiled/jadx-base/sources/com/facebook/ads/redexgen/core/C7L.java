package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7L extends com.facebook.ads.redexgen.core.AbstractC1015Sm {
    public static java.lang.String[] A01 = {"BuRuvxulsaJnTsptWr5C74N6kbe62CR1", "s8BhV7yvVPv9fWwhaDhts8ISKp0Ib3uz", "BHQbL486YclXfOG4TttSSmYhAQDicEvh", "6QlBJVUCqIJjaBYG", "bf17tAIDP3PP5oHcfI5KYvpff0TMzylU", "en59KaoZPANthNZYpe9YMIumKtT", "Zp8Yp0vRpWPiTIr1M3XMCxUDLLEg", "TVOb3qDH058zXjUqb6AporPz"};
    public final com.facebook.ads.redexgen.core.AbstractC05348x<com.facebook.ads.redexgen.core.C0983Rg> A00;

    public C7L(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this(c1199Zs, null);
    }

    public C7L(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet) {
        this(c1199Zs, attributeSet, 0);
    }

    public C7L(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i) {
        super(c1199Zs, attributeSet, i);
        this.A00 = new com.facebook.ads.redexgen.core.N6(this);
        int iApplyDimension = (int) android.util.TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_IN);
        android.widget.RelativeLayout.LayoutParams spinnerParams = new android.widget.RelativeLayout.LayoutParams(iApplyDimension, iApplyDimension);
        spinnerParams.addRule(13);
        addView(progressBar, spinnerParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1015Sm
    public final void A07() {
        super.A07();
        setVisibility(0);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A05(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1015Sm
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A06(this.A00);
        }
        setVisibility(8);
        if (A01[6].length() == 4) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[4] = "qxykbLgy7uMqmiLSWk5iAMCsSUesvX5c";
        strArr[0] = "yfv8cLzmeBPWJWXBFW506HD39p2knuA3";
        super.A08();
    }
}
