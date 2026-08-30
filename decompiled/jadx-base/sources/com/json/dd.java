package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/ironsource/dd;", "", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "", com.json.ju.j, "Lcom/unity3d/mediation/LevelPlayAdError;", "error", com.json.ju.b, "b", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, com.json.ju.f, com.json.ju.g, "Lcom/unity3d/mediation/rewarded/LevelPlayReward;", com.json.s.j, "onAdInfoChanged", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface dd {
    void a();

    void a(com.unity3d.mediation.LevelPlayAdError error);

    void a(com.unity3d.mediation.rewarded.LevelPlayReward reward);

    void b();

    void onAdClicked();

    void onAdClosed();

    void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo);

    void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error);

    void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo);
}
