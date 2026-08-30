package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YK implements com.facebook.ads.redexgen.core.InterfaceC0609Bx {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"U7C58G8YSmV9vlVhCcgTL8gvWtK2nUh7", "rchD6g8gaCdJrKaT6cY", "XSKvYVg8u7cslMcARjuzdYWWNQWy1OI3", "RniILupZEOVdpheiJaCIVa", "W6VJBDMDl8t52bAYcLBFhi9ZJeZzY86g", "3lPq75HsPjCWcJf7cN2seevogiCFywP7", "CoUyLte", "KsfhoqpqLoVK0Wmt0M"};
    public static final com.facebook.ads.redexgen.core.C0 A05;
    public com.facebook.ads.redexgen.core.InterfaceC0611Bz A00;
    public com.facebook.ads.redexgen.core.AbstractC0631Ct A01;
    public boolean A02;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 38);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{11, 44, 36, 33, 40, 41, 109, 57, 34, 109, 41, 40, 57, 40, okio.Utf8.REPLACEMENT_BYTE, 32, 36, 35, 40, 109, 47, 36, 57, 62, 57, okio.Utf8.REPLACEMENT_BYTE, 40, 44, 32, 109, 57, 52, kotlin.io.encoding.Base64.padSymbol, 40};
    }

    static {
        A02();
        A05 = new com.facebook.ads.redexgen.core.YL();
    }

    public static com.facebook.ads.redexgen.core.I4 A00(com.facebook.ads.redexgen.core.I4 i4) {
        i4.A0Y(0);
        return i4;
    }

    private boolean A03(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        com.facebook.ads.redexgen.core.C0627Cp c0627Cp = new com.facebook.ads.redexgen.core.C0627Cp();
        if (!c0627Cp.A03(interfaceC0610By, true) || (c0627Cp.A04 & 2) != 2) {
            return false;
        }
        int length = java.lang.Math.min(c0627Cp.A00, 8);
        com.facebook.ads.redexgen.core.I4 i4 = new com.facebook.ads.redexgen.core.I4(length);
        interfaceC0610By.AEO(i4.A00, 0, length);
        if (com.facebook.ads.redexgen.core.YM.A04(A00(i4))) {
            this.A01 = new com.facebook.ads.redexgen.core.YM();
        } else if (com.facebook.ads.redexgen.core.YH.A06(A00(i4))) {
            this.A01 = new com.facebook.ads.redexgen.core.YH();
        } else {
            if (!com.facebook.ads.redexgen.core.YJ.A04(A00(i4))) {
                return false;
            }
            this.A01 = new com.facebook.ads.redexgen.core.YJ();
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void A9D(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        this.A00 = interfaceC0611Bz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final int AEk(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A01 == null) {
            boolean zA03 = A03(interfaceC0610By);
            if (A04[3].length() == 2) {
                throw new java.lang.RuntimeException();
            }
            A04[7] = "Jcv8zuJPcQsh";
            if (zA03) {
                interfaceC0610By.AFq();
            } else {
                throw new com.facebook.ads.redexgen.core.A0(A01(0, 34, 107));
            }
        }
        if (!this.A02) {
            com.facebook.ads.redexgen.core.C9 c9AHA = this.A00.AHA(0, 1);
            this.A00.A5u();
            this.A01.A06(this.A00, c9AHA);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0610By, c4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void AG7(long j, long j2) {
        if (this.A01 != null) {
            com.facebook.ads.redexgen.core.AbstractC0631Ct abstractC0631Ct = this.A01;
            if (A04[6].length() == 29) {
                throw new java.lang.RuntimeException();
            }
            A04[3] = "HMcRS9JjfDSABRlFypQFz8UIf";
            abstractC0631Ct.A05(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final boolean AGs(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        try {
            return A03(interfaceC0610By);
        } catch (com.facebook.ads.redexgen.core.A0 unused) {
            if (A04[6].length() == 29) {
                throw new java.lang.RuntimeException();
            }
            A04[7] = "Et";
            return false;
        }
    }
}
