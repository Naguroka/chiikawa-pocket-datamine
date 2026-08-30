package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0742Hr {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;

    public C0742Hr(byte[] bArr, int i) {
        com.facebook.ads.redexgen.core.I3 i3 = new com.facebook.ads.redexgen.core.I3(bArr);
        i3.A07(i * 8);
        this.A04 = i3.A04(16);
        this.A02 = i3.A04(16);
        this.A05 = i3.A04(24);
        this.A03 = i3.A04(24);
        this.A06 = i3.A04(20);
        this.A01 = i3.A04(3) + 1;
        this.A00 = i3.A04(5) + 1;
        this.A07 = ((((long) i3.A04(4)) & 15) << 32) | (((long) i3.A04(32)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE);
    }

    public final int A00() {
        return this.A00 * this.A06;
    }

    public final long A01() {
        return (this.A07 * 1000000) / ((long) this.A06);
    }
}
