package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0689Fm extends com.facebook.ads.redexgen.core.AbstractC1341cD implements java.io.Serializable {
    public static byte[] A00 = null;
    public static java.lang.String[] A01 = {"", "DwBpRdjhynFrlzLsBFrR", "QSeBoONoLaQYOKTzvkglRPiKzJDmlw8V", "7gQnCJoaPerIMpa6ilCeIjK7d9DzDLkx", "0G82UgBGsFbmab2LaOSe1R1N", "BET7yFkEMT8u6XlB2K", "", "QGCw11GNV2Lw2F7bA4MSMYlzIGOyIq"};
    public static final long serialVersionUID = 5751287062553772011L;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
            if (A01[5].length() != 18) {
                throw new java.lang.RuntimeException();
            }
            A01[4] = "xBe8M";
            bArrCopyOfRange[i4] = b;
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83};
    }

    static {
        A04();
    }

    public C0689Fm(java.util.List<com.facebook.ads.redexgen.core.C1F> list) {
        super(list);
    }

    public static com.facebook.ads.redexgen.core.C0689Fm A02(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        com.facebook.ads.redexgen.core.C0689Fm c0689Fm = new com.facebook.ads.redexgen.core.C0689Fm(com.facebook.ads.redexgen.core.AbstractC1341cD.A08(jSONObject, c1199Zs, new com.facebook.ads.redexgen.core.C1338cA()));
        c0689Fm.A1Y(jSONObject);
        c0689Fm.A0u(A03(0, 12, 9));
        return c0689Fm;
    }

    @Override // com.facebook.ads.redexgen.core.C1E
    public final int A0R() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.C1E
    public final int A0S() {
        return 0;
    }
}
