package com.unity3d.scar.adapter.v2000.scarads;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ScarAdBase<T> implements com.unity3d.scar.adapter.common.scarads.IScarAd {
    protected T _adObj;
    protected com.unity3d.scar.adapter.common.IAdsErrorHandler _adsErrorHandler;
    protected android.content.Context _context;
    protected com.google.android.gms.ads.query.QueryInfo _queryInfo;
    protected com.unity3d.scar.adapter.v2000.scarads.ScarAdListener _scarAdListener;
    protected com.unity3d.scar.adapter.common.scarads.ScarAdMetadata _scarAdMetadata;

    protected abstract void loadAdInternal(com.google.android.gms.ads.AdRequest adRequest, com.unity3d.scar.adapter.common.scarads.IScarLoadListener iScarLoadListener);

    public ScarAdBase(android.content.Context context, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.google.android.gms.ads.query.QueryInfo queryInfo, com.unity3d.scar.adapter.common.IAdsErrorHandler iAdsErrorHandler) {
        this._context = context;
        this._scarAdMetadata = scarAdMetadata;
        this._queryInfo = queryInfo;
        this._adsErrorHandler = iAdsErrorHandler;
    }

    public void setGmaAd(T t) {
        this._adObj = t;
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void loadAd(com.unity3d.scar.adapter.common.scarads.IScarLoadListener iScarLoadListener) {
        if (this._queryInfo != null) {
            com.google.android.gms.ads.AdRequest adRequestBuild = new com.google.android.gms.ads.AdRequest.Builder().setAdInfo(new com.google.android.gms.ads.query.AdInfo(this._queryInfo, this._scarAdMetadata.getAdString())).build();
            if (iScarLoadListener != null) {
                this._scarAdListener.setLoadListener(iScarLoadListener);
            }
            loadAdInternal(adRequestBuild, iScarLoadListener);
            return;
        }
        this._adsErrorHandler.handleError(com.unity3d.scar.adapter.common.GMAAdsError.QueryNotFoundError(this._scarAdMetadata));
    }
}
