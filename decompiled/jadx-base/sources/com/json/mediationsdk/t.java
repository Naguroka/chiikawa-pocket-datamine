package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B#\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0014¨\u0006\""}, d2 = {"Lcom/ironsource/mediationsdk/t;", "Lcom/ironsource/mediationsdk/a;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/NativeAdListener;", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdSmashListener;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lorg/json/JSONObject;", "config", "adUnitData", "Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdData;", "adData", "", "onNativeAdInitSuccess", "onNativeAdInitFailed", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "nativeAdViewBinder", "onNativeAdLoaded", "onNativeAdLoadFailed", "onNativeAdShown", "onNativeAdClicked", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "b", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "adapter", "Lcom/ironsource/mediationsdk/model/NetworkSettings;", com.json.pr.b, "Ljava/util/UUID;", "adUnitObjectId", "<init>", "(Lcom/ironsource/mediationsdk/AbstractAdapter;Lcom/ironsource/mediationsdk/model/NetworkSettings;Ljava/util/UUID;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class t extends com.json.mediationsdk.a<com.json.mediationsdk.adunit.adapter.listener.NativeAdListener> implements com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.json.mediationsdk.AbstractAdapter abstractAdapter, com.json.mediationsdk.model.NetworkSettings networkSettings, java.util.UUID adUnitObjectId) {
        super(abstractAdapter, networkSettings, com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD, adUnitObjectId);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitObjectId, "adUnitObjectId");
    }

    private final boolean a(com.json.mediationsdk.logger.IronSourceError error) {
        return error != null && error.getErrorCode() == 706;
    }

    @Override // com.json.mediationsdk.a
    protected void a(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.f2932a.destroyNativeAd(config);
    }

    @Override // com.json.mediationsdk.a
    protected void a(org.json.JSONObject config, org.json.JSONObject adUnitData, com.json.mediationsdk.adunit.adapter.utility.AdData adData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "adData");
        java.lang.Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f2932a.loadNativeAdForBidding(config, adUnitData, adData.getServerData(), this);
        } else {
            this.f2932a.loadNativeAd(config, adUnitData, this);
        }
    }

    @Override // com.json.mediationsdk.a
    protected com.ironsource.mediationsdk.IronSource.AD_UNIT b() {
        return com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdClicked() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        com.json.mediationsdk.adunit.adapter.listener.NativeAdListener nativeAdListener = (com.json.mediationsdk.adunit.adapter.listener.NativeAdListener) this.b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdClicked();
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitFailed(com.json.mediationsdk.logger.IronSourceError error) {
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitSuccess() {
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoadFailed(com.json.mediationsdk.logger.IronSourceError error) {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a("error = " + error));
        int errorCode = error != null ? error.getErrorCode() : 1000;
        java.lang.String errorMessage = error != null ? error.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        }
        if (this.b.get() != null) {
            com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType adapterErrorType = a(error) ? com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : com.json.mediationsdk.adunit.adapter.utility.AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            com.json.mediationsdk.adunit.adapter.listener.NativeAdListener nativeAdListener = (com.json.mediationsdk.adunit.adapter.listener.NativeAdListener) this.b.get();
            if (nativeAdListener != null) {
                nativeAdListener.onAdLoadFailed(adapterErrorType, errorCode, errorMessage);
            }
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoaded(com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        com.json.mediationsdk.adunit.adapter.listener.NativeAdListener nativeAdListener = (com.json.mediationsdk.adunit.adapter.listener.NativeAdListener) this.b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadSuccess(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdShown() {
        com.json.mediationsdk.logger.IronLog.ADAPTER_CALLBACK.verbose(a());
        com.json.mediationsdk.adunit.adapter.listener.NativeAdListener nativeAdListener = (com.json.mediationsdk.adunit.adapter.listener.NativeAdListener) this.b.get();
        if (nativeAdListener != null) {
            nativeAdListener.onAdOpened();
        }
    }
}
