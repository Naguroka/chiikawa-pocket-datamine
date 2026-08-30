package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5G extends java.lang.Thread {
    public static byte[] A07;
    public static final java.lang.String A08;
    public final int A00;
    public final android.os.Handler A01;
    public final com.facebook.ads.redexgen.core.C5I A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;
    public final java.lang.Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 101);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{103, 99, 12, 96, 111, 115, 12, 101, 68, 85, 68, 66, 85, 78, 83, 10, 8, 3, 8, 31, 4, 14};
    }

    static {
        A02();
        A08 = com.facebook.ads.redexgen.core.C5G.class.getName();
    }

    public C5G(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C5I c5i) {
        this(c1199Zs, c5i, com.facebook.ads.redexgen.core.C0762Im.A08(c1199Zs));
    }

    public C5G(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C5I c5i, int i) {
        this.A01 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A04 = new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.5F
            @Override // java.lang.Runnable
            public final void run() throws java.lang.Throwable {
                if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                    return;
                }
                try {
                    this.A00.A05 = 0L;
                    this.A00.A06 = false;
                } catch (java.lang.Throwable th) {
                    com.facebook.ads.redexgen.core.KQ.A00(th, this);
                }
            }
        };
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i;
        this.A03 = c1199Zs;
        this.A02 = c5i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            long j = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z = interval == 0;
                this.A05 = j;
                if (z) {
                    this.A01.post(this.A04);
                }
                try {
                    java.lang.Thread.sleep(j);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !android.os.Debug.isDebuggerConnected()) {
                        if (this.A02.A05()) {
                            this.A03.A07().AA0(A01(15, 7, 8), com.facebook.ads.redexgen.core.C8E.A1D, new com.facebook.ads.redexgen.core.C8F(this.A02.A04()));
                        }
                        this.A06 = true;
                    }
                } catch (java.lang.InterruptedException unused) {
                    com.facebook.ads.internal.api.BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
