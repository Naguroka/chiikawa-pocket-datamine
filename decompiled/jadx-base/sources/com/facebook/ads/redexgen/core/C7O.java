package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7O extends com.facebook.ads.redexgen.core.AbstractC1015Sm implements android.view.View.OnClickListener {
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A00;
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A01;
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A02;
    public final com.facebook.ads.redexgen.core.R9 A03;
    public final com.facebook.ads.redexgen.core.RD A04;

    public C7O(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this(c1199Zs, null);
    }

    public C7O(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet) {
        this(c1199Zs, attributeSet, 0);
    }

    public C7O(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i) {
        super(c1199Zs, attributeSet, i);
        this.A03 = new com.facebook.ads.redexgen.core.R9() { // from class: com.facebook.ads.redexgen.X.7U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C0983Rg c0983Rg) {
                this.A00.setVisibility(0);
            }
        };
        this.A01 = new com.facebook.ads.redexgen.core.AbstractC1006Sd() { // from class: com.facebook.ads.redexgen.X.7S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9P c9p) {
                this.A00.A04.setChecked(true);
            }
        };
        this.A02 = new com.facebook.ads.redexgen.core.AbstractC0990Rn() { // from class: com.facebook.ads.redexgen.X.7R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.SZ sz) {
                this.A00.A04.setChecked(false);
            }
        };
        this.A00 = new com.facebook.ads.redexgen.core.AbstractC1012Sj() { // from class: com.facebook.ads.redexgen.X.7P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
                this.A00.A04.setChecked(true);
            }
        };
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new com.facebook.ads.redexgen.core.RD(c1199Zs);
        this.A04.setChecked(true);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1015Sm
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1015Sm
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            com.facebook.ads.redexgen.core.T7 videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A07 || videoView.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A05 || videoView.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A06) {
                videoView.A0b(com.facebook.ads.redexgen.core.EnumC0969Qs.A04, 11);
            } else if (videoView.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(java.lang.String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(java.lang.String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
