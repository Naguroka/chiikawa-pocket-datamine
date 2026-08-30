package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/vm;", "Lcom/ironsource/i2;", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "nativeAdViewBinder", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "d", "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "Lcom/ironsource/mediationsdk/ads/nativead/internal/InternalNativeAdListener;", "Lcom/ironsource/mediationsdk/ads/nativead/internal/InternalNativeAdListener;", "mNativeAdListener", "<init>", "(Lcom/ironsource/mediationsdk/ads/nativead/internal/InternalNativeAdListener;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class vm extends com.json.i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.mediationsdk.ads.nativead.internal.InternalNativeAdListener mNativeAdListener;

    public vm(com.json.mediationsdk.ads.nativead.internal.InternalNativeAdListener mNativeAdListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mNativeAdListener, "mNativeAdListener");
        this.mNativeAdListener = mNativeAdListener;
    }

    @Override // com.json.i2
    public void a(com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.mNativeAdListener.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.json.i2
    public void a(com.json.mediationsdk.logger.IronSourceError error) {
        this.mNativeAdListener.onNativeAdLoadFailed(error);
    }

    @Override // com.json.i2
    public void a(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        this.mNativeAdListener.onNativeAdClicked(adInfo);
    }

    @Override // com.json.i2
    public void d(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        this.mNativeAdListener.onNativeAdImpression(adInfo);
    }
}
