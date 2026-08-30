package com.json.adapters.ironsource.nativeAd;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ironsource/adapters/ironsource/nativeAd/IronSourceNativeAdListener;", "Lcom/ironsource/oh$a;", "Lcom/ironsource/mh;", "adData", "", "onNativeAdLoadSuccess", "", "reason", "onNativeAdLoadFailed", "onNativeAdClicked", "onNativeAdShown", "Lcom/ironsource/adapters/ironsource/nativeAd/IronSourceNativeAdViewBinder;", "binder", "Lcom/ironsource/adapters/ironsource/nativeAd/IronSourceNativeAdViewBinder;", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdSmashListener;", "smashListener", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdSmashListener;", "<init>", "(Lcom/ironsource/adapters/ironsource/nativeAd/IronSourceNativeAdViewBinder;Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdSmashListener;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class IronSourceNativeAdListener implements com.ironsource.oh.a {
    private final com.json.adapters.ironsource.nativeAd.IronSourceNativeAdViewBinder binder;
    private final com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(com.json.adapters.ironsource.nativeAd.IronSourceNativeAdViewBinder binder, com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener smashListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binder, "binder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smashListener, "smashListener");
        this.binder = binder;
        this.smashListener = smashListener;
    }

    @Override // com.ironsource.oh.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.oh.a
    public void onNativeAdLoadFailed(java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        this.smashListener.onNativeAdLoadFailed(new com.json.mediationsdk.logger.IronSourceError(510, "Load failed - " + reason));
    }

    @Override // com.ironsource.oh.a
    public void onNativeAdLoadSuccess(com.json.mh adData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
        this.smashListener.onNativeAdLoaded(new com.json.adapters.ironsource.nativeAd.IronSourceNativeAdData(adData), this.binder);
    }

    @Override // com.ironsource.oh.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}
