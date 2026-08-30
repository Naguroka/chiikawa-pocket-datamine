package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0998Rv {
    public com.facebook.ads.redexgen.core.C1001Ry A00;
    public java.util.Set<java.lang.String> A01;
    public java.util.Set<java.lang.String> A02;
    public boolean A03;
    public boolean A04;

    public C0998Rv(com.facebook.ads.redexgen.core.C1001Ry c1001Ry, boolean z, java.util.Set<java.lang.String> pinnedPublicKeys, java.util.Set<java.lang.String> pinnedCertificates, boolean z2) {
        this.A00 = c1001Ry;
        this.A04 = z;
        this.A02 = pinnedPublicKeys;
        this.A01 = pinnedCertificates;
        this.A03 = z2;
    }

    public final com.facebook.ads.redexgen.core.C1001Ry A00() {
        return this.A00;
    }

    public final java.util.Set<java.lang.String> A01() {
        return this.A01;
    }

    public final java.util.Set<java.lang.String> A02() {
        return this.A02;
    }

    public final boolean A03() {
        return this.A04;
    }

    public final boolean A04() {
        return this.A03;
    }
}
