package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0688Fl extends com.facebook.ads.redexgen.core.AbstractC1341cD {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 49);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{52, 59, 46, 51, 44, okio.Utf8.REPLACEMENT_BYTE};
    }

    public C0688Fl(java.util.List<com.facebook.ads.redexgen.core.C1F> list) {
        super(list);
    }

    public static com.facebook.ads.redexgen.core.C0688Fl A02(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        com.facebook.ads.redexgen.core.C0688Fl c0688Fl = new com.facebook.ads.redexgen.core.C0688Fl(com.facebook.ads.redexgen.core.AbstractC1341cD.A08(jSONObject, c1199Zs, new com.facebook.ads.redexgen.core.C1337c9()));
        c0688Fl.A1Y(jSONObject);
        c0688Fl.A0u(A03(0, 6, 107));
        return c0688Fl;
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
