package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Q5 {
    public java.lang.String A02;
    public java.lang.String A03;
    public java.lang.String A04;
    public final com.facebook.ads.redexgen.core.C1M A06;
    public final com.facebook.ads.redexgen.core.C1Z A07;
    public final com.facebook.ads.redexgen.core.C1199Zs A08;
    public com.facebook.ads.redexgen.core.C1O A01 = com.facebook.ads.redexgen.core.C1O.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Q5(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1M c1m, com.facebook.ads.redexgen.core.C1Z c1z) {
        this.A08 = c1199Zs;
        this.A06 = c1m;
        this.A07 = c1z;
    }

    public final com.facebook.ads.redexgen.core.Q5 A09(int i) {
        this.A00 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.Q5 A0A(com.facebook.ads.redexgen.core.C1O c1o) {
        this.A01 = c1o;
        return this;
    }

    public final com.facebook.ads.redexgen.core.Q5 A0B(java.lang.String str) {
        this.A04 = str;
        return this;
    }

    public final com.facebook.ads.redexgen.core.Q5 A0C(java.lang.String str) {
        this.A02 = str;
        return this;
    }

    public final com.facebook.ads.redexgen.core.Q5 A0D(java.lang.String str) {
        this.A03 = str;
        return this;
    }

    public final com.facebook.ads.redexgen.core.Q5 A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final com.facebook.ads.redexgen.core.Q7 A0F() {
        return new com.facebook.ads.redexgen.core.Q7(this, null);
    }
}
