package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0618Cg {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"mMVqpqBVgrnijMcf07ELsDNcJ24OL2nP", "IP6eS0SEp8gBdkX6C7fdNeLrZWtZ", "Csb6WekrqE", "hqLJz7OFCqwyqI3Xl9C5Yk0lZKMX44EB", "EBI4zKNq1U8AXqXtP1Wxz6Xy4vBMW1iS", "UNFwS5L41LHHq5BQuxA2jKAhYKXr1bOi", "a4BPWy1hEZ", "KDcDYO4g5i7d4XPLwMmGmppr610vo4rD"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 89);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-17, 18, 18, 7, -32, 19, 14, 12, -12, 19, 8, 11, -47, -22, -17, -15, -20, -20, -21, -18, -16, -31, -32, -100, -20, -17, -17, -28, -100, -14, -31, -18, -17, -27, -21, -22, -74, -100};
    }

    static {
        A03();
    }

    public static com.facebook.ads.redexgen.core.C0617Cf A00(byte[] bArr) {
        com.facebook.ads.redexgen.core.I4 i4 = new com.facebook.ads.redexgen.core.I4(bArr);
        if (i4.A07() < 32) {
            return null;
        }
        i4.A0Y(0);
        int iA08 = i4.A08();
        int iA04 = i4.A04() + 4;
        if (A01[1].length() == 28) {
            java.lang.String[] strArr = A01;
            strArr[7] = "8tunoJcFY8sdNkzTV28xZ3mFQC5lH0FH";
            strArr[0] = "RL5PFckm7p773rKwLt1g33yNj7eK7Ab7";
            if (iA08 != iA04) {
                return null;
            }
            int iA09 = i4.A08();
            java.lang.String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[2].length()) {
                A01[4] = "I3b4ZRO4hoj0qqQ4bLGuwt50SIh123Br";
                if (iA09 != com.facebook.ads.redexgen.core.CO.A0r) {
                    return null;
                }
                int iA01 = com.facebook.ads.redexgen.core.CO.A01(i4.A08());
                if (iA01 > 1) {
                    android.util.Log.w(A01(0, 12, 70), A01(12, 26, 35) + iA01);
                    return null;
                }
                java.util.UUID uuid = new java.util.UUID(i4.A0L(), i4.A0L());
                if (iA01 == 1) {
                    int keyIdCount = i4.A0H();
                    if (A01[4].charAt(17) == 'N') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr3 = A01;
                    strArr3[6] = "srnpLtY0xe";
                    strArr3[2] = "yJ4YGMGdHJ";
                    i4.A0Z(keyIdCount * 16);
                }
                int atomSize = i4.A0H();
                if (atomSize != i4.A04()) {
                    return null;
                }
                byte[] bArr2 = new byte[atomSize];
                i4.A0c(bArr2, 0, atomSize);
                return new com.facebook.ads.redexgen.core.C0617Cf(uuid, iA01, bArr2);
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static java.util.UUID A02(byte[] bArr) {
        com.facebook.ads.redexgen.core.C0617Cf parsedAtom = A00(bArr);
        if (parsedAtom != null) {
            return parsedAtom.A01;
        }
        return null;
    }
}
