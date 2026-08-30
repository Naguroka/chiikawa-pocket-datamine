package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0687Fk extends com.facebook.ads.redexgen.core.AbstractC1341cD implements java.io.Serializable {
    public static byte[] A00 = null;
    public static java.lang.String[] A01 = {"r6wxjppTPk8qqzLRyjcbdQcA77ZMVo55", "Rh6olI4hONJ8yannxuNSF0WPku4wNPsq", "dN5FaQTClehdtxF9CoF19H85hY8wkvGi", "rjB6kg9SBUGr2KH1eIh2YUrCeaZ2IjVH", "uwE4iuczSrXuOAqhix1jvRvaNYVxSPYl", "nB4f3mkqn6tAKhT6MHcT9FS4Qvlri7ut", "bNzGTI7RRMeGoANXUPkwX9ogVwA9ri6n", "cACVCPwRSeRCIlqlGfLHSAYd9Lc4yhZp"};
    public static final long serialVersionUID = 2751287062553772011L;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        java.lang.String[] strArr = A01;
        if (strArr[2].charAt(16) == strArr[1].charAt(16)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[2] = "vDQKNoss9qiPXd8S2Aus0c1HGbd5gMQl";
        strArr2[1] = "nSwGzQN60p1E6knkFapFA8fuyb3FeF6N";
        A00 = new byte[]{51, 38, 56, 34, 51, 37, 38, 37, 32, 55, 42, 37, 38, 48};
    }

    static {
        A04();
    }

    public C0687Fk(java.util.List<com.facebook.ads.redexgen.core.C1F> list) {
        super(list);
    }

    public static com.facebook.ads.redexgen.core.C0687Fk A02(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        com.facebook.ads.redexgen.core.C0687Fk c0687Fk = new com.facebook.ads.redexgen.core.C0687Fk(com.facebook.ads.redexgen.core.AbstractC1341cD.A08(jSONObject, c1199Zs, new com.facebook.ads.redexgen.core.C1336c8()));
        c0687Fk.A1Y(jSONObject);
        c0687Fk.A0u(A03(0, 14, 106));
        return c0687Fk;
    }

    @Override // com.facebook.ads.redexgen.core.C1E
    public final int A0R() {
        if (A14()) {
            return 3;
        }
        com.facebook.ads.redexgen.core.C03441b c03441bA06 = A1P().A0E().A06();
        java.lang.String[] strArr = A01;
        if (strArr[2].charAt(16) == strArr[1].charAt(16)) {
            throw new java.lang.RuntimeException();
        }
        A01[7] = "ezJ8b8PzsS2LRx1DwJprOyWzSGtMGS3H";
        if (c03441bA06 != null) {
            com.facebook.ads.redexgen.core.C1F c1fA1P = A1P();
            java.lang.String[] strArr2 = A01;
            if (strArr2[5].charAt(18) == strArr2[3].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "ok7knfjrqIuTR3wAzxIRCawOj6kVTRCj";
            if (c1fA1P.A0E().A06().A0O()) {
                return 4;
            }
            return 1;
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.C1E
    public final int A0S() {
        return A1P().A0E().A04();
    }
}
