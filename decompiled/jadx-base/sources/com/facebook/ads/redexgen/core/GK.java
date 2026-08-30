package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GK implements com.facebook.ads.redexgen.core.InterfaceC1369cf {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public com.facebook.ads.redexgen.core.InterfaceC03400x A01;
    public com.facebook.ads.redexgen.core.C03410y A02;
    public com.facebook.ads.redexgen.core.C1348cK A03;
    public com.facebook.ads.redexgen.core.C1346cI A04;
    public com.facebook.ads.redexgen.core.C0669Ei A05;
    public com.facebook.ads.redexgen.core.InterfaceC0858Ml A06;
    public com.facebook.ads.redexgen.core.C0859Mm A07;
    public final java.lang.String A08 = java.util.UUID.randomUUID().toString();
    public long A00 = -1;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 16);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(com.facebook.ads.redexgen.core.C0669Ei c0669Ei, com.facebook.ads.redexgen.core.C1346cI c1346cI, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.InterfaceC03400x interfaceC03400x, com.facebook.ads.redexgen.core.C0859Mm c0859Mm) {
        java.lang.String strA6r = c1346cI.A6r();
        if (!android.text.TextUtils.isEmpty(strA6r)) {
            c04766f.A0d(new com.facebook.ads.redexgen.core.JF(strA6r, c0669Ei.A09()));
        }
        com.facebook.ads.redexgen.core.JU juA0F = c1346cI.A0F();
        java.lang.String[] strArr = A0A;
        java.lang.String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (juA0F != null) {
            com.facebook.ads.redexgen.core.C04746d c04746d = new com.facebook.ads.redexgen.core.C04746d(c1346cI.A0F().getUrl(), c1346cI.A0F().getHeight(), c1346cI.A0F().getWidth(), c1346cI.A0Y(), A03(2, 16, 120));
            c04746d.A00 = new com.facebook.ads.redexgen.core.C6l(false, -1, -1);
            c04766f.A0V();
            c04766f.A0b(c04746d);
        }
        if (c1346cI.A0E() != null) {
            c04766f.A0b(new com.facebook.ads.redexgen.core.C04746d(c1346cI.A0E().getUrl(), c1346cI.A0E().getHeight(), c1346cI.A0E().getWidth(), c1346cI.A0Y(), A03(2, 16, 120)));
        }
        java.lang.String strA0b = c1346cI.A0b();
        if (strA0b != null && !android.text.TextUtils.isEmpty(strA0b)) {
            c04766f.A0a(new com.facebook.ads.redexgen.core.C04726b(strA0b, c1346cI.A0Y(), A03(2, 16, 120), c1346cI.A0A()));
        }
        com.facebook.ads.redexgen.core.C1360cW c1360cW = new com.facebook.ads.redexgen.core.C1360cW(this, c0859Mm, interfaceC03400x, c0669Ei);
        java.lang.String strA0Y = c1346cI.A0Y();
        java.lang.String clientToken2 = A03(2, 16, 120);
        c04766f.A0W(c1360cW, new com.facebook.ads.redexgen.core.C6Y(strA0Y, clientToken2));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final java.lang.String A6r() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A6r();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final com.facebook.ads.internal.protocol.AdPlacementType A82() {
        return com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1369cf
    public final void A9p(com.facebook.ads.redexgen.core.C0669Ei c0669Ei, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.EnumC0781Jj enumC0781Jj, com.facebook.ads.redexgen.core.InterfaceC03400x interfaceC03400x, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C8X c8x) {
        c0669Ei.A0E().A43();
        this.A05 = c0669Ei;
        this.A01 = interfaceC03400x;
        com.facebook.ads.redexgen.core.C04766f c04766f = new com.facebook.ads.redexgen.core.C04766f(c0669Ei);
        this.A00 = java.lang.System.currentTimeMillis();
        com.facebook.ads.redexgen.core.C1346cI c1346cIA00 = com.facebook.ads.redexgen.core.AnonymousClass16.A00(c0669Ei, jSONObject, com.facebook.ads.redexgen.core.LV.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = c1346cIA00;
        if (!com.facebook.ads.redexgen.core.AbstractC03290l.A06(c0669Ei, c1346cIA00, j7)) {
            com.facebook.ads.redexgen.core.InterfaceC0858Ml adViewListener = new com.facebook.ads.redexgen.core.C1362cY(this, c0669Ei);
            this.A06 = adViewListener;
            com.facebook.ads.redexgen.core.C0859Mm c0859Mm = new com.facebook.ads.redexgen.core.C0859Mm(c0669Ei, j7, c04766f, new java.lang.ref.WeakReference(adViewListener), c8x.A04(), c8x.A07(), c8x.A08(), c8x.A09(), c1346cIA00, this.A08);
            this.A07 = c0859Mm;
            this.A03 = new com.facebook.ads.redexgen.core.C1348cK(c0669Ei, new com.facebook.ads.redexgen.core.C1361cX(this, c0669Ei, interfaceC03400x), c0859Mm.getViewabilityChecker(), j7, c1346cIA00);
            A05(c0669Ei, c1346cIA00, c04766f, interfaceC03400x, c0859Mm);
            this.A02 = new com.facebook.ads.redexgen.core.C03410y(c0669Ei, this.A08, this, interfaceC03400x);
            this.A02.A02();
            return;
        }
        c0669Ei.A0E().A4g();
        interfaceC03400x.ACN(this, com.facebook.ads.redexgen.core.C0779Jg.A00(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final boolean AH5() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03320p
    public final void onDestroy() {
        if (this.A05 != null) {
            com.facebook.ads.redexgen.core.InterfaceC1383ct interfaceC1383ctA0E = this.A05.A0E();
            java.lang.String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new java.lang.RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            interfaceC1383ctA0E.A41(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        com.facebook.ads.redexgen.core.C03410y c03410y = this.A02;
        if (A0A[0].length() == 16) {
            throw new java.lang.RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (c03410y != null) {
            this.A02.A03();
        }
    }
}
