package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OK extends android.widget.RelativeLayout {
    public static java.lang.String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final android.widget.LinearLayout A01;
    public final com.facebook.ads.redexgen.core.C1339cB A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final com.facebook.ads.redexgen.core.J7 A04;
    public final com.facebook.ads.redexgen.core.MR A05;

    public OK(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1339cB c1339cB, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.MR mr, int i, int i2) {
        super(c1199Zs);
        this.A03 = c1199Zs;
        this.A02 = c1339cB;
        this.A04 = j7;
        this.A05 = mr;
        this.A00 = i;
        this.A01 = new android.widget.LinearLayout(c1199Zs);
        A00();
        addView(this.A01, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i2);
    }

    private void A00() {
        int i = 0;
        while (true) {
            int iA1K = this.A02.A1K();
            java.lang.String[] strArr = A06;
            java.lang.String str = strArr[2];
            java.lang.String str2 = strArr[4];
            int iCharAt = str.charAt(18);
            int i2 = str2.charAt(18);
            if (iCharAt == i2) {
                throw new java.lang.RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i < iA1K) {
                com.facebook.ads.redexgen.core.C1067Um c1067Um = new com.facebook.ads.redexgen.core.C1067Um(this.A03, this.A02.A1N(i), this.A04, this.A05);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i3 = com.facebook.ads.redexgen.core.C1067Um.A0C;
                int i4 = com.facebook.ads.redexgen.core.C1067Um.A0C;
                int i5 = com.facebook.ads.redexgen.core.C1067Um.A0C;
                int i6 = com.facebook.ads.redexgen.core.C1067Um.A0C;
                layoutParams.setMargins(i3, i4, i5, i6);
                c1067Um.setLayoutParams(layoutParams);
                this.A01.addView(c1067Um);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i) {
        if (i != 1) {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (((double) this.A00) * 0.25d));
        } else {
            this.A01.setOrientation(1);
            this.A01.setPadding(0, (int) (((double) this.A00) * 1.5d), 0, this.A00);
        }
    }
}
