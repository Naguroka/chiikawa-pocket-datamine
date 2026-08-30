package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0672Ep {
    public static byte[] A03;
    public com.facebook.ads.redexgen.core.InterfaceC0609Bx A00;
    public final com.facebook.ads.redexgen.core.InterfaceC0611Bz A01;
    public final com.facebook.ads.redexgen.core.InterfaceC0609Bx[] A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 41);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{67, 74, 9, 5, 31, 6, 14, 74, 24, 15, 11, 14, 74, 30, 2, 15, 74, 25, 30, 24, 15, 11, 7, 68, 12, 45, 44, 39, 98, 45, 36, 98, 54, 42, 39, 98, 35, 52, 35, 43, 46, 35, 32, 46, 39, 98, 39, 58, 54, 48, 35, 33, 54, 45, 48, 49, 98, 106};
    }

    public C0672Ep(com.facebook.ads.redexgen.core.InterfaceC0609Bx[] interfaceC0609BxArr, com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        this.A02 = interfaceC0609BxArr;
        this.A01 = interfaceC0611Bz;
    }

    public final com.facebook.ads.redexgen.core.InterfaceC0609Bx A02(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, android.net.Uri uri) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A00 != null) {
            return this.A00;
        }
        for (com.facebook.ads.redexgen.core.InterfaceC0609Bx interfaceC0609Bx : this.A02) {
            try {
                if (interfaceC0609Bx.AGs(interfaceC0610By)) {
                    this.A00 = interfaceC0609Bx;
                    interfaceC0610By.AFq();
                    break;
                }
                continue;
            } catch (java.io.EOFException unused) {
            } catch (java.lang.Throwable th) {
                interfaceC0610By.AFq();
                throw th;
            }
            interfaceC0610By.AFq();
        }
        if (this.A00 != null) {
            this.A00.A9D(this.A01);
            return this.A00;
        }
        throw new com.facebook.ads.redexgen.core.XR(A00(24, 34, 107) + com.facebook.ads.redexgen.core.IK.A0S(this.A02) + A00(0, 24, 67), uri);
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
