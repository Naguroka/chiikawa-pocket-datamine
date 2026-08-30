package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04495e implements com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.internal.context.Repairable {
    public static byte[] A04;
    public final com.facebook.ads.InterstitialAd A00;
    public final com.facebook.ads.redexgen.core.C1299bX A01;
    public final com.facebook.ads.redexgen.core.C0680Fd A02;
    public final com.facebook.ads.redexgen.core.C1199Zs A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 122);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-64, -65, -61, -15, -62, -12, -63, -58, -28, -22, 20, -27, -22, -27, -24, 21, -39, 9, 9, 6, -36, -40, -38, 10, 2, 39, 45, 30, 43, 39, 26, 37, -39, 30, 43, 43, 40, 43, -25, -61, 44, 81, 87, 72, 85, 86, 87, 76, 87, 76, 68, 79, 3, 68, 71, 3, 71, 72, 86, 87, 85, 82, 92, 72, 71, 50, 87, 93, 78, 91, 92, 93, 82, 93, 82, 74, 85, 9, 74, 77, 9, 85, 88, 74, 77, 9, 91, 78, 90, 94, 78, 92, 93, 78, 77, 39, 76, 82, 67, 80, 81, 82, 71, 82, 71, okio.Utf8.REPLACEMENT_BYTE, 74, -2, okio.Utf8.REPLACEMENT_BYTE, 66, -2, 81, 70, 77, 85, -2, 65, okio.Utf8.REPLACEMENT_BYTE, 74, 74, 67, 66, -13, -12, 2, 3, 1, -2, 8, 88, 99, 64, 99, 85, 88, 53, 88, -8, -19, -12, -4};
    }

    public C04495e(android.content.Context context, java.lang.String str, com.facebook.ads.InterstitialAd interstitialAd) {
        this.A00 = interstitialAd;
        java.lang.String string = java.util.UUID.randomUUID().toString();
        this.A03 = com.facebook.ads.redexgen.core.C04465b.A06(context, string);
        com.facebook.ads.redexgen.core.C0S c0sA0E = this.A03.A0E();
        java.lang.String adId = com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.toString();
        c0sA0E.A3E(adId, str);
        this.A01 = new com.facebook.ads.redexgen.core.C1299bX(this.A03, interstitialAd, str);
        this.A03.A0N(this);
        this.A02 = new com.facebook.ads.redexgen.core.C0680Fd(this.A01, string);
    }

    public final void A02(com.facebook.ads.InterstitialAdListener interstitialAdListener) {
        this.A03.A0E().A37(interstitialAdListener != null);
        this.A01.A0E(interstitialAdListener);
    }

    public final void A03(com.facebook.ads.RewardData rewardData) {
        this.A02.A0E(rewardData);
    }

    public final void A04(com.facebook.ads.RewardedAdListener rewardedAdListener) {
        this.A01.A0G(rewardedAdListener);
    }

    public final void A05(java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet, java.lang.String str) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(129, 8, 122), A00(65, 30, 111), A00(16, 8, 42));
        if (str == null) {
            this.A03.A0E().A3B();
        } else {
            this.A03.A0E().A3A();
        }
        this.A02.A0D(this.A00, enumSet, str);
        this.A03.A0E().A39();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new com.facebook.ads.redexgen.core.C04505f(this);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final com.facebook.ads.InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new com.facebook.ads.redexgen.core.C04515g();
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(122, 7, 21), A00(40, 25, 105), A00(8, 8, 56));
        if (com.facebook.ads.redexgen.core.C0762Im.A2B(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0E().A3F();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.Ad
    public final java.lang.String getPlacementId() {
        return this.A01.A0A();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0F = this.A02.A0F();
        this.A03.A0E().A5E(zA0F);
        return zA0F;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0G();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        A05(com.facebook.ads.CacheFlag.ALL, null);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((com.facebook.ads.redexgen.core.C04505f) interstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(java.lang.Throwable th) {
        if (this.A01.A6I() != null) {
            this.A01.A6I().onError(this.A00, new com.facebook.ads.AdError(2001, A00(24, 16, 63) + com.facebook.ads.redexgen.core.AbstractC0832Ll.A03(this.A03, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.Ad
    @java.lang.Deprecated
    public final void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.A01.A0I(extraHints.getHints());
        this.A01.A0J(extraHints.getMediationData());
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(org.objectweb.asm.Opcodes.L2F, 4, 11), A00(95, 27, 100), A00(0, 8, 21));
        this.A03.A0E().A3K();
        boolean zA0H = this.A02.A0H(this.A00, new com.facebook.ads.redexgen.core.C04515g());
        this.A03.A0E().A3J(zA0H);
        return zA0H;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean show(com.facebook.ads.InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A03.A0E().A3K();
        boolean zA0H = this.A02.A0H(this.A00, interstitialShowAdConfig);
        this.A03.A0E().A3J(zA0H);
        return zA0H;
    }
}
