package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZD implements com.facebook.ads.redexgen.core.InterfaceC0746Hv {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"y11dLyPunqUC2SNmL", "uVADpA68M0Cfsn3", "aBlYZw3oCoScJFQ4w", "r0ynqY3CAk0tRf6oRkSRXMHPPhoSUYte", "5IdS6oQ5FkjdCe25TD", "axyuAqOl38qaB", "nwjC1v9mDHKhrzym", "tyB4AmDpHjXl7StHIAOspd43HtyDxVTF"};
    public com.facebook.ads.redexgen.core.ZA A00;
    public com.facebook.ads.redexgen.core.InterfaceC0746Hv A01;
    public final com.facebook.ads.redexgen.core.InterfaceC05419e A02;
    public final com.facebook.ads.redexgen.core.C1115Wj A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 114);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{20, 60, 51, 59, 48, 55, 51, 44, -25, 57, 44, 53, 43, 44, 57, 44, 57, -25, 52, 44, 43, 48, 40, -25, 42, 51, 54, 42, 50, 58, -25, 44, 53, 40, 41, 51, 44, 43, -11};
    }

    static {
        A02();
    }

    public ZD(com.facebook.ads.redexgen.core.InterfaceC05419e interfaceC05419e, com.facebook.ads.redexgen.core.InterfaceC0733Hi interfaceC0733Hi) {
        this.A02 = interfaceC05419e;
        this.A03 = new com.facebook.ads.redexgen.core.C1115Wj(interfaceC0733Hi);
    }

    private void A01() {
        this.A03.A02(this.A01.A88());
        com.facebook.ads.redexgen.core.A2 a2A85 = this.A01.A85();
        if (!a2A85.equals(this.A03.A85())) {
            this.A03.AGa(a2A85);
            this.A02.AD4(a2A85);
        }
    }

    private boolean A03() {
        if (this.A00 != null && !this.A00.A9Q()) {
            com.facebook.ads.redexgen.core.ZA za = this.A00;
            if (A05[3].charAt(15) != 'o') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[6] = "9hoxEIkxVF2NPrHo";
            strArr[1] = "wbudfck4dY7yDqE";
            if (za.A9b() || !this.A00.A8z()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            return this.A01.A88();
        }
        return this.A03.A88();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j) {
        this.A03.A02(j);
    }

    public final void A08(com.facebook.ads.redexgen.core.ZA za) {
        if (za == this.A00) {
            if (A05[3].charAt(15) != 'o') {
                throw new java.lang.RuntimeException();
            }
            A05[4] = "7XXmXHxAZf2MfmaOXy";
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(com.facebook.ads.redexgen.core.ZA za) throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.redexgen.core.InterfaceC0746Hv interfaceC0746HvA7l = za.A7l();
        if (interfaceC0746HvA7l != null) {
            com.facebook.ads.redexgen.core.InterfaceC0746Hv rendererMediaClock = this.A01;
            if (interfaceC0746HvA7l != rendererMediaClock) {
                com.facebook.ads.redexgen.core.InterfaceC0746Hv rendererMediaClock2 = this.A01;
                if (rendererMediaClock2 == null) {
                    this.A01 = interfaceC0746HvA7l;
                    this.A00 = za;
                    com.facebook.ads.redexgen.core.InterfaceC0746Hv interfaceC0746Hv = this.A01;
                    com.facebook.ads.redexgen.core.InterfaceC0746Hv rendererMediaClock3 = this.A03;
                    interfaceC0746Hv.AGa(rendererMediaClock3.A85());
                    A01();
                    return;
                }
                throw com.facebook.ads.redexgen.core.C05449h.A02(new java.lang.IllegalStateException(A00(0, 39, 85)));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0746Hv
    public final com.facebook.ads.redexgen.core.A2 A85() {
        if (this.A01 != null) {
            return this.A01.A85();
        }
        return this.A03.A85();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0746Hv
    public final long A88() {
        if (A03()) {
            return this.A01.A88();
        }
        return this.A03.A88();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0746Hv
    public final com.facebook.ads.redexgen.core.A2 AGa(com.facebook.ads.redexgen.core.A2 a2) {
        if (this.A01 != null) {
            a2 = this.A01.AGa(a2);
        }
        this.A03.AGa(a2);
        this.A02.AD4(a2);
        return a2;
    }
}
