package com.unity3d.mediation.rewarded;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/unity3d/mediation/rewarded/LevelPlayRewardedAdListener;", "", com.json.ju.f, "", "adInfo", "Lcom/unity3d/mediation/LevelPlayAdInfo;", com.json.ju.g, "onAdDisplayFailed", "error", "Lcom/unity3d/mediation/LevelPlayAdError;", "onAdDisplayed", "onAdInfoChanged", com.json.ju.b, com.json.ju.j, com.json.ju.i, com.json.s.j, "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LevelPlayRewardedAdListener {
    default void onAdClicked(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    default void onAdClosed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    default void onAdDisplayFailed(com.unity3d.mediation.LevelPlayAdError error, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo);

    default void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error);

    void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo);

    void onAdRewarded(com.unity3d.mediation.rewarded.LevelPlayReward reward, com.unity3d.mediation.LevelPlayAdInfo adInfo);
}
