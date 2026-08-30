package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0899Oa extends android.widget.LinearLayout {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"5HLU", "cJmhtdIbv5Y5xdwCDl3dT8HPvklAUmwI", "4stzzs6gVfUC8wPYX", "7o6tBFGKBnQKcZsvXBJ4ayd9LnRtCNJ", "BSijPHOaulEPVGa4U1fKlqwI", "TamflSlcNH2rcKEIo3f72qWopMk8DENN", "Hhh3HDuTgivrAf4KqreTZK2", "SugScFu"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final android.widget.TextView A00;
    public final android.widget.TextView A01;
    public final android.widget.TextView A02;
    public final boolean A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{31, 26, 26, 27, 10, 31, 23, 18, 13};
    }

    static {
        A01();
        A06 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        A08 = (int) (A06 * 6.0f);
        A07 = (int) (A06 * 8.0f);
    }

    public C0899Oa(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1O c1o, boolean z, int i, int i2, int i3) {
        super(c1199Zs);
        setOrientation(1);
        this.A02 = new android.widget.TextView(c1199Zs);
        com.facebook.ads.redexgen.core.M3.A0Y(this.A02, true, i);
        this.A02.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A08, 1.0f);
        this.A01 = new android.widget.TextView(c1199Zs);
        this.A00 = new android.widget.TextView(c1199Zs);
        com.facebook.ads.redexgen.core.M3.A0Y(this.A00, false, i2);
        this.A00.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A08, 1.0f);
        this.A03 = com.facebook.ads.redexgen.core.C0762Im.A12(c1199Zs);
        int i4 = this.A03 ? -2 : -1;
        addView(this.A02, new android.widget.LinearLayout.LayoutParams(i4, -2));
        addView(this.A01, new android.widget.LinearLayout.LayoutParams(i4, -2));
        this.A01.setVisibility(8);
        A02(c1o, z);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i4, -2);
        layoutParams.setMargins(0, i3, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0899Oa(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1O c1o, boolean z, boolean z2, boolean z3) {
        int i = z2 ? 18 : 22;
        int i2 = z2 ? 14 : 16;
        int i3 = A07;
        this(c1199Zs, c1o, z, i, i2, z3 ? i3 / 2 : i3);
    }

    public final void A02(com.facebook.ads.redexgen.core.C1O c1o, boolean z) {
        this.A02.setTextColor(c1o.A06(z));
        this.A01.setTextColor(c1o.A04(z));
        this.A00.setTextColor(c1o.A05(z));
    }

    public final void A03(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        int i = 1;
        boolean z3 = !android.text.TextUtils.isEmpty(str);
        boolean z4 = !android.text.TextUtils.isEmpty(str2);
        android.widget.TextView textView = this.A02;
        if (!z3) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        android.widget.TextView textView2 = this.A00;
        if (!z3) {
            str2 = A00(0, 0, 51);
        }
        textView2.setText(str2);
        int i2 = 3;
        java.lang.String[] strArr = A05;
        if (strArr[6].length() != strArr[4].length()) {
            java.lang.String[] strArr2 = A05;
            strArr2[3] = "nuTyQWYrKUsKt4wC014k9cpf4UiNlrc";
            strArr2[0] = "l7Wy";
            if (!z3 || !z4) {
                android.widget.TextView textView3 = this.A02;
                if (A05[1].charAt(4) != 'F') {
                    java.lang.String[] strArr3 = A05;
                    strArr3[3] = "qWmgL2iM9nfMb7yMq7CVR7HS6Guvx6S";
                    strArr3[0] = "mFhP";
                    if (z) {
                        i2 = 2;
                    } else if (z2) {
                        i2 = 4;
                    }
                    textView3.setMaxLines(i2);
                    return;
                }
            } else {
                this.A02.setMaxLines(z ? 1 : 2);
                android.widget.TextView textView4 = this.A00;
                if (!z) {
                    i = z2 ? 3 : 2;
                }
                textView4.setMaxLines(i);
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public android.widget.TextView getDescriptionTextView() {
        return this.A00;
    }

    public android.widget.TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i) {
        if (this.A03) {
            setGravity(i);
        }
        this.A02.setGravity(i);
        this.A00.setGravity(i);
    }

    public void setCTAClickListener(com.facebook.ads.redexgen.core.ViewOnClickListenerC1063Ui viewOnClickListenerC1063Ui) {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0903Oe viewOnClickListenerC0903OeA03 = com.facebook.ads.redexgen.core.AbstractC0904Of.A03(viewOnClickListenerC1063Ui, A00(0, 9, 20));
        this.A02.setOnClickListener(viewOnClickListenerC0903OeA03);
        this.A00.setOnClickListener(viewOnClickListenerC0903OeA03);
        this.A01.setOnClickListener(viewOnClickListenerC0903OeA03);
    }

    public void setDescriptionVisibility(int i) {
        this.A00.setVisibility(i);
    }
}
