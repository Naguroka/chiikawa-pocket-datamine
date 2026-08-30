package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum S1 {
    A05(true, false),
    A06(true, true);

    public static byte[] A02;
    public static java.lang.String[] A03 = {"2ontwM2arFslKncjF33kbqsw34bOv6le", "G9q7n4RrTr1", "g4gCsJajd0OYdOA8Ye5rYJWq4JgSICF", "NFoKf805ct", "mafT0Rfur7fS0CNoj1tBpTWo2FQFb5xI", "EiMXCOKYsXD", "uVuWHRjrR7UDLAS", "0Dp8HE0WixXMfpgDKF4PEgrQKOmjSnl7"};
    public boolean A00;
    public boolean A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 120);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{39, 37, 52, 86, 73, 85, 82};
    }

    static {
        A01();
    }

    S1(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public final java.lang.String A03() {
        return toString();
    }

    public final boolean A04() {
        return this.A00;
    }

    public final boolean A05() {
        return this.A01;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static com.facebook.ads.redexgen.core.S1[] valuesCustom() {
        com.facebook.ads.redexgen.core.S1[] s1ArrValuesCustom = values();
        if (A03[7].charAt(2) != 'p') {
            throw new java.lang.RuntimeException();
        }
        A03[7] = "eYpi2UA0ZlC7PiDY55aF0B4EyL2494ge";
        return (com.facebook.ads.redexgen.core.S1[]) s1ArrValuesCustom.clone();
    }
}
