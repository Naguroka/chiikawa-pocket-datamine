package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class MM {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"fNLd7n7EkFNgLvt4vtbAtkfYXAQTEPRW", "T28d5tP6PdXMoXHWEuFSx", "qUncBokoif621v1GQ7gcKknRgizXPQsv", "IkdBxGtQCWxg3d0UA", "tTLCQWoYBdse5ixamGS9HTw2k7WXO8kY", "MyXxcbJBNTQUhn8S7mcX9rM3djOk", "ymwmgwOSW636xClV84tW2WEHiZAMdx7v", "xCAHRx5Y4"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            java.lang.String[] strArr = A01;
            if (strArr[7].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[0] = "dZQs1GEaNPWr5rijC2ubsciPbAft3PPF";
            bArrCopyOfRange[i4] = (byte) ((b - i3) - 117);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{15, 13, 22, 13, 26, 17, 11};
    }

    static {
        A01();
    }

    public static void A02(android.app.Activity activity, int i, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        try {
            activity.setRequestedOrientation(i);
        } catch (java.lang.IllegalStateException e) {
            c1199Zs.A07().AAS(A00(0, 7, 51), com.facebook.ads.redexgen.core.C8E.A0H, new com.facebook.ads.redexgen.core.C8F(e));
        }
    }
}
