package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03842p {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"OxqqmxACKcMb9rgd4flgeoqO4FLkDXK8", "hO921EE08Z5YovLaOXzv", "4KPhJxryuqZouci8ltOnoaa6GepMOFR6", "Qaf3Cf9SMgDDqCFg3avrhgzCiMtnLJnE", "vZFktEahG3bWOXRkYAMaCi8nGdaO1v3Q", "tZHqmUfqpLYo8cwpqndw", "zlaA7TXYCJ", "adeIrckSIlUrZ7yW4ZooAIUWBthMSkAF"};
    public static final java.lang.ThreadLocal<double[]> A02;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 56);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{26, 23, 11, 19, 26, 91, 22, 14, 8, 15, 91, 25, 30, 91, 25, 30, 15, 12, 30, 30, 21, 91, 75, 91, 26, 21, 31, 91, 73, 78, 78, 85, 54, 44, 45, 1, 32, 35, 121, 52, 44, 42, 45, 121, 49, 56, 47, 60, 121, 56, 121, 53, 60, 55, 62, 45, 49, 121, 54, okio.Utf8.REPLACEMENT_BYTE, 121, 106, 119};
    }

    static {
        A04();
        A02 = new java.lang.ThreadLocal<>();
    }

    public static double A00(int i) {
        double[] dArrA07 = A07();
        A06(i, dArrA07);
        return dArrA07[1] / 100.0d;
    }

    public static int A01(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new java.lang.IllegalArgumentException(A03(0, 32, 67));
        }
        java.lang.String[] strArr = A01;
        if (strArr[5].length() != strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        A01[0] = "DAqAm14HDJv7tSHiVIRuluRO44d0lStM";
        return (16777215 & i) | (i2 << 24);
    }

    public static int A02(int i, int i2, float f) {
        float f2 = 1.0f - f;
        float fAlpha = android.graphics.Color.alpha(i) * f2;
        float inverseRatio = android.graphics.Color.alpha(i2);
        float g = fAlpha + (inverseRatio * f);
        float fRed = android.graphics.Color.red(i) * f2;
        float inverseRatio2 = android.graphics.Color.red(i2);
        float r = fRed + (inverseRatio2 * f);
        float a2 = android.graphics.Color.green(i);
        float inverseRatio3 = android.graphics.Color.green(i2);
        float a3 = (a2 * f2) + (inverseRatio3 * f);
        float fBlue = android.graphics.Color.blue(i) * f2;
        float inverseRatio4 = android.graphics.Color.blue(i2);
        float b = fBlue + (inverseRatio4 * f);
        return android.graphics.Color.argb((int) g, (int) r, (int) a3, (int) b);
    }

    public static void A05(int i, int i2, int i3, double[] dArr) {
        double sb;
        double sr;
        double sb2;
        if (dArr.length == 3) {
            double sb3 = ((double) i) / 255.0d;
            if (sb3 < 0.04045d) {
                sb = sb3 / 12.92d;
            } else {
                sb = java.lang.Math.pow((sb3 + 0.055d) / 1.055d, 2.4d);
            }
            double sr2 = ((double) i2) / 255.0d;
            if (sr2 < 0.04045d) {
                sr = sr2 / 12.92d;
            } else {
                double sr3 = sr2 + 0.055d;
                if (A01[2].charAt(0) != 'Y') {
                    java.lang.String[] strArr = A01;
                    strArr[3] = "aAOO9yx7jRsDtZ33Oh1YUTlwgCOJU7qQ";
                    strArr[4] = "tiIjGPCneBcQleUKUeg5FNX5aBHKyIuK";
                    sr = java.lang.Math.pow(sr3 / 1.055d, 2.4d);
                }
                throw new java.lang.RuntimeException();
            }
            double sb4 = ((double) i3) / 255.0d;
            if (sb4 >= 0.04045d) {
                java.lang.String[] strArr2 = A01;
                if (strArr2[5].length() == strArr2[1].length()) {
                    java.lang.String[] strArr3 = A01;
                    strArr3[5] = "axgx58ekBr3JsKBSYEIr";
                    strArr3[1] = "AyWuGeE7FNinezs3svxh";
                    double sg = 0.055d + sb4;
                    sb2 = java.lang.Math.pow(sg / 1.055d, 2.4d);
                }
                throw new java.lang.RuntimeException();
            }
            sb2 = sb4 / 12.92d;
            double sg2 = 0.4124d * sb;
            dArr[0] = (sg2 + (0.3576d * sr) + (0.1805d * sb2)) * 100.0d;
            double sg3 = 0.2126d * sb;
            dArr[1] = (sg3 + (0.7152d * sr) + (0.0722d * sb2)) * 100.0d;
            double sg4 = 0.0193d * sb;
            dArr[2] = (sg4 + (0.1192d * sr) + (0.9505d * sb2)) * 100.0d;
            return;
        }
        throw new java.lang.IllegalArgumentException(A03(32, 31, 97));
    }

    public static void A06(int i, double[] dArr) {
        A05(android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i), dArr);
    }

    public static double[] A07() {
        double[] dArr = A02.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            A02.set(dArr2);
            return dArr2;
        }
        return dArr;
    }
}
