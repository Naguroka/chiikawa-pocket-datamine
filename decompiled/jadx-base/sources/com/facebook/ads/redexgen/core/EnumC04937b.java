package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC04937b {
    A08,
    A0B,
    A0G,
    A05,
    A0F,
    A0E,
    A0H,
    A04,
    A0C,
    A06,
    A09,
    A0I,
    A07,
    A0A,
    A0D,
    A03;

    public static byte[] A00;
    public static java.lang.String[] A01 = {"uLbNEHRnnMyyuUlqsIMZHpfsQBJ5TRv2", "skvypruDZiW8BASe24", "rs3R2llKFZwZPVZsKZyGkf2ci7C4s9Pb", "lOPEGaBOukTHor75ISwx4eUskGtuKXTT", "8Yax76Lu2a2dogjn3GzeM1tk0kWHR", "9LerROYgERLC3lU2pQvcy1JolU6pTYA4", "W5HoMz4UVZQaZ2UVOWaoIOdOjYdmd3KA", "VA"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            java.lang.String[] strArr = A01;
            if (strArr[1].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[3] = "z4qR7zhDF91Av9yLGwgiJSRF3kJh9stD";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 68);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{73, 68, 68, 72, 68, 69, 88, 95, 89, 94, 72, 95, 68, 89, 84, 89, 78, 88, 94, 71, 95, 77, 80, 75, 77, 88, 92, 65, 71, 70, 87, 88, 73, 90, 73, 69, 77, 92, 77, 90, 103, 122, 114, 110, 107, 97, 107, 118, 125, 110, 109, 117, 103, 112, 125, 96, 109, 119, 108, 102, 28, 1, 9, 21, 16, 26, 16, 13, 6, 12, 9, 9, 28, 11, 6, 27, 22, 12, 23, 29, 29, 18, 30, 23, 31, 25, 29, 0, 28, 25, 19, 25, 4, 15, 28, 31, 7, 21, 2, 15, 18, 31, 5, 30, 20, 5, 1, 28, 0, 5, 15, 5, 24, 19, 25, 28, 28, 9, 30, 19, 14, 3, 25, 2, 8, 91, 88, 84, 86, 91, 72, 65, 86, 69, 94, 86, 85, 91, 82, 112, 115, 107, 121, 110, 99, 126, 115, 105, 114, 120, 76, 87, 75, 70, 81, 84, 74, 80, 70, 119, 102, 117, 102, 106, 98, 115, 98, 117, 105, 126, 120, 126, 114, 109, 126, 105, 98, 117, 99, 127, 101, 98, 115, 117, 111, 102, 113, 98, 121, 113, 114, 124, 117, okio.Utf8.REPLACEMENT_BYTE, 40, 57, 56, okio.Utf8.REPLACEMENT_BYTE, 35, 40, 45, 45, 56, 47, 34, okio.Utf8.REPLACEMENT_BYTE, 50, 40, 51, 57};
    }

    static {
        A01();
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static com.facebook.ads.redexgen.core.EnumC04937b[] valuesCustom() {
        com.facebook.ads.redexgen.core.EnumC04937b[] enumC04937bArrValuesCustom = values();
        java.lang.String[] strArr = A01;
        if (strArr[2].charAt(20) == strArr[0].charAt(20)) {
            throw new java.lang.RuntimeException();
        }
        A01[7] = "2rcI6";
        return (com.facebook.ads.redexgen.core.EnumC04937b[]) enumC04937bArrValuesCustom.clone();
    }
}
