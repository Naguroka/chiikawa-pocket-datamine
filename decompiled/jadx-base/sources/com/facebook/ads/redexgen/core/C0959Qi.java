package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0959Qi {
    public static byte[] A07;
    public final com.facebook.ads.redexgen.core.T7 A02;
    public final com.facebook.ads.redexgen.core.T4 A04;
    public final java.lang.String A05;
    public final java.util.Map<java.lang.String, java.lang.String> A06;
    public final com.facebook.ads.redexgen.core.AbstractC1009Sg A03 = new com.facebook.ads.redexgen.core.AbstractC1009Sg() { // from class: com.facebook.ads.redexgen.X.9X
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC05348x
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C9Q c9q) {
            com.facebook.ads.redexgen.core.T5 t5 = new com.facebook.ads.redexgen.core.T5(this.A00.A05, c9q.A03(), c9q.A01(), c9q.A02());
            if (c9q.A00() >= 0.05d) {
                t5.A06(c9q.A01());
            }
            com.facebook.ads.redexgen.core.C0959Qi.A00(this.A00);
            this.A00.A04.A0C(t5);
        }
    };
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 31);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, 15, -2, 10, 2, -4, 0, 12, 18, 11, 17, -90, -78, -95, -83, -91, -77};
    }

    public C0959Qi(com.facebook.ads.redexgen.core.T7 t7, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> extraParams) {
        this.A05 = str;
        this.A02 = t7;
        this.A06 = extraParams;
        this.A04 = new com.facebook.ads.redexgen.core.T4(this.A05);
        this.A02.getEventBus().A05(this.A03);
    }

    public static /* synthetic */ int A00(com.facebook.ads.redexgen.core.C0959Qi c0959Qi) {
        int i = c0959Qi.A01;
        c0959Qi.A01 = i + 1;
        return i;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A05() {
        java.lang.String strA04 = com.facebook.ads.redexgen.core.T4.A04(this.A04.A0B());
        java.util.HashMap map = new java.util.HashMap();
        if (this.A06 != null) {
            map.putAll(this.A06);
        }
        if (strA04 == null) {
            strA04 = A02(0, 0, 25);
        }
        map.put(A02(22, 6, 33), strA04);
        map.put(A02(11, 11, 126), java.lang.String.valueOf(this.A01));
        int i = this.A00 + 1;
        this.A00 = i;
        map.put(A02(0, 11, 8), java.lang.String.valueOf(i));
        return map;
    }

    public final void A06() {
        this.A02.getEventBus().A06(this.A03);
    }
}
