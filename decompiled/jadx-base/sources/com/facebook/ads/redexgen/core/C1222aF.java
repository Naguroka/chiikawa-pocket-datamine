package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1222aF implements com.facebook.ads.redexgen.core.InterfaceC03661x {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};
    public com.facebook.ads.redexgen.core.C04595o A00;
    public com.facebook.ads.redexgen.core.C1199Zs A01;
    public final com.facebook.ads.NativeAdBase.MediaCacheFlag A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[6].length() == 1) {
                throw new java.lang.RuntimeException();
            }
            A04[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 88);
            i4++;
        }
    }

    public static void A03() {
        A03 = new byte[]{-26, -39, -20, -31, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    static {
        A03();
    }

    public C1222aF(com.facebook.ads.redexgen.core.C04595o c04595o, com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c04595o;
        this.A01 = c1199Zs;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03661x
    public final void ABs(com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        com.facebook.ads.redexgen.core.KP.A00(new com.facebook.ads.redexgen.core.C1225aI(this, c0779Jg));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03661x
    public final void ACq(java.util.List<com.facebook.ads.redexgen.core.C1358cU> list) {
        com.facebook.ads.redexgen.core.C04766f manager = new com.facebook.ads.redexgen.core.C04766f(this.A01);
        java.lang.String firstRequestId = A02(6, 7, 23);
        for (com.facebook.ads.redexgen.core.C1358cU c1358cU : list) {
            if (A02(6, 7, 23).equals(firstRequestId)) {
                firstRequestId = c1358cU.A0G();
            }
            if (this.A02.equals(com.facebook.ads.NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1358cU.A0E().A0F() != null) {
                    manager.A0b(new com.facebook.ads.redexgen.core.C04746d(c1358cU.A0E().A0F().getUrl(), c1358cU.A0E().A0F().getHeight(), c1358cU.A0E().A0F().getWidth(), c1358cU.A0G(), A02(0, 6, 32)));
                }
                if (c1358cU.A0E().A0E() != null) {
                    manager.A0b(new com.facebook.ads.redexgen.core.C04746d(c1358cU.A0E().A0E().getUrl(), c1358cU.A0E().A0E().getHeight(), c1358cU.A0E().A0E().getWidth(), c1358cU.A0G(), A02(0, 6, 32)));
                }
                if (!android.text.TextUtils.isEmpty(c1358cU.A0E().A0b())) {
                    manager.A0a(new com.facebook.ads.redexgen.core.C04726b(c1358cU.A0E().A0b(), c1358cU.A0G(), A02(0, 6, 32), c1358cU.A0E().A0A()));
                }
            }
        }
        manager.A0W(new com.facebook.ads.redexgen.core.C1223aG(this, list), new com.facebook.ads.redexgen.core.C6Y(firstRequestId, A02(0, 6, 32)));
    }
}
