package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1172Yr implements com.facebook.ads.redexgen.core.C0 {
    public static byte[] A06;
    public static final java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.InterfaceC0609Bx> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 75);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{93, 106, 106, 119, 106, 56, 113, 118, 107, 108, 121, 118, 108, 113, 121, 108, 113, 118, 127, 56, 94, 84, 89, 91, 56, 125, 96, 108, 125, 118, 107, 113, 119, 118, 74, 113, 122, 103, 111, 122, 124, 107, 122, 123, okio.Utf8.REPLACEMENT_BYTE, 122, 109, 109, 112, 109, okio.Utf8.REPLACEMENT_BYTE, 124, 109, 122, 126, 107, 118, 113, 120, okio.Utf8.REPLACEMENT_BYTE, 89, 83, 94, 92, okio.Utf8.REPLACEMENT_BYTE, 122, 103, 107, 109, 126, 124, 107, 112, 109, 89, 85, 87, 20, 92, 91, 89, 95, 88, 85, 85, 81, 20, 91, 94, 73, 20, 83, 84, 78, 95, 72, 84, 91, 86, 20, 95, 66, 85, 74, 86, 91, 67, 95, 72, 8, 20, 95, 66, 78, 20, 92, 86, 91, 89, 20, 124, 86, 91, 89, 127, 66, 78, 72, 91, 89, 78, 85, 72};
    }

    static {
        A01();
        java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.InterfaceC0609Bx> constructor = null;
        try {
            constructor = java.lang.Class.forName(A00(74, 59, 113)).asSubclass(com.facebook.ads.redexgen.core.InterfaceC0609Bx.class).getConstructor(new java.lang.Class[0]);
        } catch (java.lang.ClassNotFoundException unused) {
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(A00(0, 34, 83), e);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.core.C0
    public final synchronized com.facebook.ads.redexgen.core.InterfaceC0609Bx[] A4x() {
        com.facebook.ads.redexgen.core.InterfaceC0609Bx[] interfaceC0609BxArr;
        interfaceC0609BxArr = new com.facebook.ads.redexgen.core.InterfaceC0609Bx[A07 == null ? 12 : 13];
        interfaceC0609BxArr[0] = new com.facebook.ads.redexgen.core.C1157Yc(this.A01);
        interfaceC0609BxArr[1] = new com.facebook.ads.redexgen.core.YS(this.A00);
        interfaceC0609BxArr[2] = new com.facebook.ads.redexgen.core.YQ(this.A03);
        interfaceC0609BxArr[3] = new com.facebook.ads.redexgen.core.YZ(this.A02);
        interfaceC0609BxArr[4] = new com.facebook.ads.redexgen.core.YC();
        interfaceC0609BxArr[5] = new com.facebook.ads.redexgen.core.YF();
        interfaceC0609BxArr[6] = new com.facebook.ads.redexgen.core.C1148Xt(this.A05, this.A04);
        interfaceC0609BxArr[7] = new com.facebook.ads.redexgen.core.C1164Yj();
        interfaceC0609BxArr[8] = new com.facebook.ads.redexgen.core.YK();
        interfaceC0609BxArr[9] = new com.facebook.ads.redexgen.core.C1154Xz();
        interfaceC0609BxArr[10] = new com.facebook.ads.redexgen.core.C1146Xr();
        interfaceC0609BxArr[11] = new com.facebook.ads.redexgen.core.C1167Ym();
        if (A07 != null) {
            try {
                interfaceC0609BxArr[12] = A07.newInstance(new java.lang.Object[0]);
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException(A00(34, 40, 84), e);
            }
        }
        return interfaceC0609BxArr;
    }
}
