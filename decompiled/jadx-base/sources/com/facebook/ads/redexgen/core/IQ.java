package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IQ extends android.os.HandlerThread implements android.os.Handler.Callback {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"fjb62vMryiJBq6nlv0XecN4Miby9R", "URoeDihEfhk6EaAX", "MuB6m1Bx59DgjR9J", "2MJ6dS3EV8t7lzjHOstp9BZeWuWbqqlU", "ewPhRFK9mfGcTpXOBIuRZRib", "zGQ6fmAkazLgXk", "ErVdPKTj7", "wcOr5xxV0KUOSKDMt9ZYsxWBIWNUj"};
    public android.os.Handler A00;
    public com.facebook.ads.redexgen.core.RunnableC0740Hp A01;
    public com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface A02;
    public java.lang.Error A03;
    public java.lang.RuntimeException A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 38);
            if (A06[4].length() != 24) {
                throw new java.lang.RuntimeException();
            }
            A06[3] = "h25Y0rjbMuR2ypWA7lRpstXE2gsMGFZh";
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-55, -6, -14, -14, -2, -40, -6, -9, -21, -26, -24, -22, -111, -84, -76, -73, -80, -81, 107, -65, -70, 107, -76, -71, -76, -65, -76, -84, -73, -76, -59, -80, 107, -81, -64, -72, -72, -60, 107, -66, -64, -67, -79, -84, -82, -80, -93, -66, -58, -55, -62, -63, 125, -47, -52, 125, -49, -62, -55, -62, -66, -48, -62, 125, -63, -46, -54, -54, -42, 125, -48, -46, -49, -61, -66, -64, -62, -88, -71, -79, -79, -67, -105, -71, -74, -86, -91, -89, -87};
    }

    static {
        A02();
    }

    public IQ() {
        super(A00(77, 12, 30));
    }

    private void A01() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(this.A01);
        this.A01.A09(i);
        this.A02 = new com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface(this, this.A01.A07(), i != 0);
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface A04(int i) {
        start();
        this.A00 = new android.os.Handler(getLooper(), this);
        this.A01 = new com.facebook.ads.redexgen.core.RunnableC0740Hp(this.A00);
        boolean z = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        if (this.A04 == null) {
            if (this.A03 == null) {
                return (com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(this.A02);
            }
            throw this.A03;
        }
        throw this.A04;
    }

    public final void A05() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        try {
            switch (message.what) {
                case 1:
                    try {
                        A03(message.arg1);
                        synchronized (this) {
                            notify();
                            break;
                        }
                    } catch (java.lang.Error e) {
                        android.util.Log.e(A00(0, 12, 95), A00(12, 34, 37), e);
                        this.A03 = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (java.lang.RuntimeException e2) {
                        android.util.Log.e(A00(0, 12, 95), A00(12, 34, 37), e2);
                        this.A04 = e2;
                        synchronized (this) {
                            notify();
                            break;
                        }
                    }
                    return true;
                case 2:
                    try {
                        A01();
                        break;
                    } catch (java.lang.Throwable th) {
                        try {
                            android.util.Log.e(A00(0, 12, 95), A00(46, 31, 55), th);
                        } finally {
                            quit();
                        }
                        break;
                    }
                    return true;
                default:
                    return true;
            }
        } catch (java.lang.Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
        synchronized (this) {
            notify();
            throw th2;
        }
    }
}
