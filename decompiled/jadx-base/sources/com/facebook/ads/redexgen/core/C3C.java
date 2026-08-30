package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3C extends com.facebook.ads.redexgen.core.C3P implements com.facebook.ads.redexgen.core.QH {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"J7yX0QGw9CwhbXJlOgK1AZPNtt2UF0On", "oXMSY1TARkqssgt6s8jHvILUEU9", "ivvOLLZvAzFcQQYEM", "46hEJr0dkjUa2YxjnqHHZtVzHBYgDtfX", "qOyhICr4SrTKnx9gG6JsVKrXp45uLK", "kbgvhlczlSdLn8qANYfrfCagYhnCySOb", "Z6RoLzaVoBLmlhzvAeWOPUTl5laN13sF", "YB9cTMd7bVO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public com.facebook.ads.redexgen.core.InterfaceC0848Mb A04;
    public boolean A05;
    public final com.facebook.ads.redexgen.core.CD A06;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 46);
            if (A08[0].charAt(21) != 'Z') {
                throw new java.lang.RuntimeException();
            }
            A08[3] = "76s3uTgYoGqvxE8PFJZmOuk3NB8C1jhQ";
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-68, -69, -99, -82, -76, -78, -112, -75, -82, -69, -76, -78, -79};
    }

    static {
        A03();
    }

    public C3C(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        super(c1199Zs);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new com.facebook.ads.redexgen.core.CD(c1199Zs, new com.facebook.ads.redexgen.core.QE(), new com.facebook.ads.redexgen.core.QD());
        A02();
    }

    public C3C(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet) {
        super(c1199Zs, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new com.facebook.ads.redexgen.core.CD(c1199Zs, new com.facebook.ads.redexgen.core.QE(), new com.facebook.ads.redexgen.core.QD());
        A02();
    }

    public C3C(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.util.AttributeSet attributeSet, int i) {
        super(c1199Zs, attributeSet, i);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new com.facebook.ads.redexgen.core.CD(c1199Zs, new com.facebook.ads.redexgen.core.QE(), new com.facebook.ads.redexgen.core.QD());
        A02();
    }

    private int A00(int i) {
        int i2 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i3 = (measuredWidth - spacing) - i2;
        int itemSize = getAdapter().A0E();
        int numFullItems = 0;
        int spacing2 = Integer.MAX_VALUE;
        while (spacing2 > i) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i;
            }
            int spacing3 = numFullItems * i2;
            spacing2 = (int) ((i3 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2A(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        com.facebook.ads.redexgen.core.M3.A0K(this);
    }

    private void A04(int i, int i2) {
        if (i == this.A03 && i2 == this.A02) {
            return;
        }
        this.A03 = i;
        this.A02 = i2;
        if (A08[3].charAt(25) != 'B') {
            throw new java.lang.RuntimeException();
        }
        A08[2] = "arB2ao";
        if (0 != 0) {
            throw new java.lang.NullPointerException(A01(0, 13, 31));
        }
    }

    @Override // com.facebook.ads.redexgen.core.C3P
    public final void A1y(int i, boolean z) {
        super.A1y(i, z);
        A04(i, 0);
    }

    @Override // com.facebook.ads.redexgen.core.QH
    public final int A87(int i) {
        int iAbs = java.lang.Math.abs(i);
        int scrollXAbs = ((com.facebook.ads.redexgen.core.C3P) this).A06;
        if (iAbs <= scrollXAbs) {
            return 0;
        }
        int scrollXAbs2 = this.A01;
        if (scrollXAbs2 == 0) {
            return 1;
        }
        int scrollXAbs3 = this.A01;
        return 1 + (iAbs / scrollXAbs3);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.FL, android.view.View
    public final void onMeasure(int i, int i2) {
        int height;
        int itemSize;
        super.onMeasure(i, i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i3 = (int) com.facebook.ads.redexgen.core.LP.A02;
            int verticalPadding = com.facebook.ads.redexgen.core.C0762Im.A0F(getContext());
            height = (i3 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            height = java.lang.Math.round(verticalPadding2 / 1.91f);
        }
        int verticalPadding3 = android.view.View.MeasureSpec.getMode(i2);
        switch (verticalPadding3) {
            case Integer.MIN_VALUE:
                int verticalPadding4 = android.view.View.MeasureSpec.getSize(i2);
                height = java.lang.Math.min(verticalPadding4, height);
                break;
            case 1073741824:
                height = android.view.View.MeasureSpec.getSize(i2);
                break;
        }
        int height2 = height - paddingTop;
        if (this.A05) {
            int verticalPadding5 = com.facebook.ads.redexgen.core.MX.A09;
            itemSize = java.lang.Math.min(verticalPadding5, height2);
        } else {
            itemSize = A00(height2);
        }
        int height3 = getMeasuredWidth();
        int verticalPadding6 = itemSize + paddingTop;
        setMeasuredDimension(height3, verticalPadding6);
        if (!this.A05) {
            int verticalPadding7 = this.A00;
            setChildWidth((verticalPadding7 * 2) + itemSize);
        }
    }

    @Override // com.facebook.ads.redexgen.core.FL
    public void setAdapter(com.facebook.ads.redexgen.core.AbstractC04224c abstractC04224c) {
        this.A06.A2H(abstractC04224c == null ? -1 : abstractC04224c.hashCode());
        super.setAdapter(abstractC04224c);
    }

    public void setChildSpacing(int i) {
        this.A00 = i;
    }

    public void setChildWidth(int i) {
        this.A01 = i;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i2 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i3 = i2 - pageWidth2;
        com.facebook.ads.redexgen.core.CD cd = this.A06;
        int pageWidth3 = this.A01;
        cd.A2I((i3 - pageWidth3) / 2);
        com.facebook.ads.redexgen.core.CD cd2 = this.A06;
        int pageWidth4 = this.A01;
        cd2.A2G(((double) pageWidth4) / ((double) measuredWidth));
    }

    public void setCurrentPosition(int i) {
        A1y(i, false);
    }

    public void setOnPageChangedListener(com.facebook.ads.redexgen.core.InterfaceC0848Mb interfaceC0848Mb) {
        this.A04 = interfaceC0848Mb;
    }

    public void setShowTextInCarousel(boolean z) {
        this.A05 = z;
    }
}
