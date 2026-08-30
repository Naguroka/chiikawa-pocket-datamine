package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0692Fq extends com.facebook.ads.redexgen.core.AbstractC1345cH {
    public static com.facebook.ads.redexgen.core.C04766f A0D;
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"g9SdUg6XNSnvVCS02jX19aczyGq48qDV", "lGSQ9LsgX83H3UqklEPZgAjaPEKabNT0", "y0oXMo4BXc2on8MNFvJxgBv", "Ulfd9L14l0ScyK0QB689zsPu0EZ5wfqr", "W3xKKEfUMxBXJmvfztSkCM8j4ls7Vw3H", "lNYBpqeQZYlfeCveDiVEAZh", "rx8", "elj"};
    public long A00;
    public com.facebook.ads.redexgen.core.AnonymousClass17 A01;
    public com.facebook.ads.redexgen.core.AnonymousClass18 A02;
    public com.facebook.ads.redexgen.core.C1E A03;
    public com.facebook.ads.redexgen.core.C1199Zs A04;
    public com.facebook.ads.redexgen.core.KG A05;
    public com.facebook.ads.redexgen.core.C0926Pb A06;
    public java.lang.String A07;
    public java.lang.String A08;
    public java.lang.String A09;
    public java.lang.String A0A;
    public final java.lang.String A0B = java.util.UUID.randomUUID().toString();
    public final java.util.concurrent.atomic.AtomicBoolean A0C = new java.util.concurrent.atomic.AtomicBoolean();

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 51);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{-98, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, 1, -2, 3, -16, 3, -8, -2, -3, -58, -45, -60, -58, -56, -39, -50, -37, -50, -39, -34, 1, 6, -1, 7, 12, 3, 2, -33, 2, -30, -1, 18, -1, -32, 19, 12, 2, 10, 3, 29, 21, 20, 25, 17, 36, 25, 31, 30, -12, 17, 36, 17, 16, 12, 1, 3, 5, 13, 5, 14, 20, -23, 4, -68, -66, -79, -80, -79, -78, -75, -70, -79, -80, -101, -66, -75, -79, -70, -64, -83, -64, -75, -69, -70, -105, -79, -59, -17, -30, -18, -14, -30, -16, -15, -47, -26, -22, -30, -2, -15, 3, -19, -2, -16, -33, -15, -2, 2, -15, -2, -31, -34, -40, -13, -26, -8, -30, -13, -27, -26, -27, -41, -22, -27, -26, -16, -62, -27, -59, -30, -11, -30, -61, -10, -17, -27, -19, -26, 28, 15, 33, 11, 28, 14, 15, 14, 9, 32, 19, 14, 15, 25, -61, -68, -73, -65, -61, -77, -105, -78, -4, -17, -21, -3, -38, -1, -10, -21};
    }

    static {
        A08();
    }

    private void A06() {
        com.facebook.ads.redexgen.core.C03832o.A00(this.A04).A06(this.A02, this.A02.A00());
    }

    private void A07() {
        if (this.A02 != null) {
            try {
                com.facebook.ads.redexgen.core.C03832o.A00(this.A04).A05(this.A02);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private void A09(android.content.Intent intent) {
        int i = super.A00;
        java.lang.String strA04 = A04(77, 24, 25);
        if (i != -1 && android.provider.Settings.System.getInt(this.A04.getContentResolver(), A04(1, 22, 92), 0) != 1) {
            int i2 = super.A00;
            java.lang.String[] strArr = A0F;
            if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0F;
            strArr2[5] = "RWC7frN5DjKRH0uo4BJmLzj";
            strArr2[2] = "FPcb0UYEDF6wwONX6Ty9E2F";
            intent.putExtra(strA04, i2);
            return;
        }
        com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A04;
        java.lang.String[] strArr3 = A0F;
        if (strArr3[7].length() == strArr3[6].length()) {
            java.lang.String[] strArr4 = A0F;
            strArr4[5] = "O4w3do1khQsKhsE3USwlJ7C";
            strArr4[2] = "rALKIAVwphrvKmHx0hqaLzY";
            if (com.facebook.ads.redexgen.core.C0762Im.A0f(c1199Zs)) {
                return;
            }
        } else if (com.facebook.ads.redexgen.core.C0762Im.A0f(c1199Zs)) {
            return;
        }
        intent.putExtra(strA04, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1339cB c1339cB, int i) {
        if (i >= c1339cB.A1K()) {
            return;
        }
        com.facebook.ads.redexgen.core.C0687Fk c0687Fk = (com.facebook.ads.redexgen.core.C0687Fk) c1339cB.A1N(i);
        A0D = new com.facebook.ads.redexgen.core.C04766f(c1199Zs);
        A0D.A0d(new com.facebook.ads.redexgen.core.JF(c0687Fk.A1U(), c1199Zs.A09()));
        com.facebook.ads.redexgen.core.AbstractC03611s.A02(c1199Zs, A0D, c0687Fk);
        A0D.A0W(new com.facebook.ads.redexgen.core.Fr(this, i == 0, c1199Zs, c0687Fk, c1339cB, i), new com.facebook.ads.redexgen.core.C6Y(c0687Fk.A0l(), A04(org.objectweb.asm.Opcodes.DCMPG, 14, 119), i));
    }

    private void A0C(boolean z) {
        if (this.A05 == com.facebook.ads.redexgen.core.KG.A0F) {
            A0E(z);
            return;
        }
        if (this.A05 == com.facebook.ads.redexgen.core.KG.A0H) {
            A0F(z);
        } else if (this.A05 == com.facebook.ads.redexgen.core.KG.A0G) {
            A0D(z);
        } else {
            A0F(z);
        }
    }

    private void A0D(boolean z) {
        com.facebook.ads.redexgen.core.C04766f c04766f = new com.facebook.ads.redexgen.core.C04766f(this.A04);
        boolean z2 = com.facebook.ads.redexgen.core.C0762Im.A26(this.A04) && com.facebook.ads.redexgen.core.AnonymousClass65.A0A(this.A03.A0o());
        if (z2) {
            com.facebook.ads.redexgen.core.AnonymousClass65 unifiedAssetsLoader = new com.facebook.ads.redexgen.core.AnonymousClass65(c04766f, this.A03.A0o(), this.A03.A0c(), this.A03.A0l(), z2, new com.facebook.ads.redexgen.core.C1353cP(this));
            c04766f.A0d(new com.facebook.ads.redexgen.core.JF(((com.facebook.ads.redexgen.core.AbstractC1341cD) this.A03).A1U(), this.A04.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC03601r.A02(this.A04, (com.facebook.ads.redexgen.core.AbstractC1341cD) this.A03, z, new com.facebook.ads.redexgen.core.C1352cO(this));
    }

    private void A0E(boolean z) {
        com.facebook.ads.redexgen.core.C04766f c04766f = new com.facebook.ads.redexgen.core.C04766f(this.A04);
        c04766f.A0d(new com.facebook.ads.redexgen.core.JF(((com.facebook.ads.redexgen.core.AbstractC1341cD) this.A03).A1U(), this.A04.A09()));
        com.facebook.ads.redexgen.core.AbstractC03611s.A03(this.A04, c04766f, (com.facebook.ads.redexgen.core.C0687Fk) this.A03);
        c04766f.A0W(new com.facebook.ads.redexgen.core.C1357cT(this), new com.facebook.ads.redexgen.core.C6Y(this.A03.A0l(), A04(org.objectweb.asm.Opcodes.DCMPG, 14, 119)));
    }

    private void A0F(boolean z) {
        boolean z2 = false;
        if (this.A03.A15()) {
            com.facebook.ads.redexgen.core.C1339cB c1339cB = (com.facebook.ads.redexgen.core.C1339cB) this.A03;
            for (int i = 0; i < c1339cB.A1K(); i++) {
                if (android.text.TextUtils.isEmpty(c1339cB.A1N(i).A1P().A0E().A08())) {
                    this.A01.ADU(this, com.facebook.ads.AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0B(this.A04, c1339cB, 0);
            return;
        }
        com.facebook.ads.redexgen.core.C04766f c04766f = new com.facebook.ads.redexgen.core.C04766f(this.A04);
        c04766f.A0d(new com.facebook.ads.redexgen.core.JF(((com.facebook.ads.redexgen.core.AbstractC1341cD) this.A03).A1U(), this.A04.A09()));
        if (com.facebook.ads.redexgen.core.C0762Im.A26(this.A04) && com.facebook.ads.redexgen.core.AnonymousClass65.A0A(this.A03.A0o())) {
            z2 = true;
        }
        boolean zA19 = this.A03.A19();
        if (z2) {
            com.facebook.ads.redexgen.core.AnonymousClass65 unifiedAssetsLoader = new com.facebook.ads.redexgen.core.AnonymousClass65(c04766f, this.A03.A0o(), this.A03.A0c(), this.A03.A0l(), z2, new com.facebook.ads.redexgen.core.C1355cR(this, zA19));
            unifiedAssetsLoader.A0B();
            return;
        }
        com.facebook.ads.redexgen.core.C0687Fk c0687Fk = (com.facebook.ads.redexgen.core.C0687Fk) this.A03;
        if (android.text.TextUtils.isEmpty(c0687Fk.A1P().A0E().A08())) {
            this.A01.ADU(this, com.facebook.ads.AdError.INTERNAL_ERROR);
        } else {
            com.facebook.ads.redexgen.core.AbstractC03611s.A02(this.A04, c04766f, c0687Fk);
            c04766f.A0W(new com.facebook.ads.redexgen.core.C0698Fx(this, z, zA19, c0687Fk, this), new com.facebook.ads.redexgen.core.C6Y(c0687Fk.A0l(), A04(org.objectweb.asm.Opcodes.DCMPG, 14, 119)));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1345cH
    public final int A0G() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A03.A0S();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1345cH
    public final com.facebook.ads.redexgen.core.C1E A0H() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1345cH
    public final boolean A0I() {
        com.facebook.ads.redexgen.core.C0811Ko cause;
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A0q(super.A01);
        java.lang.String strA03 = com.facebook.ads.redexgen.core.C0953Qc.A03(super.A02, this.A0B, this.A07);
        this.A03.A0r(super.A02);
        this.A03.A0v(strA03);
        com.facebook.ads.internal.util.activity.AdActivityIntent adActivityIntentA04 = com.facebook.ads.redexgen.core.C0813Kq.A04(this.A04);
        adActivityIntentA04.putExtra(A04(org.objectweb.asm.Opcodes.FRETURN, 8, 83), this.A05);
        adActivityIntentA04.putExtra(A04(127, 25, 78), this.A03);
        adActivityIntentA04.putExtra(A04(34, 19, 107), this.A03);
        adActivityIntentA04.putExtra(A04(org.objectweb.asm.Opcodes.IF_ACMPNE, 8, 27), this.A0B);
        if (strA03 != null) {
            adActivityIntentA04.putExtra(A04(112, 15, 89), strA03);
        }
        adActivityIntentA04.putExtra(A04(66, 11, 109), this.A0A);
        adActivityIntentA04.putExtra(A04(101, 11, 74), this.A00);
        if (this.A09 != null) {
            adActivityIntentA04.putExtra(A04(53, 13, 125), this.A09);
        }
        A09(adActivityIntentA04);
        if (!com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            adActivityIntentA04.setFlags(adActivityIntentA04.getFlags() | 268435456);
        }
        com.facebook.ads.internal.util.activity.ActivityUtils.A03(this.A04);
        try {
            if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
                if (!com.facebook.ads.redexgen.core.C0813Kq.A0J(this.A04, adActivityIntentA04)) {
                    this.A04.A0E().AFT();
                    if (this.A01 != null) {
                        this.A01.ADU(this, com.facebook.ads.AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            com.facebook.ads.redexgen.core.C0813Kq.A0A(this.A04, adActivityIntentA04);
            return true;
        } catch (com.facebook.ads.redexgen.core.C0811Ko e) {
            java.lang.String[] strArr = A0F;
            if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0F;
            strArr2[7] = "zr3";
            strArr2[6] = "zCM";
            if (e.getCause() != null) {
                cause = e;
                cause = e.getCause();
            }
            cause = e;
            this.A04.A07().AA0(A04(23, 11, 50), com.facebook.ads.redexgen.core.C8E.A01, new com.facebook.ads.redexgen.core.C8F(cause));
            return true;
        }
    }

    public final void A0J(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AnonymousClass17 anonymousClass17, com.facebook.ads.redexgen.core.C03631u c03631u, boolean z, java.lang.String str, java.lang.String str2) {
        java.lang.String strA04;
        this.A0C.set(false);
        this.A04 = c1199Zs;
        this.A01 = anonymousClass17;
        this.A0A = c03631u.A02();
        this.A00 = c03631u.A00();
        this.A09 = str2;
        if (this.A0A != null) {
            java.lang.String str3 = this.A0A;
            java.lang.String strA05 = A04(0, 1, 12);
            java.lang.String[] strArr = A0F;
            if (strArr[7].length() == strArr[6].length()) {
                java.lang.String[] strArr2 = A0F;
                strArr2[7] = "x5W";
                strArr2[6] = "dMK";
                strA04 = str3.split(strA05)[0];
            }
            throw new java.lang.RuntimeException();
        }
        strA04 = A04(0, 0, 100);
        this.A07 = strA04;
        this.A03 = com.facebook.ads.redexgen.core.C1E.A00(c03631u.A03(), this.A04);
        this.A03.A0t(str);
        this.A03.A0p(c03631u.A01().A06());
        if (this.A03.A15()) {
            this.A08 = ((com.facebook.ads.redexgen.core.C1339cB) this.A03).A1Q();
        } else {
            this.A08 = ((com.facebook.ads.redexgen.core.AbstractC1341cD) this.A03).A1U();
        }
        if (this.A03.A19()) {
            this.A05 = com.facebook.ads.redexgen.core.KG.A08;
            if (this.A03.A11()) {
                this.A04.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A08);
            } else {
                this.A04.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A0A);
            }
        } else {
            switch (this.A03.A0R()) {
                case 0:
                    this.A05 = com.facebook.ads.redexgen.core.KG.A0H;
                    this.A04.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A0D);
                    break;
                case 1:
                    this.A05 = com.facebook.ads.redexgen.core.KG.A0G;
                    this.A04.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A0C);
                    break;
                case 2:
                    this.A05 = com.facebook.ads.redexgen.core.KG.A05;
                    this.A04.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A05);
                    break;
                case 3:
                    this.A05 = com.facebook.ads.redexgen.core.KG.A0F;
                    this.A04.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A04);
                    break;
                case 4:
                    this.A05 = com.facebook.ads.redexgen.core.KG.A0I;
                    this.A04.A0E().AGg(com.facebook.ads.redexgen.core.EnumC03220e.A0E);
                    break;
            }
        }
        if (com.facebook.ads.redexgen.core.C0762Im.A0s(c1199Zs)) {
            com.facebook.ads.redexgen.core.C1E c1e = this.A03;
            java.lang.String[] strArr3 = A0F;
            if (strArr3[4].charAt(19) != strArr3[0].charAt(19)) {
                java.lang.String[] strArr4 = A0F;
                strArr4[4] = "c2SjyVfNFMTSQhwflPzyjFy3Fjr2snH4";
                strArr4[0] = "k4vT1WhZbJ1Mlr1eks5fTJscMmdnfo8D";
                if (c1e.A15()) {
                    com.facebook.ads.redexgen.core.C1339cB c1339cB = (com.facebook.ads.redexgen.core.C1339cB) this.A03;
                    for (int iA1K = c1339cB.A1K() - 1; iA1K >= 0; iA1K--) {
                        com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cDA1N = c1339cB.A1N(iA1K);
                        if (com.facebook.ads.redexgen.core.AbstractC03290l.A06(this.A04, com.facebook.ads.redexgen.core.AbstractC03290l.A01(c1199Zs, abstractC1341cDA1N.A0o(), abstractC1341cDA1N.A1U()), c1199Zs.A09())) {
                            this.A04.A0E().A4g();
                            c1339cB.A1S(iA1K);
                            return;
                        }
                    }
                    if (c1339cB.A1K() == 0) {
                        this.A01.ADU(this, com.facebook.ads.AdError.NO_FILL);
                        return;
                    }
                } else if (com.facebook.ads.redexgen.core.AbstractC03290l.A06(this.A04, com.facebook.ads.redexgen.core.AbstractC03290l.A01(c1199Zs, c03631u.A03(), ((com.facebook.ads.redexgen.core.AbstractC1341cD) this.A03).A1U()), c1199Zs.A09())) {
                    this.A04.A0E().A4g();
                    this.A01.ADU(this, com.facebook.ads.AdError.NO_FILL);
                    return;
                }
            }
            throw new java.lang.RuntimeException();
        }
        this.A02 = new com.facebook.ads.redexgen.core.AnonymousClass18(this.A0B, this, anonymousClass17);
        A06();
        A0C(z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final java.lang.String A6r() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final boolean AH5() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final void onDestroy() {
        A07();
    }
}
