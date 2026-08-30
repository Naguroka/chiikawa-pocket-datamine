package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.It, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0767It {
    public final android.view.View A00;
    public final com.facebook.ads.redexgen.core.C1198Zr A01;
    public final com.facebook.ads.redexgen.core.J7 A02;
    public final java.lang.String A03;
    public final java.util.HashMap<java.lang.String, java.lang.String> A04 = new java.util.HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public C0767It(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, android.view.View view, java.lang.String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = c1198Zr;
        this.A02 = c1198Zr.A09();
        this.A00 = view;
        this.A05 = z2;
        this.A06 = z;
    }

    public final android.view.View A00() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.C1198Zr A01() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.J7 A02() {
        return this.A02;
    }

    public final java.lang.String A03() {
        return this.A03;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A04() {
        return java.util.Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
