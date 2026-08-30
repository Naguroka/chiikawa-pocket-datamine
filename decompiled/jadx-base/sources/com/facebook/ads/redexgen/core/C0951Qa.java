package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0951Qa {
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui A00;
    public final com.facebook.ads.redexgen.core.C1B A01;
    public final com.facebook.ads.redexgen.core.C1M A02;
    public final com.facebook.ads.redexgen.core.C1Q A03;
    public final com.facebook.ads.redexgen.core.C1Z A04;
    public final com.facebook.ads.redexgen.core.C1199Zs A05;
    public final com.facebook.ads.redexgen.core.JF A06;
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    public static final int A07 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 72.0f);
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);

    public C0951Qa(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        this.A05 = c1199Zs;
        this.A06 = new com.facebook.ads.redexgen.core.JF(abstractC1341cD.A1U(), j7);
        this.A01 = abstractC1341cD.A1O();
        this.A02 = abstractC1341cD.A1P().A0F();
        this.A04 = abstractC1341cD.A1S();
        this.A03 = abstractC1341cD.A1P().A0H();
    }

    private android.view.View A00(com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui) {
        com.facebook.ads.redexgen.core.C0899Oa c0899Oa = new com.facebook.ads.redexgen.core.C0899Oa(this.A05, this.A01.A01(), true, false, false);
        c0899Oa.A03(this.A02.A08(), this.A02.A02(), null, false, true);
        c0899Oa.setAlignment(17);
        com.facebook.ads.redexgen.core.OU ou = new com.facebook.ads.redexgen.core.OU(this.A05);
        com.facebook.ads.redexgen.core.M3.A0M(ou, 0);
        ou.setRadius(50);
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(ou, this.A05).A04().A07(this.A04.A01());
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(ou, new android.widget.LinearLayout.LayoutParams(A07, A07));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c0899Oa, layoutParams);
        if (viewOnClickListenerC1063Ui != null) {
            com.facebook.ads.redexgen.core.M3.A0J(viewOnClickListenerC1063Ui);
            linearLayout.addView(viewOnClickListenerC1063Ui, layoutParams);
            if (android.text.TextUtils.isEmpty(viewOnClickListenerC1063Ui.getText())) {
                com.facebook.ads.redexgen.core.M3.A0H(viewOnClickListenerC1063Ui);
            }
        }
        return linearLayout;
    }

    private com.facebook.ads.redexgen.core.FL A01() {
        com.facebook.ads.redexgen.core.FL fl = new com.facebook.ads.redexgen.core.FL(this.A05);
        fl.setLayoutManager(new com.facebook.ads.redexgen.core.C1261at(this.A05, 0, false));
        fl.setAdapter(new com.facebook.ads.redexgen.core.TJ(this.A05, this.A03.A01(), A09, this.A00));
        return fl;
    }

    private final com.facebook.ads.redexgen.core.QZ A02() {
        if (!this.A03.A01().isEmpty()) {
            return com.facebook.ads.redexgen.core.QZ.A03;
        }
        return com.facebook.ads.redexgen.core.QZ.A02;
    }

    public final android.util.Pair<com.facebook.ads.redexgen.core.QZ, android.view.View> A03(com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui) {
        android.view.View viewA01;
        this.A00 = viewOnClickListenerC1063Ui;
        com.facebook.ads.redexgen.core.QZ qzA02 = A02();
        switch (com.facebook.ads.redexgen.core.QY.A00[qzA02.ordinal()]) {
            case 1:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        com.facebook.ads.redexgen.core.JH.A04(viewA01, this.A06, com.facebook.ads.redexgen.core.JE.A0S);
        return new android.util.Pair<>(qzA02, viewA01);
    }
}
