package com.unity3d.services.ads.gmascar.managers;

/* JADX INFO: loaded from: classes6.dex */
public class BiddingEagerManager extends com.unity3d.services.ads.gmascar.managers.BiddingBaseManager {
    public BiddingEagerManager(boolean z, com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener) {
        super(z, iUnityAdsTokenListener);
    }

    @Override // com.unity3d.services.ads.gmascar.managers.BiddingBaseManager
    public void start() {
        permitSignalsUpload();
        fetchSignals();
    }
}
