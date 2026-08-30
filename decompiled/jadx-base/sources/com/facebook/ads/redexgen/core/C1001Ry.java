package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1001Ry {
    public int A00;
    public int A01;
    public int A02;
    public com.facebook.ads.redexgen.core.InterfaceC0991Ro A03;
    public java.util.Map<java.lang.String, java.lang.String> A04;
    public final int A05;
    public final int A06;

    public C1001Ry(int i, int i2, int i3, int i4, int i5, java.util.Map<java.lang.String, java.lang.String> requestHeaders, com.facebook.ads.redexgen.core.InterfaceC0991Ro interfaceC0991Ro) {
        this.A06 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = i4;
        this.A01 = i5;
        this.A04 = requestHeaders;
        this.A03 = interfaceC0991Ro;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public final int A03() {
        return this.A05;
    }

    public final int A04() {
        return this.A06;
    }

    public final com.facebook.ads.redexgen.core.InterfaceC0991Ro A05() {
        return this.A03;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A06() {
        return this.A04;
    }
}
