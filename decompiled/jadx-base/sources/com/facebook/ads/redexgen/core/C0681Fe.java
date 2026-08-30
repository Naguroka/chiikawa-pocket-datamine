package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0681Fe extends com.facebook.ads.redexgen.core.AbstractC1322bu {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"vV6RQP0QGAizSnvHrhrEiTJKYqnkk7vR", "gVueu7WJkm8gI", "", "raAPQvYZN3qaAVuN8G4E0NVfm2Y0LRUe", "w5hc", "", "RHGb3VvP2c2qxldOqnFEpaAIYmVmOJg8", "ZdfM9COnhESAyQW1NqvAdN1Ku5n51qre"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 32);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-43, -45, -32, -110, -31, -32, -34, -21, -110, -27, -41, -26, -110, -31, -32, -110, -28, -41, -23, -45, -28, -42, -41, -42, -110, -24, -37, -42, -41, -31, -110, -45, -42, -27, -80, -79, 98, -93, -90, -93, -78, -74, -89, -76, 98, -76, -89, -93, -90, -69, 98, -74, -79, 98, -75, -89, -74, 98, -76, -89, -71, -93, -76, -90, 98, -79, -80};
    }

    static {
        A02();
    }

    public C0681Fe(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C03621t c03621t) {
        super(c1199Zs, c03621t);
    }

    private com.facebook.ads.redexgen.core.C1314bm A00(java.lang.Runnable runnable) {
        return new com.facebook.ads.redexgen.core.C1314bm(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322bu
    public final void A0O() {
        com.facebook.ads.redexgen.core.AbstractC1345cH abstractC1345cH = (com.facebook.ads.redexgen.core.AbstractC1345cH) this.A01;
        abstractC1345cH.A00(this.A08.A00);
        abstractC1345cH.A01(this.A08.A01);
        abstractC1345cH.A0I();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1322bu
    public final void A0Q(com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p, com.facebook.ads.redexgen.core.C8W c8w, com.facebook.ads.redexgen.core.C8U c8u, com.facebook.ads.redexgen.core.C03631u c03631u) {
        com.facebook.ads.redexgen.core.C0692Fq c0692Fq = (com.facebook.ads.redexgen.core.C0692Fq) interfaceC03320p;
        com.facebook.ads.redexgen.core.C1315bn c1315bn = new com.facebook.ads.redexgen.core.C1315bn(this, c03631u, c0692Fq);
        if (com.facebook.ads.redexgen.core.C0762Im.A2S(this.A0B)) {
            android.os.Handler handlerA0G = A0G();
            com.facebook.ads.redexgen.core.C8X c8xA05 = c8w.A05();
            java.lang.String[] strArr = A01;
            if (strArr[3].charAt(31) != strArr[7].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[5] = "";
            strArr2[2] = "";
            handlerA0G.postDelayed(c1315bn, c8xA05.A05());
        }
        c0692Fq.A0J(this.A0B, A00(c1315bn), c03631u, this.A08.A06, this.A08.A04, this.A08.A05);
    }

    public final void A0Z(com.facebook.ads.RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A82() == com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO) {
                com.facebook.ads.redexgen.core.AbstractC1345cH rewardedVideoAdapter = (com.facebook.ads.redexgen.core.AbstractC1345cH) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new java.lang.IllegalStateException(A01(0, 34, 82));
        }
        throw new java.lang.IllegalStateException(A01(34, 33, 34));
    }
}
