package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0016"}, d2 = {"Lcom/ironsource/gb;", "Lcom/ironsource/i2;", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;", "adInfo", "", "c", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "nativeAdViewBinder", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "", "adAvailable", "g", "d", "b", "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class gb extends com.json.i2 {
    @Override // com.json.i2
    public void a() {
    }

    @Override // com.json.i2
    public void a(com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.json.i2
    public void a(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.json.i2
    public void a(com.json.mediationsdk.logger.IronSourceError error) {
    }

    @Override // com.json.i2
    public void a(com.json.mediationsdk.logger.IronSourceError error, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.json.i2
    public void a(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.json.i2
    public void a(boolean adAvailable, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.json.i2
    public void b() {
    }

    @Override // com.json.i2
    public void b(com.json.mediationsdk.model.Placement placement, com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.json.i2
    public void c(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.json.i2
    public void d(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.json.i2
    public void g(com.json.mediationsdk.adunit.adapter.utility.AdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
