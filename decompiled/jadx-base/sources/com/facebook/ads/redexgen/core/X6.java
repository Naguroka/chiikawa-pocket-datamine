package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X6 implements com.facebook.ads.redexgen.core.InterfaceC0719Gu, com.facebook.ads.redexgen.core.HL<java.lang.Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final android.os.Handler A06;
    public final com.facebook.ads.redexgen.core.InterfaceC0718Gt A07;
    public final com.facebook.ads.redexgen.core.InterfaceC0733Hi A08;
    public final com.facebook.ads.redexgen.core.IF A09;

    public X6() {
        this(null, null, 1000000L, 2000, com.facebook.ads.redexgen.core.InterfaceC0733Hi.A00);
    }

    public X6(android.os.Handler handler, com.facebook.ads.redexgen.core.InterfaceC0718Gt interfaceC0718Gt, long j, int i, com.facebook.ads.redexgen.core.InterfaceC0733Hi interfaceC0733Hi) {
        this.A06 = handler;
        this.A07 = interfaceC0718Gt;
        this.A09 = new com.facebook.ads.redexgen.core.IF(i);
        this.A08 = interfaceC0733Hi;
        this.A01 = j;
    }

    private void A01(int i, long j, long j2) {
        if (this.A06 != null && this.A07 != null) {
            this.A06.post(new com.facebook.ads.redexgen.core.H4(this, i, j, j2));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0719Gu
    public final synchronized long A6V() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.HL
    public final synchronized void ABS(java.lang.Object obj, int i) {
        this.A02 += (long) i;
    }

    @Override // com.facebook.ads.redexgen.core.HL
    public final synchronized void ADr(java.lang.Object obj) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A00 > 0);
        long nowMs = this.A08.A5p();
        int i = (int) (nowMs - this.A03);
        this.A05 += (long) i;
        this.A04 += this.A02;
        if (i > 0) {
            this.A09.A03((int) java.lang.Math.sqrt(this.A02), (this.A02 * 8000) / ((long) i));
            if (this.A05 >= 2000 || this.A04 >= 524288) {
                this.A01 = (long) this.A09.A02(0.5f);
            }
        }
        A01(i, this.A02, this.A01);
        int sampleElapsedTimeMs = this.A00 - 1;
        this.A00 = sampleElapsedTimeMs;
        if (sampleElapsedTimeMs > 0) {
            this.A03 = nowMs;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.core.HL
    public final synchronized void ADs(java.lang.Object obj, com.facebook.ads.redexgen.core.H3 h3) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5p();
        }
        this.A00++;
    }
}
