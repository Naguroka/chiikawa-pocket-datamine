package com.unity3d.ironsourceads.rewarded;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/unity3d/ironsourceads/rewarded/RewardedAd;", "Lcom/ironsource/jq;", "", "isReadyToShow", "Landroid/app/Activity;", "activity", "", com.json.j5.v, "onRewardedAdShown", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "onRewardedAdFailedToShow", "onAdInstanceDidBecomeVisible", "onRewardedAdClicked", "onRewardedAdDismissed", "onUserEarnedReward", "Lcom/ironsource/iq;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/iq;", "rewardedAdInternal", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdListener;", "b", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdListener;", "getListener", "()Lcom/unity3d/ironsourceads/rewarded/RewardedAdListener;", "setListener", "(Lcom/unity3d/ironsourceads/rewarded/RewardedAdListener;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ironsourceads/rewarded/RewardedAdInfo;", "getAdInfo", "()Lcom/unity3d/ironsourceads/rewarded/RewardedAdInfo;", "adInfo", "<init>", "(Lcom/ironsource/iq;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class RewardedAd implements com.json.jq {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.iq rewardedAdInternal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.unity3d.ironsourceads.rewarded.RewardedAdListener listener;

    public RewardedAd(com.json.iq rewardedAdInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardedAdInternal, "rewardedAdInternal");
        this.rewardedAdInternal = rewardedAdInternal;
        rewardedAdInternal.a(this);
    }

    public final com.unity3d.ironsourceads.rewarded.RewardedAdInfo getAdInfo() {
        return this.rewardedAdInternal.getAdInfo();
    }

    public final com.unity3d.ironsourceads.rewarded.RewardedAdListener getListener() {
        return this.listener;
    }

    public final boolean isReadyToShow() {
        return this.rewardedAdInternal.d();
    }

    @Override // com.json.jq
    public void onAdInstanceDidBecomeVisible() {
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.listener;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.json.jq
    public void onRewardedAdClicked() {
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.listener;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.json.jq
    public void onRewardedAdDismissed() {
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.listener;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.json.jq
    public void onRewardedAdFailedToShow(com.json.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.listener;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, error);
        }
    }

    @Override // com.json.jq
    public void onRewardedAdShown() {
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.listener;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.json.jq
    public void onUserEarnedReward() {
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.listener;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener) {
        this.listener = rewardedAdListener;
    }

    public final void show(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.rewardedAdInternal.a(activity);
    }
}
