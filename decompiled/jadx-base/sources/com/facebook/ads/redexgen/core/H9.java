package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class H9 extends java.io.IOException {
    public final int A00;
    public final com.facebook.ads.redexgen.core.H3 A01;

    public H9(java.io.IOException iOException, com.facebook.ads.redexgen.core.H3 h3, int i) {
        super(iOException);
        this.A01 = h3;
        this.A00 = i;
    }

    public H9(java.lang.String str, com.facebook.ads.redexgen.core.H3 h3, int i) {
        super(str);
        this.A01 = h3;
        this.A00 = i;
    }

    public H9(java.lang.String str, java.io.IOException iOException, com.facebook.ads.redexgen.core.H3 h3, int i) {
        super(str, iOException);
        this.A01 = h3;
        this.A00 = i;
    }
}
