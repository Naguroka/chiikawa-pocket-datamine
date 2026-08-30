package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D2 extends com.facebook.ads.redexgen.core.XC {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final com.facebook.ads.redexgen.core.InterfaceC0719Gu A0A;
    public final com.facebook.ads.redexgen.core.InterfaceC0733Hi A0B;

    public D2(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup, int[] iArr, com.facebook.ads.redexgen.core.InterfaceC0719Gu interfaceC0719Gu, long j, long j2, long j3, float f, float f2, long j4, com.facebook.ads.redexgen.core.InterfaceC0733Hi interfaceC0733Hi) {
        super(trackGroup, iArr);
        this.A0A = interfaceC0719Gu;
        this.A07 = j * 1000;
        this.A06 = j2 * 1000;
        this.A08 = 1000 * j3;
        this.A04 = f;
        this.A05 = f2;
        this.A09 = j4;
        this.A0B = interfaceC0733Hi;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = androidx.media3.common.C.TIME_UNSET;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j) {
        long jA6V = (long) (this.A0A.A6V() * this.A04);
        int i = 0;
        for (int i2 = 0; i2 < super.A03; i2++) {
            if (j == Long.MIN_VALUE || !A00(i2, j)) {
                if (java.lang.Math.round(A7U(i2).A04 * this.A00) <= jA6V) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.core.XC, com.facebook.ads.redexgen.core.InterfaceC0710Gl
    public final void A5q() {
        this.A03 = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0710Gl
    public final int A8J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.XC, com.facebook.ads.redexgen.core.InterfaceC0710Gl
    public final void AD5(float f) {
        this.A00 = f;
    }
}
