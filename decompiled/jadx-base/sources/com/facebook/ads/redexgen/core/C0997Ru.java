package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0997Ru {
    public com.facebook.ads.redexgen.core.C1001Ry A00;
    public java.util.Set<java.lang.String> A01;
    public java.util.Set<java.lang.String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final com.facebook.ads.redexgen.core.C0997Ru A00(com.facebook.ads.redexgen.core.C1001Ry c1001Ry) {
        this.A00 = c1001Ry;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C0997Ru A01(java.util.Set<java.lang.String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C0997Ru A02(java.util.Set<java.lang.String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C0997Ru A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C0997Ru A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C0998Rv A05() {
        return new com.facebook.ads.redexgen.core.C0998Rv(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
