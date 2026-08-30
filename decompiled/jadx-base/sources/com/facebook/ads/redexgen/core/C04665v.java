package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04665v implements com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.internal.context.Repairable {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.C04705z A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 66);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 85, 87, 84, 86, 5, 5, 81, 48, 54, 49, 55, 58, 58, 55, 51, 106, 59, 109, 111, 108, 108, 109, 59, 12, 15, 88, 8, 14, 90, 2, 93, 64, 119, 101, 115, 96, 118, 119, 118, 50, 123, 124, 102, 119, 96, 97, 102, 123, 102, 123, 115, 126, 50, 115, 118, 50, 118, 119, 97, 102, 96, 125, 107, 119, 118, 30, 41, 59, 45, 62, 40, 41, 40, 108, 37, 34, 56, 41, 62, okio.Utf8.REPLACEMENT_BYTE, 56, 37, 56, 37, 45, 32, 108, 45, 40, 108, 32, 35, 45, 40, 108, 62, 41, kotlin.io.encoding.Base64.padSymbol, 57, 41, okio.Utf8.REPLACEMENT_BYTE, 56, 41, 40, 122, 77, 95, 73, 90, 76, 77, 76, 8, 65, 70, 92, 77, 90, 91, 92, 65, 92, 65, 73, 68, 8, 73, 76, 8, 91, 64, 71, 95, 8, 75, 73, 68, 68, 77, 76, 126, 127, 105, 110, 104, 117, 99, 31, 28, 18, 23, 50, 23, 41, 50, 53, 45};
    }

    public C04665v(android.content.Context context, java.lang.String str, com.facebook.ads.RewardedInterstitialAd rewardedInterstitialAd) {
        this.A00 = new com.facebook.ads.redexgen.core.C04705z(context, str, rewardedInterstitialAd);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new com.facebook.ads.redexgen.core.C04685x(this.A00.buildLoadAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new com.facebook.ads.redexgen.core.C04695y(this.A00.buildShowAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void destroy() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(141, 7, 88), A00(32, 34, 80), A00(24, 8, 121));
        this.A00.A04();
    }

    public final void finalize() {
        this.A00.finalize();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final java.lang.String getPlacementId() {
        return this.A00.getPlacementId();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final int getVideoDuration() {
        return this.A00.getVideoDuration();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        return this.A00.isAdInvalidated();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A00.isAdLoaded();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(org.objectweb.asm.Opcodes.LCMP, 6, 49), A00(66, 39, 14), A00(0, 8, 33));
        this.A00.A07(null, com.facebook.ads.AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void loadAd(com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        ((com.facebook.ads.redexgen.core.C04685x) rewardedInterstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(java.lang.Throwable th) {
        this.A00.repair(th);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    @java.lang.Deprecated
    public final void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.A00.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(154, 4, 24), A00(105, 36, 106), A00(16, 8, 27));
        return this.A00.A08(new com.facebook.ads.redexgen.core.AnonymousClass61().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean show(com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        com.facebook.ads.redexgen.core.AbstractC0792Ju.A05(A00(154, 4, 24), A00(105, 36, 106), A00(8, 8, 64));
        return this.A00.A08(((com.facebook.ads.redexgen.core.C04695y) rewardedInterstitialShowAdConfig).A00());
    }
}
