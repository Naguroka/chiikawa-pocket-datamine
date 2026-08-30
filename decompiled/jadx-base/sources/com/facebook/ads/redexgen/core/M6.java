package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M6 implements java.util.concurrent.ThreadFactory {
    public static byte[] A02;
    public final java.util.concurrent.atomic.AtomicLong A01 = new java.util.concurrent.atomic.AtomicLong();
    public int A00 = java.lang.Thread.currentThread().getPriority();

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 92);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{25, 21, 23, 84, 28, 27, 25, 31, 24, 21, 21, 17, 84, 27, 30, 9, 90, 14, 18, 8, 31, 27, 30, 87, 95, 30, 90, 95, 14, 60, 90, 95, 70, 14, 46};
    }

    private final java.lang.String A00() {
        return java.lang.String.format(java.util.Locale.US, A01(0, 35, 38), java.lang.Long.valueOf(this.A01.incrementAndGet()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(null, runnable, A00(), 0L);
        thread.setPriority(this.A00);
        return thread;
    }
}
