package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OS extends android.widget.FrameLayout {
    public static java.lang.String[] A07 = {"Q8PK8a4jCXFMgXydViX", "2t", "0mtDJDWqZSrfiocTEOLDLA", "JwyFxt7bdt7eCUIm0ln", "fPboxvDBMmOISakSS", "MBnzPw5d2FxZEvBrnzM1TlMBrMh4WSuO", "jLpHRmCuYtO7UfmYbZzhe3ed5a74x24O", "3APcS373YHqcuLzV9G"};
    public com.facebook.ads.redexgen.core.MQ A00;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A01;
    public final com.facebook.ads.redexgen.core.C1199Zs A02;
    public final com.facebook.ads.redexgen.core.MR A03;
    public final com.facebook.ads.redexgen.core.OR A04;
    public final com.facebook.ads.redexgen.core.T7 A05;
    public final android.view.View[] A06;

    public OS(com.facebook.ads.redexgen.core.C0911Om c0911Om, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.T7 t7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.OR or, android.view.View... viewArr) {
        this(c0911Om.A05(), c0911Om.A09(), abstractC1341cD, t7, mr, or, viewArr);
    }

    public OS(com.facebook.ads.redexgen.core.C0911Om c0911Om, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.T7 t7, com.facebook.ads.redexgen.core.N5 n5, com.facebook.ads.redexgen.core.OE oe, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.OR or) {
        this(c0911Om, abstractC1341cD, t7, mr, or, n5, oe);
    }

    public OS(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.MQ mq, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.T7 t7, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.OR or, android.view.View... viewArr) {
        super(c1199Zs);
        this.A02 = c1199Zs;
        this.A00 = mq;
        this.A01 = abstractC1341cD;
        this.A06 = viewArr;
        this.A03 = mr;
        this.A05 = t7;
        this.A04 = or;
        A03();
    }

    private void A03() {
        java.lang.String title;
        com.facebook.ads.RewardData rewardDataA0W = this.A01.A0W();
        if (rewardDataA0W == null) {
            title = this.A01.A1R().A05();
        } else {
            title = this.A01.A1R().A06(rewardDataA0W.getCurrency(), rewardDataA0W.getQuantity());
        }
        com.facebook.ads.redexgen.core.C0860Mn c0860Mn = new com.facebook.ads.redexgen.core.C0860Mn(this.A02, -1, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, title, null, this.A01.A1R().A04(), this.A01.A1R().A03(), com.facebook.ads.redexgen.core.MC.A01(com.facebook.ads.redexgen.core.MB.REWARD_ICON));
        c0860Mn.A02.setOnClickListener(new com.facebook.ads.redexgen.core.OP(this));
        c0860Mn.A01.setOnClickListener(new com.facebook.ads.redexgen.core.OQ(this));
        addView(c0860Mn, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A05 != null) {
            this.A05.A0a(com.facebook.ads.redexgen.core.EnumC0964Qn.A07);
        }
        this.A04.AB7();
        if (!this.A01.A1P().A0Q()) {
            this.A01.A1X(this.A03);
        }
    }

    public final void A07(android.view.ViewGroup viewGroup) {
        if (this.A05 != null && !this.A05.A0k()) {
            this.A05.A0f(false, false, 11);
            java.lang.String[] strArr = A07;
            if (strArr[0].length() != strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A07;
            strArr2[4] = "1Ran1dt8ESvXQPCOL";
            strArr2[1] = "wn";
            com.facebook.ads.redexgen.core.M3.A0N(this.A05, 4);
        }
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.M3.A0H(this.A00);
        }
        for (android.view.View view : this.A06) {
            view.clearAnimation();
            com.facebook.ads.redexgen.core.M3.A0N(view, 4);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.ACd();
    }
}
