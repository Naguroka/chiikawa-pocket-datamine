package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1291bP implements com.facebook.ads.redexgen.core.C2C {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"hwQkg6wydYZbPmHd9ra1rendlmZDH9o", "EZChF1CYxmcTUt5XULmCX0u1P", "cTSi58RkvxQZRZutX5Kpp639urCcNivT", "ILotitRaBN9o4fzRERLTj8sSXBTWlTTb", "JZvxvLc", "wZ48NZZ1KfL4Szkg73ZSFlGgbHtYLjcz", "R8pWvTFrbs0CFqCxyNRNjvJ5bjwX3", "qzEf3MAjBvJJtqQXUiJPrqpPaexFktRV"};
    public final com.facebook.ads.redexgen.core.AbstractC1310bi A00;
    public final com.facebook.ads.redexgen.core.AnonymousClass20 A01;
    public final com.facebook.ads.redexgen.core.AnonymousClass27 A02;
    public final com.facebook.ads.redexgen.core.C1290bO A03;
    public final com.facebook.ads.redexgen.core.C1199Zs A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 66);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{87, 114, 54, 121, 116, 124, 115, 117, 98, 54, 127, 101, 54, 120, 99, 122, 122, 3, 20, 15, 5, 13, 4, 30, 4, 25, 21, 19, 0, 18, 30, 10, 4, 24, 65, 69, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 94, 89, 67, 72, 82, 69, 69, 88, 69, 72, 84, 88, 83, 82, 72, 92, 82, 78, 96, 103, 125, 118, 123, 127, 118, 127, 96, 109, 108, 102, 118, 109, 124, 123, 104, 125, 96, 102, 103, 118, 98, 108, 112, 67, 64, 65, 72, 80, 70, 65, 89, 78, 67, 70, 75, 78, 91, 70, 64, 65, 80, 91, 70, 66, 74, 80, 68, 74, 86, 34, 10, 28, 28, 14, 8, 10, 85, 79, 127, 91, 65, 65, 91, 92, 85, 18, 80, 71, 92, 86, 94, 87, 18, 84, 93, 64, 18, 95, 87, 65, 65, 83, 85, 87, 9, 45, 55, 55, 45, 42, 35, 100, 38, 49, 42, 32, 40, 33, 100, 34, 43, 54, 100, 41, 33, 55, 55, 37, 35, 33, 106, 54, 49, 55, 58, 32, 55, 55, 42, 55, 58, 40, 32, 54, 54, 36, 34, 32, 58, 46, 32, 60, 5, 20, 13};
    }

    static {
        A01();
    }

    public C1291bP(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.C1290bO c1290bO, com.facebook.ads.redexgen.core.AnonymousClass20 anonymousClass20, com.facebook.ads.redexgen.core.AbstractC1310bi abstractC1310bi, com.facebook.ads.redexgen.core.AnonymousClass27 anonymousClass27) {
        this.A04 = c1199Zs;
        this.A03 = c1290bO;
        this.A01 = anonymousClass20;
        this.A00 = abstractC1310bi;
        this.A02 = anonymousClass27;
    }

    @Override // com.facebook.ads.redexgen.core.C2C
    public final android.os.Bundle A50(java.lang.String str) {
        return com.facebook.ads.redexgen.core.C2J.A03(str, this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.C2C
    public final void A5S() {
        this.A02.A0F(2002, null);
        this.A02.A0C();
        this.A03.A02(null);
    }

    @Override // com.facebook.ads.redexgen.core.C2C
    public final int A7h() {
        return 2000;
    }

    @Override // com.facebook.ads.redexgen.core.C2C
    public final void A8u(android.os.Message message) {
        com.facebook.ads.Ad adA6E = this.A03.A6E();
        java.lang.String strA00 = A00(com.ironsource.g3.c.b.INSTANCE_LOAD_FAILED, 3, 38);
        if (adA6E == null) {
            this.A04.A07().AA0(strA00, com.facebook.ads.redexgen.core.C8E.A0K, new com.facebook.ads.redexgen.core.C8F(A00(0, 17, 84)));
            return;
        }
        int i = message.what;
        java.lang.String strA01 = A00(120, 9, 45);
        java.lang.String strA02 = A00(17, 17, 3);
        switch (i) {
            case 10:
            case com.json.mediationsdk.utils.IronSourceConstants.IS_CHECK_CAPPED_TRUE /* 2103 */:
                android.os.Bundle bundle = message.getData().getBundle(strA02);
                if (bundle != null) {
                    int i2 = bundle.getInt(A00(51, 18, 85));
                    java.lang.String string = bundle.getString(A00(org.objectweb.asm.Opcodes.INVOKEVIRTUAL, 21, 39));
                    com.facebook.ads.AdError adError = new com.facebook.ads.AdError(i2, string);
                    this.A01.AGQ(adError);
                    if (this.A03.A04 != null) {
                        this.A03.A04.onError(adA6E, adError);
                    } else {
                        android.util.Log.e(A00(34, 17, 69), string);
                    }
                } else {
                    this.A01.AGM(com.facebook.ads.redexgen.core.EnumC03681z.A04);
                    java.lang.String errorMessage = strA01 + message;
                    this.A04.A07().AA0(strA00, com.facebook.ads.redexgen.core.C8E.A0V, new com.facebook.ads.redexgen.core.C8F(A00(155, 27, 6), errorMessage));
                }
                this.A03.A02(null);
                return;
            case 2100:
                this.A01.AGV();
                android.os.Bundle bundle2 = message.getData().getBundle(strA02);
                if (bundle2 != null) {
                    this.A03.A01 = bundle2.getLong(A00(94, 26, 77));
                    this.A03.A00 = bundle2.getInt(A00(69, 25, 107));
                } else {
                    this.A04.A07().AA0(strA00, com.facebook.ads.redexgen.core.C8E.A0V, new com.facebook.ads.redexgen.core.C8F(A00(129, 26, 112), strA01 + message));
                }
                com.facebook.ads.redexgen.core.C1290bO c1290bO = this.A03;
                if (A06[0].length() != 31) {
                    throw new java.lang.RuntimeException();
                }
                A06[4] = "nZDiJI4iz";
                c1290bO.A02(null);
                break;
            case 2106:
                this.A03.A02(null);
                break;
            case 2110:
                this.A01.AGf();
                break;
        }
        if (this.A03.A04 == null) {
            return;
        }
        switch (message.what) {
            case 2100:
                com.facebook.ads.redexgen.core.C1290bO c1290bO2 = this.A03;
                if (A06[2].charAt(0) == 'F') {
                    c1290bO2.A04.onAdLoaded(adA6E);
                    return;
                } else {
                    A06[6] = "0IooEpc5XoMFwfovHEQu";
                    c1290bO2.A04.onAdLoaded(adA6E);
                    return;
                }
            case com.json.mediationsdk.utils.IronSourceConstants.IS_CHECK_PLACEMENT_CAPPED /* 2104 */:
                this.A03.A04.onAdClicked(adA6E);
                return;
            case 2105:
                this.A03.A04.onLoggingImpression(adA6E);
                return;
            case 2106:
                if (this.A03.A04 instanceof com.facebook.ads.RewardedVideoAdExtendedListener) {
                    ((com.facebook.ads.RewardedVideoAdExtendedListener) this.A03.A04).onRewardedVideoActivityDestroyed();
                    return;
                }
                return;
            case 2110:
                this.A03.A04.onRewardedVideoClosed();
                return;
            case 3000:
                this.A03.A04.onRewardedVideoCompleted();
                return;
            case 3001:
                if (this.A03.A04 instanceof com.facebook.ads.S2SRewardedVideoAdListener) {
                    ((com.facebook.ads.S2SRewardedVideoAdListener) this.A03.A04).onRewardServerSuccess();
                    return;
                }
                return;
            case 3002:
                if (this.A03.A04 instanceof com.facebook.ads.S2SRewardedVideoAdListener) {
                    ((com.facebook.ads.S2SRewardedVideoAdListener) this.A03.A04).onRewardServerFailed();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
