package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7G extends com.facebook.ads.redexgen.core.AbstractC1015Sm {
    public final android.graphics.Paint A00;
    public final com.facebook.ads.redexgen.core.C1199Zs A01;
    public final com.facebook.ads.redexgen.core.JF A02;
    public final com.facebook.ads.redexgen.core.AbstractC1012Sj A03;
    public final com.facebook.ads.redexgen.core.AbstractC1006Sd A04;
    public final com.facebook.ads.redexgen.core.AbstractC0990Rn A05;
    public final com.facebook.ads.redexgen.core.RD A06;

    public C7G(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, boolean z, com.facebook.ads.redexgen.core.JF jf) {
        super(c1199Zs);
        this.A04 = new com.facebook.ads.redexgen.core.AbstractC1006Sd() { // from class: com.facebook.ads.redexgen.X.7K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9P c9p) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A05 = new com.facebook.ads.redexgen.core.AbstractC0990Rn() { // from class: com.facebook.ads.redexgen.X.7I
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.SZ sz) {
                this.A00.A06.setChecked(false);
            }
        };
        this.A03 = new com.facebook.ads.redexgen.core.AbstractC1012Sj() { // from class: com.facebook.ads.redexgen.X.7H
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC05348x
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C9R c9r) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A02 = jf;
        this.A01 = c1199Zs;
        this.A06 = new com.facebook.ads.redexgen.core.RD(c1199Zs, z);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        android.widget.RelativeLayout.LayoutParams btnLayout = new android.widget.RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 23.76d), (int) (((double) displayMetrics.density) * 23.76d));
        btnLayout.addRule(13);
        this.A06.setLayoutParams(btnLayout);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new android.graphics.Paint();
        this.A00.setStyle(android.graphics.Paint.Style.FILL);
        if (z) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        com.facebook.ads.redexgen.core.M3.A0M(this, 0);
        addView(this.A06);
        setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 72.0d), (int) (((double) displayMetrics.density) * 72.0d));
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
        com.facebook.ads.redexgen.core.M3.A0G(1004, this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1015Sm
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        android.view.View.OnClickListener clickListener = new com.facebook.ads.redexgen.core.RA(this);
        setOnClickListener(clickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1015Sm
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i - width3;
        int width4 = java.lang.Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
