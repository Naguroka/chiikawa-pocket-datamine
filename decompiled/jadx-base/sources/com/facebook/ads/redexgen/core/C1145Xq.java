package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1145Xq implements com.facebook.ads.redexgen.core.C6 {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C1145Xq(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A06 = i;
        this.A07 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = i6;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j) {
        long positionOffset = java.lang.Math.max(0L, j - this.A01);
        long j2 = 1000000 * positionOffset;
        long positionOffset2 = this.A02;
        return j2 / positionOffset2;
    }

    public final void A06(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final long A7F() {
        long j = 1000000 * (this.A00 / ((long) this.A04));
        long numFrames = this.A07;
        return j / numFrames;
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final com.facebook.ads.redexgen.core.C5 A8H(long j) {
        long j2 = (((long) this.A02) * j) / 1000000;
        long positionOffset = this.A04;
        long j3 = j2 / positionOffset;
        long positionOffset2 = this.A04;
        long jA0E = com.facebook.ads.redexgen.core.IK.A0E(j3 * positionOffset2, 0L, this.A00 - ((long) this.A04));
        long j4 = this.A01 + jA0E;
        long jA05 = A05(j4);
        com.facebook.ads.redexgen.core.C7 seekPoint = new com.facebook.ads.redexgen.core.C7(jA05, j4);
        if (jA05 >= j || jA0E == this.A00 - ((long) this.A04)) {
            return new com.facebook.ads.redexgen.core.C5(seekPoint);
        }
        long seekTimeUs = ((long) this.A04) + j4;
        long seekPosition = A05(seekTimeUs);
        return new com.facebook.ads.redexgen.core.C5(seekPoint, new com.facebook.ads.redexgen.core.C7(seekPosition, seekTimeUs));
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final boolean A9h() {
        return true;
    }
}
