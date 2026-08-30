package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05449h extends java.lang.Exception {
    public final int A00;
    public final int A01;

    public C05449h(int i, java.lang.String str, java.lang.Throwable th, int i2) {
        super(str, th);
        this.A01 = i;
        this.A00 = i2;
    }

    public static com.facebook.ads.redexgen.core.C05449h A00(java.io.IOException iOException) {
        return new com.facebook.ads.redexgen.core.C05449h(0, null, iOException, -1);
    }

    public static com.facebook.ads.redexgen.core.C05449h A01(java.lang.Exception exc, int i) {
        return new com.facebook.ads.redexgen.core.C05449h(1, null, exc, i);
    }

    public static com.facebook.ads.redexgen.core.C05449h A02(java.lang.RuntimeException runtimeException) {
        return new com.facebook.ads.redexgen.core.C05449h(2, null, runtimeException, -1);
    }
}
