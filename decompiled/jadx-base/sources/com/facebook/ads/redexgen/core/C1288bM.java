package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1288bM extends com.facebook.ads.redexgen.core.C2G implements com.facebook.ads.InterstitialAdExtendedListener {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.C1303bb A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 27);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-62, -57, -51, -40, -66, -53, -53, -56, -53, -40, -68, -56, -67, -66, -40, -60, -66, -46, 117, 120, 119, 112, -120, 114, 119, 127, 106, 117, 114, 109, 106, 125, 114, 120, 119, -120, 125, 114, 118, 110, -120, 116, 110, -126, -66, -65, -67, -54, -80, -67, -67, -70, -67, -54, -72, -80, -66, -66, -84, -78, -80, -54, -74, -80, -60};
    }

    public C1288bM(java.lang.String str, com.facebook.ads.redexgen.core.C2I c2i, com.facebook.ads.redexgen.core.C1303bb c1303bb) {
        super(str, c2i);
        this.A00 = c1303bb;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad) {
        super.A00.ACk(1024, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong(A00(18, 26, 14), this.A00.A0D());
        super.A00.ACk(1020, this.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(A00(44, 21, 80), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 94), adError.getErrorCode());
        super.A00.ACk(1023, this.A01, bundle);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        super.A00.ACk(1026, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(com.facebook.ads.Ad ad) {
        super.A00.ACk(1022, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
        super.A00.ACk(1021, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
        super.A00.ACk(1025, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
        super.A00.ACk(3000, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
        super.A00.ACk(3002, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
        super.A00.ACk(3001, this.A01, null);
    }
}
