package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1067Um extends com.facebook.ads.redexgen.core.AbstractC03732e {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"YL1yLKFo15UZj59z8sTirpPX5rRsAE8", "O", "O6aHciR8nIcXgMvSQpLVacnv7HWgT320", "WCwGMxKVAM83NNo23MC3P4tNfApW0jy", "jLj4WTNtvai9N9Pzwov0sYarXBGRxB6J", "t8UiaIyNKCcrJZePb4XsdzT37H29Zzi", "ckjPU6sQ4thPoQS3sFeS4HnUH", ""};
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public final android.widget.LinearLayout A00;
    public final android.widget.RelativeLayout A01;
    public final com.facebook.ads.redexgen.core.AbstractC1341cD A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final com.facebook.ads.redexgen.core.J7 A04;
    public final com.facebook.ads.redexgen.core.C0842Lv A05;
    public final com.facebook.ads.redexgen.core.MR A06;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 65);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A03);
        com.facebook.ads.redexgen.core.OU ou = new com.facebook.ads.redexgen.core.OU(this.A03);
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(ou, this.A03).A05(A0D, A0D).A07(this.A02.A1S().A01());
        ou.setFullCircleCorners(true);
        com.facebook.ads.redexgen.core.M3.A0M(ou, 0);
        com.facebook.ads.redexgen.core.M3.A0K(ou);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0D, A0D);
        layoutParams.setMargins(A0C, A0C, A0C, A0C);
        layoutParams.addRule(14);
        relativeLayout.addView(ou, layoutParams);
        android.widget.TextView textView = new android.widget.TextView(this.A03);
        com.facebook.ads.redexgen.core.M3.A0K(textView);
        textView.setTextColor(this.A02.A1O().A01().A06(true));
        textView.setText(this.A02.A1P().A0F().A08());
        textView.setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, ou.getId());
        relativeLayout.addView(textView, layoutParams2);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A03);
        com.facebook.ads.redexgen.core.M3.A0K(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A0C, 0, A0C, A0C);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, textView.getId());
        relativeLayout.addView(linearLayout, layoutParams3);
        com.facebook.ads.redexgen.core.OW ow = new com.facebook.ads.redexgen.core.OW(this.A03, A0B, 5, A0A, -1);
        ow.setGravity(16);
        linearLayout.addView(ow, new android.widget.LinearLayout.LayoutParams(-2, -1));
        android.widget.TextView textView2 = new android.widget.TextView(this.A03);
        textView2.setTextColor(this.A02.A1O().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        com.facebook.ads.redexgen.core.M3.A0Y(textView2, false, 14);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        layoutParams4.leftMargin = A09;
        linearLayout.addView(textView2, layoutParams4);
        if (android.text.TextUtils.isEmpty(this.A02.A1P().A0F().A05())) {
            java.lang.String[] strArr = A08;
            if (strArr[3].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[4] = "pDxc6WlcrgExZnzDlKhHZoNjTSnAqRc0";
            strArr2[2] = "JfppCwNpdT1PFGKwLRSAK2lJbowaAIWW";
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            ow.setRating(java.lang.Float.parseFloat(this.A02.A1P().A0F().A05()));
            if (this.A02.A1P().A0F().A04() != null) {
                textView2.setText(A03(0, 1, 116) + java.text.NumberFormat.getNumberInstance().format(java.lang.Integer.parseInt(this.A02.A1P().A0F().A04())) + A03(1, 1, 1));
            }
        }
        android.widget.TextView textView3 = new android.widget.TextView(this.A03);
        textView3.setTextColor(this.A02.A1O().A01().A06(true));
        textView3.setText(this.A02.A1P().A0F().A02());
        textView3.setGravity(17);
        textView3.setPadding(A0C, A0C, A0C, A0C);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, linearLayout.getId());
        relativeLayout.addView(textView3, layoutParams5);
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 4;
        layoutParams6.weight = 0.8f;
        this.A00.addView(relativeLayout, layoutParams6);
    }

    public static void A06() {
        A07 = new byte[]{29, 105};
    }

    static {
        A06();
        A0C = (int) (com.facebook.ads.redexgen.core.AbstractC03732e.A08 * 12.0f);
        A0D = (int) (com.facebook.ads.redexgen.core.AbstractC03732e.A08 * 84.0f);
        A0B = (int) (com.facebook.ads.redexgen.core.AbstractC03732e.A08 * 14.0f);
        A09 = (int) (com.facebook.ads.redexgen.core.AbstractC03732e.A08 * 8.0f);
        A0A = com.facebook.ads.redexgen.core.AbstractC03842p.A01(-1, 77);
    }

    public C1067Um(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr) {
        super(c1199Zs);
        this.A05 = new com.facebook.ads.redexgen.core.C0842Lv();
        this.A03 = c1199Zs;
        this.A02 = abstractC1341cD;
        this.A04 = j7;
        this.A06 = mr;
        this.A05.A05();
        setRadius(20.0f);
        setMaxCardElevation(75.0f);
        this.A01 = new android.widget.RelativeLayout(c1199Zs);
        com.facebook.ads.redexgen.core.AbstractC0900Ob.A00(c1199Zs, this.A01, abstractC1341cD.A1P().A0E().A07());
        this.A00 = new android.widget.LinearLayout(this.A03);
        this.A00.setOrientation(1);
        A05();
        A04();
        this.A01.addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(this.A01, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    private void A04() {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui(this.A03, com.facebook.ads.redexgen.core.EnumC0972Qv.A04.A03(), this.A02.A1O().A01(), this.A02.A1P().A0G().A06(), this.A04, this.A06, null, this.A05, this.A02.A1Q());
        viewOnClickListenerC1063Ui.setViewShowsOverMedia(true);
        com.facebook.ads.redexgen.core.M3.A0G(1001, viewOnClickListenerC1063Ui);
        viewOnClickListenerC1063Ui.setCta(this.A02.A1P().A0G(), this.A02.A1U(), new java.util.HashMap(), null);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        viewOnClickListenerC1063Ui.setPadding(A0C, A0C, A0C, A0C);
        layoutParams.setMargins(A0C, A0C, A0C, A0C * 2);
        this.A00.addView(viewOnClickListenerC1063Ui, layoutParams);
    }
}
