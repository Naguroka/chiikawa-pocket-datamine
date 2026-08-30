package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0621Cj {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A07;
    public final long[] A08;
    public final long[] A09;
    public final com.facebook.ads.redexgen.core.C0622Ck[] A0A;

    public C0621Cj(int i, int i2, long j, long j2, long j3, com.facebook.ads.internal.exoplayer2.thirdparty.Format format, int i3, com.facebook.ads.redexgen.core.C0622Ck[] c0622CkArr, int i4, long[] jArr, long[] jArr2) {
        this.A00 = i;
        this.A03 = i2;
        this.A06 = j;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = format;
        this.A02 = i3;
        this.A0A = c0622CkArr;
        this.A01 = i4;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final com.facebook.ads.redexgen.core.C0622Ck A00(int i) {
        if (this.A0A == null) {
            return null;
        }
        return this.A0A[i];
    }
}
