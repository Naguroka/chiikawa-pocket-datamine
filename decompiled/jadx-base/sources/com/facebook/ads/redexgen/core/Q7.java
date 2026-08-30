package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Q7 extends android.widget.LinearLayout {
    public android.widget.LinearLayout A00;
    public java.lang.String A01;
    public boolean A02;
    public final int A03;
    public final com.facebook.ads.redexgen.core.C1199Zs A04;
    public final com.facebook.ads.redexgen.core.OU A05;
    public final com.facebook.ads.redexgen.core.C0899Oa A06;
    public static java.lang.String[] A07 = {"mO6OCzz183u1Bigulq5KeRnnu3UhUErY", "M8wuVwCqg47swjluxOTBwYkXCALJOS1f", "isO3a6yeUrEqJHaKmCFaV", "J8y0fQZRtVpgz1Itec1cmA3ue79eN13N", "z6IigVxY2j2waSprQRCf4749VcxJv5uz", "GG3OTiE6t7MwpY", "UBA0QA1YjTXejDlGkh9vREu7YbW4o1hK", "iNB15eFG13fee2"};
    public static final int A0A = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A0B = (int) (com.facebook.ads.redexgen.core.LP.A02 * 32.0f);
    public static final int A0C = (int) (com.facebook.ads.redexgen.core.LP.A02 * 16.0f);
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 4.0f);
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.LP.A02 * 72.0f);

    public Q7(com.facebook.ads.redexgen.core.Q5 q5) {
        super(q5.A08);
        this.A02 = false;
        this.A01 = "";
        this.A04 = q5.A08;
        this.A05 = new com.facebook.ads.redexgen.core.OU(this.A04);
        this.A06 = new com.facebook.ads.redexgen.core.C0899Oa(this.A04, q5.A01, true, false, true);
        this.A03 = q5.A00;
        this.A02 = q5.A05;
        this.A01 = q5.A04;
        A03(q5);
    }

    public /* synthetic */ Q7(com.facebook.ads.redexgen.core.Q5 q5, com.facebook.ads.redexgen.core.C1036Th c1036Th) {
        this(q5);
    }

    private void A00() {
        A01(this.A05, 150);
        A01(this.A06, org.objectweb.asm.Opcodes.TABLESWITCH);
        if (this.A00 != null) {
            A01(this.A00, org.objectweb.asm.Opcodes.ARRAYLENGTH);
        }
    }

    private void A01(android.view.View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator(2.0f));
    }

    private void A02(com.facebook.ads.redexgen.core.Q5 q5) {
        if (!android.text.TextUtils.isEmpty(q5.A03)) {
            this.A00 = new android.widget.LinearLayout(getContext());
            this.A00.setGravity(17);
            int i = A0C / 2;
            if (this.A02) {
                i = 0;
            }
            android.widget.LinearLayout linearLayout = this.A00;
            int i2 = A0C;
            int i3 = A0C;
            int marginTop = A0C;
            linearLayout.setPadding(i2, i, i3, marginTop / 2);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, i, 0, 0);
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setTextColor(-1);
            com.facebook.ads.redexgen.core.M3.A0Y(textView, false, 16);
            textView.setText(q5.A03);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(imageView, this.A04).A04().A07(q5.A02);
            int i4 = A0A;
            int marginTop2 = A0A;
            android.widget.LinearLayout.LayoutParams informativeContainerParams = new android.widget.LinearLayout.LayoutParams(i4, marginTop2);
            int marginTop3 = A0C;
            informativeContainerParams.setMargins(0, 0, marginTop3 / 2, 0);
            if (this.A02) {
                com.facebook.ads.redexgen.core.OO oo = new com.facebook.ads.redexgen.core.OO(getContext(), 0, -1, com.facebook.ads.redexgen.core.MB.PLAYABLE_ICON);
                oo.setLayoutParams(new android.widget.LinearLayout.LayoutParams(A0B, A0B));
                this.A00.addView(oo);
            } else {
                this.A00.addView(imageView, informativeContainerParams);
                this.A00.addView(textView, layoutParams2);
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setCornerRadius(100.0f);
                gradientDrawable.setColor(469762047);
                com.facebook.ads.redexgen.core.M3.A0S(this.A00, gradientDrawable);
            }
            android.view.View view = this.A00;
            java.lang.String[] strArr = A07;
            java.lang.String str = strArr[5];
            java.lang.String str2 = strArr[7];
            int length = str.length();
            int marginTop4 = str2.length();
            if (length != marginTop4) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A07;
            strArr2[0] = "6JdK2pyeEPUWkfGuYxPy07w26kgdYt9J";
            strArr2[1] = "5VEwQONd4c8VI19uC0Ib5tVL9YvIxUH6";
            addView(view, layoutParams);
        }
    }

    private void A03(com.facebook.ads.redexgen.core.Q5 q5) {
        com.facebook.ads.redexgen.core.M3.A0M(this.A05, 0);
        this.A05.setRadius(50);
        if (!this.A02) {
            if (q5.A06.A00() == com.facebook.ads.redexgen.core.C1K.A05) {
                this.A05.setFullCircleCorners(true);
            } else {
                com.facebook.ads.redexgen.core.OU ou = this.A05;
                int i = A09;
                java.lang.String[] strArr = A07;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new java.lang.RuntimeException();
                }
                A07[2] = "avcxrBXnTsgV2I5Ie1k2l";
                ou.setRadius(i);
            }
        } else {
            this.A05.setRadius(A09);
        }
        new com.facebook.ads.redexgen.core.AsyncTaskC1068Un(this.A05, this.A04).A04().A07(q5.A07.A01());
        this.A06.A03(q5.A06.A08(), q5.A07.A03(), null, false, true);
        if (!this.A02) {
            this.A06.getDescriptionTextView().setAlpha(0.8f);
        } else {
            this.A06.getDescriptionTextView().setText(this.A01);
        }
        this.A06.setAlignment(17);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A0C, 0, A0C / 2);
        android.view.View view = this.A05;
        android.view.ViewGroup.LayoutParams titleAndDescriptionParams = new android.widget.LinearLayout.LayoutParams(A08, A08);
        addView(view, titleAndDescriptionParams);
        addView(this.A06, layoutParams);
        A02(q5);
        com.facebook.ads.redexgen.core.M3.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(com.facebook.ads.redexgen.core.Q6 q6) {
        A00();
        postDelayed(new com.facebook.ads.redexgen.core.C1036Th(this, q6), this.A03);
    }
}
