package com.unity3d.services.ads.gmascar.handlers;

/* JADX INFO: loaded from: classes6.dex */
public class ScarRewardedAdHandler extends com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase implements com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper {
    private boolean _hasEarnedReward;

    public ScarRewardedAdHandler(com.unity3d.scar.adapter.common.scarads.ScarAdMetadata scarAdMetadata, com.unity3d.services.core.misc.EventSubject<com.unity3d.scar.adapter.common.GMAEvent> eventSubject, com.unity3d.services.ads.gmascar.utils.GMAEventSender gMAEventSender) {
        super(scarAdMetadata, eventSubject, gMAEventSender);
        this._hasEarnedReward = false;
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onAdFailedToShow(int i, java.lang.String str) {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.REWARDED_SHOW_ERROR, this._scarAdMetadata.getPlacementId(), this._scarAdMetadata.getQueryId(), str, java.lang.Integer.valueOf(i));
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onUserEarnedReward() {
        this._hasEarnedReward = true;
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.AD_EARNED_REWARD, new java.lang.Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onAdSkipped() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.AD_SKIPPED, new java.lang.Object[0]);
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        if (!this._hasEarnedReward) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onAdImpression() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.GMAEvent.REWARDED_IMPRESSION_RECORDED, new java.lang.Object[0]);
    }
}
