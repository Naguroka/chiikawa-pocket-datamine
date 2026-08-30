package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05549r {
    public static java.lang.String A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"gkHagg9sB8IUWYb6q3ocrT0TxYi", "NE", "N4zCa1GX5E9Yds1VMUAQrLvLq", "D9fgVqZwbnP", "LHpQuNx1GJF6WPrWOoNErW9GY702stdw", "3mmz6UaJaVm", "sG6vVHTX86CLemYFR6gPDfec7Yfwaj3D", "wWX707RKIRhLC7xjkiZFtTlentMuS3W"};
    public static final java.util.HashSet<java.lang.String> A03;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 72);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {14, 6, 6, 14, 71, 12, 17, 6, 71, 10, 6, 27, 12};
        java.lang.String[] strArr = A02;
        if (strArr[3].length() != strArr[5].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[4] = "Xe2ipOaSu2pdxha9i6ixeBp4cevx6W9z";
        strArr2[6] = "Zf8B64fxNGGr2bfcs4J5hE6jajhXIkez";
        A01 = bArr;
    }

    static {
        A02();
        A03 = new java.util.HashSet<>();
        A00 = A01(0, 13, 33);
    }

    public static synchronized java.lang.String A00() {
        return A00;
    }
}
