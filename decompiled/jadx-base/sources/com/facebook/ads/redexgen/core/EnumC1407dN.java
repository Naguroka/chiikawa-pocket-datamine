package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/DeprecationLevel;", "", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum EnumC1407dN {
    A05,
    A03,
    A04;

    public static byte[] A00;
    public static final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC0729He A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 47);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{126, 105, 105, 116, 105, 78, 79, 66, 66, 67, 72, 100, 114, 97, 125, 122, 125, 116};
    }

    static {
        A01();
        A01 = com.facebook.ads.redexgen.core.AbstractC1400dB.A01(A02);
    }
}
