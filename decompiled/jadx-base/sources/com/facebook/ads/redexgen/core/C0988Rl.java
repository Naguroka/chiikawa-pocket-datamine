package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0988Rl {
    public float A00;
    public com.facebook.ads.redexgen.core.C0Q A01;
    public java.util.Map<java.lang.String, java.lang.String> A02;

    public C0988Rl(com.facebook.ads.redexgen.core.C0Q c0q) {
        this(c0q, 0.0f);
    }

    public C0988Rl(com.facebook.ads.redexgen.core.C0Q c0q, float f) {
        this(c0q, f, null);
    }

    public C0988Rl(com.facebook.ads.redexgen.core.C0Q c0q, float f, java.util.Map<java.lang.String, java.lang.String> windowParams) {
        this.A01 = c0q;
        this.A00 = f;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new java.util.HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final com.facebook.ads.redexgen.core.C0Q A02() {
        return this.A01;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == com.facebook.ads.redexgen.core.C0Q.A0I;
    }
}
