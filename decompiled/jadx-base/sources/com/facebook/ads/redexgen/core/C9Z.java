package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9Z extends com.facebook.ads.redexgen.core.VP {
    public static byte[] A0F;
    public static java.lang.String[] A0G = {"tW3Su6P8GZp1yTngpwFy2DF2GhDzXnf2", "3HQabaXZCQWVf5CedpF1izNpaoU6B", "XHPkWVuaRS230ZzCiYR7qtQACoZnYKM5", "gQNAwnCobdMDtnebLpL2jf4350QwOymE", "dRJ3n5TbirTJDeON6upQokchUTJmTtSu", "43KhzPf8qbqk0SZtfSmXLCVXJtKHuuuO", "kYCENHGiqRDWZvuV9M2TmYzxFqbu31T5", "7NDfQDtGKt0HcNI2moZZTs031QkqKmSX"};
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    public android.widget.LinearLayout A02;
    public com.facebook.ads.redexgen.core.AbstractC1341cD A03;
    public com.facebook.ads.redexgen.core.C04766f A04;
    public com.facebook.ads.redexgen.core.C04123r A05;
    public com.facebook.ads.redexgen.core.OT A06;
    public com.facebook.ads.redexgen.core.TV A07;
    public com.facebook.ads.redexgen.core.AbstractC0986Rj A08;
    public com.facebook.ads.redexgen.core.C0987Rk A09;
    public java.lang.String A0A;
    public java.util.List<com.facebook.ads.redexgen.core.QK> A0B;
    public boolean A0C;
    public final com.facebook.ads.redexgen.core.C1199Zs A0D;
    public final com.facebook.ads.redexgen.core.C0842Lv A0E;

    public static java.lang.String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 7);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{66, 71, 124, 71, 66, 87, 66, 124, 65, 86, 77, 71, 79, 70, 18, 5, 23, 1, 18, 4, 5, 4, 54, 9, 4, 5, 15, 33, 4, 36, 1, 20, 1, 34, 21, 14, 4, 12, 5};
    }

    static {
        A0C();
        A0H = (int) (com.facebook.ads.redexgen.core.LP.A02 * 48.0f);
        A0I = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A0J = (int) (com.facebook.ads.redexgen.core.LP.A02 * 8.0f);
        A0L = (int) (com.facebook.ads.redexgen.core.LP.A02 * 56.0f);
        A0K = (int) (com.facebook.ads.redexgen.core.LP.A02 * 12.0f);
    }

    public C9Z(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0687Fk c0687Fk) {
        super(c1199Zs, j7, mr, c0687Fk);
        this.A0E = new com.facebook.ads.redexgen.core.C0842Lv();
        this.A0C = false;
        super.A07 = true;
        super.A06 = new com.facebook.ads.redexgen.core.C0953Qc(c1199Zs, new com.facebook.ads.redexgen.core.V5(), super.A0A.A0m(), mr);
        this.A04 = c04766f;
        this.A0D = c1199Zs;
    }

    public C9Z(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.MR mr, com.facebook.ads.redexgen.core.C0689Fm c0689Fm) {
        super(c1199Zs, j7, mr, c0689Fm);
        this.A0E = new com.facebook.ads.redexgen.core.C0842Lv();
        this.A0C = false;
        this.A04 = c04766f;
        this.A0D = c1199Zs;
    }

    private com.facebook.ads.redexgen.core.AbstractC1341cD A00(android.content.Intent intent) {
        if (super.A07) {
            return (com.facebook.ads.redexgen.core.AbstractC1341cD) intent.getSerializableExtra(A0A(14, 25, 103));
        }
        return (com.facebook.ads.redexgen.core.AbstractC1341cD) intent.getSerializableExtra(A0A(0, 14, 36));
    }

    private final void A0D() {
        if (this.A02 != null) {
            this.A02.removeAllViews();
            if (A0G[3].charAt(5) != 'n') {
                throw new java.lang.RuntimeException();
            }
            A0G[4] = "3JPxSaqJUpKyt95G35P4gQJAerHutmpA";
            this.A02 = null;
        }
        if (this.A05 != null) {
            this.A05.removeAllViews();
            this.A05.A1Q();
            this.A05 = null;
        }
        if (this.A06 != null) {
            this.A06.removeAllViews();
            this.A06 = null;
        }
    }

    private final void A0E(int i, android.os.Bundle bundle) {
        int extraSpacing;
        int i2;
        int height;
        this.A02 = new android.widget.LinearLayout(getContext());
        if (i == 1) {
            this.A02.setGravity(17);
        } else {
            this.A02.setGravity(48);
        }
        this.A02.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i3 = com.facebook.ads.redexgen.core.LP.A03.widthPixels;
        int i4 = com.facebook.ads.redexgen.core.LP.A03.heightPixels;
        if (i == 1) {
            extraSpacing = java.lang.Math.min(i3 - (A0I * 4), i4 / 2);
            i2 = (i3 - extraSpacing) / 8;
            height = i2 * 4;
        } else {
            extraSpacing = i4 - ((A0L + A0H) + (A0I * 4));
            i2 = A0I;
            height = i2 * 2;
        }
        this.A08 = new com.facebook.ads.redexgen.core.TP(this);
        this.A09 = new com.facebook.ads.redexgen.core.C0987Rk(this, 1, new java.lang.ref.WeakReference(this.A08), this.A0D);
        this.A09.A0W(this.A00);
        this.A09.A0X(this.A01);
        this.A05 = new com.facebook.ads.redexgen.core.C04123r(this.A0D);
        this.A05.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new com.facebook.ads.redexgen.core.TV(this.A05, i, this.A0B, this.A09, bundle);
        int extraSpacing2 = i2;
        int childSpacing = extraSpacing;
        this.A05.setAdapter(new com.facebook.ads.redexgen.core.TQ(this.A0D, this.A0B, this.A03, super.A0C, this.A04, this.A09, this.A0E, getAudienceNetworkListener(), this.A0A, childSpacing, extraSpacing2, height, i, this.A07, super.A0E));
        this.A05.A1f(this.A05.getOnScrollListener());
        if (i == 1) {
            A0G(this.A07);
        }
        this.A02.addView(this.A05);
        if (this.A06 != null) {
            this.A02.addView(this.A06);
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A0D)) {
            this.A0D.A0A().AHO(this.A05, super.A0A.A1U(), false);
        }
        A0V(this.A02, false, i);
    }

    private void A0F(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        this.A03 = abstractC1341cD;
        this.A0A = this.A03.A1U();
        this.A00 = this.A03.A0O();
        this.A01 = this.A03.A0P();
        java.util.List<com.facebook.ads.redexgen.core.C1F> listA1W = this.A03.A1W();
        java.util.List<com.facebook.ads.internal.adapters.datamodels.AdInfo> adInfoList = new java.util.ArrayList<>(listA1W.size());
        this.A0B = adInfoList;
        for (int i = 0; i < listA1W.size(); i++) {
            com.facebook.ads.redexgen.core.C1F c1f = listA1W.get(i);
            java.util.List<com.facebook.ads.redexgen.core.QK> list = this.A0B;
            int i2 = listA1W.size();
            list.add(new com.facebook.ads.redexgen.core.QK(i, i2, c1f));
        }
    }

    private void A0G(com.facebook.ads.redexgen.core.TV tv) {
        new com.facebook.ads.redexgen.core.FM().A0G(this.A05);
        tv.A0Y(new com.facebook.ads.redexgen.core.TO(this));
        this.A06 = new com.facebook.ads.redexgen.core.OT(this.A0D, super.A05.A01(), this.A0B.size());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, A0J);
        layoutParams.setMargins(0, A0K, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final boolean A0b() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void A9q(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C5Q c5q) {
        com.facebook.ads.redexgen.core.AbstractC1341cD dataBundle = A00(intent);
        A0W(c5q);
        A0F(dataBundle);
        A0E(c5q.A05().getResources().getConfiguration().orientation, bundle);
        c5q.A0A(new com.facebook.ads.redexgen.core.TN(this, c5q));
        com.facebook.ads.redexgen.core.AbstractC1341cD dataBundle2 = super.A0A;
        int unskippableSec = dataBundle2.A1P().A0E().A03();
        if (super.A07) {
            com.facebook.ads.redexgen.core.AbstractC1341cD dataBundle3 = super.A0A;
            unskippableSec = dataBundle3.A1P().A0E().A02();
        }
        if (unskippableSec > 0) {
            A0U(unskippableSec);
        }
    }

    @Override // com.facebook.ads.redexgen.core.VP, com.facebook.ads.redexgen.core.MS
    public final void ACz(boolean z) {
        super.ACz(z);
        if (this.A07 != null) {
            this.A07.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.core.VP, com.facebook.ads.redexgen.core.MS
    public final void ADN(boolean z) {
        super.ADN(z);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void AFx(android.os.Bundle bundle) {
        if (this.A07 != null) {
            this.A07.A0W(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.os.Bundle bundle = new android.os.Bundle();
        AFx(bundle);
        A0D();
        A0E(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.core.VP, com.facebook.ads.redexgen.core.MS
    public final void onDestroy() {
        super.onDestroy();
        if (com.facebook.ads.redexgen.core.C0762Im.A1p(this.A0D)) {
            this.A0D.A0A().AHC(this.A05);
        }
        if (!android.text.TextUtils.isEmpty(this.A0A)) {
            super.A0C.A9x(this.A0A, new com.facebook.ads.redexgen.core.O8().A03(this.A09).A02(this.A0E).A05());
        }
        A0D();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.A0E.A06(this.A0D, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
