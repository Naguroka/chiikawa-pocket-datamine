package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1120Wo implements com.facebook.ads.redexgen.core.InterfaceC0723Gy {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"P1QEQSrukY5M5xBERBA96AXfGMpQRJsf", "fyJkILoJ8zO6ExXw4Z", "h2ZhnadmQQVtt", "59wO2YFrHM8LuMJd73h58a1kzdTPZKrY", "SxndWhWbDDrPbMOefSLNszxc26nlxYdY", "LBwvzUorbHEknhZCWQOabtM6HtCL0aoO", "5lhqhPHQff1TfuPnwPh7puTUvGoJGhr7", "0PrGAAoyZelcinCG058YNP9pZpCUk744"};
    public final int A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0721Gw A01;
    public final com.facebook.ads.redexgen.core.InterfaceC0723Gy A02;
    public final com.facebook.ads.redexgen.core.InterfaceC0723Gy A03;
    public final com.facebook.ads.redexgen.core.HP A04;
    public final com.facebook.ads.redexgen.core.HR A05;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[0].charAt(6) == 'X') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A07;
            strArr[5] = "vVmF6SpGATWHz9jZKAi0g6CZ8G1CuqUy";
            strArr[3] = "NGHYjAXI4l3csZ1DR9QZwhsoB2pnzImG";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 61);
            i4++;
        }
    }

    public static void A02() {
        A06 = new byte[]{83, 66, 85, 81, 68, 85, 116, 81, 68, 81, 99, 89, 94, 91};
    }

    static {
        A02();
    }

    public C1120Wo(com.facebook.ads.redexgen.core.HP hp, com.facebook.ads.redexgen.core.InterfaceC0723Gy interfaceC0723Gy, com.facebook.ads.redexgen.core.InterfaceC0723Gy interfaceC0723Gy2, com.facebook.ads.redexgen.core.InterfaceC0721Gw interfaceC0721Gw, int i, com.facebook.ads.redexgen.core.HR hr) {
        this.A04 = hp;
        this.A03 = interfaceC0723Gy;
        this.A02 = interfaceC0723Gy2;
        this.A01 = interfaceC0721Gw;
        this.A00 = i;
        this.A05 = hr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0723Gy
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C1121Wp A4t() {
        com.facebook.ads.redexgen.core.HP hp = this.A04;
        com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724GzA4t = this.A03.A4t();
        com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724GzA4t2 = this.A02.A4t();
        if (0 != 0) {
            throw new java.lang.NullPointerException(A01(0, 14, 13));
        }
        return new com.facebook.ads.redexgen.core.C1121Wp(hp, interfaceC0724GzA4t, interfaceC0724GzA4t2, null, this.A00, null);
    }
}
