package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QK {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final com.facebook.ads.redexgen.core.C1F A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{89, 91, 72, 94, 89, 84, 78, 7, 5, 22, 0, 13, 10, 0};
    }

    public QK(int i, int i2, com.facebook.ads.redexgen.core.C1F c1f) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c1f;
    }

    public final int A02() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.C1F A03() {
        return this.A02;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A04() {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(this.A01);
        java.lang.String strA00 = A00(0, 0, 41);
        map.put(A00(7, 7, 20), sbAppend.append(strA00).toString());
        map.put(A00(0, 7, 74), this.A00 + strA00);
        return map;
    }
}
