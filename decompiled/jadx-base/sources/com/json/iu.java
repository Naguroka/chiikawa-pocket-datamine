package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J(\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ironsource/iu;", "", "", "b", "c", "", "callbackName", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "", "args", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "d", "Lcom/ironsource/zt;", "Lcom/ironsource/zt;", "mJavaScriptEvaluator", "javaScriptEvaluator", "<init>", "(Lcom/ironsource/zt;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class iu {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.zt mJavaScriptEvaluator;

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, d2 = {"com/ironsource/iu$a", "Lcom/ironsource/mediationsdk/sdk/LevelPlayInterstitialListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "", com.json.ju.f2833a, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", com.json.ju.b, com.json.ju.c, com.json.ju.d, com.json.ju.e, com.json.ju.f, com.json.ju.g, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.json.mediationsdk.sdk.LevelPlayInterstitialListener {
        a() {
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClicked(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.f, com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClosed(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.g, com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdLoadFailed(com.json.mediationsdk.logger.IronSourceError error) {
            com.json.iu iuVar = com.json.iu.this;
            com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL;
            com.json.mu muVar = com.json.mu.f3048a;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = error != null ? error.getErrorMessage() : null;
            iuVar.a(com.json.ju.b, ad_unit, muVar.a(objArr));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdOpened(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.c, com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdReady(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.f2833a, com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowFailed(com.json.mediationsdk.logger.IronSourceError error, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu iuVar = com.json.iu.this;
            com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL;
            com.json.mu muVar = com.json.mu.f3048a;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = error != null ? error.getErrorMessage() : null;
            objArr[1] = adInfo;
            iuVar.a(com.json.ju.e, ad_unit, muVar.a(objArr));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowSucceeded(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.d, com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL, com.json.mu.f3048a.a(adInfo));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001c\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001c\u0010\u0011\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0013"}, d2 = {"com/ironsource/iu$b", "Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoManualListener;", "Lcom/ironsource/mediationsdk/sdk/LevelPlayRewardedVideoListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "", com.json.ju.f2833a, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", com.json.ju.b, com.json.ju.h, com.json.ju.n, com.json.ju.c, com.json.ju.e, "Lcom/ironsource/mediationsdk/model/Placement;", "placement", com.json.ju.f, com.json.ju.i, com.json.ju.g, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener, com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener {
        b() {
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdAvailable(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.h, com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClicked(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.f, com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mu.f3048a.a(com.json.hu.f2727a.a(placement), adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClosed(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.g, com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdLoadFailed(com.json.mediationsdk.logger.IronSourceError error) {
            com.json.iu iuVar = com.json.iu.this;
            com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
            com.json.mu muVar = com.json.mu.f3048a;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = error != null ? error.getErrorMessage() : null;
            iuVar.a(com.json.ju.b, ad_unit, muVar.a(objArr));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdOpened(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.c, com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdReady(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.f2833a, com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdRewarded(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.i, com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mu.f3048a.a(com.json.hu.f2727a.a(placement), adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdShowFailed(com.json.mediationsdk.logger.IronSourceError error, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu iuVar = com.json.iu.this;
            com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO;
            com.json.mu muVar = com.json.mu.f3048a;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = error != null ? error.getErrorMessage() : null;
            objArr[1] = adInfo;
            iuVar.a(com.json.ju.e, ad_unit, muVar.a(objArr));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdUnavailable() {
            com.json.iu.this.a(com.json.ju.n, com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO, com.json.mu.f3048a.a(new java.lang.Object[0]));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, d2 = {"com/ironsource/iu$c", "Lcom/ironsource/mediationsdk/sdk/LevelPlayBannerListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "", com.json.ju.j, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", com.json.ju.b, com.json.ju.f, com.json.ju.k, com.json.ju.l, com.json.ju.m, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements com.json.mediationsdk.sdk.LevelPlayBannerListener {
        c() {
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdClicked(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.f, com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLeftApplication(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.k, com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoadFailed(com.json.mediationsdk.logger.IronSourceError error) {
            com.json.iu iuVar = com.json.iu.this;
            com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER;
            com.json.mu muVar = com.json.mu.f3048a;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = error != null ? error.getErrorMessage() : null;
            iuVar.a(com.json.ju.b, ad_unit, muVar.a(objArr));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoaded(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.j, com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenDismissed(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.m, com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, com.json.mu.f3048a.a(adInfo));
        }

        @Override // com.json.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenPresented(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
            com.json.iu.this.a(com.json.ju.l, com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER, com.json.mu.f3048a.a(adInfo));
        }
    }

    public iu(com.json.zt javaScriptEvaluator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.mJavaScriptEvaluator = javaScriptEvaluator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(java.lang.String callbackName, com.ironsource.mediationsdk.IronSource.AD_UNIT adUnit, java.util.List<? extends java.lang.Object> args) {
        this.mJavaScriptEvaluator.a(callbackName, adUnit, args);
    }

    private final void b() {
        com.json.hu huVar = com.json.hu.f2727a;
        huVar.a((com.json.mediationsdk.sdk.LevelPlayInterstitialListener) null);
        huVar.a((com.json.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener) null);
        huVar.a((com.json.mediationsdk.sdk.LevelPlayBannerListener) null);
    }

    private final void c() {
        com.json.hu.f2727a.i();
    }

    public final void a() {
        b();
        c();
    }

    public final void d() {
        com.json.hu huVar = com.json.hu.f2727a;
        huVar.a(new com.ironsource.iu.a());
        huVar.a(new com.ironsource.iu.b());
        huVar.a(new com.ironsource.iu.c());
    }
}
