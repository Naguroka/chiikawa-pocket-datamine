package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04053k {
    public static java.lang.String[] A01 = {"gvBt6XO", "nDdZtD2RAkyhnTB6dMy", "tszEn2avf0fRCcxBO6xRy", "E0tn4QM", "iaPjqZyyyQaCpNWvaI", "KgsGXwLuVnUqvF5nQn", "yu6fUddk60dZyPwDlNP", "AMQfN"};
    public final java.lang.Object A00;

    public C04053k(java.lang.Object obj) {
        this.A00 = obj;
    }

    public static com.facebook.ads.redexgen.core.C04053k A00(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C04053k(obj);
    }

    public static java.lang.Object A01(com.facebook.ads.redexgen.core.C04053k c04053k) {
        if (c04053k == null) {
            return null;
        }
        return c04053k.A00;
    }

    public final int A02() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            java.lang.Object obj = this.A00;
            java.lang.String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[6] = "XuX3PdHW7G0KVvQYj2l";
            strArr2[1] = "rc8Q8MxCTHV42NNfZos";
            return ((android.view.WindowInsets) obj).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public final int A03() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.A00).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public final int A04() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.A00).getSystemWindowInsetRight();
        }
        return 0;
    }

    public final int A05() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.A00).getSystemWindowInsetTop();
        }
        return 0;
    }

    public final com.facebook.ads.redexgen.core.C04053k A06(int i, int i2, int i3, int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return new com.facebook.ads.redexgen.core.C04053k(((android.view.WindowInsets) this.A00).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public final boolean A07() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            java.lang.Object obj = this.A00;
            if (A01[2].length() == 31) {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "4PMLj";
            return ((android.view.WindowInsets) obj).isConsumed();
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C04053k c04053k = (com.facebook.ads.redexgen.core.C04053k) obj;
        if (this.A00 == null) {
            return c04053k.A00 == null;
        }
        return this.A00.equals(c04053k.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
