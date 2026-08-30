package com.unity3d.scar.adapter.v2300.scarads;

/* JADX INFO: loaded from: classes6.dex */
public class ScarInterstitialAdListener extends com.unity3d.scar.adapter.v2300.scarads.ScarAdListener {
    private final com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper _adListenerWrapper;
    private final com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback _adLoadCallback = new com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback() { // from class: com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.1
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.this._adListenerWrapper.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.this._fullScreenContentCallback);
            com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.this._scarInterstitialAd.setGmaAd(interstitialAd);
            if (com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.this._loadListener != null) {
                com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.this._loadListener.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.this._adListenerWrapper.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    };
    private final com.google.android.gms.ads.FullScreenContentCallback _fullScreenContentCallback = new com.google.android.gms.ads.FullScreenContentCallback() { // from class: com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.2
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.this._adListenerWrapper.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.this._adListenerWrapper.onAdOpened();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.this._adListenerWrapper.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.this._adListenerWrapper.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.this._adListenerWrapper.onAdClicked();
        }
    };
    private final com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAd _scarInterstitialAd;

    public ScarInterstitialAdListener(com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper, com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAd scarInterstitialAd) {
        this._adListenerWrapper = iScarInterstitialAdListenerWrapper;
        this._scarInterstitialAd = scarInterstitialAd;
    }

    public com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback getAdLoadListener() {
        return this._adLoadCallback;
    }
}
