package com.unity3d.scar.adapter.v2100.scarads;

/* JADX INFO: loaded from: classes6.dex */
public class ScarInterstitialAd extends com.unity3d.scar.adapter.v2100.scarads.ScarAdBase<com.google.android.gms.ads.interstitial.InterstitialAd> implements com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd {
    public ScarInterstitialAd(android.content.Context context, com.unity3d.scar.adapter.v2100.requests.AdRequestFactory adRequestFactory, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.scar.adapter.common.IAdsErrorHandler iAdsErrorHandler, com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        super(context, scarAdMetadata, adRequestFactory, iAdsErrorHandler);
        this._scarAdListener = new com.unity3d.scar.adapter.v2100.scarads.ScarInterstitialAdListener(iScarInterstitialAdListenerWrapper, this);
    }

    @Override // com.unity3d.scar.adapter.v2100.scarads.ScarAdBase
    protected void loadAdInternal(com.google.android.gms.ads.AdRequest adRequest, com.unity3d.scar.adapter.common.scarads.IScarLoadListener iScarLoadListener) {
        com.google.android.gms.ads.interstitial.InterstitialAd.load(this._context, this._scarAdMetadata.getAdUnitId(), adRequest, ((com.unity3d.scar.adapter.v2100.scarads.ScarInterstitialAdListener) this._scarAdListener).getAdLoadListener());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd
    public void show(android.app.Activity activity) {
        if (this._adObj != 0) {
            ((com.google.android.gms.ads.interstitial.InterstitialAd) this._adObj).show(activity);
        } else {
            this._adsErrorHandler.handleError(com.unity3d.scar.adapter.common.GMAAdsError.AdNotLoadedError(this._scarAdMetadata));
        }
    }
}
