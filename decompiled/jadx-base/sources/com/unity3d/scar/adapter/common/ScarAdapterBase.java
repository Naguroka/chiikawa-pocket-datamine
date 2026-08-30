package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ScarAdapterBase implements com.unity3d.scar.adapter.common.IScarAdapter {
    protected com.unity3d.scar.adapter.common.IAdsErrorHandler<com.unity3d.scar.adapter.common.WebViewAdsError> _adsErrorHandler;
    protected com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd _currentAdReference;
    protected java.util.Map<java.lang.String, com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd> _loadedAds = new java.util.concurrent.ConcurrentHashMap();
    protected com.unity3d.scar.adapter.common.signals.ISignalsCollector _signalCollector;

    public ScarAdapterBase(com.unity3d.scar.adapter.common.IAdsErrorHandler<com.unity3d.scar.adapter.common.WebViewAdsError> iAdsErrorHandler) {
        this._adsErrorHandler = iAdsErrorHandler;
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void getSCARBiddingSignals(android.content.Context context, boolean z, com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener) {
        this._signalCollector.getSCARBiddingSignals(context, z, iSignalCollectionListener);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void getSCARSignal(android.content.Context context, java.lang.String str, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener) {
        this._signalCollector.getSCARSignal(context, str, unityAdFormat, iSignalCollectionListener);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void show(final android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        com.unity3d.scar.adapter.common.scarads.IScarFullScreenAd iScarFullScreenAd = this._loadedAds.get(str2);
        if (iScarFullScreenAd == null) {
            this._adsErrorHandler.handleError(com.unity3d.scar.adapter.common.GMAAdsError.NoAdsError(str2, str, "Could not find ad for placement '" + str2 + "'."));
        } else {
            this._currentAdReference = iScarFullScreenAd;
            com.unity3d.scar.adapter.common.Utils.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.scar.adapter.common.ScarAdapterBase.1
                @Override // java.lang.Runnable
                public void run() {
                    com.unity3d.scar.adapter.common.ScarAdapterBase.this._currentAdReference.show(activity);
                }
            });
        }
    }
}
