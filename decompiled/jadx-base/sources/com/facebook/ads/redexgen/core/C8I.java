package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8I {
    public double A00;
    public double A01 = java.lang.System.currentTimeMillis() / 1000.0d;
    public java.lang.String A02;
    public java.util.Map<java.lang.String, java.lang.String> A03;

    public C8I(double d, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> mData) {
        this.A00 = d;
        this.A02 = str;
        this.A03 = mData;
    }

    public final double A00() {
        return this.A00;
    }

    public final double A01() {
        return this.A01;
    }

    public final java.lang.String A02() {
        return this.A02;
    }

    public final java.lang.String A03() {
        return com.facebook.ads.redexgen.core.JA.A0A.toString();
    }

    public final java.util.Map<java.lang.String, java.lang.String> A04() {
        return this.A03;
    }
}
