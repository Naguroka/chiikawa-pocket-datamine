package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ML {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"cuUzkH3QdbH3cJp2RF", "kphHRdIOrc0r15jsPfyG2Jy", "YnKzEWoXtdzuP95TROGjIP", "O6qhnuon9ci7avdCdn", "JszjlqJauoZ2AkEe", "2iwMqZkAQKEhQz1BEXGjAw", "tv2fwm9vcfvUl0RC5d9GYW3eB7CSJdU", "VWHYkG5jfvcYH9oXKfgyVS7MLxk2p9iO"};
    public static final java.lang.String A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[3] = "jOZxNa7dXP1jVDPJoO";
            strArr2[0] = "z9aGKGtKVlVAFuhw7X";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 48);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{79, 119, 122, 71, 92, 90, 79, 75, 86, 80, 81, 31, 86, 81, 31, 72, 86, 81, 91, 80, 72, 31, 86, 81, 89, 80, 31, 92, 87, 90, 92, 84, 98, 108, 112, 110, 124, 104, 123, 109, 91, 87, 66, 15, 20, 14, 22, 4, 96, 113, 115, 124, 112, 117, 100, 113, 117, 110, 96, 99};
    }

    static {
        A02();
        A02 = com.facebook.ads.redexgen.core.ML.class.getSimpleName();
    }

    public static java.util.Map<java.lang.String, java.lang.String> A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        android.view.Window window;
        java.util.HashMap map = new java.util.HashMap();
        if (c1199Zs == null) {
            return map;
        }
        try {
            map.put(A00(40, 3, 0), java.lang.String.valueOf(A04(c1199Zs)));
            android.app.Activity activityA0D = c1199Zs.A0D();
            if (activityA0D != null && (window = activityA0D.getWindow()) != null) {
                int i = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                map.put(A00(58, 2, 39), java.lang.Integer.toString(flags));
                int type = 4194304 & i;
                java.lang.String strA00 = A00(1, 1, 118);
                java.lang.String flagDismissKeyguardEnabled = A00(0, 1, 79);
                map.put(A00(48, 5, 39), type > 0 ? strA00 : flagDismissKeyguardEnabled);
                int type2 = 524288 & i;
                if (A01[6].length() == 6) {
                    throw new java.lang.RuntimeException();
                }
                A01[7] = "5jjmsuOSeLdxH4ITovSaNkR7tPO8fpvx";
                if (type2 <= 0) {
                    strA00 = flagDismissKeyguardEnabled;
                }
                map.put(A00(53, 5, 50), strA00);
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e(A02, A00(2, 30, 15), e);
            com.facebook.ads.redexgen.core.C8D c8dA07 = c1199Zs.A07();
            int type3 = com.facebook.ads.redexgen.core.C8E.A2T;
            c8dA07.AA0(A00(43, 5, 77), type3, new com.facebook.ads.redexgen.core.C8F(e));
        }
        return map;
    }

    public static boolean A03(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        return !com.facebook.ads.redexgen.core.M4.A04(A01(c1199Zs));
    }

    public static boolean A04(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) c1199Zs.getSystemService(A00(32, 8, 57));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
