package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0662Ea implements com.facebook.ads.redexgen.core.InterfaceC1155Ya {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C0662Ea(long j, long j2, com.facebook.ads.redexgen.core.C3 c3) {
        this.A04 = j2;
        this.A01 = c3.A02;
        this.A00 = c3.A00;
        if (j == -1) {
            this.A02 = -1L;
            this.A03 = androidx.media3.common.C.TIME_UNSET;
        } else {
            this.A02 = j - j2;
            this.A03 = A8W(j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final long A7F() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final com.facebook.ads.redexgen.core.C5 A8H(long j) {
        if (this.A02 == -1) {
            return new com.facebook.ads.redexgen.core.C5(new com.facebook.ads.redexgen.core.C7(0L, this.A04));
        }
        long j2 = (((long) this.A00) * j) / 8000000;
        long positionOffset = this.A01;
        long j3 = j2 / positionOffset;
        long positionOffset2 = this.A01;
        long jA0E = com.facebook.ads.redexgen.core.IK.A0E(j3 * positionOffset2, 0L, this.A02 - ((long) this.A01));
        long j4 = this.A04 + jA0E;
        long jA8W = A8W(j4);
        com.facebook.ads.redexgen.core.C7 seekPoint = new com.facebook.ads.redexgen.core.C7(jA8W, j4);
        if (jA8W >= j || jA0E == this.A02 - ((long) this.A01)) {
            return new com.facebook.ads.redexgen.core.C5(seekPoint);
        }
        long seekTimeUs = ((long) this.A01) + j4;
        long seekPosition = A8W(seekTimeUs);
        return new com.facebook.ads.redexgen.core.C5(seekPoint, new com.facebook.ads.redexgen.core.C7(seekPosition, seekTimeUs));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1155Ya
    public final long A8W(long j) {
        return ((java.lang.Math.max(0L, j - this.A04) * 1000000) * 8) / ((long) this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final boolean A9h() {
        return this.A02 != -1;
    }
}
