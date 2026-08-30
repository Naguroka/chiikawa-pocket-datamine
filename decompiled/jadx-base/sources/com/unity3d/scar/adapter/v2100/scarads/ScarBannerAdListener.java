package com.unity3d.scar.adapter.v2100.scarads;

/* JADX INFO: loaded from: classes6.dex */
public class ScarBannerAdListener extends com.unity3d.scar.adapter.v2100.scarads.ScarAdListener {
    private final com.google.android.gms.ads.AdListener _adListener = new com.google.android.gms.ads.AdListener() { // from class: com.unity3d.scar.adapter.v2100.scarads.ScarBannerAdListener.1
        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
        public void onAdClicked() {
            super.onAdClicked();
            com.unity3d.scar.adapter.v2100.scarads.ScarBannerAdListener.this._adListenerWrapper.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            com.unity3d.scar.adapter.v2100.scarads.ScarBannerAdListener.this._adListenerWrapper.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            com.unity3d.scar.adapter.v2100.scarads.ScarBannerAdListener.this._scarBannerAd.removeAdView();
            com.unity3d.scar.adapter.v2100.scarads.ScarBannerAdListener.this._adListenerWrapper.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            com.unity3d.scar.adapter.v2100.scarads.ScarBannerAdListener.this._adListenerWrapper.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            com.unity3d.scar.adapter.v2100.scarads.ScarBannerAdListener.this._adListenerWrapper.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            com.unity3d.scar.adapter.v2100.scarads.ScarBannerAdListener.this._adListenerWrapper.onAdOpened();
        }
    };
    private final com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper _adListenerWrapper;
    private final com.unity3d.scar.adapter.v2100.scarads.ScarBannerAd _scarBannerAd;

    public ScarBannerAdListener(com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper iScarBannerAdListenerWrapper, com.unity3d.scar.adapter.v2100.scarads.ScarBannerAd scarBannerAd) {
        this._adListenerWrapper = iScarBannerAdListenerWrapper;
        this._scarBannerAd = scarBannerAd;
    }

    public com.google.android.gms.ads.AdListener getAdListener() {
        return this._adListener;
    }
}
