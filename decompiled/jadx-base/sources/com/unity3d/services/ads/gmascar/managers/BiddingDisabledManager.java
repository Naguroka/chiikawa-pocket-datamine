package com.unity3d.services.ads.gmascar.managers;

/* JADX INFO: loaded from: classes6.dex */
public class BiddingDisabledManager extends com.unity3d.services.ads.gmascar.managers.BiddingBaseManager {
    @Override // com.unity3d.services.ads.gmascar.managers.BiddingBaseManager, com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public java.lang.String getTokenIdentifier() {
        return null;
    }

    @Override // com.unity3d.services.ads.gmascar.managers.BiddingBaseManager
    public void start() {
    }

    public BiddingDisabledManager(com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener) {
        super(false, iUnityAdsTokenListener);
    }
}
