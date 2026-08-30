package com.unity3d.scar.adapter.v2100.scarads;

/* JADX INFO: loaded from: classes6.dex */
public class ScarRewardedAd extends com.unity3d.scar.adapter.v2100.scarads.ScarAdBase<com.google.android.gms.ads.rewarded.RewardedAd> implements com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd {
    public ScarRewardedAd(android.content.Context context, com.unity3d.scar.adapter.v2100.requests.AdRequestFactory adRequestFactory, com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.scar.adapter.common.IAdsErrorHandler iAdsErrorHandler, com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        super(context, scarAdMetadata, adRequestFactory, iAdsErrorHandler);
        this._scarAdListener = new com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener(iScarRewardedAdListenerWrapper, this);
    }

    @Override // com.unity3d.scar.adapter.v2100.scarads.ScarAdBase
    protected void loadAdInternal(com.google.android.gms.ads.AdRequest adRequest, com.unity3d.scar.adapter.common.scarads.IScarLoadListener iScarLoadListener) {
        com.google.android.gms.ads.rewarded.RewardedAd.load(this._context, this._scarAdMetadata.getAdUnitId(), adRequest, ((com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener) this._scarAdListener).getAdLoadListener());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd
    public void show(android.app.Activity activity) {
        if (this._adObj != 0) {
            ((com.google.android.gms.ads.rewarded.RewardedAd) this._adObj).show(activity, ((com.unity3d.scar.adapter.v2100.scarads.ScarRewardedAdListener) this._scarAdListener).getOnUserEarnedRewardListener());
        } else {
            this._adsErrorHandler.handleError(com.unity3d.scar.adapter.common.GMAAdsError.AdNotLoadedError(this._scarAdMetadata));
        }
    }
}
