package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DJ {
    public final int A00;
    public final long A01;

    public DJ(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static com.facebook.ads.redexgen.core.DJ A00(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.I4 i4) throws java.lang.InterruptedException, java.io.IOException {
        interfaceC0610By.AEO(i4.A00, 0, 8);
        i4.A0Y(0);
        int iA08 = i4.A08();
        long size = i4.A0K();
        return new com.facebook.ads.redexgen.core.DJ(iA08, size);
    }
}
