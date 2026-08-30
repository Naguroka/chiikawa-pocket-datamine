package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1360cW implements com.facebook.ads.redexgen.core.C6X {
    public static byte[] A04;
    public final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC03400x A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.GK A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0669Ei A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0859Mm A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 8);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -79, -68, -60, -69, -71, -68, -82, -79, 109, -82, 109, -70, -78, -79, -74, -82, 123};
    }

    public C1360cW(com.facebook.ads.redexgen.core.GK gk, com.facebook.ads.redexgen.core.C0859Mm c0859Mm, com.facebook.ads.redexgen.core.InterfaceC03400x interfaceC03400x, com.facebook.ads.redexgen.core.C0669Ei c0669Ei) {
        this.A01 = gk;
        this.A03 = c0859Mm;
        this.A00 = interfaceC03400x;
        this.A02 = c0669Ei;
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABT() {
        com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.CACHE_FAILURE_ERROR;
        java.lang.String strA00 = A00(0, 27, 69);
        this.A02.A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A01.A00), adErrorType.getErrorCode(), strA00);
        this.A00.ACN(this.A01, com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorType, strA00));
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABc() {
        this.A03.A0J();
        this.A00.ABO(this.A01, this.A03);
        this.A02.A0E().A44(this.A01.A01 != null);
    }
}
