package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04796i {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final java.lang.String A09;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, -40, -35, -38, -107, -39, -34, -24, -32, -107, -24, -22, -40, -40, -38, -24, -24, -93, -7, 23, 25, 30, 27, -42, 26, 37, 45, 36, 34, 37, 23, 26, -42, 28, 23, 31, 34, 43, 40, 27, -28, -80, -50, -48, -43, -46, -115, -43, -42, -31, -101, -63, -33, -31, -26, -29, -98, -21, -25, -15, -15, -84, 19, 22, 17, 21, 36, 23, 19, 38, 27, 40, 23, 17, 37, 27, 44, 23, 17, 20, 43, 38, 23, 37, -33, -30, -35, -31, -16, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, 29, 32, 27, 34, 43, 46, 41, 29, 48, 27, 48, 53, 44, 33, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, 67, 86, 86, 71, 79, 82, 86, 30, 28, 30, 35, 32, okio.Utf8.REPLACEMENT_BYTE, kotlin.io.encoding.Base64.padSymbol, okio.Utf8.REPLACEMENT_BYTE, 68, 65, 59, okio.Utf8.REPLACEMENT_BYTE, 75, 74, 80, 65, 84, 80, -35, -40, -32, -29, -20, -23, -36, -42, -23, -36, -40, -22, -26, -27, 23, 27, 15, 21, 19, 28, 31, 17, 20, 15, 36, 25, 29, 21, 70, 67, kotlin.io.encoding.Base64.padSymbol};
    }

    static {
        A01();
        A09 = com.facebook.ads.redexgen.core.C04796i.class.getSimpleName();
        A05 = com.facebook.ads.redexgen.core.C8E.A0o;
        A06 = com.facebook.ads.redexgen.core.C8E.A0s;
        A02 = com.facebook.ads.redexgen.core.C8E.A0l;
        A01 = com.facebook.ads.redexgen.core.C8E.A0k;
        A03 = com.facebook.ads.redexgen.core.C8E.A0m;
        A00 = com.facebook.ads.redexgen.core.C8E.A0i;
        A04 = com.facebook.ads.redexgen.core.C8E.A0n;
        A07 = com.facebook.ads.redexgen.core.C8E.A0t;
    }

    public static void A02(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.C6Y c6y, int i, java.lang.String str, long j) {
        if (!A06(c7j)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(A00(120, 14, 85), c6y.A01);
            jSONObject.put(A00(134, 13, 46), c6y.A02);
            if (j > 0) {
                jSONObject.put(A00(org.objectweb.asm.Opcodes.ATHROW, 9, 73), com.facebook.ads.redexgen.core.C0841Lu.A06(java.lang.System.currentTimeMillis() - j));
            }
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(str);
            c8f.A07(jSONObject);
            c8f.A05(1);
            c7j.A07().AA1(A00(154, 5, 84), i, c8f);
        } catch (java.lang.Throwable deLogException) {
            c7j.A07().A3y(deLogException);
        }
    }

    public static void A03(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.C04746d c04746d, java.lang.String str, int i, java.lang.String str2, java.lang.Long l, java.lang.Long l2) {
        if (A06(c7j)) {
            A05(c7j, c04746d.A05, c04746d.A06, c04746d.A07, A00(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 5, 71), str, i, str2, l, l2, null);
        }
    }

    public static void A04(com.facebook.ads.redexgen.core.C7j c7j, com.facebook.ads.redexgen.core.C04786h c04786h, boolean z) {
        if (!A06(c7j)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(A00(120, 14, 85), c04786h.A01);
            jSONObject.put(A00(134, 13, 46), c04786h.A03);
            jSONObject.put(A00(104, 16, 23), c04786h.A02);
            jSONObject.put(A00(org.objectweb.asm.Opcodes.IF_ICMPEQ, 13, 117), c04786h.A00);
            if (com.facebook.ads.redexgen.core.C0762Im.A2I(c7j)) {
                jSONObject.put(A00(200, 3, 106), c04786h.A04);
            }
            java.lang.String strA00 = z ? A00(61, 10, 6) : A00(71, 11, 23);
            int i = z ? A05 : A06;
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(strA00);
            c8f.A07(jSONObject);
            c8f.A05(1);
            c7j.A07().AA1(A00(154, 5, 84), i, c8f);
        } catch (java.lang.Throwable th) {
            c7j.A07().A3y(th);
        }
    }

    public static void A05(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.String str6, java.lang.Long l, java.lang.Long l2, java.lang.Integer num) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(134, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 16), str6);
            }
            if (l != null) {
                jSONObject.put(A00(82, 22, 75), java.lang.String.valueOf(l));
            }
            if (l2 != null) {
                jSONObject.put(A00(org.objectweb.asm.Opcodes.ATHROW, 9, 73), java.lang.String.valueOf(l2));
            }
            if (num != null) {
                jSONObject.put(A00(org.objectweb.asm.Opcodes.I2S, 7, 123), java.lang.String.valueOf(num));
            }
            jSONObject.put(A00(org.objectweb.asm.Opcodes.IF_ICMPEQ, 13, 117), str5);
            if (com.facebook.ads.redexgen.core.C0762Im.A2I(c7j)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            java.lang.String strA00 = A00(19, 19, 14);
            if (i == A03) {
                strA00 = A00(38, 23, 79);
            } else if (i == A01) {
                strA00 = A00(0, 19, 39);
            }
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(strA00);
            c8f.A07(jSONObject);
            c8f.A05(1);
            c7j.A07().AA1(A00(154, 5, 84), i, c8f);
        } catch (java.lang.Throwable th) {
            c7j.A07().A3y(th);
        }
    }

    public static boolean A06(com.facebook.ads.redexgen.core.C7j c7j) {
        int iA06;
        if (c7j.A04().A9O()) {
            iA06 = 1;
        } else {
            iA06 = com.facebook.ads.redexgen.core.Io.A06(c7j);
        }
        if (iA06 == 0) {
            return false;
        }
        return iA06 <= 0 || c7j.A08().A00() <= 1.0d / ((double) iA06);
    }
}
