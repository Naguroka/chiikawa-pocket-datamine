package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1316bo implements com.facebook.ads.redexgen.core.K8 {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"gvO2SkJ6judPPNAAbU10EdMFrysfMOoq", "C8fayNw08H03MAMa0MYSKK0pyo1qSvcR", "zD", "tQ435k35SGtCPZ", "PU5xmRYaUesfDikXgdcM0c", "Sj", "IzP0LuOvX3krWKzZjoX9w767Mf8waFqk", "fiC8qpcDm8TluoxAfEpO8PomLrdxugFO"};
    public com.facebook.ads.redexgen.core.InterfaceC03661x A00;
    public com.facebook.ads.redexgen.core.C8W A01;
    public java.lang.String A02;
    public boolean A03;
    public final int A04;
    public final android.os.Handler A05;
    public final com.facebook.ads.AdSize A06;
    public final com.facebook.ads.redexgen.core.C03370u A07;
    public final com.facebook.ads.redexgen.core.C1199Zs A08;
    public final com.facebook.ads.redexgen.core.J7 A09;
    public final com.facebook.ads.redexgen.core.EnumC0783Jl A0A;
    public final com.facebook.ads.redexgen.core.K9 A0B;
    public final java.lang.Runnable A0C;
    public final java.lang.String A0D;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-47, -46, -125, -45, -49, -60, -58, -56, -48, -56, -47, -41, -125, -52, -47, -125, -43, -56, -42, -45, -46, -47, -42, -56};
    }

    static {
        A05();
        com.facebook.ads.redexgen.core.M5.A02();
    }

    public C1316bo(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str, com.facebook.ads.redexgen.core.EnumC0783Jl enumC0783Jl, com.facebook.ads.AdSize adSize, int i) {
        this.A08 = c1199Zs;
        this.A0D = str;
        this.A0A = enumC0783Jl;
        this.A06 = adSize;
        this.A04 = i;
        this.A0B = new com.facebook.ads.redexgen.core.K9(this.A08);
        this.A0B.A0Q(this);
        this.A07 = new com.facebook.ads.redexgen.core.C03370u();
        this.A03 = true;
        this.A05 = new android.os.Handler();
        this.A0C = new com.facebook.ads.redexgen.core.C0682Ff(this);
        this.A09 = c1199Zs.A09();
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private java.util.List<com.facebook.ads.redexgen.core.C1358cU> A04() {
        com.facebook.ads.redexgen.core.C8W c8w = this.A01;
        java.util.ArrayList arrayList = new java.util.ArrayList(c8w.A02());
        for (com.facebook.ads.redexgen.core.C8U c8uA04 = c8w.A04(); c8uA04 != null; c8uA04 = c8w.A04()) {
            com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320pA00 = this.A07.A00(this.A08, com.facebook.ads.internal.protocol.AdPlacementType.NATIVE);
            if (interfaceC03320pA00 != null && interfaceC03320pA00.A82() == com.facebook.ads.internal.protocol.AdPlacementType.NATIVE) {
                com.facebook.ads.redexgen.core.C1358cU nativeAdapter = (com.facebook.ads.redexgen.core.C1358cU) interfaceC03320pA00;
                nativeAdapter.A0L(this.A08, new com.facebook.ads.redexgen.core.C0683Fg(this, arrayList, nativeAdapter), this.A09, new com.facebook.ads.redexgen.core.C03631u(c8uA04.A04(), c8w.A05(), this.A0D, c8w.A05().A0C()), com.facebook.ads.redexgen.core.W7.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            this.A0B.A0P(new com.facebook.ads.redexgen.core.K6(this.A08, this.A0D, this.A06 != null ? new com.facebook.ads.redexgen.core.C0826Lf(this.A06.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, new com.facebook.ads.redexgen.core.C0788Jq(this.A08, null, null, null), com.facebook.ads.redexgen.core.AbstractC0832Ll.A01(com.facebook.ads.redexgen.core.C0762Im.A0L(this.A08)), this.A02, null, new com.facebook.ads.redexgen.core.C1309bh()));
        } catch (com.facebook.ads.redexgen.core.C0780Jh e) {
            ABs(com.facebook.ads.redexgen.core.C0779Jg.A02(e));
        }
    }

    public final void A08(com.facebook.ads.redexgen.core.InterfaceC03661x interfaceC03661x) {
        this.A00 = interfaceC03661x;
    }

    public final void A09(java.lang.String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        return this.A01 == null || this.A01.A0H();
    }

    @Override // com.facebook.ads.redexgen.core.K8
    public final void ABs(com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        if (this.A00 != null) {
            this.A00.ABs(c0779Jg);
        }
    }

    @Override // com.facebook.ads.redexgen.core.K8
    public final void ADj(com.facebook.ads.redexgen.core.Vu vu) {
        com.facebook.ads.redexgen.core.C8W c8wA00 = vu.A00();
        if (c8wA00 != null) {
            if (this.A03) {
                long jA0A = c8wA00.A05().A0A();
                if (jA0A == 0) {
                    jA0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, jA0A);
            }
            this.A01 = c8wA00;
            java.util.List<com.facebook.ads.redexgen.core.C1358cU> listA04 = A04();
            if (this.A00 != null) {
                boolean zIsEmpty = listA04.isEmpty();
                java.lang.String[] strArr = A0F;
                if (strArr[7].charAt(9) == strArr[6].charAt(9)) {
                    throw new java.lang.RuntimeException();
                }
                A0F[0] = "Ma8ASQR7F1ZvPn5hHoXinNcVvjUetiuh";
                if (zIsEmpty) {
                    this.A00.ABs(com.facebook.ads.redexgen.core.C0779Jg.A01(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL, A03(0, 0, 63)));
                    return;
                } else {
                    this.A00.ACq(listA04);
                    return;
                }
            }
            return;
        }
        throw new java.lang.IllegalStateException(A03(0, 24, 18));
    }
}
