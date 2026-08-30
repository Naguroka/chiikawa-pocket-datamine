package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0624Cm {
    public final int A00;
    public final int A01;
    public final long A02;
    public final com.facebook.ads.redexgen.core.C0621Cj A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public C0624Cm(com.facebook.ads.redexgen.core.C0621Cj c0621Cj, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(iArr.length == jArr2.length);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(jArr.length == jArr2.length);
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(iArr2.length == jArr2.length);
        this.A03 = c0621Cj;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = jArr.length;
    }

    public final int A00(long j) {
        for (int i = com.facebook.ads.redexgen.core.IK.A0B(this.A07, j, true, false); i >= 0; i--) {
            int startIndex = this.A04[i];
            if ((startIndex & 1) != 0) {
                return i;
            }
        }
        return -1;
    }

    public final int A01(long j) {
        for (int i = com.facebook.ads.redexgen.core.IK.A0A(this.A07, j, true, false); i < startIndex; i++) {
            int startIndex = this.A04[i];
            if ((startIndex & 1) != 0) {
                return i;
            }
        }
        return -1;
    }
}
