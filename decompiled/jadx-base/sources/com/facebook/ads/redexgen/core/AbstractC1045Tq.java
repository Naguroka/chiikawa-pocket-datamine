package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1045Tq extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.MS {
    public static java.lang.String[] A0D = {"TjJo4iSgng0vXhs45r72rqpPNY8skILr", "91ouIxxhnH3Z5", "W0nriFofCJUyd1UjJ1D34NnkecurTiQg", "io9DF8pP4zbnzlMZ0cU9ebyf5c8MGTpw", "GW5XhaY0JB8EDDs", "wmyPNYIHMh217", "CqbXOmo7iYNySqq5By1vz3nqMfrwlLlZ", "8HyCFF6UzaJGyjOzTS3wQDIkiaQQj"};
    public static final android.widget.RelativeLayout.LayoutParams A0E = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A01;
    public final com.facebook.ads.redexgen.core.C04766f A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final com.facebook.ads.redexgen.core.J7 A04;
    public final com.facebook.ads.redexgen.core.JF A05;
    public final com.facebook.ads.redexgen.core.C0842Lv A06;
    public final com.facebook.ads.redexgen.core.MQ A07;
    public final com.facebook.ads.redexgen.core.MR A08;
    public final com.facebook.ads.redexgen.core.N9 A09;
    public final com.facebook.ads.redexgen.core.C0987Rk A0A;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq A0B;
    public final com.facebook.ads.redexgen.core.AbstractC0986Rj A0C;

    public abstract void A0W();

    public abstract void A0Y(com.facebook.ads.redexgen.core.C5Q c5q);

    public abstract boolean A0Z();

    public AbstractC1045Tq(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.N9 n9, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.MR mr) {
        super(c1199Zs);
        this.A0C = new com.facebook.ads.redexgen.core.C1049Tu(this);
        this.A06 = new com.facebook.ads.redexgen.core.C0842Lv();
        this.A00 = false;
        this.A03 = c1199Zs;
        this.A09 = n9;
        this.A04 = j7;
        this.A01 = abstractC1341cD;
        this.A02 = c04766f;
        this.A08 = mr;
        this.A05 = new com.facebook.ads.redexgen.core.JF(this.A01.A1U(), this.A04);
        this.A0A = new com.facebook.ads.redexgen.core.C0987Rk(this, 1, new java.lang.ref.WeakReference(this.A0C), this.A03);
        this.A0A.A0W(this.A01.A0O());
        this.A0A.A0X(this.A01.A0P());
        this.A07 = A0T();
        this.A0B = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC0837Lq(this);
        this.A0B.A05(com.facebook.ads.redexgen.core.EnumC0836Lp.A02);
    }

    private com.facebook.ads.internal.view.FullScreenAdToolbar A0T() {
        com.facebook.ads.internal.view.FullScreenAdToolbar fullScreenAdToolbar = new com.facebook.ads.internal.view.FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A1J(), this.A01.A1D());
        fullScreenAdToolbar.setFullscreen(true);
        int iA03 = this.A01.A1P().A0E().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A1S(), this.A01.A1U(), iA03, this.A01.A1T());
        fullScreenAdToolbar.A09(this.A01.A1O().A01(), com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui.A08(this.A01));
        if (iA03 < 0) {
            boolean zA0O = this.A01.A1P().A0O();
            int unskippableSeconds = A0D[4].length();
            if (unskippableSeconds == 14) {
                throw new java.lang.RuntimeException();
            }
            A0D[6] = "uU4tl2aYQOakqMcDwa3XaYHVuDk2NjaN";
            if (zA0O) {
                fullScreenAdToolbar.setToolbarActionMode(4);
            }
        }
        fullScreenAdToolbar.setToolbarListener(new com.facebook.ads.redexgen.core.C1046Tr(this));
        return fullScreenAdToolbar;
    }

    private void A0U() {
        if (this.A01.A1P().A0R()) {
            com.facebook.ads.redexgen.core.Q7 q7A0F = new com.facebook.ads.redexgen.core.Q5(this.A03, this.A01.A1P().A0F(), this.A01.A1S()).A0A(this.A01.A1O().A01()).A0F();
            com.facebook.ads.redexgen.core.JH.A04(q7A0F, this.A05, com.facebook.ads.redexgen.core.JE.A0U);
            addView(q7A0F, A0E);
            q7A0F.A04(new com.facebook.ads.redexgen.core.C1047Ts(this));
            return;
        }
        A0W();
    }

    public final void A0V() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0X(int i, com.facebook.ads.redexgen.core.KY ky) {
        new com.facebook.ads.redexgen.core.LH(i, new com.facebook.ads.redexgen.core.C1048Tt(this, i, ky)).A07();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void A9q(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        this.A08.A3q(this, A0E);
        A0Y(c5q);
        A0U();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void AFx(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public java.lang.String getCurrentClientToken() {
        return this.A01.A1U();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!android.text.TextUtils.isEmpty(this.A01.A1U())) {
            this.A04.A9x(this.A01.A1U(), new com.facebook.ads.redexgen.core.O8().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(com.facebook.ads.redexgen.core.MR mr) {
    }

    public void setUpFullscreenMode(boolean z) {
        com.facebook.ads.redexgen.core.EnumC0836Lp enumC0836Lp;
        if (android.os.Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z) {
            enumC0836Lp = com.facebook.ads.redexgen.core.EnumC0836Lp.A03;
        } else {
            enumC0836Lp = com.facebook.ads.redexgen.core.EnumC0836Lp.A02;
        }
        this.A0B.A05(enumC0836Lp);
    }
}
