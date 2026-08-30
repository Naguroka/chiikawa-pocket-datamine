package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7B extends com.facebook.ads.redexgen.core.AbstractC1087Vg<com.facebook.ads.redexgen.core.C0987Rk> implements com.facebook.ads.redexgen.core.InterfaceC04957e {
    public com.facebook.ads.redexgen.core.C1199Zs A00;
    public boolean A01;

    public C7B(com.facebook.ads.redexgen.core.C0987Rk c0987Rk, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c0987Rk);
        this.A00 = c1199Zs;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0E().A3g(i);
        }
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        com.facebook.ads.redexgen.core.C0987Rk c0987RkA07 = A07();
        int iIntValue = 0;
        if (c0987RkA07 == null) {
            A00(0);
            return;
        }
        android.view.View view = c0987RkA07.A0C;
        com.facebook.ads.redexgen.core.AbstractC0986Rj abstractC0986Rj = (com.facebook.ads.redexgen.core.AbstractC0986Rj) c0987RkA07.A0E.get();
        int i = 1;
        boolean z = view == null;
        if (!z && abstractC0986Rj != null) {
            com.facebook.ads.redexgen.core.C0988Rl c0988RlA0E = com.facebook.ads.redexgen.core.C0987Rk.A0E(view, c0987RkA07.A0A, this.A00);
            if (c0988RlA0E.A04()) {
                com.facebook.ads.redexgen.core.C0987Rk.A05(c0987RkA07);
            } else {
                c0987RkA07.A00 = 0;
            }
            boolean z2 = c0987RkA07.A00 > c0987RkA07.A09;
            boolean wasViewable = c0987RkA07.A05 != null && c0987RkA07.A05.A04();
            if (z2 || !c0988RlA0E.A04()) {
                c0987RkA07.A05 = c0988RlA0E;
            }
            java.lang.String strValueOf = java.lang.String.valueOf(c0988RlA0E.A01());
            synchronized (c0987RkA07) {
                if (c0987RkA07.A06.containsKey(strValueOf)) {
                    iIntValue = ((java.lang.Integer) c0987RkA07.A06.get(strValueOf)).intValue();
                }
                c0987RkA07.A06.put(strValueOf, java.lang.Integer.valueOf(iIntValue + 1));
            }
            if (z2 && !wasViewable) {
                this.A01 = true;
                c0987RkA07.A03 = java.lang.System.currentTimeMillis();
                if (c0987RkA07.A07) {
                    this.A00.A0E().A3h();
                }
                abstractC0986Rj.A03();
                if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() && com.facebook.ads.internal.settings.AdInternalSettings.isVisibleAnimation()) {
                    android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c0987RkA07.A0F) {
                    return;
                }
            } else if (!z2 && wasViewable) {
                this.A01 = true;
                if (c0987RkA07.A07) {
                    this.A00.A0E().A3D(c0988RlA0E.A02());
                }
                abstractC0986Rj.A00();
            } else {
                abstractC0986Rj.A02();
                if (!this.A01 && c0987RkA07.A07) {
                    this.A00.A0E().A3f(c0988RlA0E.A02());
                }
                this.A01 = true;
            }
            if (!c0987RkA07.A08 && c0987RkA07.A04 != null) {
                c0987RkA07.A0B.postDelayed(c0987RkA07.A04, c0987RkA07.A02);
                return;
            }
            return;
        }
        if (c0987RkA07.A07) {
            if (!z) {
                i = 2;
            }
            A00(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04957e
    public final com.facebook.ads.redexgen.core.C1199Zs A6G() {
        return this.A00;
    }
}
