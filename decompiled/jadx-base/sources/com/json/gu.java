package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ironsource/gu;", "Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAdListener;", "Lcom/unity3d/mediation/LevelPlayAdError;", "error", "", com.json.ju.b, "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", com.json.ju.j, com.json.ju.f, "onAdDisplayed", "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", com.json.s.j, com.json.ju.i, "onAdDisplayFailed", com.json.ju.g, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class gu implements com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener {
    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClicked(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.zp.a().a(new com.json.mediationsdk.model.Placement(0, adInfo.getPlacementName(), false, "", 0, null), com.json.mu.f3048a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdClosed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.zp.a().b(com.json.mu.f3048a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayFailed(com.unity3d.mediation.LevelPlayAdError error, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.zp zpVarA = com.json.zp.a();
        com.json.mu muVar = com.json.mu.f3048a;
        zpVarA.a(muVar.a(error), muVar.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.zp.a().c(com.json.mu.f3048a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.json.zp.a().a(com.json.mu.f3048a.a(error));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.zp.a().d(com.json.mu.f3048a.a(adInfo));
    }

    @Override // com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener
    public void onAdRewarded(com.unity3d.mediation.rewarded.LevelPlayReward reward, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "reward");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.zp.a().b(new com.json.mediationsdk.model.Placement(0, adInfo.getPlacementName(), false, reward.getName(), reward.getAmount(), null), com.json.mu.f3048a.a(adInfo));
    }
}
