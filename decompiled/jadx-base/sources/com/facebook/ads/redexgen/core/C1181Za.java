package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1181Za implements com.facebook.ads.redexgen.core.InterfaceC0991Ro {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.C1198Zr A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, 127, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, 12, 10, 28, 11, 84, 24, 30, 28, 23, 13};
    }

    public C1181Za(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        this.A00 = c1198Zr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0991Ro
    public final java.util.Map<java.lang.String, java.lang.String> A6A(boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        if (!com.facebook.ads.redexgen.core.C6H.A00().A04()) {
            map.put(A00(0, 23, 64), com.facebook.ads.redexgen.core.C05278q.A00().A01(this.A00, true).A03());
        }
        map.put(A00(23, 10, 51), com.facebook.ads.redexgen.core.AbstractC05308t.A06(new com.facebook.ads.redexgen.core.C8O(this.A00), this.A00, z));
        return map;
    }
}
