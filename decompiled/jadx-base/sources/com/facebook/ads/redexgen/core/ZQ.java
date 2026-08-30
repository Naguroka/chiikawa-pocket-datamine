package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZQ implements com.facebook.ads.redexgen.core.InterfaceC05017l {
    public static com.facebook.ads.redexgen.core.ZQ A07;
    public static byte[] A08;
    public com.facebook.ads.redexgen.core.C0W A00;
    public com.facebook.ads.redexgen.core.InterfaceC04806j A01;
    public com.facebook.ads.redexgen.core.InterfaceC05007k A02;
    public com.facebook.ads.redexgen.core.AnonymousClass80 A03;
    public com.facebook.ads.redexgen.core.C05188h A04;
    public com.facebook.ads.redexgen.core.JJ A05;
    public com.facebook.ads.redexgen.core.InterfaceC0794Jw A06;

    static {
        A07();
    }

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{11, 11, 17, kotlin.io.encoding.Base64.padSymbol, 58, 14, 59, 10, 13, 31, 45, 45, 35, 41, 40, -38, 30, 27, 46, 27, -38, 35, 40, 35, 46, 35, 27, 38, 35, 52, 31, 30, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1198Zr);
        this.A06 = A05(c1198Zr, this.A03, A03(c1198Zr));
        A09(c1198Zr, A00(c1198Zr, this.A06));
        A0A(c1198Zr, this.A06);
        A0B(c1198Zr, this.A06);
        if (this.A06 != null) {
            this.A06.A68();
        }
    }

    public static com.facebook.ads.redexgen.core.AnonymousClass69 A00(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.InterfaceC0794Jw interfaceC0794Jw) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A1h(c1198Zr) || interfaceC0794Jw == null) {
            return null;
        }
        return com.facebook.ads.redexgen.core.C6A.A00().A00(interfaceC0794Jw);
    }

    public static com.facebook.ads.redexgen.core.AnonymousClass80 A01(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        return com.facebook.ads.redexgen.core.AnonymousClass81.A00().A00(c1198Zr, new com.facebook.ads.redexgen.core.ZX());
    }

    public static synchronized com.facebook.ads.redexgen.core.ZQ A02() {
        if (A07 == null) {
            A07 = new com.facebook.ads.redexgen.core.ZQ();
        }
        return A07;
    }

    public static com.facebook.ads.redexgen.core.InterfaceC0993Rq A03(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A1d(c1198Zr)) {
            return null;
        }
        return com.facebook.ads.redexgen.core.S8.A01(c1198Zr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized com.facebook.ads.redexgen.core.InterfaceC0794Jw A8U() {
        return this.A06;
    }

    public static com.facebook.ads.redexgen.core.InterfaceC0794Jw A05(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.AnonymousClass80 anonymousClass80, com.facebook.ads.redexgen.core.InterfaceC0993Rq interfaceC0993Rq) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A2Z(c1198Zr) || interfaceC0993Rq == null || com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return com.facebook.ads.redexgen.core.SV.A00().A00(c1198Zr, anonymousClass80, interfaceC0993Rq, com.facebook.ads.redexgen.core.KE.A04(c1198Zr), new com.facebook.ads.redexgen.core.ZR(new com.facebook.ads.redexgen.core.K6(c1198Zr, A06(0, 0, 9), null, com.facebook.ads.redexgen.core.EnumC0783Jl.A08, 0, new com.facebook.ads.redexgen.core.C0788Jq(), com.facebook.ads.redexgen.core.AbstractC0832Ll.A01(com.facebook.ads.redexgen.core.C0762Im.A0L(c1198Zr)), null, null, new com.facebook.ads.redexgen.core.C1309bh()), c1198Zr), com.facebook.ads.redexgen.core.ST.A00().A00());
    }

    public static void A08() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A06(32, 28, 52), A06(8, 24, 68), A06(0, 8, 99));
    }

    public static void A09(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.AnonymousClass69 anonymousClass69) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A1h(c1198Zr) || anonymousClass69 == null) {
            return;
        }
        com.facebook.ads.redexgen.core.AnonymousClass67.A00().A00(anonymousClass69, c1198Zr);
    }

    public static void A0A(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.InterfaceC0794Jw interfaceC0794Jw) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A0j(c1198Zr) || interfaceC0794Jw == null) {
            return;
        }
        new com.facebook.ads.redexgen.core.C6U(c1198Zr, interfaceC0794Jw, new com.facebook.ads.redexgen.core.C6V(), com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, com.facebook.ads.redexgen.core.InterfaceC0794Jw interfaceC0794Jw) {
        if (interfaceC0794Jw == null) {
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC0765Iq.A00(c1198Zr, interfaceC0794Jw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    public final com.facebook.ads.redexgen.core.J7 A6H(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        return com.facebook.ads.redexgen.core.WV.A01(c1198Zr);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    public final synchronized com.facebook.ads.redexgen.core.InterfaceC05007k A6Y(com.facebook.ads.redexgen.core.C7j c7j) {
        if (this.A02 == null) {
            this.A02 = new com.facebook.ads.redexgen.core.ZS(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    public final synchronized com.facebook.ads.redexgen.core.InterfaceC04806j A6j() {
        if (this.A01 == null) {
            this.A01 = new com.facebook.ads.redexgen.core.C1200Zt();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    public final synchronized com.facebook.ads.redexgen.core.AnonymousClass80 A77(com.facebook.ads.redexgen.core.C7j c7j) {
        if (this.A03 == null) {
            this.A03 = A01(c7j.A01());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    public final synchronized com.facebook.ads.redexgen.core.C8D A79(com.facebook.ads.redexgen.core.C7j c7j) {
        return new com.facebook.ads.redexgen.core.C1187Zg(c7j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    public final synchronized com.facebook.ads.redexgen.core.InterfaceC05027m A7J(com.facebook.ads.redexgen.core.C7j c7j) {
        return new com.facebook.ads.redexgen.core.C0668Eg(this, c7j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    public final synchronized com.facebook.ads.redexgen.core.C0W A7V(com.facebook.ads.redexgen.core.C7j c7j) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A0z(c7j)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = com.facebook.ads.redexgen.core.C0X.A00().A00(new com.facebook.ads.redexgen.core.ZV(c7j));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    public final synchronized com.facebook.ads.redexgen.core.InterfaceC05037o A8E(com.facebook.ads.redexgen.core.C7j c7j) {
        return new com.facebook.ads.redexgen.core.ZT(c7j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    public final com.facebook.ads.redexgen.core.C1198Zr A8F(android.content.Context context) {
        com.facebook.ads.redexgen.core.C1198Zr sdkContext = com.facebook.ads.redexgen.core.AbstractC04997i.A00();
        if (sdkContext == null) {
            com.facebook.ads.redexgen.core.C1198Zr sdkContext2 = new com.facebook.ads.redexgen.core.C1198Zr(context, this);
            com.facebook.ads.redexgen.core.AbstractC04997i.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    public final synchronized com.facebook.ads.redexgen.core.JJ A8G(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        if (this.A05 == null) {
            this.A05 = new com.facebook.ads.redexgen.core.C1109Wd(c1198Zr);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05017l
    public final synchronized com.facebook.ads.redexgen.core.C05188h A8M() {
        if (this.A04 == null) {
            this.A04 = new com.facebook.ads.redexgen.core.C05188h();
            A08();
        }
        return this.A04;
    }
}
