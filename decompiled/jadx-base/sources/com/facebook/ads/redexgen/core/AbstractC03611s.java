package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03611s {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    public static void A02(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.C0687Fk c0687Fk) {
        c04766f.A0c(new com.facebook.ads.redexgen.core.C04746d(c0687Fk.A1S().A01(), com.facebook.ads.redexgen.core.QJ.A04, com.facebook.ads.redexgen.core.QJ.A04, c0687Fk.A0l(), A00(17, 14, 113)));
        boolean zA19 = c0687Fk.A19();
        if (zA19) {
            com.facebook.ads.redexgen.core.C04726b c04726b = new com.facebook.ads.redexgen.core.C04726b(c0687Fk.A0Z(), c0687Fk.A0l(), A00(17, 14, 113));
            c04726b.A04 = true;
            c04726b.A03 = A00(0, 5, 66);
            c04766f.A0X(c04726b);
        }
        boolean isDSL = com.facebook.ads.redexgen.core.RS.A03();
        boolean zA2n = com.facebook.ads.redexgen.core.C0762Im.A2n(c1199Zs, isDSL);
        com.facebook.ads.redexgen.core.C04726b c04726b2 = new com.facebook.ads.redexgen.core.C04726b(c0687Fk.A1P().A0E().A08(), c0687Fk.A0l(), A00(17, 14, 113), c0687Fk.A1P().A0E().A05());
        if (zA19 && !zA2n) {
            c04766f.A0X(c04726b2);
        } else {
            c04766f.A0a(c04726b2);
        }
        c04766f.A0c(new com.facebook.ads.redexgen.core.C04746d(c0687Fk.A1P().A0E().A07(), com.facebook.ads.redexgen.core.AbstractC03561n.A00(c0687Fk.A1P().A0E()), com.facebook.ads.redexgen.core.AbstractC03561n.A01(c0687Fk.A1P().A0E()), c0687Fk.A0l(), A00(17, 14, 113)));
        java.util.Iterator<java.lang.String> it = c0687Fk.A1P().A0H().A01().iterator();
        while (isDSL) {
            java.lang.String url = it.next();
            c04766f.A0c(new com.facebook.ads.redexgen.core.C04746d(url, -1, -1, c0687Fk.A0l(), A00(17, 14, 113)));
        }
    }

    public static void A03(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C04766f c04766f, com.facebook.ads.redexgen.core.C0687Fk c0687Fk) {
        int i = 0;
        for (com.facebook.ads.redexgen.core.C1F c1f : c0687Fk.A1W()) {
            com.facebook.ads.redexgen.core.C04746d c04746d = new com.facebook.ads.redexgen.core.C04746d(c1f.A0E().A07(), com.facebook.ads.redexgen.core.AbstractC03561n.A00(c1f.A0E()), com.facebook.ads.redexgen.core.AbstractC03561n.A01(c1f.A0E()), c0687Fk.A0l(), A00(5, 12, 118));
            if (i == 0) {
                c04766f.A0b(c04746d);
            } else {
                c04766f.A0c(c04746d);
            }
            java.util.Iterator<java.lang.String> it = c1f.A0H().A01().iterator();
            while (it.hasNext()) {
                c04766f.A0c(new com.facebook.ads.redexgen.core.C04746d(it.next(), -1, -1, c0687Fk.A0l(), A00(5, 12, 118)));
            }
            if (!android.text.TextUtils.isEmpty(c1f.A0E().A08())) {
                new com.facebook.ads.redexgen.core.C04726b(c1f.A0E().A08(), c0687Fk.A0l(), A00(5, 12, 118), c1f.A0E().A05()).A04 = false;
            }
            i++;
        }
    }
}
