package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EQ {
    public static byte[] A05;
    public final com.facebook.ads.redexgen.core.InterfaceC0721Gw A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0723Gy A01;
    public final com.facebook.ads.redexgen.core.InterfaceC0723Gy A02;
    public final com.facebook.ads.redexgen.core.HP A03;
    public final com.facebook.ads.redexgen.core.I8 A04;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{16, 31, 18, 14, 33, 18, -15, 14, 33, 14, 0, 22, 27, 24};
    }

    public EQ(com.facebook.ads.redexgen.core.HP hp, com.facebook.ads.redexgen.core.InterfaceC0723Gy interfaceC0723Gy) {
        this(hp, interfaceC0723Gy, null, null, null);
    }

    public EQ(com.facebook.ads.redexgen.core.HP hp, com.facebook.ads.redexgen.core.InterfaceC0723Gy interfaceC0723Gy, com.facebook.ads.redexgen.core.InterfaceC0723Gy interfaceC0723Gy2, com.facebook.ads.redexgen.core.InterfaceC0721Gw interfaceC0721Gw, com.facebook.ads.redexgen.core.I8 i8) {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0723Gy);
        this.A03 = hp;
        this.A02 = interfaceC0723Gy;
        this.A01 = interfaceC0723Gy2;
        this.A00 = interfaceC0721Gw;
        this.A04 = i8;
    }

    public final com.facebook.ads.redexgen.core.HP A02() {
        return this.A03;
    }

    public final com.facebook.ads.redexgen.core.C1121Wp A03(boolean z) {
        com.facebook.ads.redexgen.core.InterfaceC0724Gz x1;
        if (this.A01 != null) {
            x1 = this.A01.A4t();
        } else {
            x1 = new com.facebook.ads.redexgen.core.X1();
        }
        if (z) {
            return new com.facebook.ads.redexgen.core.C1121Wp(this.A03, com.facebook.ads.redexgen.core.X2.A02, x1, null, 1, null);
        }
        if (0 != 0) {
            throw new java.lang.NullPointerException(A00(0, 14, 113));
        }
        com.facebook.ads.redexgen.core.C1122Wq c1122Wq = new com.facebook.ads.redexgen.core.C1122Wq(this.A03, 2097152L);
        com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724GzA4t = this.A02.A4t();
        if (this.A04 != null) {
            interfaceC0724GzA4t = new com.facebook.ads.redexgen.core.C1126Wu(interfaceC0724GzA4t, this.A04, -1000);
        }
        com.facebook.ads.redexgen.core.InterfaceC0724Gz upstream = x1;
        return new com.facebook.ads.redexgen.core.C1121Wp(this.A03, interfaceC0724GzA4t, upstream, c1122Wq, 1, null);
    }

    public final com.facebook.ads.redexgen.core.I8 A04() {
        return this.A04 != null ? this.A04 : new com.facebook.ads.redexgen.core.I8();
    }
}
