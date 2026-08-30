package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XS extends com.facebook.ads.redexgen.core.AM {
    public static final java.lang.Object A09 = new java.lang.Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final java.lang.Object A06;
    public final boolean A07;
    public final boolean A08;

    public XS(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, java.lang.Object obj) {
        this.A01 = j;
        this.A05 = j2;
        this.A00 = j3;
        this.A03 = j4;
        this.A04 = j5;
        this.A02 = j6;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = obj;
    }

    public XS(long j, long j2, long j3, long j4, boolean z, boolean z2, java.lang.Object obj) {
        this(androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, j, j2, j3, j4, z, z2, obj);
    }

    public XS(long j, boolean z, boolean z2, java.lang.Object obj) {
        this(j, j, 0L, 0L, z, z2, obj);
    }

    @Override // com.facebook.ads.redexgen.core.AM
    public final int A00() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.AM
    public final int A01() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.AM
    public final int A04(java.lang.Object obj) {
        return A09.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.redexgen.core.AM
    public final com.facebook.ads.redexgen.core.AK A0A(int i, com.facebook.ads.redexgen.core.AK ak, boolean z) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A00(i, 0, 1);
        return ak.A0B(null, z ? A09 : null, 0, this.A00, -this.A04);
    }

    @Override // com.facebook.ads.redexgen.core.AM
    public final com.facebook.ads.redexgen.core.AL A0D(int i, com.facebook.ads.redexgen.core.AL al, boolean z, long j) {
        java.lang.Object obj;
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A00(i, 0, 1);
        if (z) {
            obj = this.A06;
        } else {
            obj = null;
        }
        long j2 = this.A02;
        if (this.A07 && j != 0) {
            if (this.A03 == androidx.media3.common.C.TIME_UNSET) {
                j2 = androidx.media3.common.C.TIME_UNSET;
            } else {
                j2 += j;
                if (j2 > this.A03) {
                    j2 = androidx.media3.common.C.TIME_UNSET;
                }
            }
        }
        return al.A04(obj, this.A01, this.A05, this.A08, this.A07, j2, this.A03, 0, 0, this.A04);
    }
}
