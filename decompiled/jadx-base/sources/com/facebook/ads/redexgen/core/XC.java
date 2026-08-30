package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class XC implements com.facebook.ads.redexgen.core.InterfaceC0710Gl {
    public int A00;
    public final long[] A01;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format[] A02;
    public final int A03;
    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup A04;
    public final int[] A05;

    public XC(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup, int... iArr) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(iArr.length > 0);
        this.A04 = (com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(trackGroup);
        this.A03 = iArr.length;
        this.A02 = new com.facebook.ads.internal.exoplayer2.thirdparty.Format[this.A03];
        for (int i = 0; i < i; i++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArr = this.A02;
            int i2 = iArr[i];
            formatArr[i] = trackGroup.A01(i2);
        }
        java.util.Arrays.sort(this.A02, new com.facebook.ads.redexgen.core.GZ());
        this.A05 = new int[this.A03];
        for (int i3 = 0; i3 < i; i3++) {
            int[] iArr2 = this.A05;
            int i4 = trackGroup.A00(this.A02[i3]);
            iArr2[i3] = i4;
        }
        int i5 = this.A03;
        this.A01 = new long[i5];
    }

    public final boolean A00(int i, long j) {
        return this.A01[i] > j;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0710Gl
    public void A5q() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0710Gl
    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A7U(int i) {
        return this.A02[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0710Gl
    public final int A7a(int i) {
        return this.A05[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0710Gl
    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A8I() {
        return this.A02[A8J()];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0710Gl
    public final com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup A8Y() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0710Gl
    public void AD5(float f) {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.XC xc = (com.facebook.ads.redexgen.core.XC) obj;
        return this.A04 == xc.A04 && java.util.Arrays.equals(this.A05, xc.A05);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (java.lang.System.identityHashCode(this.A04) * 31) + java.util.Arrays.hashCode(this.A05);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0710Gl
    public final int length() {
        return this.A05.length;
    }
}
