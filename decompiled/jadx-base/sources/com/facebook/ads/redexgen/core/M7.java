package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class M7 implements java.util.concurrent.ThreadFactory {
    public static byte[] A03;
    public final java.util.concurrent.atomic.AtomicInteger A00 = new java.util.concurrent.atomic.AtomicInteger(1);
    public final /* synthetic */ com.facebook.ads.redexgen.core.M8 A01;
    public final /* synthetic */ java.lang.String A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 7);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{121, 116, -127, 109, 88, -90, 83, 86, 88, -105};
    }

    public M7(com.facebook.ads.redexgen.core.M8 m8, java.lang.String str) {
        this.A01 = m8;
        this.A02 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, java.lang.String.format(java.util.Locale.US, A00(0, 10, 44), this.A02, java.lang.Integer.valueOf(this.A00.getAndIncrement())));
    }
}
