package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1174Yt implements com.facebook.ads.redexgen.core.C6 {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"VPsJYR6nwnKl3GGsBKT9FowhdWGAXZgf", "t9hnQybDG6g7LPOKqAGiDP2", "Gb301YYJpOgpSDcybjg8W8RhsXLlFC2", "K51ciyg1bfmePwJiFReGXIVxb", "s2EXwZrfzgHoO4PfEfdPmYAG5v8xH9jH", "U3dudkeTlUyTG47", "CeJtzK2mqLvn7YYYi0VUzVQJpJ4l9CMm", "xs5QEvE"};
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[3].length() != 25) {
                throw new java.lang.RuntimeException();
            }
            A07[6] = "J2GrNKZ7b522JA972PPYRjQW9OTYafkr";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 101);
            i4++;
        }
    }

    public static void A02() {
        byte[] bArr = {-6, -98, -110, -42, -25, -28, -45, -26, -37, -31, -32, -27, -57, -27, -81, -80, -92, -13, -22, -22, -9, -23, -8, -9, -63, -31, -43, 40, 30, 47, 26, 40, -14, -77, -89, -5, -16, -12, -20, -36, -6, -60, -19, 18, 31, 24, 21, -13, 24, 14, 15, 34, -46, 22, 15, 24, 17, 30, 18, -25};
        if (A07[6].charAt(22) != 'Q') {
            throw new java.lang.RuntimeException();
        }
        A07[0] = "mCtn7rBTOervmGdInElAArjuggAxpBXf";
        A06 = bArr;
    }

    static {
        A02();
    }

    public C1174Yt(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        if (this.A00 > 0) {
            this.A05 = jArr2[this.A00 - 1] + jArr3[this.A00 - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j) {
        return com.facebook.ads.redexgen.core.IK.A0B(this.A04, j, true, true);
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final long A7F() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final com.facebook.ads.redexgen.core.C5 A8H(long j) {
        int iA00 = A00(j);
        com.facebook.ads.redexgen.core.C7 c7 = new com.facebook.ads.redexgen.core.C7(this.A04[iA00], this.A03[iA00]);
        if (c7.A01 < j) {
            int i = this.A00;
            java.lang.String[] strArr = A07;
            java.lang.String str = strArr[2];
            java.lang.String str2 = strArr[1];
            int length = str.length();
            int chunkIndex = str2.length();
            if (length == chunkIndex) {
                throw new java.lang.RuntimeException();
            }
            A07[6] = "5dqNVttcMNtWdKoHzKCRCPQ2iaXgPTKU";
            int chunkIndex2 = i - 1;
            if (iA00 != chunkIndex2) {
                int chunkIndex3 = iA00 + 1;
                long j2 = this.A04[chunkIndex3];
                int chunkIndex4 = iA00 + 1;
                com.facebook.ads.redexgen.core.C7 seekPoint = new com.facebook.ads.redexgen.core.C7(j2, this.A03[chunkIndex4]);
                return new com.facebook.ads.redexgen.core.C5(c7, seekPoint);
            }
        }
        return new com.facebook.ads.redexgen.core.C5(c7);
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final boolean A9h() {
        return true;
    }

    public final java.lang.String toString() {
        return A01(42, 18, 69) + this.A00 + A01(25, 8, 80) + java.util.Arrays.toString(this.A01) + A01(15, 10, 31) + java.util.Arrays.toString(this.A03) + A01(33, 9, 34) + java.util.Arrays.toString(this.A04) + A01(1, 14, 13) + java.util.Arrays.toString(this.A02) + A01(0, 1, 108);
    }
}
