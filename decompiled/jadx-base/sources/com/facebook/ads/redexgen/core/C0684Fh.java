package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0684Fh extends com.facebook.ads.redexgen.core.AbstractC1322bu {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 124);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{42, 47, 107, 34, 56, 107, 37, 36, okio.Utf8.REPLACEMENT_BYTE, 107, 57, 46, 42, 47, 50, 107, 36, 57, 107, 42, 39, 57, 46, 42, 47, 50, 107, 47, 34, 56, 59, 39, 42, 50, 46, 47, 20, 21, 28, 17, 9};
    }

    static {
        A03();
    }

    public C0684Fh(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C03621t c03621t) {
        super(c1199Zs, c03621t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, java.lang.String> A01(long j) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(A00(36, 5, 12), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - j));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(java.util.List<java.lang.String> trackingUrls, java.util.Map<java.lang.String, java.lang.String> extraData) {
        if (trackingUrls != null) {
            boolean zIsEmpty = trackingUrls.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (zIsEmpty) {
                return;
            }
            java.util.Iterator<java.lang.String> it = trackingUrls.iterator();
            while (it.hasNext()) {
                new com.facebook.ads.redexgen.core.SA(this.A0B, extraData).execute(it.next());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322bu
    public final void A0O() {
        com.facebook.ads.redexgen.core.C1358cU c1358cU = (com.facebook.ads.redexgen.core.C1358cU) this.A01;
        if (c1358cU.A0R()) {
            com.facebook.ads.redexgen.core.AbstractC03330q abstractC03330q = this.A07;
            if (A01[3].charAt(25) != 'c') {
                throw new java.lang.RuntimeException();
            }
            A01[4] = "SmlVqZ";
            if (abstractC03330q != null) {
                this.A07.A0B(c1358cU);
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException(A00(0, 36, 55));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322bu
    public final void A0Q(com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p, com.facebook.ads.redexgen.core.C8W c8w, com.facebook.ads.redexgen.core.C8U c8u, com.facebook.ads.redexgen.core.C03631u c03631u) {
        com.facebook.ads.redexgen.core.C1358cU c1358cU = (com.facebook.ads.redexgen.core.C1358cU) interfaceC03320p;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.facebook.ads.redexgen.core.C1319br c1319br = new com.facebook.ads.redexgen.core.C1319br(this, c03631u, c1358cU, jCurrentTimeMillis, c8u);
        A0G().postDelayed(c1319br, c8w.A05().A05());
        c1358cU.A0L(this.A0B, new com.facebook.ads.redexgen.core.C1318bq(this, c1319br, jCurrentTimeMillis, c8u), this.A09, c03631u, com.facebook.ads.redexgen.core.W7.A0K());
    }
}
