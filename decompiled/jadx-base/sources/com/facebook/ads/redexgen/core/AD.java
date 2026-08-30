package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AD {
    public int A00;
    public int A01;
    public android.os.Handler A03;
    public java.lang.Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final com.facebook.ads.redexgen.core.AB A0A;
    public final com.facebook.ads.redexgen.core.AC A0B;
    public final com.facebook.ads.redexgen.core.AM A0C;
    public long A02 = androidx.media3.common.C.TIME_UNSET;
    public boolean A05 = true;

    public AD(com.facebook.ads.redexgen.core.AB ab, com.facebook.ads.redexgen.core.AC ac, com.facebook.ads.redexgen.core.AM am, int i, android.os.Handler handler) {
        this.A0A = ab;
        this.A0B = ac;
        this.A0C = am;
        this.A03 = handler;
        this.A01 = i;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final android.os.Handler A03() {
        return this.A03;
    }

    public final com.facebook.ads.redexgen.core.AC A04() {
        return this.A0B;
    }

    public final com.facebook.ads.redexgen.core.AD A05() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A09);
        if (this.A02 == androidx.media3.common.C.TIME_UNSET) {
            com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.AGF(this);
        return this;
    }

    public final com.facebook.ads.redexgen.core.AD A06(int i) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A09);
        this.A00 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.AD A07(java.lang.Object obj) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final com.facebook.ads.redexgen.core.AM A08() {
        return this.A0C;
    }

    public final java.lang.Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z) {
        this.A07 |= z;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws java.lang.InterruptedException {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A09);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A03.getLooper().getThread() != java.lang.Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
