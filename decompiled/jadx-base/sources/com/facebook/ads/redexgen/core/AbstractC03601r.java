package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03601r {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 115);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73};
    }

    public static void A02(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cD, boolean z, com.facebook.ads.redexgen.core.InterfaceC03581p interfaceC03581p) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A23(c1199Zs)) {
            com.facebook.ads.redexgen.core.C04766f c04766f = new com.facebook.ads.redexgen.core.C04766f(c1199Zs);
            com.facebook.ads.redexgen.core.C03441b c03441bA06 = abstractC1341cD.A1P().A0E().A06();
            c04766f.A0d(new com.facebook.ads.redexgen.core.JF(abstractC1341cD.A1U(), c1199Zs.A09()));
            if (c03441bA06 == null) {
                interfaceC03581p.AD2(com.facebook.ads.AdError.CACHE_ERROR);
                return;
            }
            if (c03441bA06.A0N()) {
                interfaceC03581p.AD3();
                return;
            }
            com.facebook.ads.redexgen.core.C04726b c04726b = new com.facebook.ads.redexgen.core.C04726b(c03441bA06.A0F(), abstractC1341cD.A0l(), abstractC1341cD.A0c());
            c04726b.A04 = true;
            if (com.facebook.ads.redexgen.core.C0762Im.A1s(c1199Zs)) {
                c04726b.A03 = A00(0, 5, 86);
            }
            switch (com.facebook.ads.redexgen.core.C03571o.A00[c03441bA06.A0A().ordinal()]) {
                case 1:
                case 2:
                    c04766f.A0X(c04726b);
                    break;
            }
            c04766f.A0b(new com.facebook.ads.redexgen.core.C04746d(abstractC1341cD.A1S().A01(), -1, -1, abstractC1341cD.A0l(), abstractC1341cD.A0c()));
            c04766f.A0b(new com.facebook.ads.redexgen.core.C04746d(c03441bA06.A0E(), -1, -1, abstractC1341cD.A0l(), abstractC1341cD.A0c()));
            c04766f.A0W(new com.facebook.ads.redexgen.core.C1328c0(c1199Zs, interfaceC03581p, c04766f, c03441bA06, z), new com.facebook.ads.redexgen.core.C6Y(abstractC1341cD.A0l(), abstractC1341cD.A0c()));
            return;
        }
        interfaceC03581p.AD3();
    }
}
