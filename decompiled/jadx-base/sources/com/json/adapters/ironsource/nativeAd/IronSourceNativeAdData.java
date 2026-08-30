package com.json.adapters.ironsource.nativeAd;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/ironsource/adapters/ironsource/nativeAd/IronSourceNativeAdData;", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "", com.ironsource.y8.h.D0, "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", com.ironsource.y8.h.F0, "getAdvertiser", "body", "getBody", "callToAction", "getCallToAction", "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface$Image;", com.ironsource.y8.h.H0, "Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface$Image;", "getIcon", "()Lcom/ironsource/mediationsdk/ads/nativead/interfaces/NativeAdDataInterface$Image;", "Lcom/ironsource/mh;", "nativeAdData", "<init>", "(Lcom/ironsource/mh;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class IronSourceNativeAdData extends com.json.mediationsdk.ads.nativead.AdapterNativeAdData {
    private final java.lang.String advertiser;
    private final java.lang.String body;
    private final java.lang.String callToAction;
    private final com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface.Image icon;
    private final java.lang.String title;

    public IronSourceNativeAdData(com.json.mh nativeAdData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdData, "nativeAdData");
        this.title = nativeAdData.n();
        this.advertiser = nativeAdData.h();
        this.body = nativeAdData.i();
        this.callToAction = nativeAdData.j();
        this.icon = new com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface.Image(nativeAdData.k(), null);
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getBody() {
        return this.body;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface.Image getIcon() {
        return this.icon;
    }

    @Override // com.json.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getTitle() {
        return this.title;
    }
}
