package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03501h {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public com.facebook.ads.redexgen.core.C04766f A00;
    public com.facebook.ads.redexgen.core.OC A01 = com.facebook.ads.redexgen.core.OC.A05;
    public java.util.ArrayList<com.facebook.ads.redexgen.core.C0926Pb> A02 = new java.util.ArrayList<>();
    public final com.facebook.ads.redexgen.core.C1E A03;
    public final com.facebook.ads.redexgen.core.InterfaceC03491g A04;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, okio.Utf8.REPLACEMENT_BYTE, 68, 74, 59, 72, 73, 74, okio.Utf8.REPLACEMENT_BYTE, 74, okio.Utf8.REPLACEMENT_BYTE, 55, 66};
    }

    static {
        A06();
    }

    public C03501h(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C03631u c03631u, com.facebook.ads.redexgen.core.InterfaceC03491g interfaceC03491g, java.lang.String str) {
        org.json.JSONObject dataObject = c03631u.A03();
        this.A03 = A01(c1199Zs, c03631u, str, dataObject);
        this.A04 = interfaceC03491g;
    }

    private com.facebook.ads.AdError A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        if (abstractC1341cD == null || abstractC1341cD.A1W().isEmpty()) {
            c1199Zs.A07().AA0(A04(62, 3, 33), com.facebook.ads.redexgen.core.C8E.A0Z, new com.facebook.ads.redexgen.core.C8F(A04(5, 43, 20)));
            return com.facebook.ads.AdError.internalError(2006);
        }
        return null;
    }

    public static com.facebook.ads.redexgen.core.C1E A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C03631u c03631u, java.lang.String str, org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.C1E c1eA02 = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                c1eA02 = com.facebook.ads.redexgen.core.C1339cB.A03(jSONObject, c1199Zs, true);
                c1eA02.A0x(true);
                c1eA02.A0u(A04(96, 12, 117));
            } catch (org.json.JSONException unused) {
            }
        }
        if (c1eA02 == null) {
            c1eA02 = com.facebook.ads.redexgen.core.C0689Fm.A02(jSONObject, c1199Zs);
        }
        c1eA02.A0t(str);
        com.facebook.ads.redexgen.core.C8X c8xA01 = c03631u.A01();
        if (c8xA01 != null) {
            c1eA02.A0p(c8xA01.A06());
        }
        return c1eA02;
    }

    private com.facebook.ads.redexgen.core.C04766f A03(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        return this.A00 != null ? this.A00 : new com.facebook.ads.redexgen.core.C04766f(c1199Zs);
    }

    public static /* synthetic */ java.util.ArrayList A05(com.facebook.ads.redexgen.core.C03501h c03501h) {
        return c03501h.A02;
    }

    private void A08(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C0689Fm c0689Fm) {
        com.facebook.ads.redexgen.core.C03441b playableData = c0689Fm.A1P().A0E().A06();
        A0B(playableData != null ? playableData.A0B() : com.facebook.ads.redexgen.core.OC.A05);
        com.facebook.ads.redexgen.core.C1330c2 c1330c2 = new com.facebook.ads.redexgen.core.C1330c2(this);
        com.facebook.ads.redexgen.core.C04766f c04766f = new com.facebook.ads.redexgen.core.C04766f(c1199Zs);
        boolean z = com.facebook.ads.redexgen.core.C0762Im.A26(c1199Zs) && com.facebook.ads.redexgen.core.AnonymousClass65.A0A(c0689Fm.A0o());
        if (z) {
            com.facebook.ads.redexgen.core.AnonymousClass65 unifiedAssetsLoader = new com.facebook.ads.redexgen.core.AnonymousClass65(c04766f, c0689Fm.A0o(), c0689Fm.A0c(), c0689Fm.A0l(), z, new com.facebook.ads.redexgen.core.C1329c1(this));
            c04766f.A0d(new com.facebook.ads.redexgen.core.JF(c0689Fm.A1U(), c1199Zs.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC03601r.A02(c1199Zs, c0689Fm, true, c1330c2);
    }

    private void A09(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, int i, com.facebook.ads.redexgen.core.InterfaceC03491g interfaceC03491g) {
        boolean zA19 = abstractC1341cD.A19();
        com.facebook.ads.redexgen.core.C04766f c04766fA03 = A03(c1199Zs);
        c04766fA03.A0d(new com.facebook.ads.redexgen.core.JF(abstractC1341cD.A1U(), c1199Zs.A09()));
        boolean z = com.facebook.ads.redexgen.core.C0762Im.A26(c1199Zs) && com.facebook.ads.redexgen.core.AnonymousClass65.A0A(abstractC1341cD.A0o());
        if (z) {
            new com.facebook.ads.redexgen.core.AnonymousClass65(c04766fA03, abstractC1341cD.A0o(), abstractC1341cD.A0c(), abstractC1341cD.A0l(), z, new com.facebook.ads.redexgen.core.C1333c5(this, c1199Zs, zA19, abstractC1341cD, interfaceC03491g)).A0B();
            return;
        }
        java.lang.String strA04 = A04(96, 12, 117);
        if (zA19) {
            com.facebook.ads.redexgen.core.C04726b c04726b = new com.facebook.ads.redexgen.core.C04726b(abstractC1341cD.A0Z(), abstractC1341cD.A0l(), strA04);
            c04726b.A04 = true;
            c04726b.A03 = A04(0, 5, 78);
            c04766fA03.A0X(c04726b);
        }
        c04766fA03.A0c(new com.facebook.ads.redexgen.core.C04746d(abstractC1341cD.A1S().A01(), com.facebook.ads.redexgen.core.QJ.A04, com.facebook.ads.redexgen.core.QJ.A04, abstractC1341cD.A0l(), A04(96, 12, 117)));
        boolean zContains = enumSet.contains(com.facebook.ads.CacheFlag.VIDEO);
        int i2 = 0;
        boolean zA2n = com.facebook.ads.redexgen.core.C0762Im.A2n(c1199Zs, com.facebook.ads.redexgen.core.RS.A03());
        for (com.facebook.ads.redexgen.core.C1F adInfo : abstractC1341cD.A1W()) {
            com.facebook.ads.redexgen.core.C04746d c04746d = new com.facebook.ads.redexgen.core.C04746d(adInfo.A0E().A07(), com.facebook.ads.redexgen.core.AbstractC03561n.A00(adInfo.A0E()), com.facebook.ads.redexgen.core.AbstractC03561n.A01(adInfo.A0E()), abstractC1341cD.A0l(), A04(96, 12, 117));
            if (i2 == 0) {
                c04766fA03.A0b(c04746d);
            } else {
                c04766fA03.A0c(c04746d);
            }
            java.util.Iterator<java.lang.String> it = adInfo.A0H().A01().iterator();
            while (it.hasNext()) {
                c04766fA03.A0c(new com.facebook.ads.redexgen.core.C04746d(it.next(), -1, -1, abstractC1341cD.A0l(), A04(96, 12, 117)));
            }
            if (zContains && !android.text.TextUtils.isEmpty(adInfo.A0E().A08())) {
                com.facebook.ads.redexgen.core.C04726b c04726b2 = new com.facebook.ads.redexgen.core.C04726b(adInfo.A0E().A08(), abstractC1341cD.A0l(), A04(96, 12, 117), adInfo.A0E().A05());
                c04726b2.A04 = false;
                if (i2 == 0) {
                    if (zA19 && !zA2n) {
                        c04766fA03.A0X(c04726b2);
                    } else {
                        c04766fA03.A0a(c04726b2);
                    }
                } else if (zA19 && !zA2n) {
                    c04766fA03.A0Y(c04726b2);
                } else {
                    c04766fA03.A0Z(c04726b2);
                }
            }
            i2++;
        }
        c04766fA03.A0W(new com.facebook.ads.redexgen.core.C1331c3(this, c1199Zs, zA19, abstractC1341cD, interfaceC03491g), new com.facebook.ads.redexgen.core.C6Y(abstractC1341cD.A0l(), strA04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet, com.facebook.ads.redexgen.core.C1339cB c1339cB, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, int i, com.facebook.ads.redexgen.core.InterfaceC03491g interfaceC03491g) {
        A09(c1199Zs, enumSet, abstractC1341cD, i, new com.facebook.ads.redexgen.core.C1335c7(this, c1199Zs, abstractC1341cD, c1339cB, i, interfaceC03491g, enumSet));
    }

    private void A0B(com.facebook.ads.redexgen.core.OC oc) {
        this.A01 = oc;
    }

    private boolean A0C(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        com.facebook.ads.AdError adErrorA00 = A00(c1199Zs, abstractC1341cD);
        if (adErrorA00 != null) {
            this.A04.AB4(adErrorA00);
            return true;
        }
        return false;
    }

    public final com.facebook.ads.redexgen.core.C1E A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        return com.facebook.ads.redexgen.core.KG.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        return com.facebook.ads.redexgen.core.KG.A0B;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facebook.ads.redexgen.core.KG A0E() {
        if (this.A03.A15()) {
            return com.facebook.ads.redexgen.core.KG.A04;
        }
        com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD = (com.facebook.ads.redexgen.core.AbstractC1341cD) this.A03;
        if (abstractC1341cD.A19()) {
            return com.facebook.ads.redexgen.core.KG.A06;
        }
        if (abstractC1341cD.A1W().size() > 1) {
            return com.facebook.ads.redexgen.core.KG.A0A;
        }
        com.facebook.ads.redexgen.core.C03441b c03441bA06 = abstractC1341cD.A1P().A0E().A06();
        if (A06[4].length() == 14) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A06;
        strArr[1] = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM";
        strArr[3] = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx";
        if (c03441bA06 != null) {
            return com.facebook.ads.redexgen.core.KG.A0C;
        }
        boolean zA0L = A0L(abstractC1341cD);
        if (A06[0].length() != 2) {
            java.lang.String[] strArr2 = A06;
            strArr2[1] = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ";
            strArr2[3] = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0";
        }
    }

    public final com.facebook.ads.redexgen.core.OC A0F() {
        return this.A01;
    }

    public final java.lang.String A0G() {
        if (this.A03.A15()) {
            return ((com.facebook.ads.redexgen.core.C1339cB) this.A03).A1Q();
        }
        return ((com.facebook.ads.redexgen.core.AbstractC1341cD) this.A03).A1U();
    }

    public final void A0H() {
        this.A04.AHE();
    }

    public final void A0I(android.content.Intent intent, com.facebook.ads.RewardData rewardData, java.lang.String str) {
        this.A03.A0r(rewardData);
        this.A03.A0v(str);
        if (A0D().A15()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet) {
        if (A0E() == com.facebook.ads.redexgen.core.KG.A04) {
            com.facebook.ads.redexgen.core.C1339cB c1339cB = (com.facebook.ads.redexgen.core.C1339cB) this.A03;
            com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cDA1M = c1339cB.A1M();
            if (A0C(c1199Zs, abstractC1341cDA1M) || abstractC1341cDA1M == null) {
                return;
            }
            this.A04.AEv();
            A0A(c1199Zs, enumSet, c1339cB, abstractC1341cDA1M, 0, this.A04);
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD = (com.facebook.ads.redexgen.core.AbstractC1341cD) this.A03;
        if (A06[5].length() == 0) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1199Zs, abstractC1341cD)) {
            return;
        }
        this.A04.AEv();
        if (A0E() == com.facebook.ads.redexgen.core.KG.A0C) {
            com.facebook.ads.redexgen.core.C0689Fm c0689Fm = (com.facebook.ads.redexgen.core.C0689Fm) this.A03;
            java.lang.String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1199Zs, c0689Fm);
                return;
            } else {
                A08(c1199Zs, c0689Fm);
                return;
            }
        }
        A09(c1199Zs, enumSet, (com.facebook.ads.redexgen.core.C0689Fm) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A11();
    }

    public final boolean A0L(com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD) {
        return !android.text.TextUtils.isEmpty(abstractC1341cD.A1P().A0E().A08());
    }
}
