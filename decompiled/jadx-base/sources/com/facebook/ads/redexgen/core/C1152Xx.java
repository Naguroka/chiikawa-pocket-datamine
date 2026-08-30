package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1152Xx implements com.facebook.ads.redexgen.core.DB {
    public static byte[] A03;
    public com.facebook.ads.redexgen.core.C9 A00;
    public com.facebook.ads.redexgen.core.IG A01;
    public boolean A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 48);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{39, 54, 54, 42, 47, 37, 39, 50, 47, 41, 40, 105, 62, 107, 53, 37, 50, 35, 117, 115};
    }

    @Override // com.facebook.ads.redexgen.core.DB
    public final void A4n(com.facebook.ads.redexgen.core.I4 i4) {
        if (!this.A02) {
            if (this.A01.A05() == androidx.media3.common.C.TIME_UNSET) {
                return;
            }
            this.A00.A69(com.facebook.ads.internal.exoplayer2.thirdparty.Format.A02(null, A00(0, 20, 118), this.A01.A05()));
            this.A02 = true;
        }
        int iA04 = i4.A04();
        this.A00.AFv(i4, iA04);
        this.A00.AFw(this.A01.A04(), 1, iA04, 0, null);
    }

    @Override // com.facebook.ads.redexgen.core.DB
    public final void A9F(com.facebook.ads.redexgen.core.IG ig, com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
        this.A01 = ig;
        dh.A05();
        this.A00 = interfaceC0611Bz.AHA(dh.A03(), 4);
        this.A00.A69(com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0B(dh.A04(), A00(0, 20, 118), null, -1, null));
    }
}
