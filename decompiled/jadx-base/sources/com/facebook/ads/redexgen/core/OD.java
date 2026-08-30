package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OD extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.InterfaceC0970Qt, android.view.View.OnClickListener {
    public com.facebook.ads.redexgen.core.T7 A00;
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A01;
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A02;
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A03;
    public final com.facebook.ads.redexgen.core.R9 A04;
    public final com.facebook.ads.redexgen.core.RD A05;
    public static final int A07 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 6.0f);

    public OD(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A04 = new com.facebook.ads.redexgen.core.R9() { // from class: com.facebook.ads.redexgen.X.8A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C0983Rg c0983Rg) {
                this.A00.setVisibility(0);
            }
        };
        this.A02 = new com.facebook.ads.redexgen.core.AbstractC1006Sd() { // from class: com.facebook.ads.redexgen.X.7c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9P c9p) {
                this.A00.A05.setChecked(true);
            }
        };
        this.A03 = new com.facebook.ads.redexgen.core.AbstractC0990Rn() { // from class: com.facebook.ads.redexgen.X.7Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.SZ sz) {
                this.A00.A05.setChecked(false);
            }
        };
        this.A01 = new com.facebook.ads.redexgen.core.AbstractC1012Sj() { // from class: com.facebook.ads.redexgen.X.7X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
                this.A00.A05.setChecked(true);
            }
        };
        com.facebook.ads.redexgen.core.M3.A0S(this, com.facebook.ads.redexgen.core.M3.A06(855638016, A06));
        this.A05 = new com.facebook.ads.redexgen.core.RD(c1199Zs, true);
        this.A05.setChecked(true);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A07, A07);
        layoutParams.addRule(13);
        setVisibility(8);
        addView(this.A05, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void A9r(com.facebook.ads.redexgen.core.T7 t7) {
        this.A00 = t7;
        setOnClickListener(this);
        this.A05.setOnClickListener(this);
        if (this.A00 != null) {
            this.A00.getEventBus().A03(this.A04, this.A01, this.A02, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void AHD(com.facebook.ads.redexgen.core.T7 t7) {
        if (this.A00 != null) {
            this.A00.getEventBus().A04(this.A03, this.A02, this.A01, this.A04);
        }
        setOnClickListener(null);
        this.A05.setOnClickListener(null);
        this.A00 = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                return;
            }
            if (this.A00.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A07 || this.A00.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A05 || this.A00.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A06) {
                this.A00.A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A04, 11);
            } else if (this.A00.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A0A) {
                this.A00.A0e(true, 7);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(java.lang.String str) {
        this.A05.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(java.lang.String str) {
        this.A05.setPlayAccessibilityLabel(str);
    }
}
