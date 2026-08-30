package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C2T {
    public static com.facebook.ads.redexgen.core.C2S A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"g", "j", "XC0Rp", "xmnbF", "ZVN1dtOIFAKzm8JTATZerxuQP9zv55g", "kSPLn3WG70", "", ""};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            java.lang.String[] strArr = A02;
            if (strArr[6].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[1] = "w";
            strArr2[0] = "P";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 92);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, 90, 88, 27, 83, 84, 86, 80, 87, 90, 90, 94, 27, 84, 81, 70, 27, 116, 113, 106, 103, 112, 101, 122, 103, 97, 124, 123, 114, 106, 118, 122, 123, 115, 124, 114};
    }

    static {
        A02();
    }

    public static com.facebook.ads.redexgen.core.C2S A00(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (A00 == null) {
            synchronized (com.facebook.ads.redexgen.core.C2S.class) {
                if (A00 == null) {
                    A00 = new com.facebook.ads.redexgen.core.C2S(new com.facebook.ads.redexgen.core.C1283bH(c1198Zr.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A01(0, 36, 105), c1198Zr), 0)));
                }
            }
        }
        return A00;
    }
}
