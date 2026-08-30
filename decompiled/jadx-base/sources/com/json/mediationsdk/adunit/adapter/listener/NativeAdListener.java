package com.json.mediationsdk.adunit.adapter.listener;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/adunit/adapter/listener/NativeAdListener;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdListener;", "onAdLoadSuccess", "", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "nativeAdViewBinder", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NativeAdListener extends com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener {
    void onAdLoadSuccess(com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData, com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder);
}
