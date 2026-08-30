package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class K5 {
    public static java.util.Map<java.lang.String, java.lang.Long> A00;
    public static java.util.Map<java.lang.String, java.lang.Long> A01;
    public static java.util.Map<java.lang.String, java.lang.String> A02;
    public static boolean A03;
    public static byte[] A04;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 88);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{96, 54, 127, 96, 54, 127, 96, 33, 127, 96, 33, 127, 96, 33, 80, 81, 83, 83, 3, 0, 85, 85, 11, 45, 55, 48, 57, 126, 50, okio.Utf8.REPLACEMENT_BYTE, 45, 42, 126, okio.Utf8.REPLACEMENT_BYTE, 58, 126, 44, 59, 45, 46, 49, 48, 45, 59, 65, 67, 82, 106, 71, 85, 82, 116, 67, 85, 86, 73, 72, 85, 67};
    }

    static {
        A04();
        A01 = new java.util.concurrent.ConcurrentHashMap();
        A00 = new java.util.concurrent.ConcurrentHashMap();
        A02 = new java.util.concurrent.ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(java.lang.String str, com.facebook.ads.redexgen.core.EnumC0783Jl enumC0783Jl) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        switch (enumC0783Jl) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            default:
                return -1000L;
        }
    }

    public static java.lang.String A02(com.facebook.ads.redexgen.core.K6 k6) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A01(44, 15, 126), A01(22, 22, 6), A01(14, 8, 61));
        return A02.get(A03(k6));
    }

    public static java.lang.String A03(com.facebook.ads.redexgen.core.K6 k6) {
        return java.lang.String.format(java.util.Locale.US, A01(0, 14, 29), k6.A09(), k6.A07(), java.lang.Integer.valueOf(k6.A08() == null ? 0 : k6.A08().A00()), java.lang.Integer.valueOf(k6.A08() == null ? 0 : k6.A08().A01()), java.lang.Integer.valueOf(k6.A04()));
    }

    public static void A05(long j, com.facebook.ads.redexgen.core.K6 k6) {
        A01.put(A03(k6), java.lang.Long.valueOf(j));
    }

    public static void A06(com.facebook.ads.redexgen.core.K6 k6) {
        A00.put(A03(k6), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static void A07(java.lang.String str, com.facebook.ads.redexgen.core.K6 k6) {
        A02.put(A03(k6), str);
    }

    public static boolean A08(com.facebook.ads.redexgen.core.K6 k6) {
        if (A03) {
            return false;
        }
        java.lang.String strA03 = A03(k6);
        if (A00.containsKey(strA03)) {
            return java.lang.System.currentTimeMillis() - A00.get(strA03).longValue() < A00(strA03, k6.A07());
        }
        return false;
    }
}
