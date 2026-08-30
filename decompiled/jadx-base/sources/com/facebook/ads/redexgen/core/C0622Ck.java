package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0622Ck {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"mFOOXeT", "LexbahN", "kVTxxC3LTF0fLMRDW8jGaPZPlig8JQO1", "0AoiW04D4LYaxFko3LbiIyYKfV5E85gy", "aSBFun93hJrKs5fmh7DDxXeNBftzg4Tu", "XwteBG2Aw0OJWJhPb8yklLP0HTcb60fQ", "dNH0H93SgKuqiJfOfkHJjHC2B9TjjrRJ", "a4Tt0YroJWfViDs7yV1XUKalqcZLTf7A"};
    public final int A00;
    public final com.facebook.ads.redexgen.core.C8 A01;
    public final java.lang.String A02;
    public final boolean A03;
    public final byte[] A04;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] - i3;
            java.lang.String[] strArr = A06;
            if (strArr[7].charAt(14) == strArr[2].charAt(14)) {
                throw new java.lang.RuntimeException();
            }
            A06[5] = "YmrJEBKdiRZ1L6ltRDAiNut0MqgfCokc";
            bArrCopyOfRange[i4] = (byte) (i5 - 119);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-7, 0, -14, 19, 69, 69, 71, okio.Utf8.REPLACEMENT_BYTE, 59, 64, 57, -14, 19, 23, 37, -1, 21, 38, 36, -14, 53, 68, 75, 66, 70, 65, -14, okio.Utf8.REPLACEMENT_BYTE, 65, 54, 55, 0, -18, 12, -5, -3, 5, -33, 8, -3, 12, 19, 10, 14, 3, 9, 8, -36, 9, 18, 22, 47, 52, 54, 49, 49, 48, 51, 53, 38, 37, -31, 49, 51, 48, 53, 38, 36, 53, 42, 48, 47, -31, 52, 36, 41, 38, 46, 38, -31, 53, 58, 49, 38, -31, -24, 33, 32, 33, -17, 11, 10, 11, 27, -31, -29, -20, -31, 24, 26, 35, 40};
    }

    static {
        A02();
    }

    public C0622Ck(boolean z, java.lang.String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03((bArr2 == null) ^ (i == 0));
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
        this.A04 = bArr2;
        this.A01 = new com.facebook.ads.redexgen.core.C8(A00(str), bArr, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static int A00(java.lang.String str) {
        byte b;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 3046605:
                if (!str.equals(A01(86, 4, 71))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 3046671:
                if (!str.equals(A01(90, 4, 49))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3049879:
                if (!str.equals(A01(94, 4, 7))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 3049895:
                if (!str.equals(A01(98, 4, 62))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            default:
                android.util.Log.w(A01(32, 18, 35), A01(50, 36, 74) + str + A01(0, 32, 91));
                return 1;
        }
    }
}
