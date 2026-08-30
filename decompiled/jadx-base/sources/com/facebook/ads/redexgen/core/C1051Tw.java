package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1051Tw extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.A6 A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C9O A01;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 118);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{98, 85, 70, 70, 69, 82, 73, 78, 71, 0, 73, 78, 68, 69, 70, 73, 78, 73, 84, 69, 76, 89};
    }

    public C1051Tw(com.facebook.ads.redexgen.core.A6 a6, com.facebook.ads.redexgen.core.C9O c9o) {
        this.A00 = a6;
        this.A01 = c9o;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        if (this.A00.A0Z.getState() == com.facebook.ads.redexgen.core.EnumC0984Rh.A02 && this.A00.A0Z.getCurrentPositionInMillis() == A00()) {
            this.A00.A0X.AE0(A00(0, 22, 86));
        }
    }
}
