package com.unity3d.scar.adapter.v2000;

/* JADX INFO: loaded from: classes6.dex */
public class ScarAdapter extends com.unity3d.scar.adapter.common.ScarAdapterBase implements com.unity3d.scar.adapter.common.IScarAdapter {
    private com.unity3d.scar.adapter.common.signals.SignalsStorage<com.google.android.gms.ads.query.QueryInfo> _signalsStorage;

    public ScarAdapter(com.unity3d.scar.adapter.common.IAdsErrorHandler<com.unity3d.scar.adapter.common.WebViewAdsError> iAdsErrorHandler) {
        super(iAdsErrorHandler);
        this._signalsStorage = new com.unity3d.scar.adapter.common.signals.SignalsStorage<>();
        this._signalCollector = new com.unity3d.scar.adapter.v2000.signals.SignalsCollector(this._signalsStorage);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void loadInterstitialAd(android.content.Context context, final com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        final com.unity3d.scar.adapter.v2000.scarads.ScarInterstitialAd scarInterstitialAd = new com.unity3d.scar.adapter.v2000.scarads.ScarInterstitialAd(context, this._signalsStorage.getQueryInfo(scarAdMetadata.getPlacementId()), scarAdMetadata, this._adsErrorHandler, iScarInterstitialAdListenerWrapper);
        com.unity3d.scar.adapter.common.Utils.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.scar.adapter.v2000.ScarAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                scarInterstitialAd.loadAd(new com.unity3d.scar.adapter.common.scarads.IScarLoadListener() { // from class: com.unity3d.scar.adapter.v2000.ScarAdapter.1.1
                    @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
                    public void onAdLoaded() {
                        com.unity3d.scar.adapter.v2000.ScarAdapter.this._loadedAds.put(scarAdMetadata.getPlacementId(), scarInterstitialAd);
                    }
                });
            }
        });
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void loadRewardedAd(android.content.Context context, final com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        final com.unity3d.scar.adapter.v2000.scarads.ScarRewardedAd scarRewardedAd = new com.unity3d.scar.adapter.v2000.scarads.ScarRewardedAd(context, this._signalsStorage.getQueryInfo(scarAdMetadata.getPlacementId()), scarAdMetadata, this._adsErrorHandler, iScarRewardedAdListenerWrapper);
        com.unity3d.scar.adapter.common.Utils.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.scar.adapter.v2000.ScarAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                scarRewardedAd.loadAd(new com.unity3d.scar.adapter.common.scarads.IScarLoadListener() { // from class: com.unity3d.scar.adapter.v2000.ScarAdapter.2.1
                    @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
                    public void onAdLoaded() {
                        com.unity3d.scar.adapter.v2000.ScarAdapter.this._loadedAds.put(scarAdMetadata.getPlacementId(), scarRewardedAd);
                    }
                });
            }
        });
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void loadBannerAd(android.content.Context context, android.widget.RelativeLayout relativeLayout, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, int i, int i2, com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper iScarBannerAdListenerWrapper) {
        final com.unity3d.scar.adapter.v2000.scarads.ScarBannerAd scarBannerAd = new com.unity3d.scar.adapter.v2000.scarads.ScarBannerAd(context, this._signalsStorage.getQueryInfo(scarAdMetadata.getPlacementId()), relativeLayout, scarAdMetadata, i, i2, this._adsErrorHandler, iScarBannerAdListenerWrapper);
        com.unity3d.scar.adapter.common.Utils.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.scar.adapter.v2000.ScarAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                scarBannerAd.loadAd(null);
            }
        });
    }
}
