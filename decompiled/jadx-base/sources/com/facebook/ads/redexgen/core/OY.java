package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OY implements com.facebook.ads.redexgen.core.InterfaceC0970Qt {
    public android.view.View A00;
    public com.facebook.ads.redexgen.core.T7 A01;
    public com.facebook.ads.redexgen.core.R5 A02;
    public boolean A03;
    public final android.os.Handler A04;
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A05;
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A06;
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A07;
    public final com.facebook.ads.redexgen.core.AbstractC0974Qx A08;
    public final boolean A09;
    public final boolean A0A;

    public OY(android.view.View view, com.facebook.ads.redexgen.core.R5 r5, boolean z) {
        this(view, r5, z, false);
    }

    public OY(android.view.View view, com.facebook.ads.redexgen.core.R5 r5, boolean z, boolean z2) {
        this.A06 = new com.facebook.ads.redexgen.core.AbstractC1006Sd() { // from class: com.facebook.ads.redexgen.X.8R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9P c9p) {
                this.A00.A06(1, 0);
            }
        };
        this.A07 = new com.facebook.ads.redexgen.core.AbstractC0990Rn() { // from class: com.facebook.ads.redexgen.X.8Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.SZ sz) {
                if (!this.A00.A03) {
                    return;
                }
                if (this.A00.A02 == com.facebook.ads.redexgen.core.R5.A02 || this.A00.A09) {
                    this.A00.A02 = null;
                    this.A00.A05();
                } else {
                    this.A00.A06(0, 8);
                }
            }
        };
        this.A05 = new com.facebook.ads.redexgen.core.AbstractC1012Sj() { // from class: com.facebook.ads.redexgen.X.8P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
                if (this.A00.A02 == com.facebook.ads.redexgen.core.R5.A03) {
                    return;
                }
                this.A00.A00.setAlpha(1.0f);
                this.A00.A00.setVisibility(0);
            }
        };
        this.A08 = new com.facebook.ads.redexgen.core.C8H(this);
        this.A03 = true;
        this.A04 = new android.os.Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new com.facebook.ads.redexgen.core.R4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(android.view.View view, com.facebook.ads.redexgen.core.R5 r5) {
        this.A02 = r5;
        this.A00 = view;
        this.A00.clearAnimation();
        if (r5 == com.facebook.ads.redexgen.core.R5.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
        } else {
            this.A00.setAlpha(1.0f);
            this.A00.setVisibility(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void A9r(com.facebook.ads.redexgen.core.T7 t7) {
        this.A01 = t7;
        t7.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0970Qt
    public final void AHD(com.facebook.ads.redexgen.core.T7 t7) {
        A06(1, 0);
        t7.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
