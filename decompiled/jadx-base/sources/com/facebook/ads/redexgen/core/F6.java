package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F6 {
    public final int A00;
    public final com.facebook.ads.redexgen.core.Et A01;
    public final long A02;
    public final java.util.concurrent.CopyOnWriteArrayList<com.facebook.ads.redexgen.core.F5> A03;

    public F6() {
        this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null, 0L);
    }

    public F6(java.util.concurrent.CopyOnWriteArrayList<com.facebook.ads.redexgen.core.F5> copyOnWriteArrayList, int i, com.facebook.ads.redexgen.core.Et et, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = et;
        this.A02 = j;
    }

    private long A00(long j) {
        long jA01 = com.facebook.ads.redexgen.core.AbstractC05389b.A01(j);
        if (jA01 == androidx.media3.common.C.TIME_UNSET) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA01;
    }

    private void A01(android.os.Handler handler, java.lang.Runnable runnable) {
        if (handler.getLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final com.facebook.ads.redexgen.core.F6 A02(int i, com.facebook.ads.redexgen.core.Et et, long j) {
        return new com.facebook.ads.redexgen.core.F6(this.A03, i, et, j);
    }

    public final void A03() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A01 != null);
        for (com.facebook.ads.redexgen.core.F5 f5 : this.A03) {
            com.facebook.ads.redexgen.core.F9 listener = f5.A01;
            A01(f5.A00, new com.facebook.ads.redexgen.core.Ew(this, listener));
        }
    }

    public final void A04() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A01 != null);
        for (com.facebook.ads.redexgen.core.F5 f5 : this.A03) {
            com.facebook.ads.redexgen.core.F9 listener = f5.A01;
            A01(f5.A00, new com.facebook.ads.redexgen.core.RunnableC0674Ex(this, listener));
        }
    }

    public final void A05() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A01 != null);
        for (com.facebook.ads.redexgen.core.F5 f5 : this.A03) {
            com.facebook.ads.redexgen.core.F9 listener = f5.A01;
            A01(f5.A00, new com.facebook.ads.redexgen.core.F2(this, listener));
        }
    }

    public final void A06(int i, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, int i2, java.lang.Object obj, long j) {
        A0C(new com.facebook.ads.redexgen.core.F8(1, i, format, i2, obj, A00(j), androidx.media3.common.C.TIME_UNSET));
    }

    public final void A07(android.os.Handler handler, com.facebook.ads.redexgen.core.F9 f9) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03((handler == null || f9 == null) ? false : true);
        this.A03.add(new com.facebook.ads.redexgen.core.F5(handler, f9));
    }

    public final void A08(com.facebook.ads.redexgen.core.F7 f7, com.facebook.ads.redexgen.core.F8 f8) {
        for (com.facebook.ads.redexgen.core.F5 f5 : this.A03) {
            com.facebook.ads.redexgen.core.F9 listener = f5.A01;
            A01(f5.A00, new com.facebook.ads.redexgen.core.F0(this, listener, f7, f8));
        }
    }

    public final void A09(com.facebook.ads.redexgen.core.F7 f7, com.facebook.ads.redexgen.core.F8 f8) {
        for (com.facebook.ads.redexgen.core.F5 f5 : this.A03) {
            com.facebook.ads.redexgen.core.F9 listener = f5.A01;
            A01(f5.A00, new com.facebook.ads.redexgen.core.RunnableC0676Ez(this, listener, f7, f8));
        }
    }

    public final void A0A(com.facebook.ads.redexgen.core.F7 f7, com.facebook.ads.redexgen.core.F8 f8) {
        for (com.facebook.ads.redexgen.core.F5 f5 : this.A03) {
            com.facebook.ads.redexgen.core.F9 listener = f5.A01;
            A01(f5.A00, new com.facebook.ads.redexgen.core.RunnableC0675Ey(this, listener, f7, f8));
        }
    }

    public final void A0B(com.facebook.ads.redexgen.core.F7 f7, com.facebook.ads.redexgen.core.F8 f8, java.io.IOException iOException, boolean z) {
        for (com.facebook.ads.redexgen.core.F5 f5 : this.A03) {
            A01(f5.A00, new com.facebook.ads.redexgen.core.F1(this, f5.A01, f7, f8, iOException, z));
        }
    }

    public final void A0C(com.facebook.ads.redexgen.core.F8 f8) {
        for (com.facebook.ads.redexgen.core.F5 f5 : this.A03) {
            com.facebook.ads.redexgen.core.F9 listener = f5.A01;
            A01(f5.A00, new com.facebook.ads.redexgen.core.F4(this, listener, f8));
        }
    }

    public final void A0D(com.facebook.ads.redexgen.core.F9 f9) {
        for (com.facebook.ads.redexgen.core.F5 listenerAndHandler : this.A03) {
            if (listenerAndHandler.A01 == f9) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(com.facebook.ads.redexgen.core.H3 h3, int i, int i2, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, int i3, java.lang.Object obj, long j, long j2, long j3) {
        A0A(new com.facebook.ads.redexgen.core.F7(h3, j3, 0L, 0L), new com.facebook.ads.redexgen.core.F8(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0F(com.facebook.ads.redexgen.core.H3 h3, int i, int i2, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, int i3, java.lang.Object obj, long j, long j2, long j3, long j4, long j5) {
        A08(new com.facebook.ads.redexgen.core.F7(h3, j3, j4, j5), new com.facebook.ads.redexgen.core.F8(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0G(com.facebook.ads.redexgen.core.H3 h3, int i, int i2, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, int i3, java.lang.Object obj, long j, long j2, long j3, long j4, long j5) {
        A09(new com.facebook.ads.redexgen.core.F7(h3, j3, j4, j5), new com.facebook.ads.redexgen.core.F8(i, i2, format, i3, obj, A00(j), A00(j2)));
    }

    public final void A0H(com.facebook.ads.redexgen.core.H3 h3, int i, int i2, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, int i3, java.lang.Object obj, long j, long j2, long j3, long j4, long j5, java.io.IOException iOException, boolean z) {
        A0B(new com.facebook.ads.redexgen.core.F7(h3, j3, j4, j5), new com.facebook.ads.redexgen.core.F8(i, i2, format, i3, obj, A00(j), A00(j2)), iOException, z);
    }
}
