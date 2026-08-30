package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum SI {
    A03,
    A04;

    public static byte[] A00;
    public static java.lang.String[] A01 = {"xrpFqliwvTmrUeY9fA", "WQofXYOtPOfcZVcnLB6jDFevspEJYzJo", "xmcQ51qE3IL5CD3g", "vqfe6L9tI0UCZhHJZZILisyG0KCy4R", "fiUEN16u3MZCpDGCMqSf2x4N5Q5QlPxX", "5xn2ImkHS4ATQgLTDfLLcMPpUWGwzNh4", "NsPZM3725QIioQriGr2vh8z8GZ7DcYd3", "wIDfTgN4CVihAS6ZHyHagF8TJWsTJSVw"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[1].length() == 22) {
                throw new java.lang.RuntimeException();
            }
            A01[1] = "aO5t2";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
            java.lang.String[] strArr = A01;
            if (strArr[0].length() != strArr[2].length()) {
                A01[3] = "tB3IEJBlHxhWtpYKuvAk87dclmwGEs";
                i4++;
            } else {
                i4++;
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{58, 53, 48, 60, 55, 45, 38, 54, 46, 55, 60, kotlin.io.encoding.Base64.padSymbol, 85, 67, 84, 80, 67, 84, 89, 73, 81, 72, 67, 66};
    }

    static {
        A01();
    }
}
