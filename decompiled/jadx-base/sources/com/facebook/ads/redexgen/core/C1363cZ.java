package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1363cZ implements com.facebook.ads.redexgen.core.InterfaceC03320p, com.facebook.ads.redexgen.core.InterfaceC03491g {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"Tri2", "1D6RXHNY", "CY2J", "FG3HLf7FRck3Q4", "aTw9XxKg19aD2PWH35UjlgQd", "aN0Sboz7ddtAAnQUWG6qQ4oJRDDzSUBt", "pWs", "z"};
    public long A00;
    public com.facebook.ads.RewardData A01;
    public com.facebook.ads.redexgen.core.AnonymousClass10 A02;
    public com.facebook.ads.redexgen.core.AnonymousClass11 A03;
    public com.facebook.ads.redexgen.core.C03501h A04;
    public com.facebook.ads.redexgen.core.C1199Zs A05;
    public java.lang.String A06;
    public java.lang.String A07;
    public java.lang.String A08;
    public boolean A09;
    public final java.lang.String A0A = java.util.UUID.randomUUID().toString();

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{-37, -7, 6, -65, 12, -72, 11, 12, -7, 10, 12, -72, -39, 13, -4, 1, -3, 6, -5, -3, -26, -3, 12, 15, 7, 10, 3, -39, -5, 12, 1, 14, 1, 12, 17, -58, -72, -27, -7, 3, -3, -72, 11, 13, 10, -3, -72, 12, 0, -7, 12, -72, 1, 12, -65, 11, -72, 1, 6, -72, 17, 7, 13, 10, -72, -39, 6, -4, 10, 7, 1, -4, -27, -7, 6, 1, -2, -3, 11, 12, -58, 16, 5, 4, -72, -2, 1, 4, -3, -58, -16, -20, -21, 31, 14, 19, 15, 24, 13, 15, -8, 15, 30, 33, 25, 28, 21, -55, -48, -35, -50, -48, -46, -29, -40, -27, -40, -29, -24, -1, -9, -10, -5, -13, 6, -5, 1, 0, -42, -13, 6, -13, 16, 12, 1, 3, 5, 13, 5, 14, 20, -23, 4, -55, -53, -66, -67, -66, -65, -62, -57, -66, -67, -88, -53, -62, -66, -57, -51, -70, -51, -62, -56, -57, -92, -66, -46, -7, -20, -8, -4, -20, -6, -5, -37, -16, -12, -20, -6, -13, -18, -10, -6, -22, -50, -23, 34, 21, 17, 35, 0, 37, 28, 17, 12, -2, 3, -7, 4, 12};
    }

    static {
        A05();
    }

    private int A00() {
        android.view.WindowManager windowManager = (android.view.WindowManager) this.A05.getSystemService(A03(org.objectweb.asm.Opcodes.MONITORENTER, 6, 65));
        int rotation = windowManager.getDefaultDisplay().getRotation();
        com.facebook.ads.redexgen.core.OC ocA02 = A02();
        if (ocA02 == com.facebook.ads.redexgen.core.OC.A05) {
            java.lang.String[] strArr = A0C;
            java.lang.String str = strArr[4];
            java.lang.String str2 = strArr[7];
            int rotation2 = str.length();
            if (rotation2 != str2.length()) {
                java.lang.String[] strArr2 = A0C;
                strArr2[6] = "b7o";
                strArr2[3] = "Q7inAkPu5HYVeU";
                return -1;
            }
        } else if (ocA02 == com.facebook.ads.redexgen.core.OC.A03) {
            switch (rotation) {
                case 2:
                case 3:
                    int rotation3 = A0C[1].length();
                    if (rotation3 != 29) {
                        java.lang.String[] strArr3 = A0C;
                        strArr3[6] = "bcp";
                        strArr3[3] = "BEZRNTMscmchpM";
                        return 8;
                    }
                    break;
                default:
                    return 0;
            }
        } else {
            switch (rotation) {
                case 2:
                    return 9;
                default:
                    java.lang.String[] strArr4 = A0C;
                    java.lang.String str3 = strArr4[4];
                    java.lang.String str4 = strArr4[7];
                    int rotation4 = str3.length();
                    if (rotation4 == str4.length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr5 = A0C;
                    strArr5[0] = "VdY7";
                    strArr5[2] = "KFhl";
                    return 1;
            }
        }
        throw new java.lang.RuntimeException();
    }

    private final com.facebook.ads.redexgen.core.KG A01() {
        return this.A04.A0E();
    }

    private com.facebook.ads.redexgen.core.OC A02() {
        return this.A04.A0F();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(android.content.Intent intent) {
        this.A04.A0I(intent, this.A01, com.facebook.ads.redexgen.core.C0953Qc.A03(this.A01, this.A0A, this.A06));
    }

    private final void A07(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AnonymousClass10 anonymousClass10, com.facebook.ads.redexgen.core.C03631u c03631u, java.util.EnumSet<com.facebook.ads.CacheFlag> cacheFlags, java.lang.String str) {
        com.facebook.ads.redexgen.core.C03501h c03501h = new com.facebook.ads.redexgen.core.C03501h(c1199Zs, c03631u, this, str);
        com.facebook.ads.redexgen.core.C1E c1eA0D = c03501h.A0D();
        if (com.facebook.ads.redexgen.core.C0762Im.A0s(c1199Zs) && (c1eA0D instanceof com.facebook.ads.redexgen.core.AbstractC1341cD) && com.facebook.ads.redexgen.core.AbstractC03290l.A06(this.A05, com.facebook.ads.redexgen.core.AbstractC03290l.A01(c1199Zs, c03631u.A03(), ((com.facebook.ads.redexgen.core.AbstractC1341cD) c1eA0D).A1U()), c1199Zs.A09())) {
            this.A05.A0E().A4g();
            this.A02.ACG(this, com.facebook.ads.AdError.NO_FILL);
        } else {
            this.A04 = c03501h;
            A08(c03501h.A0E());
            c03501h.A0J(c1199Zs, cacheFlags);
        }
    }

    private void A08(com.facebook.ads.redexgen.core.KG kg) {
        if (kg.equals(com.facebook.ads.redexgen.core.KG.A04)) {
            this.A05.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A05);
            return;
        }
        if (kg.equals(com.facebook.ads.redexgen.core.KG.A0A)) {
            this.A05.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A04);
            return;
        }
        if (kg.equals(com.facebook.ads.redexgen.core.KG.A0B)) {
            this.A05.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A0B);
            return;
        }
        if (kg.equals(com.facebook.ads.redexgen.core.KG.A0D)) {
            this.A05.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A0D);
            return;
        }
        if (kg.equals(com.facebook.ads.redexgen.core.KG.A0C)) {
            this.A05.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A0C);
            return;
        }
        if (!kg.equals(com.facebook.ads.redexgen.core.KG.A06)) {
            return;
        }
        if (this.A04.A0K()) {
            this.A05.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A08);
            return;
        }
        if ((A09() instanceof com.facebook.ads.redexgen.core.AbstractC1341cD) && this.A04.A0L((com.facebook.ads.redexgen.core.AbstractC1341cD) A09())) {
            com.facebook.ads.redexgen.core.C0S c0sA0E = this.A05.A0E();
            if (A0C[1].length() == 29) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0C;
            strArr[6] = "5zP";
            strArr[3] = "kcwn0HZtMTZNOx";
            c0sA0E.AGg(com.facebook.ads.redexgen.core.EnumC03220e.A0A);
            return;
        }
        this.A05.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A09);
    }

    public final com.facebook.ads.redexgen.core.C1E A09() {
        return this.A04.A0D();
    }

    public final void A0A(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AnonymousClass10 anonymousClass10, com.facebook.ads.redexgen.core.C03631u c03631u, java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet, java.lang.String str, java.lang.String str2, com.facebook.ads.RewardData rewardData) {
        this.A05 = c1199Zs;
        this.A02 = anonymousClass10;
        this.A08 = c03631u.A02();
        this.A06 = this.A08 != null ? this.A08.split(A03(107, 1, 22))[0] : A03(0, 0, 85);
        this.A00 = c03631u.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c1199Zs, anonymousClass10, c03631u, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            if (this.A02 != null) {
                this.A02.ACG(this, com.facebook.ads.AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        com.facebook.ads.internal.util.activity.AdActivityIntent adActivityIntentA04 = com.facebook.ads.redexgen.core.C0813Kq.A04(this.A05);
        adActivityIntentA04.putExtra(A03(org.objectweb.asm.Opcodes.D2L, 24, 5), A00());
        adActivityIntentA04.putExtra(A03(org.objectweb.asm.Opcodes.GETSTATIC, 8, 49), this.A0A);
        adActivityIntentA04.putExtra(A03(org.objectweb.asm.Opcodes.IINC, 11, 76), this.A08);
        adActivityIntentA04.putExtra(A03(org.objectweb.asm.Opcodes.GOTO, 11, 51), this.A00);
        com.facebook.ads.redexgen.core.KG kgA01 = A01();
        A08(kgA01);
        adActivityIntentA04.putExtra(A03(org.objectweb.asm.Opcodes.INVOKEDYNAMIC, 8, 88), kgA01);
        if (this.A07 != null) {
            adActivityIntentA04.putExtra(A03(119, 13, 62), this.A07);
        }
        A06(adActivityIntentA04);
        if (!com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            java.lang.String[] strArr = A0C;
            if (strArr[4].length() == strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[0] = "Sc68";
            strArr2[2] = "wieN";
            adActivityIntentA04.addFlags(268435456);
        }
        try {
            com.facebook.ads.internal.util.activity.ActivityUtils.A03(this.A05);
            if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
                if (!com.facebook.ads.redexgen.core.C0813Kq.A0J(this.A05, adActivityIntentA04)) {
                    this.A05.A0E().AFT();
                    if (this.A02 != null) {
                        this.A02.ACG(this, com.facebook.ads.AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            com.facebook.ads.redexgen.core.C0813Kq.A0A(this.A05, adActivityIntentA04);
            return true;
        } catch (com.facebook.ads.redexgen.core.C0811Ko e) {
            java.lang.Throwable cause = e.getCause();
            com.facebook.ads.redexgen.core.C0811Ko cause2 = e;
            if (cause != null) {
                cause2 = e.getCause();
            }
            this.A05.A07().AA0(A03(108, 11, 27), com.facebook.ads.redexgen.core.C8E.A0D, new com.facebook.ads.redexgen.core.C8F(cause2));
            android.util.Log.e(A03(90, 17, 86), A03(0, 90, 68), cause2);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final java.lang.String A6r() {
        return this.A04.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final com.facebook.ads.internal.protocol.AdPlacementType A82() {
        return com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03491g
    public final void AB4(com.facebook.ads.AdError adError) {
        if (this.A02 != null) {
            this.A02.ACG(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03491g
    public final void AB5() {
        A04();
        this.A02.ACF(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03491g
    public final void AEv() {
        this.A03 = new com.facebook.ads.redexgen.core.AnonymousClass11(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final boolean AH5() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03491g
    public final void AHE() {
        if (this.A03 != null) {
            com.facebook.ads.redexgen.core.AnonymousClass11 anonymousClass11 = this.A03;
            java.lang.String[] strArr = A0C;
            if (strArr[0].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[0] = "DiF0";
            strArr2[2] = "lQT3";
            anonymousClass11.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A0H();
        }
    }
}
