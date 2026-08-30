package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M8 implements java.util.concurrent.Executor {
    public static int A03;
    public static byte[] A04;
    public static java.lang.String[] A05 = {"uvnoFswQgKsjzwr3iqz20P0mNxal25YN", "BOK6fyYRMOy6Lb8Z6odzTUAxqzIsXRll", "1GcjrCMpoDxZbcTJPp4flsza35E3FHOH", "Q8EknHhwhDHlUg6ZVkO6XJARQOBsEo9A", "lKrFFJxvaHBIh9KU9RDmbthSOvdNTSOe", "dITSoTCgaqh40J1PXoqJ1l8mYaM7YSf3", "Zpgmgw2PULMIQ945sgsvBOXkpNFyy2RR", "22uUhJ3etkiChBnOXQGZ31CB4WVKfXWA"};
    public static final java.util.concurrent.Executor A06;
    public static final java.util.concurrent.Executor A07;
    public static final java.util.concurrent.Executor A08;
    public static final java.util.concurrent.Executor A09;
    public static final java.util.concurrent.ExecutorService A0A;
    public static final java.util.concurrent.ExecutorService A0B;
    public static final java.util.concurrent.ExecutorService A0C;
    public static final java.util.concurrent.atomic.AtomicBoolean A0D;
    public static final java.util.concurrent.atomic.AtomicBoolean A0E;
    public java.util.concurrent.Executor A00;
    public java.util.concurrent.ThreadPoolExecutor A01;
    public final int A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 100);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{101, 119, 125, 106, 103, 43, 45, kotlin.io.encoding.Base64.padSymbol, 54, 39, 36, 60, 33, 56, 23, 45, 62, 33, 100, 121, 100, 18, 39, 53, 45, 53, 102, 55, 51, 35, 51, 35, 102, 50, 41, 41, 102, 42, 41, 40, 33, 104, 33, 35, 40, 35, 52, 47, 37};
    }

    static {
        A04();
        A08 = new com.facebook.ads.redexgen.core.M8(A00(7, 7, 23), 0);
        A06 = new com.facebook.ads.redexgen.core.M8(A00(0, 5, 64), 0);
        A07 = new com.facebook.ads.redexgen.core.M8(A00(5, 2, 11), 0);
        A03 = 32;
        A0C = java.util.concurrent.Executors.newSingleThreadExecutor();
        A0B = java.util.concurrent.Executors.newFixedThreadPool(5);
        A0D = new java.util.concurrent.atomic.AtomicBoolean();
        A0E = new java.util.concurrent.atomic.AtomicBoolean();
        A0A = java.util.concurrent.Executors.newCachedThreadPool(new com.facebook.ads.redexgen.core.M6());
        A09 = new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue());
    }

    public M8(java.lang.String str, int i) {
        this.A02 = i;
        int CPU_COUNT = java.lang.Runtime.getRuntime().availableProcessors();
        this.A01 = new java.util.concurrent.ThreadPoolExecutor(java.lang.Math.max(2, java.lang.Math.min(CPU_COUNT - 1, 4)), (CPU_COUNT * 2) + 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.facebook.ads.redexgen.core.M7(this, str));
        this.A01.allowCoreThreadTimeOut(true);
    }

    public static java.util.concurrent.Executor A01() {
        if (A0E.get()) {
            return A0A;
        }
        return A09;
    }

    public static java.util.concurrent.ExecutorService A02() {
        if (A0D.get()) {
            return A0A;
        }
        java.util.concurrent.ExecutorService executorService = A0B;
        java.lang.String[] strArr = A05;
        if (strArr[1].charAt(22) != strArr[3].charAt(22)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A05;
        strArr2[7] = "6q4tM5jAmY0PAOAy6HwEMe1sj0cj7zQz";
        strArr2[6] = "MhPmFJnLh57p7LL9USZoyjfqJ71dPdnV";
        return executorService;
    }

    public static java.util.concurrent.ExecutorService A03() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = A0D;
        java.lang.String[] strArr = A05;
        if (strArr[7].charAt(15) == strArr[6].charAt(15)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A05;
        strArr2[7] = "2Tn7AiJzESRcQwDw62aH6aDmKpqluSmQ";
        strArr2[6] = "4SjpGfk5gALOkzJ9eVK78zFrDbXv3S0x";
        if (atomicBoolean.get()) {
            return A0A;
        }
        return A0C;
    }

    public static void A05(android.content.Context context) {
        A0D.set(com.facebook.ads.redexgen.core.C0762Im.A2f(context));
        A0E.set(com.facebook.ads.redexgen.core.C0762Im.A2e(context));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (this.A00 == null && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            this.A00 = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        }
        if ((this.A00 instanceof java.util.concurrent.ThreadPoolExecutor) && ((java.util.concurrent.ThreadPoolExecutor) this.A00).getQueue().size() < this.A02) {
            this.A00.execute(runnable);
            return;
        }
        int size = this.A01.getQueue().size();
        synchronized (com.facebook.ads.redexgen.core.M8.class) {
            int i = A03;
            int reservedExecutorQueueSize = A03;
            if (size == reservedExecutorQueueSize) {
                int reservedExecutorQueueSize2 = A03;
                A03 = reservedExecutorQueueSize2 * 2;
                com.facebook.ads.redexgen.core.C1198Zr c1198ZrA00 = com.facebook.ads.redexgen.core.AbstractC04997i.A00();
                if (c1198ZrA00 != null) {
                    c1198ZrA00.A07().AA0(A00(42, 7, 34), com.facebook.ads.redexgen.core.C8E.A1d, new com.facebook.ads.redexgen.core.C8F(A00(21, 21, 34), A00(14, 7, 32) + i));
                }
            }
        }
        this.A01.execute(runnable);
    }
}
