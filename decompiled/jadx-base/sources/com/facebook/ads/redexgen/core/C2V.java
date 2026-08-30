package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2V {
    public static byte[] A03;
    public com.facebook.ads.redexgen.core.JF A00;
    public final java.util.List<java.lang.String> A02 = new java.util.ArrayList();
    public final java.util.List<java.lang.String> A01 = new java.util.ArrayList();

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 90);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-53, -45, -39, -30, -40, 27, 15, 28, 15, 21, 19, 13, 15, 18, 13, 30, 32, 19, 20, 19, 32, 19, 28, 17, 19, 33, -7, -6, -2, -13, -7, -8, -3, -23, -3, -17, -10, -17, -19, -2, -17, -18, 66, 67, 48, 65, 67, 0, -2, -16, -3, -22, -11, -6, 0, -3, -7, -16, 4, -36, -51, -34, -60, -58, -46, -60, -50, -60, -40, -54, -54, -50, -45, -52, -60, -39, -51, -50, -40};
    }

    public C2V() {
    }

    public C2V(com.facebook.ads.redexgen.core.JF jf) {
        this.A00 = jf;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A02() {
        java.util.HashMap map = new java.util.HashMap();
        map.put(A00(47, 12, 49), new org.json.JSONArray((java.util.Collection) this.A02).toString());
        map.put(A00(26, 16, 48), new org.json.JSONArray((java.util.Collection) this.A01).toString());
        return map;
    }

    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A04() {
        this.A02.add(A00(5, 21, 84));
        if (this.A00 != null) {
            this.A00.A04(com.facebook.ads.redexgen.core.JE.A0B, null);
        }
    }

    public final void A05() {
        this.A02.add(A00(42, 5, 117));
    }

    public final void A06() {
        this.A02.add(A00(59, 20, 11));
        if (this.A00 != null) {
            this.A00.A04(com.facebook.ads.redexgen.core.JE.A0C, null);
        }
    }

    public final void A07(int i) {
        this.A01.add(java.lang.String.valueOf(i));
    }

    public final void A08(com.facebook.ads.redexgen.core.C2U c2u) {
        this.A02.add(c2u.A03() + A00(1, 4, 26));
        if (this.A00 != null) {
            this.A00.A04(com.facebook.ads.redexgen.core.JE.A09, null);
        }
    }

    public final void A09(com.facebook.ads.redexgen.core.C2U c2u, int i) {
        this.A02.add(c2u.A03() + A00(0, 1, 18) + i);
    }

    public final boolean A0A() {
        return (this.A02.isEmpty() && this.A01.isEmpty()) ? false : true;
    }
}
