package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C9I {
    public final int A00;
    public final com.facebook.ads.redexgen.core.C9F A01;

    public C9I(int i, com.facebook.ads.redexgen.core.C9F c9f) {
        this.A00 = i;
        this.A01 = c9f;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() throws java.io.IOException {
        return this.A01.A05();
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass96 A02(int i, byte[] bArr, int i2, int[] iArr, int i3) throws java.io.IOException {
        return this.A01.A06(i, bArr, i2, iArr, i3);
    }

    public final void A03() throws java.io.IOException {
        this.A01.A07();
    }

    public final void A04() throws java.io.IOException {
        this.A01.A08();
    }

    public final boolean A05(byte[] bArr) throws java.io.IOException {
        return this.A01.A09(bArr);
    }
}
