package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0690Fn extends com.facebook.ads.redexgen.core.AbstractC1341cD {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{okio.Utf8.REPLACEMENT_BYTE, 60, 51, 51, 56, 47};
    }

    public C0690Fn(java.util.List<com.facebook.ads.redexgen.core.C1F> list) {
        super(list);
    }

    public static com.facebook.ads.redexgen.core.C0690Fn A02(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        com.facebook.ads.redexgen.core.C0690Fn c0690Fn = new com.facebook.ads.redexgen.core.C0690Fn(com.facebook.ads.redexgen.core.AbstractC1341cD.A08(jSONObject, c1199Zs, new com.facebook.ads.redexgen.core.C1340cC()));
        c0690Fn.A1Y(jSONObject);
        c0690Fn.A0u(A03(0, 6, 6));
        return c0690Fn;
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
