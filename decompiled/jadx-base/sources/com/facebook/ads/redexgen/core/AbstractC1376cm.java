package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1376cm extends com.facebook.ads.redexgen.core.AbstractC03250h {
    public static java.lang.String A03;
    public static java.lang.String A04;
    public static java.lang.String A05;
    public static byte[] A06;
    public static java.lang.String[] A07 = {"yKsrGZvRhlHO", "9EputwQvm", "xy4ysuU", "7AjoeEFyRFUmAcGguWz5skIE39kXLiT8", "yw7hkrjnug4F5v8JlqxYlpspwNYrqeOP", "YdvcKbM", "Mv5W7ZjuxpjDlIvwBIaHg3eS9AlP", "wZHnfIG7rJSoOb"};
    public final boolean A00;
    public final com.facebook.ads.redexgen.core.C03310o A01;
    public final boolean A02;

    public static java.lang.String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 48);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0B() {
        byte[] bArr = {60, 19, 22, 28, 20, 95, 19, 16, 24, 24, 26, 27, 24, 23, 29, 11, 22, 16, 29, 87, 16, 23, 13, 28, 23, 13, 87, 24, 26, 13, 16, 22, 23, 87, 47, 48, 60, 46, 17, 18, 16, 24, 44, 7, 26, 30, 22, 35, 42, 46, 57, 42, 16, 59, 38, 34, 42, 34, 56, 57, 46, 34, 32, 40, 41, 47, 57, 57, okio.Utf8.REPLACEMENT_BYTE, 41, 41, 65, 90, 93, 66, 81, 70, 71, 85, 88, 107, 88, 93, 90, 95, 20, 18, 4, 19, 62, 21, 19, 0, 2, 10, 4, 19, 62, 8, 18, 62, 15, 14, 21, 62, 15, 20, 13, 13, 5, 19, 6, 17, 26, 45, 19, 28, 22, 45, 16, 0, 29, 5, 1, 23};
        if (A07[1].length() != 9) {
            throw new java.lang.RuntimeException();
        }
        A07[7] = "E0qxoPtldo8saq";
        A06 = bArr;
    }

    public abstract com.facebook.ads.redexgen.core.EnumC03240g A0D();

    static {
        A0B();
        A03 = A0A(64, 7, 106);
        A04 = A0A(85, 24, 81);
        A05 = A0A(109, 16, 66);
    }

    public AbstractC1376cm(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, com.facebook.ads.redexgen.core.C03310o c03310o, boolean z) {
        this(c1199Zs, j7, str, c03310o, z, false);
    }

    public AbstractC1376cm(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.J7 j7, java.lang.String str, com.facebook.ads.redexgen.core.C03310o c03310o, boolean z, boolean z2) {
        super(c1199Zs, j7, str);
        this.A01 = c03310o;
        this.A02 = z;
        this.A00 = z2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03250h
    public final com.facebook.ads.redexgen.core.EnumC03240g A0C() {
        if (this.A01 != null) {
            this.A01.A07(super.A02);
        }
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = super.A00;
        if (A07[7].length() != 14) {
            throw new java.lang.RuntimeException();
        }
        A07[3] = "9d6GoSvBACG6VCN4qR5bPjffs9IY5LAp";
        if (com.facebook.ads.redexgen.core.OH.A03(c1199Zs)) {
            return com.facebook.ads.redexgen.core.EnumC03240g.A06;
        }
        return A0D();
    }

    public final void A0E(java.util.Map<java.lang.String, java.lang.String> extraData, com.facebook.ads.redexgen.core.EnumC03240g enumC03240g) {
        if (!android.text.TextUtils.isEmpty(super.A02)) {
            if (this instanceof com.facebook.ads.redexgen.core.C0705Gf) {
                super.A01.AAY(super.A02, extraData);
            } else {
                super.A01.AA9(super.A02, extraData);
            }
            boolean zA02 = com.facebook.ads.redexgen.core.EnumC03240g.A02(enumC03240g);
            boolean z = this.A01 != null;
            boolean isError = com.facebook.ads.redexgen.core.C0762Im.A2J(super.A00);
            if (isError) {
                java.util.Map<java.lang.String, java.lang.String> navigationDataMap = new java.util.HashMap<>();
                boolean isError2 = !zA02;
                navigationDataMap.put(A03, java.lang.Boolean.toString(isError2));
                navigationDataMap.put(A04, java.lang.Boolean.toString(z));
                java.lang.String str = A05;
                boolean isError3 = this.A00;
                navigationDataMap.put(str, java.lang.Boolean.toString(isError3));
                super.A01.AAI(super.A02, navigationDataMap);
            }
            if (this.A01 != null) {
                this.A01.A06(enumC03240g);
                if (zA02) {
                    this.A01.A05();
                }
            } else {
                java.util.HashMap map = new java.util.HashMap();
                map.put(A0A(47, 10, 127), java.lang.Long.toString(-1L));
                map.put(A0A(38, 9, 67), java.lang.Long.toString(-1L));
                map.put(A0A(57, 7, 125), com.facebook.ads.redexgen.core.EnumC03240g.A05.name());
                super.A01.AAZ(super.A02, map);
            }
        }
        com.facebook.ads.redexgen.core.LC.A04(super.A00, A0A(0, 12, 79));
    }

    public final boolean A0F(android.net.Uri uri) {
        try {
            java.lang.String queryParameter = uri.getQueryParameter(A0A(71, 14, 4));
            boolean redirectedToApp = android.text.TextUtils.isEmpty(queryParameter);
            if (redirectedToApp) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent(A0A(12, 26, 73), com.facebook.ads.redexgen.core.L5.A00(queryParameter));
            intent.addFlags(268435456);
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1024);
            }
            return com.facebook.ads.redexgen.core.C0813Kq.A0C(super.A00, intent);
        } catch (com.facebook.ads.redexgen.core.C0811Ko unused) {
            return false;
        }
    }
}
