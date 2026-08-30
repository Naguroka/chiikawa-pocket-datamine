package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6F {
    public final long A00;
    public final com.facebook.ads.redexgen.core.C6E A01;
    public final java.lang.String A02;
    public final boolean A03;

    public C6F(java.lang.String str, boolean z, com.facebook.ads.redexgen.core.C6E c6e) {
        this(str, z, c6e, java.lang.System.currentTimeMillis());
    }

    public C6F(java.lang.String str, boolean z, com.facebook.ads.redexgen.core.C6E c6e, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = c6e;
        this.A00 = j;
    }

    public static com.facebook.ads.redexgen.core.C6F A00() {
        return new com.facebook.ads.redexgen.core.C6F("", true, com.facebook.ads.redexgen.core.C6E.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.C6E A02() {
        return this.A01;
    }

    public final java.lang.String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
