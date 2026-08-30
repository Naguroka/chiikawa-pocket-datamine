package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6M implements android.content.ServiceConnection {
    public static byte[] A02;
    public final java.util.concurrent.BlockingQueue<android.os.IBinder> A00;
    public final java.util.concurrent.atomic.AtomicBoolean A01;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 115);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-19, 20, 25, 15, 16, 29, -53, 12, 23, 29, 16, 12, 15, 36, -53, 14, 26, 25, 30, 32, 24, 16, 15};
    }

    public C6M() {
        this.A01 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A00 = new java.util.concurrent.LinkedBlockingDeque();
    }

    public final android.os.IBinder A02() throws java.lang.InterruptedException {
        if (!this.A01.compareAndSet(true, true)) {
            return this.A00.take();
        }
        throw new java.lang.IllegalStateException(A00(0, 23, 56));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.A00.put(iBinder);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
