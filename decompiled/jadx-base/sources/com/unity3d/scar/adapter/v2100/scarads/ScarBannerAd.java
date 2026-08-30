package com.unity3d.scar.adapter.v2100.scarads;

/* JADX INFO: loaded from: classes6.dex */
public class ScarBannerAd extends com.unity3d.scar.adapter.v2100.scarads.ScarAdBase<com.google.android.gms.ads.AdView> {
    private com.google.android.gms.ads.AdView _adView;
    private android.widget.RelativeLayout _bannerView;
    private int _height;
    private int _width;

    public ScarBannerAd(android.content.Context context, android.widget.RelativeLayout relativeLayout, com.unity3d.scar.adapter.v2100.requests.AdRequestFactory adRequestFactory, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, int i, int i2, com.unity3d.scar.adapter.common.IAdsErrorHandler iAdsErrorHandler, com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper iScarBannerAdListenerWrapper) {
        super(context, scarAdMetadata, adRequestFactory, iAdsErrorHandler);
        this._bannerView = relativeLayout;
        this._width = i;
        this._height = i2;
        this._adView = new com.google.android.gms.ads.AdView(this._context);
        this._scarAdListener = new com.unity3d.scar.adapter.v2100.scarads.ScarBannerAdListener(iScarBannerAdListenerWrapper, this);
    }

    public void removeAdView() {
        com.google.android.gms.ads.AdView adView;
        android.widget.RelativeLayout relativeLayout = this._bannerView;
        if (relativeLayout == null || (adView = this._adView) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }

    @Override // com.unity3d.scar.adapter.v2100.scarads.ScarAdBase
    protected void loadAdInternal(com.google.android.gms.ads.AdRequest adRequest, com.unity3d.scar.adapter.common.scarads.IScarLoadListener iScarLoadListener) {
        com.google.android.gms.ads.AdView adView;
        android.widget.RelativeLayout relativeLayout = this._bannerView;
        if (relativeLayout == null || (adView = this._adView) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this._adView.setAdSize(new com.google.android.gms.ads.AdSize(this._width, this._height));
        this._adView.setAdUnitId(this._scarAdMetadata.getAdUnitId());
        this._adView.setAdListener(((com.unity3d.scar.adapter.v2100.scarads.ScarBannerAdListener) this._scarAdListener).getAdListener());
        this._adView.loadAd(adRequest);
    }
}
