package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/mediation/interstitial/LevelPlayInterstitialAdListener;", "Lcom/ironsource/dl;", "b", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class fl {

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"com/ironsource/fl$a", "Lcom/ironsource/dl;", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "", com.json.ju.j, "Lcom/unity3d/mediation/LevelPlayAdError;", "error", com.json.ju.b, "onAdDisplayed", "onAdDisplayFailed", com.json.ju.f, com.json.ju.g, "onAdInfoChanged", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.dl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener f2659a;

        a(com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.f2659a = levelPlayInterstitialAdListener;
        }

        @Override // com.json.dl
        public void onAdClicked(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            this.f2659a.onAdClicked(adInfo);
        }

        @Override // com.json.dl
        public void onAdClosed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            this.f2659a.onAdClosed(adInfo);
        }

        @Override // com.json.dl
        public void onAdDisplayFailed(com.unity3d.mediation.LevelPlayAdError error, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            this.f2659a.onAdDisplayFailed(error, adInfo);
        }

        @Override // com.json.dl
        public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            this.f2659a.onAdDisplayed(adInfo);
        }

        @Override // com.json.dl
        public void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            this.f2659a.onAdInfoChanged(adInfo);
        }

        @Override // com.json.dl
        public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            this.f2659a.onAdLoadFailed(error);
        }

        @Override // com.json.dl
        public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            this.f2659a.onAdLoaded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.json.dl b(com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new com.ironsource.fl.a(levelPlayInterstitialAdListener);
    }
}
