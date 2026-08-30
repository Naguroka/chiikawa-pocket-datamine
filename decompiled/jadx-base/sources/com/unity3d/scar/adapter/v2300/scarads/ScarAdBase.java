package com.unity3d.scar.adapter.v2300.scarads;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ScarAdBase<T> implements com.unity3d.scar.adapter.common.scarads.IScarAd {
    protected T _adObj;
    protected com.unity3d.scar.adapter.v2300.requests.AdRequestFactory _adRequestFactory;
    protected com.unity3d.scar.adapter.common.IAdsErrorHandler _adsErrorHandler;
    protected android.content.Context _context;
    protected com.unity3d.scar.adapter.v2300.scarads.ScarAdListener _scarAdListener;
    protected com.unity3d.scar.adapter.common.scarads.ScarAdMetadata _scarAdMetadata;

    protected abstract void loadAdInternal(com.google.android.gms.ads.AdRequest adRequest, com.unity3d.scar.adapter.common.scarads.IScarLoadListener iScarLoadListener);

    public ScarAdBase(android.content.Context context, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.scar.adapter.v2300.requests.AdRequestFactory adRequestFactory, com.unity3d.scar.adapter.common.IAdsErrorHandler iAdsErrorHandler) {
        this._context = context;
        this._scarAdMetadata = scarAdMetadata;
        this._adRequestFactory = adRequestFactory;
        this._adsErrorHandler = iAdsErrorHandler;
    }

    public void setGmaAd(T t) {
        this._adObj = t;
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void loadAd(com.unity3d.scar.adapter.common.scarads.IScarLoadListener iScarLoadListener) {
        com.google.android.gms.ads.AdRequest adRequestBuildAdRequestWithAdString = this._adRequestFactory.buildAdRequestWithAdString(this._scarAdMetadata.getAdString());
        if (iScarLoadListener != null) {
            this._scarAdListener.setLoadListener(iScarLoadListener);
        }
        loadAdInternal(adRequestBuildAdRequestWithAdString, iScarLoadListener);
    }
}
