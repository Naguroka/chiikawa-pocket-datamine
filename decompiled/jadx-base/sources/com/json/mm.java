package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0003\u0010\u0007R$\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b\"\u0004\b\u0003\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/mm;", "", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "b", "()Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "(Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;)V", "nativeAdViewBinder", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "()Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "(Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;)V", "nativeAdData", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class mm {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder nativeAdViewBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.json.mediationsdk.ads.nativead.AdapterNativeAdData nativeAdData;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.mediationsdk.ads.nativead.AdapterNativeAdData getNativeAdData() {
        return this.nativeAdData;
    }

    public final void a(com.json.mediationsdk.ads.nativead.AdapterNativeAdData adapterNativeAdData) {
        this.nativeAdData = adapterNativeAdData;
    }

    public final void a(com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.nativeAdViewBinder = adapterNativeAdViewBinder;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.json.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.nativeAdViewBinder;
    }
}
