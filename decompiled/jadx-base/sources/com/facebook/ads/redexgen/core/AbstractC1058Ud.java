package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1058Ud extends com.facebook.ads.redexgen.core.AbstractC0907Oi implements com.facebook.ads.redexgen.core.LJ {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"OqBcBxPX2ZziMc2IT6MCTLtQAfN", "zbHyi1ztTRv4YAmmT0P0cBLwkAbgbibY", "SGCBgG4YDDdHsd7wreTLkUhlfmq", "6SoBxKZAX5xZewPuDXqUB5F5Zi6ZkxRk", "Ec2XCBDA1LqSXAKcLbhR3N0Z6X2H9u1y", "7uWZE4LuLIesc8VJARyN", "MrB", "uRKWJ0Ox"};
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public com.facebook.ads.redexgen.core.QG A00;
    public com.facebook.ads.redexgen.core.C0869Mw A01;
    public com.facebook.ads.redexgen.core.M9 A02;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A03;
    public final com.facebook.ads.redexgen.core.C1F A04;
    public final com.facebook.ads.redexgen.core.MR A05;
    public final com.facebook.ads.redexgen.core.OE A06;
    public final com.facebook.ads.redexgen.core.LL A07;

    public static java.lang.String A0E(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 98);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0F() {
        A08 = new byte[]{-53, -41, -43, -106, -50, -55, -53, -51, -54, -41, -41, -45, -106, -55, -52, -37, -106, -47, -42, -36, -51, -38, -37, -36, -47, -36, -47, -55, -44, -106, -53, -44, -47, -53, -45, -51, -52, 75, 62, 80, 58, 75, kotlin.io.encoding.Base64.padSymbol, 62, kotlin.io.encoding.Base64.padSymbol, 56, 79, 66, kotlin.io.encoding.Base64.padSymbol, 62, 72};
    }

    static {
        A0F();
        A0D = (int) (com.facebook.ads.redexgen.core.LP.A02 * 48.0f);
        A0H = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
        A0A = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
        A0G = (int) (com.facebook.ads.redexgen.core.LP.A02 * 44.0f);
        A0E = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A0F = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
        A0J = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
        A0I = (int) (com.facebook.ads.redexgen.core.LP.A02 * 26.0f);
        A0B = com.facebook.ads.redexgen.core.AbstractC03842p.A01(-1, 77);
        A0C = com.facebook.ads.redexgen.core.AbstractC03842p.A01(A0B, 90);
    }

    public AbstractC1058Ud(com.facebook.ads.redexgen.core.C0911Om c0911Om, boolean z) {
        super(c0911Om, z);
        this.A03 = c0911Om.A04();
        this.A07 = com.facebook.ads.redexgen.core.LL.A01(c0911Om.A05(), this.A03, this);
        this.A04 = this.A03.A1P();
        this.A06 = A0D(c0911Om);
        com.facebook.ads.redexgen.core.MQ mqA09 = c0911Om.A09();
        this.A05 = c0911Om.A0A();
        if (mqA09 != null) {
            mqA09.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, mqA09.getToolbarHeight()));
            mqA09.setPageDetailsVisible(false);
        }
    }

    private com.facebook.ads.redexgen.core.C1059Ue A0D(com.facebook.ads.redexgen.core.C0911Om c0911Om) {
        java.lang.String strA0E;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (c0911Om.A04().A0c().equals(A0E(37, 14, 119))) {
            com.facebook.ads.redexgen.core.EnumC0972Qv enumC0972Qv = com.facebook.ads.redexgen.core.EnumC0972Qv.A04;
            java.lang.String[] strArr = A09;
            if (strArr[0].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A09;
            strArr2[0] = "eRJAPgCpAEYp4zRftRyvsFNgmAI";
            strArr2[2] = "a3ElzwSjsaXIXOeEqc2Ptae8pO7";
            strA0E = enumC0972Qv.A03();
        } else {
            strA0E = A0E(0, 37, 6);
        }
        com.facebook.ads.redexgen.core.C1059Ue c1059Ue = new com.facebook.ads.redexgen.core.C1059Ue(c0911Om.A05(), A0D, this.A04.A0F().A00() == com.facebook.ads.redexgen.core.C1K.A05, getColors(), this.A04.A0G().A06(), strA0E, c0911Om.A06(), c0911Om.A0A(), c0911Om.A0C(), c0911Om.A08(), c0911Om.A04());
        c1059Ue.getCTAButton().getCtaActionHelper().A04(this.A03);
        c1059Ue.getCTAButton().setCreativeAsCtaLoggingHelper(this.A07);
        this.A02 = new com.facebook.ads.redexgen.core.M9(c1059Ue, 400, 100, 0);
        com.facebook.ads.redexgen.core.M3.A0K(c1059Ue);
        c1059Ue.A0D(c0911Om.A00());
        if (com.facebook.ads.redexgen.core.C0762Im.A12(c0911Om.A05())) {
            c1059Ue.A0C();
            if (c0911Om.A09() != null) {
                c0911Om.A09().setCTAClickListener(getCtaButton());
            }
        }
        addView(c1059Ue, layoutParams);
        c1059Ue.getCTAButton().A0A(this.A03, c0911Om.A09());
        return c1059Ue;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public void A0v() {
        super.A0v();
        if (this.A03 != null && this.A03.A1P().A0I() != null) {
            com.facebook.ads.redexgen.core.LC.A06(super.A06.A05().A01(), this.A03.A1P().A0I());
        }
        this.A07.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi
    public void A10(com.facebook.ads.redexgen.core.C1F c1f, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A10(c1f, str, d, bundle);
        this.A06.setInfo(c1f.A0F(), c1f.A0G(), str, this.A03.A1S().A01(), super.A06.A07(), null);
    }

    public final int A13(com.facebook.ads.redexgen.core.MQ mq) {
        return mq == null ? com.facebook.ads.redexgen.core.MQ.A00 : mq.getToolbarHeight();
    }

    public void A14() {
        android.view.View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new com.facebook.ads.redexgen.core.QG(true);
            if (this.A01 != null) {
                this.A00.A0I(this.A01);
            }
            com.facebook.ads.redexgen.core.C1O c1oA01 = this.A03.A1O().A01();
            this.A00.A0I(new com.facebook.ads.redexgen.core.C0867Mu(getAdDetailsView().getCTAButton(), com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, -1, c1oA01.A09(true)));
            android.graphics.drawable.Drawable drawableA08 = com.facebook.ads.redexgen.core.M3.A08(A0B, A0C, A0A);
            android.graphics.drawable.Drawable startDrawable = com.facebook.ads.redexgen.core.M3.A05(c1oA01.A08(true), A0A);
            this.A00.A0I(new com.facebook.ads.redexgen.core.C0870Mx(getAdDetailsView().getCTAButton(), com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, drawableA08, startDrawable));
            this.A00.A0I(new com.facebook.ads.redexgen.core.C0868Mv(expandableLayout, 150, false));
            this.A00.A0H(2300);
        }
    }

    public final void A15() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(super.A06.A05());
        linearLayout.setOrientation(1);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        android.widget.TextView textView = new android.widget.TextView(super.A06.A05());
        textView.setText(super.A06.A04().A0g());
        textView.setTextColor(-1);
        com.facebook.ads.redexgen.core.M3.A0Y(textView, false, 15);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A0H, A0H, A0H, A0H);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        com.facebook.ads.redexgen.core.OO oo = new com.facebook.ads.redexgen.core.OO(super.A06.A05(), 0, -13524404, com.facebook.ads.redexgen.core.MB.REWARD_GRANTED_ICON);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(A0D, A0D);
        layoutParams3.gravity = 17;
        oo.setLayoutParams(layoutParams3);
        linearLayout.addView(oo);
        linearLayout.addView(textView);
        addView(linearLayout);
    }

    @Override // com.facebook.ads.redexgen.core.LJ
    public final void ACa() {
        this.A05.A4P(getAdDataBundle().A0Y());
    }

    public com.facebook.ads.redexgen.core.AbstractC1341cD getAdDataBundle() {
        return this.A03;
    }

    public com.facebook.ads.redexgen.core.M9 getAdDetailsAnimation() {
        return this.A02;
    }

    public com.facebook.ads.redexgen.core.OE getAdDetailsView() {
        return this.A06;
    }

    public com.facebook.ads.redexgen.core.C1F getAdInfo() {
        return this.A04;
    }

    public com.facebook.ads.redexgen.core.QG getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Oi, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0D(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        android.view.View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null && z && this.A01 == null) {
            this.A01 = new com.facebook.ads.redexgen.core.C0869Mw(expandableLayout, com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, expandableLayout.getHeight(), 0);
            this.A00.A0I(this.A01);
            this.A00.A0G();
        }
    }
}
