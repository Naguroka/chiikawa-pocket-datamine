package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1302ba extends com.facebook.ads.redexgen.core.AbstractC03330q {
    public static byte[] A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1300bY A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 43);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, 24, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C1302ba(com.facebook.ads.redexgen.core.C1300bY c1300bY) {
        this.A00 = c1300bY;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A06() {
        this.A00.A08.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A07() {
        this.A00.A08.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A08() {
        if (this.A00.A03 == null) {
            this.A00.A08.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A09() {
        if (this.A00.A03 == null) {
            this.A00.A08.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0A() {
        if (this.A00.A03 != null) {
            com.facebook.ads.redexgen.core.AnonymousClass61 anonymousClass61 = (com.facebook.ads.redexgen.core.AnonymousClass61) this.A00.A03.buildShowAdConfig();
            anonymousClass61.A02(java.lang.System.currentTimeMillis() - this.A00.A02);
            this.A00.A03.show(anonymousClass61.build());
            return;
        }
        this.A00.A08.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0C() {
        this.A00.A07.A0E().A35();
        this.A00.A08.onAdClicked(this.A00.A09.A6E());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0D() {
        this.A00.A08.onLoggingImpression(this.A00.A09.A6E());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0F(com.facebook.ads.redexgen.core.InterfaceC03320p interfaceC03320p) {
        if (this.A00.A05 == null) {
            this.A00.A07.A07().AA0(A00(0, 3, 67), com.facebook.ads.redexgen.core.C8E.A0N, new com.facebook.ads.redexgen.core.C8F(A00(3, 18, 108)));
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC1345cH abstractC1345cH = (com.facebook.ads.redexgen.core.AbstractC1345cH) interfaceC03320p;
        if (this.A00.A09.A03 != null) {
            abstractC1345cH.A02(this.A00.A09.A03);
        }
        this.A00.A09.A00 = abstractC1345cH.A0G();
        this.A00.A06 = true;
        this.A00.A04 = this.A00.A05.A0H();
        if (this.A00.A04 != null) {
            int iA1N = 0;
            if (!this.A00.A04.A15()) {
                iA1N = ((com.facebook.ads.redexgen.core.AbstractC1341cD) this.A00.A04).A1N();
            }
            if (iA1N > 0) {
                com.facebook.ads.redexgen.core.L6 l6 = new com.facebook.ads.redexgen.core.L6();
                if (l6.A09(this.A00.A07, this.A00.A09.A06, iA1N)) {
                    l6.A08(this.A00.A07, true);
                    this.A00.A03 = l6.A07(this.A00.A07, this.A00.A09.A0D, this.A00.A09.A06);
                } else {
                    l6.A08(this.A00.A07, false);
                }
            }
        }
        if (this.A00.A03 != null) {
            ((com.facebook.ads.redexgen.core.AbstractC1341cD) this.A00.A04).A1Z(true);
            com.facebook.ads.RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = this.A00.A03.buildLoadAdConfig().withFailOnCacheFailureEnabled(true).withRewardData(this.A00.A04.A0W()).withAdExperience(this.A00.A09.A02).withAdListener(new com.facebook.ads.RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.24
                @Override // com.facebook.ads.AdListener
                public final void onAdClicked(com.facebook.ads.Ad ad) {
                }

                @Override // com.facebook.ads.AdListener
                public final void onAdLoaded(com.facebook.ads.Ad ad) {
                    this.A00.A00.A08.onAdLoaded(this.A00.A00.A09.A6E());
                }

                @Override // com.facebook.ads.AdListener
                public final void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
                    this.A00.A00.A03 = null;
                    ((com.facebook.ads.redexgen.core.AbstractC1341cD) this.A00.A00.A04).A1Z(false);
                    this.A00.A00.A08.onAdLoaded(this.A00.A00.A09.A6E());
                }

                @Override // com.facebook.ads.AdListener
                public final void onLoggingImpression(com.facebook.ads.Ad ad) {
                }

                @Override // com.facebook.ads.RewardedVideoAdListener
                public final void onRewardedVideoClosed() {
                    this.A00.A00.A08.onRewardedVideoClosed();
                }

                @Override // com.facebook.ads.RewardedVideoAdListener
                public final void onRewardedVideoCompleted() {
                    this.A00.A00.A08.onRewardedVideoCompleted();
                }
            }).build();
            this.A00.A03.loadAd(loadAdConfig);
            return;
        }
        this.A00.A08.onAdLoaded(this.A00.A09.A6E());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03330q
    public final void A0G(com.facebook.ads.redexgen.core.C0779Jg c0779Jg) {
        this.A00.A0D(true);
        this.A00.A09.A0B.A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A00.A01), c0779Jg.A03().getErrorCode(), c0779Jg.A04());
        this.A00.A08.onError(this.A00.A09.A6E(), com.facebook.ads.redexgen.core.L8.A00(c0779Jg));
    }
}
