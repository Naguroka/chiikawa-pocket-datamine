package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class KY implements java.lang.Runnable {
    public static byte[] A01;
    public static final java.util.concurrent.atomic.AtomicBoolean A02;
    public static final java.util.concurrent.atomic.AtomicBoolean A03;
    public static final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.KO> A04;
    public final com.facebook.ads.redexgen.core.KM A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{44, 11, 16, 16, 31, 28, 18, 27, 94, 29, 12, 27, 31, 10, 27, 26, 80, 94, 42, 22, 12, 27, 31, 26, 68, 94};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new java.util.concurrent.atomic.AtomicBoolean();
        A03 = new java.util.concurrent.atomic.AtomicBoolean(false);
        A04 = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public KY() {
        if (A03.get()) {
            this.A00 = com.facebook.ads.redexgen.core.C0801Kd.A01(new com.facebook.ads.redexgen.core.C0800Kc(A01(0, 26, 94) + java.lang.Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A03(boolean z) {
        A03.set(z);
    }

    public static void A04(boolean z, com.facebook.ads.redexgen.core.KO ko) {
        A02.set(z);
        A04.set(ko);
    }

    public final com.facebook.ads.redexgen.core.KM A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                com.facebook.ads.redexgen.core.C0801Kd.A03(this);
            }
            try {
                A06();
            } catch (java.lang.Throwable th) {
                if (A02.get()) {
                    com.facebook.ads.redexgen.core.AbstractC0803Kf.A00().A9s(com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, th);
                    com.facebook.ads.redexgen.core.KO ko = A04.get();
                    if (ko != null) {
                        ko.AFg(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                com.facebook.ads.redexgen.core.C0801Kd.A04(this);
            }
        } catch (java.lang.Throwable th2) {
            com.facebook.ads.redexgen.core.KQ.A00(th2, this);
        }
    }
}
