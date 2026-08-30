package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MK {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"CRKlMdJj7sWkVQXvhxP2gtYMKrwrdBdz", "MDVslC7yGiRJk7iB8DE8e8h4fEVrC5ER", "lH08WA", "RxIchMFZh", "vNyd6Jid8bvsA1cw15Ve5Ic9LBA7HcUI", "txgfdNfKSs8Co5f2ObGoVq", "d8ndlqqx7tIKNJdyWXTDq8r8sQB5dgXc", "5RbatCjsfF363SonahZsted9lIdQCMHb"};
    public static final java.lang.String A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] - i3;
            java.lang.String[] strArr = A01;
            if (strArr[4].charAt(3) != strArr[6].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            A01[2] = "R3kMyn";
            bArrCopyOfRange[i4] = (byte) (i5 - 20);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{109, -96, -117, -115, -104, -100, -111, -105, -106, 72, -111, -106, 72, -101, -117, -102, -115, -115, -106, 72, -111, -106, -100, -115, -102, -119, -117, -100, -111, -98, -115, 72, -117, -112, -115, -117, -109, 84, 72, -119, -101, -101, -99, -107, -111, -106, -113, 72, -111, -106, -100, -115, -102, -119, -117, -100, -111, -98, -115, 86, -33, -34, -26, -44, -31, -69, -78, -68, -76, -62};
    }

    static {
        A01();
        A02 = com.facebook.ads.redexgen.core.MK.class.getSimpleName();
    }

    public static boolean A02(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        return A03(c1199Zs) && com.facebook.ads.redexgen.core.ML.A03(c1199Zs);
    }

    public static boolean A03(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        if (c1199Zs == null) {
            return true;
        }
        try {
            android.os.PowerManager powerManager = (android.os.PowerManager) c1199Zs.getSystemService(A00(60, 5, 91));
            if (android.os.Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
            return powerManager.isScreenOn();
        } catch (java.lang.Exception e) {
            android.util.Log.e(A02, A00(0, 60, 20), e);
            c1199Zs.A07().AA0(A00(65, 5, 53), com.facebook.ads.redexgen.core.C8E.A2S, new com.facebook.ads.redexgen.core.C8F(e));
            return true;
        }
    }
}
