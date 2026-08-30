package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0578Aq extends java.lang.Exception {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"9f4E74cmBUvlZ9r8GKUPRXI", "k", "FcQ9tYQNKKiD", "j0qb62VKLMRQ8PRw4qiKaZlPPtSv7x0h", "1av", "k3yiwvHxpK5tFRY8KUaXiWkeksXbodjI", "72fVAuzjtBWgXhw67DzT", "sOW"};
    public final int A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 126);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[5].charAt(23) != 'e') {
            throw new java.lang.RuntimeException();
        }
        A02[3] = "Alxm9pRAksCVWi4qdGhYTOlqnuoHaQY3";
        A01 = new byte[]{12, -19, -31, -63, -75, -40, 4, 3, -5, -2, -4, -67, -46, 6, -11, -6, 0, -27, 3, -14, -12, -4, -79, -6, -1, -6, 5, -79, -9, -14, -6, -3, -10, -11, -53, -79};
    }

    static {
        A01();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0578Aq(int i, int i2, int i3, int i4) {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A00(12, 24, 19)).append(i).append(A00(3, 9, 23)).append(i2);
        java.lang.String strA00 = A00(1, 2, 67);
        super(sbAppend.append(strA00).append(i3).append(strA00).append(i4).append(A00(0, 1, 101)).toString());
        this.A00 = i;
    }
}
