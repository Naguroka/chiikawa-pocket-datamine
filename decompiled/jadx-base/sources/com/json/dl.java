package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/ironsource/dl;", "", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "", com.json.ju.j, "Lcom/unity3d/mediation/LevelPlayAdError;", "error", com.json.ju.b, "onAdDisplayed", "onAdDisplayFailed", com.json.ju.f, com.json.ju.g, "onAdInfoChanged", "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", com.json.s.j, com.json.ju.i, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface dl {
    void onAdClicked(com.unity3d.mediation.LevelPlayAdInfo adInfo);

    void onAdClosed(com.unity3d.mediation.LevelPlayAdInfo adInfo);

    void onAdDisplayFailed(com.unity3d.mediation.LevelPlayAdError error, com.unity3d.mediation.LevelPlayAdInfo adInfo);

    void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo);

    void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo);

    void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error);

    void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo);

    default void onAdRewarded(com.unity3d.mediation.rewarded.LevelPlayReward reward, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "reward");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
