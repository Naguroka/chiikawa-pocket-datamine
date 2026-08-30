package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1141Xm implements com.facebook.ads.redexgen.core.InterfaceC0640Dd {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"wk8oh2v4CuoEz91Q8ddyD4vW4OkPIqhz", "TrnvrzX", "avvRCVNMMCxdLH2GcUGi3f", "9N2kSsE3lVRujQ8aZphxKZ15", "6oAq20NcGdPAdIGxLKdGW0uH0QkLBftR", "pUHCrP55Ymm0t5Q", "CGpYVsyVcgyLsLvhkYxzWTdg", "6TV83KfgcjdGc5chuG3yAE2DLzpv0l0a"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 85);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{60, 9, 9, 24, 16, 13, 9, 24, 25, 93, 9, 18, 93, 30, 15, 24, 28, 9, 24, 93, 25, 24, 30, 18, 25, 24, 15, 93, 27, 18, 15, 93, 8, 19, 14, 8, 13, 13, 18, 15, 9, 24, 25, 93, 27, 18, 15, 16, 28, 9, 24, 9, 9, 21, 16, 26, 24, 13, 16, 22, 23, 86, 16, 29, 74, 20, 5, 5, 25, 28, 22, 20, 1, 28, 26, 27, 90, 13, 88, 16, 24, 6, 18, 14, 31, 31, 3, 6, 12, 14, 27, 6, 0, 1, 64, 23, 66, 28, 12, 27, 10, 92, 90};
    }

    static {
        A01();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0640Dd
    public final com.facebook.ads.redexgen.core.InterfaceC0638Db A4u(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        byte b;
        java.lang.String str = format.A0O;
        switch (str.hashCode()) {
            case -1248341703:
                if (str.equals(A00(50, 15, 44))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return new com.facebook.ads.redexgen.core.C1138Xi();
                    case 1:
                        return new com.facebook.ads.redexgen.core.C1140Xk();
                    case 2:
                        return new com.facebook.ads.redexgen.core.C1137Xf();
                    default:
                        throw new java.lang.IllegalArgumentException(A00(0, 50, 40));
                }
            case 1154383568:
                java.lang.String[] strArr = A01;
                if (strArr[3].length() != strArr[6].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A01;
                strArr2[3] = "8oGlDfhTgiX4kZXrmDxnswR6";
                strArr2[6] = "sPUpEdfrXW7HqAznk87fzPk6";
                if (str.equals(A00(65, 18, 32))) {
                    b = 1;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return new com.facebook.ads.redexgen.core.C1138Xi();
                    case 1:
                        return new com.facebook.ads.redexgen.core.C1140Xk();
                    case 2:
                        return new com.facebook.ads.redexgen.core.C1137Xf();
                    default:
                        throw new java.lang.IllegalArgumentException(A00(0, 50, 40));
                }
            case 1652648887:
                if (str.equals(A00(83, 20, 58))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                        return new com.facebook.ads.redexgen.core.C1138Xi();
                    case 1:
                        return new com.facebook.ads.redexgen.core.C1140Xk();
                    case 2:
                        return new com.facebook.ads.redexgen.core.C1137Xf();
                    default:
                        throw new java.lang.IllegalArgumentException(A00(0, 50, 40));
                }
            default:
                b = -1;
                switch (b) {
                    case 0:
                        return new com.facebook.ads.redexgen.core.C1138Xi();
                    case 1:
                        return new com.facebook.ads.redexgen.core.C1140Xk();
                    case 2:
                        return new com.facebook.ads.redexgen.core.C1137Xf();
                    default:
                        throw new java.lang.IllegalArgumentException(A00(0, 50, 40));
                }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0640Dd
    public final boolean AH7(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        java.lang.String str = format.A0O;
        java.lang.String mimeType = A00(50, 15, 44);
        if (!mimeType.equals(str)) {
            java.lang.String mimeType2 = A00(65, 18, 32);
            if (!mimeType2.equals(str)) {
                java.lang.String mimeType3 = A00(83, 20, 58);
                boolean zEquals = mimeType3.equals(str);
                java.lang.String mimeType4 = A01[5];
                if (mimeType4.length() == 16) {
                    throw new java.lang.RuntimeException();
                }
                A01[5] = "g8nn2mhnPz";
                if (!zEquals) {
                    return false;
                }
            }
        }
        return true;
    }
}
