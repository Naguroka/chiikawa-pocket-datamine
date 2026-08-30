package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ironsource/eu;", "Lcom/unity3d/mediation/banner/LevelPlayBannerAdViewListener;", "Lcom/unity3d/mediation/LevelPlayAdError;", "error", "", com.json.ju.b, "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", com.json.ju.j, com.json.ju.f, com.json.ju.k, "onAdDisplayed", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class eu implements com.unity3d.mediation.banner.LevelPlayBannerAdViewListener {
    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdClicked(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.q5.a().b(com.json.mu.f3048a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.q5.a().f(com.json.mu.f3048a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLeftApplication(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.q5.a().c(com.json.mu.f3048a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.json.q5.a().a(com.json.mu.f3048a.a(error));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.json.q5.a().d(com.json.mu.f3048a.a(adInfo));
    }
}
