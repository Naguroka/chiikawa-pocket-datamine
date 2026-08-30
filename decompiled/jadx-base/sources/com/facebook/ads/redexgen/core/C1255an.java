package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1255an implements com.facebook.ads.redexgen.core.AnonymousClass48 {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.FL A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 107);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C1255an(com.facebook.ads.redexgen.core.FL fl) {
        this.A00 = fl;
    }

    private final void A02(com.facebook.ads.redexgen.core.AnonymousClass49 anonymousClass49) {
        throw new java.lang.NullPointerException(A00(0, 3, 40));
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass48
    public final void ABl(com.facebook.ads.redexgen.core.AnonymousClass49 anonymousClass49) {
        A02(anonymousClass49);
        throw null;
    }
}
